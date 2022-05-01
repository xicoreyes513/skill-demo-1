import static org.junit.Assert.*;
import org.junit.*;
 
public class demoFileTester {
 
   @Test
   public void testAdd(){
       assertEquals("1 + 2 should be 3", 3, demoFile.addxy(1, 2));
   }
  
}
