package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class i6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285699s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f285700t = false;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g6 f285701u;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570027ut);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6 h6Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6();
        h6Var.a(xgVar, true);
        xgVar.setTag(h6Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.da) ((sb5.o0) dVar.f542241c.a(sb5.o0.class))).n0(menuItem, dVar, dVar2.f475787d.f526833b);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
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
                java.lang.String x17 = this.f285699s.x();
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
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgEmojiFrom", "menu add similar emoji item.");
                    g4Var.c(d17, 115, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572405b43), com.p314xaae8f345.mm.R.raw.f79843x92fdd345);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12789, 0, N.mo42933xb5885648(), 0, N.f68657xb76d85ab, N.f68663x861009b5, "", "", "", "", N.f68641x3342accf);
                if (!N.E0() || c01.ia.x(f9Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgEmojiFrom", "emoji file no exist. cannot save or resend.");
                } else {
                    g4Var.c(d17, 113, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
                }
                if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).H(N)) {
                    g4Var.c(d17, 135, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3t), com.p314xaae8f345.mm.R.raw.f79795x40f0fd77);
                }
            }
        }
        if (c01.ia.A(f9Var)) {
            g4Var.clear();
        }
        if (!this.f285699s.F()) {
            g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3n), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean c0(yb5.d dVar) {
        return dVar.D();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        java.lang.String str;
        wd5.b bVar = new wd5.b();
        java.lang.String j17 = f9Var != null ? f9Var.j() : null;
        if (!(j17 == null || j17.length() == 0)) {
            r15.b bVar2 = new r15.b();
            bVar2.m126728xdc93280d(j17);
            bVar.k(bVar2.n());
        }
        if (qVar == null || (str = qVar.f542275a) == null) {
            str = "";
        }
        return new ze5.l6(bVar, lf5.g.c(bVar, str));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f285699s = dVar;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7) ((sb5.e0) dVar.f542241c.a(sb5.e0.class))).n0(f9Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6 h6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = (v17 == null || v17.f430231q == null) ? null : ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(v17.f430231q);
        if (N == null || !N.E0()) {
            java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true);
            android.graphics.Bitmap e17 = n11.a.b().e(mj6);
            if (e17 == null || e17.isRecycled()) {
                e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(mj6, null);
                n11.a.b().o(mj6, e17);
            }
            h6Var.f285616d.setVisibility(0);
            h6Var.f285615c.setVisibility(8);
            h6Var.f285617e.setText(x51.t1.a(v17 == null ? 0L : v17.f430215m));
            h6Var.f285617e.setVisibility(0);
            h6Var.f285616d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77980x51b1fd7e);
            if (v17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430231q)) {
                ((java.util.HashMap) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6.f285613i).put(v17.f430231q, new java.lang.ref.WeakReference(h6Var));
            }
            if (e17 == null || e17.isRecycled()) {
                e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(this.f285699s.s().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bg8));
            }
            h6Var.f285614b.m75583xd44890a8(e17);
        } else {
            N.D2 = f9Var.Q0();
            h6Var.f285614b.b(N, f9Var.m124847x74d37ac6(), N.k() && bm5.d1.d(f9Var.m124847x74d37ac6(), f9Var.Q0()));
            h6Var.f285616d.setVisibility(8);
            h6Var.f285615c.setVisibility(8);
            h6Var.f285617e.setVisibility(8);
            h6Var.f285616d.setVisibility(8);
            if (v17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430231q)) {
                ((java.util.HashMap) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6.f285613i).remove(v17.f430231q);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5319xe090f3c7 c5319xe090f3c7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5319xe090f3c7();
            c5319xe090f3c7.f135634g.f88933a = N;
            N.D2 = f9Var.Q0();
            c5319xe090f3c7.e();
        }
        h6Var.f285614b.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), h6Var, str));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 c19694xdfd03243 = h6Var.f285614b;
        if (this.f285701u == null) {
            this.f285701u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g6(dVar);
        }
        c19694xdfd03243.setOnClickListener(this.f285701u);
        h6Var.f285614b.setOnLongClickListener(u(dVar));
        h6Var.f285614b.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
        android.widget.ImageView imageView = h6Var.f285616d;
        if (this.f285701u == null) {
            this.f285701u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g6(dVar);
        }
        imageView.setOnClickListener(this.f285701u);
        h6Var.f285616d.setOnLongClickListener(u(dVar));
        h6Var.f285616d.setTag(h6Var.f285614b.getTag());
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.f179066a;
        boolean booleanValue = java.lang.Boolean.valueOf(java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_emoticon_app_msg_auto_download_android, false)).booleanValue() || java.lang.Boolean.valueOf(bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2528x5c28046.C20134x5a6d1859()) == 1).booleanValue()).booleanValue();
        if (!this.f285700t && booleanValue) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.y4 y4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(f9Var.j());
            ot0.q v18 = ot0.q.v(f9Var.j());
            if (v18 == null) {
                v18 = new ot0.q();
                v18.f430231q = y4Var.f277889d;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(v18.f430231q);
            if (u17 == null || !u17.E0()) {
                y12.h.G(f9Var.m124847x74d37ac6(), v18);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiMgrImpl", "no need to download emoji");
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k6.a(f9Var, this, dVar, h6Var, true);
        ze5.l6 l6Var = (ze5.l6) f9Var.f275460g2;
        lf5.f.f400067a.a(dVar, f9Var, h6Var, this, l6Var.f553603d, l6Var.f553604e);
    }
}
