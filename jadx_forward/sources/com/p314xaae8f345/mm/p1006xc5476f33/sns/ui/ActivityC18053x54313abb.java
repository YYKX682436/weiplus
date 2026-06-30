package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@db5.a(m123858x6ac9171 = 17)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentUI */
/* loaded from: classes4.dex */
public class ActivityC18053x54313abb extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f248671o = 0;

    /* renamed from: d, reason: collision with root package name */
    public fl5.i f248672d;

    /* renamed from: f, reason: collision with root package name */
    public int f248674f;

    /* renamed from: h, reason: collision with root package name */
    public int f248676h;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f248679n;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f248673e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f248675g = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f248677i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f248678m = false;

    public static /* synthetic */ fl5.i T6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb activityC18053x54313abb) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        fl5.i iVar = activityC18053x54313abb.f248672d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        return iVar;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.finish();
        if (this.f248678m || this.f248675g != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            return;
        }
        getIntent().getLongExtra("sns_id", 0L);
        getIntent().getLongExtra("action_st_time", 0L);
        getIntent().getStringExtra("sns_uxinfo");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String stringExtra = getIntent().getStringExtra("sns_actionresult");
        if (stringExtra == null) {
            stringExtra = "";
        }
        stringExtra.concat("|4:0:");
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.vj().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cr6;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        fl5.i iVar = (fl5.i) findViewById(com.p314xaae8f345.mm.R.id.cgi);
        this.f248672d = iVar;
        iVar.d(((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).cj());
        this.f248672d.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        this.f248672d.b(((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).bj(), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(mo55332x76847179()), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.th(this), null);
        this.f248672d.mo81552xeb238c3a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uh(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qh(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        int i17 = this.f248675g;
        if (i17 == 0) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.j9t);
        } else if (i17 == 1) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jhe);
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(68408, "");
            java.lang.String str2 = str != null ? str : "";
            gm0.j1.i();
            this.f248672d.mo70738x2526cb14(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(7489, 0), 0));
            this.f248672d.mo81553xabe4cf1a(str2);
            if (str2.length() > 0) {
                m78501x43e00957(true);
            } else {
                m78501x43e00957(false);
            }
        } else if (i17 == 2) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.j5s);
            m78501x43e00957(false);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.rh(this));
        this.f248672d.mo81552xeb238c3a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sh(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        com.p314xaae8f345.mm.ui.bk.u0(this);
        super.onCreate(bundle);
        this.f248674f = getIntent().getIntExtra("sns_comment_localId", 0);
        getIntent().getStringExtra("sns_id");
        this.f248675g = getIntent().getIntExtra("sns_comment_type", 0);
        this.f248676h = getIntent().getIntExtra("sns_source", 0);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(213, this);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(213, this);
        this.f248672d.mo81351x5cd39ffa();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        if (i17 != 4) {
            boolean onKeyDown = super.onKeyDown(i17, keyEvent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            return onKeyDown;
        }
        mo48674x36654fab();
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.onPause();
        fl5.i iVar = this.f248672d;
        if (iVar != null) {
            java.lang.String trim = iVar.getText().toString().trim();
            gm0.j1.i();
            gm0.j1.u().c().w(68408, trim);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
                gm0.j1.i();
                gm0.j1.u().c().w(7489, 0);
            } else {
                gm0.j1.i();
                gm0.j1.u().c().w(7489, java.lang.Integer.valueOf(this.f248672d.mo70737xc8d30aa0()));
            }
        }
        this.f248672d.mo81355xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.onResume();
        mo26063x7b383410();
        this.f248672d.d(((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).cj());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.mo808xfb85f7b0() + " @" + hashCode());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f248673e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var.mo808xfb85f7b0() == 213 && this.f248677i) {
            finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }
}
