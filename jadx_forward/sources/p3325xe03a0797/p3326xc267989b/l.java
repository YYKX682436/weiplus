package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class l {
    public static final p3325xe03a0797.p3326xc267989b.f1 a(p3325xe03a0797.p3326xc267989b.y0 y0Var, oz5.l lVar, p3325xe03a0797.p3326xc267989b.a1 a1Var, yz5.p pVar) {
        oz5.l b17 = p3325xe03a0797.p3326xc267989b.m0.b(y0Var, lVar);
        a1Var.getClass();
        p3325xe03a0797.p3326xc267989b.g1 e3Var = a1Var == p3325xe03a0797.p3326xc267989b.a1.LAZY ? new p3325xe03a0797.p3326xc267989b.e3(b17, pVar) : new p3325xe03a0797.p3326xc267989b.g1(b17, true);
        e3Var.j0(a1Var, e3Var, pVar);
        return e3Var;
    }

    public static /* synthetic */ p3325xe03a0797.p3326xc267989b.f1 b(p3325xe03a0797.p3326xc267989b.y0 y0Var, oz5.l lVar, p3325xe03a0797.p3326xc267989b.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f431862d;
        }
        if ((i17 & 2) != 0) {
            a1Var = p3325xe03a0797.p3326xc267989b.a1.DEFAULT;
        }
        return a(y0Var, lVar, a1Var, pVar);
    }

    public static final p3325xe03a0797.p3326xc267989b.r2 c(p3325xe03a0797.p3326xc267989b.y0 y0Var, oz5.l lVar, p3325xe03a0797.p3326xc267989b.a1 a1Var, yz5.p pVar) {
        oz5.l b17 = p3325xe03a0797.p3326xc267989b.m0.b(y0Var, lVar);
        a1Var.getClass();
        p3325xe03a0797.p3326xc267989b.r3 f3Var = a1Var == p3325xe03a0797.p3326xc267989b.a1.LAZY ? new p3325xe03a0797.p3326xc267989b.f3(b17, pVar) : new p3325xe03a0797.p3326xc267989b.r3(b17, true);
        f3Var.j0(a1Var, f3Var, pVar);
        return f3Var;
    }

    public static /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 d(p3325xe03a0797.p3326xc267989b.y0 y0Var, oz5.l lVar, p3325xe03a0797.p3326xc267989b.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f431862d;
        }
        if ((i17 & 2) != 0) {
            a1Var = p3325xe03a0797.p3326xc267989b.a1.DEFAULT;
        }
        return c(y0Var, lVar, a1Var, pVar);
    }

    public static final java.lang.Object e(oz5.l lVar, yz5.p pVar) {
        p3325xe03a0797.p3326xc267989b.w1 w1Var;
        oz5.l a17;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        oz5.j jVar = oz5.e.f431860d;
        oz5.f fVar = (oz5.f) lVar.get(jVar);
        oz5.m mVar = oz5.m.f431862d;
        if (fVar == null) {
            w1Var = p3325xe03a0797.p3326xc267989b.v3.f392217a.a();
            a17 = p3325xe03a0797.p3326xc267989b.m0.a(mVar, lVar.mo7096x348d9a(w1Var), true);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            if (a17 != p0Var && a17.get(jVar) == null) {
                a17 = a17.mo7096x348d9a(p0Var);
            }
        } else {
            if (fVar instanceof p3325xe03a0797.p3326xc267989b.w1) {
            }
            w1Var = (p3325xe03a0797.p3326xc267989b.w1) p3325xe03a0797.p3326xc267989b.v3.f392218b.get();
            a17 = p3325xe03a0797.p3326xc267989b.m0.a(mVar, lVar, true);
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            if (a17 != p0Var2 && a17.get(jVar) == null) {
                a17 = a17.mo7096x348d9a(p0Var2);
            }
        }
        p3325xe03a0797.p3326xc267989b.j jVar2 = new p3325xe03a0797.p3326xc267989b.j(a17, currentThread, w1Var);
        jVar2.j0(p3325xe03a0797.p3326xc267989b.a1.DEFAULT, jVar2, pVar);
        p3325xe03a0797.p3326xc267989b.w1 w1Var2 = jVar2.f392076g;
        if (w1Var2 != null) {
            int i17 = p3325xe03a0797.p3326xc267989b.w1.f392219h;
            w1Var2.N(false);
        }
        while (!java.lang.Thread.interrupted()) {
            try {
                long P = w1Var2 != null ? w1Var2.P() : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
                if (jVar2.A()) {
                    java.lang.Object a18 = p3325xe03a0797.p3326xc267989b.d3.a(jVar2.P());
                    p3325xe03a0797.p3326xc267989b.e0 e0Var = a18 instanceof p3325xe03a0797.p3326xc267989b.e0 ? (p3325xe03a0797.p3326xc267989b.e0) a18 : null;
                    if (e0Var == null) {
                        return a18;
                    }
                    throw e0Var.f391705a;
                }
                java.util.concurrent.locks.LockSupport.parkNanos(jVar2, P);
            } finally {
                if (w1Var2 != null) {
                    int i18 = p3325xe03a0797.p3326xc267989b.w1.f392219h;
                    w1Var2.K(false);
                }
            }
        }
        java.lang.InterruptedException interruptedException = new java.lang.InterruptedException();
        jVar2.y(interruptedException);
        throw interruptedException;
    }

    public static /* synthetic */ java.lang.Object f(oz5.l lVar, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f431862d;
        }
        return e(lVar, pVar);
    }

    public static final java.lang.Object g(oz5.l lVar, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object k07;
        oz5.l mo48699x76847179 = interfaceC29045xdcb5ca57.mo48699x76847179();
        oz5.l mo7096x348d9a = !((java.lang.Boolean) lVar.mo7093x300c01(java.lang.Boolean.FALSE, p3325xe03a0797.p3326xc267989b.l0.f392083d)).booleanValue() ? mo48699x76847179.mo7096x348d9a(lVar) : p3325xe03a0797.p3326xc267989b.m0.a(mo48699x76847179, lVar, false);
        p3325xe03a0797.p3326xc267989b.v2.f(mo7096x348d9a);
        if (mo7096x348d9a == mo48699x76847179) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0 h0Var = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0(mo7096x348d9a, interfaceC29045xdcb5ca57);
            k07 = w26.a.b(h0Var, h0Var, pVar);
        } else {
            oz5.e eVar = oz5.e.f431860d;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo7096x348d9a.get(eVar), mo48699x76847179.get(eVar))) {
                p3325xe03a0797.p3326xc267989b.c4 c4Var = new p3325xe03a0797.p3326xc267989b.c4(mo7096x348d9a, interfaceC29045xdcb5ca57);
                java.lang.Object c17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.c(mo7096x348d9a, null);
                try {
                    java.lang.Object b17 = w26.a.b(c4Var, c4Var, pVar);
                    p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.a(mo7096x348d9a, c17);
                    k07 = b17;
                } catch (java.lang.Throwable th6) {
                    p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.a(mo7096x348d9a, c17);
                    throw th6;
                }
            } else {
                p3325xe03a0797.p3326xc267989b.m1 m1Var = new p3325xe03a0797.p3326xc267989b.m1(mo7096x348d9a, interfaceC29045xdcb5ca57);
                try {
                    p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 b18 = pz5.f.b(pz5.f.a(pVar, m1Var, m1Var));
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.i.a(b18, p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a), null);
                    k07 = m1Var.k0();
                } catch (java.lang.Throwable th7) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m1Var.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7)));
                    throw th7;
                }
            }
        }
        pz5.a aVar = pz5.a.f440719d;
        return k07;
    }
}
