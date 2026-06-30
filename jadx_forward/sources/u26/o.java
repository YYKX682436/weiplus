package u26;

/* loaded from: classes14.dex */
public abstract class o implements u26.y0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f505713f = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(u26.o.class, java.lang.Object.class, "onCloseHandler");

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f505714d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.m f505715e = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.m();

    /* renamed from: onCloseHandler */
    private volatile /* synthetic */ java.lang.Object f76831x4e6175b1 = null;

    public o(yz5.l lVar) {
        this.f505714d = lVar;
    }

    public static final void a(u26.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.Object obj, u26.e0 e0Var) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.v0 a17;
        oVar.o(e0Var);
        java.lang.Throwable th6 = e0Var.f505681g;
        if (th6 == null) {
            th6 = new u26.g0("Channel was closed");
        }
        yz5.l lVar = oVar.f505714d;
        if (lVar == null || (a17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d0.a(lVar, obj, null)) == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6)));
        } else {
            jz5.a.a(a17, th6);
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(a17)));
        }
    }

    public java.lang.Object c(u26.w0 w0Var) {
        boolean z17;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t n17;
        boolean p17 = p();
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = this.f505715e;
        if (!p17) {
            u26.n nVar = new u26.n(w0Var, this);
            while (true) {
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t n18 = tVar.n();
                if (!(n18 instanceof u26.u0)) {
                    int t17 = n18.t(w0Var, tVar, nVar);
                    z17 = true;
                    if (t17 != 1) {
                        if (t17 == 2) {
                            z17 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    return n18;
                }
            }
            if (z17) {
                return null;
            }
            return u26.l.f505703e;
        }
        do {
            n17 = tVar.n();
            if (n17 instanceof u26.u0) {
                return n17;
            }
        } while (!n17.i(w0Var, tVar));
        return null;
    }

    @Override // u26.y0
    public final java.lang.Object e(java.lang.Object obj) {
        u26.a0 a0Var;
        java.lang.Object u17 = u(obj);
        if (u17 == u26.l.f505700b) {
            return jz5.f0.f384359a;
        }
        if (u17 == u26.l.f505701c) {
            u26.e0 l17 = l();
            if (l17 == null) {
                return u26.c0.f505673b;
            }
            o(l17);
            java.lang.Throwable th6 = l17.f505681g;
            if (th6 == null) {
                th6 = new u26.g0("Channel was closed");
            }
            a0Var = new u26.a0(th6);
        } else {
            if (!(u17 instanceof u26.e0)) {
                throw new java.lang.IllegalStateException(("trySend returned " + u17).toString());
            }
            u26.e0 e0Var = (u26.e0) u17;
            o(e0Var);
            java.lang.Throwable th7 = e0Var.f505681g;
            if (th7 == null) {
                th7 = new u26.g0("Channel was closed");
            }
            a0Var = new u26.a0(th7);
        }
        return a0Var;
    }

    public java.lang.String f() {
        return "";
    }

    @Override // u26.y0
    public final boolean j() {
        return l() != null;
    }

    public final u26.e0 k() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t m17 = this.f505715e.m();
        u26.e0 e0Var = m17 instanceof u26.e0 ? (u26.e0) m17 : null;
        if (e0Var == null) {
            return null;
        }
        o(e0Var);
        return e0Var;
    }

    public final u26.e0 l() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t n17 = this.f505715e.n();
        u26.e0 e0Var = n17 instanceof u26.e0 ? (u26.e0) n17 : null;
        if (e0Var == null) {
            return null;
        }
        o(e0Var);
        return e0Var;
    }

    @Override // u26.y0
    public void n(yz5.l lVar) {
        boolean z17;
        boolean z18;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f505713f;
        while (true) {
            z17 = false;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                z18 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                z18 = false;
                break;
            }
        }
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = u26.l.f505704f;
        if (!z18) {
            java.lang.Object obj = this.f76831x4e6175b1;
            if (obj == l0Var) {
                throw new java.lang.IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new java.lang.IllegalStateException("Another handler was already registered: " + obj);
        }
        u26.e0 l17 = l();
        if (l17 != null) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f505713f;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, lVar, l0Var)) {
                    z17 = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(this) != lVar) {
                    break;
                }
            }
            if (z17) {
                lVar.mo146xb9724478(l17.f505681g);
            }
        }
    }

    public final void o(u26.e0 e0Var) {
        java.lang.Object obj = null;
        while (true) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t n17 = e0Var.n();
            u26.s0 s0Var = n17 instanceof u26.s0 ? (u26.s0) n17 : null;
            if (s0Var == null) {
                break;
            } else if (s0Var.q()) {
                obj = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.j.a(obj, s0Var);
            } else {
                ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) s0Var.l()).f392026a.o();
            }
        }
        if (obj != null) {
            if (!(obj instanceof java.util.ArrayList)) {
                ((u26.s0) obj).w(e0Var);
                return;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((u26.s0) arrayList.get(size)).w(e0Var);
            }
        }
    }

    @Override // u26.y0
    /* renamed from: offer */
    public boolean mo167482x64c1a5c(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.v0 a17;
        try {
            java.lang.Object e17 = e(obj);
            if (!(e17 instanceof u26.b0)) {
                return true;
            }
            java.lang.Throwable a18 = u26.c0.a(e17);
            if (a18 == null) {
                return false;
            }
            int i17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.k0.f392040a;
            throw a18;
        } catch (java.lang.Throwable th6) {
            yz5.l lVar = this.f505714d;
            if (lVar == null || (a17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d0.a(lVar, obj, null)) == null) {
                throw th6;
            }
            jz5.a.a(a17, th6);
            throw a17;
        }
    }

    public abstract boolean p();

    public abstract boolean q();

    @Override // u26.y0
    public boolean s(java.lang.Throwable th6) {
        boolean z17;
        boolean z18;
        java.lang.Object obj;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var;
        u26.e0 e0Var = new u26.e0(th6);
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = this.f505715e;
        while (true) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t n17 = tVar.n();
            z17 = false;
            if (!(!(n17 instanceof u26.e0))) {
                z18 = false;
                break;
            }
            if (n17.i(e0Var, tVar)) {
                z18 = true;
                break;
            }
        }
        if (!z18) {
            e0Var = (u26.e0) this.f505715e.n();
        }
        o(e0Var);
        if (z18 && (obj = this.f76831x4e6175b1) != null && obj != (l0Var = u26.l.f505704f)) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f505713f;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, l0Var)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(obj, 1);
                ((yz5.l) obj).mo146xb9724478(th6);
            }
        }
        return z18;
    }

    @Override // u26.y0
    public final java.lang.Object t(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object u17 = u(obj);
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = u26.l.f505700b;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (u17 == l0Var) {
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.r a17 = p3325xe03a0797.p3326xc267989b.t.a(pz5.f.b(interfaceC29045xdcb5ca57));
        while (true) {
            if (!(this.f505715e.m() instanceof u26.u0) && q()) {
                yz5.l lVar = this.f505714d;
                u26.z0 z0Var = lVar == null ? new u26.z0(obj, a17) : new u26.a1(obj, a17, lVar);
                java.lang.Object c17 = c(z0Var);
                if (c17 == null) {
                    a17.m(new p3325xe03a0797.p3326xc267989b.m3(z0Var));
                    break;
                }
                if (c17 instanceof u26.e0) {
                    a(this, a17, obj, (u26.e0) c17);
                    break;
                }
                if (c17 != u26.l.f505703e && !(c17 instanceof u26.s0)) {
                    throw new java.lang.IllegalStateException(("enqueueSend returned " + c17).toString());
                }
            }
            java.lang.Object u18 = u(obj);
            if (u18 == l0Var) {
                a17.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
                break;
            }
            if (u18 != u26.l.f505701c) {
                if (!(u18 instanceof u26.e0)) {
                    throw new java.lang.IllegalStateException(("offerInternal returned " + u18).toString());
                }
                a(this, a17, obj, (u26.e0) u18);
            }
        }
        java.lang.Object j17 = a17.j();
        pz5.a aVar = pz5.a.f440719d;
        if (j17 != aVar) {
            j17 = f0Var;
        }
        return j17 == aVar ? j17 : f0Var;
    }

    /* renamed from: toString */
    public java.lang.String m167483x9616526c() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(getClass().getSimpleName());
        sb6.append('@');
        sb6.append(p3325xe03a0797.p3326xc267989b.c1.a(this));
        sb6.append('{');
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = this.f505715e;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t m17 = tVar.m();
        if (m17 == tVar) {
            str2 = "EmptyQueue";
        } else {
            if (m17 instanceof u26.e0) {
                str = m17.mo144017x9616526c();
            } else if (m17 instanceof u26.s0) {
                str = "ReceiveQueued";
            } else if (m17 instanceof u26.w0) {
                str = "SendQueued";
            } else {
                str = "UNEXPECTED:" + m17;
            }
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t n17 = tVar.n();
            if (n17 != m17) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str);
                sb7.append(",queueSize=");
                int i17 = 0;
                for (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar2 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) tVar.l(); !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar2, tVar); tVar2 = tVar2.m()) {
                    if (tVar2 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) {
                        i17++;
                    }
                }
                sb7.append(i17);
                str2 = sb7.toString();
                if (n17 instanceof u26.e0) {
                    str2 = str2 + ",closedForSend=" + n17;
                }
            } else {
                str2 = str;
            }
        }
        sb6.append(str2);
        sb6.append('}');
        sb6.append(f());
        return sb6.toString();
    }

    public java.lang.Object u(java.lang.Object obj) {
        u26.u0 v17;
        do {
            v17 = v();
            if (v17 == null) {
                return u26.l.f505701c;
            }
        } while (v17.h(obj, null) == null);
        v17.g(obj);
        return v17.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.t] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public u26.u0 v() {
        ?? r17;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t r18;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.m mVar = this.f505715e;
        while (true) {
            r17 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) mVar.l();
            if (r17 != mVar && (r17 instanceof u26.u0)) {
                if (((((u26.u0) r17) instanceof u26.e0) && !r17.p()) || (r18 = r17.r()) == null) {
                    break;
                }
                r18.o();
            }
        }
        r17 = 0;
        return (u26.u0) r17;
    }

    public final u26.w0 w() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t r17;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.m mVar = this.f505715e;
        while (true) {
            tVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) mVar.l();
            if (tVar != mVar && (tVar instanceof u26.w0)) {
                if (((((u26.w0) tVar) instanceof u26.e0) && !tVar.p()) || (r17 = tVar.r()) == null) {
                    break;
                }
                r17.o();
            }
        }
        tVar = null;
        return (u26.w0) tVar;
    }
}
