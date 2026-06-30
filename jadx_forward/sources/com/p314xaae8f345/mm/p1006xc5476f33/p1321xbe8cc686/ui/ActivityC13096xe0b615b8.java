package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI */
/* loaded from: classes12.dex */
public class ActivityC13096xe0b615b8 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f177099q = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f177100d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177101e;

    /* renamed from: f, reason: collision with root package name */
    public int f177102f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f177103g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l f177104h;

    /* renamed from: i, reason: collision with root package name */
    public final xv1.b f177105i = new xv1.b();

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f177106m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f177107n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f177108o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f177109p;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    public void A(boolean z17, int i17) {
        T6(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileListUI", "[onDataLoaded] isFirst:%s addCount:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            this.f177106m.setVisibility(0);
            this.f177107n.setVisibility(8);
            this.f177106m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7a));
        } else {
            this.f177106m.setVisibility(8);
            this.f177107n.setVisibility(0);
            this.f177107n.mo7946xf939df19().m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    public void P(boolean z17) {
        T6(true);
    }

    public final void T6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileListUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f177109p = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 0, null);
            return;
        }
        android.app.ProgressDialog progressDialog = this.f177109p;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f177109p.dismiss();
        this.f177109p = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    public xv1.b f6() {
        return this.f177105i;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    /* renamed from: getChildAt */
    public android.view.View mo54477x6a486239(int i17) {
        return this.f177107n.getChildAt(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    /* renamed from: getContext */
    public /* bridge */ /* synthetic */ android.content.Context mo54478x76847179() {
        return super.mo55332x76847179();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570141yi;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    /* renamed from: getUserName */
    public java.lang.String mo54479x6bf53a6c() {
        return this.f177100d;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f177106m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kfa);
        this.f177107n = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.e2d);
        this.f177108o = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.nsj);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        java.lang.String stringExtra = getIntent().getStringExtra("USERNAME");
        this.f177100d = stringExtra;
        this.f177101e = xv1.d.f(stringExtra);
        this.f177102f = getIntent().getIntExtra("COUNT", 9);
        this.f177103g = getIntent().getStringExtra("EXTENSION");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileListUI", "onCreate mCount:%d mExtension:%s", java.lang.Integer.valueOf(this.f177102f), this.f177103g);
        this.f177104h = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l(this);
        mo43517x10010bd5();
        findViewById(com.p314xaae8f345.mm.R.id.ch8).setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560362ie));
        this.f177107n.setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560362ie));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f177107n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l lVar = this.f177104h;
        if (lVar.f177079f == null) {
            lVar.f177079f = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        }
        c1163xf1deaba4.mo7967x900dcbe1(lVar.f177079f);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f177107n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l lVar2 = this.f177104h;
        lVar2.getClass();
        c1163xf1deaba42.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.k(lVar2));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f177107n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l lVar3 = this.f177104h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.d(lVar3.f177061b, lVar3.f177078e);
        lVar3.f177077d = dVar;
        dVar.f177059g = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.h(lVar3);
        c1163xf1deaba43.mo7960x6cab2c8d(dVar);
        this.f177107n.m7963x830bc99d(true);
        mo54450xbf7c1df6(this.f177101e);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.a(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.b(this));
        this.f177108o.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.d(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l lVar4 = this.f177104h;
        java.lang.String str = this.f177103g;
        lVar4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChooseMsgFileUIController", "onCreate type:%s extension:%s", "file", str);
        lVar4.b(true, "file", str);
        o25.n1.c(this);
        this.f177105i.b(this.f177102f);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f177104h.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChooseMsgFileUIController", "onDestroy");
        xv1.b bVar = this.f177105i;
        synchronized (bVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileHelper", "uninit");
            ((java.util.concurrent.ConcurrentHashMap) bVar.f538921b).clear();
            bVar.f538921b = null;
            ((java.util.HashSet) bVar.f538923d).clear();
            bVar.f538923d = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f177104h.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChooseMsgFileUIController", "onPause");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f177104h.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChooseMsgFileUIController", "onResume");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    public void v2() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.e(this));
    }
}
