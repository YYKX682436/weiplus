package b03;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final pi0.q f98371a;

    /* renamed from: b, reason: collision with root package name */
    public final long f98372b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f98373c;

    /* renamed from: d, reason: collision with root package name */
    public final b03.a0 f98374d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f98375e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f98376f;

    /* renamed from: g, reason: collision with root package name */
    public wu5.c f98377g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f98378h;

    /* renamed from: i, reason: collision with root package name */
    public wu5.c f98379i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f98380j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f98381k;

    public l(pi0.q engineGroup, long j17, boolean z17, b03.a0 a0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineGroup, "engineGroup");
        this.f98371a = engineGroup;
        this.f98372b = j17;
        this.f98373c = z17;
        this.f98374d = a0Var;
        this.f98375e = "MicroMsg.AutoReleaseEngineGroupHelper";
        this.f98378h = new java.lang.Object();
        b03.b0 b0Var = b03.b0.f98358d;
        this.f98380j = new b03.h(this);
        b03.b bVar = new b03.b(this);
        b03.e eVar = new b03.e(this);
        p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c);
        engineGroup.f436246q = new b03.a(this);
        a(j17, b0Var);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_flutter_release_liteapp_ref_when_deep_background, true);
        this.f98376f = fj6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoReleaseEngineGroupHelper", "init interval:" + j17 + ", recreate:" + j17 + ", releaseLiteAppRef:" + fj6);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40963x40b15f2e(bVar);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4671xf410f8ca.f19953x4fbc8495.mo40963x40b15f2e(eVar);
        b();
    }

    public final void a(long j17, b03.b0 releaseType) {
        int size;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(releaseType, "releaseType");
        if (j17 < 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f98375e, "checkRelease, isDeepBackground:" + this.f98381k);
        wu5.c cVar = this.f98379i;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f98379i = null;
        pi0.q qVar = this.f98371a;
        synchronized (qVar.f436242m) {
            size = qVar.f436243n.size();
        }
        if (size == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f98375e, "checkRelease: post release " + j17 + ", releaseType:" + releaseType);
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable = this.f98380j;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            java.util.Objects.requireNonNull(runnable);
            this.f98379i = t0Var.w(runnable, j17, "IFlutterEngineService.serial");
        }
    }

    public final void b() {
        if (this.f98374d == null) {
            return;
        }
        synchronized (this.f98378h) {
            if (this.f98377g != null) {
                return;
            }
            this.f98377g = ((ku5.t0) ku5.t0.f394148d).d(new b03.k(this), 60000L, 60000L);
        }
    }
}
