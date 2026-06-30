package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI */
/* loaded from: classes9.dex */
public class ActivityC19076x5d93a535 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f260757d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260758e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260759f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI.1
        {
            this.f39173x3fe91575 = 323604482;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c122 = c6256xb3fb7c12;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19076x5d93a535 activityC19076x5d93a535 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19076x5d93a535.this;
            activityC19076x5d93a535.f260759f.mo48814x2efc64();
            int i17 = c6256xb3fb7c122.f136506g.f87653a;
            if (i17 == -1 || i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "WalletRealNameProcessProxyUI finish");
                int i18 = c6256xb3fb7c122.f136506g.f87653a;
                if (i18 == -1) {
                    activityC19076x5d93a535.setResult(-1);
                } else if (i18 == 0) {
                    activityC19076x5d93a535.setResult(0);
                }
                activityC19076x5d93a535.finish();
            }
            return false;
        }
    };

    public void U6(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "goRealNameUI");
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "goRealNameUI, param is null");
            bundle = new android.os.Bundle();
        }
        bundle.putString("key_realname_scene", this.f260758e);
        bundle.putString("key_realname_sessionid", this.f260757d);
        bundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        bundle.putString("realname_verify_process_jump_activity", ".id_verify.WalletRealNameProcessProxyUI");
        bundle.putBoolean("process_finish_stay_orgpage", false);
        bundle.putParcelable("JsApiRequestWCPayRealnameVerifyParameter", (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549) getIntent().getParcelableExtra("JSAPI_TYPE_TINYAPP_PARAMETER"));
        bundle.putInt("realname_verify_process_from_scene", getIntent().getIntExtra("realname_verify_process_from_scene", 10));
        com.p314xaae8f345.mm.p2802xd031a825.a.j(this, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.class, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.w0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isTransparent */
    public boolean mo63463x4510f9c8() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        java.lang.String str;
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "on create");
        m83090x14f40144(580);
        this.f260759f.mo48813x58998cd();
        android.os.Bundle m83105x7498fe14 = m83105x7498fe14();
        if (m83105x7498fe14 != null) {
            i17 = m83105x7498fe14.getInt("realname_scene", 0);
            str = m83105x7498fe14.getString("JSAPI_TYPE", "");
        } else {
            i17 = 0;
            str = "";
        }
        if (i17 == 0) {
            i17 = getIntent().getIntExtra("realname_scene", 0);
        }
        if (str.equals("JSAPI_TYPE_TINYAPP")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "from tiny app jsapi, do NetSceneCheckPayJsapi");
            m83096xe7b1ccf7(new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), 8, getIntent().getStringExtra("wxapp_username"), getIntent().getStringExtra("wxapp_path"), getIntent().getStringExtra("command_word"), 0));
        } else {
            if (i17 != 1) {
                U6(m83105x7498fe14);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "from jsapi, do NetSceneCheckPayJsapi");
            if (getIntent() == null) {
                db5.e1.G(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("") ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g) : "", null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.x0(this));
            } else {
                m83096xe7b1ccf7(new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), m83105x7498fe14().getInt("realname_scene") == 2 ? 12 : 8, "idCardRealnameVerify", getIntent().getIntExtra("pay_channel", 0)));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(580);
        this.f260759f.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "onNewIntent");
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras == null || !extras.getBoolean("key_is_realname_verify_process")) {
            setResult(0);
        } else if (extras.getInt("realname_verify_process_ret", 0) != -1) {
            setResult(0);
        } else {
            setResult(-1);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof ss4.d)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletRealNameProcessProxyUI", "NetSceneCheckPayJsapi resp,errType = " + i17 + ",errCode=" + i18);
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        ss4.d dVar = (ss4.d) m1Var;
        h45.y.f360501a = dVar.H();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = dVar.f493562e.f152244b.f152233a;
        this.f260757d = ((r45.y10) fVar).f472240n;
        this.f260758e = ((r45.y10) fVar).f472241o;
        U6(m83105x7498fe14());
        return true;
    }
}
