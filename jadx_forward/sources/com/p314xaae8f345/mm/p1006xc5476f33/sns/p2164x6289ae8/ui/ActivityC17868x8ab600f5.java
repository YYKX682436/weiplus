package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2164x6289ae8.ui;

/* renamed from: com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI */
/* loaded from: classes4.dex */
public class ActivityC17868x8ab600f5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f245558m = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f245559g;

    /* renamed from: h, reason: collision with root package name */
    public ja4.i f245560h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f245561i = new ja4.e(this);

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571066cv3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563469c91);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jcj);
        mo54448x9c8c0d33(new ja4.f(this));
        this.f245559g = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.izx);
        ja4.i iVar = new ja4.i(mo55332x76847179());
        this.f245560h = iVar;
        this.f245559g.setAdapter((android.widget.ListAdapter) iVar);
        this.f245559g.setOnScrollListener(this.f245561i);
        this.f245559g.setOnItemClickListener(new ja4.g(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.List list;
        super.onCreate(bundle);
        mo43517x10010bd5();
        java.lang.String stringExtra = getIntent().getStringExtra("key_feedid");
        synchronized (cb3.b.class) {
            if (stringExtra != null) {
                if (stringExtra.equals(cb3.b.f121880b)) {
                    list = cb3.b.f121879a;
                }
            }
            list = null;
        }
        if (list != null && list.size() != 0) {
            ja4.i iVar = this.f245560h;
            iVar.f380164d = list;
            iVar.notifyDataSetChanged();
        }
        getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a68));
        mo54449x3f86539a((java.lang.String) null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
