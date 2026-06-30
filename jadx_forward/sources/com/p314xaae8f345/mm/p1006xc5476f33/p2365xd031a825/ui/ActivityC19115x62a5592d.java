package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI */
/* loaded from: classes9.dex */
public class ActivityC19115x62a5592d extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f261537v = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f261538d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f261539e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ws f261540f;

    /* renamed from: g, reason: collision with root package name */
    public int f261541g;

    /* renamed from: q, reason: collision with root package name */
    public int f261548q;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f261551t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f261552u;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261542h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f261543i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f261544m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f261545n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f261546o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f261547p = null;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f261549r = null;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f261550s = null;

    public ActivityC19115x62a5592d() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f261551t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6267x36e7f58b>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI.3
            {
                this.f39173x3fe91575 = -704562821;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6267x36e7f58b c6267x36e7f58b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "WebViewCloseWindowEvent mean canceled by user");
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19115x62a5592d activityC19115x62a5592d = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19115x62a5592d.this;
                if (activityC19115x62a5592d.f261539e) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
                    java.lang.String str = activityC19115x62a5592d.f261542h;
                    am.s10 s10Var = c6249x2aa12f2e.f136498g;
                    s10Var.f89397d = str;
                    s10Var.f89396c = 0;
                    c6249x2aa12f2e.e();
                    activityC19115x62a5592d.finish();
                }
                return false;
            }
        };
        this.f261552u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6242xae18efa4>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI.4
            {
                this.f39173x3fe91575 = -1345618028;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6242xae18efa4 c6242xae18efa4) {
                boolean z17;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6242xae18efa4 c6242xae18efa42 = c6242xae18efa4;
                if (!(c6242xae18efa42 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6242xae18efa4)) {
                    return false;
                }
                mo48814x2efc64();
                am.k10 k10Var = c6242xae18efa42.f136490g;
                java.lang.String str = k10Var.f88649a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19115x62a5592d activityC19115x62a5592d = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19115x62a5592d.this;
                activityC19115x62a5592d.f261543i = str;
                activityC19115x62a5592d.f261544m = k10Var.f88650b;
                activityC19115x62a5592d.f261545n = k10Var.f88651c;
                activityC19115x62a5592d.f261546o = k10Var.f88652d;
                activityC19115x62a5592d.f261547p = k10Var.f88653e;
                int i17 = k10Var.f88654f;
                activityC19115x62a5592d.f261548q = i17;
                activityC19115x62a5592d.f261549r = k10Var.f88655g;
                activityC19115x62a5592d.f261550s = k10Var.f88656h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "WalletGetPaidOrderDetailEvent callback：prepayId:%s, payScene：%s, reqKey:%s", activityC19115x62a5592d.f261542h, java.lang.Integer.valueOf(i17), activityC19115x62a5592d.f261547p);
                if (activityC19115x62a5592d.W6(1)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "startOverseaWalletSuccPageUseCase is true, go kinda");
                } else {
                    if (activityC19115x62a5592d.f261548q == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19115x62a5592d.f261542h) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19115x62a5592d.f261547p) || activityC19115x62a5592d.f261547p.equals(activityC19115x62a5592d.f261542h))) {
                        activityC19115x62a5592d.m83096xe7b1ccf7(new ws4.a(activityC19115x62a5592d.f261543i, activityC19115x62a5592d.f261544m, activityC19115x62a5592d.f261545n, activityC19115x62a5592d.f261546o, activityC19115x62a5592d.f261547p, activityC19115x62a5592d.f261548q, activityC19115x62a5592d.f261549r, activityC19115x62a5592d.f261550s));
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    if (z17) {
                        activityC19115x62a5592d.f261539e = false;
                        activityC19115x62a5592d.U6(activityC19115x62a5592d, activityC19115x62a5592d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ktc), 0);
                    }
                }
                return true;
            }
        };
    }

    public final void U6(android.content.Context context, java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "showErrorAlert");
        if (!this.f261538d) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd c6273xbf9150fd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd();
            c6273xbf9150fd.f136522g.f89222a = i17;
            c6273xbf9150fd.e();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 G = db5.e1.G(context, str, "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c5(this, i17));
        if (G != null) {
            G.setCancelable(false);
        }
    }

    public final void V6(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.U(mo55332x76847179(), intent, 1);
        this.f261551t.mo48813x58998cd();
    }

    public final boolean W6(int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appid", this.f261543i);
        bundle.putString(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, this.f261544m);
        bundle.putString("nonce_str", this.f261545n);
        bundle.putString("package", this.f261546o);
        bundle.putInt("input_pay_scene", this.f261548q);
        bundle.putString("sign_type", this.f261549r);
        bundle.putString("pay_sign", this.f261550s);
        bundle.putString("req_key", this.f261547p);
        bundle.putInt("origin_pay_scene", i17);
        bundle.putString("order_id", this.f261542h);
        bundle.putInt("retry_max_count", this.f261540f.f470941e);
        bundle.putInt("retry_interval_seconds", this.f261540f.f470940d);
        bundle.putString("retry_default_wording", this.f261540f.f470942f);
        return ((h45.q) i95.n0.c(h45.q.class)).mo24823x64e17034(this, bundle);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "finish");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d2d;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == 0 && this.f261539e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "onActivityResult, mIsPending is true");
            this.f261552u.mo48814x2efc64();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
            java.lang.String str = this.f261542h;
            am.s10 s10Var = c6249x2aa12f2e.f136498g;
            s10Var.f89397d = str;
            s10Var.f89396c = 0;
            c6249x2aa12f2e.e();
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        r45.ws wsVar = new r45.ws();
        this.f261540f = wsVar;
        wsVar.f470941e = intent.getIntExtra("max_count", 3);
        this.f261540f.f470940d = intent.getIntExtra("inteval_time", 4);
        this.f261540f.f470942f = intent.getStringExtra("default_wording");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261540f.f470942f)) {
            this.f261540f.f470942f = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
        }
        this.f261541g = this.f261540f.f470941e;
        boolean booleanExtra = intent.getBooleanExtra("is_jsapi_offline_pay", false);
        this.f261538d = booleanExtra;
        this.f261539e = true;
        if (!booleanExtra) {
            java.lang.String stringExtra = intent.getStringExtra("pay_gate_url");
            boolean booleanExtra2 = intent.getBooleanExtra("need_dialog", false);
            java.lang.String stringExtra2 = intent.getStringExtra("dialog_text");
            java.lang.String stringExtra3 = intent.getStringExtra("prepayId");
            this.f261542h = stringExtra3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", " prepayId:%s ，need_dialog:%s", stringExtra3, java.lang.Boolean.valueOf(booleanExtra2));
            if (booleanExtra2) {
                db5.e1.u(this, stringExtra2, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a5(this, stringExtra), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b5(this)).setCancelable(false);
            } else {
                V6(stringExtra);
            }
            this.f261552u.mo48813x58998cd();
            return;
        }
        this.f261543i = getIntent().getStringExtra("appId");
        this.f261544m = getIntent().getStringExtra("timeStamp");
        this.f261545n = getIntent().getStringExtra("nonceStr");
        this.f261546o = getIntent().getStringExtra("packageExt");
        this.f261547p = getIntent().getStringExtra("reqKey");
        this.f261548q = getIntent().getIntExtra("payScene", -1);
        this.f261549r = getIntent().getStringExtra("signtype");
        this.f261550s = getIntent().getStringExtra("paySignature");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "start query offline walletmix succ page, prepayId:%s, payScene：%s, reqKey:%s", this.f261542h, java.lang.Integer.valueOf(this.f261548q), this.f261547p);
        if (W6(2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "startOverseaWalletSuccPageUseCase is true, go kinda");
        } else if (this.f261548q == 2 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261542h)) {
            m83096xe7b1ccf7(new ws4.a(this.f261543i, this.f261544m, this.f261545n, this.f261546o, this.f261547p, this.f261548q, this.f261549r, this.f261550s));
        } else {
            U6(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ktc), 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f261552u.mo48814x2efc64();
        this.f261551t.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof ws4.a)) {
            return false;
        }
        if (i17 == 0 && i18 == 0) {
            this.f261539e = false;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd c6273xbf9150fd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd();
            c6273xbf9150fd.f136522g.f89222a = -1;
            c6273xbf9150fd.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = ((ws4.a) m1Var).f530741e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", " go to WalletMixOrderInfoProxyUI");
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19114xec607269.class);
            intent.putExtra("key_orders", c19099x8d444f05);
            intent.putExtra("prepayId", this.f261542h);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletMixOrderInfoUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/wallet_core/ui/WalletMixOrderInfoUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            setResult(-1);
            finish();
        } else {
            int i19 = this.f261541g;
            if (i19 != 0) {
                this.f261541g = i19 - 1;
                m83097xe7b1ccf7(new ws4.a(this.f261543i, this.f261544m, this.f261545n, this.f261546o, this.f261542h, this.f261548q, this.f261549r, this.f261550s), this.f261540f.f470940d);
            } else {
                this.f261539e = false;
                if (str.isEmpty()) {
                    str = this.f261540f.f470942f;
                }
                U6(this, str, 0);
            }
        }
        return true;
    }
}
