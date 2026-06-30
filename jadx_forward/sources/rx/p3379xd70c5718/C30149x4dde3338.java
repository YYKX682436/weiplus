package rx.p3379xd70c5718;

/* renamed from: rx.schedulers.Schedulers */
/* loaded from: classes16.dex */
public final class C30149x4dde3338 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f482424d = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final p56.q f482425a;

    /* renamed from: b, reason: collision with root package name */
    public final p56.q f482426b;

    /* renamed from: c, reason: collision with root package name */
    public final p56.q f482427c;

    public C30149x4dde3338() {
        x56.r.f533673e.e().getClass();
        this.f482425a = new t56.m(new u56.n("RxComputationScheduler-"));
        this.f482426b = new t56.g(new u56.n("RxIoScheduler-"));
        this.f482427c = new t56.w(new u56.n("RxNewThreadScheduler-"));
    }

    public static rx.p3379xd70c5718.C30149x4dde3338 a() {
        boolean z17;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = f482424d;
            rx.p3379xd70c5718.C30149x4dde3338 c30149x4dde3338 = (rx.p3379xd70c5718.C30149x4dde3338) atomicReference.get();
            if (c30149x4dde3338 != null) {
                return c30149x4dde3338;
            }
            rx.p3379xd70c5718.C30149x4dde3338 c30149x4dde33382 = new rx.p3379xd70c5718.C30149x4dde3338();
            while (true) {
                if (atomicReference.compareAndSet(null, c30149x4dde33382)) {
                    z17 = true;
                    break;
                }
                if (atomicReference.get() != null) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                return c30149x4dde33382;
            }
            c30149x4dde33382.b();
        }
    }

    /* renamed from: computation */
    public static p56.q m163346xca889c7() {
        return a().f482425a;
    }

    /* renamed from: from */
    public static p56.q m163347x3017aa(java.util.concurrent.Executor executor) {
        return new t56.q(executor);
    }

    /* renamed from: immediate */
    public static p56.q m163348x4304b7b1() {
        return t56.v.f497474e;
    }

    public static p56.q io() {
        p56.q qVar = a().f482426b;
        r56.e eVar = x56.m.f533666f;
        return eVar != null ? (p56.q) eVar.mo14559x2e7a5e(qVar) : qVar;
    }

    /* renamed from: newThread */
    public static p56.q m163349xdd89ebca() {
        return a().f482427c;
    }

    /* renamed from: reset */
    public static void m163350x6761d4f() {
        rx.p3379xd70c5718.C30149x4dde3338 c30149x4dde3338 = (rx.p3379xd70c5718.C30149x4dde3338) f482424d.getAndSet(null);
        if (c30149x4dde3338 != null) {
            c30149x4dde3338.b();
        }
    }

    /* renamed from: shutdown */
    public static void m163351xf5e80656() {
        rx.p3379xd70c5718.C30149x4dde3338 a17 = a();
        a17.b();
        synchronized (a17) {
            t56.r.f497467g.mo165920xf5e80656();
            u56.l.f506367f.mo165920xf5e80656();
            u56.l.f506368g.mo165920xf5e80656();
        }
    }

    /* renamed from: start */
    public static void m163352x68ac462() {
        rx.p3379xd70c5718.C30149x4dde3338 a17 = a();
        synchronized (a17) {
            java.lang.Object obj = a17.f482425a;
            if (obj instanceof t56.d0) {
                ((t56.d0) obj).mo165921x68ac462();
            }
            java.lang.Object obj2 = a17.f482426b;
            if (obj2 instanceof t56.d0) {
                ((t56.d0) obj2).mo165921x68ac462();
            }
            java.lang.Object obj3 = a17.f482427c;
            if (obj3 instanceof t56.d0) {
                ((t56.d0) obj3).mo165921x68ac462();
            }
        }
        synchronized (a17) {
            t56.r.f497467g.mo165921x68ac462();
            u56.l.f506367f.mo165921x68ac462();
            u56.l.f506368g.mo165921x68ac462();
        }
    }

    /* renamed from: test */
    public static rx.p3379xd70c5718.C30150x4df5d029 m163353x364492() {
        return new rx.p3379xd70c5718.C30150x4df5d029();
    }

    /* renamed from: trampoline */
    public static p56.q m163354x5f87921d() {
        return t56.q0.f497464e;
    }

    public synchronized void b() {
        java.lang.Object obj = this.f482425a;
        if (obj instanceof t56.d0) {
            ((t56.d0) obj).mo165920xf5e80656();
        }
        java.lang.Object obj2 = this.f482426b;
        if (obj2 instanceof t56.d0) {
            ((t56.d0) obj2).mo165920xf5e80656();
        }
        java.lang.Object obj3 = this.f482427c;
        if (obj3 instanceof t56.d0) {
            ((t56.d0) obj3).mo165920xf5e80656();
        }
    }
}
