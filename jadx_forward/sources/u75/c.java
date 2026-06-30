package u75;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f506714a;

    public static final boolean a() {
        java.lang.Boolean bool;
        java.lang.Boolean bool2 = f506714a;
        if (bool2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool2);
            return bool2.booleanValue();
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.huawei.android.os.SystemPropertiesEx");
            java.lang.Object invoke = cls.getMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE).invoke(cls.newInstance(), "ro.config.hw_magic_window_enable", java.lang.Boolean.FALSE);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (java.lang.Boolean) invoke;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HuaweiKt", "hasHuaweiMagicWindowFeature: " + th6.getMessage());
            bool = java.lang.Boolean.FALSE;
        }
        f506714a = bool;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        return bool.booleanValue();
    }
}
