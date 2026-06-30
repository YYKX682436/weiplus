package je4;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final je4.f f380852a = new je4.f();

    public final android.graphics.Rect a(android.app.Activity activity) {
        android.graphics.Rect rect;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNavigationBarHeight", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNavigationHeightApi30", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
            android.view.WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            android.graphics.Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(android.view.WindowInsets.Type.navigationBars());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
            rect = new android.graphics.Rect(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNavigationHeightApi30", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
        } else if (i17 >= 29) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNavigationHeightApi29", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
            android.view.WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets == null) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNavigationHeightApi29", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
                rect = rect2;
            } else {
                rect = new android.graphics.Rect(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getSystemWindowInsetBottom());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNavigationHeightApi29", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
            }
        } else {
            rect = new android.graphics.Rect();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNavigationBarHeight", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
        return rect;
    }
}
