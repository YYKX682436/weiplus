package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class l implements t25.a, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f261917d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f261918e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f261919f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f261920g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f261921h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f261922i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f261923m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f261924n;

    public l(android.content.Context context) {
        this.f261917d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "onAttach");
        this.f261919f = rVar;
        this.f261918e = z3Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576396a7);
        this.f261920g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_wxpay_hk_notify_top");
        this.f261921h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_wxpay_hk_notify_not_disturb");
        a();
        gm0.j1.d().a(6855, this);
        gm0.j1.d().g(new ss4.i());
        android.content.Context context = this.f261917d;
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
        yj0.a.d(m79332x89f3bfad, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayHKNotify", "onAttach", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/storage/Contact;ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m79332x89f3bfad.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m79332x89f3bfad, "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayHKNotify", "onAttach", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/storage/Contact;ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "handleEvent key:%s", str);
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_hk_notify_go_to", str);
        android.content.Context context = this.f261917d;
        if (D0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", this.f261918e.d1());
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_hk_notify_top", str)) {
            if (this.f261920g.N()) {
                c01.e2.t0(this.f261918e.d1(), true, true);
            } else {
                c01.e2.B0(this.f261918e.d1(), true, true);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_hk_notify_not_disturb", str)) {
            if (this.f261921h.N()) {
                c01.e2.p0(this.f261918e, true);
            } else {
                c01.e2.z0(this.f261918e, true);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_hk_notify_help", str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "click Help button ");
            gm0.j1.i();
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_HK_PLUGIN_HELP_URL_STRING_SYNC, null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ke6), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.w(this));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "jump to h5:%s ", str2);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(context, str2, true);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_hk_notify_clear_data", str)) {
            db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n(this), null);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_hk_notify_install", str)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwq), true, true, null);
            this.f261924n = Q;
            Q.show();
            gm0.j1.d().a(30, this);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("gh_b4af18eac3d5");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(1);
            gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).wi(1, linkedList, linkedList2, "", ""));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("contact_info_wxpay_hk_notify_uninstall", str)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setGravity(17);
            textView.setHeight(i65.a.b(context, 56));
            textView.setTextSize(12.0f);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bju));
            k0Var.s(textView, false);
            k0Var.Z1 = true;
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r(this);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.s(this);
            k0Var.v();
        }
        return false;
    }

    @Override // t25.a
    public android.view.View S() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z0 z0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z0.f262541a;
        if (!z0Var.a()) {
            return null;
        }
        android.content.Context context = this.f261917d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3m, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.szd);
        this.f261923m = textView;
        if (textView != null) {
            if (z0Var.b()) {
                this.f261923m.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574220oc3));
            } else {
                this.f261923m.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574221oc4));
            }
            com.p314xaae8f345.mm.ui.fk.b(this.f261923m);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f1.a(this.f261923m, new yz5.l() { // from class: com.tencent.mm.plugin.wallet_core.ui.l$$a
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    android.view.View view = (android.view.View) obj;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l.this;
                    lVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z0 z0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z0.f262541a;
                    if (z0Var2.b()) {
                        ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("checkServiceCloseUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m(lVar, view));
                    } else {
                        z0Var2.c(lVar.f261917d, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.C19136x31a3f6(lVar, view));
                    }
                    return jz5.f0.f384359a;
                }
            });
        }
        return inflate;
    }

    public final void a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).h("contact_info_header_helper");
        c19708x15855336.M(this.f261918e.d1(), this.f261918e.g2(), this.f261917d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bjy));
        if (!this.f261918e.r2()) {
            c19708x15855336.N(0);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_install", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_uninstall", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_go_to", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_top", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_not_disturb", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_help", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_clear_data", true);
            return;
        }
        c19708x15855336.N(1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_install", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_uninstall", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_go_to", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_top", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_not_disturb", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_help", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).m("contact_info_wxpay_hk_notify_clear_data", false);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f261918e.d1())) {
            this.f261920g.O(true);
        } else {
            this.f261920g.O(false);
        }
        if (c01.e2.P(this.f261918e)) {
            this.f261921h.O(true);
        } else {
            this.f261921h.O(false);
        }
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "onActivityResult");
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "requestCode == REQUEST_CODE_DISABLE_PAY_HK");
            if (this.f261922i == null) {
                android.content.Context context = this.f261917d;
                this.f261922i = db5.e1.O(context, null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o(this));
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.q(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(qVar, 1000L, false);
        }
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "onDetach");
        gm0.j1.d().q(30, this);
        gm0.j1.d().q(6855, this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        qk.o oVar = null;
        if (m1Var instanceof ns.l) {
            gm0.j1.d().q(30, this);
            if (i17 == 0 && i18 == 0) {
                java.lang.String J2 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) m1Var)).J();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "bind fitness contact %s success", J2);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_b4af18eac3d5", true);
                if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "respUsername == " + J2 + ", contact = " + n17);
                } else {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(n17.d1())) {
                        java.lang.String d17 = n17.d1();
                        if (d17 == null) {
                            d17 = "";
                        }
                        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                        qk.o b17 = r01.z.b(d17);
                        if (b17 != null) {
                            b17.f66748xdec927b = J2;
                        }
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).wi(d17);
                        n17.K1(d17);
                        oVar = b17;
                    }
                    n17.X1(J2);
                    if (((int) n17.E2) == 0) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n17);
                    }
                    if (((int) n17.E2) <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "addContact : insert contact failed");
                    } else {
                        c01.e2.m0(n17);
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n17.d1(), true);
                        if (oVar != null) {
                            ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(oVar);
                        } else {
                            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                            java.lang.String d18 = n18.d1();
                            ((qv.o) u2Var).getClass();
                            qk.o b18 = r01.z.b(d18);
                            if (b18 == null || b18.U0()) {
                                c01.n8.a().c(n18.d1(), 4);
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            } else if (n18.X4()) {
                                c01.n8.a().c(n18.d1(), 4);
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            }
                        }
                    }
                }
                rv.u2 u2Var2 = (rv.u2) i95.n0.c(rv.u2.class);
                java.lang.String d19 = n17.d1();
                ((qv.o) u2Var2).getClass();
                qk.o b19 = r01.z.b(d19);
                if (b19 != null) {
                    ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(b19);
                }
                gm0.j1.u().c().w(327825, java.lang.Boolean.TRUE);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i17 == 4 && i18 == -24 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f261924n;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            a();
            return;
        }
        if (m1Var instanceof ss4.i) {
            gm0.j1.d().q(6855, this);
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "NetSceneGetPayHKPlugin fail!");
                return;
            }
            r45.yu3 yu3Var = ((ss4.i) m1Var).f493599f;
            if (yu3Var == null) {
                yu3Var = new r45.yu3();
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yu3Var.f472906f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "response.support_center_url：%s", yu3Var.f472906f);
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_HK_PLUGIN_HELP_URL_STRING_SYNC, yu3Var.f472906f);
                gm0.j1.i();
                gm0.j1.u().c().i(true);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yu3Var.f472905e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "response.disable_hk_wallet_url：%s", yu3Var.f472905e);
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_HK_PLUGIN_DISABLE_URL_STRING_SYNC, yu3Var.f472905e);
                gm0.j1.i();
                gm0.j1.u().c().i(true);
            }
            r45.yj6 yj6Var = yu3Var.f472904d;
            if (yj6Var == null || (linkedList = yj6Var.f472693e) == null || linkedList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "NetSceneGetPayHKPlugin no data");
                return;
            }
            int n19 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).n("contact_info_wxpay_hk_notify_go_to");
            java.util.Iterator it = yu3Var.f472904d.f472693e.iterator();
            while (it.hasNext()) {
                r45.e14 e14Var = (r45.e14) it.next();
                if (e14Var.f454437e.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "ItemSectionViewData is null");
                } else {
                    n19++;
                    android.content.Context context = this.f261917d;
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(context, null), n19);
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
                                        n19++;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u(this, context);
                                        uVar.L(((r45.hl6) linkedList3.get(0)).f457806f);
                                        uVar.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
                                        if (!rl6Var2.f466520d.isEmpty()) {
                                            java.util.LinkedList linkedList4 = rl6Var2.f466520d;
                                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.hl6) linkedList4.get(0)).f457806f)) {
                                                uVar.H(((r45.hl6) linkedList4.get(0)).f457806f);
                                            }
                                        }
                                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).d(uVar, n19);
                                        uVar.f279305f = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v(this, rl6Var, yt5Var);
                                    }
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "TableCellViewData inner data null");
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "TableCellViewData data null");
                    }
                }
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261919f).notifyDataSetChanged();
        }
    }
}
