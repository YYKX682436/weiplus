package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenECardProxyUI */
/* loaded from: classes9.dex */
public class ActivityC19164x1eb3f050 extends com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.AbstractActivityC19158x4b7e6cc1 {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenECardProxyUI", "activity result, request:%s, result: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 != -1) {
            finish();
            return;
        }
        setResult(0);
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = m83108x2b5a5a39();
        if (m83108x2b5a5a39 == null) {
            finish();
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_process_result_code", 0);
        m83108x2b5a5a39.l(this, 0, bundle);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo67598xf0aced2e(4);
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = m83108x2b5a5a39();
        if (m83108x2b5a5a39 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletOpenECardProxyUI", "no process!!!");
            finish();
            return;
        }
        int i17 = m83105x7498fe14().getInt("key_open_scene", 0);
        boolean z17 = m83105x7498fe14().getBoolean("key_is_reuse_existing_ecard", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenECardProxyUI", "onCreate, openScene: %s, isReuseExistCard: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (z17) {
            m83106x57340563().d(2, java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
            return;
        }
        java.lang.String string = m83105x7498fe14().getString("key_open_token");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenECardProxyUI", "onCreate, openScene: %s, token==null:%s, isTokenInvalid: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)), java.lang.Boolean.valueOf(m83105x7498fe14().getBoolean("key_is_token_invalid", false)));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            m83108x2b5a5a39.o(mo55332x76847179(), 0, m83105x7498fe14());
        } else {
            m83106x57340563().d(1, java.lang.Integer.valueOf(i17), string);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("key_process_result_code", -1);
        boolean booleanExtra = intent.getBooleanExtra("key_process_is_end", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenECardProxyUI", "new intent, resultCode: %d, isEnd: %s", java.lang.Integer.valueOf(intExtra), java.lang.Boolean.valueOf(booleanExtra));
        if (intExtra == -1) {
            if (intent.getBooleanExtra("key_goto_lqt_detail", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenECardProxyUI", "jump to detail");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_account_type", 2);
                if (!((h45.q) i95.n0.c(h45.q.class)).mo24812x391b2a71(mo55332x76847179())) {
                    j45.l.j(mo55332x76847179(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent2, null);
                }
            }
            setResult(-1);
        } else {
            setResult(0);
        }
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = m83108x2b5a5a39();
        if (booleanExtra) {
            finish();
        } else if (m83108x2b5a5a39 != null) {
            m83108x2b5a5a39.g(mo55332x76847179());
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
