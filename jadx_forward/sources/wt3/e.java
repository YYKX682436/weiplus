package wt3;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final im5.b f530925a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f530926b;

    /* renamed from: c, reason: collision with root package name */
    public long f530927c;

    /* renamed from: d, reason: collision with root package name */
    public long f530928d;

    /* renamed from: e, reason: collision with root package name */
    public int f530929e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f530930f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f530931g;

    /* renamed from: h, reason: collision with root package name */
    public int f530932h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f530933i;

    /* renamed from: j, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f530934j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f530935k;

    /* renamed from: l, reason: collision with root package name */
    public final wt3.d f530936l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f530937m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f530938n;

    public e(im5.b lifeCycleKeeper, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        this.f530925a = lifeCycleKeeper;
        this.f530926b = str;
        this.f530932h = 10;
        this.f530934j = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f530935k = jz5.h.b(new wt3.a(this));
        int i17 = vt3.q.f521570a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 d17 = gm0.j1.e().d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getWorkerHandler(...)");
        this.f530936l = new wt3.d(this, d17.mo50280x23b2dd47());
    }

    public void b() {
        this.f530936l.obtainMessage(0).sendToTarget();
    }

    public final void c() {
        this.f530930f = true;
        wt3.n0 g17 = g();
        if (g17.f530988e && g17.f530989f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsGetRecommendAudioTask", "destroy");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f530933i;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        }
        wt3.n0 g18 = g();
        if (g18.f530988e && g18.f530989f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFrameFeatureExtractor", "destroy");
            g18.f530984a.a();
        }
    }

    public final boolean d() {
        wt3.n0 g17 = g();
        return (g17.f530988e && g17.f530989f) && i();
    }

    public wt3.q e() {
        return new wt3.q();
    }

    public abstract wt3.n0 f(wt3.q qVar);

    public final wt3.n0 g() {
        return (wt3.n0) ((jz5.n) this.f530935k).mo141623x754a37bb();
    }

    public void h(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsGetRecommendAudioTask", "getMusicListResultCgi");
        wt3.y yVar = new wt3.y(g().f530990g, 0.0f, 0.0f, this.f530927c, this.f530928d, this.f530929e, this.f530932h, gVar, d());
        yVar.f152182i = true;
        yVar.l().f(this.f530925a).h(new wt3.c(this));
    }

    public abstract boolean i();

    public final void j(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsGetRecommendAudioTask", "onLoadData: " + this.f530938n + ' ' + this.f530930f);
        if (this.f530938n || this.f530930f) {
            return;
        }
        this.f530938n = true;
        if (d()) {
            this.f530933i = p3325xe03a0797.p3326xc267989b.l.d(this.f530934j, null, null, new wt3.b(this, z17, null), 3, null);
        } else {
            h(null, z17);
        }
    }

    public void k() {
        g().a();
    }
}
