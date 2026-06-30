package t56;

/* loaded from: classes16.dex */
public final class m extends p56.q implements t56.d0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f497435g;

    /* renamed from: h, reason: collision with root package name */
    public static final t56.l f497436h;

    /* renamed from: i, reason: collision with root package name */
    public static final t56.k f497437i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ThreadFactory f497438e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f497439f = new java.util.concurrent.atomic.AtomicReference(f497437i);

    static {
        int intValue = java.lang.Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f497435g = intValue;
        t56.l lVar = new t56.l(u56.n.f506369e);
        f497436h = lVar;
        lVar.c();
        f497437i = new t56.k(null, 0);
    }

    public m(java.util.concurrent.ThreadFactory threadFactory) {
        this.f497438e = threadFactory;
        mo165921x68ac462();
    }

    @Override // p56.q
    /* renamed from: createWorker */
    public p56.p mo157871x6217339a() {
        t56.l lVar;
        t56.k kVar = (t56.k) this.f497439f.get();
        int i17 = kVar.f497427a;
        if (i17 == 0) {
            lVar = f497436h;
        } else {
            long j17 = kVar.f497429c;
            kVar.f497429c = 1 + j17;
            lVar = kVar.f497428b[(int) (j17 % i17)];
        }
        return new t56.j(lVar);
    }

    @Override // t56.d0
    /* renamed from: shutdown */
    public void mo165920xf5e80656() {
        t56.k kVar;
        int i17;
        boolean z17;
        do {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f497439f;
            kVar = (t56.k) atomicReference.get();
            t56.k kVar2 = f497437i;
            if (kVar == kVar2) {
                return;
            }
            while (true) {
                if (!atomicReference.compareAndSet(kVar, kVar2)) {
                    if (atomicReference.get() != kVar) {
                        z17 = false;
                        break;
                    }
                } else {
                    z17 = true;
                    break;
                }
            }
        } while (!z17);
        for (t56.l lVar : kVar.f497428b) {
            lVar.c();
        }
    }

    @Override // t56.d0
    /* renamed from: start */
    public void mo165921x68ac462() {
        int i17;
        boolean z17;
        t56.k kVar = new t56.k(this.f497438e, f497435g);
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f497439f;
            t56.k kVar2 = f497437i;
            if (!atomicReference.compareAndSet(kVar2, kVar)) {
                if (atomicReference.get() != kVar2) {
                    z17 = false;
                    break;
                }
            } else {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        for (t56.l lVar : kVar.f497428b) {
            lVar.c();
        }
    }
}
