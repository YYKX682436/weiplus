package b03;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final pi0.q f16838a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16839b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16840c;

    /* renamed from: d, reason: collision with root package name */
    public final b03.a0 f16841d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f16842e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16843f;

    /* renamed from: g, reason: collision with root package name */
    public wu5.c f16844g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f16845h;

    /* renamed from: i, reason: collision with root package name */
    public wu5.c f16846i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f16847j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16848k;

    public l(pi0.q engineGroup, long j17, boolean z17, b03.a0 a0Var) {
        kotlin.jvm.internal.o.g(engineGroup, "engineGroup");
        this.f16838a = engineGroup;
        this.f16839b = j17;
        this.f16840c = z17;
        this.f16841d = a0Var;
        this.f16842e = "MicroMsg.AutoReleaseEngineGroupHelper";
        this.f16845h = new java.lang.Object();
        b03.b0 b0Var = b03.b0.f16825d;
        this.f16847j = new b03.h(this);
        b03.b bVar = new b03.b(this);
        b03.e eVar = new b03.e(this);
        kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);
        engineGroup.f354713q = new b03.a(this);
        a(j17, b0Var);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_flutter_release_liteapp_ref_when_deep_background, true);
        this.f16843f = fj6;
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoReleaseEngineGroupHelper", "init interval:" + j17 + ", recreate:" + j17 + ", releaseLiteAppRef:" + fj6);
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(bVar);
        com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.addLifecycleCallback(eVar);
        b();
    }

    public final void a(long j17, b03.b0 releaseType) {
        int size;
        kotlin.jvm.internal.o.g(releaseType, "releaseType");
        if (j17 < 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f16842e, "checkRelease, isDeepBackground:" + this.f16848k);
        wu5.c cVar = this.f16846i;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f16846i = null;
        pi0.q qVar = this.f16838a;
        synchronized (qVar.f354709m) {
            size = qVar.f354710n.size();
        }
        if (size == 0) {
            com.tencent.mars.xlog.Log.i(this.f16842e, "checkRelease: post release " + j17 + ", releaseType:" + releaseType);
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable = this.f16847j;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            java.util.Objects.requireNonNull(runnable);
            this.f16846i = t0Var.w(runnable, j17, "IFlutterEngineService.serial");
        }
    }

    public final void b() {
        if (this.f16841d == null) {
            return;
        }
        synchronized (this.f16845h) {
            if (this.f16844g != null) {
                return;
            }
            this.f16844g = ((ku5.t0) ku5.t0.f312615d).d(new b03.k(this), 60000L, 60000L);
        }
    }
}
