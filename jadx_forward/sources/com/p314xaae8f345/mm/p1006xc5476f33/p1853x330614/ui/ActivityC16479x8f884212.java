package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI */
/* loaded from: classes9.dex */
public class ActivityC16479x8f884212 extends com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3 implements l75.z0 {
    public android.app.Dialog C;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d F;
    public android.widget.ProgressBar G;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f229816J;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d K;
    public boolean L;

    /* renamed from: w, reason: collision with root package name */
    public am.m10 f229818w;

    /* renamed from: v, reason: collision with root package name */
    public boolean f229817v = false;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca f229819x = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca();

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f229820y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f229821z = false;
    public android.widget.TextView A = null;
    public boolean B = false;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k1 D = null;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m1 E = null;

    public ActivityC16479x8f884212() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.H = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5819x7bdf87fc>(this, a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUI.1
            {
                this.f39173x3fe91575 = 1883130380;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5819x7bdf87fc c5819x7bdf87fc) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "open ecard finish");
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43.b(null);
                return false;
            }
        };
        this.I = false;
        this.f229816J = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUI.2
            {
                this.f39173x3fe91575 = 323604482;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c122 = c6256xb3fb7c12;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(c6256xb3fb7c122.f136506g.f87653a);
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 activityC16479x8f884212 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "real name verify callback, result: %s, isDoRealNameForBalance: %s", valueOf, java.lang.Boolean.valueOf(activityC16479x8f884212.I));
                if (c6256xb3fb7c122.f136506g.f87653a == -1 && activityC16479x8f884212.I) {
                    activityC16479x8f884212.I = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212.l7(activityC16479x8f884212);
                }
                return false;
            }
        };
        this.K = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6279xeaa7f677>(this, a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUI.3
            {
                this.f39173x3fe91575 = -553207673;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6279xeaa7f677 c6279xeaa7f677) {
                java.lang.String str = c6279xeaa7f677.f136528g.f89790a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "get result %s", str);
                if (!"agree_privacy".equals(str)) {
                    return false;
                }
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                return false;
            }
        };
        this.L = false;
    }

    public static void l7(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 activityC16479x8f884212) {
        activityC16479x8f884212.getClass();
        if (c01.z1.I()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_scene_balance_manager", 2);
            j45.l.j(activityC16479x8f884212, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", intent, null);
        } else {
            android.widget.ImageView imageView = (android.widget.ImageView) activityC16479x8f884212.findViewById(com.p314xaae8f345.mm.R.id.jkl);
            android.content.Intent intent2 = new android.content.Intent(activityC16479x8f884212.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC16479x8f884212, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexUI", "handleClickBalanceEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16479x8f884212.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC16479x8f884212, "com/tencent/mm/plugin/mall/ui/MallIndexUI", "handleClickBalanceEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            imageView.setVisibility(8);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC, 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16500, 2);
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(11, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14419, activityC16479x8f884212.f229776h, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void U6() {
        m78548x39037dd1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "addIconOptionMenuByMode");
        m78480x84f07bce(0, 0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, false, (android.view.MenuItem.OnMenuItemClickListener) new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.x0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14872, 0, 0, "", "", 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void V6() {
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560908xr);
        mo64405x4dab7448(color);
        mo78530x8b45058f();
        findViewById(com.p314xaae8f345.mm.R.id.m7o).setBackgroundColor(color);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void Z6() {
        this.f229782q = ef3.r.wi().Bi(this.f229781p).f66015xb2c0b684;
        if (this.f229784s == null) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bw6, (android.view.ViewGroup) null);
            this.f229784s = inflate;
            this.f229772d.addFooterView(inflate, null, false);
            android.widget.TextView textView = (android.widget.TextView) this.f229784s.findViewById(com.p314xaae8f345.mm.R.id.jky);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k(textView, 100);
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.c1(this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "is show setting: %s", java.lang.Integer.valueOf(this.f229782q));
        if (this.f229782q == 0) {
            android.view.View view = this.f229784s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f229784s.setPadding(0, 0, 0, 0);
            return;
        }
        android.view.View view2 = this.f229784s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getWindow().getDecorView().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.d1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public boolean a7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "init BankcardList");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
        am.l10 l10Var = c6243x5c461184.f136491g;
        l10Var.f88748a = 1;
        l10Var.f88749b = true;
        l10Var.f88751d = 0;
        l10Var.f88750c = true;
        c6243x5c461184.f136492h.f88825a = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.h1(this, c6243x5c461184);
        c6243x5c461184.b(android.os.Looper.myLooper());
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void b7(android.view.View view) {
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k1(this, this, view);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.D);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m1 m1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m1(this, this, view);
        this.E = m1Var;
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_BOOLEAN_SYNC;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean booleanValue = ((java.lang.Boolean) c17.m(u3Var, bool)).booleanValue();
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC;
        long longValue = ((java.lang.Long) c18.m(u3Var2, 0L)).longValue();
        if (booleanValue && longValue > 0 && java.lang.System.currentTimeMillis() >= longValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "hasRedDot expire, ignore reddot");
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, bool);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var2, 0L);
            booleanValue = false;
        }
        if (booleanValue) {
            m1Var.f229938e.setVisibility(0);
        } else {
            m1Var.f229938e.setVisibility(8);
        }
        m1Var.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT, booleanValue);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.E);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void c7() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570791bw4, (android.view.ViewGroup) null);
        this.f229783r = inflate;
        this.f229772d.addHeaderView(inflate, null, false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f229783r.findViewById(com.p314xaae8f345.mm.R.id.gyc);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.height = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229870f;
        linearLayout.setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void e7() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6146x2bfbe4e9 c6146x2bfbe4e9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6146x2bfbe4e9();
        c6146x2bfbe4e9.f136408g.f88331a = false;
        c6146x2bfbe4e9.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void f7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", " cn wallet open new name ：%s", java.lang.Boolean.TRUE);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.gr6);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        this.f229817v = true;
        super.finish();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (a1Var == ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi() && i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG")) {
                j7();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void g7() {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
        if (!(((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67049xff817ee4 == -1)) {
            if (!(((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67049xff817ee4 == 0)) {
                return;
            }
        }
        if (c01.z1.I()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.MallIndexUI", "hy: user not open wallet or status unknown. try query");
            m83096xe7b1ccf7(new us4.a("", false));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void h7() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6();
        c6241x543927b6.f136488g.f88426a = "1";
        c6241x543927b6.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.e1(this, c6241x543927b6);
        c6241x543927b6.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void i7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        android.widget.ListView listView = this.f229772d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229865a;
        listView.setPadding(i17, 0, i17, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void j7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "updateBalanceNum");
        at4.u1 u1Var = new at4.u1();
        if (u1Var.a()) {
            this.f229774f.setText((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_RELEAY_NAME_BALANCE_CONTENT_STRING_SYNC, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574297hs5)));
            this.f229774f.setVisibility(0);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            return;
        }
        if (u1Var.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "show balance amount");
            long longValue = ((java.lang.Long) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
            if (this.F == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicorMsg.MallIndexUI", "moneyLoadingView is null");
                return;
            }
            if (u1Var.c()) {
                this.f229774f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmm));
                this.f229774f.setVisibility(0);
                this.F.setVisibility(8);
                this.G.setVisibility(8);
                this.F.f262288g = null;
            } else {
                this.f229774f.setVisibility(8);
                this.F.setVisibility(0);
                this.G.setVisibility(0);
            }
            if (this.F.getVisibility() == 0) {
                this.F.m73934x535fe17e(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + longValue, "100", 2, java.math.RoundingMode.HALF_UP).doubleValue()));
            }
        }
    }

    public final void m7(ef3.d dVar) {
        if (dVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f333938a)) {
            return;
        }
        if (this.f229821z) {
            android.widget.TextView textView = this.A;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574001gr1);
                this.A.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.z0(this, dVar));
                return;
            }
            return;
        }
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570788bw1, null);
        this.f229820y = inflate;
        inflate.setClickable(false);
        this.f229820y.setEnabled(false);
        android.widget.TextView textView2 = (android.widget.TextView) this.f229820y.findViewById(com.p314xaae8f345.mm.R.id.pew);
        this.A = textView2;
        textView2.setVisibility(0);
        this.A.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574001gr1);
        this.A.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        this.A.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.a1(this, dVar));
        android.widget.ListView listView = this.f229772d;
        if (listView != null) {
            listView.addFooterView(this.f229820y);
            this.f229821z = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "onActivityResult %s %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        super.onActivityResult(i17, i18, intent);
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca caVar = this.f229819x;
            if (i18 == -1) {
                caVar.a(intent);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa aaVar = caVar.f261715g;
            if (aaVar != null) {
                aaVar.mo25351xae7a2e7a();
                return;
            }
            return;
        }
        if (i17 == 5) {
            gm0.j1.i();
            if (((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                return;
            }
            finish();
            return;
        }
        if (i17 == 6 && intent != null && intent.getIntExtra("is_switch_wallet", 0) == 1) {
            finish();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5924xbbf53cb8 c5924xbbf53cb8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5924xbbf53cb8();
            c5924xbbf53cb8.f136226g.f88501a = mo55332x76847179();
            c5924xbbf53cb8.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        if (26 != android.os.Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().a(this);
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        at4.g0.e(2);
        am.m10 m10Var = new am.m10();
        this.f229818w = m10Var;
        m10Var.f88826b = false;
        m10Var.f88827c = true;
        this.H.mo48813x58998cd();
        this.K.mo48813x58998cd();
        this.f229819x.f261714f = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n2.f229981a = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.b(this, false, true);
        super.onCreate(bundle);
        this.f229816J.mo48813x58998cd();
        m83090x14f40144(2713);
        m83090x14f40144(385);
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            gm0.j1.i();
            m7(new ef3.d((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_INDEX_GDPR_CACHE_STRING_SYNC, "")));
            gm0.j1.i();
            ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
            m83099x5406100e(new ef3.i(), false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16500, 1);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.MallIndexUI)).Rj(this, iy1.a.WxPay);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f229819x.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().e(this);
        this.H.mo48814x2efc64();
        this.K.mo48814x2efc64();
        m83121xf6ff5b27(2713);
        m83121xf6ff5b27(385);
        this.f229816J.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f229819x.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d c19152xaaf0e35d = this.F;
        if (c19152xaaf0e35d != null) {
            c19152xaaf0e35d.f262288g = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f229819x.c();
        cu4.g wi6 = ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi();
        wi6.e(this, wi6.i(), null);
        super.onResume();
        j7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo48630x76e0bfae(i17, i18, str, m1Var);
        if (m1Var instanceof ef3.i) {
            m7(((ef3.i) m1Var).f333942d);
        } else if (m1Var instanceof ss4.e0) {
            ss4.e0 e0Var = (ss4.e0) m1Var;
            if (e0Var.m83018x5c64639d()) {
                e0Var.m83012xc93a1ec9().g(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.y0(this));
            }
        }
        return true;
    }
}
