package aw4;

/* loaded from: classes.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw4.y f14913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f14914e;

    public x(aw4.y yVar, org.json.JSONObject jSONObject) {
        this.f14913d = yVar;
        this.f14914e = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        aw4.q qVar = this.f14913d.f14844d;
        if (qVar == null || (webView = qVar.getWebView()) == null) {
            return;
        }
        java.lang.String jSONObject = this.f14914e.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onTeachSearchDataReady", jSONObject);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onTeachSearchDataReady", "onTeachSearchDataReady", jSONObject}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(webView, format));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }
}
