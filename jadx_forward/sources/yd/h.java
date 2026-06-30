package yd;

/* loaded from: classes7.dex */
public class h implements yd.z {

    /* renamed from: d, reason: collision with root package name */
    public android.webkit.WebView f542483d;

    @Override // yd.z
    public void N7(yd.y yVar) {
        this.f542483d.setWebViewClient(new yd.g(this, yVar));
    }

    @Override // yd.z
    public yd.w O4() {
        return new yd.f(this, this.f542483d.getSettings());
    }

    @Override // yd.z
    public void Pf(android.content.Context context) {
        this.f542483d = new android.webkit.WebView(context);
    }

    @Override // yd.z
    /* renamed from: addJavascriptInterface */
    public void mo142287x74041feb(java.lang.Object obj, java.lang.String str) {
        this.f542483d.addJavascriptInterface(obj, str);
    }

    @Override // yd.z
    /* renamed from: destroy */
    public void mo142288x5cd39ffa() {
        this.f542483d.destroy();
    }

    @Override // yd.z
    /* renamed from: getView */
    public android.view.View mo142289xfb86a31b() {
        return this.f542483d;
    }

    @Override // yd.z
    public void jf(java.lang.String str) {
        this.f542483d.evaluateJavascript(str, null);
    }

    @Override // yd.z
    /* renamed from: loadUrl */
    public void mo142290x141096a9(java.lang.String str) {
        this.f542483d.loadUrl(str);
    }
}
