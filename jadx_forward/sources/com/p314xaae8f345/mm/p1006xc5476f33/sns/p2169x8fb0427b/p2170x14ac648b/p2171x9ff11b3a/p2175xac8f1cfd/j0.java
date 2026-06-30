package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes8.dex */
public class j0 extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.Reference f246808a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w f246809b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.f0 f246810c;

    public j0(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.f0 f0Var) {
        this.f246808a = new java.lang.ref.WeakReference(activity);
        this.f246809b = wVar;
        this.f246810c = f0Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        android.app.Activity activity;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatWebView", "onGeolocationPermissionsShowPrompt, origin = %s", str);
        try {
            activity = (android.app.Activity) this.f246808a.get();
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingFloatWebView", "the application has no geo permission.");
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0.T(activity) && callback != null) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (j35.u.d(activity, "android.permission.ACCESS_FINE_LOCATION", true)) {
                db5.e1.K(activity, false, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575197l64, str), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575198l65), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.h0(this, callback, str, activity), new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.i0(this, callback, str, activity));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingFloatWebView", "the application has no geo permission.");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingFloatWebView", "the activity is finished.");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.z zVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onJsAlert", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onJsAlert", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean j(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.z zVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onJsConfirm", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onJsConfirm", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgressChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgressChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean q(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, android.webkit.ValueCallback valueCallback, com.p314xaae8f345.p3210x3857dc.r0 r0Var) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        try {
            android.app.Activity activity = (android.app.Activity) this.f246808a.get();
            if ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0.T(activity) && r0Var.c() == 0) || r0Var.c() == 1) {
                if (r0Var.b() != null && r0Var.b().length > 0) {
                    java.lang.String str3 = r0Var.b()[0];
                    if (r0Var.d()) {
                        if (!"image/*".equalsIgnoreCase(str3)) {
                            str2 = "video/*".equalsIgnoreCase(str3) ? "camcorder" : "camera";
                        }
                        str = str2;
                        this.f246810c.a(activity, this.f246809b, null, valueCallback, str3, str);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
                        return true;
                    }
                    str = "*";
                    this.f246810c.a(activity, this.f246809b, null, valueCallback, str3, str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatWebView", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
                return true;
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatWebView", "onShowFileChooser has something wrong");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        return false;
    }
}
