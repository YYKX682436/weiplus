package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class qk extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f286909s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sk f286910t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rk f286911u;

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
        java.lang.String str;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        if (f9Var.C2() && c01.d9.b().E()) {
            int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 M = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).M(f9Var);
            if (M == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.ChattingItemEmojiToBase", "emoji is null. md5:%s", f9Var.z0());
                return true;
            }
            boolean z17 = ((uh4.c0) i95.n0.c(uh4.c0.class)).ag() != 1;
            boolean E0 = M.E0();
            if (M.I1() || M.v0()) {
                str = "emoji file no exist. cannot save or resend.";
            } else if (E0) {
                str = "emoji file no exist. cannot save or resend.";
                g4Var.c(d17, 104, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572403b41), com.p314xaae8f345.mm.R.raw.f79628x9c0b0a94);
            } else {
                str = "emoji file no exist. cannot save or resend.";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.ChattingItemEmojiToBase", str);
            }
            if (!M.I1()) {
                if (E0) {
                    g4Var.c(d17, 113, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.ChattingItemEmojiToBase", str);
                }
            }
            java.lang.String x17 = this.f286909s.x();
            z75.c.f552155a = java.lang.System.currentTimeMillis();
            z75.c.f552156b = M;
            z75.c.f552157c = x17;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc c6828xd0e163fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc();
            c6828xd0e163fc.f141486d = z75.c.f552155a;
            c6828xd0e163fc.f141487e = 1L;
            c6828xd0e163fc.r(M.f68663x861009b5);
            c6828xd0e163fc.q(M.mo42933xb5885648());
            c6828xd0e163fc.p(x17);
            c6828xd0e163fc.k();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.B(1257L, 1L);
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_similar_emoji, true);
            if (!z17 && !M.k() && (view.getContext() instanceof android.app.Activity) && view.getContext().getResources().getConfiguration().orientation == 1 && fj6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.ChattingItemEmojiToBase", "menu add similar emoji item.");
                g4Var.c(d17, 115, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572405b43), com.p314xaae8f345.mm.R.raw.f79843x92fdd345);
            }
            if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).H(M)) {
                g4Var.c(d17, 135, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3t), com.p314xaae8f345.mm.R.raw.f79795x40f0fd77);
            }
            if (!z17) {
                java.lang.String str2 = M.f68663x861009b5;
                if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, "capture")) ? false : true) && !M.k() && !M.v0()) {
                    g4Var.c(d17, 128, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572404b42), com.p314xaae8f345.mm.R.raw.f79916xfbf250d5);
                }
            }
            if (!f9Var.t2() && f9Var.C2() && ((f9Var.K1() || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f286909s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()))) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
            }
            if (!this.f286909s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3n), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
            if (f9Var.P0() == 5) {
                g4Var.c(d17, 103, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5i), com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3);
            }
            g0Var.d(12789, 0, M.mo42933xb5885648(), 0, M.f68657xb76d85ab, M.f68663x861009b5, "", "", "", "", "", M.f68641x3342accf);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        f9Var.m78015x9dfe85a();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.da) ((sb5.o0) dVar.f542241c.a(sb5.o0.class))).o0(f9Var);
    }
}
