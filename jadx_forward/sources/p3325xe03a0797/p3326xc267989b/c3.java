package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public class c3 implements p3325xe03a0797.p3326xc267989b.r2, p3325xe03a0797.p3326xc267989b.y, p3325xe03a0797.p3326xc267989b.l3 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f391682d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.c3.class, java.lang.Object.class, "_state");

    /* renamed from: _parentHandle */
    private volatile /* synthetic */ java.lang.Object f72696xae2f2551;

    /* renamed from: _state */
    private volatile /* synthetic */ java.lang.Object f72697xa8a72792;

    public c3(boolean z17) {
        this.f72697xa8a72792 = z17 ? p3325xe03a0797.p3326xc267989b.d3.f391700g : p3325xe03a0797.p3326xc267989b.d3.f391699f;
        this.f72696xae2f2551 = null;
    }

    @Override // p3325xe03a0797.p3326xc267989b.r2
    public final boolean A() {
        return !(P() instanceof p3325xe03a0797.p3326xc267989b.k2);
    }

    public void B(java.lang.Throwable th6) {
        y(th6);
    }

    @Override // p3325xe03a0797.p3326xc267989b.r2
    public final java.lang.Object C(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z17;
        while (true) {
            java.lang.Object P = P();
            if (!(P instanceof p3325xe03a0797.p3326xc267989b.k2)) {
                z17 = false;
                break;
            }
            if (d0(P) >= 0) {
                z17 = true;
                break;
            }
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            p3325xe03a0797.p3326xc267989b.v2.f(interfaceC29045xdcb5ca57.mo48699x76847179());
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        rVar.m(new p3325xe03a0797.p3326xc267989b.t1(p(new p3325xe03a0797.p3326xc267989b.o3(rVar))));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        if (j17 != aVar) {
            j17 = f0Var;
        }
        return j17 == aVar ? j17 : f0Var;
    }

    public final boolean D(java.lang.Throwable th6) {
        if (T()) {
            return true;
        }
        boolean z17 = th6 instanceof java.util.concurrent.CancellationException;
        p3325xe03a0797.p3326xc267989b.w wVar = (p3325xe03a0797.p3326xc267989b.w) this.f72696xae2f2551;
        return (wVar == null || wVar == p3325xe03a0797.p3326xc267989b.j3.f392081d) ? z17 : wVar.e(th6) || z17;
    }

    public java.lang.String E() {
        return "Job was cancelled";
    }

    public boolean F(java.lang.Throwable th6) {
        if (th6 instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return y(th6) && L();
    }

    public final void G(p3325xe03a0797.p3326xc267989b.k2 k2Var, java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.w wVar = (p3325xe03a0797.p3326xc267989b.w) this.f72696xae2f2551;
        if (wVar != null) {
            wVar.mo144008x63a5261f();
            this.f72696xae2f2551 = p3325xe03a0797.p3326xc267989b.j3.f392081d;
        }
        p3325xe03a0797.p3326xc267989b.h0 h0Var = null;
        p3325xe03a0797.p3326xc267989b.e0 e0Var = obj instanceof p3325xe03a0797.p3326xc267989b.e0 ? (p3325xe03a0797.p3326xc267989b.e0) obj : null;
        java.lang.Throwable th6 = e0Var != null ? e0Var.f391705a : null;
        if (k2Var instanceof p3325xe03a0797.p3326xc267989b.w2) {
            try {
                ((p3325xe03a0797.p3326xc267989b.w2) k2Var).u(th6);
                return;
            } catch (java.lang.Throwable th7) {
                R(new p3325xe03a0797.p3326xc267989b.h0("Exception in completion handler " + k2Var + " for " + this, th7));
                return;
            }
        }
        p3325xe03a0797.p3326xc267989b.h3 f17 = k2Var.f();
        if (f17 != null) {
            for (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) f17.l(); !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar, f17); tVar = tVar.m()) {
                if (tVar instanceof p3325xe03a0797.p3326xc267989b.w2) {
                    p3325xe03a0797.p3326xc267989b.w2 w2Var = (p3325xe03a0797.p3326xc267989b.w2) tVar;
                    try {
                        w2Var.u(th6);
                    } catch (java.lang.Throwable th8) {
                        if (h0Var != null) {
                            jz5.a.a(h0Var, th8);
                        } else {
                            h0Var = new p3325xe03a0797.p3326xc267989b.h0("Exception in completion handler " + w2Var + " for " + this, th8);
                        }
                    }
                }
            }
            if (h0Var != null) {
                R(h0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable] */
    public final java.lang.Throwable H(java.lang.Object obj) {
        java.util.concurrent.CancellationException cancellationException;
        if (obj == null ? true : obj instanceof java.lang.Throwable) {
            java.lang.Throwable th6 = (java.lang.Throwable) obj;
            return th6 == null ? new p3325xe03a0797.p3326xc267989b.s2(E(), null, this) : th6;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
        p3325xe03a0797.p3326xc267989b.c3 c3Var = (p3325xe03a0797.p3326xc267989b.c3) ((p3325xe03a0797.p3326xc267989b.l3) obj);
        java.lang.Object P = c3Var.P();
        if (P instanceof p3325xe03a0797.p3326xc267989b.z2) {
            cancellationException = ((p3325xe03a0797.p3326xc267989b.z2) P).c();
        } else if (P instanceof p3325xe03a0797.p3326xc267989b.e0) {
            cancellationException = ((p3325xe03a0797.p3326xc267989b.e0) P).f391705a;
        } else {
            if (P instanceof p3325xe03a0797.p3326xc267989b.k2) {
                throw new java.lang.IllegalStateException(("Cannot be cancelling child in this state: " + P).toString());
            }
            cancellationException = null;
        }
        java.util.concurrent.CancellationException cancellationException2 = cancellationException instanceof java.util.concurrent.CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new p3325xe03a0797.p3326xc267989b.s2("Parent job is ".concat(c3Var.e0(P)), cancellationException, c3Var);
        }
        return cancellationException2;
    }

    public final java.lang.Object I(p3325xe03a0797.p3326xc267989b.z2 z2Var, java.lang.Object obj) {
        java.lang.Throwable K;
        p3325xe03a0797.p3326xc267989b.e0 e0Var = obj instanceof p3325xe03a0797.p3326xc267989b.e0 ? (p3325xe03a0797.p3326xc267989b.e0) obj : null;
        java.lang.Throwable th6 = e0Var != null ? e0Var.f391705a : null;
        synchronized (z2Var) {
            z2Var.d();
            java.util.List<java.lang.Throwable> h17 = z2Var.h(th6);
            K = K(z2Var, h17);
            if (K != null && h17.size() > 1) {
                java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(h17.size()));
                for (java.lang.Throwable th7 : h17) {
                    if (th7 != K && th7 != K && !(th7 instanceof java.util.concurrent.CancellationException) && newSetFromMap.add(th7)) {
                        jz5.a.a(K, th7);
                    }
                }
            }
        }
        if (K != null && K != th6) {
            obj = new p3325xe03a0797.p3326xc267989b.e0(K, false, 2, null);
        }
        if (K != null) {
            if (D(K) || Q(K)) {
                if (obj == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                p3325xe03a0797.p3326xc267989b.e0.f391704b.compareAndSet((p3325xe03a0797.p3326xc267989b.e0) obj, 0, 1);
            }
        }
        Z(obj);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f391682d;
        java.lang.Object l2Var = obj instanceof p3325xe03a0797.p3326xc267989b.k2 ? new p3325xe03a0797.p3326xc267989b.l2((p3325xe03a0797.p3326xc267989b.k2) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, z2Var, l2Var) && atomicReferenceFieldUpdater.get(this) == z2Var) {
        }
        G(z2Var, obj);
        return obj;
    }

    public final java.lang.Object J() {
        java.lang.Object P = P();
        if (!(!(P instanceof p3325xe03a0797.p3326xc267989b.k2))) {
            throw new java.lang.IllegalStateException("This job has not completed yet".toString());
        }
        if (P instanceof p3325xe03a0797.p3326xc267989b.e0) {
            throw ((p3325xe03a0797.p3326xc267989b.e0) P).f391705a;
        }
        return p3325xe03a0797.p3326xc267989b.d3.a(P);
    }

    public final java.lang.Throwable K(p3325xe03a0797.p3326xc267989b.z2 z2Var, java.util.List list) {
        java.lang.Object obj;
        java.lang.Object obj2 = null;
        if (list.isEmpty()) {
            if (z2Var.d()) {
                return new p3325xe03a0797.p3326xc267989b.s2(E(), null, this);
            }
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((java.lang.Throwable) obj) instanceof java.util.concurrent.CancellationException)) {
                break;
            }
        }
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        if (th6 != null) {
            return th6;
        }
        java.lang.Throwable th7 = (java.lang.Throwable) list.get(0);
        if (th7 instanceof p3325xe03a0797.p3326xc267989b.x3) {
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                java.lang.Throwable th8 = (java.lang.Throwable) next;
                if (th8 != th7 && (th8 instanceof p3325xe03a0797.p3326xc267989b.x3)) {
                    obj2 = next;
                    break;
                }
            }
            java.lang.Throwable th9 = (java.lang.Throwable) obj2;
            if (th9 != null) {
                return th9;
            }
        }
        return th7;
    }

    public boolean L() {
        return true;
    }

    public boolean M() {
        return this instanceof p3325xe03a0797.p3326xc267989b.a0;
    }

    public final p3325xe03a0797.p3326xc267989b.h3 N(p3325xe03a0797.p3326xc267989b.k2 k2Var) {
        p3325xe03a0797.p3326xc267989b.h3 f17 = k2Var.f();
        if (f17 != null) {
            return f17;
        }
        if (k2Var instanceof p3325xe03a0797.p3326xc267989b.v1) {
            return new p3325xe03a0797.p3326xc267989b.h3();
        }
        if (k2Var instanceof p3325xe03a0797.p3326xc267989b.w2) {
            b0((p3325xe03a0797.p3326xc267989b.w2) k2Var);
            return null;
        }
        throw new java.lang.IllegalStateException(("State should have list: " + k2Var).toString());
    }

    public final p3325xe03a0797.p3326xc267989b.w O() {
        return (p3325xe03a0797.p3326xc267989b.w) this.f72696xae2f2551;
    }

    public final java.lang.Object P() {
        while (true) {
            java.lang.Object obj = this.f72697xa8a72792;
            if (!(obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0)) {
                return obj;
            }
            ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj).c(this);
        }
    }

    public boolean Q(java.lang.Throwable th6) {
        return false;
    }

    public void R(java.lang.Throwable th6) {
        throw th6;
    }

    public final void S(p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        p3325xe03a0797.p3326xc267989b.j3 j3Var = p3325xe03a0797.p3326xc267989b.j3.f392081d;
        if (r2Var == null) {
            this.f72696xae2f2551 = j3Var;
            return;
        }
        r2Var.mo143976x68ac462();
        p3325xe03a0797.p3326xc267989b.w q17 = r2Var.q(this);
        this.f72696xae2f2551 = q17;
        if (A()) {
            q17.mo144008x63a5261f();
            this.f72696xae2f2551 = j3Var;
        }
    }

    public boolean T() {
        return this instanceof p3325xe03a0797.p3326xc267989b.j;
    }

    public final boolean U(java.lang.Object obj) {
        java.lang.Object f07;
        do {
            f07 = f0(P(), obj);
            if (f07 == p3325xe03a0797.p3326xc267989b.d3.f391694a) {
                return false;
            }
            if (f07 == p3325xe03a0797.p3326xc267989b.d3.f391695b) {
                return true;
            }
        } while (f07 == p3325xe03a0797.p3326xc267989b.d3.f391696c);
        u(f07);
        return true;
    }

    public final java.lang.Object V(java.lang.Object obj) {
        java.lang.Object f07;
        do {
            f07 = f0(P(), obj);
            if (f07 == p3325xe03a0797.p3326xc267989b.d3.f391694a) {
                java.lang.String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                p3325xe03a0797.p3326xc267989b.e0 e0Var = obj instanceof p3325xe03a0797.p3326xc267989b.e0 ? (p3325xe03a0797.p3326xc267989b.e0) obj : null;
                throw new java.lang.IllegalStateException(str, e0Var != null ? e0Var.f391705a : null);
            }
        } while (f07 == p3325xe03a0797.p3326xc267989b.d3.f391696c);
        return f07;
    }

    public java.lang.String W() {
        return getClass().getSimpleName();
    }

    public final p3325xe03a0797.p3326xc267989b.x X(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar) {
        while (tVar.p()) {
            tVar = tVar.n();
        }
        while (true) {
            tVar = tVar.m();
            if (!tVar.p()) {
                if (tVar instanceof p3325xe03a0797.p3326xc267989b.x) {
                    return (p3325xe03a0797.p3326xc267989b.x) tVar;
                }
                if (tVar instanceof p3325xe03a0797.p3326xc267989b.h3) {
                    return null;
                }
            }
        }
    }

    public final void Y(p3325xe03a0797.p3326xc267989b.h3 h3Var, java.lang.Throwable th6) {
        p3325xe03a0797.p3326xc267989b.h0 h0Var = null;
        for (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) h3Var.l(); !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar, h3Var); tVar = tVar.m()) {
            if (tVar instanceof p3325xe03a0797.p3326xc267989b.t2) {
                p3325xe03a0797.p3326xc267989b.w2 w2Var = (p3325xe03a0797.p3326xc267989b.w2) tVar;
                try {
                    w2Var.u(th6);
                } catch (java.lang.Throwable th7) {
                    if (h0Var != null) {
                        jz5.a.a(h0Var, th7);
                    } else {
                        h0Var = new p3325xe03a0797.p3326xc267989b.h0("Exception in completion handler " + w2Var + " for " + this, th7);
                    }
                }
            }
        }
        if (h0Var != null) {
            R(h0Var);
        }
        D(th6);
    }

    public void Z(java.lang.Object obj) {
    }

    @Override // p3325xe03a0797.p3326xc267989b.r2
    public boolean a() {
        java.lang.Object P = P();
        return (P instanceof p3325xe03a0797.p3326xc267989b.k2) && ((p3325xe03a0797.p3326xc267989b.k2) P).a();
    }

    public void a0() {
    }

    @Override // p3325xe03a0797.p3326xc267989b.r2
    public void b(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new p3325xe03a0797.p3326xc267989b.s2(E(), null, this);
        }
        B(cancellationException);
    }

    public final void b0(p3325xe03a0797.p3326xc267989b.w2 w2Var) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z17;
        p3325xe03a0797.p3326xc267989b.h3 h3Var = new p3325xe03a0797.p3326xc267989b.h3();
        w2Var.getClass();
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392059e.lazySet(h3Var, w2Var);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
        atomicReferenceFieldUpdater2.lazySet(h3Var, w2Var);
        while (true) {
            if (w2Var.l() != w2Var) {
                break;
            }
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(w2Var, w2Var, h3Var)) {
                    z17 = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(w2Var) != w2Var) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                h3Var.k(w2Var);
                break;
            }
        }
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t m17 = w2Var.m();
        do {
            atomicReferenceFieldUpdater = f391682d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w2Var, m17)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == w2Var);
    }

    @Override // p3325xe03a0797.p3326xc267989b.r2
    public final q26.n c() {
        return new q26.q(new p3325xe03a0797.p3326xc267989b.b3(this, null));
    }

    public final void c0(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h hVar, yz5.p pVar) {
        java.lang.Object P;
        p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar;
        do {
            P = P();
            fVar = (p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) hVar;
            if (fVar.y()) {
                return;
            }
            if (!(P instanceof p3325xe03a0797.p3326xc267989b.k2)) {
                if (fVar.B()) {
                    if (P instanceof p3325xe03a0797.p3326xc267989b.e0) {
                        fVar.A(((p3325xe03a0797.p3326xc267989b.e0) P).f391705a);
                        return;
                    } else {
                        w26.a.a(pVar, p3325xe03a0797.p3326xc267989b.d3.a(P), fVar);
                        return;
                    }
                }
                return;
            }
        } while (d0(P) != 0);
        fVar.u(p(new p3325xe03a0797.p3326xc267989b.q3(fVar, pVar)));
    }

    public final int d0(java.lang.Object obj) {
        boolean z17 = obj instanceof p3325xe03a0797.p3326xc267989b.v1;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f391682d;
        boolean z18 = false;
        if (z17) {
            if (((p3325xe03a0797.p3326xc267989b.v1) obj).f392216d) {
                return 0;
            }
            p3325xe03a0797.p3326xc267989b.v1 v1Var = p3325xe03a0797.p3326xc267989b.d3.f391700g;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, v1Var)) {
                    z18 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z18) {
                return -1;
            }
            a0();
            return 1;
        }
        if (!(obj instanceof p3325xe03a0797.p3326xc267989b.j2)) {
            return 0;
        }
        p3325xe03a0797.p3326xc267989b.h3 h3Var = ((p3325xe03a0797.p3326xc267989b.j2) obj).f392080d;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, h3Var)) {
                z18 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                break;
            }
        }
        if (!z18) {
            return -1;
        }
        a0();
        return 1;
    }

    public final java.lang.String e0(java.lang.Object obj) {
        if (!(obj instanceof p3325xe03a0797.p3326xc267989b.z2)) {
            return obj instanceof p3325xe03a0797.p3326xc267989b.k2 ? ((p3325xe03a0797.p3326xc267989b.k2) obj).a() ? "Active" : "New" : obj instanceof p3325xe03a0797.p3326xc267989b.e0 ? "Cancelled" : "Completed";
        }
        p3325xe03a0797.p3326xc267989b.z2 z2Var = (p3325xe03a0797.p3326xc267989b.z2) obj;
        return z2Var.d() ? "Cancelling" : z2Var.e() ? "Completing" : "Active";
    }

    public java.lang.Object f() {
        return J();
    }

    public final java.lang.Object f0(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        if (!(obj instanceof p3325xe03a0797.p3326xc267989b.k2)) {
            return p3325xe03a0797.p3326xc267989b.d3.f391694a;
        }
        boolean z18 = true;
        boolean z19 = false;
        if (((obj instanceof p3325xe03a0797.p3326xc267989b.v1) || (obj instanceof p3325xe03a0797.p3326xc267989b.w2)) && !(obj instanceof p3325xe03a0797.p3326xc267989b.x) && !(obj2 instanceof p3325xe03a0797.p3326xc267989b.e0)) {
            p3325xe03a0797.p3326xc267989b.k2 k2Var = (p3325xe03a0797.p3326xc267989b.k2) obj;
            java.lang.Object l2Var = obj2 instanceof p3325xe03a0797.p3326xc267989b.k2 ? new p3325xe03a0797.p3326xc267989b.l2((p3325xe03a0797.p3326xc267989b.k2) obj2) : obj2;
            while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f391682d;
                if (atomicReferenceFieldUpdater.compareAndSet(this, k2Var, l2Var)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != k2Var) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                Z(obj2);
                G(k2Var, obj2);
            } else {
                z18 = false;
            }
            return z18 ? obj2 : p3325xe03a0797.p3326xc267989b.d3.f391696c;
        }
        p3325xe03a0797.p3326xc267989b.k2 k2Var2 = (p3325xe03a0797.p3326xc267989b.k2) obj;
        p3325xe03a0797.p3326xc267989b.h3 N = N(k2Var2);
        if (N == null) {
            return p3325xe03a0797.p3326xc267989b.d3.f391696c;
        }
        p3325xe03a0797.p3326xc267989b.x xVar = null;
        p3325xe03a0797.p3326xc267989b.z2 z2Var = k2Var2 instanceof p3325xe03a0797.p3326xc267989b.z2 ? (p3325xe03a0797.p3326xc267989b.z2) k2Var2 : null;
        if (z2Var == null) {
            z2Var = new p3325xe03a0797.p3326xc267989b.z2(N, false, null);
        }
        synchronized (z2Var) {
            if (z2Var.e()) {
                return p3325xe03a0797.p3326xc267989b.d3.f391694a;
            }
            z2Var.i(true);
            if (z2Var != k2Var2) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f391682d;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, k2Var2, z2Var)) {
                        z19 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != k2Var2) {
                        break;
                    }
                }
                if (!z19) {
                    return p3325xe03a0797.p3326xc267989b.d3.f391696c;
                }
            }
            boolean d17 = z2Var.d();
            p3325xe03a0797.p3326xc267989b.e0 e0Var = obj2 instanceof p3325xe03a0797.p3326xc267989b.e0 ? (p3325xe03a0797.p3326xc267989b.e0) obj2 : null;
            if (e0Var != null) {
                z2Var.b(e0Var.f391705a);
            }
            java.lang.Throwable c17 = z2Var.c();
            if (!java.lang.Boolean.valueOf(true ^ d17).booleanValue()) {
                c17 = null;
            }
            if (c17 != null) {
                Y(N, c17);
            }
            p3325xe03a0797.p3326xc267989b.x xVar2 = k2Var2 instanceof p3325xe03a0797.p3326xc267989b.x ? (p3325xe03a0797.p3326xc267989b.x) k2Var2 : null;
            if (xVar2 == null) {
                p3325xe03a0797.p3326xc267989b.h3 f17 = k2Var2.f();
                if (f17 != null) {
                    xVar = X(f17);
                }
            } else {
                xVar = xVar2;
            }
            return (xVar == null || !g0(z2Var, xVar, obj2)) ? I(z2Var, obj2) : p3325xe03a0797.p3326xc267989b.d3.f391695b;
        }
    }

    @Override // oz5.l
    /* renamed from: fold */
    public java.lang.Object mo7093x300c01(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }

    public final boolean g0(p3325xe03a0797.p3326xc267989b.z2 z2Var, p3325xe03a0797.p3326xc267989b.x xVar, java.lang.Object obj) {
        while (p3325xe03a0797.p3326xc267989b.p2.b(xVar.f392227h, false, false, new p3325xe03a0797.p3326xc267989b.y2(this, z2Var, xVar, obj), 1, null) == p3325xe03a0797.p3326xc267989b.j3.f392081d) {
            xVar = X(xVar);
            if (xVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // oz5.l
    public oz5.i get(oz5.j jVar) {
        return oz5.h.a(this, jVar);
    }

    @Override // oz5.i
    /* renamed from: getKey */
    public final oz5.j mo7094xb5884f29() {
        return p3325xe03a0797.p3326xc267989b.q2.f392104d;
    }

    @Override // p3325xe03a0797.p3326xc267989b.r2
    /* renamed from: isCancelled */
    public final boolean mo143975x62a56b47() {
        java.lang.Object P = P();
        return (P instanceof p3325xe03a0797.p3326xc267989b.e0) || ((P instanceof p3325xe03a0797.p3326xc267989b.z2) && ((p3325xe03a0797.p3326xc267989b.z2) P).d());
    }

    @Override // oz5.l
    /* renamed from: minusKey */
    public oz5.l mo7095xafa9a7cf(oz5.j jVar) {
        return oz5.h.b(this, jVar);
    }

    public void o(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h hVar, yz5.p pVar) {
        c0(hVar, pVar);
    }

    @Override // p3325xe03a0797.p3326xc267989b.r2
    public final p3325xe03a0797.p3326xc267989b.s1 p(yz5.l lVar) {
        return z(false, true, lVar);
    }

    @Override // oz5.l
    /* renamed from: plus */
    public oz5.l mo7096x348d9a(oz5.l context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return oz5.g.a(this, context);
    }

    @Override // p3325xe03a0797.p3326xc267989b.r2
    public final p3325xe03a0797.p3326xc267989b.w q(p3325xe03a0797.p3326xc267989b.y yVar) {
        return (p3325xe03a0797.p3326xc267989b.w) p3325xe03a0797.p3326xc267989b.p2.b(this, true, false, new p3325xe03a0797.p3326xc267989b.x(yVar), 2, null);
    }

    @Override // p3325xe03a0797.p3326xc267989b.r2
    /* renamed from: start */
    public final boolean mo143976x68ac462() {
        int d07;
        do {
            d07 = d0(P());
            if (d07 == 0) {
                return false;
            }
        } while (d07 != 1);
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m143977x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(W() + '{' + e0(P()) + '}');
        sb6.append('@');
        sb6.append(p3325xe03a0797.p3326xc267989b.c1.a(this));
        return sb6.toString();
    }

    public void u(java.lang.Object obj) {
    }

    public void v(java.lang.Object obj) {
        u(obj);
    }

    public final java.lang.Object w(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object P;
        do {
            P = P();
            if (!(P instanceof p3325xe03a0797.p3326xc267989b.k2)) {
                if (P instanceof p3325xe03a0797.p3326xc267989b.e0) {
                    throw ((p3325xe03a0797.p3326xc267989b.e0) P).f391705a;
                }
                return p3325xe03a0797.p3326xc267989b.d3.a(P);
            }
        } while (d0(P) < 0);
        p3325xe03a0797.p3326xc267989b.x2 x2Var = new p3325xe03a0797.p3326xc267989b.x2(pz5.f.b(interfaceC29045xdcb5ca57), this);
        x2Var.k();
        x2Var.m(new p3325xe03a0797.p3326xc267989b.t1(p(new p3325xe03a0797.p3326xc267989b.n3(x2Var))));
        java.lang.Object j17 = x2Var.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    @Override // p3325xe03a0797.p3326xc267989b.r2
    public final java.util.concurrent.CancellationException x() {
        java.util.concurrent.CancellationException cancellationException;
        java.lang.Object P = P();
        if (!(P instanceof p3325xe03a0797.p3326xc267989b.z2)) {
            if (P instanceof p3325xe03a0797.p3326xc267989b.k2) {
                throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(P instanceof p3325xe03a0797.p3326xc267989b.e0)) {
                return new p3325xe03a0797.p3326xc267989b.s2(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            java.lang.Throwable th6 = ((p3325xe03a0797.p3326xc267989b.e0) P).f391705a;
            cancellationException = th6 instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th6 : null;
            return cancellationException == null ? new p3325xe03a0797.p3326xc267989b.s2(E(), th6, this) : cancellationException;
        }
        java.lang.Throwable c17 = ((p3325xe03a0797.p3326xc267989b.z2) P).c();
        if (c17 == null) {
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        java.lang.String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c17 instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) c17 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = E();
        }
        return new p3325xe03a0797.p3326xc267989b.s2(concat, c17, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r0 = p3325xe03a0797.p3326xc267989b.d3.f391694a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 != p3325xe03a0797.p3326xc267989b.d3.f391695b) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        r0 = f0(r0, new p3325xe03a0797.p3326xc267989b.e0(H(r11), false, 2, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 == p3325xe03a0797.p3326xc267989b.d3.f391696c) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r0 != p3325xe03a0797.p3326xc267989b.d3.f391694a) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r1 = P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if ((r1 instanceof p3325xe03a0797.p3326xc267989b.z2) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if ((r1 instanceof p3325xe03a0797.p3326xc267989b.k2) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        r0 = H(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        r6 = (p3325xe03a0797.p3326xc267989b.k2) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (M() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r6.a() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        r6 = f0(r1, new p3325xe03a0797.p3326xc267989b.e0(r0, false, 2, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        if (r6 == p3325xe03a0797.p3326xc267989b.d3.f391694a) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        if (r6 == p3325xe03a0797.p3326xc267989b.d3.f391696c) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r0 = P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r1).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        r7 = N(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
    
        if (r7 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        r8 = new p3325xe03a0797.p3326xc267989b.z2(r7, false, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        r1 = p3325xe03a0797.p3326xc267989b.c3.f391682d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        if (r1.compareAndSet(r10, r6, r8) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r0 instanceof p3325xe03a0797.p3326xc267989b.k2) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
    
        if (r1.get(r10) == r6) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        if (r1 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bf, code lost:
    
        Y(r7, r0);
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c3, code lost:
    
        if (r1 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        r11 = p3325xe03a0797.p3326xc267989b.d3.f391694a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b2, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bd, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f3, code lost:
    
        r11 = p3325xe03a0797.p3326xc267989b.d3.f391697d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0048, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r0 instanceof p3325xe03a0797.p3326xc267989b.z2) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0050, code lost:
    
        if (((p3325xe03a0797.p3326xc267989b.z2) r1).g() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0052, code lost:
    
        r11 = p3325xe03a0797.p3326xc267989b.d3.f391697d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0054, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0057, code lost:
    
        r3 = ((p3325xe03a0797.p3326xc267989b.z2) r1).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x005e, code lost:
    
        if (r11 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0060, code lost:
    
        if (r3 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x006e, code lost:
    
        r11 = ((p3325xe03a0797.p3326xc267989b.z2) r1).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0077, code lost:
    
        if ((!r3) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0079, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x007b, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x007d, code lost:
    
        Y(((p3325xe03a0797.p3326xc267989b.z2) r1).f392242d, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0084, code lost:
    
        r11 = p3325xe03a0797.p3326xc267989b.d3.f391694a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0062, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0064, code lost:
    
        r0 = H(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0068, code lost:
    
        ((p3325xe03a0797.p3326xc267989b.z2) r1).b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (((p3325xe03a0797.p3326xc267989b.z2) r0).e() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f8, code lost:
    
        if (r0 != p3325xe03a0797.p3326xc267989b.d3.f391694a) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x010a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fe, code lost:
    
        if (r0 != p3325xe03a0797.p3326xc267989b.d3.f391695b) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0103, code lost:
    
        if (r0 != p3325xe03a0797.p3326xc267989b.d3.f391697d) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0106, code lost:
    
        u(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.c3.y(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlinx.coroutines.j2] */
    @Override // p3325xe03a0797.p3326xc267989b.r2
    public final p3325xe03a0797.p3326xc267989b.s1 z(boolean z17, boolean z18, yz5.l lVar) {
        p3325xe03a0797.p3326xc267989b.w2 w2Var;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.lang.Throwable th6;
        boolean z19;
        if (z17) {
            w2Var = lVar instanceof p3325xe03a0797.p3326xc267989b.t2 ? (p3325xe03a0797.p3326xc267989b.t2) lVar : null;
            if (w2Var == null) {
                w2Var = new p3325xe03a0797.p3326xc267989b.n2(lVar);
            }
        } else {
            w2Var = lVar instanceof p3325xe03a0797.p3326xc267989b.w2 ? (p3325xe03a0797.p3326xc267989b.w2) lVar : null;
            if (w2Var == null) {
                w2Var = new p3325xe03a0797.p3326xc267989b.o2(lVar);
            }
        }
        w2Var.f392223g = this;
        while (true) {
            java.lang.Object P = P();
            boolean z27 = false;
            if (P instanceof p3325xe03a0797.p3326xc267989b.v1) {
                p3325xe03a0797.p3326xc267989b.v1 v1Var = (p3325xe03a0797.p3326xc267989b.v1) P;
                if (v1Var.f392216d) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f391682d;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, P, w2Var)) {
                            z27 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != P) {
                            break;
                        }
                    }
                    if (z27) {
                        return w2Var;
                    }
                } else {
                    p3325xe03a0797.p3326xc267989b.h3 h3Var = new p3325xe03a0797.p3326xc267989b.h3();
                    if (!v1Var.f392216d) {
                        h3Var = new p3325xe03a0797.p3326xc267989b.j2(h3Var);
                    }
                    do {
                        atomicReferenceFieldUpdater = f391682d;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, v1Var, h3Var)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == v1Var);
                }
            } else {
                if (!(P instanceof p3325xe03a0797.p3326xc267989b.k2)) {
                    if (z18) {
                        p3325xe03a0797.p3326xc267989b.e0 e0Var = P instanceof p3325xe03a0797.p3326xc267989b.e0 ? (p3325xe03a0797.p3326xc267989b.e0) P : null;
                        lVar.mo146xb9724478(e0Var != null ? e0Var.f391705a : null);
                    }
                    return p3325xe03a0797.p3326xc267989b.j3.f392081d;
                }
                p3325xe03a0797.p3326xc267989b.h3 f17 = ((p3325xe03a0797.p3326xc267989b.k2) P).f();
                if (f17 != null) {
                    p3325xe03a0797.p3326xc267989b.s1 s1Var = p3325xe03a0797.p3326xc267989b.j3.f392081d;
                    if (z17 && (P instanceof p3325xe03a0797.p3326xc267989b.z2)) {
                        synchronized (P) {
                            th6 = ((p3325xe03a0797.p3326xc267989b.z2) P).c();
                            if (th6 == null || ((lVar instanceof p3325xe03a0797.p3326xc267989b.x) && !((p3325xe03a0797.p3326xc267989b.z2) P).e())) {
                                p3325xe03a0797.p3326xc267989b.a3 a3Var = new p3325xe03a0797.p3326xc267989b.a3(w2Var, this, P);
                                while (true) {
                                    int t17 = f17.n().t(w2Var, f17, a3Var);
                                    if (t17 == 1) {
                                        z19 = true;
                                        break;
                                    }
                                    if (t17 == 2) {
                                        z19 = false;
                                        break;
                                    }
                                }
                                if (z19) {
                                    if (th6 == null) {
                                        return w2Var;
                                    }
                                    s1Var = w2Var;
                                }
                            }
                        }
                    } else {
                        th6 = null;
                    }
                    if (th6 != null) {
                        if (z18) {
                            lVar.mo146xb9724478(th6);
                        }
                        return s1Var;
                    }
                    p3325xe03a0797.p3326xc267989b.a3 a3Var2 = new p3325xe03a0797.p3326xc267989b.a3(w2Var, this, P);
                    while (true) {
                        int t18 = f17.n().t(w2Var, f17, a3Var2);
                        if (t18 == 1) {
                            z27 = true;
                            break;
                        }
                        if (t18 == 2) {
                            break;
                        }
                    }
                    if (z27) {
                        return w2Var;
                    }
                } else {
                    if (P == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    b0((p3325xe03a0797.p3326xc267989b.w2) P);
                }
            }
        }
    }
}
