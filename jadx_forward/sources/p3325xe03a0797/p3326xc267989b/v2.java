package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class v2 {
    public static p3325xe03a0797.p3326xc267989b.c0 a(p3325xe03a0797.p3326xc267989b.r2 r2Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            r2Var = null;
        }
        return new p3325xe03a0797.p3326xc267989b.u2(r2Var);
    }

    public static final void b(oz5.l lVar, java.util.concurrent.CancellationException cancellationException) {
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) lVar.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
        if (r2Var != null) {
            r2Var.b(cancellationException);
        }
    }

    public static /* synthetic */ void c(oz5.l lVar, java.util.concurrent.CancellationException cancellationException, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            cancellationException = null;
        }
        b(lVar, cancellationException);
    }

    public static final java.lang.Object d(p3325xe03a0797.p3326xc267989b.r2 r2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        java.lang.Object C = r2Var.C(interfaceC29045xdcb5ca57);
        return C == pz5.a.f440719d ? C : jz5.f0.f384359a;
    }

    public static void e(oz5.l lVar, java.util.concurrent.CancellationException cancellationException, int i17, java.lang.Object obj) {
        q26.n c17;
        if ((i17 & 1) != 0) {
            cancellationException = null;
        }
        int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) lVar.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
        if (r2Var == null || (c17 = r2Var.c()) == null) {
            return;
        }
        java.util.Iterator mo144672x467c086e = c17.mo144672x467c086e();
        while (mo144672x467c086e.hasNext()) {
            ((p3325xe03a0797.p3326xc267989b.r2) mo144672x467c086e.next()).b(cancellationException);
        }
    }

    public static final void f(oz5.l lVar) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) lVar.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
        if (r2Var != null && !r2Var.a()) {
            throw r2Var.x();
        }
    }

    public static final p3325xe03a0797.p3326xc267989b.r2 g(oz5.l lVar) {
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) lVar.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
        if (r2Var != null) {
            return r2Var;
        }
        throw new java.lang.IllegalStateException(("Current context doesn't contain Job in it: " + lVar).toString());
    }

    public static final boolean h(oz5.l lVar) {
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) lVar.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
        return r2Var != null && r2Var.a();
    }
}
