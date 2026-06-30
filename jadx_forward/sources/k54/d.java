package k54;

/* loaded from: classes8.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.webkit.GeolocationPermissions.Callback f385949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385950e;

    public d(android.webkit.GeolocationPermissions.Callback callback, java.lang.String str) {
        this.f385949d = callback;
        this.f385950e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onGeolocationPermissionsShowPrompt$2");
        ot5.g.c("SnsAd.WebViewChromeClient", "onGeolocationPermissionsShowPrompt cancel");
        try {
            this.f385949d.invoke(this.f385950e, false, false);
        } catch (java.lang.Throwable unused) {
            ot5.g.a("SnsAd.WebViewChromeClient", "GeolocationPermissions.Callback has something wrong!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onGeolocationPermissionsShowPrompt$2");
    }
}
