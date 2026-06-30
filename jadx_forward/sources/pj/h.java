package pj;

/* loaded from: classes8.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f436442a;

    static {
        try {
            java.lang.Class.forName("com.oplus.util.OplusHoraeThermalHelper").getDeclaredMethod("getInstance", new java.lang.Class[0]);
            f436442a = true;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            f436442a = false;
        }
    }

    public static float a() {
        if (!f436442a) {
            return -1.0f;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.oplus.util.OplusHoraeThermalHelper");
            return ((java.lang.Float) cls.getDeclaredMethod("getCurrentThermal", new java.lang.Class[0]).invoke(cls.getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]), new java.lang.Object[0])).floatValue();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("", "getCurrentThermal failed: " + th6.getMessage());
            return -1.0f;
        }
    }
}
