package wo4;

/* loaded from: classes10.dex */
public final class y implements ot3.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.m1 f529827a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l1 f529828b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h f529829c;

    /* renamed from: d, reason: collision with root package name */
    public gs0.b f529830d;

    /* renamed from: e, reason: collision with root package name */
    public wo4.l f529831e;

    /* renamed from: f, reason: collision with root package name */
    public final es0.d f529832f;

    /* renamed from: g, reason: collision with root package name */
    public int f529833g;

    /* renamed from: h, reason: collision with root package name */
    public hs0.a f529834h;

    /* renamed from: i, reason: collision with root package name */
    public ds0.d0 f529835i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f529836j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f529837k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f529838l;

    /* renamed from: m, reason: collision with root package name */
    public float f529839m;

    /* renamed from: n, reason: collision with root package name */
    public float f529840n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.HandlerThread f529841o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.HandlerThread f529842p;

    /* renamed from: q, reason: collision with root package name */
    public long f529843q;

    /* renamed from: r, reason: collision with root package name */
    public final ls0.b1 f529844r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.r f529845s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f529846t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f529847u;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.m1 scriptModel, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l1 remuxModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scriptModel, "scriptModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remuxModel, "remuxModel");
        this.f529827a = scriptModel;
        this.f529828b = remuxModel;
        this.f529829c = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h.f243946b.a(false);
        es0.d dVar = new es0.d(false, 1, null);
        this.f529832f = dVar;
        this.f529839m = 1.0f;
        this.f529840n = 1.0f;
        dw3.c0 c0Var = dw3.c0.f325715a;
        java.lang.String videoPath = remuxModel.f257191c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        java.lang.String m17 = ai3.d.m(videoPath);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "getThumbName(...)");
        this.f529847u = m17;
        dVar.f337847d = remuxModel.f257194f;
        dVar.f337848e = remuxModel.f257196h;
        dVar.f337846c = remuxModel.f257193e;
        dVar.f337845b = remuxModel.f257192d;
        this.f529844r = new ls0.b1(0L, ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0) kz5.n0.i0(scriptModel.f257207b)).f257242b, remuxModel.f257194f, false, false, null, 48, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "encodeConfig: " + dVar + ' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "remuxModel: " + remuxModel + ' ');
    }

    @Override // ot3.g
    public void a(yz5.r rVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "start");
        this.f529845s = rVar;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f529843q = android.os.SystemClock.elapsedRealtime();
        android.os.HandlerThread handlerThread = this.f529842p;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f529842p = pm0.v.m("VLogRemuxer_remuxVideo", false, new wo4.w(this));
        android.os.HandlerThread handlerThread2 = this.f529841o;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        this.f529841o = pm0.v.m("VLogRemuxer_remuxMusic", false, new wo4.x(this));
    }

    public final void b() {
        wo4.l lVar = this.f529831e;
        if (lVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDecoder", "release");
            vo4.i iVar = lVar.f529808d;
            iVar.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VLogDirector", "VLogRelease into VLogDirector#release 1", new java.lang.Object[0]);
            vo4.t tVar = iVar.f520169g;
            if (tVar != null) {
                tVar.b(new vo4.d(iVar));
            }
            vo4.t tVar2 = iVar.f520169g;
            if (tVar2 != null) {
                vo4.p pVar = (vo4.p) tVar2;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[OpenGL] VLogRelease release egl environment, surface: ");
                sb6.append(pVar.f520223d);
                sb6.append(", eglEnv: ");
                rs0.h hVar = pVar.f520198e;
                sb6.append(hVar != null ? hVar.f480827c : null);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VLog.VLogRemuxSurface", sb6.toString(), new java.lang.Object[0]);
                pVar.b(new vo4.n(pVar));
            }
            vo4.k kVar = vo4.k.f520182a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogMaterialsInfoCache", "clearCache");
            vo4.k.f520183b.clear();
            zv3.g gVar = lVar.f529812h;
            if (gVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameRetriever");
                throw null;
            }
            gVar.c();
        }
        gs0.b bVar = this.f529830d;
        if (bVar != null) {
            bVar.f();
        }
        android.os.HandlerThread handlerThread = this.f529842p;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        android.os.HandlerThread handlerThread2 = this.f529841o;
        if (handlerThread2 != null) {
            handlerThread2.quitSafely();
        }
    }

    public final void c() {
        if (this.f529837k && this.f529838l) {
            ls0.b1 b1Var = this.f529844r;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l1 l1Var = this.f529828b;
            int a17 = b1Var.a(null, l1Var.f257191c, l1Var.f257198j, l1Var.f257199k, false);
            boolean z17 = a17 >= 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mux finish, cost:");
            long j17 = this.f529843q;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
            sb6.append(",succ:");
            sb6.append(z17);
            sb6.append("  result:");
            sb6.append(a17);
            sb6.append(", path:");
            sb6.append(this.f529828b);
            sb6.append(".outputPath");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "release");
            b();
            this.f529844r.b();
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69219x922a682f(this.f529828b.f257191c);
                dw3.c0.f325715a.C(this.f529828b.f257191c, this.f529847u, -1);
            }
            yz5.r rVar = this.f529845s;
            if (rVar != null) {
                rVar.C(this.f529828b.f257191c, this.f529847u, java.lang.Boolean.valueOf(z17), -1);
            }
        }
    }
}
