package k91;

/* loaded from: classes4.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public static final k91.g3 f387125a = new k91.g3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f387126b = jz5.h.b(k91.f3.f387114d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f387127c = "%s_private_infos";

    public final int a(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f387126b).mo141623x754a37bb();
        java.lang.String format = java.lang.String.format(f387127c, java.util.Arrays.copyOf(new java.lang.Object[]{appId}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        int o17 = o4Var.o(format, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.RequirePrivateInfoLogic", "getExtFlag %s, %d", appId, java.lang.Integer.valueOf(o17));
        return o17;
    }
}
