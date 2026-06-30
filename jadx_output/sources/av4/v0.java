package av4;

/* loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView f14343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView, java.lang.String str) {
        super(0);
        this.f14343d = baseWebSearchWebView;
        this.f14344e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f14343d.evaluateJavascript(this.f14344e, null);
        return jz5.f0.f302826a;
    }
}
