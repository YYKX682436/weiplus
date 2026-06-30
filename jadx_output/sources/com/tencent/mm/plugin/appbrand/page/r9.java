package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class r9 extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w9 f87061a;

    public r9(com.tencent.mm.plugin.appbrand.page.w9 w9Var) {
        this.f87061a = w9Var;
    }

    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "shouldOverrideUrlLoading, url = %s", str);
        return true;
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        this.f87061a.f87205v.c(str);
    }

    @Override // com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f87061a.f87205v.getClass();
    }

    @Override // com.tencent.xweb.h1
    public void p(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWebView", "onReceivedError, errCode = %d, description = %s, failingUrl = %s", java.lang.Integer.valueOf(i17), str, str2);
    }

    @Override // com.tencent.xweb.h1
    public void s(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.y0 y0Var) {
        android.net.Uri url = x0Var.getUrl();
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWebView", "onReceivedHttpError, WebResourceRequest url = %s, ErrWebResourceResponse mimeType = %s, status = %d", url == null ? "null" : url.toString(), y0Var.f220621a, java.lang.Integer.valueOf(y0Var.f220623c));
    }

    @Override // com.tencent.xweb.h1
    public void t(com.tencent.xweb.WebView webView, com.tencent.xweb.l0 l0Var, android.net.http.SslError sslError) {
        if (sslError.getPrimaryError() != 3) {
            l0Var.cancel();
        } else if (this.f87061a.f87205v.b(sslError.getCertificate())) {
            l0Var.a();
        } else {
            l0Var.cancel();
        }
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 x(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var) {
        if (x0Var == null || x0Var.getUrl() == null || com.tencent.mm.sdk.platformtools.t8.K0(x0Var.getUrl().toString())) {
            return null;
        }
        return com.tencent.mm.plugin.appbrand.page.w9.E0(this.f87061a, x0Var.getUrl().toString());
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 y(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, android.os.Bundle bundle) {
        if (x0Var == null || x0Var.getUrl() == null || com.tencent.mm.sdk.platformtools.t8.K0(x0Var.getUrl().toString())) {
            return null;
        }
        return com.tencent.mm.plugin.appbrand.page.w9.E0(this.f87061a, x0Var.getUrl().toString());
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 z(com.tencent.xweb.WebView webView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return com.tencent.mm.plugin.appbrand.page.w9.E0(this.f87061a, str);
    }
}
