package ch0;

/* loaded from: classes8.dex */
public final class e0 {
    public final void a(int i17, com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView, android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(webView, "webView");
        android.view.ViewParent parent = webView.getParent();
        if (parent != null) {
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(webView);
            }
        }
        webView.setAlpha(0.0f);
        webView.setBackgroundColor(0);
        webView.setVisibility(0);
        webView.setLayerType(2, null);
        com.tencent.xweb.z0 settings = webView.getSettings();
        if (settings != null) {
            settings.N(false);
            settings.r(false);
            settings.y(false);
        }
        android.view.ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        tg0.f2 f2Var = tg0.g2.f419073e;
        if (i17 != 1) {
            webView.setFlutterWidget(true);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            if (layoutParams2 == null) {
                layoutParams2 = new android.widget.FrameLayout.LayoutParams(1, 1);
            }
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            webView.setLayoutParams(layoutParams2);
            return;
        }
        webView.setFlutterWidget(false);
        if (layoutParams2 == null) {
            layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        webView.setLayoutParams(layoutParams2);
        if (viewGroup != null) {
            viewGroup.addView(webView, 0);
        }
    }
}
