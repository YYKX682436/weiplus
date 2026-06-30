package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2 */
/* loaded from: classes9.dex */
public class ActivityC16478x250c8472 extends com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f {
    public int H;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f229810J;

    /* renamed from: x, reason: collision with root package name */
    public int f229811x = 1;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t0[] f229812y = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t0[3];

    /* renamed from: z, reason: collision with root package name */
    public at4.s1 f229813z = new at4.s1();
    public android.widget.TextView A = null;
    public android.view.View B = null;
    public long C = 0;
    public boolean D = false;
    public long E = 0;
    public boolean F = false;
    public java.lang.String G = "";

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2$2, reason: invalid class name */
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16478x250c8472 activityC16478x250c8472 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16478x250c8472.this;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "WebViewUIDestroyEvent %s isCloseWindow %s", str, java.lang.Boolean.valueOf(activityC16478x250c8472.F));
            java.lang.String str2 = activityC16478x250c8472.G;
            if (str2 == null || !str2.equals(c6272x44a4fad2.f136521g.f89130a)) {
                return false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.o0(this), 500L);
            return false;
        }
    }

    public ActivityC16478x250c8472() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.I = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6267x36e7f58b>(a0Var) { // from class: com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2.1
            {
                this.f39173x3fe91575 = -704562821;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6267x36e7f58b c6267x36e7f58b) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6267x36e7f58b c6267x36e7f58b2 = c6267x36e7f58b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "WebViewCloseWindowEventListener %s", c6267x36e7f58b2.f136516g.f88658a);
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16478x250c8472 activityC16478x250c8472 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16478x250c8472.this;
                java.lang.String str = activityC16478x250c8472.G;
                if (str == null || !str.equals(c6267x36e7f58b2.f136516g.f88658a)) {
                    return false;
                }
                activityC16478x250c8472.F = true;
                return false;
            }
        };
        this.f229810J = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16478x250c8472.AnonymousClass2(a0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void W6() {
        m78548x39037dd1();
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void X6() {
        android.view.View view = this.f229798r;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "header = null");
            return;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.gyc);
        if (linearLayout == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "headerContentLayout = null");
            return;
        }
        if (j65.e.b()) {
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ann);
        }
        linearLayout.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.p0(this, linearLayout));
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
        return this.H;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void c7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c, int i17) {
        super.c7(c19100xad1ade2c, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.String str = c19100xad1ade2c.f261358m;
        java.lang.Long valueOf = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(c19100xad1ade2c.f261352d));
        gm0.j1.i();
        g0Var.d(13720, str, valueOf, (java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void d7() {
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.bvy, null);
        this.B = inflate;
        inflate.setClickable(false);
        this.B.setEnabled(false);
        this.A = (android.widget.TextView) this.B.findViewById(com.p314xaae8f345.mm.R.id.pew);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public boolean e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t0[] t0VarArr;
        android.view.View view;
        char c17;
        r45.p67 p67Var = this.f229813z.f95487q;
        int i17 = 0;
        while (true) {
            t0VarArr = this.f229812y;
            if (i17 >= t0VarArr.length) {
                break;
            }
            android.view.View view2 = t0VarArr[i17].f230019a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t0VarArr[i17].f230020b.setImageBitmap(null);
            i17++;
        }
        for (int i18 = 0; i18 < p67Var.f464342d.size() && i18 < t0VarArr.length; i18++) {
            r45.q67 q67Var = (r45.q67) p67Var.f464342d.get(i18);
            android.view.View view3 = t0VarArr[i18].f230019a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/mall/ui/MallIndexOSUIv2", "initGreyArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t0VarArr[i18].f230020b.m75396xca029dad(x51.j1.b(q67Var.f465249e));
            t0VarArr[i18].f230020b.setVisibility(0);
            t0VarArr[i18].f230021c.setText(x51.j1.b(q67Var.f465248d));
            java.lang.String b17 = x51.j1.b(q67Var.f465251g);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                c17 = '\b';
                t0VarArr[i18].f230022d.setVisibility(8);
            } else {
                t0VarArr[i18].f230022d.setText(b17);
                t0VarArr[i18].f230022d.setVisibility(0);
                c17 = '\b';
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "item %s name: %s,desc:%s,url %s,", java.lang.Integer.valueOf(i18), q67Var.f465248d, b17, x51.j1.b(q67Var.f465249e));
            t0VarArr[i18].f230019a.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.q0(this, q67Var));
        }
        android.widget.ListView listView = this.f229787d;
        if (listView != null && (view = this.B) != null && !this.D) {
            listView.addFooterView(view);
            this.D = true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229813z.f95494x)) {
            this.A.setText(this.f229813z.f95494x);
            this.A.setVisibility(0);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void f7(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t0[] t0VarArr = this.f229812y;
        t0VarArr[0] = t0Var;
        t0Var.f230019a = view.findViewById(com.p314xaae8f345.mm.R.id.j9l);
        o7(t0VarArr[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t0 t0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t0();
        t0VarArr[1] = t0Var2;
        t0Var2.f230019a = view.findViewById(com.p314xaae8f345.mm.R.id.j9m);
        o7(t0VarArr[1]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t0 t0Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t0();
        t0VarArr[2] = t0Var3;
        t0Var3.f230019a = view.findViewById(com.p314xaae8f345.mm.R.id.j9n);
        o7(t0VarArr[2]);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void g7() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570790bw3, (android.view.ViewGroup) null);
        this.f229798r = inflate;
        this.f229787d.addHeaderView(inflate);
        X6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void i7() {
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
            mo54450xbf7c1df6(this.f229813z.f95490t);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "get wechat user wallet entry : %s", Ai);
            mo54450xbf7c1df6(Ai);
        }
        java.lang.String str = this.f229813z.f95491u;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        mo54449x3f86539a(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void k7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.kfo);
        android.widget.TextView textView = this.f229790g;
        at4.s1 s1Var = this.f229813z;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s0(viewGroup, textView, "1", s1Var.f95492v, s1Var.f95493w);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229813z.f95492v)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.v0) m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.v0.class);
        v0Var.m42257xc1088956().mo42301x338af3(com.p314xaae8f345.mm.R.id.kfo).mo42301x338af3(com.p314xaae8f345.mm.R.id.khd);
        v0Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.kfo).sendAccessibilityEvent(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void l7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f
    public void m7() {
    }

    public final void o7(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t0 t0Var) {
        t0Var.f230020b = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) t0Var.f230019a.findViewById(com.p314xaae8f345.mm.R.id.hhz);
        t0Var.f230021c = (android.widget.TextView) t0Var.f230019a.findViewById(com.p314xaae8f345.mm.R.id.hjn);
        t0Var.f230022d = (android.widget.TextView) t0Var.f230019a.findViewById(com.p314xaae8f345.mm.R.id.hhg);
        if (j65.e.b()) {
            t0Var.f230022d.setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        } else {
            t0Var.f230022d.setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "onActivityResult requestCode %s resultCode %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n2.f229981a = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.c(this);
        m78497xc03943d(true);
        super.onCreate(bundle);
        this.f229813z = ((pg0.a3) i95.n0.c(pg0.a3.class)).mj().y0(this.f229797q);
        m83090x14f40144(fe1.i.f69740x366c91de);
        at4.s1 s1Var = this.f229813z;
        if (s1Var != null) {
            r45.p67 p67Var = s1Var.f95487q;
            if (!(p67Var == null || (linkedList = p67Var.f464342d) == null || linkedList.size() == 0)) {
                m83099x5406100e(new ef3.l(), false);
                return;
            }
        }
        m83099x5406100e(new ef3.l(), true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(fe1.i.f69740x366c91de);
        this.I.mo48814x2efc64();
        this.f229810J.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        int i17 = this.f229811x;
        if (i17 == 1 || i17 == 2) {
            this.f229811x = 0;
        } else {
            int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("OverseaPayWalletInfoRefreshInternal", 15) * 1000;
            if (b17 > 15000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "svrTime is : %d, large than 15000, use default time 15000", java.lang.Integer.valueOf(b17));
                jx3.f.INSTANCE.mo68478xbd3cda5f(34167, "5");
                b17 = 15000;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "checkUpdate svrTime: %d lastUpdateTime : %d  curTime %d", java.lang.Integer.valueOf(b17), java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(currentTimeMillis));
            if (currentTimeMillis - this.C >= b17) {
                this.C = java.lang.System.currentTimeMillis();
                m83099x5406100e(new ef3.l(), false);
            }
        }
        j7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.la5 la5Var;
        super.mo48630x76e0bfae(i17, i18, str, m1Var);
        if (m1Var.mo808xfb85f7b0() == 1577) {
            ef3.l lVar = (ef3.l) m1Var;
            r45.k65 k65Var = lVar.f333954g;
            r45.t67 t67Var = lVar.f333953f;
            if ((t67Var == null ? 0 : t67Var.f467705d) == 1) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t67Var == null ? "" : t67Var.f467706e)) {
                    if (isFinishing() || isDestroyed()) {
                        return true;
                    }
                    if (java.lang.System.currentTimeMillis() - this.E > 500) {
                        this.E = java.lang.System.currentTimeMillis();
                        this.I.mo48813x58998cd();
                        this.f229810J.mo48813x58998cd();
                        android.os.Bundle bundle = new android.os.Bundle();
                        r45.t67 t67Var2 = lVar.f333953f;
                        this.G = t67Var2 != null ? t67Var2.f467706e : "";
                        android.content.Intent intent = new android.content.Intent();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "startWebViewUI %s", this.G);
                        bundle.putString("KoriginUrl", this.G);
                        bundle.putBoolean("KIsHKAgreeUrl", true);
                        intent.putExtra("rawUrl", this.G);
                        intent.putExtra("jsapiargs", bundle);
                        intent.putExtra("geta8key_username", c01.z1.r());
                        intent.putExtra("pay_channel", 1);
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.U(mo55332x76847179(), intent, 4);
                    }
                }
            }
            this.f229813z = ((pg0.a3) i95.n0.c(pg0.a3.class)).mj().y0(this.f229797q);
            k7();
            e7();
            j7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "showGetNewWalletTip call");
            boolean z17 = this.f229813z.f95489s;
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
            java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
            boolean booleanValue = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "showGetNewWalletTip hadShow=" + booleanValue + ";isswc=" + z17);
            if (!booleanValue && z17) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x4.b(this);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "[checkShowComplianceHalfPage]");
            if (isFinishing() || isDestroyed()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUIv2", "isFinishing() || isDestroyed()");
            } else if (k65Var != null && (la5Var = k65Var.f459982r) != null && la5Var.f460810d) {
                try {
                    java.lang.String base64Data = android.util.Base64.encodeToString(la5Var.f460811e.mo14344x5f01b1f6(), 2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base64Data, "base64Data");
                    byte[] decode = android.util.Base64.decode(base64Data, 0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
                    if (!(decode.length == 0)) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                        m27539xaf65a0fc.mo27555xc6c7e3f0("half_page_view_data", decode);
                        m27539xaf65a0fc.mo27564xf2e7ce2b("usecase_platform_session", currentTimeMillis);
                        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
                        if (qVar != null) {
                            qVar.mo24837xef221a95("complianceHalfPage", m27539xaf65a0fc, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z(null));
                        }
                    }
                    this.f229811x = 2;
                } catch (java.io.IOException unused) {
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.v0.class);
    }
}
