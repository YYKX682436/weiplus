package bf3;

/* loaded from: classes7.dex */
public final class y extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bf3.z f101208a;

    public y(bf3.z zVar) {
        this.f101208a = zVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBInspectorImpl", "webView page finished");
        bf3.z zVar = this.f101208a;
        zVar.f101218j = true;
        ym5.a1.f(new bf3.r(zVar));
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.lang.String uri = request.getUrl().toString();
        bf3.z zVar = this.f101208a;
        java.lang.String str = zVar.f101211c;
        java.lang.String fileName = zVar.f101210b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uri, str)) {
            try {
                ((et.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.a5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.a5.class))).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
                java.io.InputStream a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.b().a(fileName);
                java.lang.String c17 = q75.g.c(fileName);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBInspectorImpl", "fetch WAGameVConsole.html ok");
                return new android.webkit.WebResourceResponse(c17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, a17);
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBInspectorImpl", "read WAGameVConsole.html failed...");
                ym5.a1.f(bf3.x.f101206d);
            }
        }
        return null;
    }
}
