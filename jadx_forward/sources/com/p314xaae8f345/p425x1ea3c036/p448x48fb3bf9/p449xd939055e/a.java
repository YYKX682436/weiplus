package com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pf.a f129254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.f f129255e;

    public a(com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.f fVar, pf.a aVar) {
        this.f129255e = fVar;
        this.f129254d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.f fVar = this.f129255e;
        fVar.getClass();
        final pf.a aVar = this.f129254d;
        com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.e eVar = new com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.e(fVar, aVar);
        com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.C3957x84a7e2b8 c3957x84a7e2b8 = fVar.f129266e;
        c3957x84a7e2b8.setWebViewClient(eVar);
        c3957x84a7e2b8.setWebChromeClient(new android.webkit.WebChromeClient(fVar, aVar) { // from class: com.tencent.luggage.webview.default_impl.DefaultWebCore$6

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ pf.a f129253a;

            {
                this.f129253a = aVar;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
                java.lang.String a17 = ((od.n) ((sd.n0) this.f129253a).f488160a.f488167m.f426052d).a(str2);
                if (a17 == null) {
                    return false;
                }
                jsPromptResult.confirm(a17);
                return true;
            }
        });
    }
}
