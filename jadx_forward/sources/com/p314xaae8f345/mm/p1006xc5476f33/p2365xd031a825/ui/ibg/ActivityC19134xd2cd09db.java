package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ibg;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoUI */
/* loaded from: classes9.dex */
public class ActivityC19134xd2cd09db extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: n, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f261876n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f261877d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261878e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f261879f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f261880g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261881h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f261882i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f261883m = null;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d2d;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            if (i17 == 1) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5656xe9ecdbac c5656xe9ecdbac = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5656xe9ecdbac();
                am.yh yhVar = c5656xe9ecdbac.f135982g;
                yhVar.f89994a = 25;
                yhVar.f89995b = -1;
                yhVar.f89996c = new android.content.Intent();
                c5656xe9ecdbac.e();
            }
            setResult(-1);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9.f34360x366c91de);
        this.f261877d = getIntent().getStringExtra("appId");
        this.f261878e = getIntent().getStringExtra("nonceStr");
        this.f261879f = getIntent().getStringExtra("timeStamp");
        this.f261880g = getIntent().getStringExtra("packageExt");
        this.f261881h = getIntent().getStringExtra("paySignature");
        this.f261882i = getIntent().getStringExtra("signtype");
        this.f261883m = getIntent().getStringExtra("url");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("appid", this.f261877d);
        bundle2.putString(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, this.f261879f);
        bundle2.putString("nonce_str", this.f261878e);
        bundle2.putString("package", this.f261880g);
        bundle2.putString("sign_type", this.f261882i);
        bundle2.putString("pay_sign", this.f261881h);
        bundle2.putString("webview_url", this.f261883m);
        if (((h45.q) i95.n0.c(h45.q.class)).mo24825x39b1d2e1(this, bundle2)) {
            return;
        }
        m83096xe7b1ccf7(new ts4.c(this.f261877d, this.f261878e, this.f261879f, this.f261880g, this.f261881h, this.f261882i, this.f261883m));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9.f34360x366c91de);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIbgOrderInfoUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (m1Var instanceof ts4.c) {
            m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9.f34360x366c91de);
            if (i17 == 0 && i18 == 0) {
                ts4.c cVar = (ts4.c) m1Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = cVar.f503254f;
                f261876n = c19099x8d444f05;
                int i19 = cVar.f503255g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIbgOrderInfoUI", "gotoIbgOrderInfoUI, useNewPage: %s, orders: %s", java.lang.Integer.valueOf(i19), c19099x8d444f05);
                if (i19 == 1) {
                    android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ibg.ActivityC19132x2239c36d.class);
                    intent.putExtra("key_orders", c19099x8d444f05);
                    startActivityForResult(intent, 1);
                } else {
                    android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ibg.ActivityC19133x224ac234.class);
                    intent2.putExtra("key_orders", c19099x8d444f05);
                    startActivityForResult(intent2, 2);
                }
                return true;
            }
            setResult(0);
            finish();
        }
        setResult(0);
        finish();
        return false;
    }
}
