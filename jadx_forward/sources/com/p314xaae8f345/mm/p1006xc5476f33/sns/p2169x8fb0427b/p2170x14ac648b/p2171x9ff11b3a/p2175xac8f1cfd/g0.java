package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class g0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0 f246736d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0 k0Var) {
        this.f246736d = k0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0 k0Var = this.f246736d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGlobalLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$VOnGlobalLayoutListener");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatWebView", "viewTreeObserver OnGlobalLayoutListener is called");
            android.view.View view = k0Var.f246589n;
            if (view != null && view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                android.view.View rootView = view.getRootView();
                if (rootView != null) {
                    view = rootView;
                }
                android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.oxo);
                if ((findViewById instanceof android.view.ViewGroup) && ((android.view.ViewGroup) findViewById).getChildCount() > 0) {
                    android.view.View childAt = ((android.view.ViewGroup) findViewById).getChildAt(0);
                    if (childAt == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$VOnGlobalLayoutListener");
                        return;
                    }
                    android.view.View findViewById2 = childAt.findViewById(com.p314xaae8f345.mm.R.id.chi);
                    if ((findViewById2 instanceof android.view.ViewGroup) && ((android.view.ViewGroup) findViewById2).getChildCount() > 0) {
                        android.view.View childAt2 = ((android.view.ViewGroup) findViewById2).getChildAt(0);
                        if (!ca4.m0.n()) {
                            int i17 = 0;
                            for (int i18 = 0; i18 < ((android.view.ViewGroup) findViewById2).getChildCount(); i18++) {
                                android.view.View childAt3 = ((android.view.ViewGroup) findViewById2).getChildAt(i18);
                                if (childAt3 != null) {
                                    int height = childAt3.getHeight();
                                    i17 += height;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatWebView", "OnGlobalLayoutListener rv: child: " + i18 + " height: " + height);
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatWebView", "OnGlobalLayoutListener rv:  " + findViewById2.getHeight());
                            if (childAt2 != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0.P(k0Var, childAt2.getWidth(), i17);
                            }
                        } else if (childAt2 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0.P(k0Var, childAt2.getWidth(), childAt2.getHeight());
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$VOnGlobalLayoutListener");
    }
}
