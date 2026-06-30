package ze5;

/* loaded from: classes9.dex */
public final class o {
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final z01.c a(ze5.o oVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        oVar.getClass();
        z01.c cVar = new z01.c();
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return new z01.c();
        }
        l15.c cVar2 = new l15.c();
        cVar2.m126728xdc93280d(U1);
        v05.b k17 = cVar2.k();
        if (k17 == null) {
            return new z01.c();
        }
        cVar.f550491d = k17.m75945x2fec8307(k17.f449898d + 2);
        int i17 = k17.f513848e;
        cVar.f550494g = (s05.d) k17.m75936x14adae67(i17 + 39);
        cVar.f550495h = (v05.a) k17.m75936x14adae67(i17 + 8);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        cVar.f550492e = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
        cVar.f550493f = k17.m75945x2fec8307(i17 + 12);
        cVar.f550502r = new ze5.g(dVar, f9Var);
        cVar.f550503s = new ze5.h(dVar, f9Var);
        return cVar;
    }

    public static final boolean b(ze5.o oVar, db5.g4 g4Var, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        oVar.getClass();
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126728xdc93280d(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String m75945x2fec8307 = k17.m75945x2fec8307(k17.f449898d + 0);
        ((kt.c) i0Var).getClass();
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(m75945x2fec8307, false, false)) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.k(f9Var) && !c01.ia.x(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.j(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.D(f9Var)) {
            g4Var.c(d17, 111, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        g4Var.c(d17, 116, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        if (!((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).Ai(f9Var)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            am.b6 b6Var = c5348xb8e1a564.f135674g;
            b6Var.f87752a = m124847x74d37ac6;
            b6Var.f87753b = f9Var.Q0();
            c5348xb8e1a564.e();
            if (c5348xb8e1a564.f135675h.f87869a) {
                g4Var.c(d17, 129, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3x), com.p314xaae8f345.mm.R.raw.f79841xc8521962);
            }
        }
        if (c01.ia.A(f9Var)) {
            g4Var.clear();
        }
        if ((f9Var.K1() || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, dVar) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !dVar.A()) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        if (!dVar.F()) {
            g4Var.c(d17, 100, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    public static final boolean c(ze5.o oVar, android.view.MenuItem menuItem, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        oVar.getClass();
        if (menuItem.getItemId() != 111) {
            return false;
        }
        ze5.i iVar = new ze5.i(dVar, f9Var);
        android.app.Activity g17 = dVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(f9Var, g17, iVar);
        return true;
    }
}
