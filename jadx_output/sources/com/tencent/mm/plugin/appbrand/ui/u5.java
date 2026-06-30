package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class u5 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f90254b = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.ui.u5.class, "isBlockSplashHideForDebug", "isBlockSplashHideForDebug()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.u5 f90253a = new com.tencent.mm.plugin.appbrand.ui.u5();

    /* renamed from: c, reason: collision with root package name */
    public static final nf.r f90255c = new nf.r(java.lang.Boolean.FALSE);

    public static final int a(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "<this>");
        return a06.d.b(context.getResources().getDisplayMetrics().density * i17);
    }

    public static final void b(com.tencent.mm.plugin.appbrand.ui.vc vcVar) {
        android.view.View view;
        if (vcVar == null || (view = vcVar.getView()) == null) {
            return;
        }
        android.view.animation.Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        view.animate().cancel();
        c(view);
    }

    public static final void c(android.view.View view) {
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandLoadingSplashUtils", "safeDetachFromWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandLoadingSplashUtils", "safeDetachFromWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static final void d(java.util.List order, android.view.View splashView) {
        kotlin.jvm.internal.o.g(order, "order");
        kotlin.jvm.internal.o.g(splashView, "splashView");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
        int i17 = 0;
        if (accessibilityManager != null ? accessibilityManager.isEnabled() : false) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = order.iterator();
            while (it.hasNext()) {
                android.view.View findViewById = splashView.findViewById(((java.lang.Number) it.next()).intValue());
                if (findViewById != null) {
                    arrayList.add(findViewById);
                }
            }
            for (java.lang.Object obj : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.view.View view = (android.view.View) obj;
                view.setAccessibilityTraversalAfter(-1);
                view.setAccessibilityTraversalBefore(-1);
                if (i17 > 0) {
                    view.setAccessibilityDelegate(new com.tencent.mm.plugin.appbrand.ui.t5((android.view.View) arrayList.get(i17 - 1)));
                }
                i17 = i18;
            }
        }
    }
}
