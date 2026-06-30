package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.wallet.ui.WalletJsApiAdapterUI */
/* loaded from: classes9.dex */
public class ActivityC19060x1440a18b extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f260667d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260668e = "";

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            setResult(-1);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int intValue;
        super.onCreate(bundle);
        mo67598xf0aced2e(8);
        if (getIntent().getIntExtra("from_hk", 0) == 1 && (intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue()) != 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJsApiAdapterUI", "user wallet region is %s, not HK, show tips and ret fail", java.lang.Integer.valueOf(intValue));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
            u1Var.g(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hei));
            u1Var.l(new hs4.i(this));
            u1Var.n(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl_));
            u1Var.q(false);
            return;
        }
        this.f260667d = getIntent().getStringExtra("intent_jump_package");
        this.f260668e = getIntent().getStringExtra("intent_jump_ui");
        m83090x14f40144(580);
        if (getIntent() == null) {
            setResult(0);
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("source_type", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJsApiAdapterUI", "do check jsapi: %s", java.lang.Integer.valueOf(intExtra));
        ss4.d dVar = intExtra == 1 ? new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), getIntent().getIntExtra("jsapi_scene", 0), "openWCPayCardList", getIntent().getIntExtra("pay_channel", 0)) : intExtra == 2 ? new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getIntExtra("jsapi_scene", 0), getIntent().getStringExtra("wxapp_username"), getIntent().getStringExtra("wxapp_path"), getIntent().getStringExtra("command_word"), getIntent().getIntExtra("pay_channel", 0)) : null;
        if (dVar != null) {
            m83096xe7b1ccf7(dVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        m83121xf6ff5b27(580);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("RESET_PWD_USER_ACTION", 0);
        if (intExtra == 1) {
            setResult(-1);
            finish();
        } else if (intExtra == 2) {
            setResult(-1000);
            finish();
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJsApiAdapterUI", "onSceneEnd errType %s errCode %s errMsg %s scene %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (i17 != 0 || i18 != 0) {
            setResult(-1000);
            db5.e1.T(this, str);
            finish();
            return true;
        }
        if (!(m1Var instanceof ss4.d)) {
            return false;
        }
        ss4.d dVar = (ss4.d) m1Var;
        h45.y.f360501a = dVar.H();
        r45.y10 y10Var = dVar.f493563f;
        if (y10Var != null && y10Var.f472242p != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", y10Var.f472242p.f470310d);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, y10Var.f472242p.f470311e);
            bundle.putString("query", y10Var.f472242p.f470312f);
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
            c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.WEB_VIEW;
            bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(mo55332x76847179(), bundle, true, false, new hs4.j(this));
            setResult(-1);
            finish();
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260668e) && this.f260668e.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.c0.f34605x24728b)) {
            ((h45.q) i95.n0.c(h45.q.class)).mo24805x1fe7d3e4(this, getIntent().getStringExtra("packageExt"));
            setResult(-1);
            finish();
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260668e) && this.f260668e.equals("requestHKCashier")) {
            ((h45.q) i95.n0.c(h45.q.class)).mo24795xebe1713a(this, getIntent().getStringExtra("packageExt"));
            setResult(-1);
            finish();
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260668e) && this.f260668e.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s.f34651x24728b)) {
            ((h45.q) i95.n0.c(h45.q.class)).mo24803x96fa54b2(getIntent().getStringExtra("packageExt"), new hs4.k(this));
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260668e) && this.f260668e.equals(".bind.ui.WalletBankcardManageUI")) {
            ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("bankCard", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new hs4.l(this));
            setResult(-1);
            finish();
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260667d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260668e)) {
            setResult(-1);
            finish();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("intent_finish_self", true);
            j45.l.n(this, this.f260667d, this.f260668e, intent, 1);
        }
        return true;
    }
}
