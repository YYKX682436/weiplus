package k54;

/* loaded from: classes4.dex */
public final class e implements x54.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f385951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.f0 f385952b;

    public e(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.f0 f0Var) {
        this.f385951a = context;
        this.f385952b = f0Var;
    }

    @Override // x54.a
    /* renamed from: onActivityResult */
    public final void mo142005x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.Object obj = this.f385951a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onShowFileChooser$1");
        try {
            ((x54.b) obj).K3(2003);
            this.f385952b.b((android.app.Activity) obj, i17, i18, intent);
        } catch (java.lang.Throwable th6) {
            ot5.g.a("SnsAd.WebViewChromeClient", "file chooser onActivityResult exception: " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onShowFileChooser$1");
    }
}
