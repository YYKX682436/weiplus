package ch0;

/* loaded from: classes8.dex */
public final class e0 {
    public final void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e webView, android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
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
        com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999 = webView.mo120153xd15cf999();
        if (mo120153xd15cf999 != null) {
            mo120153xd15cf999.N(false);
            mo120153xd15cf999.r(false);
            mo120153xd15cf999.y(false);
        }
        android.view.ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        tg0.f2 f2Var = tg0.g2.f500606e;
        if (i17 != 1) {
            webView.m74098xa8f51c3e(true);
            webView.mo120520x57c53c73(false);
            webView.mo120519x347eaca1(false);
            if (layoutParams2 == null) {
                layoutParams2 = new android.widget.FrameLayout.LayoutParams(1, 1);
            }
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            webView.setLayoutParams(layoutParams2);
            return;
        }
        webView.m74098xa8f51c3e(false);
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
