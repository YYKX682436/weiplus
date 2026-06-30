package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI */
/* loaded from: classes9.dex */
public class ActivityC19002xf18a9914 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f259359h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f259360d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f259361e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f259362f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f259363g;

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19002xf18a9914 activityC19002xf18a9914) {
        if (!activityC19002xf18a9914.m83105x7498fe14().containsKey("key_realname_guide_helper")) {
            activityC19002xf18a9914.V6();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1) activityC19002xf18a9914.m83105x7498fe14().getParcelable("key_realname_guide_helper");
        if (c19088xa4b300c1 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceResultUI");
            bundle.putString("realname_verify_process_jump_plugin", "wallet");
            c19088xa4b300c1.a(activityC19002xf18a9914, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.f1(activityC19002xf18a9914), null);
            activityC19002xf18a9914.m83105x7498fe14().remove("key_realname_guide_helper");
        }
    }

    public final void V6() {
        int i17 = m83105x7498fe14().getInt("key_pay_flag", 0);
        java.lang.String string = m83105x7498fe14().getString("key_pwd1");
        java.lang.String string2 = m83105x7498fe14().getString("key_verify_code");
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().getParcelable("key_pay_info");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_bindcard_after_save_balance, 1);
        if (c19760x34448d56 == null || Ni != 1) {
            mo73812x338af3();
        } else if (this.f259363g == null) {
            m83098x5406100e(new rr4.c(i17, string, string2, c19760x34448d56.f273647m, c19760x34448d56.f273642e, "0"));
        } else {
            m83099x5406100e(new rr4.c(i17, string, string2, c19760x34448d56.f273647m, c19760x34448d56.f273642e, "1"), false);
            mo73812x338af3();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5a;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f259360d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pg8);
        this.f259361e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.pg7);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f259362f;
        if (c19099x8d444f05 == null) {
            finish();
            return;
        }
        this.f259360d.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c19099x8d444f05.f261211h, c19099x8d444f05.f261214m));
        this.f259361e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.d1(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.e1(this));
        this.f259363g = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) m83105x7498fe14().getParcelable("key_bankcard");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: next */
    public void mo73812x338af3() {
        if (m83106x57340563().d(this.f259362f)) {
            return;
        }
        super.mo73812x338af3();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f259362f = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) m83105x7498fe14().getParcelable("key_orders");
        mo43517x10010bd5();
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        m78600x5843c740(false);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof rr4.c)) {
            return false;
        }
        if (!((rr4.c) m1Var).f480759d) {
            return true;
        }
        if (i17 == 0 && i18 == 0) {
            at4.x1 Ai = vr4.f1.wi().Ai();
            Ai.getClass();
            Ai.f95539o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
            c6243x5c461184.f136491g.f88748a = 15;
            c6243x5c461184.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.g1(this);
            c6243x5c461184.e();
        }
        mo73812x338af3();
        return true;
    }
}
