package com.tencent.luggage.webview.default_impl;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pf.a f47721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.webview.default_impl.f f47722e;

    public a(com.tencent.luggage.webview.default_impl.f fVar, pf.a aVar) {
        this.f47722e = fVar;
        this.f47721d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.tencent.luggage.webview.default_impl.f fVar = this.f47722e;
        fVar.getClass();
        final pf.a aVar = this.f47721d;
        com.tencent.luggage.webview.default_impl.e eVar = new com.tencent.luggage.webview.default_impl.e(fVar, aVar);
        com.tencent.luggage.webview.default_impl.DefaultWebView defaultWebView = fVar.f47733e;
        defaultWebView.setWebViewClient(eVar);
        defaultWebView.setWebChromeClient(new android.webkit.WebChromeClient(fVar, aVar) { // from class: com.tencent.luggage.webview.default_impl.DefaultWebCore$6

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ pf.a f47720a;

            {
                this.f47720a = aVar;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
                java.lang.String a17 = ((od.n) ((sd.n0) this.f47720a).f406627a.f406634m.f344519d).a(str2);
                if (a17 == null) {
                    return false;
                }
                jsPromptResult.confirm(a17);
                return true;
            }
        });
    }
}
