package av4;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView f14349f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView) {
        super(0);
        this.f14347d = str;
        this.f14348e = str2;
        this.f14349f = baseWebSearchWebView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f14348e;
        java.lang.String str2 = this.f14347d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "onSearchWebQueryReady " + str2 + ' ' + str);
            this.f14349f.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str + ')', av4.w0.f14346a);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "onSendEventToJSBridge fail, event=%s, ex=%s", str2, e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
