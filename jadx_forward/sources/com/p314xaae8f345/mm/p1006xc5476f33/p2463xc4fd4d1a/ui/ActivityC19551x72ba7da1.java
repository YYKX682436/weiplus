package com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI */
/* loaded from: classes9.dex */
public class ActivityC19551x72ba7da1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f270054d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f270055e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f270056f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d8q;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kjx);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.k3n);
        this.f270054d = viewOnFocusChangeListenerC22907xe18534c2;
        qp5.p.h(this, viewOnFocusChangeListenerC22907xe18534c2);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f566836h83);
        this.f270055e = viewOnFocusChangeListenerC22907xe18534c22;
        if (viewOnFocusChangeListenerC22907xe18534c22 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            viewOnFocusChangeListenerC22907xe18534c22.m83206xeace15c1(new qp5.n(1, viewOnFocusChangeListenerC22907xe18534c22));
        }
        m83125x8f91b80(this.f270055e, 1, false);
        java.lang.String string = m83105x7498fe14().getString("key_pre_name");
        this.f270056f = m83105x7498fe14().getString("key_pre_indentity");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            this.f270054d.m83181x1a2b8df1().setText(string);
            this.f270054d.m83199x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kjm));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f270056f)) {
            this.f270055e.m83207x214db04e(4);
            this.f270055e.m83181x1a2b8df1().setText(this.f270056f);
            this.f270055e.m83199x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kid));
        }
        findViewById(com.p314xaae8f345.mm.R.id.kao).setOnClickListener(new e05.c(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
