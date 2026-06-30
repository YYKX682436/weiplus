package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui;

/* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI */
/* loaded from: classes9.dex */
public class ActivityC13148x64d0f1c5 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f177960d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f177961e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f177962f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f177964h;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f177963g = "";

    /* renamed from: i, reason: collision with root package name */
    public int f177965i = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f177966m = new zw1.b3(this);

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 activityC13148x64d0f1c5, java.lang.String str) {
        activityC13148x64d0f1c5.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "showErrorDialog,errMsg:%s", str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13148x64d0f1c5.mo55332x76847179());
        u1Var.u("");
        u1Var.g(str);
        u1Var.a(true);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
        u1Var.l(new zw1.a3(activityC13148x64d0f1c5));
        u1Var.q(false);
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 activityC13148x64d0f1c5, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13148x64d0f1c5.mo55332x76847179());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = activityC13148x64d0f1c5.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
        }
        u1Var.g(str);
        u1Var.l(new zw1.c3(activityC13148x64d0f1c5));
        u1Var.n(activityC13148x64d0f1c5.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ke6));
        u1Var.q(false);
    }

    public static void W6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 activityC13148x64d0f1c5) {
        activityC13148x64d0f1c5.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "onClick() edit desc");
        activityC13148x64d0f1c5.mo48632xd46dd964();
        activityC13148x64d0f1c5.mo73823x964575a5();
        gt4.l.b(activityC13148x64d0f1c5, activityC13148x64d0f1c5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9y), activityC13148x64d0f1c5.f177963g, "", true, 32, new zw1.w2(activityC13148x64d0f1c5), new zw1.y2(activityC13148x64d0f1c5));
    }

    public final void X6() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177963g)) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9y);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(this.f177961e, string, 0, string.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new zw1.u2(this), true), mo55332x76847179());
            this.f177961e.setVisibility(0);
            this.f177962f.setVisibility(8);
            return;
        }
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_0);
        java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9z, this.f177963g, string2);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, string3);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(this.f177962f, i17.toString(), i17.length() - string2.length(), i17.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new zw1.n3(this), true), mo55332x76847179());
        this.f177961e.setVisibility(8);
        this.f177962f.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570170z7;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f177960d = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f567505jq4);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.pbn);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569215pf5)).setTextSize(1, 56.0f);
        editText.setTextSize(1, 56.0f);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            editText.setTextCursorDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562829ps);
        }
        qp5.p.g(this.f177960d);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(this.f177960d.m83169xe7297452());
        java.lang.String stringExtra = getIntent().getStringExtra("key_currency_unit");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f177960d.m83186xefe232c4().setText(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b());
        } else {
            this.f177960d.m83186xefe232c4().setText(stringExtra);
        }
        this.f177960d.b(new zw1.f3(this));
        this.f177960d.r(7, 2);
        this.f177962f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565340c34);
        this.f177961e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565338c32);
        X6();
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = (com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) findViewById(com.p314xaae8f345.mm.R.id.pok);
        this.f177964h = c22894x55bf3223;
        c22894x55bf3223.h();
        this.f177964h.m82979x8ac63285(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9t));
        this.f177960d.m83169xe7297452().setOnEditorActionListener(new zw1.j3(this, new zw1.i3(this)));
        ((android.widget.RelativeLayout.LayoutParams) this.f177964h.getLayoutParams()).addRule(12);
        this.f177964h.e(false);
        m83130x21cc23c2(this.f177960d.m83169xe7297452(), true, false);
        this.f177960d.m83217x59dfe8de(true);
        this.f177960d.post(new zw1.k3(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.b9w);
        mo54448x9c8c0d33(new zw1.l3(this));
        ((android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2)).setOnTouchListener(new zw1.m3(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(1335);
        m83090x14f40144(1660);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(1335);
        m83121xf6ff5b27(1660);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l
    /* renamed from: onDialogDismiss */
    public void mo48629xdbdf3083(android.app.Dialog dialog) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "onDialogDismiss()");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f177966m, 300L);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "onPause()");
        if (this.f177964h.p()) {
            return;
        }
        this.f177965i = 3;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "onResume()");
        if (this.f177965i == 3 && mo48628x7c5cc589()) {
            m83136xb67ebaa8();
        }
        this.f177965i = 2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "errType: %s ，errCode：%s, errMsg：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof ww1.z1) {
            if (i17 == 0 && i18 == 0) {
                ww1.z1 z1Var = (ww1.z1) m1Var;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("ftf_pay_url", z1Var.f531904d);
                intent.putExtra("key_error_level", z1Var.f531908h);
                intent.putExtra("ftf_fixed_fee", z1Var.f531905e);
                intent.putExtra("ftf_fixed_fee_type", z1Var.f531906f);
                intent.putExtra("ftf_fixed_desc", z1Var.f531907g);
                setResult(-1, intent);
                mo48674x36654fab();
                finish();
                return true;
            }
        } else if (m1Var instanceof ww1.t1) {
            ww1.t1 t1Var = (ww1.t1) m1Var;
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeSettingUI", "net error: %s", t1Var);
            } else {
                if (t1Var.f531818f == 0) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("ftf_pay_url", t1Var.f531820h);
                    intent2.putExtra("ftf_fixed_fee", t1Var.f531832w / 100.0d);
                    intent2.putExtra("ftf_fixed_desc", t1Var.f531833x);
                    intent2.putExtra("key_currency_unit", t1Var.f531828s);
                    setResult(-1, intent2);
                    mo48674x36654fab();
                    finish();
                    return true;
                }
                int i19 = t1Var.f531821i;
                if (i19 == 0) {
                    db5.e1.F(mo55332x76847179(), t1Var.f531819g, t1Var.f531822m, false);
                    return true;
                }
                if (i19 == 1) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t1Var.f531823n) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t1Var.f531824o)) {
                        db5.e1.A(mo55332x76847179(), t1Var.f531819g, t1Var.f531822m, t1Var.f531824o, t1Var.f531823n, new zw1.d3(this, t1Var), new zw1.e3(this));
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(sw1.a.class);
    }
}
