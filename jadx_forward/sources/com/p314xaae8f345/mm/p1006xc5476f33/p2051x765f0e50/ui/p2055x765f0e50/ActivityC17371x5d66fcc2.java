package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI */
/* loaded from: classes5.dex */
public class ActivityC17371x5d66fcc2 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f241672d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f241673e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570256a56;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iy7);
        this.f241672d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.cgi);
        this.f241673e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569277po1);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(12291, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f241672d;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = this.f241672d.getTextSize();
        ((ke0.e) xVar).getClass();
        c22621x7603e017.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str, textSize));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f241672d;
        c22621x7603e0172.mo81549xf579a34a(c22621x7603e0172.getText().length());
        this.f241673e.setText("" + (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(60, this.f241672d.getEditableText().toString()) / 2));
        ck5.f b17 = ck5.f.b(this.f241672d);
        b17.f124094f = 0;
        b17.f124093e = 60;
        b17.d(null);
        this.f241672d.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.j1(this, str));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k1(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572080y6), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l1(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78501x43e00957(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(v14.g.class);
    }
}
