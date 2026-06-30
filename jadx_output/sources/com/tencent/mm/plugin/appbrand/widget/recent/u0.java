package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class u0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f92065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer f92066e;

    public u0(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f92066e = appBrandTaskContainer;
        this.f92065d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer = this.f92066e;
        appBrandTaskContainer.f91885e.setScaleX(1.0f);
        appBrandTaskContainer.f91885e.setScaleY(1.0f);
        android.view.View view = appBrandTaskContainer.f91885e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskContainer$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskContainer$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (appBrandTaskContainer.getTaskViewListener() != null) {
            ((com.tencent.mm.plugin.appbrand.page.t7) appBrandTaskContainer.getTaskViewListener()).f87116c.R1.dismiss();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f92065d.setListener(null);
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer = this.f92066e;
        if (appBrandTaskContainer.getTaskViewListener() != null) {
            ((com.tencent.mm.plugin.appbrand.page.t7) appBrandTaskContainer.getTaskViewListener()).f87116c.R1.dismiss();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
