package com.p3263xee53b379;

/* loaded from: classes13.dex */
final class ab extends android.webkit.WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.b f302232a;

    public ab(com.p3263xee53b379.b bVar, byte b17) {
        this.f302232a = bVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        jsResult.cancel();
        android.widget.Toast.makeText(this.f302232a.f302234e, str2, 0).show();
        return true;
    }
}
