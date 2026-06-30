package ch0;

/* loaded from: classes8.dex */
public final class h0 implements tg0.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final qx4.d0 f41224a;

    /* renamed from: b, reason: collision with root package name */
    public final ch0.b0 f41225b;

    public h0(qx4.d0 real, ch0.b0 searchDataManager) {
        kotlin.jvm.internal.o.g(real, "real");
        kotlin.jvm.internal.o.g(searchDataManager, "searchDataManager");
        this.f41224a = real;
        this.f41225b = searchDataManager;
    }

    public void a(int i17, tg0.c1 result) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        kotlin.jvm.internal.o.g(result, "result");
        tg0.f2 f2Var = tg0.g2.f419073e;
        qx4.d0 jsApi = this.f41224a;
        ch0.b0 b0Var = this.f41225b;
        if (i17 == 1) {
            b0Var.a(result, jsApi);
            return;
        }
        b0Var.getClass();
        kotlin.jvm.internal.o.g(jsApi, "jsApi");
        java.lang.String c17 = tg0.m1.c(result);
        qx4.b l17 = jsApi.l();
        if (l17 == null || (webView = l17.getWebView()) == null) {
            return;
        }
        av4.y0.f14350a.b(webView, "onFlutterResultReady", c17);
    }

    public void b(java.lang.String funcName, org.json.JSONObject params) {
        kotlin.jvm.internal.o.g(funcName, "funcName");
        kotlin.jvm.internal.o.g(params, "params");
        this.f41224a.m(funcName, params);
    }

    public void c(int i17, tg0.c1 result) {
        kotlin.jvm.internal.o.g(result, "result");
        tg0.f2 f2Var = tg0.g2.f419073e;
        qx4.d0 d0Var = this.f41224a;
        ch0.b0 b0Var = this.f41225b;
        if (i17 == 1) {
            b0Var.c(result, d0Var);
        } else {
            b0Var.b(result, d0Var);
        }
    }
}
