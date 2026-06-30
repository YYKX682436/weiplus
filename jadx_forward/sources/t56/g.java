package t56;

/* loaded from: classes16.dex */
public final class g extends p56.q implements t56.d0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.TimeUnit f497407g = java.util.concurrent.TimeUnit.SECONDS;

    /* renamed from: h, reason: collision with root package name */
    public static final t56.f f497408h;

    /* renamed from: i, reason: collision with root package name */
    public static final t56.c f497409i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ThreadFactory f497410e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f497411f = new java.util.concurrent.atomic.AtomicReference(f497409i);

    static {
        t56.f fVar = new t56.f(u56.n.f506369e);
        f497408h = fVar;
        fVar.c();
        t56.c cVar = new t56.c(null, 0L, null);
        f497409i = cVar;
        cVar.a();
    }

    public g(java.util.concurrent.ThreadFactory threadFactory) {
        this.f497410e = threadFactory;
        mo165921x68ac462();
    }

    @Override // p56.q
    /* renamed from: createWorker */
    public p56.p mo157871x6217339a() {
        return new t56.e((t56.c) this.f497411f.get());
    }

    @Override // t56.d0
    /* renamed from: shutdown */
    public void mo165920xf5e80656() {
        t56.c cVar;
        boolean z17;
        do {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f497411f;
            cVar = (t56.c) atomicReference.get();
            t56.c cVar2 = f497409i;
            if (cVar == cVar2) {
                return;
            }
            while (true) {
                if (atomicReference.compareAndSet(cVar, cVar2)) {
                    z17 = true;
                    break;
                } else if (atomicReference.get() != cVar) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
        cVar.a();
    }

    @Override // t56.d0
    /* renamed from: start */
    public void mo165921x68ac462() {
        boolean z17;
        t56.c cVar = new t56.c(this.f497410e, 60L, f497407g);
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f497411f;
            t56.c cVar2 = f497409i;
            if (atomicReference.compareAndSet(cVar2, cVar)) {
                z17 = true;
                break;
            } else if (atomicReference.get() != cVar2) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            return;
        }
        cVar.a();
    }
}
