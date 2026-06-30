package aw4;

/* loaded from: classes.dex */
public abstract class w extends aw4.l {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f14912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(aw4.o imageUIComponent) {
        super(imageUIComponent);
        kotlin.jvm.internal.o.g(imageUIComponent, "imageUIComponent");
        this.f14912e = "MicroMsg.WebSearch.WebSearchImageJSApi";
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getSearchAvatarList(java.lang.String str) {
        aw4.v c17;
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "");
            av4.j jVar = this.f14326a;
            aw4.o oVar = jVar instanceof aw4.o ? (aw4.o) jVar : null;
            if (oVar != null && (c17 = oVar.c()) != null) {
                kotlin.jvm.internal.o.d(optString);
                c17.c(optString);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getSearchImageList(java.lang.String str) {
        aw4.v c17;
        com.tencent.mars.xlog.Log.i(this.f14912e, "getSearchImageList " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("requestType", 0);
            java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "");
            av4.j jVar = this.f14326a;
            aw4.o oVar = jVar instanceof aw4.o ? (aw4.o) jVar : null;
            if (oVar != null && (c17 = oVar.c()) != null) {
                kotlin.jvm.internal.o.d(optString);
                c17.d(optInt, optString);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    public final void n(int i17, java.lang.String data) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("ret", i17);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, data);
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f14326a;
        if (jVar == null || (webView = jVar.getWebView()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchImageListReady", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchImageListReady", "onSearchImageListReady", jSONObject2}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(webView, format));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }
}
