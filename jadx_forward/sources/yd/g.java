package yd;

/* loaded from: classes7.dex */
public class g extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd.y f542482a;

    public g(yd.h hVar, yd.y yVar) {
        this.f542482a = yVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        this.f542482a.a();
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        java.lang.String uri = webResourceRequest.getUrl().toString();
        yd.y yVar = this.f542482a;
        ((yd.b) yVar).getClass();
        if (!yd.e.f542471j.equals(uri)) {
            return null;
        }
        yd.x b17 = yVar.b("WAGameVConsole.html");
        return new android.webkit.WebResourceResponse(b17.f542507a, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, b17.f542508b);
    }
}
