package com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrListUI */
/* loaded from: classes8.dex */
public class ActivityC16934xe33e503a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f236405f;

    /* renamed from: h, reason: collision with root package name */
    public os3.f2 f236407h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f236408i;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f236403d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f236404e = null;

    /* renamed from: g, reason: collision with root package name */
    public ks3.z f236406g = null;

    /* renamed from: m, reason: collision with root package name */
    public final ks3.y f236409m = new os3.w1(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cbd;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f236405f = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.ldz);
        this.f236404e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfx);
        this.f236407h = new os3.f2(this, this);
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
        c9Var.f291857i = new os3.x1(this);
        m78489xd6d59aa8(true, c9Var);
        this.f236405f.setAdapter((android.widget.ListAdapter) this.f236407h);
        this.f236405f.setOnItemClickListener(new os3.y1(this));
        this.f236405f.setOnScrollListener(new os3.z1(this));
        this.f236408i = this.f236406g.e(null);
        this.f236407h.notifyDataSetChanged();
        mo54448x9c8c0d33(new os3.a2(this));
        m78597x53c22598(new os3.b2(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjj), new os3.c2(this));
        m78501x43e00957(!this.f236408i.isEmpty());
        this.f236403d = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hji), true, true, new os3.d2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hjk);
        this.f236408i = new java.util.ArrayList();
        this.f236406g = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().f393239b;
        mo43517x10010bd5();
        this.f236406g.b(this.f236409m);
        this.f236406g.d();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f236406g.f(this.f236409m);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f236407h.notifyDataSetChanged();
    }
}
