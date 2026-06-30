package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e;

/* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI */
/* loaded from: classes11.dex */
public class ActivityC17368x689ea64e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f241647i = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f241649e;

    /* renamed from: f, reason: collision with root package name */
    public int f241650f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l f241651g;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f241648d = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241652h = false;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570255a55;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iic);
        this.f241649e = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.cgi);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569277po1);
        android.widget.EditText editText = this.f241649e;
        editText.addTextChangedListener(new al5.p1(editText, textView, 280));
        int intExtra = getIntent().getIntExtra("show_to", 2);
        this.f241650f = intExtra;
        if (intExtra == 4) {
            this.f241649e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ihc);
        } else {
            this.f241649e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ihe);
        }
        mo54448x9c8c0d33(new p14.e0(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572091yg), new p14.h0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(26, this);
        mo43517x10010bd5();
        if (c01.z1.u()) {
            com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(65830, null);
            if (str == null) {
                str = "";
            }
            lVar.g(str);
            new v61.q0(lVar, new p14.j0(this)).c();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(26, this);
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f241651g;
        if (lVar != null) {
            lVar.c(this);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToQQUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.mo808xfb85f7b0() != 26) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f241648d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f241648d = null;
        }
        if (i17 == 4 && i18 == -68) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = "error";
            }
            db5.e1.u(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new p14.i0(this), null);
            return;
        }
        if (i17 == 0 && i18 == 0) {
            mo48674x36654fab();
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3v);
            if (isFinishing()) {
                return;
            }
            dp.a.m125854x26a183b(this, string, 0).show();
            return;
        }
        this.f241652h = false;
        o25.s1 a17 = f14.g.a();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) a17).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4)) {
            return;
        }
        dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3u, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
    }
}
