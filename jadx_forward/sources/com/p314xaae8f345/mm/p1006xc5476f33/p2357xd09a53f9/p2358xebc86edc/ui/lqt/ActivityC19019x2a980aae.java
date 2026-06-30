package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI */
/* loaded from: classes9.dex */
public class ActivityC19019x2a980aae extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f259572d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab f259573e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f259574f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f259575g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du4 f259576h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f259577i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f259578m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f259579n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f259580o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f259581p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f259582q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f259583r;

    /* renamed from: s, reason: collision with root package name */
    public int f259584s;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571162d74;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, 0);
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        m78531x8f8cf1fb();
        m78499x92e71989(false);
        this.f259572d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nrn);
        this.f259573e = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) findViewById(com.p314xaae8f345.mm.R.id.f564495t0);
        this.f259574f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.g6_);
        this.f259575g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lba);
        this.f259577i = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.f564967au2);
        this.f259578m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564968au3);
        this.f259579n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564966au1);
        this.f259580o = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.auj);
        this.f259581p = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.g69);
        this.f259582q = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.d2a);
        this.f259583r = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.d2c);
        this.f259584s = getIntent().getIntExtra("entrance_type", 0);
        int intExtra = getIntent().getIntExtra("key_mode", 1);
        double doubleExtra = getIntent().getDoubleExtra("key_amount", 0.0d);
        java.lang.String stringExtra = getIntent().getStringExtra("profile_date_wording");
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_guide_cell");
        if (byteArrayExtra != null) {
            try {
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLqtSaveFetchFinishUI", e17, "", new java.lang.Object[0]);
            }
        }
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("key_operation_view");
        if (byteArrayExtra2 != null) {
            try {
                this.f259576h = (r45.du4) new r45.du4().mo11468x92b714fd(byteArrayExtra2);
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLqtSaveFetchFinishUI", e18, "", new java.lang.Object[0]);
            }
        }
        if (intExtra == 1) {
            if (this.f259584s == 14) {
                java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_Purchase_Result_Wording");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    this.f259572d.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kqz));
                    mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kqz));
                } else {
                    this.f259572d.setText(stringExtra2);
                    mo54450xbf7c1df6(stringExtra2);
                }
                java.lang.String stringExtra3 = getIntent().getStringExtra("KEY_Confirm_Result_Wording");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                    this.f259574f.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hyg));
                } else {
                    this.f259574f.setText(stringExtra3);
                }
                this.f259582q.setVisibility(8);
                this.f259583r.setVisibility(0);
                this.f259574f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
                if (j65.e.b()) {
                    this.f259574f.setBackground(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562591jl));
                } else {
                    this.f259574f.setBackground(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk));
                }
            } else {
                this.f259572d.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575097kr0));
                mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575097kr0));
                this.f259582q.setVisibility(0);
                this.f259583r.setVisibility(8);
            }
        } else if (intExtra == 2) {
            this.f259572d.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpm));
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpm));
        }
        this.f259573e.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(doubleExtra));
        this.f259574f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.f5(this));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f259575g.setText(stringExtra);
            this.f259575g.setVisibility(0);
        }
        r45.du4 du4Var = this.f259576h;
        if (du4Var == null) {
            this.f259580o.setVisibility(8);
            getWindow().getDecorView().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.i5(this));
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454287m)) {
            this.f259577i.m75396xca029dad(this.f259576h.f454287m);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29559, "7", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        this.f259578m.setText(this.f259576h.f454281d);
        this.f259579n.setText(this.f259576h.f454282e);
        this.f259580o.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.g5(this));
        this.f259580o.setVisibility(0);
        getWindow().getDecorView().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.h5(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setContentViewVisibility */
    public void mo67598xf0aced2e(int i17) {
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(or4.e.class);
    }
}
