package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI */
/* loaded from: classes9.dex */
public class ActivityC19168xd4c44a02 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o f262617f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 f262619h;

    /* renamed from: m, reason: collision with root package name */
    public int f262621m;

    /* renamed from: o, reason: collision with root package name */
    public int f262623o;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f262629u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f262630v;

    /* renamed from: d, reason: collision with root package name */
    public boolean f262615d = false;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f262616e = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.m1 f262618g = null;

    /* renamed from: i, reason: collision with root package name */
    public final int f262620i = hashCode() & 65535;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f262622n = "";

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3622x83841d6f f262624p = null;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f262625q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f262626r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f262627s = 0;

    /* renamed from: t, reason: collision with root package name */
    public android.content.Intent f262628t = null;

    public ActivityC19168xd4c44a02() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f262629u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI.2
            {
                this.f39173x3fe91575 = 520089918;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e2 = c6249x2aa12f2e;
                am.s10 s10Var = c6249x2aa12f2e2.f136498g;
                if (s10Var.f89398e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBrandUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                    return false;
                }
                android.content.Intent intent = s10Var.f89394a;
                if (intent != null && intent.getIntExtra("payScene", 0) == 8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBrandUI", "WalletPayResultEvent is from kinda offline pay");
                    return false;
                }
                am.s10 s10Var2 = c6249x2aa12f2e2.f136498g;
                int i17 = s10Var2.f89399f;
                com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02.this;
                if (i17 == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "comeFrom walletmix, finish");
                    activityC19168xd4c44a02.setResult(s10Var2.f89396c, s10Var2.f89394a);
                    activityC19168xd4c44a02.finish();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onPayEnd payResult:%s, reqKey:%s,  comeFrom:%s", java.lang.Integer.valueOf(s10Var2.f89396c), s10Var2.f89397d, java.lang.Integer.valueOf(s10Var2.f89399f));
                com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o oVar = activityC19168xd4c44a02.f262617f;
                if (oVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onPayEnd getGenPrepayFuncId:%d, getGenPrepayReqKey:%s,appbrandScene:%s", java.lang.Integer.valueOf(oVar.a()), activityC19168xd4c44a02.f262617f.c(), activityC19168xd4c44a02.f262622n);
                }
                if (activityC19168xd4c44a02.f262617f.a() != 398) {
                    activityC19168xd4c44a02.setResult(s10Var2.f89396c, s10Var2.f89394a);
                    if (s10Var2.f89399f != 2) {
                        activityC19168xd4c44a02.V6(s10Var2.f89396c, s10Var2.f89394a);
                    }
                    activityC19168xd4c44a02.finish();
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s10Var2.f89397d) || !s10Var2.f89397d.equalsIgnoreCase(activityC19168xd4c44a02.f262617f.c()) || s10Var2.f89399f != 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "FuncId %d,is not current request key || comeFrom:%s is not FINISH", java.lang.Integer.valueOf(activityC19168xd4c44a02.f262617f.a()), java.lang.Integer.valueOf(s10Var2.f89399f));
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s10Var2.f89397d) && s10Var2.f89397d.equalsIgnoreCase(activityC19168xd4c44a02.f262617f.c()) && s10Var2.f89396c == 0) {
                        activityC19168xd4c44a02.finish();
                    }
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19168xd4c44a02.f262622n) || !activityC19168xd4c44a02.f262622n.equalsIgnoreCase("key_from_scene_appbrandgame")) {
                    activityC19168xd4c44a02.setResult(s10Var2.f89396c, s10Var2.f89394a);
                    activityC19168xd4c44a02.V6(s10Var2.f89396c, s10Var2.f89394a);
                    activityC19168xd4c44a02.finish();
                } else {
                    activityC19168xd4c44a02.U6(s10Var2.f89396c, s10Var2.f89394a);
                }
                return true;
            }
        };
        this.f262630v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6237x853c614e>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI.3
            {
                this.f39173x3fe91575 = -917791906;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6237x853c614e c6237x853c614e) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02.this;
                android.app.Dialog dialog = activityC19168xd4c44a02.f262616e;
                if (dialog == null) {
                    return true;
                }
                dialog.dismiss();
                activityC19168xd4c44a02.f262616e = null;
                return true;
            }
        };
    }

    public final boolean T6() {
        java.lang.String substring;
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        java.lang.String str = this.f262619h.f273667i;
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf("prepay_id=");
        java.lang.String str2 = null;
        if (indexOf != -1 && (substring = str.substring(indexOf + 10)) != null) {
            int indexOf2 = substring.indexOf("&");
            str2 = indexOf2 == -1 ? substring : substring.substring(0, indexOf2);
        }
        if (str2 == null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "isPrefixDisableKinda: %s", str2);
        if (str2.startsWith("tax_")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "prepay_id starts With tax_");
            com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "open KindaTaxPaySwitch");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "isPrefixDisableKinda :%s", java.lang.Boolean.FALSE);
        return true;
    }

    public final void U6(int i17, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "sendMiniAppPayResult result:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6250xfea32d85 c6250xfea32d85 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6250xfea32d85();
        am.t10 t10Var = c6250xfea32d85.f136499g;
        t10Var.f89494a = intent;
        t10Var.f89497d = 1;
        t10Var.f89496c = "key_from_scene_appbrandgame";
        t10Var.f89495b = i17;
        t10Var.f89498e = this.f262623o;
        c6250xfea32d85.e();
    }

    public void V6(int i17, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "sendPaySuccessAheadCallbackResult result:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = this.f262619h;
        if (c19761xc2874b62 == null || c19761xc2874b62.X == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        if (intent.getExtras() == null) {
            intent.putExtras(new android.os.Bundle());
        }
        this.f262619h.X.b(i17, intent.getExtras());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onFinish");
        super.finish();
        if (getIntent().getBooleanExtra("needResultEvent", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "publish jsapi pay end event");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5650xe1b05359 c5650xe1b05359 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5650xe1b05359();
            int intExtra = getIntent().getIntExtra("requestCode", 0);
            am.rh rhVar = c5650xe1b05359.f135975g;
            rhVar.f89349c = intExtra;
            rhVar.f89347a = this.f262628t;
            rhVar.f89348b = this.f262627s;
            c5650xe1b05359.e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onActivityResultresultCode : " + i18 + " requestCode: " + i17);
        if (i18 == -1 && i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "get result to callback? " + intent.getStringExtra("test"));
        }
        if (!this.f262626r || i17 != 4 || intent == null) {
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onActivityResult For Face Action,resultCode : " + i18);
        boolean z17 = false;
        int intExtra = intent.getIntExtra("err_code", 0);
        int intExtra2 = intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        int intExtra3 = intent.getIntExtra("countFace", 0);
        long longExtra = intent.getLongExtra("totalTime", 0L);
        int intExtra4 = intent.getIntExtra("err_type", 6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "errCode： " + intExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "scene： " + intExtra2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "countFace： " + intExtra3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "totalTime： " + longExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "errorType： " + intExtra4);
        if (i18 == -1) {
            if (this.f262624p == null || intent.getExtras() == null) {
                return;
            }
            this.f262624p.mo28451x2e7a5e(false, intent.getExtras().getString("token"), intExtra, "");
            this.f262624p = null;
            return;
        }
        if (this.f262624p != null && intent.getExtras() != null) {
            java.lang.String string = intent.getExtras().getString("click_other_verify_btn");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && string.equalsIgnoreCase("yes")) {
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "isClickOtherVerify: %s", string);
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "check face failed, click other verify");
                this.f262624p.mo28451x2e7a5e(true, "", intExtra, "");
                this.f262624p = null;
            }
        }
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "resultCode：RESULT_CANCELED");
            com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619 = this.f262625q;
            if (abstractC3623x3b485619 != null) {
                abstractC3623x3b485619.mo25801x2e7a5e();
                this.f262625q = null;
            }
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f262619h = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62) getIntent().getParcelableExtra("WalletJsapiData");
        if (getWindow() != null) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(0);
        }
        if (this.f262619h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBrandUI", "no jsapi data");
            finish();
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).Ai();
        cu5.b.b();
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = this.f262619h;
        java.lang.String str = c19761xc2874b62.F;
        if (str != null) {
            this.f262622n = str;
        }
        this.f262621m = c19761xc2874b62.f273675t;
        if (this.f262622n.equalsIgnoreCase("key_from_scene_appbrandgame")) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b622 = this.f262619h;
            this.f262623o = c19761xc2874b622.f273676u;
            c19761xc2874b622.f273676u = 0;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.f295484a = java.lang.System.currentTimeMillis();
        int i17 = this.f262619h.A;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onCreate appbrandScene:%s,payScene:%d,requestCode:%d", this.f262622n, java.lang.Integer.valueOf(this.f262621m), java.lang.Integer.valueOf(this.f262623o));
        if (c01.z1.I()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "hy: do pay with payu");
            this.f262617f = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.u(this);
        } else if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "hy: do pay with h5");
            this.f262617f = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.l(this);
        } else if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "do pay with mall");
            this.f262617f = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.x(this);
        } else if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "do pay with component");
            this.f262617f = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.t(this);
        } else if (T6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "do pay with kinda");
            this.f262617f = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.r(this);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "hy: do pay with tenpay");
            this.f262617f = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.w(this);
        }
        this.f262629u.mo48813x58998cd();
        this.f262630v.mo48813x58998cd();
        if (this.f262617f instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onCreate: do pay with kinda");
        } else {
            gm0.j1.i();
            gm0.j1.n().f354821b.a(this.f262617f.a(), this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onCreate " + hashCode());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onDestroy");
        super.onDestroy();
        if (this.f262617f instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onDestroy: do pay with kinda");
        } else {
            gm0.j1.i();
            gm0.j1.n().f354821b.q(this.f262617f.a(), this);
        }
        this.f262629u.mo48814x2efc64();
        this.f262630v.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onNewIntent");
        super.onNewIntent(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onRestoreInstanceState " + hashCode());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onResume");
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "Handler jump intercept = %b,taskid = %d,parentName = %s", java.lang.Boolean.valueOf(this.f262615d), java.lang.Integer.valueOf(getTaskId()), getCallingActivity());
        if (this.f262615d) {
            return;
        }
        this.f262615d = true;
        this.f262618g = this.f262617f.b();
        android.app.Dialog dialog = this.f262616e;
        if (dialog != null) {
            dialog.dismiss();
            this.f262616e = null;
        }
        if (T6() || this.f262619h.A == 4) {
            return;
        }
        this.f262616e = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.i(this, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.k(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "onSaveInstanceState " + hashCode());
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "hy: brandui on scene end. errType: %d, errCode: %d, errMsg:%s scene %s _scene %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var, this.f262618g);
        if (m1Var.mo808xfb85f7b0() == this.f262617f.a() && m1Var == this.f262618g) {
            this.f262617f.mo73991x76e0bfae(i17, i18, str, m1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        android.app.Dialog dialog = this.f262616e;
        if (dialog != null) {
            dialog.dismiss();
            this.f262616e = null;
        }
    }
}
