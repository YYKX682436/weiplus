package com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI */
/* loaded from: classes9.dex */
public class ActivityC19198x5ada7678 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f262811m = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.C19199x6be5dc91 f262812d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f262813e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f262814f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.w6 f262815g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f262816h = "";

    /* renamed from: i, reason: collision with root package name */
    public au4.i f262817i;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c96;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.p2740x696c9db.w6 w6Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.w6(this);
        this.f262815g = w6Var;
        w6Var.f291963n = true;
        w6Var.f291964o = com.p314xaae8f345.mm.R.C30868x68b1db1.f575632e6;
        w6Var.f292413u = new au4.d(this);
        w6Var.f292414v = new au4.e(this);
        this.f262817i = new au4.i(this);
        this.f262812d = (com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.C19199x6be5dc91) findViewById(com.p314xaae8f345.mm.R.id.ksz);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.ksy);
        this.f262813e = viewOnFocusChangeListenerC22907xe18534c2;
        if (viewOnFocusChangeListenerC22907xe18534c2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            viewOnFocusChangeListenerC22907xe18534c2.m83204xa46dddda(true);
        }
        this.f262814f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ksx);
        this.f262812d.setOnClickListener(new au4.f(this));
        this.f262813e.m83211x749e7e77(new au4.g(this));
        this.f262814f.setOnClickListener(new au4.h(this));
        au4.i.a(this.f262817i);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
