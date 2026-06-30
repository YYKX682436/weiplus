package ze5;

/* loaded from: classes9.dex */
public final class h1 {
    public h1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17;
        if (f9Var == null || dVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.p959x883644fd.b.d(f9Var, com.p314xaae8f345.mm.p959x883644fd.a.Click, dVar.f542255q, dVar.k());
        android.app.Activity g17 = dVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        if (te5.t.b(f9Var, g17)) {
            return false;
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()))) == null) {
            return false;
        }
        ot0.o0 a17 = ot0.o0.a(j17);
        ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).Zi(f9Var.m124847x74d37ac6(), f9Var.Q0(), 4);
        int i17 = a17.f430150b;
        if (i17 != 0) {
            v17.f430199i = i17;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f430179d;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
        java.lang.String t17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.t(dVar, f9Var);
        if (t17 == null) {
            t17 = "";
        }
        java.lang.String str2 = t17;
        if (j18 != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.e(dVar, v17, str2, j18, f9Var.I0(), dVar.x());
        }
        sc5.g gVar = sc5.g.f488105a;
        android.app.Activity g18 = dVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getContext(...)");
        java.lang.String str3 = dVar.f542255q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getSessionConv(...)");
        gVar.f(g18, f9Var, new sc5.h(str3));
        return true;
    }
}
