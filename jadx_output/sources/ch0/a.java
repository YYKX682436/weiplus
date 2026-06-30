package ch0;

/* loaded from: classes8.dex */
public final class a implements tg0.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f41185a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView f41186b;

    /* renamed from: c, reason: collision with root package name */
    public final qx4.d0 f41187c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.e3 f41188d;

    /* renamed from: e, reason: collision with root package name */
    public final ch0.f0 f41189e;

    /* renamed from: f, reason: collision with root package name */
    public final ch0.o0 f41190f;

    public a(int i17, com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView, qx4.d0 webSearchJsApi, com.tencent.mm.plugin.webview.core.e3 controller, ch0.f0 webViewType, ch0.o0 beanType, com.tencent.mm.plugin.webview.core.f3 f3Var, int i18, kotlin.jvm.internal.i iVar) {
        beanType = (i18 & 32) != 0 ? ch0.o0.f41246d : beanType;
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(webSearchJsApi, "webSearchJsApi");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(webViewType, "webViewType");
        kotlin.jvm.internal.o.g(beanType, "beanType");
        this.f41185a = i17;
        this.f41186b = webView;
        this.f41187c = webSearchJsApi;
        this.f41188d = controller;
        this.f41189e = webViewType;
        this.f41190f = beanType;
    }
}
