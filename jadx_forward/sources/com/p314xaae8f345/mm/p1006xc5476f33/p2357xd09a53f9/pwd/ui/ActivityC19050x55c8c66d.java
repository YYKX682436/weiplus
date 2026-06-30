package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI */
/* loaded from: classes9.dex */
public class ActivityC19050x55c8c66d extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f260437n = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ScrollView f260438d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 f260439e;

    /* renamed from: f, reason: collision with root package name */
    public ss4.x f260440f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f260441g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f260442h;

    /* renamed from: i, reason: collision with root package name */
    public int f260443i = -1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f260444m;

    public final void U6(int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", i18);
        setResult(i17, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: cleanUiData */
    public void mo65144xd0a01007(int i17) {
        super.mo65144xd0a01007(i17);
        this.f260439e.a();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5z;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        setResult(i18, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockCheckPwdUI", "onBackPressed");
        U6(-1, 4);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        this.f260443i = getIntent().getIntExtra("key_wallet_lock_type", -1);
        this.f260444m = getIntent().getStringExtra("action");
        this.f260439e = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) findViewById(com.p314xaae8f345.mm.R.id.hdh);
        this.f260441g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pes);
        this.f260442h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pen);
        this.f260438d = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.pgr);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(this.f260441g);
        this.f260441g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l1s);
        java.lang.String stringExtra = getIntent().getStringExtra("key_wallet_lock_input_new_fp_tips");
        int i17 = this.f260443i;
        if (i17 == 2) {
            if (this.f260444m.equals("action.touchlock_verify_by_paypwd")) {
                this.f260441g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l1s);
            } else {
                this.f260441g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575164l21);
            }
            if (this.f260444m.equals("action.touchlock_need_verify_paypwd") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                this.f260442h.setText(stringExtra);
            }
        } else if (i17 == 1) {
            this.f260441g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l1s);
        }
        this.f260439e.m83166x1270e8e7(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.d1(this));
        m83129xcfb55a41(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.f1(this));
        m83113x77af3ad7();
        m83125x8f91b80(this.f260439e, 0, false);
        m83139x8022ec1f();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.c1(this));
        int i18 = android.os.Build.VERSION.SDK_INT;
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        window.getDecorView().setSystemUiVisibility(8192);
        m78513xc2a54588().setFitsSystemWindows(true);
        if (com.p314xaae8f345.mm.p2802xd031a825.ui.r1.P()) {
            getWindow().addFlags(8192);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) || i18 < 31) {
                return;
            }
            try {
                if (b3.l.m9698x3fed0563(mo55332x76847179(), "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                    getWindow().setHideOverlayWindows(true);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockCheckPwdUI", "no permission");
                    jx3.f.INSTANCE.mo68478xbd3cda5f(28867, "100");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLockCheckPwdUI", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onProgressFinish */
    public boolean mo63464xa6efccdf() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = this.f260439e;
        if (viewOnFocusChangeListenerC22906x9d30fd14 != null) {
            viewOnFocusChangeListenerC22906x9d30fd14.a();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockCheckPwdUI", "WalletLockCheckPwdUI errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof ss4.x) {
            ss4.x xVar = (ss4.x) m1Var;
            if (i17 == 0 && i18 == 0) {
                if ("next_action.switch_on_pattern".equals(getIntent().getStringExtra("next_action"))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockCheckPwdUI", "start to open wallet lock after check pwd");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("action", "action.switch_on_pattern");
                    intent.putExtra("next_action", "next_action.switch_on_pattern");
                    intent.putExtra("token", xVar.f493674e);
                    intent.putExtra("type", xVar.f493675f);
                    intent.putExtra("key_wallet_lock_type", this.f260443i);
                    intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                    if (this.f260443i == 2) {
                        intent.putExtra("key_pay_passwd", this.f260439e.m83161xfb85ada3());
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6122x5ba19f00 c6122x5ba19f00 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6122x5ba19f00();
                    am.rx rxVar = c6122x5ba19f00.f136394g;
                    rxVar.f89384b = intent;
                    rxVar.f89383a = this;
                    rxVar.f89385c = 1;
                    c6122x5ba19f00.e();
                } else {
                    java.lang.String str2 = xVar.f493674e;
                    java.lang.String str3 = xVar.f493675f;
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_err_code", 0);
                    intent2.putExtra("key_token", str2);
                    intent2.putExtra("key_type", str3);
                    setResult(-1, intent2);
                    finish();
                }
                return true;
            }
            if (i17 == 1000 && i18 == 3) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("key_err_code", -1);
                intent3.putExtra("key_token", (java.lang.String) null);
                intent3.putExtra("key_type", (java.lang.String) null);
                setResult(-1, intent3);
                finish();
                return true;
            }
        } else {
            if (m1Var instanceof gs4.v) {
                if (i17 == 0 && i18 == 0) {
                    U6(-1, 0);
                } else {
                    U6(-1, -1);
                }
                return true;
            }
            if (m1Var instanceof gs4.e) {
                if (i17 == 0 && i18 == 0) {
                    U6(-1, 0);
                } else {
                    U6(-1, -1);
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w.class);
    }
}
