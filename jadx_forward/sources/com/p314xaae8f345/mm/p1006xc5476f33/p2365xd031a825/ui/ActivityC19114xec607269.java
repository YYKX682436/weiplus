package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoProxyUI */
/* loaded from: classes9.dex */
public class ActivityC19114xec607269 extends com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 {

    /* renamed from: c2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f261535c2;

    /* renamed from: d2, reason: collision with root package name */
    public java.lang.String f261536d2 = null;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19118x5d81cad7
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 X6() {
        return this.f261535c2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1
    public void e7() {
        java.util.Iterator it = ((java.util.HashSet) this.f261560i).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a1(str));
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261536d2)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("intent_pay_end", true);
            intent.putExtra("is_jsapi_close_page", this.f261535c2.Y);
            am.s10 s10Var = c6249x2aa12f2e.f136498g;
            s10Var.f89394a = intent;
            s10Var.f89397d = this.f261536d2;
            s10Var.f89396c = -1;
            s10Var.f89399f = 1;
            c6249x2aa12f2e.e();
        }
        setResult(-1);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1
    public void h7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19118x5d81cad7, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f261535c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) getIntent().getParcelableExtra("key_orders");
        this.f261536d2 = getIntent().getStringExtra("prepayId");
        super.onCreate(bundle);
    }
}
