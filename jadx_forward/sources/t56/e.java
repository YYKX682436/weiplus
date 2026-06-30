package t56;

/* loaded from: classes16.dex */
public final class e extends p56.p {

    /* renamed from: e, reason: collision with root package name */
    public final t56.c f497400e;

    /* renamed from: f, reason: collision with root package name */
    public final t56.f f497401f;

    /* renamed from: d, reason: collision with root package name */
    public final a66.c f497399d = new a66.c();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f497402g = new java.util.concurrent.atomic.AtomicBoolean();

    public e(t56.c cVar) {
        t56.f fVar;
        t56.f fVar2;
        this.f497400e = cVar;
        if (cVar.f497392d.f83330e) {
            fVar2 = t56.g.f497408h;
            this.f497401f = fVar2;
        }
        while (true) {
            if (cVar.f497391c.isEmpty()) {
                fVar = new t56.f(cVar.f497389a);
                cVar.f497392d.a(fVar);
                break;
            } else {
                fVar = (t56.f) cVar.f497391c.poll();
                if (fVar != null) {
                    break;
                }
            }
        }
        fVar2 = fVar;
        this.f497401f = fVar2;
    }

    @Override // p56.s
    public boolean b() {
        return this.f497399d.f83330e;
    }

    @Override // p56.s
    public void c() {
        if (this.f497402g.compareAndSet(false, true)) {
            t56.c cVar = this.f497400e;
            cVar.getClass();
            long nanoTime = java.lang.System.nanoTime() + cVar.f497390b;
            t56.f fVar = this.f497401f;
            fVar.f497405o = nanoTime;
            cVar.f497391c.offer(fVar);
        }
        this.f497399d.c();
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        return e(aVar, 0L, null);
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (this.f497399d.f83330e) {
            return a66.g.f83334a;
        }
        t56.c0 h17 = this.f497401f.h(new t56.d(this, aVar), j17, timeUnit);
        this.f497399d.a(h17);
        h17.f497395d.a(new t56.b0(h17, this.f497399d));
        return h17;
    }
}
