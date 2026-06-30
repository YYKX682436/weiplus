package p3325xe03a0797.p3326xc267989b.p3332x361a9b;

/* loaded from: classes14.dex */
public final class k implements p3325xe03a0797.p3326xc267989b.p3332x361a9b.d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392189a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3332x361a9b.k.class, java.lang.Object.class, "_state");

    /* renamed from: _state */
    volatile /* synthetic */ java.lang.Object f72749xa8a72792;

    public k(boolean z17) {
        this.f72749xa8a72792 = z17 ? p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392193d : p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392194e;
    }

    public boolean a() {
        while (true) {
            java.lang.Object obj = this.f72749xa8a72792;
            if (obj instanceof p3325xe03a0797.p3326xc267989b.p3332x361a9b.b) {
                return ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.b) obj).f392179a != p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392192c;
            }
            if (obj instanceof p3325xe03a0797.p3326xc267989b.p3332x361a9b.h) {
                return true;
            }
            if (!(obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0)) {
                throw new java.lang.IllegalStateException(("Illegal state " + obj).toString());
            }
            ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj).c(this);
        }
    }

    public java.lang.Object b(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean c17 = c(obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (c17) {
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.r a17 = p3325xe03a0797.p3326xc267989b.t.a(pz5.f.b(interfaceC29045xdcb5ca57));
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.f fVar = new p3325xe03a0797.p3326xc267989b.p3332x361a9b.f(this, obj, a17);
        while (true) {
            java.lang.Object obj2 = this.f72749xa8a72792;
            boolean z17 = false;
            if (obj2 instanceof p3325xe03a0797.p3326xc267989b.p3332x361a9b.b) {
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.b bVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.b) obj2;
                if (bVar.f392179a != p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392192c) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392189a;
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.h hVar = new p3325xe03a0797.p3326xc267989b.p3332x361a9b.h(bVar.f392179a);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, hVar) && atomicReferenceFieldUpdater.get(this) == obj2) {
                    }
                } else {
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.b bVar2 = obj == null ? p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392193d : new p3325xe03a0797.p3326xc267989b.p3332x361a9b.b(obj);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f392189a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, bVar2)) {
                            z17 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z17) {
                        a17.s(f0Var, new p3325xe03a0797.p3326xc267989b.p3332x361a9b.j(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof p3325xe03a0797.p3326xc267989b.p3332x361a9b.h) {
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.h hVar2 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.h) obj2;
                if (!(hVar2.f72748x653f2b3 != obj)) {
                    throw new java.lang.IllegalStateException(("Already locked by " + obj).toString());
                }
                do {
                } while (!hVar2.n().i(fVar, hVar2));
                if (this.f72749xa8a72792 == obj2 || !p3325xe03a0797.p3326xc267989b.p3332x361a9b.g.f392184h.compareAndSet(fVar, 0, 1)) {
                    break;
                }
                fVar = new p3325xe03a0797.p3326xc267989b.p3332x361a9b.f(this, obj, a17);
            } else {
                if (!(obj2 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj2).c(this);
            }
        }
        a17.m(new p3325xe03a0797.p3326xc267989b.m3(fVar));
        java.lang.Object j17 = a17.j();
        pz5.a aVar = pz5.a.f440719d;
        if (j17 != aVar) {
            j17 = f0Var;
        }
        return j17 == aVar ? j17 : f0Var;
    }

    public boolean c(java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this.f72749xa8a72792;
            boolean z17 = false;
            if (obj2 instanceof p3325xe03a0797.p3326xc267989b.p3332x361a9b.b) {
                if (((p3325xe03a0797.p3326xc267989b.p3332x361a9b.b) obj2).f392179a != p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392192c) {
                    return false;
                }
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.b bVar = obj == null ? p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392193d : new p3325xe03a0797.p3326xc267989b.p3332x361a9b.b(obj);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392189a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar)) {
                        z17 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (z17) {
                    return true;
                }
            } else {
                if (obj2 instanceof p3325xe03a0797.p3326xc267989b.p3332x361a9b.h) {
                    if (((p3325xe03a0797.p3326xc267989b.p3332x361a9b.h) obj2).f72748x653f2b3 != obj) {
                        return false;
                    }
                    throw new java.lang.IllegalStateException(("Already locked by " + obj).toString());
                }
                if (!(obj2 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj2).c(this);
            }
        }
    }

    public void d(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar;
        while (true) {
            java.lang.Object obj2 = this.f72749xa8a72792;
            boolean z17 = true;
            if (obj2 instanceof p3325xe03a0797.p3326xc267989b.p3332x361a9b.b) {
                if (obj == null) {
                    if (!(((p3325xe03a0797.p3326xc267989b.p3332x361a9b.b) obj2).f392179a != p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392192c)) {
                        throw new java.lang.IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.b bVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.b) obj2;
                    if (!(bVar.f392179a == obj)) {
                        throw new java.lang.IllegalStateException(("Mutex is locked by " + bVar.f392179a + " but expected " + obj).toString());
                    }
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392189a;
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.b bVar2 = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392194e;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            } else if (obj2 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) {
                ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj2).c(this);
            } else {
                if (!(obj2 instanceof p3325xe03a0797.p3326xc267989b.p3332x361a9b.h)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj2).toString());
                }
                if (obj != null) {
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.h hVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.h) obj2;
                    if (!(hVar.f72748x653f2b3 == obj)) {
                        throw new java.lang.IllegalStateException(("Mutex is locked by " + hVar.f72748x653f2b3 + " but expected " + obj).toString());
                    }
                }
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.h hVar2 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.h) obj2;
                while (true) {
                    tVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) hVar2.l();
                    if (tVar == hVar2) {
                        tVar = null;
                        break;
                    } else if (tVar.q()) {
                        break;
                    } else {
                        ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) tVar.l()).f392026a.o();
                    }
                }
                if (tVar == null) {
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.i iVar = new p3325xe03a0797.p3326xc267989b.p3332x361a9b.i(hVar2);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f392189a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, iVar)) {
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17 && iVar.c(this) == null) {
                        return;
                    }
                } else {
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.g gVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.g) tVar;
                    if (gVar.w()) {
                        java.lang.Object obj3 = gVar.f392185g;
                        if (obj3 == null) {
                            obj3 = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392191b;
                        }
                        hVar2.f72748x653f2b3 = obj3;
                        gVar.u();
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m144113x9616526c() {
        while (true) {
            java.lang.Object obj = this.f72749xa8a72792;
            if (obj instanceof p3325xe03a0797.p3326xc267989b.p3332x361a9b.b) {
                return "Mutex[" + ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.b) obj).f392179a + ']';
            }
            if (!(obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0)) {
                if (!(obj instanceof p3325xe03a0797.p3326xc267989b.p3332x361a9b.h)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj).toString());
                }
                return "Mutex[" + ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.h) obj).f72748x653f2b3 + ']';
            }
            ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj).c(this);
        }
    }
}
