package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class l7 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285936s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean C() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570076wk);
        xgVar.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.m7(xgVar, java.lang.Boolean.TRUE));
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
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
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f285936s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !this.f285936s.A()) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r45.g92 g92Var;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || v17.f430199i != 65) {
            return false;
        }
        try {
            zy2.b bVar = (zy2.b) v17.y(zy2.b.class);
            if (bVar != null && (g92Var = bVar.f558883b) != null) {
                long Z = pm0.v.Z(g92Var.m75945x2fec8307(2));
                long Z2 = pm0.v.Z(g92Var.m75945x2fec8307(0));
                try {
                    java.lang.String A = A(dVar, f9Var);
                    if (A == null) {
                        A = dVar.u().d1();
                    }
                    p52.h.f433554f = A;
                    n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
                    long j17 = (int) dVar.u().E2;
                    ((m30.m) rVar).getClass();
                    p52.h.f433555g = b52.b.q(j17);
                    new android.content.Intent().putExtra("KEY_PARAMS_SOURCE_TYPE", g92Var.m75939xb282bd08(15));
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).oj(null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, Z, java.lang.Long.valueOf(Z2), g92Var.m75945x2fec8307(12), g92Var.m75945x2fec8307(4), "", "", "");
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppMsgLiveInviteTo", "jump to live fail: %s", e.getMessage());
                    return true;
                }
            }
            return true;
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        zy2.b bVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f285936s = dVar;
        if (g0Var instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.m7) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.m7 m7Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.m7) g0Var;
            ot0.q v17 = ot0.q.v(f9Var.U1());
            if (v17 != null && (bVar = (zy2.b) v17.y(zy2.b.class)) != null) {
                r45.g92 g92Var = bVar.f558883b;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = m7Var.f286097b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                java.lang.String m75945x2fec8307 = g92Var.m75945x2fec8307(3);
                ((ke0.e) xVar).getClass();
                c22624x85d69039.b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, m75945x2fec8307));
                if (g92Var.m75945x2fec8307(5) != null) {
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    vo0.d e17 = g1Var.e();
                    vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
                    java.lang.String m75945x2fec83072 = g92Var.m75945x2fec8307(5);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    e17.c(((c61.i8) i5Var).Ai(m75945x2fec83072, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), m7Var.f286098c, g1Var.h(mn2.f1.f411496q));
                }
            }
            g0Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), g0Var, null));
            g0Var.f39493x8ad70635.setOnClickListener(w(dVar));
            g0Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
            g0Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgLiveInviteTo", "filling");
    }
}
