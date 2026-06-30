package u26;

/* loaded from: classes14.dex */
public class l0 extends u26.k {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f505705g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f505706h;

    public l0(yz5.l lVar) {
        super(lVar);
        this.f505705g = new java.util.concurrent.locks.ReentrantLock();
        this.f505706h = u26.l.f505699a;
    }

    @Override // u26.k
    public void B(boolean z17) {
        yz5.l lVar;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505705g;
        reentrantLock.lock();
        try {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = u26.l.f505699a;
            java.lang.Object obj = this.f505706h;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.v0 v0Var = null;
            if (obj != l0Var && (lVar = this.f505714d) != null) {
                v0Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d0.a(lVar, obj, null);
            }
            this.f505706h = l0Var;
            reentrantLock.unlock();
            super.B(z17);
            if (v0Var != null) {
                throw v0Var;
            }
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    @Override // u26.k
    public java.lang.Object D() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505705g;
        reentrantLock.lock();
        try {
            java.lang.Object obj = this.f505706h;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = u26.l.f505699a;
            if (obj != l0Var) {
                this.f505706h = l0Var;
                return obj;
            }
            java.lang.Object l17 = l();
            if (l17 == null) {
                l17 = u26.l.f505702d;
            }
            return l17;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // u26.k
    public java.lang.Object E(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h hVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505705g;
        reentrantLock.lock();
        try {
            java.lang.Object obj = this.f505706h;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = u26.l.f505699a;
            if (obj == l0Var) {
                java.lang.Object l17 = l();
                if (l17 == null) {
                    l17 = u26.l.f505702d;
                }
                return l17;
            }
            if (!((p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) hVar).B()) {
                return p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392172b;
            }
            java.lang.Object obj2 = this.f505706h;
            this.f505706h = l0Var;
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // u26.o
    public java.lang.String f() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505705g;
        reentrantLock.lock();
        try {
            return "(value=" + this.f505706h + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // u26.k, u26.t0
    /* renamed from: isEmpty */
    public boolean mo167477x7aab3243() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505705g;
        reentrantLock.lock();
        try {
            return A();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // u26.o
    public final boolean p() {
        return false;
    }

    @Override // u26.o
    public final boolean q() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r1 == r2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        r1 = v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if ((r1 instanceof u26.e0) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r1.h(r6, null) == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        r0.unlock();
        r1.g(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        return r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0024, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0036, code lost:
    
        r1 = r5.f505706h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        if (r1 != r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r5.f505706h = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
        if (r3 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        return u26.l.f505700b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003b, code lost:
    
        r2 = r5.f505714d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003f, code lost:
    
        r3 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d0.a(r2, r1, null);
     */
    @Override // u26.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(java.lang.Object r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.f505705g
            r0.lock()
            u26.e0 r1 = r5.l()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto Lf
            r0.unlock()
            return r1
        Lf:
            java.lang.Object r1 = r5.f505706h     // Catch: java.lang.Throwable -> L4e
            kotlinx.coroutines.internal.l0 r2 = u26.l.f505699a
            r3 = 0
            if (r1 != r2) goto L36
        L16:
            u26.u0 r1 = r5.v()     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L1d
            goto L36
        L1d:
            boolean r4 = r1 instanceof u26.e0     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L25
            r0.unlock()
            return r1
        L25:
            kotlinx.coroutines.internal.l0 r4 = r1.h(r6, r3)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L16
            r0.unlock()
            r1.g(r6)
            java.lang.Object r6 = r1.d()
            return r6
        L36:
            java.lang.Object r1 = r5.f505706h     // Catch: java.lang.Throwable -> L4e
            if (r1 != r2) goto L3b
            goto L43
        L3b:
            yz5.l r2 = r5.f505714d     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L43
            kotlinx.coroutines.internal.v0 r3 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d0.a(r2, r1, r3)     // Catch: java.lang.Throwable -> L4e
        L43:
            r5.f505706h = r6     // Catch: java.lang.Throwable -> L4e
            if (r3 != 0) goto L4d
            kotlinx.coroutines.internal.l0 r6 = u26.l.f505700b     // Catch: java.lang.Throwable -> L4e
            r0.unlock()
            return r6
        L4d:
            throw r3     // Catch: java.lang.Throwable -> L4e
        L4e:
            r6 = move-exception
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u26.l0.u(java.lang.Object):java.lang.Object");
    }

    @Override // u26.k
    public boolean x(u26.s0 s0Var) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505705g;
        reentrantLock.lock();
        try {
            return super.x(s0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // u26.k
    public final boolean y() {
        return false;
    }

    @Override // u26.k
    public final boolean z() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505705g;
        reentrantLock.lock();
        try {
            return this.f505706h == u26.l.f505699a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
