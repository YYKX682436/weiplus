package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class t9 extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w9 f87122a;

    public t9(com.tencent.mm.plugin.appbrand.page.w9 w9Var) {
        this.f87122a = w9Var;
    }

    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        com.tencent.mm.plugin.appbrand.page.x9 x9Var;
        if (consoleMessage == null || (x9Var = this.f87122a.f87205v) == null || x9Var.f87253a == null) {
            return false;
        }
        cf.o.a(consoleMessage, "Luggage.AppBrandWebViewClient" + java.lang.String.format(java.util.Locale.ENGLISH, ":page[%s %s]", x9Var.f87253a.getAppId(), x9Var.f87253a.X1()), true);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean c(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWebView", "WebChromeClient onEnterFullscreen");
        com.tencent.mm.plugin.appbrand.page.w9 w9Var = this.f87122a;
        if (!w9Var.isXWalkKernel()) {
            return false;
        }
        xi1.m mVar = w9Var.f87206w;
        if (mVar == null) {
            return true;
        }
        mVar.b(new com.tencent.mm.plugin.appbrand.page.s9(this, customViewCallback));
        return true;
    }

    @Override // com.tencent.xweb.s0
    public boolean d() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWebView", "WebChromeClient onExitFullscreen");
        return this.f87122a.isXWalkKernel();
    }

    @Override // com.tencent.xweb.s0
    public void h() {
        try {
            xi1.m mVar = this.f87122a.f87206w;
            if (mVar != null) {
                mVar.g();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWebView", "onHideCustomView error " + e17.getMessage());
        }
    }

    @Override // com.tencent.xweb.s0
    public void p(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.tencent.mm.plugin.appbrand.page.w9 w9Var = this.f87122a;
        try {
            xi1.m mVar = w9Var.f87206w;
            if (mVar != null) {
                mVar.e(view, 90);
                w9Var.f87206w.b(customViewCallback);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWebView", "onShowCustomView error " + e17.getMessage());
        }
    }
}
