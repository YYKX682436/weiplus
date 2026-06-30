package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public class r extends p3325xe03a0797.p3326xc267989b.n1 implements p3325xe03a0797.p3326xc267989b.q, qz5.e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f392107g = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.r.class, "_decision");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392108h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.r.class, java.lang.Object.class, "_state");

    /* renamed from: _decision */
    private volatile /* synthetic */ int f72729x271d613b;

    /* renamed from: _state */
    private volatile /* synthetic */ java.lang.Object f72730xa8a72792;

    /* renamed from: d, reason: collision with root package name */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f392109d;

    /* renamed from: e, reason: collision with root package name */
    public final oz5.l f392110e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.s1 f392111f;

    public r(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17) {
        super(i17);
        this.f392109d = interfaceC29045xdcb5ca57;
        this.f392110e = interfaceC29045xdcb5ca57.mo48699x76847179();
        this.f72729x271d613b = 0;
        this.f72730xa8a72792 = p3325xe03a0797.p3326xc267989b.b.f391670d;
    }

    public final void a(p3325xe03a0797.p3326xc267989b.n nVar, java.lang.Throwable th6) {
        try {
            nVar.a(th6);
        } catch (java.lang.Throwable th7) {
            p3325xe03a0797.p3326xc267989b.u0.a(this.f392110e, new p3325xe03a0797.p3326xc267989b.h0("Exception in invokeOnCancellation handler for " + this, th7));
        }
    }

    public final void b(yz5.l lVar, java.lang.Throwable th6) {
        try {
            lVar.mo146xb9724478(th6);
        } catch (java.lang.Throwable th7) {
            p3325xe03a0797.p3326xc267989b.u0.a(this.f392110e, new p3325xe03a0797.p3326xc267989b.h0("Exception in invokeOnCancellation handler for " + this, th7));
        }
    }

    public final void c(yz5.l lVar, java.lang.Throwable th6) {
        try {
            lVar.mo146xb9724478(th6);
        } catch (java.lang.Throwable th7) {
            p3325xe03a0797.p3326xc267989b.u0.a(this.f392110e, new p3325xe03a0797.p3326xc267989b.h0("Exception in resume onCancellation handler for " + this, th7));
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.n1
    /* renamed from: cancelCompletedResult$kotlinx_coroutines_core */
    public void mo144025xe76581e5(java.lang.Object obj, java.lang.Throwable th6) {
        while (true) {
            java.lang.Object obj2 = this.f72730xa8a72792;
            if (obj2 instanceof p3325xe03a0797.p3326xc267989b.k3) {
                throw new java.lang.IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof p3325xe03a0797.p3326xc267989b.e0) {
                return;
            }
            boolean z17 = true;
            if (obj2 instanceof p3325xe03a0797.p3326xc267989b.d0) {
                p3325xe03a0797.p3326xc267989b.d0 d0Var = (p3325xe03a0797.p3326xc267989b.d0) obj2;
                if (!(!(d0Var.f391689e != null))) {
                    throw new java.lang.IllegalStateException("Must be called at most once".toString());
                }
                p3325xe03a0797.p3326xc267989b.d0 a17 = p3325xe03a0797.p3326xc267989b.d0.a(d0Var, null, null, null, null, th6, 15, null);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392108h;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a17)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    p3325xe03a0797.p3326xc267989b.n nVar = d0Var.f391686b;
                    if (nVar != null) {
                        a(nVar, th6);
                    }
                    yz5.l lVar = d0Var.f391687c;
                    if (lVar != null) {
                        c(lVar, th6);
                        return;
                    }
                    return;
                }
            } else {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f392108h;
                p3325xe03a0797.p3326xc267989b.d0 d0Var2 = new p3325xe03a0797.p3326xc267989b.d0(obj2, null, null, null, th6, 14, null);
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, d0Var2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            }
        }
    }

    public boolean d(java.lang.Throwable th6) {
        java.lang.Object obj;
        boolean z17;
        boolean z18;
        do {
            obj = this.f72730xa8a72792;
            z17 = false;
            if (!(obj instanceof p3325xe03a0797.p3326xc267989b.k3)) {
                return false;
            }
            z18 = obj instanceof p3325xe03a0797.p3326xc267989b.n;
            p3325xe03a0797.p3326xc267989b.u uVar = new p3325xe03a0797.p3326xc267989b.u(this, th6, z18);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392108h;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        } while (!z17);
        p3325xe03a0797.p3326xc267989b.n nVar = z18 ? (p3325xe03a0797.p3326xc267989b.n) obj : null;
        if (nVar != null) {
            a(nVar, th6);
        }
        g();
        h(this.f72727xdec89770);
        return true;
    }

    public void e(java.lang.Object obj) {
        h(this.f72727xdec89770);
    }

    public final void f() {
        p3325xe03a0797.p3326xc267989b.s1 s1Var = this.f392111f;
        if (s1Var == null) {
            return;
        }
        s1Var.mo144008x63a5261f();
        this.f392111f = p3325xe03a0797.p3326xc267989b.j3.f392081d;
    }

    public final void g() {
        if (m144085xbffc2835()) {
            return;
        }
        f();
    }

    @Override // qz5.e
    /* renamed from: getCallerFrame */
    public qz5.e mo144028x366976c() {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f392109d;
        if (interfaceC29045xdcb5ca57 instanceof qz5.e) {
            return (qz5.e) interfaceC29045xdcb5ca57;
        }
        return null;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return this.f392110e;
    }

    @Override // p3325xe03a0797.p3326xc267989b.n1
    /* renamed from: getDelegate$kotlinx_coroutines_core */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo144029xbf34f972() {
        return this.f392109d;
    }

    @Override // p3325xe03a0797.p3326xc267989b.n1
    /* renamed from: getExceptionalResult$kotlinx_coroutines_core */
    public java.lang.Throwable mo144075xbd95b938(java.lang.Object obj) {
        java.lang.Throwable mo144075xbd95b938 = super.mo144075xbd95b938(obj);
        if (mo144075xbd95b938 != null) {
            return mo144075xbd95b938;
        }
        return null;
    }

    @Override // p3325xe03a0797.p3326xc267989b.n1
    /* renamed from: getSuccessfulResult$kotlinx_coroutines_core */
    public java.lang.Object mo144076x244ff344(java.lang.Object obj) {
        return obj instanceof p3325xe03a0797.p3326xc267989b.d0 ? ((p3325xe03a0797.p3326xc267989b.d0) obj).f391685a : obj;
    }

    /* JADX WARN: Finally extract failed */
    public final void h(int i17) {
        boolean z17;
        while (true) {
            int i18 = this.f72729x271d613b;
            if (i18 != 0) {
                if (i18 != 1) {
                    throw new java.lang.IllegalStateException("Already resumed".toString());
                }
                z17 = false;
            } else if (f392107g.compareAndSet(this, 0, 2)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f392109d;
        boolean z18 = i17 == 4;
        if (!z18 && (interfaceC29045xdcb5ca57 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390)) {
            boolean z19 = i17 == 1 || i17 == 2;
            int i19 = this.f72727xdec89770;
            if (z19 == (i19 == 1 || i19 == 2)) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) interfaceC29045xdcb5ca57).dispatcher;
                oz5.l mo48699x76847179 = interfaceC29045xdcb5ca57.mo48699x76847179();
                if (p0Var.I(mo48699x76847179)) {
                    p0Var.D(mo48699x76847179, this);
                    return;
                }
                p3325xe03a0797.p3326xc267989b.w1 a17 = p3325xe03a0797.p3326xc267989b.v3.f392217a.a();
                if (a17.O()) {
                    a17.M(this);
                    return;
                }
                a17.N(true);
                try {
                    p3325xe03a0797.p3326xc267989b.o1.a(this, this.f392109d, true);
                    do {
                    } while (a17.Q());
                } catch (java.lang.Throwable th6) {
                    try {
                        m144077x85a173f3(th6, null);
                    } finally {
                        a17.K(true);
                    }
                }
                return;
            }
        }
        p3325xe03a0797.p3326xc267989b.o1.a(this, interfaceC29045xdcb5ca57, z18);
    }

    public java.lang.Throwable i(p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        return r2Var.x();
    }

    /* renamed from: isReusable */
    public final boolean m144085xbffc2835() {
        return (this.f72727xdec89770 == 2) && ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) this.f392109d).m144031xbffc2835();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r6.f392111f != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r0 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r0 = r6.f392109d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if ((r0 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r5 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        r0 = r5.m144039xa2df4646(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        f();
        d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return pz5.a.f440719d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        r0 = r6.f392109d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if ((r0 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r5 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r5 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r0 = r5.m144039xa2df4646(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        f();
        d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r0 = r6.f72730xa8a72792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if ((r0 instanceof p3325xe03a0797.p3326xc267989b.e0) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r1 = r6.f72727xdec89770;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r1 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r1 != 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (r3 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        r1 = (p3325xe03a0797.p3326xc267989b.r2) r6.f392110e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007f, code lost:
    
        if (r1 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        if (r1.a() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r1 = r1.x();
        mo144025xe76581e5(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        return mo144076x244ff344(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
    
        throw ((p3325xe03a0797.p3326xc267989b.e0) r0).f391705a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r1 == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j() {
        /*
            r6 = this;
            boolean r0 = r6.m144085xbffc2835()
        L4:
            int r1 = r6.f72729x271d613b
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1b
            if (r1 != r2) goto Lf
            r1 = r4
            goto L24
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p3325xe03a0797.p3326xc267989b.r.f392107g
            boolean r1 = r1.compareAndSet(r6, r4, r3)
            if (r1 == 0) goto L4
            r1 = r3
        L24:
            r5 = 0
            if (r1 == 0) goto L4b
            kotlinx.coroutines.s1 r1 = r6.f392111f
            if (r1 != 0) goto L2e
            r6.l()
        L2e:
            if (r0 == 0) goto L48
            kotlin.coroutines.Continuation r0 = r6.f392109d
            boolean r1 = r0 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390
            if (r1 == 0) goto L39
            r5 = r0
            kotlinx.coroutines.internal.DispatchedContinuation r5 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) r5
        L39:
            if (r5 == 0) goto L48
            java.lang.Throwable r0 = r5.m144039xa2df4646(r6)
            if (r0 != 0) goto L42
            goto L48
        L42:
            r6.f()
            r6.d(r0)
        L48:
            pz5.a r0 = pz5.a.f440719d
            return r0
        L4b:
            if (r0 == 0) goto L65
            kotlin.coroutines.Continuation r0 = r6.f392109d
            boolean r1 = r0 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390
            if (r1 == 0) goto L56
            r5 = r0
            kotlinx.coroutines.internal.DispatchedContinuation r5 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) r5
        L56:
            if (r5 == 0) goto L65
            java.lang.Throwable r0 = r5.m144039xa2df4646(r6)
            if (r0 != 0) goto L5f
            goto L65
        L5f:
            r6.f()
            r6.d(r0)
        L65:
            java.lang.Object r0 = r6.f72730xa8a72792
            boolean r1 = r0 instanceof p3325xe03a0797.p3326xc267989b.e0
            if (r1 != 0) goto L95
            int r1 = r6.f72727xdec89770
            if (r1 == r3) goto L73
            if (r1 != r2) goto L72
            goto L73
        L72:
            r3 = r4
        L73:
            if (r3 == 0) goto L90
            oz5.l r1 = r6.f392110e
            kotlinx.coroutines.q2 r2 = p3325xe03a0797.p3326xc267989b.q2.f392104d
            oz5.i r1 = r1.get(r2)
            kotlinx.coroutines.r2 r1 = (p3325xe03a0797.p3326xc267989b.r2) r1
            if (r1 == 0) goto L90
            boolean r2 = r1.a()
            if (r2 == 0) goto L88
            goto L90
        L88:
            java.util.concurrent.CancellationException r1 = r1.x()
            r6.mo144025xe76581e5(r0, r1)
            throw r1
        L90:
            java.lang.Object r0 = r6.mo144076x244ff344(r0)
            return r0
        L95:
            kotlinx.coroutines.e0 r0 = (p3325xe03a0797.p3326xc267989b.e0) r0
            java.lang.Throwable r0 = r0.f391705a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.r.j():java.lang.Object");
    }

    public void k() {
        p3325xe03a0797.p3326xc267989b.s1 l17 = l();
        if (l17 != null && o()) {
            l17.mo144008x63a5261f();
            this.f392111f = p3325xe03a0797.p3326xc267989b.j3.f392081d;
        }
    }

    public final p3325xe03a0797.p3326xc267989b.s1 l() {
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) this.f392110e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
        if (r2Var == null) {
            return null;
        }
        p3325xe03a0797.p3326xc267989b.s1 b17 = p3325xe03a0797.p3326xc267989b.p2.b(r2Var, true, false, new p3325xe03a0797.p3326xc267989b.v(this), 2, null);
        this.f392111f = b17;
        return b17;
    }

    public void m(yz5.l lVar) {
        p3325xe03a0797.p3326xc267989b.n m2Var = lVar instanceof p3325xe03a0797.p3326xc267989b.n ? (p3325xe03a0797.p3326xc267989b.n) lVar : new p3325xe03a0797.p3326xc267989b.m2(lVar);
        while (true) {
            java.lang.Object obj = this.f72730xa8a72792;
            boolean z17 = true;
            if (obj instanceof p3325xe03a0797.p3326xc267989b.b) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392108h;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, m2Var)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            } else {
                if (obj instanceof p3325xe03a0797.p3326xc267989b.n) {
                    p(lVar, obj);
                    throw null;
                }
                boolean z18 = obj instanceof p3325xe03a0797.p3326xc267989b.e0;
                if (z18) {
                    p3325xe03a0797.p3326xc267989b.e0 e0Var = (p3325xe03a0797.p3326xc267989b.e0) obj;
                    e0Var.getClass();
                    if (!p3325xe03a0797.p3326xc267989b.e0.f391704b.compareAndSet(e0Var, 0, 1)) {
                        p(lVar, obj);
                        throw null;
                    }
                    if (obj instanceof p3325xe03a0797.p3326xc267989b.u) {
                        if (!z18) {
                            e0Var = null;
                        }
                        b(lVar, e0Var != null ? e0Var.f391705a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof p3325xe03a0797.p3326xc267989b.d0) {
                    p3325xe03a0797.p3326xc267989b.d0 d0Var = (p3325xe03a0797.p3326xc267989b.d0) obj;
                    if (d0Var.f391686b != null) {
                        p(lVar, obj);
                        throw null;
                    }
                    if (m2Var instanceof p3325xe03a0797.p3326xc267989b.i) {
                        return;
                    }
                    java.lang.Throwable th6 = d0Var.f391689e;
                    if (th6 != null) {
                        b(lVar, th6);
                        return;
                    }
                    p3325xe03a0797.p3326xc267989b.d0 a17 = p3325xe03a0797.p3326xc267989b.d0.a(d0Var, null, m2Var, null, null, null, 29, null);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f392108h;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, a17)) {
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17) {
                        return;
                    }
                } else {
                    if (m2Var instanceof p3325xe03a0797.p3326xc267989b.i) {
                        return;
                    }
                    p3325xe03a0797.p3326xc267989b.d0 d0Var2 = new p3325xe03a0797.p3326xc267989b.d0(obj, m2Var, null, null, null, 28, null);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f392108h;
                    while (true) {
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, d0Var2)) {
                            break;
                        } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17) {
                        return;
                    }
                }
            }
        }
    }

    public boolean n() {
        return this.f72730xa8a72792 instanceof p3325xe03a0797.p3326xc267989b.k3;
    }

    public boolean o() {
        return !(this.f72730xa8a72792 instanceof p3325xe03a0797.p3326xc267989b.k3);
    }

    public final void p(yz5.l lVar, java.lang.Object obj) {
        throw new java.lang.IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public java.lang.String q() {
        return "CancellableContinuation";
    }

    public final boolean r() {
        java.lang.Object obj = this.f72730xa8a72792;
        if ((obj instanceof p3325xe03a0797.p3326xc267989b.d0) && ((p3325xe03a0797.p3326xc267989b.d0) obj).f391688d != null) {
            f();
            return false;
        }
        this.f72729x271d613b = 0;
        this.f72730xa8a72792 = p3325xe03a0797.p3326xc267989b.b.f391670d;
        return true;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
        if (m143898xd4a2fc34 != null) {
            obj = new p3325xe03a0797.p3326xc267989b.e0(m143898xd4a2fc34, false, 2, null);
        }
        t(obj, this.f72727xdec89770, null);
    }

    public void s(java.lang.Object obj, yz5.l lVar) {
        t(obj, this.f72727xdec89770, lVar);
    }

    public final void t(java.lang.Object obj, int i17, yz5.l lVar) {
        boolean z17;
        do {
            java.lang.Object obj2 = this.f72730xa8a72792;
            z17 = false;
            if (!(obj2 instanceof p3325xe03a0797.p3326xc267989b.k3)) {
                if (obj2 instanceof p3325xe03a0797.p3326xc267989b.u) {
                    p3325xe03a0797.p3326xc267989b.u uVar = (p3325xe03a0797.p3326xc267989b.u) obj2;
                    uVar.getClass();
                    if (p3325xe03a0797.p3326xc267989b.u.f392212c.compareAndSet(uVar, 0, 1)) {
                        if (lVar != null) {
                            c(lVar, uVar.f391705a);
                            return;
                        }
                        return;
                    }
                }
                throw new java.lang.IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            java.lang.Object v17 = v((p3325xe03a0797.p3326xc267989b.k3) obj2, obj, i17, lVar, null);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392108h;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, v17)) {
                    z17 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
        } while (!z17);
        g();
        h(i17);
    }

    @Override // p3325xe03a0797.p3326xc267989b.n1
    /* renamed from: takeState$kotlinx_coroutines_core */
    public java.lang.Object mo144037x79a9fdc1() {
        return this.f72730xa8a72792;
    }

    /* renamed from: toString */
    public java.lang.String m144086x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(q());
        sb6.append('(');
        sb6.append(p3325xe03a0797.p3326xc267989b.c1.b(this.f392109d));
        sb6.append("){");
        java.lang.Object obj = this.f72730xa8a72792;
        sb6.append(obj instanceof p3325xe03a0797.p3326xc267989b.k3 ? "Active" : obj instanceof p3325xe03a0797.p3326xc267989b.u ? "Cancelled" : "Completed");
        sb6.append("}@");
        sb6.append(p3325xe03a0797.p3326xc267989b.c1.a(this));
        return sb6.toString();
    }

    public void u(p3325xe03a0797.p3326xc267989b.p0 p0Var, java.lang.Object obj) {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f392109d;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390 c29049xd7b07390 = interfaceC29045xdcb5ca57 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390 ? (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) interfaceC29045xdcb5ca57 : null;
        t(obj, (c29049xd7b07390 != null ? c29049xd7b07390.dispatcher : null) == p0Var ? 4 : this.f72727xdec89770, null);
    }

    public final java.lang.Object v(p3325xe03a0797.p3326xc267989b.k3 k3Var, java.lang.Object obj, int i17, yz5.l lVar, java.lang.Object obj2) {
        if (obj instanceof p3325xe03a0797.p3326xc267989b.e0) {
            return obj;
        }
        boolean z17 = true;
        if (i17 != 1 && i17 != 2) {
            z17 = false;
        }
        if (!z17 && obj2 == null) {
            return obj;
        }
        if (lVar != null || (((k3Var instanceof p3325xe03a0797.p3326xc267989b.n) && !(k3Var instanceof p3325xe03a0797.p3326xc267989b.i)) || obj2 != null)) {
            return new p3325xe03a0797.p3326xc267989b.d0(obj, k3Var instanceof p3325xe03a0797.p3326xc267989b.n ? (p3325xe03a0797.p3326xc267989b.n) k3Var : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 w(java.lang.Object obj, java.lang.Object obj2, yz5.l lVar) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var;
        boolean z17;
        do {
            java.lang.Object obj3 = this.f72730xa8a72792;
            boolean z18 = obj3 instanceof p3325xe03a0797.p3326xc267989b.k3;
            l0Var = p3325xe03a0797.p3326xc267989b.s.f392113a;
            if (!z18) {
                if (!(obj3 instanceof p3325xe03a0797.p3326xc267989b.d0)) {
                    return null;
                }
                if (obj2 == null || ((p3325xe03a0797.p3326xc267989b.d0) obj3).f391688d != obj2) {
                    return null;
                }
                return l0Var;
            }
            java.lang.Object v17 = v((p3325xe03a0797.p3326xc267989b.k3) obj3, obj, this.f72727xdec89770, lVar, obj2);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392108h;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, v17)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
        g();
        return l0Var;
    }
}
