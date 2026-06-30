package by4;

/* loaded from: classes7.dex */
public final class e implements com.tencent.xweb.XWebSafeAreaProvider {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f36384a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f36385b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f36386c;

    public e(boolean z17, java.lang.ref.WeakReference webviewUIWeakRef, java.lang.ref.WeakReference viewWVWeakRef) {
        kotlin.jvm.internal.o.g(webviewUIWeakRef, "webviewUIWeakRef");
        kotlin.jvm.internal.o.g(viewWVWeakRef, "viewWVWeakRef");
        this.f36384a = z17;
        this.f36385b = webviewUIWeakRef;
        this.f36386c = viewWVWeakRef;
    }

    @Override // com.tencent.xweb.XWebSafeAreaProvider
    public android.graphics.Rect getSafeAreaRect(android.graphics.Rect rect) {
        int i17;
        int height;
        int height2;
        e3.d a17;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f36385b.get();
        com.tencent.mm.ui.widget.MMWebView mMWebView = (com.tencent.mm.ui.widget.MMWebView) this.f36386c.get();
        if (webViewUI == null || mMWebView == null) {
            return rect == null ? new android.graphics.Rect() : rect;
        }
        int[] s17 = pm0.v.s(mMWebView);
        int statusBarHeight = webViewUI.getStatusBarHeight(0);
        android.view.ViewGroup wrappingFrame = webViewUI.getWrappingFrame();
        com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout = wrappingFrame instanceof com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout ? (com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) wrappingFrame : null;
        int i18 = s17[1];
        int i19 = i18 > statusBarHeight ? 0 : statusBarHeight - i18;
        if (this.f36384a && edgeToEdgeWrapperLayout != null && edgeToEdgeWrapperLayout.getNavigationBarStrategy() == al5.q.f5988d) {
            android.view.View decorView = webViewUI.getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.g3 a18 = n3.b1.a(decorView);
            int i27 = (a18 == null || (a17 = a18.a(7)) == null) ? 0 : a17.f247047d;
            if (i27 != 0 && (height = s17[1] + mMWebView.getHeight()) <= (height2 = edgeToEdgeWrapperLayout.getHeight())) {
                i17 = java.lang.Math.max(0, i27 + (height - height2));
                android.graphics.Rect rect2 = new android.graphics.Rect(0, i19, 0, i17);
                rect2.toString();
                return rect2;
            }
        }
        i17 = 0;
        android.graphics.Rect rect22 = new android.graphics.Rect(0, i19, 0, i17);
        rect22.toString();
        return rect22;
    }
}
