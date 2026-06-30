package up;

/* loaded from: classes12.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final up.a f511288d = new up.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CsoStartup", "try preloading");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274656s) {
            jz5.g gVar = up.g.f511293a;
            jz5.g gVar2 = up.g.f511293a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar2).mo141623x754a37bb()).t("preloaded"), up.g.f511294b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CsoStartup", "skip preload because token \"" + up.g.f511294b + "\" is not updated");
            } else {
                try {
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar2).mo141623x754a37bb()).D("preloaded", up.g.f511294b);
                    long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                    sc.e eVar = sc.e.f487156d;
                    if (com.p314xaae8f345.cso.C2941xefde02d2.f127468b) {
                        eVar.mo152xb9724478();
                    } else {
                        synchronized (com.p314xaae8f345.cso.C2941xefde02d2.f127469c) {
                            if (com.p314xaae8f345.cso.C2941xefde02d2.f127468b) {
                                eVar.mo152xb9724478();
                            } else {
                                com.p314xaae8f345.cso.C2941xefde02d2.f127472f = eVar;
                            }
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CsoStartup", "preload all cost " + (android.os.SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis) + " ms");
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CsoStartup", th6, "Preload all failed.", new java.lang.Object[0]);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CsoStartup", "skip preload because cso is not enabled");
        }
        return jz5.f0.f384359a;
    }
}
