package av4;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final av4.y0 f14350a = new av4.y0();

    public final void a(com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView, java.lang.String funcName, org.json.JSONObject paramsObj) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(funcName, "funcName");
        kotlin.jvm.internal.o.g(paramsObj, "paramsObj");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "notifyJsEvent " + funcName + ' ' + paramsObj);
            pm0.v.X(new av4.u0(funcName, webView, "javascript:window['" + funcName + "'] && " + funcName + '(' + paramsObj + ')'));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }

    public final void b(com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView, java.lang.String funcName, java.lang.String params) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(funcName, "funcName");
        kotlin.jvm.internal.o.g(params, "params");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEventFromFlutter: ".concat(funcName));
            pm0.v.X(new av4.v0(webView, "javascript:window['" + funcName + "'] && " + funcName + '(' + params + ')'));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApiNotifier", "notifyJsEventFromFlutter error, funcName: " + funcName + ", error: " + e17.getMessage());
        }
    }

    public final void c(com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView, java.lang.String funcName, org.json.JSONObject paramsObj) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(funcName, "funcName");
        kotlin.jvm.internal.o.g(paramsObj, "paramsObj");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.lang.String> keys = paramsObj.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            kotlin.jvm.internal.o.d(next);
            linkedHashMap.put(next, paramsObj.opt(next));
        }
        pm0.v.X(new av4.x0(funcName, nw4.x2.c(funcName, linkedHashMap, false, webView.getRandomStr()), webView));
    }
}
