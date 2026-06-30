package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ibg;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoNewUI */
/* loaded from: classes9.dex */
public class ActivityC19132x2239c36d extends com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 {

    /* renamed from: c2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f261875c2;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19118x5d81cad7
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 X6() {
        return this.f261875c2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1
    public void e7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIbgOrderInfoNewUI", "hy: result is not set manly. set to OK");
        for (java.lang.String str : this.f261560i) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a1(str));
            }
        }
        setResult(-1);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1
    public void h7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19118x5d81cad7, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f261875c2 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ibg.ActivityC19134xd2cd09db.f261876n;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5656xe9ecdbac c5656xe9ecdbac = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5656xe9ecdbac();
        am.yh yhVar = c5656xe9ecdbac.f135982g;
        yhVar.f89994a = 25;
        yhVar.f89995b = -1;
        yhVar.f89996c = new android.content.Intent();
        c5656xe9ecdbac.e();
    }
}
