package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI */
/* loaded from: classes9.dex */
public class ActivityC17127x6da828fa extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f238634t = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f238635d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f238636e;

    /* renamed from: f, reason: collision with root package name */
    public long f238637f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f238638g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f238639h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f238640i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f238641m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f238642n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f238643o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f238644p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f238645q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f238646r = true;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f238647s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.1
        {
            this.f39173x3fe91575 = -1359897903;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1 c5207x4c38dee1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1 c5207x4c38dee12 = c5207x4c38dee1;
            if (c5207x4c38dee12 == null) {
                return false;
            }
            am.e1 e1Var = c5207x4c38dee12.f135547g;
            if (!e1Var.f88051c) {
                return false;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(e1Var.f88054f);
            final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17127x6da828fa activityC17127x6da828fa = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17127x6da828fa.this;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "kinda callback data.pay_fail_reason :%s,local req_key:%s, pay key :%s", valueOf, activityC17127x6da828fa.f238640i, e1Var.f88049a);
            if (!activityC17127x6da828fa.f238640i.equals(e1Var.f88049a)) {
                return false;
            }
            activityC17127x6da828fa.m83114xe5d7a18f();
            activityC17127x6da828fa.mo48627xce38d9a();
            int i17 = e1Var.f88054f;
            com.p314xaae8f345.mm.ui.s2 s2Var = com.p314xaae8f345.mm.ui.s2.FAIL;
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 == 3) {
                            activityC17127x6da828fa.m83090x14f40144(5047);
                            activityC17127x6da828fa.m83099x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.f0(activityC17127x6da828fa.f238638g, activityC17127x6da828fa.f238639h, activityC17127x6da828fa.f238637f, activityC17127x6da828fa.f238641m), false);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "goto busi result");
                            android.content.Intent intent = new android.content.Intent(activityC17127x6da828fa, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358.class);
                            intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, activityC17127x6da828fa.f238635d);
                            intent.putExtra("key_trans_id", activityC17127x6da828fa.f238639h);
                            intent.putExtra("pay_scene", 65);
                            intent.putExtra("key_money", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j("" + activityC17127x6da828fa.f238637f, "100", 2, java.math.RoundingMode.HALF_UP));
                            intent.putExtra("key_succ_show_avatar_url", activityC17127x6da828fa.f238643o);
                            intent.putExtra("key_rcver_name", activityC17127x6da828fa.f238642n);
                            intent.putExtra("key_open_result_receiver", new android.os.ResultReceiver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.6
                                @Override // android.os.ResultReceiver
                                public void onReceiveResult(int i18, android.os.Bundle bundle) {
                                    if (i18 == -1) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "pay success");
                                        com.p314xaae8f345.mm.ui.s2 s2Var2 = com.p314xaae8f345.mm.ui.s2.SUCCESS;
                                        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17127x6da828fa.f238634t;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17127x6da828fa.this.V6(s2Var2, "");
                                    }
                                }
                            });
                            r45.yr yrVar = new r45.yr();
                            yrVar.f472843d = activityC17127x6da828fa.f238638g;
                            yrVar.f472844e = activityC17127x6da828fa.f238639h;
                            yrVar.f472845f = activityC17127x6da828fa.f238637f;
                            yrVar.f472846g = activityC17127x6da828fa.f238641m;
                            try {
                                intent.putExtra("AfterPlaceOrderCommReqC2C", yrVar.mo14344x5f01b1f6());
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PersonalPayRemittanceUI", e17, "", new java.lang.Object[0]);
                            }
                            activityC17127x6da828fa.startActivityForResult(intent, 1);
                        } else if (i17 != 4) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "unknown pay failreason");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17127x6da828fa.U6(activityC17127x6da828fa);
                            activityC17127x6da828fa.V6(s2Var, "pay fail");
                        }
                        return true;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17127x6da828fa.U6(activityC17127x6da828fa);
                activityC17127x6da828fa.V6(com.p314xaae8f345.mm.ui.s2.CANCEL, "");
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17127x6da828fa.U6(activityC17127x6da828fa);
            activityC17127x6da828fa.V6(s2Var, "pay fail");
            return true;
        }
    };

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17127x6da828fa activityC17127x6da828fa) {
        activityC17127x6da828fa.m83090x14f40144(5003);
        activityC17127x6da828fa.m83099x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e0(activityC17127x6da828fa.f238638g, activityC17127x6da828fa.f238639h, activityC17127x6da828fa.f238637f, activityC17127x6da828fa.f238641m), false);
    }

    public final void V6(java.lang.Enum r47, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "setActivityResultData result :%s , errmsg : %s", r47, str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_pay_result", r47);
        intent.putExtra("key_result_error_msg", str);
        setResult(-1, intent);
        finish();
    }

    public final void W6(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "showErrorDialog,errMsg:%s", str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
        u1Var.u("");
        u1Var.g(str);
        u1Var.a(false);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.ke6);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.o(this, str2));
        u1Var.q(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = u1Var.f293531c;
        if (j0Var != null) {
            this.f238645q = j0Var;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f238644p;
        if (z2Var != null) {
            z2Var.B();
            this.f238644p = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        V6(com.p314xaae8f345.mm.ui.s2.CANCEL, "");
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "onCreate（）");
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().o();
        }
        this.f238635d = getIntent().getStringExtra("key_app_id");
        java.lang.String stringExtra = getIntent().getStringExtra("out_prepay_id");
        this.f238636e = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "app_id:%s，out_prepay_id：%s", this.f238635d, stringExtra);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f238636e)) {
            V6(com.p314xaae8f345.mm.ui.s2.FAIL, "out_prepay_id is empty");
        }
        m83090x14f40144(4912);
        m83099x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h0(this.f238635d, this.f238636e), true);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "onDestroy()");
        super.onDestroy();
        this.f238647s.mo48814x2efc64();
        m83121xf6ff5b27(4912);
        m83121xf6ff5b27(4304);
        m83121xf6ff5b27(5003);
        m83121xf6ff5b27(5047);
        m83121xf6ff5b27(4587);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "onPause()");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "onResume()");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "on Scene End：errType %s , errCode：%s，errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h0) {
            m83114xe5d7a18f();
            mo48627xce38d9a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "scene instanceof NetSceneC2CRequestPayment");
            if (i17 == 0 && i18 == 0) {
                r45.lr5 lr5Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h0) m1Var).f238384f;
                if (lr5Var == null) {
                    lr5Var = new r45.lr5();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "NetSceneC2CRequestPayment on SceneEnd ok，retcode:%s, retMsg：%s", java.lang.Integer.valueOf(lr5Var.f461316d), lr5Var.f461317e);
                if (lr5Var.f461316d == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "showHalfDialog：res.title：%s,res.head_img：%s，res.rcvr_info：%s，res.total_amount：%s，res.ok_button_wording：%s", lr5Var.f461318f, lr5Var.f461319g, lr5Var.f461320h, java.lang.Long.valueOf(lr5Var.f461321i), lr5Var.f461322m);
                    this.f238644p = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(mo55332x76847179(), 2, 3);
                    android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c9i, null);
                    ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.aa_)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m(this));
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b4q);
                    textView.setText(lr5Var.f461318f);
                    android.view.View inflate2 = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c9h, null);
                    com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    this.f238644p.s(inflate);
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) inflate2.findViewById(com.p314xaae8f345.mm.R.id.b4n);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lr5Var.f461319g)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "res.head_img == null");
                    } else {
                        c19659x677e0913.m75394x3288e7c1(true);
                        c19659x677e0913.m75395x7083e041(0.1f);
                        c19659x677e0913.m75396xca029dad(lr5Var.f461319g);
                        this.f238643o = lr5Var.f461319g;
                    }
                    ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.b4p)).setText(lr5Var.f461320h);
                    this.f238642n = lr5Var.f461320h;
                    android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.b4o);
                    this.f238637f = lr5Var.f461321i;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0r));
                    sb6.append(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j("" + lr5Var.f461321i, "100", 2, java.math.RoundingMode.HALF_UP));
                    textView2.setText(sb6.toString());
                    this.f238644p.j(inflate2);
                    this.f238644p.y(lr5Var.f461322m);
                    this.f238644p.x(0);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f238644p;
                    z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n(this);
                    z2Var.C();
                } else {
                    W6(lr5Var.f461317e, "request payment fail.");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "NetSceneF2FMinniProgramConfirm on SceneEnd faile show error dialog ");
                W6(str, "request payment fail.");
            }
            return true;
        }
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g0)) {
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "scene instanceof NetScenePersonalPayCancelPay");
            }
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "scene instanceof NetSceneC2CPlaceOrder");
        if (i17 == 0 && i18 == 0) {
            r45.fs fsVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g0) m1Var).f238359f;
            if (fsVar == null) {
                fsVar = new r45.fs();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "NetSceneC2CPlaceOrder on SceneEnd ok，retcode:%s, retMsg：%s", java.lang.Integer.valueOf(fsVar.f456110d), fsVar.f456111e);
            if (fsVar.f456110d != 0) {
                m83114xe5d7a18f();
                mo48627xce38d9a();
                W6(fsVar.f456111e, "place order fail.");
            } else {
                if (fsVar.f456112f != null) {
                    m83114xe5d7a18f();
                    mo48627xce38d9a();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "response.jump_remind != null");
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = this.f238644p;
                    if (z2Var2 != null) {
                        z2Var2.B();
                        this.f238644p = null;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_result_pay_result", com.p314xaae8f345.mm.ui.s2.FAIL);
                    intent.putExtra("key_result_error_msg", "intercept by jump remind");
                    setResult(-1, intent);
                    com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 d17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0.d(fsVar.f456112f);
                    d17.f295504j = false;
                    d17.g(this, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l(this));
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "startPay");
                this.f238638g = fsVar.f456113g;
                this.f238639h = fsVar.f456115i;
                this.f238641m = fsVar.f456117n;
                java.lang.String str2 = fsVar.f456114h;
                this.f238640i = str2;
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
                c19760x34448d56.f273647m = str2;
                c19760x34448d56.L = 1;
                c19760x34448d56.f273642e = 65;
                c19760x34448d56.f273644g = getIntent().getIntExtra("payChannel", 0);
                android.os.Bundle bundle = new android.os.Bundle();
                c19760x34448d56.f273655u = bundle;
                bundle.putString("cashier_desc", fsVar.f456116m);
                c19760x34448d56.f273655u.putString("personalpay_order_id", fsVar.f456113g);
                c19760x34448d56.f273655u.putString("trans_id", fsVar.f456115i);
                c19760x34448d56.f273655u.putString("placeorder_ext", fsVar.f456117n);
                ((h45.q) i95.n0.c(h45.q.class)).mo24830x8e9ecb12(this, c19760x34448d56);
            }
        } else {
            m83114xe5d7a18f();
            mo48627xce38d9a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "NetSceneC2CPlaceOrder on SceneEnd faile show error dialog ");
            W6(str, "place order fail.");
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "onWindowFocusChanged");
        if (this.f238646r && (z2Var = this.f238644p) != null && !z2Var.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "onWindowFocusChanged：mHalfBottomDialog isShowHalfDialog %s, finish Activity", java.lang.Boolean.valueOf(this.f238644p.h()));
            this.f238644p = null;
            V6(com.p314xaae8f345.mm.ui.s2.CANCEL, "");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19821, 3, this.f238635d, 0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f238645q;
        if (j0Var != null && !j0Var.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonalPayRemittanceUI", "onWindowFocusChanged isShowing:%s,finish Activity", java.lang.Boolean.valueOf(this.f238645q.isShowing()));
            this.f238645q = null;
            V6(com.p314xaae8f345.mm.ui.s2.FAIL, "dialog fail");
        }
        super.onWindowFocusChanged(z17);
    }
}
