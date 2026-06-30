package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.brandservice.ui.BrandServiceLocalSearchUI */
/* loaded from: classes9.dex */
public class ActivityC12978x882bdc19 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements y90.j, pr1.j {

    /* renamed from: d, reason: collision with root package name */
    public y90.k f175536d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 f175537e;

    @Override // y90.j
    public void G2() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceLocalSearchUI", "search biz, key word : %s", str);
        this.f175537e.a(str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569780o1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1) findViewById(com.p314xaae8f345.mm.R.id.ndr);
        this.f175537e = viewOnCreateContextMenuListenerC12986xffd38cd1;
        viewOnCreateContextMenuListenerC12986xffd38cd1.m79359x764d6925(1);
        this.f175537e.m54322xc605daef(getIntent().getBooleanExtra("is_return_result", false));
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd12 = this.f175537e;
        viewOnCreateContextMenuListenerC12986xffd38cd12.f279405p = false;
        fb5.m mVar = viewOnCreateContextMenuListenerC12986xffd38cd12.f279399g;
        mVar.c(mVar.f342427d);
        this.f175537e.d(false);
        this.f175537e.m54324x6a3f32bf(false);
        this.f175537e.m54319x3d908ba5(this);
        this.f175537e.m54323xfd4b21cd(getIntent().getIntExtra("intent_service_type", 251658241));
        ((x90.q) ((y90.l) i95.n0.c(y90.l.class))).getClass();
        a31.v vVar = new a31.v();
        this.f175536d = vVar;
        vVar.c(true);
        a31.v vVar2 = (a31.v) this.f175536d;
        vVar2.f82532u = this;
        vVar2.f291857i = this;
        vVar2.f82529r = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        mo48674x36654fab();
        return true;
    }

    @Override // y90.j
    public void o2(boolean z17, java.lang.String[] strArr, long j17, int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(b3.l.m9702x7444d5ad(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo43517x10010bd5();
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        gm0.j1.d().g(new f21.g0(18));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.c9) this.f175536d).j(this, menu);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f175537e.j();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((a31.v) this.f175536d).s();
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.c9) this.f175536d).a();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        ((a31.v) this.f175536d).m(this, menu);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}
