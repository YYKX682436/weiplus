package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI */
/* loaded from: classes9.dex */
public class ActivityC16960x141f579b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.l, com.p314xaae8f345.mm.p944x882e457a.u0, y60.e {
    public static final /* synthetic */ int G = 0;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab f236665q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f236666r;

    /* renamed from: u, reason: collision with root package name */
    public int f236669u;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f236655d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f236656e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f236657f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f236658g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f236659h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f236660i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f236661m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f236662n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.g1 f236663o = null;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.g1 f236664p = null;

    /* renamed from: s, reason: collision with root package name */
    public android.app.Dialog f236667s = null;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c f236668t = null;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 f236670v = null;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f236671w = null;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 f236672x = null;

    /* renamed from: y, reason: collision with root package name */
    public boolean f236673y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f236674z = true;
    public final java.util.Map A = new java.util.HashMap();
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d F = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.recharge.ui.RechargeUI.18
        {
            this.f39173x3fe91575 = 520089918;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e2 = c6249x2aa12f2e;
            boolean z17 = false;
            if (c6249x2aa12f2e2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e) {
                am.s10 s10Var = c6249x2aa12f2e2.f136498g;
                if (s10Var.f89398e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.MallRechargeUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                } else {
                    z17 = true;
                    if (s10Var.f89396c == -1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b = com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b.this;
                        if (!activityC16960x141f579b.f236673y) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallRechargeUI", "MallRecharge pay result : ok");
                            us3.e.Ai().wi(activityC16960x141f579b.f236665q.m67831xc50a7785());
                            activityC16960x141f579b.finish();
                            activityC16960x141f579b.f236673y = true;
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallRechargeUI", "MallRecharge pay result : cancel");
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.MallRechargeUI", "mismatched event");
            }
            return z17;
        }
    };

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.lang.String str2 = this.f236671w;
        if (str2 != null && str.equals(str2)) {
            this.f236661m.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.w0(this, bitmap));
        }
    }

    public final boolean T6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b74;
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b742;
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab viewOnFocusChangeListenerC16958xba487cab = this.f236665q;
        boolean z17 = viewOnFocusChangeListenerC16958xba487cab.getVisibility() != 0 || (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnFocusChangeListenerC16958xba487cab.m67832xfb85ada3()) && viewOnFocusChangeListenerC16958xba487cab.f236628s);
        if (!z17 || (c16957xf1da7b742 = this.f236670v) == null || !c16957xf1da7b742.a()) {
            if (!z17 && (c16957xf1da7b74 = this.f236670v) != null) {
                c16957xf1da7b74.getClass();
            }
            this.f236655d.setEnabled(false);
            this.f236655d.setClickable(false);
            return false;
        }
        if (Z6()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b743 = this.f236670v;
            if (c16957xf1da7b743.f236615s) {
                U6(new vs3.e(c16957xf1da7b743.f236614r, this.f236668t.f261352d, c16957xf1da7b743.f236605f, c16957xf1da7b743.f236604e, X6(), W6()));
            }
        }
        mo48674x36654fab();
        this.f236655d.setEnabled(true);
        this.f236655d.setClickable(true);
        return true;
    }

    public final void U6(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 497 || m1Var.mo808xfb85f7b0() == 1555) {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(m1Var);
            return;
        }
        if (!this.f236674z) {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(m1Var);
            return;
        }
        android.app.Dialog dialog = this.f236667s;
        if (dialog == null || (dialog != null && !dialog.isShowing())) {
            this.f236667s = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(mo55332x76847179(), true, new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.q0(this, m1Var));
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.g(m1Var);
    }

    public final java.lang.String V6(int i17, java.lang.String str, java.lang.String str2) {
        return i17 + "-" + str + "-" + str2;
    }

    public final java.lang.String W6() {
        return vs3.b.a(this.f236665q.m67832xfb85ada3());
    }

    public final java.lang.String X6() {
        return "mobile=" + vs3.b.a(this.f236665q.m67832xfb85ada3());
    }

    public final java.util.List Y6(int i17, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            boolean z17 = false;
            for (int i18 = 0; i18 < list.size(); i18++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b74 = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74) list.get(i18);
                if (c16957xf1da7b74.f236614r == i17) {
                    arrayList.add(c16957xf1da7b74);
                    if (c16957xf1da7b74.f236613q) {
                        if (z17) {
                            c16957xf1da7b74.f236613q = false;
                        }
                        z17 = true;
                    }
                }
            }
            if (!z17 && arrayList.size() > 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74) arrayList.get(0)).f236613q = true;
            }
        }
        return arrayList;
    }

    public final boolean Z6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b74 = this.f236670v;
        return !((java.util.HashMap) this.A).containsKey(V6(c16957xf1da7b74.f236614r, c16957xf1da7b74.f236605f, W6()));
    }

    public void a7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236665q.m67832xfb85ada3()) || this.f236665q.a()) {
            this.f236665q.m67836x6ee7c8d7(com.p314xaae8f345.mm.R.C30861xcebc809e.awi);
        } else {
            this.f236665q.m67836x6ee7c8d7(com.p314xaae8f345.mm.R.C30861xcebc809e.f563446aj3);
        }
    }

    public final void b7(java.util.List list) {
        if (list == null) {
            this.f236664p.c(new java.util.ArrayList());
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = false;
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b74 = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74) list.get(i17);
            if (c16957xf1da7b74.f236614r == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b742 = this.f236670v;
                if (c16957xf1da7b742 != null && c16957xf1da7b74.f236605f.equals(c16957xf1da7b742.f236605f)) {
                    c16957xf1da7b74.f236613q = true;
                    z17 = true;
                }
                arrayList.add(c16957xf1da7b74);
            }
        }
        if (!z17 && arrayList.size() > 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74) arrayList.get(0)).f236613q = true;
        }
        this.f236664p.c(arrayList);
    }

    public final void c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27;
        java.util.Objects.toString(this.f236670v);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b74 = this.f236670v;
        if (c16957xf1da7b74 != null) {
            this.f236666r.setText(c16957xf1da7b74.f236606g);
            android.widget.TextView textView = this.f236658g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b742 = this.f236670v;
            textView.setText(!c16957xf1da7b742.a() ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.gss) : (c16957xf1da7b742.f236608i != c16957xf1da7b742.f236609m || (Z6() && this.f236670v.f236615s)) ? "" : java.lang.String.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gsv), java.lang.Float.valueOf(c16957xf1da7b742.f236608i)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f272 = this.f236672x;
        if (c19101x8593f272 == null || (c19101x8593f27 = this.f236668t.f261360o) == null || !c19101x8593f272.m73894xb2c87fbf(c19101x8593f27) || "1".equals(this.f236672x.f261364d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f273 = this.f236668t.f261360o;
            if (c19101x8593f273 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19101x8593f273.f261371n)) {
                this.f236660i.setVisibility(8);
            } else {
                this.f236671w = this.f236668t.f261360o.f261371n;
                y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                xs3.a aVar = new xs3.a(this.f236671w);
                ((x60.e) fVar).getClass();
                this.f236661m.setImageBitmap(x51.w0.d(aVar));
                this.f236660i.setVisibility(0);
            }
        } else {
            this.f236660i.setVisibility(8);
            this.f236672x.m73895x9616526c();
        }
        this.f236657f.setVisibility(4);
        if (!T6()) {
            this.f236656e.setText("");
        } else if (this.f236670v != null && !Z6()) {
            this.f236656e.setText(this.f236670v.f236607h);
            this.f236656e.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        }
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gsk);
        if (!android.text.TextUtils.isEmpty(this.C)) {
            string = this.C;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B)) {
            mo78491xd9193382(0, string, new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.f1(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.D)) {
            this.f236659h.setVisibility(8);
        } else {
            this.f236659h.setVisibility(0);
        }
        if (android.text.TextUtils.isEmpty(this.E)) {
            return;
        }
        this.f236659h.setText(this.E);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cct;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: hideVKB */
    public void mo48674x36654fab() {
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(this.f236668t.f261353e);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.x0(this));
        this.f236656e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j_j);
        this.f236657f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jau);
        this.f236658g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jaw);
        this.f236655d = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f236662n = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j9x);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jav);
        this.f236659h = textView;
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.y0(this));
        this.f236655d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.z0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab viewOnFocusChangeListenerC16958xba487cab = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab) findViewById(com.p314xaae8f345.mm.R.id.j_0);
        this.f236665q = viewOnFocusChangeListenerC16958xba487cab;
        viewOnFocusChangeListenerC16958xba487cab.m67837x7646f18b(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.a1(this));
        this.f236666r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j_o);
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_product_list");
        java.util.List Y6 = Y6(0, parcelableArrayListExtra);
        java.util.List Y62 = Y6(2, parcelableArrayListExtra);
        java.util.ArrayList arrayList = (java.util.ArrayList) Y6;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) Y62;
        this.f236669u = arrayList.size() > arrayList2.size() ? arrayList.size() : arrayList2.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.g1 g1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.g1(this, null);
        this.f236663o = g1Var;
        g1Var.c(Y6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.g1 g1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.g1(this, null);
        this.f236664p = g1Var2;
        g1Var2.c(Y62);
        this.f236662n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.b1(this));
        this.f236660i = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.jar);
        this.f236661m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.jat);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.jas)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.c1(this));
        this.f236660i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.d1(this));
        this.f236665q.m67840x749e7e77(this);
        this.f236665q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.e1(this));
        a7();
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        c7();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r12, int r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f236668t = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) intent.getParcelableExtra("key_func_info");
        java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_product_list");
        this.f236674z = !intent.getBooleanExtra("key_is_hide_progress", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c = this.f236668t;
        if (c19100xad1ade2c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallRechargeUI", "function info is null");
            db5.t7.m123883x26a183b(this, "function info is null", 1).show();
            return;
        }
        if (parcelableArrayListExtra == null) {
            java.lang.String str = c19100xad1ade2c.f261353e;
            U6(new vs3.f(c19100xad1ade2c.f261352d));
        } else {
            this.f236670v = com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.n.a(parcelableArrayListExtra);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallRechargeUI", "onCreate()");
        this.f236672x = bt4.f.b().f(this.f236668t.f261352d);
        mo43517x10010bd5();
    }

    @Override // android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        if (i17 != 1) {
            return db5.e1.F(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gsu), "", true);
        }
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aa7);
        int color2 = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ccp, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lmk);
        com.p314xaae8f345.mm.ui.C21391x3d89d23a c21391x3d89d23a = (com.p314xaae8f345.mm.ui.C21391x3d89d23a) inflate.findViewById(com.p314xaae8f345.mm.R.id.lmo);
        com.p314xaae8f345.mm.ui.C21391x3d89d23a c21391x3d89d23a2 = (com.p314xaae8f345.mm.ui.C21391x3d89d23a) inflate.findViewById(com.p314xaae8f345.mm.R.id.lms);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lml);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.lmn);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lmp);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lmr);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568084ln4);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561439ik) * this.f236669u) + 4;
        relativeLayout.setLayoutParams(layoutParams);
        c21391x3d89d23a.setAdapter((android.widget.ListAdapter) this.f236663o);
        c21391x3d89d23a.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.s0(this));
        c21391x3d89d23a2.setAdapter((android.widget.ListAdapter) this.f236664p);
        c21391x3d89d23a2.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.t0(this));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.lmm).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.u0(this, findViewById, textView2, color2, c21391x3d89d23a, findViewById2, textView3, color, c21391x3d89d23a2, textView));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.lmq).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.v0(this, findViewById2, textView3, color2, c21391x3d89d23a2, findViewById, textView2, color, c21391x3d89d23a, textView));
        if (this.f236663o.getCount() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = null;
        aVar.L = inflate;
        aVar.G = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var == null) {
            return j0Var;
        }
        d0Var.a(j0Var.f293370r);
        return j0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.F.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.l.f34861x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m.f34863x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(1555, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.l.f34861x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m.f34863x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(1555, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b74;
        android.app.Dialog dialog = this.f236667s;
        if (dialog != null && dialog.isShowing() && m1Var.mo808xfb85f7b0() != 497) {
            this.f236667s.dismiss();
            this.f236667s = null;
        }
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof vs3.d) {
                return;
            }
            if (!(m1Var instanceof vs3.e)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
                }
                db5.e1.G(this, str, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.r0(this));
                return;
            }
            if (i18 == 100) {
                this.f236655d.setEnabled(true);
                this.f236655d.setClickable(true);
            } else {
                this.f236655d.setEnabled(false);
                this.f236655d.setClickable(false);
            }
            vs3.e eVar = (vs3.e) m1Var;
            b7(eVar.f521420g);
            this.f236657f.setText(str);
            this.f236657f.setVisibility(0);
            this.f236657f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
            this.f236656e.setText(eVar.f521422i);
            this.f236656e.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
            return;
        }
        if (m1Var instanceof vs3.f) {
            vs3.f fVar = (vs3.f) m1Var;
            java.util.ArrayList arrayList = fVar.f521428f;
            if (arrayList != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.n.a(arrayList);
                this.f236670v = a17;
                java.util.Objects.toString(a17);
            }
            this.B = fVar.f521430h;
            this.C = fVar.f521431i;
            this.D = fVar.f521432m;
            this.E = fVar.f521433n;
            java.util.Objects.toString(arrayList);
            c7();
            java.util.List Y6 = Y6(0, arrayList);
            java.util.List Y62 = Y6(2, arrayList);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) Y6;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) Y62;
            this.f236669u = arrayList2.size() > arrayList3.size() ? arrayList2.size() : arrayList3.size();
            this.f236663o.c(Y6);
            this.f236664p.c(Y62);
            return;
        }
        if (!(m1Var instanceof vs3.e)) {
            if (m1Var instanceof vs3.h) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = ((vs3.h) m1Var).f521455f;
                c19760x34448d56.f273642e = 6;
                c19760x34448d56.f273643f = 100;
                h45.a0.f(this, c19760x34448d56, 2);
                this.F.mo48813x58998cd();
                return;
            }
            if (m1Var instanceof vs3.d) {
                vs3.d dVar = (vs3.d) m1Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b742 = this.f236670v;
                if (c16957xf1da7b742 == null || !c16957xf1da7b742.f236606g.equals(dVar.f521416g) || !W6().equals(dVar.f521415f)) {
                    this.f236655d.setEnabled(true);
                    this.f236655d.setClickable(true);
                    this.f236657f.setText((java.lang.CharSequence) null);
                    return;
                }
                com.p314xaae8f345.mm.p944x882e457a.o oVar = dVar.f521414e;
                if (((r45.r33) oVar.f152244b.f152233a).f466033d != 0) {
                    this.f236655d.setEnabled(false);
                    this.f236655d.setClickable(false);
                    this.f236657f.setText(((r45.r33) oVar.f152244b.f152233a).f466034e);
                    this.f236657f.setVisibility(0);
                    this.f236657f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
                    return;
                }
                return;
            }
            return;
        }
        java.util.Objects.toString(this.f236670v);
        vs3.e eVar2 = (vs3.e) m1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b743 = this.f236670v;
        if (c16957xf1da7b743 != null && (str2 = c16957xf1da7b743.f236605f) != null && (c16957xf1da7b74 = eVar2.f521419f) != null) {
            boolean equals = str2.equals(c16957xf1da7b74.f236605f);
            java.lang.String str3 = eVar2.f521424n;
            int i19 = eVar2.f521423m;
            if ((equals && W6().equals(str3)) || i19 != 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b744 = eVar2.f521419f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b745 = this.f236670v;
                c16957xf1da7b745.f236604e = c16957xf1da7b744.f236604e;
                c16957xf1da7b745.f236603d = c16957xf1da7b744.f236603d;
                c16957xf1da7b745.f236605f = c16957xf1da7b744.f236605f;
                c16957xf1da7b745.f236606g = c16957xf1da7b744.f236606g;
                c16957xf1da7b745.f236607h = c16957xf1da7b744.f236607h;
                c16957xf1da7b745.f236608i = c16957xf1da7b744.f236608i;
                c16957xf1da7b745.f236609m = c16957xf1da7b744.f236609m;
                c16957xf1da7b745.f236610n = c16957xf1da7b744.f236610n;
                c16957xf1da7b745.f236611o = c16957xf1da7b744.f236611o;
                c16957xf1da7b745.f236612p = c16957xf1da7b744.f236612p;
                c16957xf1da7b745.f236614r = c16957xf1da7b744.f236614r;
                c16957xf1da7b745.f236613q = true;
                ((java.util.HashMap) this.A).put(V6(i19, c16957xf1da7b744.f236605f, str3), 1);
                c7();
                this.f236657f.setText(str);
                this.f236657f.setVisibility(0);
                this.f236657f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560743sy));
            }
        }
        if (eVar2.f521423m == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b746 = this.f236670v;
            if (c16957xf1da7b746 != null && c16957xf1da7b746.f236605f.equals(eVar2.f521425o) && W6().equals(eVar2.f521424n)) {
                com.p314xaae8f345.mm.p944x882e457a.o oVar2 = eVar2.f521418e;
                if (((r45.rh3) oVar2.f152244b.f152233a).f466398e == 0 && this.f236670v.f236605f.equals(eVar2.f521419f.f236605f)) {
                    java.lang.String str4 = this.f236670v.f236603d;
                    java.lang.String W6 = W6();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b747 = this.f236670v;
                    U6(new vs3.d(str4, W6, c16957xf1da7b747.f236606g, c16957xf1da7b747.f236604e, X6()));
                } else {
                    this.f236655d.setEnabled(false);
                    this.f236655d.setClickable(false);
                    this.f236657f.setText(((r45.rh3) oVar2.f152244b.f152233a).f466399f);
                    this.f236657f.setVisibility(0);
                    this.f236657f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
                }
            } else {
                this.f236655d.setEnabled(true);
                this.f236655d.setClickable(true);
                this.f236657f.setText((java.lang.CharSequence) null);
            }
        }
        b7(eVar2.f521420g);
        java.util.Objects.toString(this.f236670v);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: showVKB */
    public void mo26063x7b383410() {
        android.view.View currentFocus;
        this.f236665q.m67836x6ee7c8d7(com.p314xaae8f345.mm.R.C30861xcebc809e.f563446aj3);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.showSoftInput(currentFocus, 2);
    }
}
