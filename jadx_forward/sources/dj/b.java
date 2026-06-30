package dj;

/* loaded from: classes12.dex */
public class b extends qi.b {

    /* renamed from: h, reason: collision with root package name */
    public final ej.c f314347h;

    /* renamed from: i, reason: collision with root package name */
    public kj.c f314348i;

    /* renamed from: m, reason: collision with root package name */
    public kj.e0 f314349m;

    /* renamed from: n, reason: collision with root package name */
    public kj.m f314350n;

    /* renamed from: o, reason: collision with root package name */
    public kj.u f314351o;

    public b(ej.c cVar) {
        this.f314347h = cVar;
    }

    @Override // qi.b, ei.a
    public void a(boolean z17) {
        if (this.f444987f) {
            kj.m mVar = this.f314350n;
            if (mVar != null) {
                mVar.getClass();
            }
            kj.u uVar = this.f314351o;
            if (uVar != null) {
                uVar.getClass();
            }
            kj.c cVar = this.f314348i;
            if (cVar != null) {
                cVar.getClass();
            }
            kj.e0 e0Var = this.f314349m;
            if (e0Var != null) {
                e0Var.a(z17);
            }
        }
    }

    @Override // qi.b
    public java.lang.String b() {
        return "Trace";
    }

    @Override // qi.b
    public void c(android.app.Application application, qi.c cVar) {
        super.c(application, cVar);
        ej.c cVar2 = this.f314347h;
        oj.j.c("Matrix.TracePlugin", "trace plugin init, trace config: %s", cVar2.m127758x9616526c());
        this.f314351o = new kj.u(cVar2);
        this.f314350n = new kj.m(application, cVar2);
        this.f314348i = new kj.c(cVar2);
        this.f314349m = new kj.e0(cVar2);
        new com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4714x3758855(cVar2);
    }

    @Override // qi.b
    public void e() {
        super.e();
        if (!this.f444987f) {
            oj.j.f("Matrix.TracePlugin", "[start] Plugin is unSupported!", new java.lang.Object[0]);
            return;
        }
        oj.j.f("Matrix.TracePlugin", "start!", new java.lang.Object[0]);
        dj.a aVar = new dj.a(this);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            aVar.run();
        } else {
            oj.j.f("Matrix.TracePlugin", "start TracePlugin in Thread[%s] but not in mainThread!", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            oj.g.f427236c.post(aVar);
        }
    }
}
