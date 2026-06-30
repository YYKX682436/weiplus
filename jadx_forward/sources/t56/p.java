package t56;

/* loaded from: classes16.dex */
public final class p extends p56.p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Executor f497455d;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f497457f = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f497458g = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final a66.c f497456e = new a66.c();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f497459h = t56.r.a();

    public p(java.util.concurrent.Executor executor) {
        this.f497455d = executor;
    }

    @Override // p56.s
    public boolean b() {
        return this.f497456e.f83330e;
    }

    @Override // p56.s
    public void c() {
        this.f497456e.c();
        this.f497457f.clear();
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        if (this.f497456e.f83330e) {
            return a66.g.f83334a;
        }
        t56.c0 c0Var = new t56.c0(aVar, this.f497456e);
        this.f497456e.a(c0Var);
        this.f497457f.offer(c0Var);
        if (this.f497458g.getAndIncrement() == 0) {
            try {
                this.f497455d.execute(this);
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                this.f497456e.e(c0Var);
                this.f497458g.decrementAndGet();
                x56.m.a(e17);
                throw e17;
            }
        }
        return c0Var;
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (j17 <= 0) {
            return d(aVar);
        }
        if (this.f497456e.f83330e) {
            return a66.g.f83334a;
        }
        a66.e eVar = new a66.e();
        a66.e eVar2 = new a66.e();
        eVar2.a(eVar);
        this.f497456e.a(eVar2);
        a66.b bVar = new a66.b(new t56.n(this, eVar2));
        t56.c0 c0Var = new t56.c0(new t56.o(this, eVar2, aVar, bVar));
        eVar.a(c0Var);
        try {
            c0Var.f497395d.a(new t56.z(c0Var, this.f497459h.schedule(c0Var, j17, timeUnit)));
            return bVar;
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            x56.m.a(e17);
            throw e17;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.f497456e.f83330e) {
            t56.c0 c0Var = (t56.c0) this.f497457f.poll();
            if (c0Var == null) {
                return;
            }
            if (!c0Var.f497395d.f506372e) {
                if (this.f497456e.f83330e) {
                    this.f497457f.clear();
                    return;
                }
                c0Var.run();
            }
            if (this.f497458g.decrementAndGet() == 0) {
                return;
            }
        }
        this.f497457f.clear();
    }
}
