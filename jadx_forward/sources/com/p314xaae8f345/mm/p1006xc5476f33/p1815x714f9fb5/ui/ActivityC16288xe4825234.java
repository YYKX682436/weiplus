package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui;

/* renamed from: com.tencent.mm.plugin.location.ui.RemarkUI */
/* loaded from: classes9.dex */
public class ActivityC16288xe4825234 extends com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831 {
    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831
    public void U6(java.lang.CharSequence charSequence) {
        long longExtra = getIntent().getLongExtra("kFavInfoLocalId", -1L);
        if (longExtra > 0) {
            java.lang.String charSequence2 = charSequence == null ? "" : charSequence.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextInputUI", "same remark[%s]", charSequence2);
            if (charSequence2.equals(getIntent().getStringExtra("kRemark"))) {
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87850c = -2;
            c4Var.f87853f = java.lang.Long.toString(longExtra);
            c4Var.f87852e = charSequence2;
            java.lang.String str = c4Var.f87853f;
            c5303xc75d2f73.e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cdu;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ggs);
        java.lang.String stringExtra = getIntent().getStringExtra("Kwebmap_locaion");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.inw)).setText(stringExtra);
            return;
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ina);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/RemarkUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/location/ui/RemarkUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
