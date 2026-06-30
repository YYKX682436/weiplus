package aw4;

/* loaded from: classes8.dex */
public final class r implements com.tencent.xweb.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final al5.m2 f14902a;

    public r(al5.m2 scrollListener, com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webSearchWebView) {
        kotlin.jvm.internal.o.g(scrollListener, "scrollListener");
        kotlin.jvm.internal.o.g(webSearchWebView, "webSearchWebView");
        this.f14902a = scrollListener;
    }

    @Override // com.tencent.xweb.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        this.f14902a.m(i17, i18, i19, i27, i28, i29, i37, i38, z17);
        return true;
    }

    @Override // com.tencent.xweb.g1
    public void b(int i17) {
    }

    @Override // com.tencent.xweb.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
    }

    @Override // com.tencent.xweb.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
    }
}
