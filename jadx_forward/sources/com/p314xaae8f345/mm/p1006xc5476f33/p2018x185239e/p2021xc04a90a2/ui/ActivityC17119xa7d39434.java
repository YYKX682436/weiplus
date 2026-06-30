package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI */
/* loaded from: classes9.dex */
public class ActivityC17119xa7d39434 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8 {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f238124d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f238125e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f238126f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f238127g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f238128h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f238129i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab f238130m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f238131n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f238132o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f238133p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f238134q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f238135r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f238136s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f238137t;

    /* renamed from: u, reason: collision with root package name */
    public int f238138u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f238139v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f238140w;

    /* renamed from: x, reason: collision with root package name */
    public int f238141x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f238142y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f238143z;

    public final void V6(int i17) {
        if (i17 == 0) {
            this.f238126f.setImageDrawable(i65.a.i(this, com.p314xaae8f345.mm.R.raw.f79704x4155bcd8));
            this.f238126f.getDrawable().setColorFilter(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            this.f238126f.setImageDrawable(i65.a.i(this, com.p314xaae8f345.mm.R.raw.f79932xc85445e5));
            this.f238126f.getDrawable().setColorFilter(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560029g), android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final void W6(r45.tp6 tp6Var) {
        if (tp6Var == null) {
            V6(this.f238141x);
            this.f238127g.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.q0(this));
            this.f238130m.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(this.f238138u / 100.0d, "CNY"));
            android.view.View view = this.f238131n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f238132o.setVisibility(8);
        } else {
            V6(tp6Var.f468194f);
            if (tp6Var.f468196h != null) {
                this.f238124d.setVisibility(0);
                this.f238125e.setText(tp6Var.f468196h.f462581d);
                this.f238124d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.s0(this, tp6Var));
            }
            java.util.LinkedList linkedList = tp6Var.f468195g;
            if (linkedList == null || linkedList.isEmpty()) {
                this.f238132o.setVisibility(8);
                android.view.View view2 = this.f238131n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                for (int i17 = 0; i17 < linkedList.size(); i17++) {
                    r45.f44 f44Var = (r45.f44) linkedList.get(i17);
                    android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c28, (android.view.ViewGroup) null);
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hqa)).setText(f44Var.f455539d);
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.own)).setText(f44Var.f455540e);
                    this.f238132o.addView(inflate);
                }
                this.f238132o.setVisibility(0);
                android.view.View view3 = this.f238131n;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.k8.a(mo55332x76847179(), (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2), findViewById(com.p314xaae8f345.mm.R.id.auz), findViewById(com.p314xaae8f345.mm.R.id.f564984aw1), findViewById(com.p314xaae8f345.mm.R.id.auj), 48);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c29;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        mo54448x9c8c0d33(null);
        m78560xe21cbbf(false);
        this.f238124d = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jo9);
        this.f238125e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.af7);
        this.f238126f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567488jo3);
        this.f238127g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f567487jo2);
        this.f238128h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567486jo1);
        this.f238129i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567489jo4);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab c22904x897710ab = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) findViewById(com.p314xaae8f345.mm.R.id.f567490jo5);
        this.f238130m = c22904x897710ab;
        c22904x897710ab.m83145x4e4ad719(0);
        this.f238131n = findViewById(com.p314xaae8f345.mm.R.id.jo7);
        this.f238132o = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jo8);
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.jo6)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.p0(this));
        W6(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "isKindaEnable: %s，isKindaMobileRemittanceEnable ：%s", bool, bool);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "use Kinda");
        if (getIntent() == null || getIntent().getExtras() == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().getParcelable("key_pay_info");
            this.f238133p = c19760x34448d56;
            if (c19760x34448d56 == null || c19760x34448d56.f273655u == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "payInfo != null && payInfo.extInfo != null");
                U6();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "use native");
                android.os.Bundle bundle2 = this.f238133p.f273655u;
                this.f238134q = bundle2.getString("extinfo_key_1");
                this.f238135r = bundle2.getString("extinfo_key_2");
                this.f238136s = bundle2.getString("extinfo_key_3");
                this.f238137t = bundle2.getString("extinfo_key_4");
                this.f238138u = bundle2.getInt("extinfo_key_5");
                this.f238139v = bundle2.getString("extinfo_key_6");
                this.f238140w = bundle2.getString("extinfo_key_7");
                this.f238141x = bundle2.getInt("extinfo_key_8");
                this.f238142y = bundle2.getString("extinfo_key_9");
                this.f238143z = bundle2.getString("extinfo_key_10");
                this.A = bundle2.getString("extinfo_key_11");
            }
        } else {
            android.os.Bundle extras = getIntent().getExtras();
            this.f238134q = extras.getString("extinfo_key_1");
            this.f238135r = extras.getString("extinfo_key_2");
            this.f238136s = extras.getString("extinfo_key_3");
            this.f238137t = extras.getString("extinfo_key_4");
            this.f238138u = extras.getInt("extinfo_key_5");
            this.f238139v = extras.getString("extinfo_key_6");
            this.f238140w = extras.getString("extinfo_key_7");
            this.f238141x = extras.getInt("extinfo_key_8");
            this.f238142y = extras.getString("extinfo_key_9");
            this.f238143z = extras.getString("extinfo_key_10");
            this.A = extras.getString("extinfo_key_11");
        }
        mo43517x10010bd5();
        m83098x5406100e(new sw3.i(this.f238134q, this.f238135r, this.f238136s, this.f238137t, this.f238138u, this.f238139v, this.f238140w));
        m83090x14f40144(1903);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5709xac465b98 c5709xac465b98 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5709xac465b98();
        c5709xac465b98.f136029g.f89550a = this.A;
        c5709xac465b98.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(1903);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "onKeyUp KEYCODE_BACK click");
            U6();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof sw3.i)) {
            return false;
        }
        r45.tp6 tp6Var = ((sw3.i) m1Var).f495005t;
        if (tp6Var == null) {
            tp6Var = null;
        }
        if (tp6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.mobileRemit.MobileRemitResultUI", "NetSceneMobileRemitGetSuccPage succPageResp is null");
            return true;
        }
        int i19 = tp6Var.f468192d;
        if (i19 == 0) {
            W6(tp6Var);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "NetSceneMobileRemitGetSuccPage ret_code:%s ret_msg:%s", java.lang.Integer.valueOf(i19), tp6Var.f468193e);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.u0.class);
    }
}
