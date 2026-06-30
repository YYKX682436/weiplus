package com.tencent.mm.plugin.downloader.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-downloader_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes8.dex */
public final class GameCloudAppDownloadUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f97220m = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f97221d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f97222e;

    /* renamed from: f, reason: collision with root package name */
    public long f97223f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper f97224g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f97225h = jz5.h.b(new j02.d(this));

    /* renamed from: i, reason: collision with root package name */
    public final vz.i1 f97226i = new j02.a0(this);

    public static final void T6(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI, com.tencent.mm.plugin.downloader.model.CloudGameAppInfo cloudGameAppInfo) {
        gameCloudAppDownloadUI.getClass();
        com.tencent.mm.plugin.downloader_app.model.a aVar = new com.tencent.mm.plugin.downloader_app.model.a();
        aVar.f97234a = cloudGameAppInfo.f96926r;
        aVar.f97235b = cloudGameAppInfo.f96927s;
        aVar.f97240g = cloudGameAppInfo.f96925q;
        aVar.f97236c = cloudGameAppInfo.f96915d;
        aVar.f97241h = cloudGameAppInfo.f96928t;
        aVar.f97237d = cloudGameAppInfo.f96917f;
        aVar.f97239f = cloudGameAppInfo.f96918g;
        aVar.f97247n = 1;
        aVar.f97248o = cloudGameAppInfo.f96929u;
        vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        j02.e eVar = new j02.e(gameCloudAppDownloadUI);
        ((uz.c2) a2Var).getClass();
        com.tencent.mm.plugin.downloader.model.j1.c(context, aVar, false, eVar);
    }

    public static final void U6(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI, android.content.Context context, java.lang.String str) {
        gameCloudAppDownloadUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", false);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static final void V6(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI, int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        if (gameCloudAppDownloadUI.f97221d) {
            return;
        }
        gameCloudAppDownloadUI.f97221d = true;
        c02.w wVar = new c02.w();
        wVar.f37636d = i17;
        if (i17 == 1) {
            wVar.f37637e = str;
        } else {
            wVar.f37638f = str2;
        }
        wVar.f37640h = z17 ? 1 : 2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = wVar;
        lVar.f70665b = new c02.x();
        lVar.f70666c = "/cgi-bin/mmgame-bin/setretainrecord";
        lVar.f70667d = 4904;
        com.tencent.mm.ipcinvoker.wx_extension.h0.a(lVar.a(), j02.c0.f296981a);
    }

    public final b02.a W6() {
        return (b02.a) ((jz5.n) this.f97225h).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (this.f97222e) {
            setResult(-1);
        } else {
            setResult(0);
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTransparentTheme(true);
        customfixStatusbar(true);
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("appInfoWrapper");
        h0Var.f310123d = parcelableExtra;
        if (parcelableExtra == null) {
            com.tencent.mars.xlog.Log.e("GameDetainManager.GameCloudAppDownloadUI", "gamelog.download, download, detain ,appInfoWrapper is null ");
            finish();
            return;
        }
        this.f97224g = (com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper) parcelableExtra;
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
        getWindow().getDecorView().post(new j02.b0(this, h0Var));
        vz.i1 i1Var = this.f97226i;
        if (i1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.downloader.event.c.f96909f).add(i1Var);
        } else {
            com.tencent.mm.plugin.downloader.event.c cVar = com.tencent.mm.plugin.downloader.event.c.f96907d;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        vz.i1 i1Var = this.f97226i;
        if (i1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.downloader.event.c.f96909f).remove(i1Var);
        } else {
            com.tencent.mm.plugin.downloader.event.c cVar = com.tencent.mm.plugin.downloader.event.c.f96907d;
        }
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }
}
