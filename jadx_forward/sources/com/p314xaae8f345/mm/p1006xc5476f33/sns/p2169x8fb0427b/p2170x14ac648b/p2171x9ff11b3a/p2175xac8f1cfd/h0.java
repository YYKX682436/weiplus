package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes8.dex */
public class h0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.webkit.GeolocationPermissions.Callback f246760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f246762f;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j0 j0Var, android.webkit.GeolocationPermissions.Callback callback, java.lang.String str, android.app.Activity activity) {
        this.f246760d = callback;
        this.f246761e = str;
        this.f246762f = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatWebView", "onGeolocationPermissionsShowPrompt ok");
        try {
            this.f246760d.invoke(this.f246761e, true, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.f(this.f246762f);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatWebView", "GeolocationPermissions.Callback has something wrong!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient$1");
    }
}
