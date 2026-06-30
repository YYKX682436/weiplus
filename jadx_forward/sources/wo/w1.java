package wo;

/* loaded from: classes7.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f529397a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Method f529398b;

    static {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("get", java.lang.String.class);
            f529397a = declaredMethod;
            java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod("getInt", java.lang.String.class, java.lang.Integer.TYPE);
            f529398b = declaredMethod2;
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SystemProperties", e17, "", new java.lang.Object[0]);
        }
    }

    public static java.lang.String a(java.lang.String str) {
        try {
            return (java.lang.String) f529397a.invoke(null, str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SystemProperties", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static int b(java.lang.String str, int i17) {
        try {
            return ((java.lang.Integer) f529398b.invoke(null, str, java.lang.Integer.valueOf(i17))).intValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SystemProperties", e17, "", new java.lang.Object[0]);
            return i17;
        }
    }
}
