package by4;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI f36387a;

    public f(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webviewUI) {
        kotlin.jvm.internal.o.g(webviewUI, "webviewUI");
        this.f36387a = webviewUI;
    }

    public final void a(com.tencent.mm.ui.widget.MMWebView viewWV, boolean z17) {
        kotlin.jvm.internal.o.g(viewWV, "viewWV");
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f36387a;
        if (com.tencent.mm.ui.b4.c(webViewUI)) {
            android.view.KeyEvent.Callback webViewUI2 = viewWV.getWebViewUI();
            com.tencent.xweb.i2 i2Var = webViewUI2 instanceof com.tencent.xweb.i2 ? (com.tencent.xweb.i2) webViewUI2 : null;
            if (i2Var != null) {
                i2Var.setXWebSafeAreaProvider(new by4.e(z17, new java.lang.ref.WeakReference(webViewUI), new java.lang.ref.WeakReference(viewWV)));
                i2Var.requestXWebSafeAreaUpdate();
            }
        }
    }
}
