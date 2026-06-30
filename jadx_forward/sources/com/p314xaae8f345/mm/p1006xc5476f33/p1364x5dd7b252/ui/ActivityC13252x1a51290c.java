package com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/eggspring/ui/SpringCardActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-eggspring_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.eggspring.ui.SpringCardActivity */
/* loaded from: classes5.dex */
public final class ActivityC13252x1a51290c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f178964d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f178965e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.app.t2 f178966f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f178967g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f178968h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f178969i = new f12.b(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f178968h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cve;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1001) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(2097280);
        new android.os.Handler(getMainLooper());
        mo54450xbf7c1df6("");
        mo74406x9c8c0d33(new f12.c(this), com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0);
        int color = mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6x);
        mo64405x4dab7448(color);
        if (com.p314xaae8f345.mm.ui.uk.g(color)) {
            m78609x92231eec(com.p314xaae8f345.mm.ui.uk.e(this, com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0, -1));
        } else {
            m78609x92231eec(com.p314xaae8f345.mm.ui.uk.e(this, com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0, -16777216));
        }
        mo78530x8b45058f();
        getWindow().getDecorView().setSystemUiVisibility(2050);
        m78605xc85f0ffa();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m7o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ixx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f178964d = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.ixy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f178965e = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById3;
        f12.a aVar = new f12.a(this);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = this.f178964d;
        if (c16077xb54fe366 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("luckyBagLoadingImg");
            throw null;
        }
        c16077xb54fe366.setOnClickListener(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3662 = this.f178965e;
        if (c16077xb54fe3662 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("luckyBagLoop");
            throw null;
        }
        c16077xb54fe3662.setOnClickListener(aVar);
        f12.d dVar = new f12.d();
        this.f178966f = dVar;
        com.p314xaae8f345.mm.app.w.INSTANCE.a(dVar);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringCardActivity", "onDestroy: ");
        com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
        com.p314xaae8f345.mm.app.t2 t2Var = this.f178966f;
        if (t2Var != null) {
            wVar.p(t2Var);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appForegroundLis");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringCardActivity", "onResume: ");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringCardActivity", "onStop: " + this.f178967g);
        if (this.f178967g) {
            finish();
        }
    }
}
