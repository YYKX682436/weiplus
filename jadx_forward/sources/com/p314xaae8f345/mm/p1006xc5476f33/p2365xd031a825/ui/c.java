package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class c implements t25.a, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f261688n = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.f573824fy2) + "/touch/product/wechatpay_app.html?scene_id=kf594";

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f261689d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f261690e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f261691f;

    /* renamed from: g, reason: collision with root package name */
    public int f261692g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f261693h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f261694i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f261695m;

    public c(android.content.Context context) {
        this.f261689d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        this.f261691f = rVar;
        this.f261690e = z3Var;
        this.f261692g = i17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576394a5);
        this.f261693h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_wxpay_business_collection_top");
        this.f261694i = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_wxpay_business_collection_not_disturb");
        a();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "handleEvent key:%s", str);
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_business_collection_go_to", str);
        android.content.Context context = this.f261689d;
        if (D0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", this.f261690e.d1());
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_business_collection_top", str)) {
            if (this.f261693h.N()) {
                c01.e2.t0(this.f261690e.d1(), true, true);
                return false;
            }
            c01.e2.B0(this.f261690e.d1(), true, true);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_business_collection_not_disturb", str)) {
            if (this.f261694i.N()) {
                c01.e2.p0(this.f261690e, true);
                return false;
            }
            c01.e2.z0(this.f261690e, true);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_business_collection_help", str)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(context, f261688n, true);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_business_collection_clear_data", str)) {
            android.content.Context context2 = this.f261689d;
            db5.e1.A(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a(this), null);
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_business_collection_install", str)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_business_collection_uninstall", str)) {
                return false;
            }
            db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b(this), null);
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwq), true, true, null);
        this.f261695m = Q;
        Q.show();
        gm0.j1.d().a(30, this);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("gh_e087bb5b95e6");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(java.lang.Integer.valueOf(this.f261692g));
        gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).wi(1, linkedList, linkedList2, "", ""));
        return false;
    }

    public final void a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).h("contact_info_header_helper");
        c19708x15855336.M(this.f261690e.d1(), this.f261690e.g2(), this.f261689d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bjm));
        if (!this.f261690e.r2()) {
            c19708x15855336.N(0);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_install", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_uninstall", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_go_to", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_top", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_not_disturb", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_help", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_clear_data", true);
            return;
        }
        c19708x15855336.N(1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_install", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_uninstall", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_go_to", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_top", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_not_disturb", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_help", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261691f).m("contact_info_wxpay_business_collection_clear_data", false);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f261690e.d1())) {
            this.f261693h.O(true);
        } else {
            this.f261693h.O(false);
        }
        if (c01.e2.P(this.f261690e)) {
            this.f261694i.O(true);
        } else {
            this.f261694i.O(false);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        if (m1Var instanceof ns.l) {
            gm0.j1.d().q(30, this);
            if (i17 == 0 && i18 == 0) {
                java.lang.String J2 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) m1Var)).J();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "bind fitness contact %s success", J2);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_e087bb5b95e6", true);
                if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "respUsername == " + J2 + ", contact = " + n17);
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "addContact : insert contact failed");
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i17 == 4 && i18 == -24 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f261695m;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            a();
        }
    }
}
