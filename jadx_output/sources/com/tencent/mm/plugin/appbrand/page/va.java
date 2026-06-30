package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class va extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wa f87180a;

    public va(com.tencent.mm.plugin.appbrand.page.wa waVar) {
        this.f87180a = waVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        this.f87180a.f87211e.c(str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f87180a.f87211e.getClass();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        if (sslError.getPrimaryError() != 3) {
            sslErrorHandler.cancel();
        } else if (this.f87180a.f87211e.b(sslError.getCertificate())) {
            sslErrorHandler.proceed();
        } else {
            sslErrorHandler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return this.f87180a.f87211e.a(str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null || com.tencent.mm.sdk.platformtools.t8.K0(webResourceRequest.getUrl().toString())) {
            return null;
        }
        return this.f87180a.f87211e.a(webResourceRequest.getUrl().toString());
    }
}
