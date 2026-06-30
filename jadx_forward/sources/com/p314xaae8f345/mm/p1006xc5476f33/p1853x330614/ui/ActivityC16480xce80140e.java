package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2 */
/* loaded from: classes9.dex */
public class ActivityC16480xce80140e extends com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f implements l75.z0 {
    public android.app.Dialog F;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d f229823J;
    public android.widget.ProgressBar K;
    public int L;
    public java.util.ArrayList M;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d P;
    public boolean Q;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d R;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d S;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d T;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d U;
    public boolean V;
    public boolean W;

    /* renamed from: y, reason: collision with root package name */
    public am.m10 f229825y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.RelativeLayout f229826z;

    /* renamed from: x, reason: collision with root package name */
    public boolean f229824x = false;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca A = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca();
    public android.view.View B = null;
    public boolean C = false;
    public android.widget.TextView D = null;
    public boolean E = false;
    public boolean G = false;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k2 H = null;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m2 I = null;
    public boolean N = false;

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$4, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6272x44a4fad> {
        public AnonymousClass4(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = -1681666147;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6272x44a4fad c6272x44a4fad) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "WebViewUIDestroyEvent close");
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e.this.T.mo48814x2efc64();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.c2(this), 200L);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$5, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5779xd33b1313> {
        public AnonymousClass5(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = 286464771;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5779xd33b1313 c5779xd33b1313) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "offlineUseCaseEvent callback");
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e.this.U.mo48814x2efc64();
            am.em emVar = c5779xd33b1313.f136092g;
            if (emVar == null || emVar.f88096a != 1) {
                return false;
            }
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.d2(this));
            return false;
        }
    }

    public ActivityC16480xce80140e() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.P = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5819x7bdf87fc>(this, a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUIv2.1
            {
                this.f39173x3fe91575 = 1883130380;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5819x7bdf87fc c5819x7bdf87fc) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "open ecard finish");
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43.b(null);
                return false;
            }
        };
        this.Q = false;
        this.R = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUIv2.2
            {
                this.f39173x3fe91575 = 323604482;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c122 = c6256xb3fb7c12;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(c6256xb3fb7c122.f136506g.f87653a);
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "real name verify callback, result: %s, isDoRealNameForBalance: %s", valueOf, java.lang.Boolean.valueOf(activityC16480xce80140e.Q));
                if (c6256xb3fb7c122.f136506g.f87653a == -1 && activityC16480xce80140e.Q) {
                    activityC16480xce80140e.Q = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e.o7(activityC16480xce80140e);
                }
                return false;
            }
        };
        this.S = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6279xeaa7f677>(a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexUIv2.3
            {
                this.f39173x3fe91575 = -553207673;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6279xeaa7f677 c6279xeaa7f677) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e.this.G = true;
                java.lang.String str = c6279xeaa7f677.f136528g.f89790a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "get result %s", str);
                if (!"agree_privacy".equals(str)) {
                    return false;
                }
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                return false;
            }
        };
        this.T = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e.AnonymousClass4(a0Var);
        this.U = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e.AnonymousClass5(a0Var);
        this.V = false;
        this.W = false;
    }

    public static void o7(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e) {
        activityC16480xce80140e.getClass();
        if (c01.z1.I()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_scene_balance_manager", 2);
            j45.l.j(activityC16480xce80140e, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", intent, null);
        } else {
            ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("walletUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.o1(activityC16480xce80140e));
            ((android.widget.ImageView) activityC16480xce80140e.findViewById(com.p314xaae8f345.mm.R.id.jkl)).setVisibility(8);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC, 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16500, 2);
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(11, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14419, activityC16480xce80140e.f229792i, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void W6() {
        m78548x39037dd1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "addIconOptionMenuByMode");
        m78480x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.kuu, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, false, (android.view.MenuItem.OnMenuItemClickListener) new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.v1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14872, 0, 0, "", "", 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void X6() {
        android.view.View view = this.f229798r;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "header = null");
            return;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.gyc);
        if (linearLayout == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "headerContentLayout = null");
            return;
        }
        if (j65.e.b()) {
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ann);
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) this.f229798r.findViewById(com.p314xaae8f345.mm.R.id.jkk);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) this.f229798r.findViewById(com.p314xaae8f345.mm.R.id.jkg);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) linearLayout3.getLayoutParams();
        int intValue = ((java.lang.Integer) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.WALLET_MALL_HEADER_INTERVAL_INT_SYNC, 0)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "init lastInterval:%s", java.lang.Integer.valueOf(intValue));
        if (intValue != 0) {
            layoutParams2.leftMargin = intValue;
            layoutParams.rightMargin = intValue;
        }
        int intValue2 = ((java.lang.Integer) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.WALLET_MALL_HEADER_ITEM_WIDTH_INT_SYNC, 0)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "init lastWidth:%s", java.lang.Integer.valueOf(intValue2));
        if (intValue2 != 0) {
            layoutParams2.width = intValue2;
        }
        int intValue3 = ((java.lang.Integer) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.WALLET_MALL_HEADER_ITEM_HEIGHT_INT_SYNC, 0)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "init lastHeight:%s", java.lang.Integer.valueOf(intValue3));
        if (intValue3 != 0) {
            layoutParams2.height = intValue3;
        }
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout3.setLayoutParams(layoutParams2);
        linearLayout.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b2(this, linearLayout));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void Y6() {
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560908xr);
        mo64405x4dab7448(color);
        mo78530x8b45058f();
        findViewById(com.p314xaae8f345.mm.R.id.m7o).setBackgroundColor(color);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public int Z6() {
        return this.L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void d7() {
        java.lang.String str = bt4.d.d(1).f463582e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "emptyHint: %s", str);
        if (this.f229799s == null) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bw6, (android.view.ViewGroup) null);
            this.f229799s = inflate;
            this.f229787d.addFooterView(inflate, null, false);
            android.widget.TextView textView = (android.widget.TextView) this.f229799s.findViewById(com.p314xaae8f345.mm.R.id.jky);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k(textView, 100);
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g2(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.view.View view = this.f229799s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f229799s.setPadding(i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0);
            return;
        }
        android.view.View view2 = this.f229799s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) this.f229799s.findViewById(com.p314xaae8f345.mm.R.id.jky)).setText(str);
        getWindow().getDecorView().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.h2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public boolean e7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "init BankcardList");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
        am.l10 l10Var = c6243x5c461184.f136491g;
        l10Var.f88748a = 1;
        l10Var.f88749b = true;
        l10Var.f88751d = 0;
        l10Var.f88750c = true;
        c6243x5c461184.f136492h.f88825a = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t1(this, c6243x5c461184);
        c6243x5c461184.b(android.os.Looper.myLooper());
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void f7(android.view.View view) {
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k2(this, this, view);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.H);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m2 m2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m2(this, this, view);
        this.I = m2Var;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "hasRedDot expire, ignore reddot");
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, bool);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var2, 0L);
            booleanValue = false;
        }
        if (booleanValue) {
            m2Var.f229941e.setVisibility(0);
            if (!m2Var.f229979h) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25075, 2, 0);
                m2Var.f229979h = true;
            }
        } else {
            m2Var.f229941e.setVisibility(8);
        }
        m2Var.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT, booleanValue);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.I);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        this.f229824x = true;
        super.finish();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicorMsg.MallIndexUIv2", "[finish] %s, stack: ", this);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (a1Var == ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi() && i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG")) {
                m7();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void g7() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570792bw5, (android.view.ViewGroup) null);
        this.f229798r = inflate;
        this.f229787d.addHeaderView(inflate, null, false);
        X6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void h7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "mark has show complain half page");
        this.N = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void i7() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6146x2bfbe4e9 c6146x2bfbe4e9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6146x2bfbe4e9();
        c6146x2bfbe4e9.f136408g.f88331a = false;
        c6146x2bfbe4e9.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        android.widget.ListView listView = this.f229787d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229865a;
        listView.setPadding(i17, 0, i17, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void j7() {
        java.lang.String Ai = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ai();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", " cn wallet open new name ：%s", java.lang.Boolean.TRUE);
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.gr6);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "get wechat user wallet entry : %s", Ai);
            mo54450xbf7c1df6(Ai);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void k7() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6();
        c6241x543927b6.f136488g.f88426a = "1";
        c6241x543927b6.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.p1(this, c6241x543927b6);
        c6241x543927b6.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void l7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void m7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "updateBalanceNum");
        at4.u1 u1Var = new at4.u1();
        if (u1Var.a()) {
            this.f229789f.setText((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_RELEAY_NAME_BALANCE_CONTENT_STRING_SYNC, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574297hs5)));
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f229789f.getLayoutParams();
            layoutParams.bottomMargin = i65.a.b(mo55332x76847179(), 16);
            this.f229789f.setLayoutParams(layoutParams);
            this.f229789f.setVisibility(0);
            this.f229823J.setVisibility(8);
            this.K.setVisibility(8);
            this.f229826z.setVisibility(8);
            return;
        }
        if (u1Var.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "show balance amount");
            long longValue = ((java.lang.Long) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
            if (this.f229823J == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicorMsg.MallIndexUIv2", "moneyLoadingView is null");
                return;
            }
            if (u1Var.c()) {
                this.f229789f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmm));
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f229789f.getLayoutParams();
                layoutParams2.bottomMargin = i65.a.b(mo55332x76847179(), 16);
                this.f229789f.setLayoutParams(layoutParams2);
                this.f229789f.setVisibility(0);
                this.f229823J.setVisibility(8);
                this.K.setVisibility(8);
                this.f229826z.setVisibility(8);
                this.f229823J.f262288g = null;
            } else {
                this.f229789f.setVisibility(8);
                this.f229823J.setVisibility(0);
                this.K.setVisibility(0);
                this.f229826z.setVisibility(0);
            }
            if (this.f229823J.getVisibility() == 0) {
                this.f229823J.m73934x535fe17e(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + longValue, "100", 2, java.math.RoundingMode.HALF_UP).doubleValue()));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "onActivityResult %s %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        super.onActivityResult(i17, i18, intent);
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca caVar = this.A;
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
        if (i17 == 6) {
            if (intent == null || intent.getIntExtra("is_switch_wallet", 0) != 1) {
                return;
            }
            finish();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5924xbbf53cb8 c5924xbbf53cb8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5924xbbf53cb8();
            c5924xbbf53cb8.f136226g.f88501a = mo55332x76847179();
            c5924xbbf53cb8.e();
            return;
        }
        if (i17 == 65281 && i18 == -1) {
            if (c01.z1.z()) {
                finish();
                return;
            }
            setResult(-1, intent);
            finish();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5924xbbf53cb8 c5924xbbf53cb82 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5924xbbf53cb8();
            c5924xbbf53cb82.f136226g.f88501a = mo55332x76847179();
            c5924xbbf53cb82.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "[onCreate] %s", this);
        m78503xa10faa4c(true);
        if (26 != android.os.Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().a(this);
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        ((ku5.t0) ku5.t0.f394148d).j(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.e2(this), "wxpay_mallindex_refresh_location");
        am.m10 m10Var = new am.m10();
        this.f229825y = m10Var;
        m10Var.f88826b = false;
        m10Var.f88827c = true;
        this.P.mo48813x58998cd();
        this.S.mo48813x58998cd();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_PAY_MANAGE_LABEL_LIST_STRING_SYNC, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        arrayList.add(at4.x0.a(optJSONObject));
                    }
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PayManageLabel", e17, "", new java.lang.Object[0]);
            }
        }
        this.M = arrayList;
        this.A.f261714f = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.f2(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n2.f229981a = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.c(this);
        super.onCreate(bundle);
        this.R.mo48813x58998cd();
        m83090x14f40144(2713);
        m83090x14f40144(385);
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            gm0.j1.i();
            p7(new ef3.d((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_INDEX_GDPR_CACHE_STRING_SYNC, "")));
            m83099x5406100e(new ef3.i(), false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16500, 1);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.MallIndexUI)).Rj(this, iy1.a.WxPay);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "[onDestroy] %s", this);
        this.A.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().e(this);
        this.P.mo48814x2efc64();
        this.S.mo48814x2efc64();
        this.T.mo48814x2efc64();
        this.U.mo48814x2efc64();
        m83121xf6ff5b27(2713);
        m83121xf6ff5b27(385);
        this.R.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d c19152xaaf0e35d = this.f229823J;
        if (c19152xaaf0e35d != null) {
            c19152xaaf0e35d.f262288g = null;
        }
        this.V = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.A.c();
        cu4.g wi6 = ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi();
        wi6.e(this, wi6.i(), null);
        super.onResume();
        m7();
        this.V = true;
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        if (intValue == 0 || intValue == 1) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        j45.l.j(mo55332x76847179(), "mall", ".ui.MallIndexOSUIv2", intent, null);
        m81180x7dc9f8cb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo48630x76e0bfae(i17, i18, str, m1Var);
        if (m1Var instanceof ef3.i) {
            p7(((ef3.i) m1Var).f333942d);
        } else if (m1Var instanceof ss4.e0) {
            ss4.e0 e0Var = (ss4.e0) m1Var;
            if (e0Var.m83018x5c64639d()) {
                e0Var.m83012xc93a1ec9().g(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.y1(this));
                return true;
            }
            q7(e0Var.f493587y);
        }
        return true;
    }

    public final void p7(ef3.d dVar) {
        if (dVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f333938a)) {
            return;
        }
        if (this.C) {
            android.widget.TextView textView = this.D;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574001gr1);
                this.D.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.z1(this, dVar));
                return;
            }
            return;
        }
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570788bw1, null);
        this.B = inflate;
        inflate.setClickable(false);
        this.B.setEnabled(false);
        android.widget.TextView textView2 = (android.widget.TextView) this.B.findViewById(com.p314xaae8f345.mm.R.id.pew);
        this.D = textView2;
        textView2.setVisibility(0);
        this.D.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574001gr1);
        this.D.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        this.D.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.a2(this, dVar));
        android.widget.ListView listView = this.f229787d;
        if (listView != null) {
            listView.addFooterView(this.B);
            this.C = true;
        }
    }

    public final boolean q7(java.lang.String str) {
        if (!this.V) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "tryShowComplianceHalfPage, but is not onResume");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || this.N) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "will show compliance half page");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.a0.f262382a.a(str, null) != null) {
            this.N = true;
        }
        return true;
    }
}
