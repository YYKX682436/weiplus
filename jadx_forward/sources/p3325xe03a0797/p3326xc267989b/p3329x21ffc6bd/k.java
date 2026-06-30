package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public final class k extends p3325xe03a0797.p3326xc267989b.p0 implements java.lang.Runnable, p3325xe03a0797.p3326xc267989b.i1 {

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f392035e;

    /* renamed from: f, reason: collision with root package name */
    public final int f392036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.i1 f392037g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.v f392038h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f392039i;

    /* renamed from: runningWorkers */
    private volatile int f72716x508079f6;

    /* JADX WARN: Multi-variable type inference failed */
    public k(p3325xe03a0797.p3326xc267989b.p0 p0Var, int i17) {
        this.f392035e = p0Var;
        this.f392036f = i17;
        p3325xe03a0797.p3326xc267989b.i1 i1Var = p0Var instanceof p3325xe03a0797.p3326xc267989b.i1 ? (p3325xe03a0797.p3326xc267989b.i1) p0Var : null;
        this.f392037g = i1Var == null ? p3325xe03a0797.p3326xc267989b.e1.f391706a : i1Var;
        this.f392038h = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.v(false);
        this.f392039i = new java.lang.Object();
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        this.f392038h.a(runnable);
        boolean z17 = true;
        if (this.f72716x508079f6 >= this.f392036f) {
            return;
        }
        synchronized (this.f392039i) {
            if (this.f72716x508079f6 >= this.f392036f) {
                z17 = false;
            } else {
                this.f72716x508079f6++;
            }
        }
        if (z17) {
            this.f392035e.D(this, this);
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void F(oz5.l lVar, java.lang.Runnable runnable) {
        this.f392038h.a(runnable);
        boolean z17 = true;
        if (this.f72716x508079f6 >= this.f392036f) {
            return;
        }
        synchronized (this.f392039i) {
            if (this.f72716x508079f6 >= this.f392036f) {
                z17 = false;
            } else {
                this.f72716x508079f6++;
            }
        }
        if (z17) {
            this.f392035e.F(this, this);
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public p3325xe03a0797.p3326xc267989b.p0 J(int i17) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l.a(i17);
        return i17 >= this.f392036f ? this : super.J(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        r1 = r4.f392039i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r4.f72716x508079f6--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r4.f392038h.c() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        r4.f72716x508079f6++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.internal.v r2 = r4.f392038h
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            oz5.m r3 = oz5.m.f431862d
            p3325xe03a0797.p3326xc267989b.u0.a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.p0 r2 = r4.f392035e
            boolean r2 = r2.I(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.p0 r0 = r4.f392035e
            r0.D(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f392039i
            monitor-enter(r1)
            int r2 = r4.f72716x508079f6     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + (-1)
            r4.f72716x508079f6 = r2     // Catch: java.lang.Throwable -> L45
            kotlinx.coroutines.internal.v r2 = r4.f392038h     // Catch: java.lang.Throwable -> L45
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.f72716x508079f6     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + 1
            r4.f72716x508079f6 = r2     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)
            goto L1
        L45:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.k.run():void");
    }

    @Override // p3325xe03a0797.p3326xc267989b.i1
    public p3325xe03a0797.p3326xc267989b.s1 v(long j17, java.lang.Runnable runnable, oz5.l lVar) {
        return this.f392037g.v(j17, runnable, lVar);
    }

    @Override // p3325xe03a0797.p3326xc267989b.i1
    public void w(long j17, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f392037g.w(j17, qVar);
    }
}
