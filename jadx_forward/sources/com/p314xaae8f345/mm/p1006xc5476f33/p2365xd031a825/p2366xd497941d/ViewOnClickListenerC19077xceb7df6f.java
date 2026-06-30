package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI */
/* loaded from: classes9.dex */
public class ViewOnClickListenerC19077xceb7df6f extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements android.view.View.OnClickListener, qp5.i0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f260761w = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260762d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260763e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260764f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260765g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f260766h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.CheckBox f260767i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f260768m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f260769n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c f260770o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c[] f260771p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c f260772q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f260773r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f260774s = false;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f260775t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f260776u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f260777v;

    public final void U6(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = m83108x2b5a5a39();
        android.os.Bundle bundle = m83108x2b5a5a39 != null ? m83108x2b5a5a39.f295334c : null;
        java.lang.String str = ((ys4.g) m1Var).f546765d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response succ");
        if (m83108x2b5a5a39 != null) {
            bundle.putString("key_real_name_token", str);
            bundle.putString("key_country_code", this.f260775t);
            bundle.putString("key_province_code", this.f260776u);
            bundle.putString("key_city_code", this.f260777v);
            bundle.putParcelable("key_profession", this.f260772q);
            m83108x2b5a5a39.o(this, 0, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571165d81;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kx9);
        this.f260766h = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f260762d = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.k3n);
        this.f260763e = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f565113bb3);
        this.f260764f = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.l5u);
        this.f260765g = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.l5m);
        this.f260769n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hdt);
        this.f260762d.m83211x749e7e77(this);
        this.f260763e.m83211x749e7e77(this);
        this.f260764f.m83211x749e7e77(this);
        this.f260765g.m83211x749e7e77(this);
        this.f260762d.setFocusable(true);
        this.f260762d.m83173x1e821d71().setVisibility(8);
        qp5.p.e(this.f260763e);
        rp5.b m83177x57f7af4d = this.f260763e.m83177x57f7af4d();
        if (m83177x57f7af4d instanceof qp5.n) {
            ((qp5.n) m83177x57f7af4d).f(1);
        }
        this.f260764f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.y0(this));
        this.f260765g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.z0(this));
        this.f260766h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a1(this));
        m83125x8f91b80(this.f260763e, 1, false);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.b1(this));
        this.f260767i = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.f564315nu);
        this.f260768m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564314nt);
        this.f260767i.setChecked(true);
        this.f260767i.setOnCheckedChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.c1(this));
        this.f260768m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.e1(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            if (i18 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRealNameVerifyUI", "no choose!");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c c19086x2eaebd1c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c) intent.getParcelableExtra("key_select_profession");
            this.f260772q = c19086x2eaebd1c;
            this.f260764f.m83213x765074af(c19086x2eaebd1c.f260954d);
            return;
        }
        if (i17 == 2) {
            if (i18 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRealNameVerifyUI", "no area choose!");
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("CountryName");
            java.lang.String stringExtra2 = intent.getStringExtra("ProviceName");
            java.lang.String stringExtra3 = intent.getStringExtra("CityName");
            this.f260775t = intent.getStringExtra("Country");
            this.f260776u = intent.getStringExtra("Contact_Province");
            this.f260777v = intent.getStringExtra("Contact_City");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                sb6.append(stringExtra);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                sb6.append(" ");
                sb6.append(stringExtra2);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                sb6.append(" ");
                sb6.append(stringExtra3);
            }
            this.f260765g.m83213x765074af(sb6.toString());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f39904x9eeebfc.c(1616);
        this.f260770o = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) m83105x7498fe14().getParcelable("elemt_query");
        mo43517x10010bd5();
        m83096xe7b1ccf7(new ys4.k(null));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f39904x9eeebfc.i(1616);
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3.f260775t) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3.f260776u) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3.f260777v)) ? false : true) == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    @Override // qp5.i0
    /* renamed from: onInputValidChange */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9068x194c4a1(boolean r4) {
        /*
            r3 = this;
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r4 = r3.f260762d
            java.lang.String r4 = r4.m83183xfb85ada3()
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r3.f260763e
            java.lang.String r0 = r0.m83183xfb85ada3()
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            r1 = 0
            r2 = 1
            if (r4 == 0) goto L15
            goto L47
        L15:
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r4 == 0) goto L1c
            goto L47
        L1c:
            boolean r4 = r3.f260773r
            if (r4 == 0) goto L3f
            java.lang.String r4 = r3.f260775t
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r4 == 0) goto L3b
            java.lang.String r4 = r3.f260776u
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r4 == 0) goto L3b
            java.lang.String r4 = r3.f260777v
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r4 != 0) goto L39
            goto L3b
        L39:
            r4 = r1
            goto L3c
        L3b:
            r4 = r2
        L3c:
            if (r4 != 0) goto L3f
            goto L47
        L3f:
            boolean r4 = r3.f260774s
            if (r4 == 0) goto L49
            com.tencent.mm.plugin.wallet_core.id_verify.model.Profession r4 = r3.f260772q
            if (r4 != 0) goto L49
        L47:
            r4 = r1
            goto L4a
        L49:
            r4 = r2
        L4a:
            if (r4 != 0) goto L57
            android.widget.Button r4 = r3.f260766h
            r4.setEnabled(r1)
            android.widget.Button r4 = r3.f260766h
            r4.setClickable(r1)
            goto L61
        L57:
            android.widget.Button r4 = r3.f260766h
            r4.setEnabled(r2)
            android.widget.Button r4 = r3.f260766h
            r4.setClickable(r2)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f.mo9068x194c4a1(boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response fail");
        } else {
            if (m1Var instanceof ys4.g) {
                ys4.g gVar = (ys4.g) m1Var;
                if (gVar.f546772n == null) {
                    U6(m1Var);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify show juveniles dialog");
                    at4.y0 y0Var = gVar.f546772n;
                    db5.e1.A(this, y0Var.f95546a, "", y0Var.f95548c, y0Var.f95547b, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.f1(this, m1Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.g1(this));
                }
                return true;
            }
            if (m1Var instanceof ys4.k) {
                ys4.k kVar = (ys4.k) m1Var;
                this.f260773r = kVar.f546782d == 1;
                boolean z17 = kVar.f546783e == 1;
                this.f260774s = z17;
                if (!z17) {
                    this.f260764f.setVisibility(8);
                }
                if (!this.f260773r) {
                    this.f260765g.setVisibility(8);
                }
                if (this.f260773r || this.f260774s) {
                    this.f260769n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575137kx4);
                }
                this.f260771p = kVar.f546784f;
                return true;
            }
        }
        return false;
    }
}
