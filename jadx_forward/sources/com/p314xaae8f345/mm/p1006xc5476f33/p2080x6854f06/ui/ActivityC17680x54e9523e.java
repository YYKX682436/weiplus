package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI */
/* loaded from: classes11.dex */
public class ActivityC17680x54e9523e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.e1 f243752d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f243753e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f243754f;

    /* renamed from: g, reason: collision with root package name */
    public final db5.t4 f243755g = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.c1(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cmv;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.j3m);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.w0(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.z0(this));
        this.f243753e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.ms9);
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.e1(this, this);
        this.f243752d = e1Var;
        this.f243753e.setAdapter((android.widget.ListAdapter) e1Var);
        this.f243753e.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.a1(this));
        this.f243753e.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.b1(this, new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(this)));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f243754f = ((h34.h0) this.f243752d.getItem(adapterContextMenuInfo.position)).f4178xdec927b;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f243752d.c();
        super.onDestroy();
    }
}
