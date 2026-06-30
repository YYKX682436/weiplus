package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.TestVideoEditUI */
/* loaded from: classes10.dex */
public class ActivityC16555xc2a48267 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements qk.i6 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f230790e = 0;

    /* renamed from: d, reason: collision with root package name */
    public qk.o9 f230791d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cyi;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, qk.i6
    public void m5() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f230791d.e()) {
            return;
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78505x1ef531b7(true);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.cgi);
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        rj.l lVar = new rj.l();
        this.f230791d = lVar;
        qk.l9 l9Var = new qk.l9();
        l9Var.f445765b = false;
        l9Var.f445766c = true;
        l9Var.f445769f = new android.graphics.Rect(0, 0, 1080, 1080);
        l9Var.f445764a = qk.n9.VIDEO;
        lVar.d(l9Var);
        qk.s c17 = this.f230791d.c(mo55332x76847179());
        c17.mo160420x1f31d20(this);
        frameLayout.addView(c17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        c17.m160424xbe8e76ed(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.v3(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f230791d.f();
    }

    @Override // qk.i6
    /* renamed from: onFinish */
    public void mo60944x42fe6352() {
        this.f230791d.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.w3(this), true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        super.mo2295x59cfc822();
    }
}
