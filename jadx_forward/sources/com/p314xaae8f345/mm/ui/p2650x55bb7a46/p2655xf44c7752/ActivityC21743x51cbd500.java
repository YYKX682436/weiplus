package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* renamed from: com.tencent.mm.ui.chatting.gallery.AppBrandHistoryListUI */
/* loaded from: classes9.dex */
public class ActivityC21743x51cbd500 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements zb5.i {

    /* renamed from: d, reason: collision with root package name */
    public zb5.h f282073d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f282074e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f282075f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f282076g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f282077h;

    @Override // zb5.i
    public void A(boolean z17, int i17) {
        T6(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            this.f282075f.setVisibility(0);
            this.f282074e.setVisibility(8);
            this.f282075f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5e));
        } else {
            this.f282075f.setVisibility(8);
            this.f282074e.setVisibility(0);
            this.f282074e.mo7946xf939df19().m8151xc67946d3(0, i17);
        }
    }

    @Override // zb5.i
    public void P(boolean z17) {
        T6(true);
    }

    public final void T6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryListUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f282076g = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 0, null);
            return;
        }
        android.app.ProgressDialog progressDialog = this.f282076g;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f282076g.dismiss();
        this.f282076g = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569672i8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ax9));
        this.f282075f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mf6);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.h0u);
        this.f282074e = c1163xf1deaba4;
        c1163xf1deaba4.setBackgroundColor(-1);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f282074e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y) this.f282073d;
        if (yVar.f284078h == null) {
            yVar.f284078h = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        }
        c1163xf1deaba42.mo7967x900dcbe1(yVar.f284078h);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f282074e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y) this.f282073d;
        yVar2.f284075e = this.f282077h;
        yVar2.f284077g = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k0(yVar2.f284074d, yVar2);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k0.f279963f = yVar2.i();
        c1163xf1deaba43.mo7960x6cab2c8d(yVar2.f284077g);
        this.f282074e.m7963x830bc99d(true);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d(this));
    }

    @Override // zb5.i
    public void j0(java.lang.String str, boolean z17, int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.b
    public void l2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z zVar) {
        this.f282073d = (zb5.h) zVar;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f282077h = getIntent().getStringExtra("Chat_User");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n nVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n(this);
        nVar.f284076f = this;
        l2(nVar);
        mo43517x10010bd5();
        this.f282073d.a(true);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f282077h)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14562, this.f282077h, 0);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14562, this.f282077h, 1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f282073d.mo79813x3f5eee52();
    }

    @Override // zb5.i
    /* renamed from: onFinish */
    public void mo79578x42fe6352() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryListUI", "[onRefreshed]");
        finish();
    }
}
