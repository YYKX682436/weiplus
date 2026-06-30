package xw5;

/* loaded from: classes8.dex */
public final class f extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw5.d f539301a;

    public f(xw5.d dVar) {
        this.f539301a = dVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(copyOf.length == 0 ? "webView page finished" : java.lang.String.format("webView page finished", java.util.Arrays.copyOf(copyOf, copyOf.length)));
        xw5.d dVar = this.f539301a;
        dVar.f539287i = true;
        com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.C27729x662ce60d.f301597a.b(new xw5.RunnableC30742x2e0101(dVar));
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(request.getUrl().toString(), "wemagic://WAGameVConsole.html")) {
            return null;
        }
        yz5.a aVar = uw5.f.f513302b;
        java.lang.String str = aVar != null ? (java.lang.String) aVar.mo152xb9724478() : null;
        if (str == null) {
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(copyOf.length == 0 ? "setupWebView: vconsole script not found" : java.lang.String.format("setupWebView: vconsole script not found", java.util.Arrays.copyOf(copyOf, copyOf.length)));
            str = "VConsole Script Not Found!";
        }
        this.f539301a.getClass();
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
        byte[] bytes = str.getBytes(UTF_8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        return new android.webkit.WebResourceResponse("text/html", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, new java.io.ByteArrayInputStream(bytes));
    }
}
