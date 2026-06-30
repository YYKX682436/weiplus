package aw4;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw4.l f14854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(aw4.l lVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f14854d = lVar;
        this.f14855e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aw4.d(this.f14854d, this.f14855e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        aw4.d dVar = (aw4.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.g gVar = aw4.l.f14895d;
        aw4.q i17 = this.f14854d.i();
        if (i17 != null && (webView = i17.getWebView()) != null) {
            java.lang.String params = this.f14855e;
            kotlin.jvm.internal.o.g(params, "params");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onFinderItemDetailReady", params);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onFinderItemDetailReady", "onFinderItemDetailReady", params}, 3));
                kotlin.jvm.internal.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(webView, format));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f302826a;
    }
}
