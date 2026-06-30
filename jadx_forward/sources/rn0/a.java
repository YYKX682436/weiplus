package rn0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final rn0.a f479142a = new rn0.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f479143b;

    public final synchronized boolean a() {
        if (f479143b == null) {
            java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("android_live_rci", "");
            java.lang.String aj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_android_live_rci", "");
            f479143b = java.lang.Boolean.FALSE;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aj6, "1") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aj7, "1")) {
                f479143b = java.lang.Boolean.TRUE;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RciExpt", "liveUseRci=" + f479143b);
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f479143b, java.lang.Boolean.TRUE);
    }
}
