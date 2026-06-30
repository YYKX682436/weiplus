package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUI */
/* loaded from: classes9.dex */
public class ActivityC16477xce7d7b76 extends com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3 {
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d G;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d H;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0[] f229803v = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0[4];

    /* renamed from: w, reason: collision with root package name */
    public at4.s1 f229804w = new at4.s1();

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f229805x = null;

    /* renamed from: y, reason: collision with root package name */
    public long f229806y = 0;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f229807z = null;
    public boolean A = false;
    public boolean B = false;
    public long C = 0;
    public boolean D = false;
    public java.lang.String E = "";
    public boolean F = true;

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUI$2, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6272x44a4fad> {
        public AnonymousClass2(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = -1681666147;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6272x44a4fad c6272x44a4fad) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6272x44a4fad c6272x44a4fad2 = c6272x44a4fad;
            java.lang.String str = c6272x44a4fad2.f136521g.f89130a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16477xce7d7b76 activityC16477xce7d7b76 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16477xce7d7b76.this;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUI", "WebViewUIDestroyEvent %s isCloseWindow %s", str, java.lang.Boolean.valueOf(activityC16477xce7d7b76.D));
            java.lang.String str2 = activityC16477xce7d7b76.E;
            if (str2 == null || !str2.equals(c6272x44a4fad2.f136521g.f89130a)) {
                return false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.h0(this), 500L);
            return false;
        }
    }

    public ActivityC16477xce7d7b76() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.G = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6267x36e7f58b>(a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexOSUI.1
            {
                this.f39173x3fe91575 = -704562821;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6267x36e7f58b c6267x36e7f58b) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6267x36e7f58b c6267x36e7f58b2 = c6267x36e7f58b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUI", "WebViewCloseWindowEventListener %s", c6267x36e7f58b2.f136516g.f88658a);
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16477xce7d7b76 activityC16477xce7d7b76 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16477xce7d7b76.this;
                java.lang.String str = activityC16477xce7d7b76.E;
                if (str == null || !str.equals(c6267x36e7f58b2.f136516g.f88658a)) {
                    return false;
                }
                activityC16477xce7d7b76.D = true;
                return false;
            }
        };
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16477xce7d7b76.AnonymousClass2(a0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void U6() {
        m78548x39037dd1();
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void V6() {
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560908xr);
        mo64405x4dab7448(color);
        mo78530x8b45058f();
        findViewById(com.p314xaae8f345.mm.R.id.m7o).setBackgroundColor(color);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void Y6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c, int i17) {
        super.Y6(c19100xad1ade2c, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.String str = c19100xad1ade2c.f261358m;
        java.lang.Long valueOf = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(c19100xad1ade2c.f261352d));
        gm0.j1.i();
        g0Var.d(13720, str, valueOf, (java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void Z6() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public boolean a7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0[] l0VarArr;
        android.view.View view;
        r45.p67 p67Var = this.f229804w.f95487q;
        int i17 = 0;
        while (true) {
            l0VarArr = this.f229803v;
            if (i17 >= l0VarArr.length) {
                break;
            }
            android.view.View view2 = l0VarArr[i17].f229968a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l0VarArr[i17].f229969b.setImageBitmap(null);
            i17++;
        }
        for (int i18 = 0; i18 < p67Var.f464342d.size() && i18 < l0VarArr.length; i18++) {
            r45.q67 q67Var = (r45.q67) p67Var.f464342d.get(i18);
            android.view.View view3 = l0VarArr[i18].f229968a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l0VarArr[i18].f229969b.m75396xca029dad(x51.j1.b(q67Var.f465249e));
            l0VarArr[i18].f229969b.setVisibility(0);
            l0VarArr[i18].f229970c.setText(x51.j1.b(q67Var.f465248d));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUI", "item %d url %s", java.lang.Integer.valueOf(i18), x51.j1.b(q67Var.f465249e));
            l0VarArr[i18].f229971d.setVisibility(8);
            java.lang.String b17 = x51.j1.b(q67Var.f465251g);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                l0VarArr[i18].f229971d.setText(b17);
                l0VarArr[i18].f229971d.setVisibility(0);
            }
            l0VarArr[i18].f229968a.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i0(this, q67Var));
        }
        android.widget.ListView listView = this.f229772d;
        if (listView != null && (view = this.f229807z) != null && !this.A) {
            listView.addFooterView(view);
            this.A = true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229804w.f95494x)) {
            this.f229805x.setText(this.f229804w.f95494x);
            this.f229805x.setVisibility(0);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void b7(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0[] l0VarArr = this.f229803v;
        l0VarArr[0] = l0Var;
        l0Var.f229968a = view.findViewById(com.p314xaae8f345.mm.R.id.khd);
        l0VarArr[0].f229969b = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.khg);
        l0VarArr[0].f229969b.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        l0VarArr[0].f229970c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kho);
        l0VarArr[0].f229971d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dlp);
        l0VarArr[0].f229969b.setVisibility(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0 l0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0(this);
        l0VarArr[1] = l0Var2;
        l0Var2.f229968a = view.findViewById(com.p314xaae8f345.mm.R.id.acb);
        l0VarArr[1].f229969b = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.acp);
        l0VarArr[1].f229969b.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        l0VarArr[1].f229970c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.acw);
        l0VarArr[1].f229971d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.aco);
        l0VarArr[1].f229969b.setVisibility(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0 l0Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0(this);
        l0VarArr[2] = l0Var3;
        l0Var3.f229968a = view.findViewById(com.p314xaae8f345.mm.R.id.adv);
        l0VarArr[2].f229969b = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.aeq);
        l0VarArr[2].f229969b.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        l0VarArr[2].f229970c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.aew);
        l0VarArr[2].f229971d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dlq);
        l0VarArr[2].f229969b.setVisibility(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0 l0Var4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l0(this);
        l0VarArr[3] = l0Var4;
        l0Var4.f229968a = view.findViewById(com.p314xaae8f345.mm.R.id.iu8);
        l0VarArr[3].f229969b = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.ixc);
        l0VarArr[3].f229970c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ixv);
        l0VarArr[3].f229969b.setVisibility(4);
        android.view.View view2 = l0VarArr[3].f229968a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyAreaView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/MallIndexOSUI", "initGreyAreaView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void c7() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bw7, (android.view.ViewGroup) null);
        this.f229783r = inflate;
        this.f229772d.addHeaderView(inflate);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void e7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void f7() {
        java.lang.String Ai = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ai();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai)) {
            mo54450xbf7c1df6(this.f229804w.f95490t);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUI", "get wechat user wallet entry : %s", Ai);
            mo54450xbf7c1df6(Ai);
        }
        java.lang.String str = this.f229804w.f95491u;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        mo54449x3f86539a(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        this.B = true;
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void g7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3
    public void h7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.kfo);
        android.widget.TextView textView = this.f229775g;
        at4.s1 s1Var = this.f229804w;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s0(viewGroup, textView, "1", s1Var.f95492v, s1Var.f95493w);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229804w.f95492v)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n0) m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n0.class);
        n0Var.m42257xc1088956().mo42301x338af3(com.p314xaae8f345.mm.R.id.kfo).mo42301x338af3(com.p314xaae8f345.mm.R.id.khd);
        n0Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.kfo).sendAccessibilityEvent(8);
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
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUI", "onActivityResult requestCode %s resultCode %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList linkedList;
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n2.f229981a = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.b(this, false, false);
        m78497xc03943d(true);
        super.onCreate(bundle);
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.bvy, null);
        this.f229807z = inflate;
        inflate.setClickable(false);
        this.f229807z.setEnabled(false);
        this.f229805x = (android.widget.TextView) this.f229807z.findViewById(com.p314xaae8f345.mm.R.id.pew);
        this.f229804w = ((pg0.a3) i95.n0.c(pg0.a3.class)).mj().y0(this.f229781p);
        m83090x14f40144(fe1.i.f69740x366c91de);
        ef3.l lVar = new ef3.l();
        at4.s1 s1Var = this.f229804w;
        if (s1Var != null) {
            r45.p67 p67Var = s1Var.f95487q;
            if (p67Var != null && (linkedList = p67Var.f464342d) != null && linkedList.size() != 0) {
                z17 = false;
            }
            if (!z17) {
                m83099x5406100e(lVar, false);
                return;
            }
        }
        m83096xe7b1ccf7(lVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(fe1.i.f69740x366c91de);
        this.G.mo48814x2efc64();
        this.H.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.F) {
            this.F = false;
        } else {
            if (java.lang.System.currentTimeMillis() - this.f229806y >= ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("OverseaPayWalletInfoRefreshInternal", 15) * 1000) {
                this.f229806y = java.lang.System.currentTimeMillis();
                m83099x5406100e(new ef3.l(), false);
            }
        }
        f7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo48630x76e0bfae(i17, i18, str, m1Var);
        if (m1Var.mo808xfb85f7b0() == 1577) {
            ef3.l lVar = (ef3.l) m1Var;
            r45.t67 t67Var = lVar.f333953f;
            if ((t67Var == null ? 0 : t67Var.f467705d) == 1) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t67Var == null ? "" : t67Var.f467706e)) {
                    if (this.B) {
                        return true;
                    }
                    if (java.lang.System.currentTimeMillis() - this.C > 500) {
                        this.C = java.lang.System.currentTimeMillis();
                        this.G.mo48813x58998cd();
                        this.H.mo48813x58998cd();
                        android.os.Bundle bundle = new android.os.Bundle();
                        r45.t67 t67Var2 = lVar.f333953f;
                        this.E = t67Var2 != null ? t67Var2.f467706e : "";
                        android.content.Intent intent = new android.content.Intent();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUI", "startWebViewUI %s", this.E);
                        bundle.putString("KoriginUrl", this.E);
                        bundle.putBoolean("KIsHKAgreeUrl", true);
                        intent.putExtra("rawUrl", this.E);
                        intent.putExtra("jsapiargs", bundle);
                        intent.putExtra("geta8key_username", c01.z1.r());
                        intent.putExtra("pay_channel", 1);
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.U(mo55332x76847179(), intent, 4);
                    }
                }
            }
            this.f229804w = ((pg0.a3) i95.n0.c(pg0.a3.class)).mj().y0(this.f229781p);
            h7();
            a7();
            f7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUI", "showGetNewWalletTip call");
            boolean z17 = this.f229804w.f95489s;
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
            java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
            boolean booleanValue = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUI", "showGetNewWalletTip hadShow=" + booleanValue + ";isswc=" + z17);
            if (!booleanValue && z17) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gr8), null, true, null);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n0.class);
    }
}
