package ch0;

/* loaded from: classes8.dex */
public final class u extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aw4.u f41254b;

    public u(aw4.u uVar) {
        this.f41254b = uVar;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView webview, com.tencent.xweb.x0 request) {
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        return this.f41254b.x(webview, request);
    }
}
