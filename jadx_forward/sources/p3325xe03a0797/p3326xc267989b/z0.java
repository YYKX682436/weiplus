package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class z0 {
    public static final p3325xe03a0797.p3326xc267989b.y0 a(oz5.l lVar) {
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        if (lVar.get(p3325xe03a0797.p3326xc267989b.q2.f392104d) == null) {
            lVar = lVar.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.v2.a(null, 1, null));
        }
        return new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h(lVar);
    }

    public static final p3325xe03a0797.p3326xc267989b.y0 b() {
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        return new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
    }

    public static final void c(p3325xe03a0797.p3326xc267989b.y0 y0Var, java.util.concurrent.CancellationException cancellationException) {
        oz5.l mo7786x54170f2d = y0Var.mo7786x54170f2d();
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) mo7786x54170f2d.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
        if (r2Var != null) {
            r2Var.b(cancellationException);
        } else {
            throw new java.lang.IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + y0Var).toString());
        }
    }

    public static void d(p3325xe03a0797.p3326xc267989b.y0 y0Var, java.lang.String str, java.lang.Throwable th6, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            th6 = null;
        }
        c(y0Var, p3325xe03a0797.p3326xc267989b.e2.a(str, th6));
    }

    public static /* synthetic */ void e(p3325xe03a0797.p3326xc267989b.y0 y0Var, java.util.concurrent.CancellationException cancellationException, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            cancellationException = null;
        }
        c(y0Var, cancellationException);
    }

    public static final java.lang.Object f(yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0 h0Var = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0(interfaceC29045xdcb5ca57.mo48699x76847179(), interfaceC29045xdcb5ca57);
        java.lang.Object b17 = w26.a.b(h0Var, h0Var, pVar);
        pz5.a aVar = pz5.a.f440719d;
        return b17;
    }

    public static final void g(p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        p3325xe03a0797.p3326xc267989b.v2.f(y0Var.mo7786x54170f2d());
    }

    public static final boolean h(p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        oz5.l mo7786x54170f2d = y0Var.mo7786x54170f2d();
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) mo7786x54170f2d.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
        if (r2Var != null) {
            return r2Var.a();
        }
        return true;
    }

    public static final p3325xe03a0797.p3326xc267989b.y0 i(p3325xe03a0797.p3326xc267989b.y0 y0Var, oz5.l lVar) {
        return new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h(y0Var.mo7786x54170f2d().mo7096x348d9a(lVar));
    }
}
