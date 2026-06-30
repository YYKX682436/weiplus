package k54;

/* loaded from: classes8.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.webkit.GeolocationPermissions.Callback f385947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385948e;

    public c(android.webkit.GeolocationPermissions.Callback callback, java.lang.String str) {
        this.f385947d = callback;
        this.f385948e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onGeolocationPermissionsShowPrompt$1");
        ot5.g.c("SnsAd.WebViewChromeClient", "onGeolocationPermissionsShowPrompt ok");
        try {
            this.f385947d.invoke(this.f385948e, true, true);
        } catch (java.lang.Throwable unused) {
            ot5.g.a("SnsAd.WebViewChromeClient", "GeolocationPermissions.Callback has something wrong!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onGeolocationPermissionsShowPrompt$1");
    }
}
