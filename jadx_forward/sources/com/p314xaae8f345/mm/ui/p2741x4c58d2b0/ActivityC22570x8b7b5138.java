package com.p314xaae8f345.mm.ui.p2741x4c58d2b0;

@db5.a(m123858x6ac9171 = 7)
@gm0.a2
/* renamed from: com.tencent.mm.ui.transmit.SelectConversationDirectSelectUI */
/* loaded from: classes9.dex */
public class ActivityC22570x8b7b5138 extends com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 {
    @Override // com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f292524k2 = true;
        java.lang.String stringExtra = getIntent().getStringExtra("Select_Conv_User");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            throw new java.lang.IllegalArgumentException("not provide username for share. please use pure SelectConversationUI");
        }
        mo67598xf0aced2e(8);
        overridePendingTransition(0, 0);
        com.p314xaae8f345.mm.ui.v9.e(getWindow());
        com.p314xaae8f345.mm.ui.v9.c(getWindow(), false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su);
        G7(stringExtra);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        mo2550x7c2abd06(1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
    }
}
