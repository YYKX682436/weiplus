package u26;

/* loaded from: classes14.dex */
public final class p extends u26.k implements u26.t0 {

    /* renamed from: _subHead */
    private volatile /* synthetic */ long f76832x1d2a8701;

    /* renamed from: g, reason: collision with root package name */
    public final u26.q f505717g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f505718h;

    public p(u26.q qVar) {
        super(null);
        this.f505717g = qVar;
        this.f505718h = new java.util.concurrent.locks.ReentrantLock();
        this.f76832x1d2a8701 = 0L;
    }

    @Override // u26.k
    public java.lang.Object D() {
        boolean z17;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505718h;
        reentrantLock.lock();
        try {
            java.lang.Object I = I();
            if ((I instanceof u26.e0) || I == u26.l.f505702d) {
                z17 = false;
            } else {
                this.f76832x1d2a8701++;
                z17 = true;
            }
            reentrantLock.unlock();
            u26.e0 e0Var = I instanceof u26.e0 ? (u26.e0) I : null;
            if (e0Var != null) {
                s(e0Var.f505681g);
            }
            if (G() ? true : z17) {
                u26.q.z(this.f505717g, null, null, 3, null);
            }
            return I;
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    @Override // u26.k
    public java.lang.Object E(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h hVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505718h;
        reentrantLock.lock();
        try {
            java.lang.Object I = I();
            boolean z17 = false;
            if (!(I instanceof u26.e0) && I != u26.l.f505702d) {
                if (((p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) hVar).B()) {
                    this.f76832x1d2a8701++;
                    z17 = true;
                } else {
                    I = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392172b;
                }
            }
            reentrantLock.unlock();
            u26.e0 e0Var = I instanceof u26.e0 ? (u26.e0) I : null;
            if (e0Var != null) {
                s(e0Var.f505681g);
            }
            if (G() ? true : z17) {
                u26.q.z(this.f505717g, null, null, 3, null);
            }
            return I;
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0038, code lost:
    
        r4 = (u26.e0) r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            u26.e0 r2 = r10.k()
            r3 = 1
            if (r2 == 0) goto Lb
        L9:
            r2 = r0
            goto L1b
        Lb:
            boolean r2 = r10.z()
            if (r2 == 0) goto L1a
            u26.q r2 = r10.f505717g
            u26.e0 r2 = r2.k()
            if (r2 != 0) goto L1a
            goto L9
        L1a:
            r2 = r3
        L1b:
            r4 = 0
            if (r2 == 0) goto L6c
            java.util.concurrent.locks.ReentrantLock r2 = r10.f505718h
            boolean r2 = r2.tryLock()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r10.I()     // Catch: java.lang.Throwable -> L65
            kotlinx.coroutines.internal.l0 r5 = u26.l.f505702d     // Catch: java.lang.Throwable -> L65
            if (r2 != r5) goto L34
        L2e:
            java.util.concurrent.locks.ReentrantLock r2 = r10.f505718h
            r2.unlock()
            goto L2
        L34:
            boolean r5 = r2 instanceof u26.e0     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L41
            r4 = r2
            u26.e0 r4 = (u26.e0) r4     // Catch: java.lang.Throwable -> L65
        L3b:
            java.util.concurrent.locks.ReentrantLock r0 = r10.f505718h
            r0.unlock()
            goto L6c
        L41:
            u26.u0 r5 = r10.v()     // Catch: java.lang.Throwable -> L65
            if (r5 != 0) goto L48
            goto L3b
        L48:
            boolean r6 = r5 instanceof u26.e0     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L4d
            goto L3b
        L4d:
            kotlinx.coroutines.internal.l0 r4 = r5.h(r2, r4)     // Catch: java.lang.Throwable -> L65
            if (r4 != 0) goto L54
            goto L2e
        L54:
            long r6 = r10.f76832x1d2a8701     // Catch: java.lang.Throwable -> L65
            r8 = 1
            long r6 = r6 + r8
            r10.f76832x1d2a8701 = r6     // Catch: java.lang.Throwable -> L65
            java.util.concurrent.locks.ReentrantLock r1 = r10.f505718h
            r1.unlock()
            r5.g(r2)
            r1 = r3
            goto L2
        L65:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r10.f505718h
            r1.unlock()
            throw r0
        L6c:
            if (r4 == 0) goto L73
            java.lang.Throwable r0 = r4.f505681g
            r10.s(r0)
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u26.p.G():boolean");
    }

    public final long H() {
        return this.f76832x1d2a8701;
    }

    public final java.lang.Object I() {
        long j17 = this.f76832x1d2a8701;
        u26.e0 k17 = this.f505717g.k();
        if (j17 >= u26.q.x(this.f505717g)) {
            if (k17 != null) {
                return k17;
            }
            u26.e0 k18 = k();
            return k18 == null ? u26.l.f505702d : k18;
        }
        java.lang.Object obj = this.f505717g.f505721i[(int) (j17 % r2.f505719g)];
        u26.e0 k19 = k();
        return k19 != null ? k19 : obj;
    }

    public final void J(long j17) {
        this.f76832x1d2a8701 = j17;
    }

    @Override // u26.o
    public boolean p() {
        throw new java.lang.IllegalStateException("Should not be used".toString());
    }

    @Override // u26.o
    public boolean q() {
        throw new java.lang.IllegalStateException("Should not be used".toString());
    }

    @Override // u26.o, u26.y0
    public boolean s(java.lang.Throwable th6) {
        boolean s17 = super.s(th6);
        if (s17) {
            u26.q.z(this.f505717g, null, this, 1, null);
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505718h;
            reentrantLock.lock();
            try {
                this.f76832x1d2a8701 = u26.q.x(this.f505717g);
            } finally {
                reentrantLock.unlock();
            }
        }
        return s17;
    }

    @Override // u26.k
    public boolean y() {
        return false;
    }

    @Override // u26.k
    public boolean z() {
        return this.f76832x1d2a8701 >= u26.q.x(this.f505717g);
    }
}
