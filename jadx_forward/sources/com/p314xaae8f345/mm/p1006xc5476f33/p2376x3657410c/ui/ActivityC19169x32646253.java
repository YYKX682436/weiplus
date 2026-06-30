package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletIapUI */
/* loaded from: classes9.dex */
public class ActivityC19169x32646253 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f262633s = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f262637g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d f262639i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e f262640m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.Dialog f262641n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f262642o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f f262643p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f f262644q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f262645r;

    /* renamed from: d, reason: collision with root package name */
    public boolean f262634d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f262635e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f262636f = 1003;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f262638h = "0";

    public ActivityC19169x32646253() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f262642o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6250xfea32d85>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.1
            {
                this.f39173x3fe91575 = -1513748107;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6250xfea32d85 c6250xfea32d85) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6250xfea32d85 c6250xfea32d852 = c6250xfea32d85;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(c6250xfea32d852.f136499g.f89495b);
                am.t10 t10Var = c6250xfea32d852.f136499g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "walletPayResultListener onPayEnd payResult:%s, reqKey:%s,  comeFrom:%s,requestCode:%d", valueOf, t10Var.f89496c, java.lang.Integer.valueOf(t10Var.f89497d), java.lang.Integer.valueOf(t10Var.f89498e));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t10Var.f89496c) && t10Var.f89496c.equalsIgnoreCase("key_from_scene_appbrandgame") && t10Var.f89497d == 1) {
                    android.content.Intent intent = t10Var.f89494a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253 activityC19169x32646253 = com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253.this;
                    if (intent == null || intent.getExtras() == null || t10Var.f89494a.getExtras().get("key_total_fee") == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "no payAmount");
                    } else {
                        java.lang.String obj = t10Var.f89494a.getExtras().get("key_total_fee").toString();
                        activityC19169x32646253.f262638h = obj;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "has payAmount:%s", obj);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d dVar = activityC19169x32646253.f262639i;
                    if (dVar == null || !dVar.c(activityC19169x32646253, t10Var.f89498e, t10Var.f89495b, t10Var.f89494a)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletIapUI", "havn't handle user action");
                        android.content.Intent intent2 = new android.content.Intent();
                        nt4.f a17 = nt4.f.a(6);
                        intent2.putExtra("key_err_code", a17.f421356a);
                        intent2.putExtra("key_err_msg", a17.f421357b);
                        intent2.putExtra("key_launch_ts", com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c.f262672m);
                        activityC19169x32646253.setResult(-1, intent2);
                        activityC19169x32646253.finish();
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "FuncId %s,is not current request key || comeFrom:%s is not FINISH", "key_from_scene_appbrandgame", java.lang.Integer.valueOf(t10Var.f89497d));
                }
                return true;
            }
        };
        this.f262643p = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.y(this);
        this.f262644q = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.z(this);
        this.f262645r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6237x853c614e>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.4
            {
                this.f39173x3fe91575 = -917791906;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6237x853c614e c6237x853c614e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "payListener callback to close progress");
                if (!(c6237x853c614e instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6237x853c614e)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.WalletIapUI", "mismatched event");
                    return false;
                }
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253.f262633s;
                com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253.this.T6();
                return true;
            }
        };
    }

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "hideLoadingDialog!");
        android.app.Dialog dialog = this.f262641n;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f262641n.dismiss();
        this.f262641n = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "finish");
        T6();
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "onActivityResult resultCode : " + i18);
        if (intent == null || intent.getExtras() == null || intent.getExtras().get("key_total_fee") == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "no payAmount");
        } else {
            java.lang.String obj = intent.getExtras().get("key_total_fee").toString();
            this.f262638h = obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "has payAmount:%s", obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d dVar = this.f262639i;
        if (dVar == null || !dVar.c(this, i17, i18, intent)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletIapUI", "havn't handle user action");
            android.content.Intent intent2 = new android.content.Intent();
            nt4.f a17 = nt4.f.a(6);
            intent2.putExtra("key_err_code", a17.f421356a);
            intent2.putExtra("key_err_msg", a17.f421357b);
            intent2.putExtra("key_launch_ts", com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c.f262672m);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "onCreate");
        com.p314xaae8f345.mm.ui.bk.j0(this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60863x5f3ec0e3, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(414, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.z.f34666x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.z.f34529x366c91de, this);
        if (getIntent().getIntExtra("key_action_type", 200001) == 200001) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "showLoadingDialog!");
            this.f262641n = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.a0(this));
        }
        this.f262637g = getIntent().getBooleanExtra("key_is_mini_program", false);
        if (getIntent().getBooleanExtra("key_request_fullscreen", false)) {
            getWindow().addFlags(1024);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e();
        this.f262640m = eVar;
        eVar.f262698n = this.f262637g;
        if (getIntent().getBooleanExtra("key_force_google", false) || c01.z1.y()) {
            this.f262639i = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c(this, this.f262640m, this.f262644q);
        } else {
            this.f262639i = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.x0(this.f262640m, this.f262645r);
        }
        this.f262640m.f262697m = this.f262639i.a();
        this.f262642o.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "onDestroy");
        T6();
        if (this.f262636f == 1003) {
            this.f262636f = 1001;
        }
        java.lang.String stringExtra = getIntent() != null ? getIntent().getStringExtra("key_appid") : "";
        int i17 = !(this.f262639i instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.x0) ? 1 : 0;
        long F = (long) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f262638h, 0.0d) * 100.0d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "reportPaymentState report(%s), isMiniProgram : %b, appid %s, walletType %s, currentScene %s, currentState %s, payAmount %s, payamount %s", 15751, java.lang.Boolean.valueOf(this.f262637g), stringExtra, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f262635e), java.lang.Integer.valueOf(this.f262636f), this.f262638h, java.lang.Long.valueOf(F));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(15751, java.lang.Integer.valueOf(!this.f262637g ? 1 : 0), stringExtra, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f262635e), java.lang.Integer.valueOf(this.f262636f), this.f262638h, java.lang.Long.valueOf(F));
        g0Var.mo68477x336bdfd8(1044L, this.f262636f - 1000, 1L, false);
        int i18 = this.f262636f;
        if (i18 == 1001) {
            g0Var.mo68477x336bdfd8(1044L, this.f262635e + 4, 1L, false);
        } else if (i18 == 1002) {
            g0Var.mo68477x336bdfd8(1044L, this.f262635e + 8, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d dVar = this.f262639i;
        if (dVar != null) {
            dVar.b(this);
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60863x5f3ec0e3, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(414, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.z.f34666x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.z.f34529x366c91de, this);
        this.f262642o.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "onNewIntent");
        super.onNewIntent(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var;
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "onResume");
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "Handler jump");
        if (this.f262634d) {
            return;
        }
        this.f262634d = true;
        android.content.Intent intent = getIntent();
        if (intent.getIntExtra("key_action_type", 200001) == 200002) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "start to restore the purchase!");
            this.f262635e = 3;
            this.f262639i.e(this, true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "start to doScene!");
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e eVar = this.f262640m;
        java.lang.String stringExtra = intent.getStringExtra("key_product_id");
        eVar.f262696l = stringExtra;
        ((java.util.ArrayList) eVar.f262695k).add(stringExtra);
        this.f262640m.f262692h = intent.getStringExtra("key_price");
        this.f262640m.f262693i = intent.getStringExtra("key_currency_type");
        java.lang.String stringExtra2 = intent.getStringExtra("key_ext_info");
        this.f262640m.f262689e = intent.getIntExtra("key_count", 1);
        java.lang.String stringExtra3 = intent.getStringExtra("key_appid");
        java.lang.String stringExtra4 = intent.getStringExtra("key_desc");
        java.lang.String stringExtra5 = intent.getStringExtra("key_busiid");
        this.f262640m.f262699o = intent.getStringExtra("key_virtual_pay_sign");
        this.f262640m.f262700p = intent.getStringExtra("key_attach");
        this.f262640m.f262701q = intent.getStringExtra("key_extInfo");
        this.f262640m.f262702r = intent.getIntExtra("key_wxAppScene", -1);
        this.f262640m.f262703s = intent.getIntExtra("key_wxAppRawScene", -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e eVar2 = this.f262640m;
        int a17 = this.f262639i.a();
        if (eVar2.f262698n) {
            try {
                m1Var = new nt4.m(a17, stringExtra3, eVar2.f262692h, stringExtra4, eVar2.f262689e, eVar2.f262693i, 13, stringExtra5, eVar2.f262699o, eVar2.f262700p, eVar2.f262701q);
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IapData", e17, "NetSceneGetAndroidIapPackage Error priceLevel:" + eVar2.f262692h, new java.lang.Object[0]);
                m1Var = null;
            }
            i17 = -1;
        } else {
            java.lang.String str = eVar2.f262696l;
            java.lang.String str2 = eVar2.f262692h;
            java.lang.String str3 = eVar2.f262693i;
            int i18 = eVar2.f262689e;
            i17 = -1;
            m1Var = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b1(str, str2, str3, i18, a17, stringExtra2);
        }
        if (m1Var != null) {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(m1Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletIapUI", "getPrepareNetScene error netScene is null");
        this.f262636f = 1002;
        nt4.f a18 = nt4.f.a(8);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_err_code", a18.f421356a);
        intent2.putExtra("key_err_msg", a18.f421357b);
        setResult(i17, intent2);
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
    
        if (r1.f295411i == 0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r17, int r18, java.lang.String r19, com.p314xaae8f345.mm.p944x882e457a.m1 r20) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
