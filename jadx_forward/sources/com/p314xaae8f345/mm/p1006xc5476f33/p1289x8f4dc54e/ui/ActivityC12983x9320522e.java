package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizSearchUI */
/* loaded from: classes9.dex */
public class ActivityC12983x9320522e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements y90.j, or1.t0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f175568d;

    /* renamed from: e, reason: collision with root package name */
    public y90.k f175569e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 f175570f;

    @Override // y90.j
    public void G2() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnterpriseBizSearchUI", "search biz, key word : %s", str);
        this.f175570f.a(str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a96;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f175568d)) {
            java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
            this.f175568d = stringExtra;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                finish();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871) findViewById(com.p314xaae8f345.mm.R.id.ndr);
        this.f175570f = c12980x8e9ea871;
        c12980x8e9ea871.m54313x16db6000(this.f175568d);
        this.f175570f.m54312x542a48d3(true);
        this.f175570f.i();
        this.f175570f.m79359x764d6925(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea8712 = this.f175570f;
        c12980x8e9ea8712.getClass();
        c12980x8e9ea8712.m79360xa1aeda28(new or1.j0(c12980x8e9ea8712));
        if (c12980x8e9ea8712.m79354xfb82a219() == 0) {
            c12980x8e9ea8712.m79361x1c3e70c(new or1.k0(c12980x8e9ea8712));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea8713 = this.f175570f;
        c12980x8e9ea8713.f279405p = false;
        fb5.m mVar = c12980x8e9ea8713.f279399g;
        mVar.c(mVar.f342427d);
        this.f175570f.d(false);
        this.f175570f.m54315xcc7da8b2(this);
        ((android.widget.TextView) this.f175570f.mo48657x932e1f79()).setText(com.p314xaae8f345.mm.R.C30867xcad56011.c1k);
        ((x90.q) ((y90.l) i95.n0.c(y90.l.class))).getClass();
        a31.v vVar = new a31.v();
        this.f175569e = vVar;
        vVar.c(true);
        a31.v vVar2 = (a31.v) this.f175569e;
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
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.c9) this.f175569e).j(this, menu);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f175570f != null) {
            ((java.util.ArrayList) r01.q3.pj().f449808a).clear();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((a31.v) this.f175569e).s();
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.c9) this.f175569e).a();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        ((a31.v) this.f175569e).m(this, menu);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}
