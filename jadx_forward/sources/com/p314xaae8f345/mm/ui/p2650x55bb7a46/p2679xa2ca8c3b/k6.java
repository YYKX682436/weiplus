package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class k6 {
    public static void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6 h6Var, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (te5.e2.e(v17)) {
            com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e g17 = te5.e2.g(v17);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ca caVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ca();
            caVar.f271779a = g17;
            caVar.f271780b = dVar.x();
            caVar.f271781c = te5.e2.d(f9Var);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.q(dVar, h6Var.f285618f, caVar);
            h6Var.f285618f.setVisibility(0);
            h6Var.f285619g.setText(dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.epp, g17.f152795e));
            h6Var.f285620h.setImageResource(com.p314xaae8f345.mm.R.raw.f78484x5341c45);
            return;
        }
        if (v17 == null || (str = v17.f430179d) == null || str.isEmpty()) {
            h6Var.f285618f.setVisibility(8);
            return;
        }
        java.lang.String str3 = v17.f430179d;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        int i17 = v17.G;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m i18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(str3, i17);
        java.lang.String str4 = (i18 == null || (str2 = i18.f67372x453d1e07) == null || str2.trim().isEmpty()) ? v17.H : i18.f67372x453d1e07;
        if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.y(str4)) {
            h6Var.f285618f.setVisibility(8);
            return;
        }
        h6Var.f285618f.setVisibility(0);
        h6Var.f285619g.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), i18, str4));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.u(dVar, h6Var.f285620h, str3);
        if (i18 == null || !i18.k()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.r(dVar, h6Var.f285619g, str3);
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.p(dVar, h6Var.f285619g, f9Var, v17, i18.f67386xa1e9e82c, f9Var.I0());
        }
    }

    public static void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        if (c01.d9.b().E()) {
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppEmojClickListener", "exit in teen mode");
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(dVar.g());
                return;
            }
            java.lang.String x17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) ? dVar.x() : null;
            s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
            android.app.Activity g17 = dVar.g();
            ((y12.h) wi6).getClass();
            if (g17 != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.y4 y4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(f9Var.j());
                ot0.q v17 = ot0.q.v(f9Var.j());
                if (v17 == null) {
                    v17 = new ot0.q();
                    v17.f430231q = y4Var.f277889d;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(v17.f430231q);
                if (u17 == null || !u17.E0()) {
                    y12.h.G(f9Var.m124847x74d37ac6(), v17);
                } else if (f9Var.A0() == 1) {
                    y12.h.X(g17, v17.f430231q, v17.f430179d, v17.H, f9Var.I0(), f9Var.Q0(), f9Var.j(), x17);
                } else {
                    y12.h.X(g17, u17.mo42933xb5885648(), v17.f430179d, v17.H, f9Var.I0(), f9Var.Q0(), f9Var.j(), x17);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiMgrImpl", "context or msg is null");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11592, 0);
        }
    }
}
