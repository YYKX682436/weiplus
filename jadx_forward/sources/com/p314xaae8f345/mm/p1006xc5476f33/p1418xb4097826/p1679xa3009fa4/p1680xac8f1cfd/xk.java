package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class xk extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f218000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f218001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f218002f;

    public xk(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar, android.widget.FrameLayout frameLayout) {
        this.f218000d = view;
        this.f218001e = blVar;
        this.f218002f = frameLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator startDelay;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = this.f218000d;
        android.view.ViewPropertyAnimator updateListener = view.animate().alpha(0.0f).setUpdateListener(null);
        android.widget.FrameLayout frameLayout = this.f218002f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f218001e;
        updateListener.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.wk(frameLayout, view, blVar)).setDuration(250L).setStartDelay(3000L).start();
        android.view.View mo144222x4ff8c0f0 = blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nzm);
        if (mo144222x4ff8c0f0 == null || (animate = mo144222x4ff8c0f0.animate()) == null || (translationX = animate.translationX(0.0f)) == null || (alpha = translationX.alpha(0.5f)) == null || (duration = alpha.setDuration(250L)) == null || (startDelay = duration.setStartDelay(3000L)) == null) {
            return;
        }
        startDelay.start();
    }
}
