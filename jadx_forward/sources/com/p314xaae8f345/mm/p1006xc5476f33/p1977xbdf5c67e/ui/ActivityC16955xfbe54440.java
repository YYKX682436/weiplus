package com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui;

/* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI */
/* loaded from: classes4.dex */
public class ActivityC16955xfbe54440 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f236586d;

    /* renamed from: e, reason: collision with root package name */
    public ts3.m f236587e;

    public final void T6(int i17) {
        gm0.j1.u().c().w(868518889, java.lang.Integer.valueOf(i17));
        r45.ap4 ap4Var = new r45.ap4();
        ap4Var.f451708d = i17;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(43, ap4Var));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", "newsapp");
        intent.addFlags(67108864);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, this);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cc9;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f236587e = new ts3.m(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(868518889, null)));
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.ljr);
        this.f236586d = listView;
        listView.setAdapter((android.widget.ListAdapter) this.f236587e);
        this.f236586d.setOnItemClickListener(new ts3.i(this));
        this.f236587e.notifyDataSetChanged();
        mo54448x9c8c0d33(new ts3.j(this));
        m78597x53c22598(new ts3.k(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.u().c().w(868518890, "in");
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bga);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        ts3.m mVar = this.f236587e;
        if (mVar == null) {
            return true;
        }
        T6(mVar.f503215f);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f236587e.notifyDataSetChanged();
    }
}
