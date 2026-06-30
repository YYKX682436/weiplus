package rk0;

/* loaded from: classes7.dex */
public abstract class a {
    public static boolean a(java.lang.Class cls, java.lang.Class cls2) {
        if (cls != null && cls2 != null) {
            if (cls.isAnnotationPresent(cls2)) {
                return true;
            }
            for (java.lang.Class<?> cls3 : cls.getInterfaces()) {
                if (cls3.isAnnotationPresent(cls2)) {
                    return true;
                }
            }
            if (cls.getSuperclass() != null) {
                return a(cls.getSuperclass(), cls2);
            }
        }
        return false;
    }
}
