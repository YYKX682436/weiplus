package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class q implements tx5.i {
    public q(com.p314xaae8f345.p3210x3857dc.sys.l lVar) {
    }

    @Override // tx5.i
    public tx5.g a() {
        return null;
    }

    @Override // tx5.i
    public tx5.f b(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        try {
            return new com.p314xaae8f345.p3210x3857dc.sys.v(c27816xac2547f9);
        } catch (java.lang.Throwable th6) {
            java.lang.String message = th6.getMessage();
            if (message != null && message.contains("Calling View methods on another thread than the UI thread.")) {
                by5.c4.c("SysWebFactory", "createWebView error:" + th6);
                boolean z17 = com.p314xaae8f345.p3210x3857dc.sys.o.f302098a;
                by5.d4.a("SysWebFactory.PreIniter", false).edit().putBoolean("isEnforceMainLooper", true).apply();
            }
            throw th6;
        }
    }

    @Override // tx5.i
    public boolean c(android.content.Context context, com.p314xaae8f345.p3210x3857dc.e1 e1Var) {
        by5.c4.f("SysWebFactory", "initWebviewCore");
        boolean z17 = com.p314xaae8f345.p3210x3857dc.sys.o.f302098a;
        synchronized (com.p314xaae8f345.p3210x3857dc.sys.o.class) {
            if (com.p314xaae8f345.p3210x3857dc.sys.o.f302098a) {
                by5.c4.f("SysWebFactory.PreIniter", "preInit, has already init");
            } else if (!com.p314xaae8f345.p3210x3857dc.sys.o.b()) {
                by5.c4.f("SysWebFactory.PreIniter", "preInit, not enforce main looper");
                com.p314xaae8f345.p3210x3857dc.sys.o.f302098a = true;
                if (e1Var != null) {
                    e1Var.a();
                }
            } else if (com.p314xaae8f345.p3210x3857dc.sys.o.f302100c.get()) {
                by5.c4.f("SysWebFactory.PreIniter", "preInit, enforce main looper & already called");
                if (e1Var != null) {
                    e1Var.a();
                }
            } else {
                by5.c4.f("SysWebFactory.PreIniter", "preInit, enforce main looper & not yet called");
                com.p314xaae8f345.p3210x3857dc.sys.n nVar = new com.p314xaae8f345.p3210x3857dc.sys.n(e1Var);
                if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                    nVar.run();
                } else {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(nVar);
                }
            }
        }
        return true;
    }

    @Override // tx5.i
    public boolean d() {
        return com.p314xaae8f345.p3210x3857dc.sys.o.f302098a;
    }

    @Override // tx5.i
    public tx5.e e() {
        boolean z17 = com.p314xaae8f345.p3210x3857dc.o2.c() && y4.n.a(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74964x93d07063);
        if ((!com.p314xaae8f345.p3210x3857dc.sys.o.b() ? true : com.p314xaae8f345.p3210x3857dc.sys.o.f302100c.get()) && !z17) {
            by5.c4.f("SysWebFactory", "getWebviewStorage, already init");
            return i();
        }
        try {
            return (tx5.e) by5.a1.e(new com.p314xaae8f345.p3210x3857dc.sys.m(this));
        } catch (java.lang.Throwable th6) {
            by5.c4.d("SysWebFactory", "getCookieManager error", th6);
            xx5.l.a(4, 1, z17);
            return i();
        }
    }

    @Override // tx5.i
    public void f(android.content.Context context, boolean z17) {
        try {
            android.webkit.WebView webView = new android.webkit.WebView(context);
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
            webView.clearCache(true);
            android.webkit.WebViewDatabase.getInstance(context).clearUsernamePassword();
            android.webkit.WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
            android.webkit.WebViewDatabase.getInstance(context).clearFormData();
            android.webkit.WebIconDatabase.getInstance().removeAllIcons();
            if (z17) {
                android.webkit.CookieSyncManager.createInstance(context);
                tx5.b mo120517x5ad7a0f3 = mo120517x5ad7a0f3();
                if (mo120517x5ad7a0f3 != null) {
                    mo120517x5ad7a0f3.e();
                }
            }
            tx5.e e17 = e();
            if (e17 != null) {
                e17.a();
            }
        } catch (java.lang.Throwable th6) {
            by5.c4.d("SysWebFactory", "clearAllWebViewCache error", th6);
        }
    }

    @Override // tx5.i
    public tx5.h g() {
        return null;
    }

    @Override // tx5.i
    /* renamed from: getCookieManager */
    public tx5.b mo120517x5ad7a0f3() {
        boolean z17 = com.p314xaae8f345.p3210x3857dc.o2.c() && y4.n.a(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74964x93d07063);
        if ((!com.p314xaae8f345.p3210x3857dc.sys.o.b() ? true : com.p314xaae8f345.p3210x3857dc.sys.o.f302100c.get()) && !z17) {
            by5.c4.f("SysWebFactory", "getCookieManager, already init");
            return h();
        }
        try {
            return (tx5.b) by5.a1.e(new com.p314xaae8f345.p3210x3857dc.sys.l(this));
        } catch (java.lang.Throwable th6) {
            by5.c4.d("SysWebFactory", "getCookieManager error", th6);
            xx5.l.a(3, 1, z17);
            return h();
        }
    }

    @Override // tx5.i
    /* renamed from: getProfileStore */
    public tx5.d mo120518xa93cb32e() {
        by5.a1.a();
        return new com.p314xaae8f345.p3210x3857dc.sys.c();
    }

    public final tx5.b h() {
        boolean z17 = com.p314xaae8f345.p3210x3857dc.o2.c() && y4.n.a(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74964x93d07063);
        if (z17) {
            by5.c4.f("SysWebFactory", "getCookieManagerInner, profileName:" + com.p314xaae8f345.p3210x3857dc.o2.f301901c);
            tx5.c mo120236x125d89b4 = com.p314xaae8f345.p3210x3857dc.c0.a().mo120236x125d89b4(com.p314xaae8f345.p3210x3857dc.o2.f301901c);
            if (mo120236x125d89b4 != null) {
                return mo120236x125d89b4.mo120507x5ad7a0f3();
            }
            by5.c4.c("SysWebFactory", "getCookieManagerInner error, profile is null, Name: " + com.p314xaae8f345.p3210x3857dc.o2.f301901c);
            xx5.l.a(3, 1, z17);
            return null;
        }
        by5.c4.f("SysWebFactory", "getCookieManagerInner, isSupportMultiProfile: " + com.p314xaae8f345.p3210x3857dc.o2.c() + ", isFeatureSupported: " + y4.n.a(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74964x93d07063));
        try {
            return new com.p314xaae8f345.p3210x3857dc.sys.a();
        } catch (java.lang.Exception e17) {
            by5.c4.c("SysWebFactory", "getCookieManager error, sys CookieManager#getInstance error: " + e17);
            xx5.l.a(3, 1, z17);
            return null;
        }
    }

    public final tx5.e i() {
        boolean z17 = com.p314xaae8f345.p3210x3857dc.o2.c() && y4.n.a(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74964x93d07063);
        if (z17) {
            by5.c4.f("SysWebFactory", "getWebviewStorageInner, profileName:" + com.p314xaae8f345.p3210x3857dc.o2.f301901c);
            tx5.c mo120236x125d89b4 = com.p314xaae8f345.p3210x3857dc.c0.a().mo120236x125d89b4(com.p314xaae8f345.p3210x3857dc.o2.f301901c);
            if (mo120236x125d89b4 != null) {
                return mo120236x125d89b4.mo120508xb280207d();
            }
            by5.c4.c("SysWebFactory", "getWebviewStorage error, profile is null, Name: " + com.p314xaae8f345.p3210x3857dc.o2.f301901c);
            xx5.l.a(4, 1, z17);
            return null;
        }
        by5.c4.f("SysWebFactory", "getWebviewStorage, isSupportMultiProfile: " + com.p314xaae8f345.p3210x3857dc.o2.c() + ", isFeatureSupported: " + y4.n.a(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74964x93d07063));
        try {
            return new com.p314xaae8f345.p3210x3857dc.sys.r();
        } catch (java.lang.Exception e17) {
            by5.c4.c("SysWebFactory", "getWebviewStorage error, sys WebStorage#getInstance error: " + e17);
            xx5.l.a(4, 1, z17);
            return null;
        }
    }
}
