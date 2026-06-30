package ak0;

/* loaded from: classes13.dex */
public abstract class c0 {
    public static java.lang.reflect.Field a(java.lang.Object obj, java.lang.String str) {
        for (java.lang.Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        throw new java.lang.NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }
}
