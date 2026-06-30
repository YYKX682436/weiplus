package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class j10 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 f216333d;

    public j10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 t10Var) {
        this.f216333d = t10Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        in5.s0 s0Var;
        db5.g4 g4Var2;
        java.lang.Object obj;
        java.lang.Object obj2;
        char c17;
        java.lang.Integer num;
        int i17;
        int i18;
        r45.th2 m76969xfc80dfc;
        java.lang.Object obj3;
        long j17;
        java.lang.String str;
        g4Var.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 t10Var = this.f216333d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = t10Var.f217492e;
        if (abstractC14490x69736cb5 == null || (s0Var = t10Var.f217494g) == null) {
            return;
        }
        java.lang.String e17 = xy2.c.e(t10Var.m80379x76847179());
        sc2.a9 a9Var = new sc2.a9();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "getCreateSecondMoreMenuListener: username=" + e17 + ", feedId=" + pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        y4Var.g(t10Var.m80379x76847179(), g4Var, abstractC14490x69736cb5);
        y4Var.t(t10Var.m80379x76847179(), g4Var, abstractC14490x69736cb5);
        y4Var.y(t10Var.m80379x76847179(), abstractC14490x69736cb5, g4Var, null, 200);
        y4Var.x(t10Var.m80379x76847179(), abstractC14490x69736cb5, g4Var);
        a9Var.a(g4Var, t10Var.m80379x76847179(), 204, 203, abstractC14490x69736cb5.getFeedObject().m59292xa80c944c() != 0);
        boolean E = hc2.o0.E(abstractC14490x69736cb5.getFeedObject().getFeedObject(), false, 1, null);
        android.content.Context context = s0Var.f374654e;
        if (!E) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            zy2.g8 g8Var = (zy2.g8) pf5.z.f435481a.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).d(zy2.g8.class);
            if (g8Var != null && ((te2.e4) g8Var).f499507d != null) {
                java.lang.String m76836x6c03c64c = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76836x6c03c64c();
                if (m76836x6c03c64c == null) {
                    m76836x6c03c64c = "";
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a.d(m76836x6c03c64c) != null) {
                    android.app.Activity context2 = t10Var.m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                    if (abstractC14490x69736cb5.getFeedObject().m59313x393b9a10()) {
                        g4Var.g(124, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2u), com.p314xaae8f345.mm.R.raw.f79585x47ce13bf);
                    } else {
                        g4Var.g(123, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2s), com.p314xaae8f345.mm.R.raw.f79584xb1f4638f);
                    }
                }
            }
        }
        so2.u1 u1Var = abstractC14490x69736cb5 instanceof so2.u1 ? (so2.u1) abstractC14490x69736cb5 : null;
        if (u1Var != null && u1Var.i2()) {
            if (hc2.o0.g(abstractC14490x69736cb5.getFeedObject().getFeedObject()) && y4Var.c0(t10Var.m80379x76847179())) {
                g4Var.g(304, t10Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyt), com.p314xaae8f345.mm.R.raw.f78720xdc0b46be);
            } else {
                g4Var.g(303, t10Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyx), com.p314xaae8f345.mm.R.raw.f78725x84d17fa6);
            }
        }
        if (abstractC14490x69736cb5.getFeedObject().m59202xa288bdf7()) {
            if (abstractC14490x69736cb5.getFeedObject().m59201x2d62da25()) {
                g4Var.g(322, t10Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2_), com.p314xaae8f345.mm.R.raw.f78744x2541c641);
            } else {
                g4Var.g(321, t10Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2b), com.p314xaae8f345.mm.R.raw.f78745xab141a43);
            }
        }
        r45.dm2 m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
        if (pm0.v.A(m76806xdef68064 != null ? m76806xdef68064.m75942xfb822ef2(30) : 0L, 1024L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "hasLiveCommentButton");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject = abstractC14490x69736cb5.getFeedObject().getFeedObject();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
            r45.dm2 m76806xdef680642 = finderObject.m76806xdef68064();
            if (m76806xdef680642 != null) {
                j17 = m76806xdef680642.m75942xfb822ef2(30);
                obj3 = "finder_context_id";
            } else {
                obj3 = "finder_context_id";
                j17 = 0;
            }
            boolean z17 = pm0.v.A(j17, 2048L) && y4Var.c0(t10Var.m80379x76847179());
            if (z17) {
                g4Var2 = g4Var;
                g4Var2.g(311, t10Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_q), com.p314xaae8f345.mm.R.raw.f79583x19dfdaa7);
            } else {
                g4Var2 = g4Var;
                g4Var2.g(310, t10Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_s), com.p314xaae8f345.mm.R.raw.f79586x5a6e2e70);
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("view_id", "forward_menu_live_comment");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(context);
            if (e18 != null) {
                str = e18.f216915p;
                obj = "view_id";
            } else {
                obj = "view_id";
                str = null;
            }
            obj2 = obj3;
            lVarArr[1] = new jz5.l(obj2, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(context);
            lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f216919r : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(context);
            lVarArr[3] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f216913n) : null);
            lVarArr[4] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
            lVarArr[5] = new jz5.l("live_commen_state", java.lang.Integer.valueOf(z17 ? 2 : 1));
            ((cy1.a) rVar).Ej("view_exp", kz5.c1.k(lVarArr), 25496);
        } else {
            g4Var2 = g4Var;
            obj = "view_id";
            obj2 = "finder_context_id";
        }
        y4Var.H(t10Var.m80379x76847179(), abstractC14490x69736cb5, g4Var2);
        if (hc2.t.d(t10Var.m80379x76847179())) {
            g4Var2.g(217, t10Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nl7), com.p314xaae8f345.mm.R.raw.f78717xa61df6fa);
        } else {
            y4Var.d(t10Var.m80379x76847179(), abstractC14490x69736cb5, g4Var2);
        }
        java.lang.Object obj4 = obj;
        java.lang.Object obj5 = obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.u(y4Var, g4Var, t10Var.m80379x76847179(), abstractC14490x69736cb5.getFeedObject().getMediaType(), 206, 205, abstractC14490x69736cb5.getFeedObject().m59278x9c961f1e() == 1, false, 64, null);
        android.app.Activity context3 = t10Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
        java.lang.String u17 = pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84());
        if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PROMOTION_SWITCH_BOOLEAN_SYNC, false)) {
            int color = context3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
            int color2 = context3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
            boolean m59209x2943ec5a = abstractC14490x69736cb5.getFeedObject().m59209x2943ec5a();
            java.lang.String string = m59209x2943ec5a ? context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mrw) : context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            g4Var.i(212, string, color, m59209x2943ec5a ? com.p314xaae8f345.mm.R.raw.f79572x10307be9 : com.p314xaae8f345.mm.R.raw.f80135xeaaf1bf8, color2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMenuUtil", "[addIncreasePopularityMenu] feeId:" + u17 + " no permission");
        }
        y4Var.a(t10Var.m80379x76847179(), g4Var2, abstractC14490x69736cb5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = t10Var.f217495h;
        if ((k8Var != null && k8Var.d0()) || ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.D9).mo141623x754a37bb()).r()).booleanValue()) {
            android.app.Activity context4 = t10Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context4, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            g4Var2.g(125, context4.getResources().getString(((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Se).mo141623x754a37bb()).r()).booleanValue() ? com.p314xaae8f345.mm.R.C30867xcad56011.ded : com.p314xaae8f345.mm.R.C30867xcad56011.mrq), com.p314xaae8f345.mm.R.raw.f80073xebd34502);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context4 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr2 = new jz5.l[6];
            lVarArr2[0] = new jz5.l(obj4, "forward_menu_administration");
            lVarArr2[1] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
            if (V6 != null) {
                c17 = 5;
                num = java.lang.Integer.valueOf(V6.m75939xb282bd08(5));
            } else {
                c17 = 5;
                num = null;
            }
            jz5.l lVar = new jz5.l("comment_scene", num);
            i17 = 2;
            lVarArr2[2] = lVar;
            i18 = 3;
            lVarArr2[3] = new jz5.l("selfUin", java.lang.Long.valueOf(new kk.v(gm0.j1.b().h()).longValue()));
            lVarArr2[4] = new jz5.l(obj5, V6 != null ? V6.m75945x2fec8307(1) : null);
            lVarArr2[c17] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
            ((cy1.a) rVar2).Ej("view_exp", kz5.c1.k(lVarArr2), 25496);
        } else {
            i17 = 2;
            i18 = 3;
        }
        android.app.Activity context5 = t10Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context5, "context");
        java.lang.String u18 = pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76802x2dd01666();
        if (m76802x2dd01666 != null && (m76969xfc80dfc = m76802x2dd01666.m76969xfc80dfc()) != null) {
            if (m76969xfc80dfc.m75939xb282bd08(i18) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMenuUtil", "[addModFeedMenu] feeId:" + u18 + " not displayed");
            } else {
                g4Var.i(214, context5.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o1p), context5.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833), com.p314xaae8f345.mm.R.raw.f80260xbff7a06d, m76969xfc80dfc.m75939xb282bd08(i18) == i17 ? context5.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832) : context5.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            }
        }
        g4Var2.b(108, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0, com.p314xaae8f345.mm.R.raw.f80075x444ae503);
        y4Var.b(t10Var.m80379x76847179(), abstractC14490x69736cb5, g4Var2);
        y4Var.r(t10Var.m80379x76847179(), abstractC14490x69736cb5, g4Var2);
        y4Var.p(t10Var.m80379x76847179(), abstractC14490x69736cb5, g4Var2);
        y4Var.e(t10Var.m80379x76847179(), abstractC14490x69736cb5, g4Var2);
        y4Var.j(t10Var.m80379x76847179(), abstractC14490x69736cb5, g4Var2);
        y4Var.f(t10Var.m80379x76847179(), abstractC14490x69736cb5, g4Var2);
        y4Var.n(t10Var.m80379x76847179(), g4Var2, abstractC14490x69736cb5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a.b(g4Var2);
        if (g4Var.z()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uj ujVar = t10Var.f217491d;
            android.widget.TextView textView = ujVar != null ? ujVar.f214729o : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uj ujVar2 = t10Var.f217491d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = ujVar2 != null ? ujVar2.f214723i : null;
            if (c1163xf1deaba4 == null) {
                return;
            }
            c1163xf1deaba4.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uj ujVar3 = t10Var.f217491d;
        android.widget.TextView textView2 = ujVar3 != null ? ujVar3.f214729o : null;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uj ujVar4 = t10Var.f217491d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = ujVar4 != null ? ujVar4.f214723i : null;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10.O6(t10Var, g4Var2);
    }
}
