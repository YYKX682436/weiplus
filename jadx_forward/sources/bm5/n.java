package bm5;

/* loaded from: classes12.dex */
public abstract class n {
    public static void a(java.lang.Object obj) {
        if (obj == null || (((obj instanceof java.util.Collection) && ((java.util.Collection) obj).isEmpty()) || ((obj.getClass().isArray() && java.lang.reflect.Array.getLength(obj) == 0) || ((obj instanceof java.lang.String) && ((java.lang.String) obj).isEmpty())))) {
            throw new java.lang.AssertionError("Condition violated: value is not empty");
        }
    }
}
