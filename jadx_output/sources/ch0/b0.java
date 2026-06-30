package ch0;

/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final ch0.m f41194a = new ch0.m();

    /* renamed from: b, reason: collision with root package name */
    public final ch0.l f41195b = new ch0.l();

    public final void a(tg0.c1 result, qx4.d0 jsApi) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(jsApi, "jsApi");
        java.lang.String str = result.f419036h;
        if (e(str)) {
            return;
        }
        ch0.m mVar = this.f41194a;
        mVar.getClass();
        if (!r26.n0.N(str)) {
            mVar.f41241c = str;
        }
        java.lang.String c17 = tg0.m1.c(result);
        qx4.b l17 = jsApi.l();
        if (l17 == null || (webView = l17.getWebView()) == null) {
            return;
        }
        av4.y0.f14350a.b(webView, "onFlutterResultReady", c17);
    }

    public final void b(tg0.c1 result, qx4.d0 jsApi) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(jsApi, "jsApi");
        jsApi.f367397f = true;
        tg0.k1 Ri = ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).Ri();
        kotlin.jvm.internal.o.e(Ri, "null cannot be cast to non-null type com.tencent.mm.feature.webview.platformwebsearch.PlatformWSFScene");
        tg0.f2 f2Var = tg0.g2.f419073e;
        java.lang.String b17 = tg0.m1.b(((ch0.z) Ri).b(2, result));
        qx4.b l17 = jsApi.l();
        if (l17 == null || (webView = l17.getWebView()) == null) {
            return;
        }
        av4.y0.f14350a.b(webView, "onUiInit", b17);
    }

    public final void c(tg0.c1 result, qx4.d0 jsApi) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(jsApi, "jsApi");
        if (e(result.f419036h)) {
            return;
        }
        ch0.m mVar = this.f41194a;
        mVar.getClass();
        jsApi.f367397f = true;
        java.lang.String str = result.f419036h;
        if (!r26.n0.N(str)) {
            mVar.f41241c = str;
        }
        tg0.k1 Ri = ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).Ri();
        kotlin.jvm.internal.o.e(Ri, "null cannot be cast to non-null type com.tencent.mm.feature.webview.platformwebsearch.PlatformWSFScene");
        tg0.f2 f2Var = tg0.g2.f419073e;
        java.lang.String b17 = tg0.m1.b(((ch0.z) Ri).b(1, result));
        qx4.b l17 = jsApi.l();
        if (l17 == null || (webView = l17.getWebView()) == null) {
            return;
        }
        java.lang.String content = "callFlutterResultReady: consume time: " + (java.lang.System.currentTimeMillis() - result.f419045q);
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        av4.y0.f14350a.b(webView, "onUiInit", b17);
    }

    public final void d() {
        synchronized (this.f41194a) {
            ch0.m mVar = this.f41194a;
            mVar.getClass();
            mVar.f41239a = "";
            this.f41194a.f41240b = null;
        }
        ch0.m mVar2 = this.f41194a;
        mVar2.getClass();
        mVar2.f41241c = "";
    }

    public final boolean e(java.lang.String requestId) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        if (r26.n0.N(requestId)) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(this.f41194a.f41241c, requestId)) {
            return false;
        }
        java.lang.String content = "h5PageCreateDataHasUsed: " + requestId + ", has used";
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.w("MicroMsg.FTSPlatformWebView", content);
        return true;
    }

    public final void f(java.lang.String requestId) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        synchronized (this.f41194a) {
            java.lang.String content = "setNewRequestId: ".concat(requestId);
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
            ch0.m mVar = this.f41194a;
            mVar.getClass();
            mVar.f41239a = requestId;
        }
    }
}
