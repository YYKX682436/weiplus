package s56;

/* loaded from: classes16.dex */
public final class u extends p56.r implements r56.a {

    /* renamed from: h, reason: collision with root package name */
    public final p56.r f484774h;

    /* renamed from: i, reason: collision with root package name */
    public final p56.p f484775i;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f484777n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Queue f484778o;

    /* renamed from: p, reason: collision with root package name */
    public final int f484779p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f484780q;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Throwable f484783t;

    /* renamed from: u, reason: collision with root package name */
    public long f484784u;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f484781r = new java.util.concurrent.atomic.AtomicLong();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f484782s = new java.util.concurrent.atomic.AtomicLong();

    /* renamed from: m, reason: collision with root package name */
    public final s56.j f484776m = s56.j.f484748a;

    public u(p56.q qVar, p56.r rVar, boolean z17, int i17) {
        this.f484774h = rVar;
        this.f484775i = qVar.mo157871x6217339a();
        this.f484777n = z17;
        i17 = i17 <= 0 ? u56.l.f506366e : i17;
        this.f484779p = i17 - (i17 >> 2);
        if (rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.m163335x5c51bd39()) {
            this.f484778o = new rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30133xcb41c3a5(i17);
        } else {
            this.f484778o = new v56.c(i17);
        }
        f(i17);
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        if (this.f433636d.f506372e || this.f484780q) {
            return;
        }
        java.util.Queue queue = this.f484778o;
        this.f484776m.getClass();
        if (obj == null) {
            obj = s56.j.f484750c;
        }
        if (queue.offer(obj)) {
            i();
        } else {
            mo157869xaf8aa769(new q56.g());
        }
    }

    @Override // r56.a
    /* renamed from: call */
    public void mo740x2e7a5e() {
        long j17;
        long j18;
        long j19 = this.f484784u;
        java.util.Queue queue = this.f484778o;
        p56.r rVar = this.f484774h;
        s56.j jVar = this.f484776m;
        long j27 = 1;
        do {
            long j28 = this.f484781r.get();
            while (j28 != j19) {
                boolean z17 = this.f484780q;
                java.lang.Object poll = queue.poll();
                boolean z18 = poll == null;
                if (h(z17, z18, rVar, queue)) {
                    return;
                }
                if (z18) {
                    break;
                }
                jVar.getClass();
                if (poll == s56.j.f484750c) {
                    poll = null;
                }
                rVar.a(poll);
                j19++;
                if (j19 == this.f484779p) {
                    java.util.concurrent.atomic.AtomicLong atomicLong = this.f484781r;
                    do {
                        j17 = atomicLong.get();
                        j18 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
                        if (j17 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                            break;
                        }
                        j18 = j17 - j19;
                        if (j18 < 0) {
                            throw new java.lang.IllegalStateException("More produced than requested: " + j18);
                        }
                    } while (!atomicLong.compareAndSet(j17, j18));
                    f(j19);
                    j28 = j18;
                    j19 = 0;
                }
            }
            if (j28 == j19 && h(this.f484780q, queue.isEmpty(), rVar, queue)) {
                return;
            }
            this.f484784u = j19;
            j27 = this.f484782s.addAndGet(-j27);
        } while (j27 != 0);
    }

    public boolean h(boolean z17, boolean z18, p56.r rVar, java.util.Queue queue) {
        if (rVar.f433636d.f506372e) {
            queue.clear();
            return true;
        }
        if (!z17) {
            return false;
        }
        if (this.f484777n) {
            if (!z18) {
                return false;
            }
            java.lang.Throwable th6 = this.f484783t;
            try {
                if (th6 != null) {
                    rVar.mo157869xaf8aa769(th6);
                } else {
                    rVar.mo157868xaa8b332c();
                }
                return false;
            } finally {
            }
        }
        java.lang.Throwable th7 = this.f484783t;
        if (th7 != null) {
            queue.clear();
            try {
                rVar.mo157869xaf8aa769(th7);
                return true;
            } finally {
            }
        }
        if (!z18) {
            return false;
        }
        try {
            rVar.mo157868xaa8b332c();
            return true;
        } finally {
        }
    }

    public void i() {
        if (this.f484782s.getAndIncrement() == 0) {
            this.f484775i.d(this);
        }
    }

    @Override // p56.m
    /* renamed from: onCompleted */
    public void mo157868xaa8b332c() {
        if (this.f433636d.f506372e || this.f484780q) {
            return;
        }
        this.f484780q = true;
        i();
    }

    @Override // p56.m
    /* renamed from: onError */
    public void mo157869xaf8aa769(java.lang.Throwable th6) {
        if (this.f433636d.f506372e || this.f484780q) {
            x56.m.a(th6);
            return;
        }
        this.f484783t = th6;
        this.f484780q = true;
        i();
    }
}
