package com.p314xaae8f345.mm.ui.p2741x4c58d2b0;

/* renamed from: com.tencent.mm.ui.transmit.ConvBoxTransmitUI */
/* loaded from: classes9.dex */
public class ActivityC22565x5279de7b extends com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 {
    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93
    public boolean U7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        return new dk5.a(this, null, this.f292516c2, this.E1, this.Y);
    }

    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return getString(com.p314xaae8f345.mm.R.C30867xcad56011.bl6);
    }

    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        super.h7(adapterView, view, i17, j17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvBoxTransmitUI", "onBackPressed");
        p7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean booleanExtra = getIntent().getBooleanExtra("KIsMultiSelect", false);
        this.E1 = booleanExtra;
        if (booleanExtra) {
            java.lang.String stringExtra = getIntent().getStringExtra("Select_Conv_User");
            java.util.List linkedList = android.text.TextUtils.isEmpty(stringExtra) ? new java.util.LinkedList() : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            this.F1 = linkedList;
            if (linkedList == null) {
                this.F1 = new java.util.ArrayList();
            }
            this.G1 = new java.util.HashMap();
        }
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void p7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvBoxTransmitUI", "onBackBtnPress, mMultiSelecting=%s", java.lang.Boolean.valueOf(this.E1));
        android.content.Intent intent = new android.content.Intent();
        if (this.E1) {
            intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.F1, ","));
        }
        setResult(0, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void r7(android.widget.ListView listView, int i17) {
    }
}
