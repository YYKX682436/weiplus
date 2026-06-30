package com.p314xaae8f345.mm.p2802xd031a825.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.wallet_core.ui.WalletPreferenceUI */
/* loaded from: classes9.dex */
public abstract class AbstractActivityC22903x6773368 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements np5.f {

    /* renamed from: d, reason: collision with root package name */
    public np5.b0 f295626d = null;

    /* renamed from: e, reason: collision with root package name */
    public np5.g f295627e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.h f295628f = null;

    public np5.b0 V6() {
        if (this.f295626d == null) {
            this.f295626d = new np5.b0(this, this);
        }
        return this.f295626d;
    }

    public abstract boolean W6(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var);

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo54562x399050cf();
        np5.b0 b0Var = new np5.b0(this, this);
        this.f295626d = b0Var;
        b0Var.c(385);
        this.f295626d.c(1518);
        if (mo43051x2ee31f5b() > 0) {
            java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f295626d.i(385);
        this.f295626d.i(1518);
        this.f295626d = null;
        super.onDestroy();
    }

    @Override // np5.f
    /* renamed from: onSceneEnd */
    public void mo66167x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        if (W6(i17, i18, str, m1Var) || i18 == 0) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
        }
        db5.e1.G(this, str, null, false, new com.p314xaae8f345.mm.p2802xd031a825.ui.a2(this));
    }

    /* renamed from: setStatusColor */
    public void mo54562x399050cf() {
        mo64405x4dab7448(mo78508x85b50c3c());
    }
}
