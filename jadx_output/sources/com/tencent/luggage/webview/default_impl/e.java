package com.tencent.luggage.webview.default_impl;

/* loaded from: classes8.dex */
public class e extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf.a f47731a;

    public e(com.tencent.luggage.webview.default_impl.f fVar, pf.a aVar) {
        this.f47731a = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        ((sd.n0) this.f47731a).b(str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        sd.o0 o0Var = ((sd.n0) this.f47731a).f406627a;
        o0Var.f406640s = false;
        o0Var.f406638q = str;
        o0Var.f406634m.f344519d.getClass();
        sd.p0 p0Var = o0Var.f406632h;
        if (p0Var != null) {
            p0Var.c(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return ((sd.n0) this.f47731a).c(webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        ((sd.n0) this.f47731a).a(str);
        return false;
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        return ((sd.n0) this.f47731a).c(str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        ((sd.n0) this.f47731a).a(webResourceRequest.getUrl().toString());
        return false;
    }
}
