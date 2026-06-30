package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceMsgAlertActivity */
/* loaded from: classes12.dex */
public class ActivityC17141x5a864e68 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {
    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        boolean booleanExtra = getIntent().getBooleanExtra("key_is_no_contact", false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
        u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(booleanExtra ? com.p314xaae8f345.mm.R.C30867xcad56011.i0a : com.p314xaae8f345.mm.R.C30867xcad56011.i0_));
        u1Var.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a7(this));
        u1Var.e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b7(this));
        u1Var.q(false);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        overridePendingTransition(0, 0);
    }
}
