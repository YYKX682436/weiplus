package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI */
/* loaded from: classes9.dex */
public class ActivityC19160x772fa748 extends com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.AbstractActivityC19158x4b7e6cc1 implements qp5.i0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f262552d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f262553e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f262554f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f262555g;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a4x;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f262552d = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.bsr);
        this.f262553e = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.bss);
        this.f262554f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.bst);
        qp5.p.a(this.f262552d);
        qp5.p.f(this, this.f262553e);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262555g)) {
            this.f262552d.m83199x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bt6));
        } else {
            this.f262552d.m83199x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572610bt5, this.f262555g));
        }
        this.f262553e.m83199x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bt7));
        this.f262552d.m83211x749e7e77(this);
        this.f262553e.m83211x749e7e77(this);
        m83125x8f91b80(this.f262552d, 0, false);
        m83125x8f91b80(this.f262553e, 0, false);
        this.f262554f.setEnabled(false);
        this.f262554f.setClickable(false);
        this.f262554f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.g(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f262555g = m83105x7498fe14().getString("key_true_name", "");
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bt8));
        this.f39904x9eeebfc.c(385);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f39904x9eeebfc.i(385);
    }

    @Override // qp5.i0
    /* renamed from: onInputValidChange */
    public void mo9068x194c4a1(boolean z17) {
        if (this.f262552d.n() && this.f262553e.n()) {
            this.f262554f.setEnabled(true);
            this.f262554f.setClickable(true);
        } else {
            this.f262554f.setEnabled(false);
            this.f262554f.setClickable(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
