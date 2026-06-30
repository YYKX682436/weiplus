package com.tencent.mm.plugin.downloader_app.search;

/* loaded from: classes8.dex */
public class DownloadSearchUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView f97345d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f97346e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f97347f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.tools.c9 f97348g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f97349h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f97350i;

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadSearchUI", "onSearchEditTextReady");
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadSearchUI", "onSearchChange");
        this.f97347f.setVisibility(8);
        java.lang.String str2 = this.f97349h;
        java.lang.String str3 = "";
        if (str2 != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2.equals(str == null ? "" : str)) {
                return;
            }
        }
        this.f97349h = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f97346e.setVisibility(8);
            this.f97345d.p1();
            this.f97350i = true;
            return;
        }
        this.f97345d.o1();
        this.f97350i = false;
        this.f97345d.o1();
        this.f97346e.setVisibility(0);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        c02.r rVar = new c02.r();
        rVar.f37622d = str;
        c02.v vVar = new c02.v();
        vVar.f37633d = 0;
        vVar.f37634e = 5;
        rVar.f37623e = vVar;
        lVar.f70664a = rVar;
        lVar.f70665b = new c02.s();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getgamesearch";
        lVar.f70667d = 2688;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new p02.k(this, str), false);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("search_key_word", str);
        } catch (org.json.JSONException unused) {
        }
        try {
            str3 = java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.io.UnsupportedEncodingException unused2) {
        }
        o02.a.b(13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 1, 2, "", "", str3);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadSearchUI", "onEnterSearch");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadSearchUI", "onQuitSearch");
        hideVKB();
        onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a4q;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        this.f97345d = (com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView) findViewById(com.tencent.mm.R.id.mfc);
        this.f97346e = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.mf_);
        this.f97347f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kch);
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9();
        this.f97348g = c9Var;
        c9Var.c(true);
        this.f97348g.f210324i = this;
        this.f97345d.setOnItemClickListener(new p02.j(this));
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadSearchUI", "onSearchKeyDown");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        this.f97345d.l1(str);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        o02.a.b(13, 0, 0, 1, "", "", "");
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        this.f97348g.j(this, menu);
        this.f97348g.q(getString(com.tencent.mm.R.string.bsn));
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.f97348g.m(this, menu);
        return true;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadSearchUI", "onClickClearText");
        o02.a.b(13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 2, 81, "", "", "");
    }
}
