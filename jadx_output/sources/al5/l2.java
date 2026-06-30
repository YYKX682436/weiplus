package al5;

/* loaded from: classes8.dex */
public abstract class l2 {
    public static com.tencent.mm.ui.widget.MMWebView a(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MMWebView", "TRACE_ORDER:MMWebView.java");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.tencent.mm.ui.widget.MMWebView.F;
        com.tencent.xweb.WebView.v0(context, com.tencent.xweb.f1.WV_KIND_PINUS, com.tencent.mm.sdk.platformtools.x2.n() ? "mm" : "tools", null);
        return new com.tencent.mm.ui.widget.MMWebView(context, null);
    }

    public static com.tencent.mm.ui.widget.MMWebView b(android.content.Context context) {
        try {
            com.tencent.mars.xlog.Log.i("MMWebView", "TRACE_ORDER:MMWebView.java");
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.tencent.mm.ui.widget.MMWebView.F;
            com.tencent.xweb.WebView.v0(context, com.tencent.xweb.f1.WV_KIND_PINUS, com.tencent.mm.sdk.platformtools.x2.n() ? "mm" : "tools", null);
            return new com.tencent.mm.ui.widget.MMWebView(context, null, 0, com.tencent.xweb.f1.WV_KIND_SYS);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
