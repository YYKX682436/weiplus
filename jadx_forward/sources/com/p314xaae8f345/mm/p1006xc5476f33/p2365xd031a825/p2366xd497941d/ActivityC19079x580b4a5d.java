package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameProxyUI */
/* loaded from: classes9.dex */
public class ActivityC19079x580b4a5d extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260792d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameProxyUI.1
        {
            this.f39173x3fe91575 = 323604482;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19079x580b4a5d activityC19079x580b4a5d = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19079x580b4a5d.this;
            activityC19079x580b4a5d.f260792d.mo48814x2efc64();
            int i17 = c6256xb3fb7c12.f136506g.f87653a;
            if (i17 != -1 && i17 != 0) {
                return false;
            }
            activityC19079x580b4a5d.finish();
            return false;
        }
    };

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameProxyUI", "on create");
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.bk.p0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        this.f260792d.mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameProxyUI", "do get wording");
        ys4.e eVar = new ys4.e(m83105x7498fe14().getString("key_realname_sessionid"));
        m83090x14f40144(1666);
        m83098x5406100e(eVar);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameProxyUI", "on destroy");
        this.f260792d.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m83121xf6ff5b27(1666);
        ys4.e eVar = (ys4.e) m1Var;
        r45.lm3 lm3Var = eVar.f546760i;
        if (lm3Var == null) {
            com.p314xaae8f345.mm.p2802xd031a825.a.c(mo55332x76847179(), m83105x7498fe14(), 0);
            finish();
            return false;
        }
        try {
            java.lang.String str2 = new java.lang.String(lm3Var.mo14344x5f01b1f6(), s46.a.f484534a);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_get_wording_cache", str2);
            bundle.putAll(m83105x7498fe14());
            bundle.putInt("real_name_verify_mode", 4);
            bundle.putBoolean("realname_verify_process_show_bindcard_page", eVar.f546760i.D);
            m83105x7498fe14().putBoolean("realname_verify_process_verify_sms_without_bindcard", eVar.f546760i.H);
            com.p314xaae8f345.mm.p2802xd031a825.a.d(mo55332x76847179(), bundle);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WcPayRealnameProxyUI", e17, "", new java.lang.Object[0]);
        }
        return false;
    }
}
