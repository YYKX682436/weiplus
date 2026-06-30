package t56;

/* loaded from: classes16.dex */
public final class j extends p56.p {

    /* renamed from: d, reason: collision with root package name */
    public final u56.o f497422d;

    /* renamed from: e, reason: collision with root package name */
    public final a66.c f497423e;

    /* renamed from: f, reason: collision with root package name */
    public final u56.o f497424f;

    /* renamed from: g, reason: collision with root package name */
    public final t56.l f497425g;

    public j(t56.l lVar) {
        u56.o oVar = new u56.o();
        this.f497422d = oVar;
        a66.c cVar = new a66.c();
        this.f497423e = cVar;
        this.f497424f = new u56.o(oVar, cVar);
        this.f497425g = lVar;
    }

    @Override // p56.s
    public boolean b() {
        return this.f497424f.f506372e;
    }

    @Override // p56.s
    public void c() {
        this.f497424f.c();
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        if (this.f497424f.f506372e) {
            return a66.g.f83334a;
        }
        t56.l lVar = this.f497425g;
        t56.h hVar = new t56.h(this, aVar);
        u56.o oVar = this.f497422d;
        lVar.getClass();
        t56.c0 c0Var = new t56.c0(x56.m.c(hVar), oVar);
        oVar.a(c0Var);
        c0Var.f497395d.a(new t56.z(c0Var, lVar.f497482d.submit(c0Var)));
        return c0Var;
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (this.f497424f.f506372e) {
            return a66.g.f83334a;
        }
        t56.l lVar = this.f497425g;
        t56.i iVar = new t56.i(this, aVar);
        a66.c cVar = this.f497423e;
        lVar.getClass();
        t56.c0 c0Var = new t56.c0(x56.m.c(iVar), cVar);
        cVar.a(c0Var);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = lVar.f497482d;
        c0Var.f497395d.a(new t56.z(c0Var, j17 <= 0 ? scheduledExecutorService.submit(c0Var) : scheduledExecutorService.schedule(c0Var, j17, timeUnit)));
        return c0Var;
    }
}
