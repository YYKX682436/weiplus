package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI */
/* loaded from: classes8.dex */
public class ActivityC19080x8d358955 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f260794h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f260795d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f260796e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f260797f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260798g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI.1
        {
            this.f39173x3fe91575 = 323604482;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955 activityC19080x8d358955 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955.this;
            activityC19080x8d358955.f260798g.mo48814x2efc64();
            int i17 = c6256xb3fb7c12.f136506g.f87653a;
            if (i17 != -1 && i17 != 0) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameVerifyBindcardEntranceUI", "WcPayRealnameVerifyBindcardEntranceUI finish");
            activityC19080x8d358955.finish();
            return false;
        }
    };

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d9a;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f260795d = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.pps);
        this.f260796e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ppt);
        this.f260797f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pql);
        java.lang.String string = m83105x7498fe14().getString("realname_verify_process_add_bank_word");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            this.f260797f.setText(string);
        }
        this.f260795d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.o1(this));
        this.f260796e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p1(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameVerifyBindcardEntranceUI", "onActivityResult: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 != -1 || intent == null || intent.getExtras() == null) {
            return;
        }
        m83105x7498fe14().putString("realname_verify_process_face_token", intent.getExtras().getString("token"));
        m83108x2b5a5a39().o(this, 0, m83105x7498fe14());
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        mo43517x10010bd5();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.n1(this));
        this.f260798g.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f260798g.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
