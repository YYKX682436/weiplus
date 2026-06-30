package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI */
/* loaded from: classes4.dex */
public class ActivityC15952xfbdce232 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f222273g = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f222274d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.q2 f222275e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Dialog f222276f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bfj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.flv);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.n2(this));
        this.f222274d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.gkn);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.q2(this);
        this.f222275e = q2Var;
        this.f222274d.setAdapter((android.widget.ListAdapter) q2Var);
        android.app.Dialog e17 = r53.f.e(mo55332x76847179());
        this.f222276f = e17;
        e17.show();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
        java.lang.String stringExtra = getIntent().getStringExtra("extra_appdi");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            finish();
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new m53.q2();
        lVar.f152198b = new m53.r2();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getuplist";
        lVar.f152200d = 1331;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        ((m53.q2) a17.f152243a.f152217a).f405518d = stringExtra;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.o2(this), false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
    }
}
