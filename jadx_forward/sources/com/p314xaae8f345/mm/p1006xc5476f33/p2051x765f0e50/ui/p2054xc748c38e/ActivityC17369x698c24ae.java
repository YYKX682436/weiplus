package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e;

/* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI */
/* loaded from: classes5.dex */
public class ActivityC17369x698c24ae extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f241653d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f241654e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f241655f = 1;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f241656g = null;

    public void T6() {
        ((jd0.q2) ((kd0.x2) i95.n0.c(kd0.x2.class))).getClass();
        g21.a aVar = new g21.a(c01.z1.r(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66561, null)), 0);
        gm0.j1.d().g(aVar);
        this.f241653d = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574500ih3), true, true, new p14.r0(this, aVar));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cne;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iic);
        this.f241654e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568374ml4);
        this.f241655f = getIntent().getIntExtra("show_to", 1);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mvq);
        int i17 = this.f241655f;
        if (i17 == 3) {
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ih8, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ihb)));
        } else if (i17 == 4) {
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ih8, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ih9)));
        } else if (i17 == 2) {
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ih8, getString(com.p314xaae8f345.mm.R.C30867xcad56011.iha)));
        } else {
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ih8, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ih_)));
        }
        T6();
        mo54448x9c8c0d33(new p14.l0(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new p14.m0(this));
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f568375ml5)).setOnClickListener(new p14.n0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        gm0.j1.d().a(be1.r0.f4232x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(be1.r0.f4232x366c91de, this);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowQRCodeStep1UI", "onSceneEnd: errType = %d errCode = %d errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f241653d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f241653d = null;
        }
        o25.s1 a17 = f14.g.a();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) a17).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 7)) {
            return;
        }
        if (i17 != 0 || i18 != 0) {
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fds, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        byte[] bArr = ((g21.a) ((kd0.j2) m1Var)).f349321h;
        this.f241656g = bArr;
        this.f241654e.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr));
    }
}
