package xg4;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static xg4.p f535980b;

    /* renamed from: e, reason: collision with root package name */
    public static final yz5.a f535983e;

    /* renamed from: a, reason: collision with root package name */
    public static final xg4.m f535979a = new xg4.m();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f535981c = jz5.h.b(xg4.i.f535976d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f535982d = jz5.h.b(xg4.j.f535977d);

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        f535983e = xg4.g.f535974d;
    }

    public final synchronized void a(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanup");
        if (f535980b != null && c()) {
            jz5.g gVar = f535981c;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar).mo141623x754a37bb();
            yz5.a aVar = f535983e;
            n3Var.mo50300x3fa464aa(new xg4.l(aVar));
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar).mo141623x754a37bb()).mo77786xdceccb8e(new xg4.l(aVar), j17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanup not registered or not open");
    }

    public final synchronized void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "destroy");
        xg4.p pVar = f535980b;
        if (pVar != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = pVar.f364534p;
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((hq0.e0) ((java.util.Map.Entry) it.next()).getValue()).c();
            }
            concurrentHashMap.clear();
        }
        a(0L);
    }

    public final boolean c() {
        return ((java.lang.Boolean) ((jz5.n) f535982d).mo141623x754a37bb()).booleanValue();
    }
}
