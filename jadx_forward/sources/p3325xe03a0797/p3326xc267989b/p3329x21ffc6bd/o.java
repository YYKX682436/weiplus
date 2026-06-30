package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public abstract class o extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b {
    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b
    public final java.lang.Object a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d dVar) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar;
        boolean z17;
        while (true) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r rVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r) this;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar2 = rVar.f392055b;
            while (true) {
                java.lang.Object obj = tVar2.f72720x56e43d2;
                if (!(obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0)) {
                    tVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) obj;
                    break;
                }
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0 e0Var = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj;
                if (dVar.b(e0Var)) {
                    tVar = null;
                    break;
                }
                e0Var.c(rVar.f392055b);
            }
            java.lang.Object obj2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c.f392019b;
            if (tVar == null) {
                return obj2;
            }
            java.lang.Object obj3 = tVar.f72720x56e43d2;
            if (obj3 == dVar || dVar.h()) {
                return null;
            }
            if (obj3 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) {
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0 e0Var2 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj3;
                if (dVar.b(e0Var2)) {
                    return obj2;
                }
                e0Var2.c(tVar);
            } else {
                java.lang.Object b17 = b(tVar);
                if (b17 != null) {
                    return b17;
                }
                boolean z18 = false;
                if (obj3 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) {
                    ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) obj3).f392026a.o();
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    continue;
                } else {
                    p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q(tVar, (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) obj3, this);
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(tVar, obj3, qVar)) {
                            z18 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(tVar) != obj3) {
                            break;
                        }
                    }
                    if (z18) {
                        try {
                            if (qVar.c(tVar) != p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.u.f392061a) {
                                return null;
                            }
                        } catch (java.lang.Throwable th6) {
                            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
                            while (!atomicReferenceFieldUpdater2.compareAndSet(tVar, qVar, obj3) && atomicReferenceFieldUpdater2.get(tVar) == qVar) {
                            }
                            throw th6;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public abstract java.lang.Object b(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar);

    public abstract void c(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar);

    public abstract p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t d();

    public abstract p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t e();

    public java.lang.Object f(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar) {
        c(qVar);
        return null;
    }

    public void g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar) {
    }
}
