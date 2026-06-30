package p3325xe03a0797.p3326xc267989b.p3331x75e76af7;

/* loaded from: classes14.dex */
public final class f extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.m implements p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57, qz5.e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392168h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f.class, java.lang.Object.class, "_state");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392169i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f.class, java.lang.Object.class, "_result");

    /* renamed from: g, reason: collision with root package name */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f392170g;

    /* renamed from: _state */
    volatile /* synthetic */ java.lang.Object f72745xa8a72792 = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392171a;

    /* renamed from: _result */
    private volatile /* synthetic */ java.lang.Object f72744x69bdc53c = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392173c;

    /* renamed from: _parentHandle */
    private volatile /* synthetic */ java.lang.Object f72743xae2f2551 = null;

    public f(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f392170g = interfaceC29045xdcb5ca57;
    }

    public void A(java.lang.Throwable th6) {
        while (true) {
            java.lang.Object obj = this.f72744x69bdc53c;
            java.lang.Object obj2 = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392173c;
            boolean z17 = true;
            if (obj == obj2) {
                p3325xe03a0797.p3326xc267989b.e0 e0Var = new p3325xe03a0797.p3326xc267989b.e0(th6, false, 2, null);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392169i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, e0Var)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            } else {
                pz5.a aVar = pz5.a.f440719d;
                if (obj != aVar) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f392169i;
                java.lang.Object obj3 = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392174d;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar, obj3)) {
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != aVar) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 b17 = pz5.f.b(this.f392170g);
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    b17.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6)));
                    return;
                }
            }
        }
    }

    public boolean B() {
        java.lang.Object E = E(null);
        if (E == p3325xe03a0797.p3326xc267989b.s.f392113a) {
            return true;
        }
        if (E == null) {
            return false;
        }
        throw new java.lang.IllegalStateException(("Unexpected trySelectIdempotent result " + E).toString());
    }

    public java.lang.Object E(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var;
        while (true) {
            java.lang.Object obj = this.f72745xa8a72792;
            java.lang.Object obj2 = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392171a;
            l0Var = p3325xe03a0797.p3326xc267989b.s.f392113a;
            if (obj == obj2) {
                boolean z17 = false;
                if (qVar == null) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392168h;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, null)) {
                            z17 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z17) {
                        break;
                    }
                } else {
                    p3325xe03a0797.p3326xc267989b.p3331x75e76af7.c cVar = new p3325xe03a0797.p3326xc267989b.p3331x75e76af7.c(qVar);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f392168h;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, cVar)) {
                            z17 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z17) {
                        java.lang.Object c17 = cVar.c(this);
                        if (c17 != null) {
                            return c17;
                        }
                    }
                }
            } else {
                if (!(obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0)) {
                    if (qVar != null && obj == qVar.f392051c) {
                        return l0Var;
                    }
                    return null;
                }
                if (qVar != null) {
                    p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d a17 = qVar.a();
                    if ((a17 instanceof p3325xe03a0797.p3326xc267989b.p3331x75e76af7.a) && ((p3325xe03a0797.p3326xc267989b.p3331x75e76af7.a) a17).f392160b == this) {
                        throw new java.lang.IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    }
                    if (a17.b((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj)) {
                        return p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c.f392019b;
                    }
                }
                ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj).c(this);
            }
        }
        w();
        return l0Var;
    }

    @Override // qz5.e
    /* renamed from: getCallerFrame */
    public qz5.e mo144028x366976c() {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f392170g;
        if (interfaceC29045xdcb5ca57 instanceof qz5.e) {
            return (qz5.e) interfaceC29045xdcb5ca57;
        }
        return null;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return this.f392170g.mo48699x76847179();
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this.f72744x69bdc53c;
            java.lang.Object obj3 = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392173c;
            boolean z17 = false;
            if (obj2 == obj3) {
                java.lang.Object b17 = p3325xe03a0797.p3326xc267989b.i0.b(obj, null);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392169i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, b17)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            } else {
                pz5.a aVar = pz5.a.f440719d;
                if (obj2 != aVar) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f392169i;
                java.lang.Object obj4 = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392174d;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar, obj4)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != aVar) {
                        break;
                    }
                }
                if (z17) {
                    if (!p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(obj)) {
                        this.f392170g.mo48700xdecd0e93(obj);
                        return;
                    }
                    p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f392170g;
                    java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m143898xd4a2fc34);
                    interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(m143898xd4a2fc34)));
                    return;
                }
            }
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t
    /* renamed from: toString */
    public java.lang.String mo144017x9616526c() {
        return "SelectInstance(state=" + this.f72745xa8a72792 + ", result=" + this.f72744x69bdc53c + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r3.mo144008x63a5261f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0009, code lost:
    
        if (y() == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (n().i(r0, r2) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (y() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(p3325xe03a0797.p3326xc267989b.s1 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.selects.b r0 = new kotlinx.coroutines.selects.b
            r0.<init>(r3)
            boolean r1 = r2.y()
            if (r1 != 0) goto L1c
        Lb:
            kotlinx.coroutines.internal.t r1 = r2.n()
            boolean r1 = r1.i(r0, r2)
            if (r1 == 0) goto Lb
            boolean r0 = r2.y()
            if (r0 != 0) goto L1c
            return
        L1c:
            r3.mo144008x63a5261f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f.u(kotlinx.coroutines.s1):void");
    }

    public final void w() {
        p3325xe03a0797.p3326xc267989b.s1 s1Var = (p3325xe03a0797.p3326xc267989b.s1) this.f72743xae2f2551;
        if (s1Var != null) {
            s1Var.mo144008x63a5261f();
        }
        for (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) l(); !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar, this); tVar = tVar.m()) {
            if (tVar instanceof p3325xe03a0797.p3326xc267989b.p3331x75e76af7.b) {
                ((p3325xe03a0797.p3326xc267989b.p3331x75e76af7.b) tVar).f392163g.mo144008x63a5261f();
            }
        }
    }

    public final java.lang.Object x() {
        boolean z17;
        if (!y()) {
            oz5.l mo48699x76847179 = mo48699x76847179();
            int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) mo48699x76847179.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.s1 b17 = p3325xe03a0797.p3326xc267989b.p2.b(r2Var, true, false, new p3325xe03a0797.p3326xc267989b.p3331x75e76af7.d(this), 2, null);
                this.f72743xae2f2551 = b17;
                if (y()) {
                    b17.mo144008x63a5261f();
                }
            }
        }
        java.lang.Object obj = this.f72744x69bdc53c;
        java.lang.Object obj2 = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392173c;
        if (obj == obj2) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392169i;
            pz5.a aVar = pz5.a.f440719d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                return pz5.a.f440719d;
            }
            obj = this.f72744x69bdc53c;
        }
        if (obj == p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392174d) {
            throw new java.lang.IllegalStateException("Already resumed");
        }
        if (obj instanceof p3325xe03a0797.p3326xc267989b.e0) {
            throw ((p3325xe03a0797.p3326xc267989b.e0) obj).f391705a;
        }
        return obj;
    }

    public boolean y() {
        while (true) {
            java.lang.Object obj = this.f72745xa8a72792;
            if (obj == p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392171a) {
                return false;
            }
            if (!(obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0)) {
                return true;
            }
            ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj).c(this);
        }
    }

    public void z(long j17, yz5.l lVar) {
        if (j17 > 0) {
            u(p3325xe03a0797.p3326xc267989b.k1.d(mo48699x76847179()).v(j17, new p3325xe03a0797.p3326xc267989b.p3331x75e76af7.e(this, lVar), mo48699x76847179()));
            return;
        }
        if (B()) {
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(lVar, 1);
                java.lang.Object mo146xb9724478 = lVar.mo146xb9724478(this);
                if (mo146xb9724478 != pz5.a.f440719d) {
                    mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(mo146xb9724478));
                }
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6)));
            }
        }
    }
}
