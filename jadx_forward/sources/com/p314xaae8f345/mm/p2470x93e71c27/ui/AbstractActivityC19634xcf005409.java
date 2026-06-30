package com.p314xaae8f345.mm.p2470x93e71c27.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.pluginsdk.ui.AutoLoginActivity */
/* loaded from: classes8.dex */
public abstract class AbstractActivityC19634xcf005409 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public boolean T6() {
        js.t0 t0Var = (js.t0) i95.n0.c(js.t0.class);
        android.content.Intent intent = getIntent();
        java.lang.Class<?> cls = getClass();
        ((is.h) t0Var).getClass();
        if (gm0.j1.b().n() && !gm0.m.r()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AccountSdkFeatureService", "not login");
        android.content.Intent intent2 = new android.content.Intent(this, cls);
        intent2.putExtras(intent);
        intent2.addFlags(67108864);
        intent2.setDataAndType(intent.getData(), intent.getType());
        intent2.setAction(intent.getAction());
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putExtras(intent);
        j45.l.C(this, "account", "com.tencent.mm.plugin.account.ui.SimpleLoginUI", intent3, intent2);
        return true;
    }

    public final void U6(int i17) {
        if (i17 == -1) {
            X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p.LOGIN_OK, getIntent());
            return;
        }
        if (i17 == 0) {
            T6();
            return;
        }
        if (i17 == 1) {
            X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p.LOGIN_CANCEL, getIntent());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoLoginActivity", "onNewIntent, should not reach here, resultCode = " + i17);
        X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p.LOGIN_FAIL, getIntent());
    }

    public final void V6(java.lang.String str) {
        if (Z6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoLoginActivity", "Activity finish with report, reason: " + str);
            W6(str);
        }
        finish();
    }

    public void W6(java.lang.String str) {
    }

    public abstract void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p pVar, android.content.Intent intent);

    public abstract boolean Y6(android.content.Intent intent);

    public boolean Z6() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78596x71afbec8(8);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoLoginActivity", "onCreate intent is null");
            V6("intent is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoLoginActivity", "onCreate, intent action = " + intent.getAction());
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "wizard_activity_result_code", -2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoLoginActivity", "onCreate, resultCode = " + g17);
        if (g17 != -2) {
            U6(g17);
            return;
        }
        if (!Y6(intent)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoLoginActivity", "preLogin fail, no need to process");
            V6("preLogin fail");
        } else if (!T6()) {
            X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p.LOGIN_OK, intent);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AutoLoginActivity", "not login, go to SimpleLogin");
            V6("not login");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "wizard_activity_result_code", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoLoginActivity", "onNewIntent, resultCode = " + g17);
        U6(g17);
    }
}
