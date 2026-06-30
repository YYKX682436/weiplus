package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI */
/* loaded from: classes9.dex */
public class ActivityC19167xed6273d0 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f262595d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f262596e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 f262597f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11303x34488478 f262598g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6.Options f262599h;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f262605q;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f262611w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f262612x;

    /* renamed from: i, reason: collision with root package name */
    public boolean f262600i = false;

    /* renamed from: m, reason: collision with root package name */
    public int f262601m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f262602n = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f262603o = false;

    /* renamed from: p, reason: collision with root package name */
    public long f262604p = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f262606r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f262607s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f262608t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f262609u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f262610v = false;

    public ActivityC19167xed6273d0() {
        this.f262595d = "MicroMsg.OrderHandlerUI";
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f262611w = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI.1
            {
                this.f39173x3fe91575 = 520089918;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e2 = c6249x2aa12f2e;
                com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19167xed6273d0 activityC19167xed6273d0 = com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19167xed6273d0.this;
                if (c6249x2aa12f2e2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f(activityC19167xed6273d0.f262595d, "event == null!!!");
                } else {
                    am.s10 s10Var = c6249x2aa12f2e2.f136498g;
                    if (s10Var.f89398e) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f(activityC19167xed6273d0.f262595d, "WalletPayResultEvent is from kinda, ScanQRCodePay");
                    } else {
                        activityC19167xed6273d0.f262600i = true;
                        java.lang.String str = activityC19167xed6273d0.f262595d;
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(s10Var.f89396c);
                        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(activityC19167xed6273d0.f262603o);
                        java.lang.String str2 = activityC19167xed6273d0.f262605q;
                        java.lang.String str3 = s10Var.f89397d;
                        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(s10Var.f89395b);
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onPayEnd, isOk = %s notifyPay %s reqKey %s %s, manualresult %s, from %s", valueOf, valueOf2, str2, str3, valueOf3, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
                        if (!activityC19167xed6273d0.f262603o) {
                            int i17 = s10Var.f89395b;
                            if (i17 == 1000) {
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s10Var.f89397d) && s10Var.f89397d.equals(activityC19167xed6273d0.f262605q)) {
                                    activityC19167xed6273d0.finish();
                                }
                            } else if (i17 != 1001) {
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s10Var.f89397d) || s10Var.f89397d.equals(activityC19167xed6273d0.f262605q)) {
                                    if (s10Var.f89396c == -1) {
                                        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11303x34488478 c11303x34488478 = activityC19167xed6273d0.f262598g;
                                        c11303x34488478.f32867xa7c470f2 = 0;
                                        if (activityC19167xed6273d0.f262610v) {
                                            c11303x34488478.f33266xc8c39b0f = activityC19167xed6273d0.f262602n;
                                        } else {
                                            android.content.Intent intent = s10Var.f89394a;
                                            if (intent != null) {
                                                android.os.Bundle extras = intent.getExtras();
                                                java.lang.String string = extras.getString("intent_pay_app_url");
                                                activityC19167xed6273d0.f262602n = extras.getString("intent_wap_pay_jump_url");
                                                activityC19167xed6273d0.f262598g.f33266xc8c39b0f = string;
                                            }
                                        }
                                    } else {
                                        activityC19167xed6273d0.f262598g.f32867xa7c470f2 = -2;
                                    }
                                    if (activityC19167xed6273d0.f262601m == 1) {
                                        activityC19167xed6273d0.X6(activityC19167xed6273d0, activityC19167xed6273d0.f262602n);
                                    } else {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.j.a(activityC19167xed6273d0, activityC19167xed6273d0.f262596e, activityC19167xed6273d0.f262598g, activityC19167xed6273d0.f262599h);
                                    }
                                    activityC19167xed6273d0.f262603o = true;
                                    activityC19167xed6273d0.finish();
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC19167xed6273d0.f262595d, "pass notify this req1 %s req2 %s", s10Var.f89397d, activityC19167xed6273d0.f262605q);
                                }
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f262612x = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5665x154acf09>(a0Var) { // from class: com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI.2
            {
                this.f39173x3fe91575 = -1268509959;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5665x154acf09 c5665x154acf09) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5665x154acf09 c5665x154acf092 = c5665x154acf09;
                com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19167xed6273d0 activityC19167xed6273d0 = com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19167xed6273d0.this;
                java.lang.String str = activityC19167xed6273d0.f262595d;
                am.fi fiVar = c5665x154acf092.f135989g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "KindaGotoExternAppEventCallback event.data.returnKey:%s, event.data.errcode：%d", fiVar.f88212b, java.lang.Integer.valueOf(fiVar.f88211a));
                com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11303x34488478 c11303x34488478 = activityC19167xed6273d0.f262598g;
                am.fi fiVar2 = c5665x154acf092.f135989g;
                c11303x34488478.f33266xc8c39b0f = fiVar2.f88212b;
                c11303x34488478.f32867xa7c470f2 = fiVar2.f88211a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.j.a(activityC19167xed6273d0, activityC19167xed6273d0.f262596e, c11303x34488478, activityC19167xed6273d0.f262599h);
                activityC19167xed6273d0.finish();
                return true;
            }
        };
        java.lang.String str = "MicroMsg.OrderHandlerUI@" + hashCode();
        this.f262595d = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "OrderHandlerUI constructor");
    }

    public final void T6(int i17, java.lang.String str, boolean z17) {
        if (this.f262601m != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.j.a(this, this.f262596e, this.f262598g, this.f262599h);
            finish();
        } else if (!android.text.TextUtils.isEmpty(this.f262602n) || !z17) {
            X6(this, this.f262602n);
            finish();
        } else {
            mo67598xf0aced2e(0);
            if (android.text.TextUtils.isEmpty(str)) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
            }
            db5.e1.G(this, str, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.i(this));
        }
    }

    public final java.lang.String U6() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_app_packagename_safe");
        java.lang.String stringExtra2 = getIntent().getStringExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8);
        java.lang.String str = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) ? stringExtra : stringExtra2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "getAppPayPackageName new：%s，old：%s,final：%s", stringExtra, stringExtra2, str);
        return str;
    }

    public final void V6() {
        h45.f0 f0Var;
        if (!((h45.q) i95.n0.c(h45.q.class)).mo24755x47b8ea10(this)) {
            db5.e1.y(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.knf), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.apu), new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.g(this));
            return;
        }
        synchronized (h45.f0.class) {
            f0Var = h45.e0.f360475a;
        }
        java.lang.Object obj = java.lang.Boolean.FALSE;
        java.util.HashMap hashMap = f0Var.f360477a;
        if (hashMap.containsKey("key_pay_offline_is_auth_doing")) {
            obj = hashMap.get("key_pay_offline_is_auth_doing");
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            db5.e1.y(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.knf), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.apu), new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.h(this));
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5835xb3e6e063 c5835xb3e6e063 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5835xb3e6e063();
        c5835xb3e6e063.f136143g.f88014a = 1;
        c5835xb3e6e063.e();
    }

    public final com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 W6() {
        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 jointPayReq = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(getIntent().getExtras(), "_wxapi_command_type", 0) == 27 ? new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11304xacd729bf.JointPayReq() : new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6();
        jointPayReq.mo48425x63aa4ccc(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(getIntent()));
        return jointPayReq;
    }

    public final void X6(android.content.Context context, java.lang.String str) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f262595d, "startOuterApp context == null");
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f262595d, "startOuterApp callbackUrl is empty");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "startOuterApp callbackUrl is " + str);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        intent.addFlags(268435456);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context, intent, true, false)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI", "startOuterApp", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI", "startOuterApp", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f262595d, e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        java.lang.String str = this.f262595d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f262609u);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "finish hasFinish %s %s", valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        if (this.f262609u) {
            return;
        }
        this.f262609u = true;
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c8t;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "onActivityResult resp %s, onPayEndCalled %s", this.f262598g, java.lang.Boolean.valueOf(this.f262600i));
        if (intent != null) {
            int intExtra = intent.getIntExtra("key_pay_reslut_type", 0);
            if (intExtra == 1000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "onActivityResult resp %s, onPayEndCalled %s payResultType %s", this.f262598g, java.lang.Boolean.valueOf(this.f262600i), java.lang.Integer.valueOf(intExtra));
                finish();
                return;
            } else if (intExtra == 1001) {
                return;
            }
        }
        if (this.f262598g == null || this.f262600i) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f262595d, "onActivityResult, onPayEnd not called");
        this.f262598g.f32867xa7c470f2 = -2;
        T6(0, "", false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "onConfigurationChanged");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = "MicroMsg.OrderHandlerUI@" + hashCode();
        this.f262595d = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCreate");
        this.f262604p = getIntent().getLongExtra("wallet_pay_key_check_time", -1L);
        mo67598xf0aced2e(8);
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.f295484a = java.lang.System.currentTimeMillis();
        mo78514x143f1b92().G0(0);
        this.f262611w.mo48813x58998cd();
        this.f262612x.mo48813x58998cd();
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        this.f262606r = true;
        this.f262607s = true;
        com.p314xaae8f345.mm.p2802xd031a825.b a17 = com.p314xaae8f345.mm.p2802xd031a825.b.a();
        a17.getClass();
        this.f262608t = a17.d(e42.d0.clicfg_kinda_sns_app_pay_open_android, false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).Ai();
        cu5.b.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "onDestroy");
        gm0.j1.i();
        gm0.j1.n().f354821b.q(397, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(2655, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pe.f34670x366c91de, this);
        this.f262611w.mo48814x2efc64();
        this.f262612x.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "onNewIntent");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "onPause");
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "onRestart");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:64|(2:66|(6:70|(1:72)(1:81)|(1:74)(1:80)|(1:76)(1:79)|77|78))|82|(1:84)(1:165)|85|(2:87|(6:89|(1:91)(1:100)|(1:93)(1:99)|(1:95)(1:98)|96|97)(2:101|(6:103|(1:105)(1:114)|(1:107)(1:113)|(1:109)(1:112)|110|111)(1:115)))(2:162|(11:164|117|118|119|121|122|123|124|(1:126)|127|(6:133|(3:135|(1:146)|(2:140|141))|147|(2:149|(1:151)(2:152|(1:154)))|155|156)(2:131|132)))|116|117|118|119|121|122|123|124|(0)|127|(1:129)|133|(0)|147|(0)|155|156) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02cb, code lost:
    
        r3 = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r28.f262595d, r0, "", new java.lang.Object[0]);
        r0 = r15;
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02c9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ca, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19167xed6273d0.onResume():void");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 397 || m1Var.mo808xfb85f7b0() == 2655 || m1Var.mo808xfb85f7b0() == 283) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
            if (this.f262601m == 1) {
                c19760x34448d56.f273642e = 36;
            } else {
                c19760x34448d56.f273642e = 2;
            }
            gm0.j1.i();
            gm0.j1.n().f354821b.q(m1Var.mo808xfb85f7b0(), this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "onSceneEnd, errType = " + i17 + ", errCode = " + i18);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((nt4.n) m1Var).f421380e.f152244b.f152233a;
            r45.s55 s55Var = (r45.s55) fVar;
            this.f262602n = s55Var == null ? null : s55Var.f467057h;
            if (i17 == 4 && i18 == -5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f262595d, "onSceneEnd, auth access denied");
                this.f262598g.f32867xa7c470f2 = -1;
                T6(i18, str, true);
                int i19 = c19760x34448d56.f273642e;
                com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 c11302x8e12daf6 = this.f262597f;
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.b(i19, c11302x8e12daf6 != null ? c11302x8e12daf6.f33257xb3bbab20 : "", i18);
                return;
            }
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f262595d, "onSceneEnd,  PayAuthApp is failed!");
                this.f262598g.f32867xa7c470f2 = -1;
                T6(i18, str, true);
                int i27 = c19760x34448d56.f273642e;
                com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 c11302x8e12daf62 = this.f262597f;
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.b(i27, c11302x8e12daf62 != null ? c11302x8e12daf62.f33257xb3bbab20 : "", i18);
                return;
            }
            r45.s55 s55Var2 = (r45.s55) fVar;
            int i28 = s55Var2 == null ? -1 : s55Var2.f467054e;
            r45.s55 s55Var3 = (r45.s55) fVar;
            java.lang.String str2 = s55Var3 == null ? null : s55Var3.f467055f;
            r45.s55 s55Var4 = (r45.s55) fVar;
            java.lang.String str3 = s55Var4 == null ? null : s55Var4.f467056g;
            r45.s55 s55Var5 = (r45.s55) fVar;
            java.lang.String str4 = s55Var5 == null ? null : s55Var5.f467053d;
            r45.s55 s55Var6 = (r45.s55) fVar;
            r45.v67 v67Var = s55Var6 != null ? s55Var6.f467058i : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "onSceneEnd, respErrCode = %d, respErrMsg = %s, respPrepayId = %s, respAppSource = %s", java.lang.Integer.valueOf(i28), str2, str3, str4);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f262595d, "onSceneEnd, respPrepayId is null");
                this.f262598g.f32867xa7c470f2 = -1;
                T6(i18, str, true);
                return;
            }
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.b(c19760x34448d56.f273642e, str3, i18);
            if (v67Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v67Var.f469486d)) {
                com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 c11302x8e12daf63 = this.f262597f;
                c19760x34448d56.f273649o = c11302x8e12daf63.f33251x58b7f1c;
                c19760x34448d56.f273647m = str3;
                c19760x34448d56.f273651q = c11302x8e12daf63.f33256x94f8d403;
                c19760x34448d56.f273650p = str4;
                c19760x34448d56.f273654t = str2;
                if (this.f262604p > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.mo68477x336bdfd8(641L, 1L, 1L, true);
                    g0Var.mo68477x336bdfd8(641L, 2L, java.lang.System.currentTimeMillis() - this.f262604p, true);
                    if (c19760x34448d56.f273655u == null) {
                        c19760x34448d56.f273655u = new android.os.Bundle();
                    }
                    c19760x34448d56.f273655u.putLong("wallet_pay_key_check_time", this.f262604p);
                }
                h45.a0.f(this, c19760x34448d56, 123);
            } else {
                this.f262610v = true;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("prepayId", str3);
                intent.putExtra("is_jsapi_offline_pay", false);
                intent.putExtra("pay_gate_url", v67Var.f469486d);
                intent.putExtra("need_dialog", v67Var.f469488f);
                intent.putExtra("dialog_text", v67Var.f469489g);
                intent.putExtra("max_count", v67Var.f469487e.f470941e);
                intent.putExtra("inteval_time", v67Var.f469487e.f470940d);
                intent.putExtra("default_wording", v67Var.f469487e.f470942f);
                j45.l.k(this, "wallet_core", ".ui.WalletMixOrderInfoUI", intent, true);
            }
            this.f262605q = str3;
            this.f262600i = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "onStart");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262595d, "onStop");
    }
}
