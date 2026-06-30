package av4;

/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView f14334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView, java.lang.String str) {
        super(0);
        this.f14334d = baseWebSearchWebView;
        this.f14335e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f14334d.evaluateJavascript(this.f14335e, null);
        return jz5.f0.f302826a;
    }
}
