package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI */
/* loaded from: classes9.dex */
public class ActivityC19056xd4c1806c extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f260490s = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 f260491d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.o3 f260492e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f260493f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f260494g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f260495h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f260496i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f260497m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f260498n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f260499o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f260500p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.Dialog f260501q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f260502r = true;

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c) {
        activityC19056xd4c1806c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "do open unipay order");
        activityC19056xd4c1806c.f260501q = db5.e1.Q(activityC19056xd4c1806c, activityC19056xd4c1806c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), activityC19056xd4c1806c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.j3(activityC19056xd4c1806c));
        new gs4.b().l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.k3(activityC19056xd4c1806c));
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c) {
        activityC19056xd4c1806c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "do close unipay order");
        activityC19056xd4c1806c.f260501q = db5.e1.Q(activityC19056xd4c1806c, activityC19056xd4c1806c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), activityC19056xd4c1806c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.l3(activityC19056xd4c1806c));
        new gs4.a().l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.m3(activityC19056xd4c1806c));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d6b;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f260491d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395) findViewById(com.p314xaae8f345.mm.R.id.f569226ph3);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d6_, (android.view.ViewGroup) null, false);
        this.f260493f = viewGroup;
        this.f260495h = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pgz);
        this.f260496i = (android.widget.TextView) this.f260493f.findViewById(com.p314xaae8f345.mm.R.id.pgv);
        this.f260497m = (android.widget.TextView) this.f260493f.findViewById(com.p314xaae8f345.mm.R.id.pgx);
        this.f260498n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) this.f260493f.findViewById(com.p314xaae8f345.mm.R.id.pgw);
        this.f260499o = (android.widget.TextView) this.f260493f.findViewById(com.p314xaae8f345.mm.R.id.pgy);
        this.f260491d.addHeaderView(this.f260493f, null, false);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d69, (android.view.ViewGroup) null, false);
        this.f260494g = viewGroup2;
        this.f260500p = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.pgu);
        this.f260491d.addFooterView(this.f260494g, null, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.o3 o3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.o3(this);
        this.f260492e = o3Var;
        this.f260491d.setAdapter((android.widget.ListAdapter) o3Var);
        this.f260491d.m82185x4578645(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.f3(this));
        this.f260491d.m82189xa7c1925a(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.g3(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        mo43517x10010bd5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "do query uni pay order");
        this.f260501q = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.h3(this));
        new gs4.c().l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.i3(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16343, 1);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
