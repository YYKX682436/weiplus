package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyEmptyUI */
/* loaded from: classes7.dex */
public final class ActivityC12647x330d98bc extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569587fl;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById;
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        if (com.p314xaae8f345.mm.ui.bk.v0()) {
            overridePendingTransition(0, 0);
        }
        m78513xc2a54588().setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571739nx);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y5(this));
        if (mo2533x106ab264() != null && (findViewById = mo2533x106ab264().j().findViewById(com.p314xaae8f345.mm.R.id.f78238xaeb5384d)) != null && findViewById.getLayoutParams() != null && (findViewById.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin = 0;
            findViewById.requestLayout();
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565462ci0);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.chm);
        int intExtra = getIntent().getIntExtra("extra_enter_reason", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.i0.TOP_ENTRANCE_IN_DESKTOP;
        if (intExtra == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.j0();
            j0Var.f169535a = i0Var;
            j0Var.f169539e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.h0.EMPTY_PAGE;
            j0Var.a();
        } else {
            if (intExtra != 1) {
                finish();
                return;
            }
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571738nw);
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571737nv);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.j0 j0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.j0();
            j0Var2.f169535a = i0Var;
            j0Var2.f169539e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.h0.LBS_NOT_ALLOW;
            j0Var2.a();
        }
        setResult(-1);
    }
}
