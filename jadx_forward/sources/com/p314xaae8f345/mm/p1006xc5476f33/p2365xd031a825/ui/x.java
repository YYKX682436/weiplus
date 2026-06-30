package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class x implements t25.a, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f262308n = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.f573824fy2) + "/touch/scene_product.html?scene_id=kf1";

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f262309d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f262310e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f262311f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f262312g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f262313h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f262314i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f262315m;

    public x(android.content.Context context) {
        this.f262309d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        this.f262311f = rVar;
        this.f262310e = z3Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576397a8);
        this.f262312g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_wxpay_notify_top");
        this.f262313h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_wxpay_notify_not_disturb");
        b();
        gm0.j1.d().a(1820, this);
        gm0.j1.d().g(new ss4.j());
        android.content.Context context = this.f262309d;
        if (!(context instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b)) {
            return true;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b) context).m79332x89f3bfad().getLayoutParams().height = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b) context).m79332x89f3bfad().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cyi);
        android.view.View m79332x89f3bfad = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b) context).m79332x89f3bfad();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m79332x89f3bfad, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayNotify", "onAttach", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/storage/Contact;ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m79332x89f3bfad.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m79332x89f3bfad, "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayNotify", "onAttach", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/storage/Contact;ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "handleEvent key:%s", str);
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_notify_go_to", str);
        android.content.Context context = this.f262309d;
        if (D0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", this.f262310e.d1());
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_notify_top", str)) {
            if (this.f262312g.N()) {
                c01.e2.t0(this.f262310e.d1(), true, true);
                a(3);
            } else {
                c01.e2.B0(this.f262310e.d1(), true, true);
                a(4);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_notify_not_disturb", str)) {
            if (this.f262313h.N()) {
                c01.e2.p0(this.f262310e, true);
                a(5);
            } else {
                c01.e2.z0(this.f262310e, true);
                a(6);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_notify_help", str)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(context, f262308n, true);
            a(7);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_notify_customer_support", str)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0("gh_21958f90f0d7@app", "/user-service/pages/im/index.html?sceneCode=WxpayPluginSetting", 0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.d0.f34984x366c91de);
            a(7);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_notify_clear_data", str)) {
            android.content.Context context2 = this.f262309d;
            db5.e1.A(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z(this), null);
            a(8);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_notify_install", str)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwq), true, true, null);
            this.f262315m = Q;
            Q.show();
            gm0.j1.d().a(30, this);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("gh_3dfda90e39d6");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(1);
            gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).wi(1, linkedList, linkedList2, "", ""));
            a(10);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_notify_uninstall", str)) {
            db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a0(this), null);
            a(9);
        }
        return false;
    }

    @Override // t25.a
    public android.view.View S() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z0 z0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z0.f262541a;
        if (!z0Var.a()) {
            return null;
        }
        android.content.Context context = this.f262309d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3m, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.szd);
        this.f262314i = textView;
        if (textView != null) {
            if (z0Var.b()) {
                this.f262314i.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574220oc3));
            } else {
                this.f262314i.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574221oc4));
            }
            com.p314xaae8f345.mm.ui.fk.b(this.f262314i);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f1.a(this.f262314i, new yz5.l() { // from class: com.tencent.mm.plugin.wallet_core.ui.x$$a
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x.this;
                    xVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z0 z0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z0.f262541a;
                    if (z0Var2.b()) {
                        ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("checkServiceCloseUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y(xVar));
                    } else {
                        z0Var2.c(xVar.f262309d, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.C19154x37186a(xVar));
                    }
                    return jz5.f0.f384359a;
                }
            });
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "[getBottomView] payBottomTips:" + this.f262314i.hashCode() + ", root:" + inflate.hashCode() + ",this:" + hashCode());
        }
        return inflate;
    }

    public final void a(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7126x2bd4d7fe c7126x2bd4d7fe = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7126x2bd4d7fe();
        c7126x2bd4d7fe.f144429d = i17;
        c7126x2bd4d7fe.k();
    }

    public final void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).h("contact_info_header_helper");
        c19708x15855336.M(this.f262310e.d1(), this.f262310e.g2(), this.f262309d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572544bk3));
        if (!this.f262310e.r2()) {
            c19708x15855336.N(0);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_install", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_uninstall", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_go_to", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_top", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_not_disturb", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_help", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_customer_support", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_clear_data", true);
            return;
        }
        c19708x15855336.N(1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_install", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_uninstall", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_go_to", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_top", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_not_disturb", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_help", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_customer_support", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).m("contact_info_wxpay_notify_clear_data", false);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f262310e.d1())) {
            this.f262312g.O(true);
        } else {
            this.f262312g.O(false);
        }
        if (c01.e2.P(this.f262310e)) {
            this.f262313h.O(true);
        } else {
            this.f262313h.O(false);
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
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        qk.o oVar = null;
        if (!(m1Var instanceof ns.l)) {
            if (m1Var instanceof ss4.j) {
                gm0.j1.d().q(1820, this);
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "NetSceneGetPayPlugin fail!");
                    return;
                }
                r45.u65 u65Var = ((ss4.j) m1Var).f493603f;
                if (u65Var == null) {
                    u65Var = new r45.u65();
                }
                r45.yj6 yj6Var = u65Var.f468621d;
                if (yj6Var == null || (linkedList = yj6Var.f472693e) == null || linkedList.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "NetSceneGetPayPlugin no data");
                    return;
                }
                int n17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).n("contact_info_wxpay_notify_clear_data");
                java.util.Iterator it = u65Var.f468621d.f472693e.iterator();
                while (it.hasNext()) {
                    r45.e14 e14Var = (r45.e14) it.next();
                    if (e14Var.f454437e.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "ItemSectionViewData is null");
                    } else {
                        n17++;
                        android.content.Context context = this.f262309d;
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(context, null), n17);
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
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c0(this, context, rl6Var);
                                            c0Var.L(((r45.hl6) linkedList3.get(0)).f457806f);
                                            c0Var.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
                                            if (!rl6Var2.f466520d.isEmpty()) {
                                                java.util.LinkedList linkedList4 = rl6Var2.f466520d;
                                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.hl6) linkedList4.get(0)).f457806f)) {
                                                    c0Var.H(((r45.hl6) linkedList4.get(0)).f457806f);
                                                }
                                            }
                                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).d(c0Var, n17);
                                            c0Var.f279305f = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d0(this, rl6Var, yt5Var);
                                        }
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "TableCellViewData inner data null");
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "TableCellViewData data null");
                        }
                    }
                }
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262311f).notifyDataSetChanged();
                return;
            }
            return;
        }
        gm0.j1.d().q(30, this);
        if (i17 == 0 && i18 == 0) {
            java.lang.String J2 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) m1Var)).J();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "bind fitness contact %s success", J2);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_3dfda90e39d6", true);
            if (n18 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayNotify", "respUsername == " + J2 + ", contact = " + n18);
            } else {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(n18.d1())) {
                    java.lang.String d17 = n18.d1();
                    if (d17 == null) {
                        d17 = "";
                    }
                    ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
                    qk.o b17 = r01.z.b(d17);
                    if (b17 != null) {
                        b17.f66748xdec927b = J2;
                    }
                    ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).wi(d17);
                    n18.K1(d17);
                    oVar = b17;
                }
                n18.X1(J2);
                if (((int) n18.E2) == 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n18);
                }
                if (((int) n18.E2) <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayNotify", "addContact : insert contact failed");
                } else {
                    c01.e2.m0(n18);
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n18.d1(), true);
                    if (oVar != null) {
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(oVar);
                    } else {
                        rv.v2 v2Var = (rv.v2) i95.n0.c(rv.v2.class);
                        java.lang.String d18 = n19.d1();
                        ((qv.q) v2Var).getClass();
                        qk.o b18 = r01.z.b(d18);
                        if (b18 == null || b18.U0()) {
                            c01.n8.a().c(n19.d1(), 4);
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n19.d1());
                        } else if (n19.X4()) {
                            c01.n8.a().c(n19.d1(), 4);
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n19.d1());
                        }
                    }
                }
            }
            rv.v2 v2Var2 = (rv.v2) i95.n0.c(rv.v2.class);
            java.lang.String d19 = n18.d1();
            ((qv.q) v2Var2).getClass();
            qk.o b19 = r01.z.b(d19);
            if (b19 != null) {
                ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(b19);
            }
            gm0.j1.u().c().w(327825, java.lang.Boolean.TRUE);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayNotify", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (i17 == 4 && i18 == -24 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f262315m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        b();
    }
}
