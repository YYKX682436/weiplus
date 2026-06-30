package com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.MailWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC16939x74e056 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f236441i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f236442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f236443e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f236444f;

    /* renamed from: g, reason: collision with root package name */
    public final hs3.j f236445g = new os3.z2(this);

    /* renamed from: h, reason: collision with root package name */
    public final k55.k f236446h = new k55.k(this);

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 activityC16939x74e056, java.lang.String str) {
        activityC16939x74e056.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQMail.WebViewUI", "dealGetContentWidthScheme fail, url is null");
        } else {
            activityC16939x74e056.f236442d.post(new os3.e3(activityC16939x74e056, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str.substring(33), 480)));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cbi;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("singleColumn", false));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a17 = al5.l2.a(mo55332x76847179());
        this.f236442d = a17;
        a17.setBackgroundDrawable(i65.a.i(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560994zy));
        ((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.cg7)).addView(this.f236442d);
        this.f236442d.mo120153xd15cf999().E(true);
        if (valueOf.booleanValue()) {
            this.f236442d.mo120153xd15cf999().F(android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        }
        this.f236442d.mo120153xd15cf999().v(8);
        this.f236442d.mo120153xd15cf999().N(true);
        this.f236442d.mo120153xd15cf999().r(true);
        this.f236442d.mo74800x23d27c02(new os3.b3(this));
        this.f236442d.mo81410x6fd49b97(new os3.c3(this));
        this.f236442d.G0();
        mo54448x9c8c0d33(new os3.d3(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f236444f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        mo43517x10010bd5();
        java.lang.String stringExtra = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (stringExtra != null) {
            mo54450xbf7c1df6(stringExtra);
        }
        this.f236446h.a(new os3.a3(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f236442d.setVisibility(8);
        this.f236442d.mo52095x5cd39ffa();
        this.f236442d = null;
        this.f236446h.d();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        this.f236442d.mo120194xc77ccada();
        super.onStop();
    }
}
