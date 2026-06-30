package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class j6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285766s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g6 f285767t;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570070wd);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6 h6Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6();
        h6Var.a(xgVar, false);
        xgVar.setTag(h6Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.da) ((sb5.o0) dVar.f542241c.a(sb5.o0.class))).n0(menuItem, dVar, dVar2.f475787d.f526833b);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        if (c01.d9.b().E()) {
            int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
            com.p314xaae8f345.mm.p2621x8fb0427b.y4 y4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(f9Var.j());
            ot0.q v17 = ot0.q.v(f9Var.U1());
            if (v17 == null) {
                v17 = new ot0.q();
                v17.f430231q = y4Var.f277889d;
            }
            if (!x51.t1.b(v17.f430231q) && !v17.f430231q.equals("-1")) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(v17.f430231q);
                if (N != null) {
                    if (!N.I1()) {
                        g4Var.c(d17, 104, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572403b41), com.p314xaae8f345.mm.R.raw.f79628x9c0b0a94);
                    }
                    boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
                    java.lang.String x17 = this.f285766s.x();
                    z75.c.f552155a = java.lang.System.currentTimeMillis();
                    z75.c.f552156b = N;
                    z75.c.f552157c = x17;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc c6828xd0e163fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc();
                    c6828xd0e163fc.f141486d = z75.c.f552155a;
                    c6828xd0e163fc.f141487e = 1L;
                    c6828xd0e163fc.r(N.f68663x861009b5);
                    c6828xd0e163fc.q(N.mo42933xb5885648());
                    c6828xd0e163fc.p(x17);
                    c6828xd0e163fc.k();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 1L);
                    boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_similar_emoji, true);
                    if (!mo168058x74219ae7 && (view.getContext() instanceof android.app.Activity) && view.getContext().getResources().getConfiguration().orientation == 1 && fj6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgEmojiTo", "menu add similar emoji item.");
                        g4Var.c(d17, 115, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572405b43), com.p314xaae8f345.mm.R.raw.f79843x92fdd345);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12789, 0, N.mo42933xb5885648(), 0, N.f68657xb76d85ab, N.f68663x861009b5, "", "", "", "", N.f68641x3342accf);
                    if (N.E0()) {
                        g4Var.c(d17, 113, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgEmojiTo", "emoji file no exist. cannot save or resend.");
                    }
                    if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).H(N)) {
                        g4Var.c(d17, 135, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3t), com.p314xaae8f345.mm.R.raw.f79795x40f0fd77);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgEmojiTo", "emoji is null. app content md5 is :%s", v17.f430231q);
                }
            }
            if (f9Var.P0() == 5) {
                g4Var.c(d17, 103, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5i), com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3);
            }
            if (!f9Var.t2() && f9Var.m2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f285766s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()))) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
            }
            if (!this.f285766s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3n), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.k2()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(f9Var);
            c01.w9.f(f9Var.m124847x74d37ac6(), f9Var.Q0());
            dVar.L(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        ot0.q qVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f285766s = dVar;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7) ((sb5.e0) dVar.f542241c.a(sb5.e0.class))).n0(f9Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6 h6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6) g0Var;
        if (f9Var != null) {
            java.lang.String U1 = f9Var.U1();
            com.p314xaae8f345.mm.p2621x8fb0427b.y4 y4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(f9Var.j());
            if (y4Var.f277888c) {
                qVar = null;
                c21053xdbf1e5f4 = null;
            } else {
                qVar = U1 != null ? ot0.q.v(U1) : null;
                c21053xdbf1e5f4 = qVar != null ? ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(qVar.f430231q) : null;
            }
            java.lang.String str2 = y4Var.f277889d;
            if (str2 != null && !str2.equals("-1") && c21053xdbf1e5f4 == null) {
                c21053xdbf1e5f4 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(str2);
            }
            if (c21053xdbf1e5f4 == null || !c21053xdbf1e5f4.E0()) {
                java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true);
                android.graphics.Bitmap e17 = n11.a.b().e(mj6);
                if (e17 == null || e17.isRecycled()) {
                    e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(mj6, null);
                    n11.a.b().o(mj6, e17);
                }
                Z(h6Var, false, true);
                h6Var.f285616d.setVisibility(0);
                h6Var.f285615c.setVisibility(8);
                h6Var.f285617e.setText(x51.t1.a(qVar == null ? 0L : qVar.f430215m));
                h6Var.f285617e.setVisibility(0);
                h6Var.f285616d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77980x51b1fd7e);
                if (e17 == null || e17.isRecycled()) {
                    e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(this.f285766s.s().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bg8));
                }
                h6Var.f285614b.m75583xd44890a8(e17);
                if (qVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430231q)) {
                    ((java.util.HashMap) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6.f285613i).put(qVar.f430231q, new java.lang.ref.WeakReference(h6Var));
                }
            } else {
                c21053xdbf1e5f4.D2 = f9Var.Q0();
                h6Var.f285614b.b(c21053xdbf1e5f4, f9Var.m124847x74d37ac6(), c21053xdbf1e5f4.k() && bm5.d1.d(f9Var.m124847x74d37ac6(), f9Var.Q0()));
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19690x7f5eb045 c19690x7f5eb045 = h6Var.f285614b.f272359m;
                if (c19690x7f5eb045 != null) {
                    c19690x7f5eb045.m64933xc84dc82d();
                }
                Z(h6Var, !(f9Var.P0() != 1), true);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5319xe090f3c7 c5319xe090f3c7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5319xe090f3c7();
                c5319xe090f3c7.f135634g.f88933a = c21053xdbf1e5f4;
                c21053xdbf1e5f4.D2 = f9Var.Q0();
                c5319xe090f3c7.e();
            }
            h6Var.f285614b.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), h6Var, dVar.t()));
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 c19694xdfd03243 = h6Var.f285614b;
            if (this.f285767t == null) {
                this.f285767t = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g6(dVar);
            }
            c19694xdfd03243.setOnClickListener(this.f285767t);
            h6Var.f285614b.setOnLongClickListener(u(dVar));
            h6Var.f285614b.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
            V(h6Var, dVar2, dVar.t(), dVar.D(), dVar, this);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k6.a(f9Var, this, dVar, h6Var, false);
        }
    }
}
