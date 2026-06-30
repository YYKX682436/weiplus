package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class a implements tx5.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.CookieManager f302077a;

    public a() {
        by5.c4.c("SysCookieManagerWrapper", "SysCookieManagerWrapper, Default.");
        try {
            this.f302077a = android.webkit.CookieManager.getInstance();
        } catch (java.lang.Exception e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            by5.c4.g("SysCookieManagerWrapper", "Create sys cookie manager failed." + stackTraceString);
            xx5.g.a(4, stackTraceString, 3, java.lang.String.valueOf(by5.e.d()));
        }
    }

    @Override // tx5.b
    public java.lang.String a(java.lang.String str) {
        android.webkit.CookieManager cookieManager = this.f302077a;
        return cookieManager == null ? "" : cookieManager.getCookie(str);
    }

    @Override // tx5.b
    public void b(java.lang.String str, java.lang.String str2) {
        android.webkit.CookieManager cookieManager = this.f302077a;
        if (cookieManager == null) {
            return;
        }
        cookieManager.setCookie(str, str2);
    }

    @Override // tx5.b
    public void c() {
        android.webkit.CookieManager cookieManager = this.f302077a;
        if (cookieManager == null) {
            return;
        }
        cookieManager.removeSessionCookie();
    }

    @Override // tx5.b
    public void d(boolean z17) {
        android.webkit.CookieManager cookieManager = this.f302077a;
        if (cookieManager == null) {
            return;
        }
        cookieManager.setAcceptCookie(z17);
    }

    @Override // tx5.b
    public void e() {
        android.webkit.CookieManager cookieManager = this.f302077a;
        if (cookieManager == null) {
            return;
        }
        cookieManager.removeAllCookie();
    }

    @Override // tx5.b
    public void f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, boolean z17) {
        android.webkit.CookieManager cookieManager = this.f302077a;
        if (cookieManager == null) {
            return;
        }
        if (c27816xac2547f9 == null || c27816xac2547f9.mo120167xbfee89b7() == null || !(c27816xac2547f9.mo120167xbfee89b7() instanceof android.webkit.WebView)) {
            by5.c4.c("SysCookieManagerWrapper", "setAcceptThirdPartyCookies, webview kind not match");
        } else {
            cookieManager.setAcceptThirdPartyCookies((android.webkit.WebView) c27816xac2547f9.mo120167xbfee89b7(), z17);
        }
    }

    @Override // tx5.b
    /* renamed from: flush */
    public void mo120241x5d03b04() {
        android.webkit.CookieManager cookieManager = this.f302077a;
        if (cookieManager == null) {
            return;
        }
        cookieManager.flush();
    }

    public a(android.webkit.CookieManager cookieManager) {
        this.f302077a = cookieManager;
    }
}
