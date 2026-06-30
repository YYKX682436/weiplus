package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class k implements t25.a, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f261897d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f261898e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f261899f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f261900g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f261901h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f261902i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f261903m = new java.util.ArrayList();

    public k(android.content.Context context) {
        this.f261897d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        this.f261899f = rVar;
        this.f261898e = z3Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576395a6);
        this.f261900g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_wxpay_collection_top");
        this.f261901h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_wxpay_collection_not_disturb");
        e();
        r45.pm3 pm3Var = new r45.pm3();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_REVEIVE_PLUGIN_CONFIG_STRING_SYNC, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "etReceiptAssisPluginResponse failed");
        } else {
            try {
                pm3Var.mo11468x92b714fd(str.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxPay.ContactWidgetWxPayCollection", "parseConfig exp, " + e17.getLocalizedMessage());
            }
        }
        d(pm3Var);
        gm0.j1.d().a(2860, this);
        gm0.j1.d().g(new ss4.l());
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "handleEvent key:%s", str);
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_collection_go_to", str);
        android.content.Context context = this.f261897d;
        if (D0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", this.f261898e.d1());
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            a(3);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_collection_top", str)) {
            if (this.f261900g.N()) {
                c01.e2.t0(this.f261898e.d1(), true, true);
                a(4);
            } else {
                c01.e2.B0(this.f261898e.d1(), true, true);
                a(5);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_collection_not_disturb", str)) {
            if (this.f261901h.N()) {
                c01.e2.p0(this.f261898e, true);
                a(6);
            } else {
                c01.e2.z0(this.f261898e, true);
                a(7);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_collection_help", str)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0("gh_106decc2eec5@app", "/pages/product/productInfo/product.html?code=A4075&producttitle=收款小账本&scene_id=kf5662", 0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.d0.f34984x366c91de);
            a(8);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_collection_clear_data", str)) {
            android.content.Context context2 = this.f261897d;
            db5.e1.A(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e(this), null);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_collection_install", str)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwq), true, true, null);
            this.f261902i = Q;
            Q.show();
            gm0.j1.d().a(30, this);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("gh_f0a92aa7146c");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(1);
            gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).wi(1, linkedList, linkedList2, "", ""));
            com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
            rv.q2 q2Var = (rv.q2) i95.n0.c(rv.q2.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j(this);
            ((qv.i) q2Var).getClass();
            r1Var.g(new r01.k3(jVar));
            a(11);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_collection_uninstall", str)) {
            db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f(this), null);
        }
        return false;
    }

    public final void a(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7125x7accbcbc c7125x7accbcbc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7125x7accbcbc();
        c7125x7accbcbc.f144428d = i17;
        c7125x7accbcbc.k();
    }

    public final void b() {
        java.util.List list = this.f261903m;
        if (list == null || ((java.util.ArrayList) list).size() <= 0) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).v((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) it.next());
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).notifyDataSetChanged();
        ((java.util.ArrayList) list).clear();
    }

    public final void c(r45.pm3 pm3Var) {
        java.lang.String str;
        r45.yj6 yj6Var;
        java.util.LinkedList linkedList;
        if (pm3Var != null && (yj6Var = pm3Var.f464711d) != null && (linkedList = yj6Var.f472693e) != null && !linkedList.isEmpty()) {
            try {
                str = new java.lang.String(pm3Var.mo14344x5f01b1f6(), com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "save config exp, " + e17.getLocalizedMessage());
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_REVEIVE_PLUGIN_CONFIG_STRING_SYNC, str);
            gm0.j1.i();
            gm0.j1.u().c().i(true);
        }
        str = " ";
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_REVEIVE_PLUGIN_CONFIG_STRING_SYNC, str);
        gm0.j1.i();
        gm0.j1.u().c().i(true);
    }

    public final void d(r45.pm3 pm3Var) {
        r45.yj6 yj6Var;
        java.util.LinkedList linkedList;
        if (!this.f261898e.r2()) {
            b();
            return;
        }
        b();
        if (pm3Var == null || (yj6Var = pm3Var.f464711d) == null || (linkedList = yj6Var.f472693e) == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "NetSceneGetPayPlugin no data");
            return;
        }
        int n17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).n("contact_info_wxpay_collection_go_to");
        java.util.Iterator it = pm3Var.f464711d.f472693e.iterator();
        while (it.hasNext()) {
            r45.e14 e14Var = (r45.e14) it.next();
            if (e14Var.f454437e.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "ItemSectionViewData is null");
            } else {
                n17++;
                android.content.Context context = this.f261897d;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea c21567x4b9b05ea = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(context, null);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).d(c21567x4b9b05ea, n17);
                java.util.List list = this.f261903m;
                ((java.util.ArrayList) list).add(c21567x4b9b05ea);
                java.util.Iterator it6 = e14Var.f454437e.iterator();
                while (it6.hasNext()) {
                    r45.xj6 xj6Var = (r45.xj6) it6.next();
                    if (!xj6Var.f471700e.isEmpty()) {
                        java.util.LinkedList linkedList2 = xj6Var.f471701f;
                        if (!linkedList2.isEmpty()) {
                            r45.rl6 rl6Var = (r45.rl6) xj6Var.f471700e.get(0);
                            r45.rl6 rl6Var2 = (r45.rl6) linkedList2.get(0);
                            r45.yt5 yt5Var = xj6Var.f471706n;
                            if (!rl6Var.f466520d.isEmpty()) {
                                java.util.LinkedList linkedList3 = rl6Var.f466520d;
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.hl6) linkedList3.get(0)).f457806f) && yt5Var != null) {
                                    n17++;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.h(this, context);
                                    hVar.L(((r45.hl6) linkedList3.get(0)).f457806f);
                                    hVar.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
                                    if (!rl6Var2.f466520d.isEmpty()) {
                                        java.util.LinkedList linkedList4 = rl6Var2.f466520d;
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.hl6) linkedList4.get(0)).f457806f)) {
                                            hVar.H(((r45.hl6) linkedList4.get(0)).f457806f);
                                        }
                                    }
                                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).d(hVar, n17);
                                    ((java.util.ArrayList) list).add(hVar);
                                    hVar.f279305f = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i(this, rl6Var, yt5Var);
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "TableCellViewData inner data null");
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "TableCellViewData data null");
                }
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).notifyDataSetChanged();
    }

    public final void e() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).h("contact_info_header_helper");
        c19708x15855336.M(this.f261898e.d1(), this.f261898e.g2(), this.f261897d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bjr));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "contact.getUsername():%s", this.f261898e.d1());
        if (!this.f261898e.r2()) {
            c19708x15855336.N(0);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_install", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_uninstall", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_go_to", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_top", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_not_disturb", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_help", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_clear_data", true);
            return;
        }
        c19708x15855336.N(1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_install", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_uninstall", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_go_to", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_top", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_not_disturb", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_help", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261899f).m("contact_info_wxpay_collection_clear_data", false);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f261898e.d1())) {
            this.f261900g.O(true);
        } else {
            this.f261900g.O(false);
        }
        if (c01.e2.P(this.f261898e)) {
            this.f261901h.O(true);
        } else {
            this.f261901h.O(false);
        }
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        qk.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        if (!(m1Var instanceof ns.l)) {
            if (m1Var instanceof ss4.l) {
                gm0.j1.d().q(2860, this);
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "NetSceneGetPayPlugin fail!");
                    return;
                }
                r45.pm3 pm3Var = ((ss4.l) m1Var).f493620f;
                if (pm3Var == null) {
                    pm3Var = new r45.pm3();
                }
                d(pm3Var);
                c(pm3Var);
                return;
            }
            return;
        }
        gm0.j1.d().q(30, this);
        if (i17 == 0 && i18 == 0) {
            java.lang.String J2 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) m1Var)).J();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "bind fitness contact %s success", J2);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_f0a92aa7146c", true);
            if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "respUsername == " + J2 + ", contact = " + n17);
            } else {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(n17.d1())) {
                    java.lang.String d17 = n17.d1();
                    if (d17 == null) {
                        d17 = "";
                    }
                    ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
                    oVar = r01.z.b(d17);
                    if (oVar != null) {
                        oVar.f66748xdec927b = J2;
                    }
                    ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).wi(d17);
                    n17.K1(d17);
                } else {
                    oVar = null;
                }
                n17.X1(J2);
                if (((int) n17.E2) == 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n17);
                }
                if (((int) n17.E2) <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "addContact : insert contact failed");
                } else {
                    c01.e2.m0(n17);
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n17.d1(), true);
                    if (oVar != null) {
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(oVar);
                    } else {
                        rv.v2 v2Var = (rv.v2) i95.n0.c(rv.v2.class);
                        java.lang.String d18 = n18.d1();
                        ((qv.q) v2Var).getClass();
                        qk.o b17 = r01.z.b(d18);
                        if (b17 == null || b17.U0()) {
                            c01.n8.a().c(n18.d1(), 4);
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                        } else if (n18.X4()) {
                            c01.n8.a().c(n18.d1(), 4);
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                        }
                    }
                }
            }
            rv.v2 v2Var2 = (rv.v2) i95.n0.c(rv.v2.class);
            java.lang.String d19 = n17.d1();
            ((qv.q) v2Var2).getClass();
            qk.o b18 = r01.z.b(d19);
            if (b18 != null) {
                ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(b18);
            }
            gm0.j1.u().c().w(327825, java.lang.Boolean.TRUE);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (i17 == 4 && i18 == -24 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f261902i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        e();
    }
}
