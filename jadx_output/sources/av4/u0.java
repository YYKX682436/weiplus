package av4;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView f14340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(java.lang.String str, com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView, java.lang.String str2) {
        super(0);
        this.f14339d = str;
        this.f14340e = baseWebSearchWebView;
        this.f14341f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyJsEvent, funcName: ");
        java.lang.String str = this.f14339d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", sb6.toString());
        this.f14340e.evaluateJavascript(this.f14341f, null);
        if (kotlin.jvm.internal.o.b(str, "onFlutterResultReady") || kotlin.jvm.internal.o.b(str, "onUiInit")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "end notifyJsEvent: %s", str);
        }
        return jz5.f0.f302826a;
    }
}
