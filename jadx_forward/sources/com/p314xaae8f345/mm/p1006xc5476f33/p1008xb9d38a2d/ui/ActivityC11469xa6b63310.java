package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI */
/* loaded from: classes11.dex */
public class ActivityC11469xa6b63310 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f155186m = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f155187d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f155188e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155189f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f155190g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l f155191h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f155192i;

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToFacebookRedirectUI", "doSend");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
        u1Var.u(this.f155187d);
        u1Var.f293529a.f293354b.f293261r = this.f155189f;
        u1Var.h(this.f155188e);
        u1Var.o(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571890sp));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572091yg);
        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ai(this, u1Var));
        u1Var.q(false);
    }

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToFacebookRedirectUI", "refreshFacebookToken");
        long r17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) gm0.j1.u().c().l(65831, null));
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(65830, null);
        if (str == null) {
            str = "";
        }
        if (java.lang.System.currentTimeMillis() - r17 <= 86400000 || str.length() <= 0) {
            T6();
            return;
        }
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l();
        this.f155191h = lVar;
        lVar.g(str);
        new v61.q0(this.f155191h, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.yh(this)).c();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToFacebookRedirectUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i17 == 0 && i18 == -1 && intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("bind_facebook_succ", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToFacebookRedirectUI", "bind facebooksucc %b", java.lang.Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                U6();
                T6();
                return;
            }
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60882xebef0e00, this);
        this.f155187d = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        this.f155188e = getIntent().getStringExtra("digest");
        this.f155189f = getIntent().getStringExtra("img");
        java.lang.String stringExtra = getIntent().getStringExtra("link");
        this.f155190g = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToFacebookRedirectUI", "title %s, digest:%s, img:%s, link:%s", this.f155187d, this.f155188e, this.f155189f, stringExtra);
        if (c01.z1.u()) {
            U6();
            T6();
        } else {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8.class);
            intent.putExtra("is_force_unbind", true);
            startActivityForResult(intent, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60882xebef0e00, this);
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f155191h;
        if (lVar != null) {
            lVar.c(this);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToFacebookRedirectUI", "type:%d, code:%d, msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        mo48674x36654fab();
        this.f155192i.dismiss();
        if (i17 == 4 && i18 == -68) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = "error";
            }
            db5.e1.u(mo55332x76847179(), str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.bi(this), null);
            return;
        }
        if (i17 == 0 && i18 == 0) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3v);
            if (!isFinishing()) {
                dp.a.m125854x26a183b(this, string, 0).show();
            }
            finish();
            return;
        }
        db5.e1.u(mo55332x76847179(), "err(" + i18 + "," + i17 + ")", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.xh(this), null);
    }
}
