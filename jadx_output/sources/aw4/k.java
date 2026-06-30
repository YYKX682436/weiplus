package aw4;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw4.l f14891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(aw4.l lVar) {
        super(1);
        this.f14891d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        zy2.c5 param = (zy2.c5) obj;
        kotlin.jvm.internal.o.g(param, "param");
        aw4.q i17 = this.f14891d.i();
        if (i17 != null && (webView = i17.getWebView()) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", param.f477367a);
            jSONObject.put("playbackTime", param.f477368b);
            jSONObject.put("isPause", param.f477369c);
            jSONObject.put("playbackRate", java.lang.Float.valueOf(param.f477370d));
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "onFeedStopPlay " + jSONObject);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onFeedStopPlay", jSONObject2);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onFeedStopPlay", "onFeedStopPlay", jSONObject2}, 3));
                kotlin.jvm.internal.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(webView, format));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f302826a;
    }
}
