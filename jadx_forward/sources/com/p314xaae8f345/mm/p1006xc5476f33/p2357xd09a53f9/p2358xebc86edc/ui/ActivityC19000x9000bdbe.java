package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI */
/* loaded from: classes9.dex */
public class ActivityC19000x9000bdbe extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements at4.i0, l75.z0 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f259336d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f259337e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f259338f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f259339g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f259340h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f259341i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f259342m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d f259343n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ProgressBar f259344o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f259345p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f259346q;

    /* renamed from: r, reason: collision with root package name */
    public at4.s f259347r;

    /* renamed from: s, reason: collision with root package name */
    public rr4.a f259348s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f259349t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f259350u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f259351v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f259352w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f259353x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f259354y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f259355z = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.14
        {
            this.f39173x3fe91575 = 572563856;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b80) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b802 = c5663xbbd89b80;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "KindaBindCardEvent callback");
            if (c5663xbbd89b802 == null) {
                return false;
            }
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe.this;
            am.di diVar = c5663xbbd89b802.f135987g;
            if (diVar != null) {
                if (diVar.f87986a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "KindaBindCardEvent bindCard Succ");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "jumpFethProcess from WalletBalanceManagerUI");
                    com.p314xaae8f345.mm.p2802xd031a825.a.j(activityC19000x9000bdbe, qr4.h.class, null, null);
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(15, 1);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "KindaBindCardEvent bindCard Cancel");
                }
            }
            activityC19000x9000bdbe.f259355z.mo48814x2efc64();
            return true;
        }
    };

    public void U6() {
        m83099x5406100e(new ss4.e0(null, 10), vr4.f1.wi().Ai().f95532h == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V6() {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe.V6():void");
    }

    public void W6() {
        m78603xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734.class);
    }

    public final void X6(at4.a1 a1Var) {
        if (a1Var == null) {
            this.f259349t.setVisibility(8);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a1Var.f95337f)) {
            this.f259350u.setVisibility(8);
        } else {
            this.f259350u.m75396xca029dad(a1Var.f95337f);
            this.f259350u.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a1Var.f95338g)) {
            this.f259352w.setVisibility(8);
        } else {
            this.f259352w.m75396xca029dad(a1Var.f95338g);
            this.f259352w.setVisibility(0);
        }
        this.f259351v.setText(a1Var.f95332a);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a1Var.f95333b)) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                this.f259351v.setTextColor(com.p314xaae8f345.mm.ui.bk.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M(a1Var.f95333b, -16777216)));
            } else {
                this.f259351v.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M(a1Var.f95333b, -16777216));
            }
        }
        this.f259351v.setTextSize(1, a1Var.f95334c);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a1Var.f95335d)) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                gradientDrawable.setColor(com.p314xaae8f345.mm.ui.bk.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M(a1Var.f95335d, -1)));
            } else {
                gradientDrawable.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M(a1Var.f95335d, -1));
            }
            gradientDrawable.setCornerRadius(i65.a.b(mo55332x76847179(), 4));
            this.f259349t.setBackground(gradientDrawable);
        }
        this.f259349t.setVisibility(0);
        this.f259349t.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.u0(this, a1Var));
        this.f259341i.setVisibility(8);
    }

    public final void Y6(boolean z17) {
        long longValue = ((java.lang.Long) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
        this.f259343n.e(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + longValue, "100", 2, java.math.RoundingMode.HALF_UP).doubleValue()), !z17);
    }

    public void Z6(boolean z17) {
        Y6(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = vr4.f1.wi().Ai().f95532h;
        this.f259346q = c19091x9511676c;
        if (c19091x9511676c != null) {
            at4.u1 p17 = vr4.f1.wi().Ai().p();
            boolean z18 = (p17.f95514a & 4) > 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isBalanceFetchOn, ret = %s switchBit %s", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(p17.f95514a));
            if (z18) {
                this.f259336d.setVisibility(0);
                if (((java.lang.Long) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue() <= 0) {
                    this.f259336d.setEnabled(false);
                }
            } else {
                this.f259336d.setVisibility(8);
            }
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ixd);
        gm0.j1.i();
        if (((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_LINK_RED_DOT_INT, -1)).intValue() == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(196660, 0)).intValue();
        gm0.j1.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue());
        boolean z19 = (32768 & intValue) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isShowRealnameGuide, ret = %s switchBit %s", java.lang.Boolean.valueOf(z19), java.lang.Integer.valueOf(intValue));
        if (z19) {
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_RELEAY_NAME_TIP_CONTENT_STRING_SYNC, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hs6));
            android.view.View view = this.f259339g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f259340h.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a_p));
            this.f259340h.setText(str);
            this.f259339g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.z0(this));
            return;
        }
        at4.v1 v1Var = vr4.f1.wi().Ai().f95530f;
        boolean z27 = (v1Var != null ? v1Var.f67056xadbbba6a : 0) == 1;
        at4.v1 v1Var2 = vr4.f1.wi().Ai().f95530f;
        java.lang.String str2 = v1Var2 != null ? v1Var2.f67058x502a0d20 : null;
        at4.v1 v1Var3 = vr4.f1.wi().Ai().f95530f;
        java.lang.String str3 = v1Var3 != null ? v1Var3.f67059x96ab5560 : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "isShowLqtCell:%s lqtCellTitle:%s lqtCellWording:%s", java.lang.Boolean.valueOf(z27), str2, str3);
        if (z27 && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3))) {
            android.view.View view2 = this.f259339g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (vr4.f1.wi().Ai().u() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vr4.f1.wi().Ai().m())) {
            android.view.View view3 = this.f259339g;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f259339g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.a1(this));
            this.f259340h.setText(vr4.f1.wi().Ai().m());
            return;
        }
        at4.x1 Ai = vr4.f1.wi().Ai();
        if (Ai != null) {
            at4.u1 p18 = Ai.p();
            boolean z28 = (p18.f95514a & 1024) > 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isSupportLCT, ret = %s switchBit %s", java.lang.Boolean.valueOf(z28), java.lang.Integer.valueOf(p18.f95514a));
            if (z28 && !android.text.TextUtils.isEmpty(Ai.m())) {
                at4.v1 v1Var4 = Ai.f95530f;
                if (!android.text.TextUtils.isEmpty(v1Var4 != null ? v1Var4.f67051x75330dc8 : null)) {
                    android.view.View view4 = this.f259339g;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f259340h.setText(Ai.m());
                    this.f259339g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.b1(this, Ai));
                    return;
                }
            }
        }
        android.view.View view5 = this.f259339g;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view5, arrayList7.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // at4.i0
    public void c6(int i17, java.util.Map map, java.lang.Object[] objArr) {
        if (i17 != 12 && i17 == 43 && objArr != null && objArr.length > 0) {
            X6((at4.a1) objArr[0]);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (a1Var == ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi() && i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG")) {
                Y6(false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d59;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        this.f259343n = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d) findViewById(com.p314xaae8f345.mm.R.id.f569174pa4);
        this.f259344o = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.pcr);
        this.f259338f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p_z);
        this.f259343n.m73933xaf1ebe0c(this.f259344o);
        this.f259343n.m73936xb2ceec4c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kyi));
        mo273xed6858b4().a(this.f259343n);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f259337e = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.w0(this));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f569171pa1);
        this.f259336d = button2;
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.x0(this));
        this.f259353x = findViewById(com.p314xaae8f345.mm.R.id.f569172pa2);
        this.f259354y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p_y);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569173pa3);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_CN") ? true : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            textView.setVisibility(8);
        } else {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.y0(this));
            textView.setVisibility(0);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView);
        }
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569212pf2)).setText(c01.z1.I() ? com.p314xaae8f345.mm.R.C30867xcad56011.kwm : com.p314xaae8f345.mm.R.C30867xcad56011.kwn);
        this.f259341i = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.ac_);
        this.f259342m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aca);
        this.f259339g = findViewById(com.p314xaae8f345.mm.R.id.i0y);
        this.f259340h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.i0z);
        this.f259349t = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.acl);
        this.f259351v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.acj);
        this.f259350u = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.ack);
        this.f259352w = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.aci);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.f259345p = c22905xef04d72d;
        c22905xef04d72d.a();
        final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6();
        c6241x543927b6.f136488g.f88426a = "2";
        c6241x543927b6.f273897d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe.A;
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe.this;
                activityC19000x9000bdbe.getClass();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b62 = c6241x543927b6;
                am.j10 j10Var = c6241x543927b62.f136489h;
                if (j10Var.f88530d == 2) {
                    activityC19000x9000bdbe.f259345p.m83148xdedf72f8(j10Var.f88531e);
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j10Var.f88527a)) {
                        return;
                    }
                    android.widget.TextView textView2 = activityC19000x9000bdbe.f259338f;
                    am.j10 j10Var2 = c6241x543927b62.f136489h;
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s0(null, textView2, j10Var2.f88527a, j10Var2.f88528b, j10Var2.f88529c);
                }
            }
        };
        c6241x543927b6.e();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 a17;
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().a(this);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        r45.lj5 lj5Var = null;
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.t0(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        getIntent().getIntExtra("key_scene_balance_manager", 0);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_INFO_JSON_STRING_SYNC, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                r45.lj5 lj5Var2 = new r45.lj5();
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                lj5Var2.f461056d = jSONObject.optInt("guide_flag");
                lj5Var2.f461057e = jSONObject.optString("guide_wording");
                lj5Var2.f461058f = jSONObject.optString("left_button_wording");
                lj5Var2.f461059g = jSONObject.optString("right_button_wording");
                lj5Var2.f461060h = jSONObject.optString("upload_credit_url");
                lj5Var = lj5Var2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ECardInfo", e17, "", new java.lang.Object[0]);
            }
        }
        if (lj5Var != null) {
            int i17 = lj5Var.f461056d;
            if (i17 == 1) {
                zs4.q.g(this, lj5Var.f461057e, 0, lj5Var.f461058f, lj5Var.f461059g, new android.os.Bundle(), mo63463x4510f9c8(), null, null, 0, 2);
            } else if (i17 == 3 && (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43.a()) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x4.a(this, a17, 1);
            }
        }
        m83090x14f40144(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.i.f35311x366c91de);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().a(this);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(2, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11850, 6, 0);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(10, 1);
        X6(at4.a1.a());
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.i.f35311x366c91de);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().b(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().e(this);
        rr4.a aVar = this.f259348s;
        if (aVar != null) {
            aVar.j();
        }
        this.f259348s = null;
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "jumpFethProcess from bind ui flag:" + intent.getIntExtra("from_bind_ui", 0));
        if (intent.getIntExtra("from_bind_ui", 0) == 1) {
            com.p314xaae8f345.mm.p2802xd031a825.a.j(this, qr4.h.class, null, null);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(15, 1);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f259343n.f262288g = null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        n05.a aVar = new n05.a(true, true, 300L, this.f259336d, 0, n05.d.f415465g.toString(), this, false, 0, 0);
        n05.a aVar2 = new n05.a(true, true, 300L, this.f259337e, 0, n05.d.f415464f.toString(), this, false, 0, 0);
        com.p314xaae8f345.mm.p2802xd031a825.ui.c0 c0Var = (com.p314xaae8f345.mm.p2802xd031a825.ui.c0) m80391xac8f1cfd(com.p314xaae8f345.mm.p2802xd031a825.ui.c0.class);
        m05.n nVar = m05.n.f404112f;
        c0Var.P6(nVar, aVar);
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.c0) m80391xac8f1cfd(com.p314xaae8f345.mm.p2802xd031a825.ui.c0.class)).P6(nVar, aVar2);
        Z6(true);
        U6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "do query balance menu");
        rr4.a aVar3 = this.f259348s;
        if (aVar3 != null) {
            aVar3.j();
        }
        rr4.a aVar4 = new rr4.a();
        this.f259348s = aVar4;
        aVar4.l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.v0(this));
        super.onResume();
        cu4.g wi6 = ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi();
        wi6.e(this, wi6.i(), null);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0 && !(m1Var instanceof tr4.b) && (m1Var instanceof ss4.e0)) {
            at4.s sVar = ((ss4.e0) m1Var).f493583u;
            this.f259347r = sVar;
            if (sVar == null || this.f259349t.isShown()) {
                this.f259341i.setVisibility(8);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f259347r.f95474a)) {
                this.f259341i.setVisibility(8);
            } else {
                this.f259342m.setText(this.f259347r.f95474a);
                this.f259341i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.p0(this));
                this.f259341i.setVisibility(0);
            }
            Z6(false);
            V6();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(or4.c.class);
    }
}
