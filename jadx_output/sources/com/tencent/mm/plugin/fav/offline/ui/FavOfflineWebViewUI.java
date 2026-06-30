package com.tencent.mm.plugin.fav.offline.ui;

/* loaded from: classes8.dex */
public class FavOfflineWebViewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f100255d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f100256e;

    /* renamed from: f, reason: collision with root package name */
    public o72.r2 f100257f;

    /* renamed from: g, reason: collision with root package name */
    public i82.a f100258g;

    /* renamed from: h, reason: collision with root package name */
    public j82.a f100259h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f100260i = true;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.abs;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        setBackBtn(new j82.b(this), com.tencent.mm.R.raw.actionbar_icon_dark_close);
        addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_more, new j82.g(this));
        com.tencent.mm.ui.widget.MMWebView mMWebView = (com.tencent.mm.ui.widget.MMWebView) getContentView().findViewById(com.tencent.mm.R.id.phz);
        mMWebView.getClass();
        this.f100255d = mMWebView;
        this.f100255d.getSettings().E(true);
        this.f100255d.getSettings().h(true);
        this.f100255d.addJavascriptInterface(this.f100259h, "java_obj");
        this.f100255d.setWebViewClient(new j82.h(this));
        try {
            this.f100255d.loadDataWithBaseURL(com.tencent.mm.sdk.platformtools.i1.b(getContext(), new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.w6.i(this.f100258g.field_path, false), false))).toString(), com.tencent.mm.vfs.w6.M(this.f100258g.field_path), "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, null);
        } catch (java.io.IOException unused) {
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != 1) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        if (new o72.b3().c(this.f100257f, false, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineWebViewUI", "[onActivityResult], FavSendFilter filter true");
            db5.e1.T(getApplicationContext(), getString(com.tencent.mm.R.string.cck));
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(this.f100257f);
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null);
        com.tencent.mm.plugin.fav.ui.f6 f6Var = new com.tencent.mm.plugin.fav.ui.f6();
        f6Var.f100848b = stringExtra;
        f6Var.f100849c = intent.getStringExtra("custom_send_text");
        f6Var.f100851e = linkedList;
        com.tencent.mm.plugin.fav.ui.x5.h(getContext(), f6Var, new j82.i(this, Q));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f100256e = getIntent().getStringExtra("key_path");
        long longExtra = getIntent().getLongExtra("key_detail_info_id", 0L);
        if (longExtra == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.offline.FavOfflineWebViewUI", "favLocalId is 0l!!!");
            finish();
            return;
        }
        i82.a z07 = ((e82.e) i95.n0.c(e82.e.class)).Ai().z0(this.f100256e);
        this.f100258g = z07;
        if (z07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.offline.FavOfflineWebViewUI", "favOffline is null!!!");
            finish();
            return;
        }
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(longExtra);
        this.f100257f = F;
        if (F == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.offline.FavOfflineWebViewUI", "curInfo is null!!!");
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineWebViewUI", "mUrl : %s", this.f100256e);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f100256e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.offline.FavOfflineWebViewUI", "mUrl is null!!!");
            finish();
        } else {
            this.f100259h = new j82.a(this, this.f100258g);
            initView();
        }
    }
}
