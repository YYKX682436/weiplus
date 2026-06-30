package u26;

/* loaded from: classes14.dex */
public class r extends u26.k {

    /* renamed from: g, reason: collision with root package name */
    public final int f505723g;

    /* renamed from: h, reason: collision with root package name */
    public final u26.u f505724h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f505725i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object[] f505726m;

    /* renamed from: n, reason: collision with root package name */
    public int f505727n;

    /* renamed from: size */
    private volatile /* synthetic */ int f76836x35e001;

    public r(int i17, u26.u uVar, yz5.l lVar) {
        super(lVar);
        this.f505723g = i17;
        this.f505724h = uVar;
        if (!(i17 >= 1)) {
            throw new java.lang.IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i17 + " was specified").toString());
        }
        this.f505725i = new java.util.concurrent.locks.ReentrantLock();
        java.lang.Object[] objArr = new java.lang.Object[java.lang.Math.min(i17, 8)];
        kz5.v.u(objArr, u26.l.f505699a, 0, 0, 6, null);
        this.f505726m = objArr;
        this.f76836x35e001 = 0;
    }

    @Override // u26.k
    public void B(boolean z17) {
        yz5.l lVar = this.f505714d;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505725i;
        reentrantLock.lock();
        try {
            int i17 = this.f76836x35e001;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.v0 v0Var = null;
            for (int i18 = 0; i18 < i17; i18++) {
                java.lang.Object obj = this.f505726m[this.f505727n];
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = u26.l.f505699a;
                if (lVar != null && obj != l0Var) {
                    v0Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d0.a(lVar, obj, v0Var);
                }
                java.lang.Object[] objArr = this.f505726m;
                int i19 = this.f505727n;
                objArr[i19] = l0Var;
                this.f505727n = (i19 + 1) % objArr.length;
            }
            this.f76836x35e001 = 0;
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
        java.lang.Object obj;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505725i;
        reentrantLock.lock();
        try {
            int i17 = this.f76836x35e001;
            java.lang.Object obj2 = u26.l.f505702d;
            if (i17 == 0) {
                u26.e0 l17 = l();
                if (l17 != null) {
                    obj2 = l17;
                }
                return obj2;
            }
            java.lang.Object[] objArr = this.f505726m;
            int i18 = this.f505727n;
            java.lang.Object obj3 = objArr[i18];
            u26.w0 w0Var = null;
            objArr[i18] = null;
            this.f76836x35e001 = i17 - 1;
            boolean z17 = false;
            if (i17 == this.f505723g) {
                u26.w0 w0Var2 = null;
                while (true) {
                    u26.w0 w17 = w();
                    if (w17 == null) {
                        w0Var = w0Var2;
                        break;
                    }
                    if (w17.y(null) != null) {
                        obj = w17.w();
                        z17 = true;
                        w0Var = w17;
                        break;
                    }
                    w17.z();
                    w0Var2 = w17;
                }
            }
            obj = obj2;
            if (obj != obj2 && !(obj instanceof u26.e0)) {
                this.f76836x35e001 = i17;
                java.lang.Object[] objArr2 = this.f505726m;
                objArr2[(this.f505727n + i17) % objArr2.length] = obj;
            }
            this.f505727n = (this.f505727n + 1) % this.f505726m.length;
            if (z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w0Var);
                w0Var.u();
            }
            return obj3;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r1 == r9.f505723g) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r3 = new u26.g(r9.f505715e);
        r7 = (p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) r10;
        r7.getClass();
        r7 = new p3325xe03a0797.p3326xc267989b.p3331x75e76af7.a(r7, r3).c(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r7 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r7 == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r7 == p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c.f392019b) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r7 != p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392172b) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r9.f76836x35e001 = r1;
        r9.f505726m[r9.f505727n] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if ((r7 instanceof u26.e0) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        r3 = true;
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (r7 == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if ((r7 instanceof u26.e0) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        r9.f76836x35e001 = r1;
        r10 = r9.f505726m;
        r10[(r9.f505727n + r1) % r10.length] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        r9.f505727n = (r9.f505727n + 1) % r9.f505726m.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (r3 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6);
        ((u26.w0) r6).u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        if (((p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) r10).B() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        r9.f76836x35e001 = r1;
        r9.f505726m[r9.f505727n] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        return p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392172b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r7).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0041, code lost:
    
        r6 = r3.h();
        r7 = ((u26.w0) r6).w();
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0086, code lost:
    
        r3 = false;
        r7 = r2;
     */
    @Override // u26.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h r10) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u26.r.E(kotlinx.coroutines.selects.h):java.lang.Object");
    }

    public final void G(int i17, java.lang.Object obj) {
        int i18 = this.f505723g;
        if (i17 >= i18) {
            java.lang.Object[] objArr = this.f505726m;
            int i19 = this.f505727n;
            objArr[i19 % objArr.length] = null;
            objArr[(i17 + i19) % objArr.length] = obj;
            this.f505727n = (i19 + 1) % objArr.length;
            return;
        }
        java.lang.Object[] objArr2 = this.f505726m;
        if (i17 >= objArr2.length) {
            int min = java.lang.Math.min(objArr2.length * 2, i18);
            java.lang.Object[] objArr3 = new java.lang.Object[min];
            for (int i27 = 0; i27 < i17; i27++) {
                java.lang.Object[] objArr4 = this.f505726m;
                objArr3[i27] = objArr4[(this.f505727n + i27) % objArr4.length];
            }
            java.util.Arrays.fill(objArr3, i17, min, u26.l.f505699a);
            this.f505726m = objArr3;
            this.f505727n = 0;
        }
        java.lang.Object[] objArr5 = this.f505726m;
        objArr5[(this.f505727n + i17) % objArr5.length] = obj;
    }

    @Override // u26.o
    public java.lang.Object c(u26.w0 w0Var) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505725i;
        reentrantLock.lock();
        try {
            return super.c(w0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // u26.o
    public java.lang.String f() {
        return "(buffer:capacity=" + this.f505723g + ",size=" + this.f76836x35e001 + ')';
    }

    @Override // u26.k, u26.t0
    /* renamed from: isEmpty */
    public boolean mo167477x7aab3243() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505725i;
        reentrantLock.lock();
        try {
            return A();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // u26.k, u26.t0
    public boolean m() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505725i;
        reentrantLock.lock();
        try {
            return super.m();
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
        return this.f76836x35e001 == this.f505723g && this.f505724h == u26.u.SUSPEND;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r1 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r2 = v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r2 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if ((r2 instanceof u26.e0) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r2.h(r7, null) == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        r6.f76836x35e001 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        r0.unlock();
        r2.g(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        return r2.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        r6.f76836x35e001 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        G(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // u26.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(java.lang.Object r7) {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.f505725i
            r0.lock()
            int r1 = r6.f76836x35e001     // Catch: java.lang.Throwable -> L6a
            u26.e0 r2 = r6.l()     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L11
            r0.unlock()
            return r2
        L11:
            int r2 = r6.f505723g     // Catch: java.lang.Throwable -> L6a
            kotlinx.coroutines.internal.l0 r3 = u26.l.f505700b
            r4 = 0
            if (r1 >= r2) goto L1d
            int r2 = r1 + 1
            r6.f76836x35e001 = r2     // Catch: java.lang.Throwable -> L6a
            goto L33
        L1d:
            u26.u r2 = r6.f505724h     // Catch: java.lang.Throwable -> L6a
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L35
            r5 = 1
            if (r2 == r5) goto L33
            r5 = 2
            if (r2 != r5) goto L2d
            r2 = r3
            goto L37
        L2d:
            jz5.j r7 = new jz5.j     // Catch: java.lang.Throwable -> L6a
            r7.<init>()     // Catch: java.lang.Throwable -> L6a
            throw r7     // Catch: java.lang.Throwable -> L6a
        L33:
            r2 = r4
            goto L37
        L35:
            kotlinx.coroutines.internal.l0 r2 = u26.l.f505701c     // Catch: java.lang.Throwable -> L6a
        L37:
            if (r2 == 0) goto L3d
            r0.unlock()
            return r2
        L3d:
            if (r1 != 0) goto L63
        L3f:
            u26.u0 r2 = r6.v()     // Catch: java.lang.Throwable -> L6a
            if (r2 != 0) goto L46
            goto L63
        L46:
            boolean r5 = r2 instanceof u26.e0     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L50
            r6.f76836x35e001 = r1     // Catch: java.lang.Throwable -> L6a
            r0.unlock()
            return r2
        L50:
            kotlinx.coroutines.internal.l0 r5 = r2.h(r7, r4)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L3f
            r6.f76836x35e001 = r1     // Catch: java.lang.Throwable -> L6a
            r0.unlock()
            r2.g(r7)
            java.lang.Object r7 = r2.d()
            return r7
        L63:
            r6.G(r1, r7)     // Catch: java.lang.Throwable -> L6a
            r0.unlock()
            return r3
        L6a:
            r7 = move-exception
            r0.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u26.r.u(java.lang.Object):java.lang.Object");
    }

    @Override // u26.k
    public boolean x(u26.s0 s0Var) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505725i;
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
        return this.f76836x35e001 == 0;
    }
}
