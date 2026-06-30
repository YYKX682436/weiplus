package bf3;

/* loaded from: classes7.dex */
public final class y extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bf3.z f19675a;

    public y(bf3.z zVar) {
        this.f19675a = zVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MBInspectorImpl", "webView page finished");
        bf3.z zVar = this.f19675a;
        zVar.f19685j = true;
        ym5.a1.f(new bf3.r(zVar));
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(request, "request");
        java.lang.String uri = request.getUrl().toString();
        bf3.z zVar = this.f19675a;
        java.lang.String str = zVar.f19678c;
        java.lang.String fileName = zVar.f19677b;
        if (kotlin.jvm.internal.o.b(uri, str)) {
            try {
                ((et.a) ((com.tencent.mm.plugin.appbrand.service.a5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.a5.class))).getClass();
                kotlin.jvm.internal.o.g(fileName, "fileName");
                java.io.InputStream a17 = com.tencent.mm.plugin.appbrand.appcache.e8.b().a(fileName);
                java.lang.String c17 = q75.g.c(fileName);
                com.tencent.mars.xlog.Log.i("MBInspectorImpl", "fetch WAGameVConsole.html ok");
                return new android.webkit.WebResourceResponse(c17, com.tencent.mapsdk.internal.rv.f51270c, a17);
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("MBInspectorImpl", "read WAGameVConsole.html failed...");
                ym5.a1.f(bf3.x.f19673d);
            }
        }
        return null;
    }
}
