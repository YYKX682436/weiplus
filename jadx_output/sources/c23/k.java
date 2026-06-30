package c23;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f38040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c23.m f38041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity appCompatActivity, c23.m mVar) {
        super(0);
        this.f38040d = appCompatActivity;
        this.f38041e = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = new com.tencent.mm.plugin.websearch.webview.WebSearchWebView(this.f38040d);
        webSearchWebView.J0(new d23.i(), new c23.b(this.f38041e));
        return webSearchWebView;
    }
}
