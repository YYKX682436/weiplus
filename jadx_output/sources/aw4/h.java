package aw4;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aw4.l f14881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, aw4.l lVar) {
        super(3);
        this.f14880d = str;
        this.f14881e = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        java.lang.String str = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj3).intValue();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("ret", java.lang.Integer.valueOf(intValue));
            jSONObject.putOpt("url", str);
            jSONObject.putOpt("requestId", this.f14880d);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.BaseWebSearchJSApi", "getFinderLivePreviewUrl " + e17.getMessage());
        }
        aw4.q i17 = this.f14881e.i();
        if (i17 != null && (webView = i17.getWebView()) != null) {
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onGetFinderLivePreviewUrl", jSONObject2);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onGetFinderLivePreviewUrl", "onGetFinderLivePreviewUrl", jSONObject2}, 3));
                kotlin.jvm.internal.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(webView, format));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e18, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f302826a;
    }
}
