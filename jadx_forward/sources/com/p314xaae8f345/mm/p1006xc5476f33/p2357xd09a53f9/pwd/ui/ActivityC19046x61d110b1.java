package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI */
/* loaded from: classes8.dex */
public class ActivityC19046x61d110b1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f260397f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f260398d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f260399e;

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "goToBankcard");
        m83105x7498fe14().putBoolean("key_select_bank_card", true);
        m83108x2b5a5a39().o(this, 0, m83105x7498fe14());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d6i;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.content.Intent intent2 = intent;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "onActivityResult, requestCode: %s, resultCode: %s, data: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent2);
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        int intExtra = intent2.getIntExtra("err_code", 0);
        int intExtra2 = intent2.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        int intExtra3 = intent2.getIntExtra("countFace", 0);
        long longExtra = intent2.getLongExtra("totalTime", 0L);
        int intExtra4 = intent2.getIntExtra("err_type", 6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "errCode： " + intExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "scene： " + intExtra2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "countFace： " + intExtra3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "totalTime： " + longExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "errorType： " + intExtra4);
        if (i17 == 233) {
            if (i18 != -1) {
                if (intent2.getExtras() != null) {
                    java.lang.String string = intent2.getExtras().getString("click_other_verify_btn");
                    boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && string.equalsIgnoreCase("yes");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "isClickOtherVerify: %s", string);
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "check face failed, click other verify");
                        if (m83108x2b5a5a39() != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                            g0Var.d(15774, java.lang.Integer.valueOf(m83108x2b5a5a39().f295334c.getInt("key_forgot_scene", 1)), 5);
                            g0Var.d(15711, java.lang.Integer.valueOf(intExtra2), 3, java.lang.Integer.valueOf(intExtra3), java.lang.Long.valueOf(longExtra), 1, java.lang.Integer.valueOf(intExtra4), java.lang.Integer.valueOf(intExtra));
                        }
                        U6();
                    }
                }
                if (i18 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "resultCode：RESULT_CANCELED");
                    if (m83108x2b5a5a39() != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var2.d(15774, java.lang.Integer.valueOf(m83108x2b5a5a39().f295334c.getInt("key_forgot_scene", 1)), 6);
                        g0Var2.d(15711, java.lang.Integer.valueOf(intExtra2), 2, java.lang.Integer.valueOf(intExtra3), java.lang.Long.valueOf(longExtra), 1, 1, java.lang.Integer.valueOf(intExtra));
                        return;
                    }
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "resultCode：RESULT_OK");
            if (intent2.getExtras() != null) {
                java.lang.String string2 = intent2.getExtras().getString("token");
                if (m83108x2b5a5a39() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var3.d(15774, java.lang.Integer.valueOf(m83108x2b5a5a39().f295334c.getInt("key_forgot_scene", 1)), 4);
                    g0Var3.d(15711, java.lang.Integer.valueOf(intExtra2), 0, java.lang.Integer.valueOf(intExtra3), java.lang.Long.valueOf(longExtra), 1, 0, java.lang.Integer.valueOf(intExtra));
                }
                m83105x7498fe14().putString("key_face_action_result_token", string2);
                m83105x7498fe14().putBoolean("key_is_set_pwd_after_face_action", true);
                m83108x2b5a5a39().o(this, 0, m83105x7498fe14());
                finish();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        m78577x7b07e1a8(8);
        this.f260398d = findViewById(com.p314xaae8f345.mm.R.id.dmr);
        this.f260399e = findViewById(com.p314xaae8f345.mm.R.id.aeb);
        this.f260398d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.c0(this));
        this.f260399e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.d0(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
