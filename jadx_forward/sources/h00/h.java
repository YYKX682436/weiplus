package h00;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h00.h f359353a = new h00.h();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f359354b = jz5.h.b(h00.g.f359352d);

    /* renamed from: c, reason: collision with root package name */
    public static boolean f359355c = true;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f359356d = jz5.h.b(h00.d.f359348d);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f359357e = new java.util.concurrent.ConcurrentHashMap();

    public static void a(h00.h hVar, int i17, android.os.Bundle bundle, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            bundle = null;
        }
        hVar.getClass();
        if (((java.lang.Boolean) ((jz5.n) f359354b).mo141623x754a37bb()).booleanValue()) {
            if (i17 != 1 || !f359355c) {
                pm0.v.L("MicroMsg.EcsInitCgiHandler", true, new h00.f(i17, bundle));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsInitCgiHandler", "isFirstAppForeground true , coincides with SceneProcessBoot");
                f359355c = false;
            }
        }
    }
}
