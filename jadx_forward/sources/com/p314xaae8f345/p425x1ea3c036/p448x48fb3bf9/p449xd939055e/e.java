package com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e;

/* loaded from: classes8.dex */
public class e extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf.a f129264a;

    public e(com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.f fVar, pf.a aVar) {
        this.f129264a = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        ((sd.n0) this.f129264a).b(str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        sd.o0 o0Var = ((sd.n0) this.f129264a).f488160a;
        o0Var.f488173s = false;
        o0Var.f488171q = str;
        o0Var.f488167m.f426052d.getClass();
        sd.p0 p0Var = o0Var.f488165h;
        if (p0Var != null) {
            p0Var.c(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return ((sd.n0) this.f129264a).c(webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        ((sd.n0) this.f129264a).a(str);
        return false;
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        return ((sd.n0) this.f129264a).c(str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        ((sd.n0) this.f129264a).a(webResourceRequest.getUrl().toString());
        return false;
    }
}
