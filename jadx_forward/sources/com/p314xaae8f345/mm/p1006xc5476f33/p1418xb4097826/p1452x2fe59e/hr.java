package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class hr extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f188479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f188480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr f188481f;

    public hr(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar) {
        this.f188479d = h0Var;
        this.f188480e = s0Var;
        this.f188481f = krVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = (android.view.View) this.f188479d.f391656d;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$showAdFeedToast$animatorDismiss$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$showAdFeedToast$animatorDismiss$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f188479d;
        android.view.View view = (android.view.View) h0Var.f391656d;
        if (view == null) {
            view = this.f188480e.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.te9);
        }
        h0Var.f391656d = view;
        java.lang.Object obj = h0Var.f391656d;
        if (obj != null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(obj, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar = this.f188481f;
            ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gr(krVar));
            krVar.Q = ofFloat;
            ofFloat.start();
        }
    }
}
