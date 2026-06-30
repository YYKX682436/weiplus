package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI */
/* loaded from: classes.dex */
public final class ActivityC18589x3dbac5d0 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f254430g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f254431e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.u5(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f254432f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.t5(this));

    public static final void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 activityC18589x3dbac5d0, java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) activityC18589x3dbac5d0.findViewById(com.p314xaae8f345.mm.R.id.dhj);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cya;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.v5(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_teenmode_reset_password_optimize, false);
        if (fj6) {
            textView.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jtd));
        }
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.mcm);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) findViewById(com.p314xaae8f345.mm.R.id.hdf);
        c22607x763d2049.e(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.x5(button, this, c22607x763d2049, scrollView));
        jz5.g gVar = this.f254431e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04[] c22618x59d05a04Arr = {(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) ((jz5.n) gVar).mo141623x754a37bb(), (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) ((jz5.n) this.f254432f).mo141623x754a37bb()};
        for (int i17 = 0; i17 < 2; i17++) {
            c22618x59d05a04Arr[i17].addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.y5(button, this));
        }
        if (!fj6) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) ((jz5.n) gVar).mo141623x754a37bb()).requestFocus();
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.z5(this));
        ((vh4.t1) i95.n0.c(vh4.t1.class)).T(12);
    }
}
