package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class hd extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {
    public static boolean d0(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || v17.f430199i != 60) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionGroupLive.k(view.getContext(), null)) {
            return true;
        }
        try {
            ((w80.i) i95.n0.c(w80.i.class)).getClass();
            ((w80.i) i95.n0.c(w80.i.class)).getClass();
            if (!iq.b.g(dVar.g()) && !iq.b.C(dVar.g()) && !iq.b.v(dVar.g()) && !iq.b.e(dVar.g())) {
                no0.o oVar = (no0.o) v17.y(no0.o.class);
                long parseLong = java.lang.Long.parseLong(oVar.f420264b);
                java.lang.String str2 = oVar.f420265c;
                java.lang.String str3 = oVar.f420266d;
                en0.g gVar = new en0.g();
                gVar.f336779a = 1;
                gVar.f336783e = str3;
                gVar.f336780b = dVar.x();
                gVar.f336781c = parseLong;
                gVar.f336782d = str2;
                gVar.f336786h = 2;
                gVar.f336784f = str;
                gVar.a();
                if (str == null) {
                    str = dVar.u().d1();
                }
                p52.h.f433554f = str;
                n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
                long j17 = (int) dVar.u().E2;
                ((m30.m) rVar).getClass();
                p52.h.f433555g = b52.b.q(j17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorClickSysMsgEnterLive");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1381L, 0L, 1L);
                ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).Bi(parseLong, dVar.x(), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gd(dVar));
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppMsgShareLiveFrom", "jump to live fail: %s", e17.getMessage());
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean C() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570052vs);
        xgVar.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kd(xgVar, java.lang.Boolean.TRUE));
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean N() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return d0(view, dVar, f9Var, A(dVar, f9Var));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        if (g0Var instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kd) {
            ot0.q v17 = ot0.q.v(f9Var.U1());
            if (v17 != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kd) g0Var).f285857b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.String m17 = v17.m();
                ((ke0.e) xVar).getClass();
                c22624x85d69039.b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m17));
                long parseLong = java.lang.Long.parseLong(((no0.o) v17.y(no0.o.class)).f420264b);
                java.lang.String x17 = dVar.x();
                ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).Bi(parseLong, x17, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fd(this, parseLong, g0Var, dVar, x17));
            }
            g0Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), g0Var, null));
            g0Var.f39493x8ad70635.setOnClickListener(w(dVar));
            g0Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
            g0Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgShareLiveFrom", "filling");
    }
}
