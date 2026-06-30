package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes2.dex */
public final class w7 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f233051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e f233052e;

    public w7(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e c16677x5944b67e) {
        this.f233051d = view;
        this.f233052e = c16677x5944b67e;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = this.f233051d;
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.gsl) : null;
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$showLongTryListen$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$showLongTryListen$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e c16677x5944b67e = this.f233052e;
        c16677x5944b67e.getClass();
        if (!(1.0f == findViewById.getAlpha())) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150L);
            alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.r7(findViewById, 1.0f));
            alphaAnimation.setFillAfter(true);
            findViewById.startAnimation(alphaAnimation);
        }
        c16677x5944b67e.f232539n = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
