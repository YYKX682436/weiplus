package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class hr extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f106946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f106947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f106948f;

    public hr(kotlin.jvm.internal.h0 h0Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.feed.kr krVar) {
        this.f106946d = h0Var;
        this.f106947e = s0Var;
        this.f106948f = krVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = (android.view.View) this.f106946d.f310123d;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$showAdFeedToast$animatorDismiss$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$showAdFeedToast$animatorDismiss$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.h0 h0Var = this.f106946d;
        android.view.View view = (android.view.View) h0Var.f310123d;
        if (view == null) {
            view = this.f106947e.itemView.findViewById(com.tencent.mm.R.id.te9);
        }
        h0Var.f310123d = view;
        java.lang.Object obj = h0Var.f310123d;
        if (obj != null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(obj, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
            com.tencent.mm.plugin.finder.feed.kr krVar = this.f106948f;
            ofFloat.addListener(new com.tencent.mm.plugin.finder.feed.gr(krVar));
            krVar.Q = ofFloat;
            ofFloat.start();
        }
    }
}
