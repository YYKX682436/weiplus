package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8;

/* renamed from: com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI */
/* loaded from: classes8.dex */
public class ActivityC13238xdcc40f04 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.ui.p2740x696c9db.b9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.C13237x4b7b34f3 f178878d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f178879e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f178880f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f178881g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f178882h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f178883i;

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadSearchUI", "onSearchEditTextReady");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadSearchUI", "onSearchChange");
        this.f178880f.setVisibility(8);
        java.lang.String str2 = this.f178882h;
        java.lang.String str3 = "";
        if (str2 != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2.equals(str == null ? "" : str)) {
                return;
            }
        }
        this.f178882h = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f178879e.setVisibility(8);
            this.f178878d.p1();
            this.f178883i = true;
            return;
        }
        this.f178878d.o1();
        this.f178883i = false;
        this.f178878d.o1();
        this.f178879e.setVisibility(0);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        c02.r rVar = new c02.r();
        rVar.f119155d = str;
        c02.v vVar = new c02.v();
        vVar.f119166d = 0;
        vVar.f119167e = 5;
        rVar.f119156e = vVar;
        lVar.f152197a = rVar;
        lVar.f152198b = new c02.s();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getgamesearch";
        lVar.f152200d = 2688;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new p02.k(this, str), false);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("search_key_word", str);
        } catch (org.json.JSONException unused) {
        }
        try {
            str3 = java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.io.UnsupportedEncodingException unused2) {
        }
        o02.a.b(13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 1, 2, "", "", str3);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadSearchUI", "onEnterSearch");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadSearchUI", "onQuitSearch");
        mo48674x36654fab();
        onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a4q;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        this.f178878d = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.C13237x4b7b34f3) findViewById(com.p314xaae8f345.mm.R.id.mfc);
        this.f178879e = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.mf_);
        this.f178880f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kch);
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9();
        this.f178881g = c9Var;
        c9Var.c(true);
        this.f178881g.f291857i = this;
        this.f178878d.m53687xa1aeda28(new p02.j(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadSearchUI", "onSearchKeyDown");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        this.f178878d.l1(str);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        o02.a.b(13, 0, 0, 1, "", "", "");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        this.f178881g.j(this, menu);
        this.f178881g.q(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bsn));
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.f178881g.m(this, menu);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadSearchUI", "onClickClearText");
        o02.a.b(13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 2, 81, "", "", "");
    }
}
