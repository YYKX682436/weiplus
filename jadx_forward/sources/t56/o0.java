package t56;

/* loaded from: classes16.dex */
public final class o0 extends p56.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f497451d = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.PriorityBlockingQueue f497452e = new java.util.concurrent.PriorityBlockingQueue();

    /* renamed from: f, reason: collision with root package name */
    public final a66.b f497453f = new a66.b();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f497454g = new java.util.concurrent.atomic.AtomicInteger();

    @Override // p56.s
    public boolean b() {
        return this.f497453f.b();
    }

    @Override // p56.s
    public void c() {
        this.f497453f.c();
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        return f(aVar, java.lang.System.currentTimeMillis());
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() + timeUnit.toMillis(j17);
        return f(new t56.m0(aVar, this, currentTimeMillis), currentTimeMillis);
    }

    public final p56.s f(r56.a aVar, long j17) {
        boolean b17 = this.f497453f.b();
        a66.f fVar = a66.g.f83334a;
        if (b17) {
            return fVar;
        }
        t56.p0 p0Var = new t56.p0(aVar, java.lang.Long.valueOf(j17), this.f497451d.incrementAndGet());
        java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue = this.f497452e;
        priorityBlockingQueue.add(p0Var);
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f497454g;
        if (atomicInteger.getAndIncrement() != 0) {
            return new a66.b(new t56.n0(this, p0Var));
        }
        do {
            t56.p0 p0Var2 = (t56.p0) priorityBlockingQueue.poll();
            if (p0Var2 != null) {
                p0Var2.f497460d.mo740x2e7a5e();
            }
        } while (atomicInteger.decrementAndGet() > 0);
        return fVar;
    }
}
