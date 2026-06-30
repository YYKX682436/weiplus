package by5;

/* loaded from: classes13.dex */
public class a3 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String queryParameter = uri.getQueryParameter("set_dark_mode");
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            by5.c4.g("XWebCommandHandler", "handleCommand, set dark mode error, config:" + queryParameter);
            return qx5.a.a();
        }
        com.tencent.xweb.WebView webView = lVar != null ? lVar.getWebView() : null;
        boolean z17 = false;
        if (webView == null) {
            by5.c4.g("XWebCommandHandler", "setDarkMode, no webview");
        } else {
            by5.c4.f("XWebCommandHandler", "setDarkMode, config:" + queryParameter);
            if (android.text.TextUtils.equals(queryParameter, "1")) {
                webView.getSettings().B(2);
                webView.getSettings().A(2);
            } else if (android.text.TextUtils.equals(queryParameter, "2")) {
                webView.getSettings().B(2);
                webView.getSettings().A(1);
            } else if (android.text.TextUtils.equals(queryParameter, "3")) {
                webView.getSettings().B(0);
            } else if (!android.text.TextUtils.equals(queryParameter, "4")) {
                by5.c4.g("XWebCommandHandler", "setDarkMode, config error:" + queryParameter);
            }
            z17 = true;
        }
        return !z17 ? qx5.a.a() : qx5.a.b();
    }
}
