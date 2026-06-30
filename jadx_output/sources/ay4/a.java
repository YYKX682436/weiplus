package ay4;

/* loaded from: classes7.dex */
public final class a extends com.tencent.mm.plugin.webview.core.o1 {
    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.xweb.z0 settings;
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.x(0);
    }
}
