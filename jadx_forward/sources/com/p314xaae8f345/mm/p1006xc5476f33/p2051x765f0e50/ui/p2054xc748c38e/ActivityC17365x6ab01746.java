package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e;

/* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI */
/* loaded from: classes8.dex */
public class ActivityC17365x6ab01746 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f241623g = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f241624e = null;

    /* renamed from: f, reason: collision with root package name */
    public tg3.r1 f241625f;

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        ((com.p314xaae8f345.mm.app.y7) f14.g.b()).u(new android.content.Intent(), this);
        finish();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8u);
        android.net.Uri data = getIntent().getData();
        if (data == null) {
            finish();
            return;
        }
        java.lang.String host = data.getHost();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (host == null) {
            host = "";
        }
        java.lang.String scheme = data.getScheme();
        java.lang.String str = scheme != null ? scheme : "";
        if (("http".equals(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt).equals(host)) || ("weixin".equals(str) && "qr".equals(host))) {
            gm0.j1.d().g(new c01.ra(new p14.a(this), null));
        } else {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f241625f != null) {
            gm0.j1.d().d(this.f241625f);
        }
        gm0.j1.d().q(106, this);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f241624e = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571457fn), true, true, new p14.b(this));
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetQRCodeInfoUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f241624e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f241624e = null;
        }
        if (i17 == 4 && i18 == -2004) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.hpn, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new p14.c(this));
            return;
        }
        if (i17 != 0 || i18 != 0) {
            java.lang.String G = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(G)) {
                G = getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            }
            db5.e1.t(this, G, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new p14.d(this));
            return;
        }
        r45.iw5 H = ((tg3.r1) m1Var).H();
        java.lang.String g17 = x51.j1.g(H.f458889d);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().v(g17, x51.j1.d(H.f458894i));
        android.content.Intent intent = new android.content.Intent();
        ((com.p314xaae8f345.mm.app.o7) ((o25.r1) i95.n0.c(o25.r1.class))).getClass();
        qk.p.a(intent, H, 30);
        if ((g17 == null ? "" : g17).length() > 0) {
            if ((H.f458899q & 8) > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, g17 + ",30");
            }
            j45.l.m(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", 1);
        }
    }
}
