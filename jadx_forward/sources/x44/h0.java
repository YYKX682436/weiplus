package x44;

/* loaded from: classes4.dex */
public final class h0 implements j35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x44.i0 f533366a;

    public h0(x44.i0 i0Var) {
        this.f533366a = i0Var;
    }

    @Override // j35.d
    public final void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInstallApkResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask$doAction$1$1");
        x44.i0 i0Var = this.f533366a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask");
            org.json.JSONObject l17 = i0Var.l();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask");
            i0Var.b(l17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdJs.InstallDownload", "install failed, check permission!!");
            i0Var.b(i0Var.g("install failed, check permission!!"));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInstallApkResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask$doAction$1$1");
    }
}
