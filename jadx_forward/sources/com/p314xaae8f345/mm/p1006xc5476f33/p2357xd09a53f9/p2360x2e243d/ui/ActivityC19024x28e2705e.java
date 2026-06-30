package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI */
/* loaded from: classes9.dex */
public class ActivityC19024x28e2705e extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f260081y = 0;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f260089n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f260090o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f260091p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f260092q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f260093r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f260094s;

    /* renamed from: t, reason: collision with root package name */
    public at4.k0 f260095t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f260096u;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f260082d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f260083e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public at4.x1 f260084f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f260085g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f260086h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.c f260087i = null;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.c f260088m = null;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f260097v = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.v(this);

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f260098w = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.w(this);

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260099x = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.9
        {
            this.f39173x3fe91575 = 572563856;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b80) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b802 = c5663xbbd89b80;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "KindaBindCardEvent callback");
            if (c5663xbbd89b802 == null) {
                return false;
            }
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e activityC19024x28e2705e = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e.this;
            am.di diVar = c5663xbbd89b802.f135987g;
            if (diVar != null) {
                if (diVar.f87986a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "KindaBindCardEvent bindCard Succ");
                    activityC19024x28e2705e.V6(false);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "KindaBindCardEvent bindCard Cancel");
                }
            }
            activityC19024x28e2705e.f260099x.mo48814x2efc64();
            return true;
        }
    };

    public void U6(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.y(this, bundle).run();
    }

    public void V6(boolean z17) {
        if (z17) {
            m83096xe7b1ccf7(new ss4.e0(null, 12));
        } else {
            m83099x5406100e(new ss4.e0(null, 12), false);
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.c W6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.c(this, this.f260082d);
    }

    public void X6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        java.lang.String str;
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANKCARD_DETAIL_URL_STRING_SYNC, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is not null");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String format = java.lang.String.format("bank_type=%s&card_tail=%s&bind_serial=%s", c19091x9511676c.f69223x58802fcb, c19091x9511676c.f69222x587fd4e1, c19091x9511676c.f69225xed6d60f6);
        if (str2.contains("?")) {
            str = str2 + "&" + format;
        } else {
            str = str2 + "?" + format;
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("disable_bounce_scroll", true);
        intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
        intent.putExtra("pay_report_scene", 1);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(mo55332x76847179(), intent);
    }

    public void Y6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("key_bankcard", c19091x9511676c);
        com.p314xaae8f345.mm.p2802xd031a825.a.j(this, sr4.b.class, bundle, null);
    }

    public final void Z6() {
        at4.l lVar;
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BIND_CARD_MENU_STRING_SYNC, "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                lVar = new at4.l();
                lVar.f95421a = jSONObject.optInt("menu_jump_type", -1);
                lVar.f95422b = jSONObject.optString("menu_jump_url", "");
                lVar.f95423c = jSONObject.optString("menu_username", "");
                lVar.f95424d = jSONObject.optString("menu_path", "");
                lVar.f95425e = jSONObject.optString("menu_title", "");
                lVar.f95426f = jSONObject.optString("menu_icon_url", "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BindCardMenu", "parse bind card menu, type: %s, title: %s", java.lang.Integer.valueOf(lVar.f95421a), lVar.f95425e);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("BindCardMenu", e17, "", new java.lang.Object[0]);
            }
            if (lVar != null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f95425e)) {
                android.view.View view = this.f260092q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f95426f)) {
                this.f260093r.m75396xca029dad(lVar.f95426f);
            }
            this.f260094s.setText(lVar.f95425e);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(this.f260094s);
            int i17 = lVar.f95421a;
            if (i17 == 1) {
                this.f260092q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.t(this, lVar));
                android.view.View view2 = this.f260092q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 2) {
                this.f260092q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.u(this, lVar));
                android.view.View view3 = this.f260092q;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBankcardManageUI", "unknown type: %d", java.lang.Integer.valueOf(i17));
            android.view.View view4 = this.f260092q;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        lVar = null;
        if (lVar != null) {
        }
        android.view.View view5 = this.f260092q;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void a7() {
        if (this.f260084f.s()) {
            this.f260089n.setEnabled(false);
        } else if (this.f260084f.y()) {
            this.f260089n.setEnabled(true);
        } else {
            this.f260089n.setEnabled(true);
        }
        java.util.ArrayList arrayList = this.f260082d;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f260085g.setVisibility(8);
        } else {
            this.f260085g.setVisibility(0);
        }
        java.util.ArrayList arrayList2 = this.f260083e;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            this.f260086h.setVisibility(8);
        } else {
            this.f260086h.setVisibility(0);
        }
        at4.k0 k0Var = this.f260095t;
        if (k0Var == null || k0Var.f67916x4505d460 != 1) {
            android.view.View view = this.f260091p;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((android.widget.TextView) this.f260091p.findViewById(com.p314xaae8f345.mm.R.id.pc8)).setText(this.f260095t.f67920x29dd02d3);
            at4.k0 k0Var2 = this.f260095t;
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pcj);
            int i17 = k0Var2.f67918x1f185da9;
            gm0.j1.i();
            if (((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOAN_ENTRANCE_RED_POINT_INT, -1)).intValue() < i17 && i17 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "red point update");
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pc7);
            if (k0Var2.f67915xd18846f0 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.is_overdue = true");
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kge);
                textView2.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k0Var2.f67919x2261f75d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.tips not null");
                textView2.setText(k0Var2.f67919x2261f75d);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k0Var2.f67914xe8f41222)) {
                textView2.setVisibility(8);
                android.view.View view2 = this.f260091p;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.available_otb not null");
                int indexOf = k0Var2.f67914xe8f41222.indexOf(".");
                java.lang.String str = k0Var2.f67914xe8f41222;
                if (indexOf > 0) {
                    str = str.substring(0, indexOf);
                }
                textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kgd, str));
            }
            textView2.setVisibility(0);
            android.view.View view22 = this.f260091p;
            java.util.ArrayList arrayList42 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal22 = zj0.c.f554818a;
            arrayList42.add(0);
            java.util.Collections.reverse(arrayList42);
            yj0.a.d(view22, arrayList42.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view22.setVisibility(((java.lang.Integer) arrayList42.get(0)).intValue());
            yj0.a.f(view22, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f260087i.c(arrayList);
        this.f260087i.notifyDataSetChanged();
        this.f260088m.c(arrayList2);
        this.f260088m.notifyDataSetChanged();
        this.f260089n.setEnabled(true);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: checkProcLife */
    public boolean mo66577x53f7ec9a() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        if (!getIntent().getBooleanExtra("intent_finish_self", false)) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
            j45.l.j(this, "mall", ".ui.MallIndexUIv2", intent, null);
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5l;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.r(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p_t);
        this.f260089n = textView;
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.s(this));
        this.f260085g = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.aej);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.c W6 = W6();
        this.f260087i = W6;
        this.f260085g.setAdapter((android.widget.ListAdapter) W6);
        android.widget.ListView listView = this.f260085g;
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f260098w;
        listView.setOnItemClickListener(onItemClickListener);
        this.f260086h = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.p3n);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.c(this, this.f260083e);
        this.f260088m = cVar;
        this.f260086h.setAdapter((android.widget.ListAdapter) cVar);
        this.f260086h.setOnItemClickListener(onItemClickListener);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f569189pc1);
        this.f260090o = findViewById;
        android.view.View.OnClickListener onClickListener = this.f260097v;
        findViewById.setOnClickListener(onClickListener);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.pc6);
        this.f260091p = findViewById2;
        findViewById2.setOnClickListener(onClickListener);
        this.f260092q = findViewById(com.p314xaae8f345.mm.R.id.f569192pc4);
        this.f260093r = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.f569193pc5);
        this.f260094s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569191pc3);
        Z6();
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.f260096u = c22905xef04d72d;
        c22905xef04d72d.a();
        final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6();
        c6241x543927b6.f136488g.f88426a = "4";
        c6241x543927b6.f273897d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e.f260081y;
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e activityC19024x28e2705e = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e.this;
                activityC19024x28e2705e.getClass();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b62 = c6241x543927b6;
                am.j10 j10Var = c6241x543927b62.f136489h;
                if (j10Var.f88530d == 2) {
                    activityC19024x28e2705e.f260096u.m83148xdedf72f8(j10Var.f88531e);
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j10Var.f88527a)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "no bulletin data");
                        return;
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) activityC19024x28e2705e.findViewById(com.p314xaae8f345.mm.R.id.af7);
                    am.j10 j10Var2 = c6241x543927b62.f136489h;
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s0(null, textView2, j10Var2.f88527a, j10Var2.f88528b, j10Var2.f88529c);
                }
            }
        };
        c6241x543927b6.e();
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.q(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo67598xf0aced2e(4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "index Oncreate");
        this.f260084f = vr4.f1.wi().Ai();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f575067kn0);
        mo78530x8b45058f();
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(5, 0);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(27, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14422, 5);
        this.f260095t = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95534j;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f260087i.f260153g.a();
        this.f260088m.f260153g.a();
        this.f260099x.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (this.f260084f.s()) {
            V6(true);
        } else {
            this.f260084f.i(this.f260082d, this.f260083e);
            if (this.f260084f.f95532h != null) {
                mo67598xf0aced2e(0);
            }
            V6(false);
        }
        a7();
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "onSceneEnd");
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof ss4.e0)) {
            return false;
        }
        this.f260095t = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95534j;
        mo67598xf0aced2e(0);
        this.f260084f.i(this.f260082d, this.f260083e);
        a7();
        Z6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.a.class);
    }
}
