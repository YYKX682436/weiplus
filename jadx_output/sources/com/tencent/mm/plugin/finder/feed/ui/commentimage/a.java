package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes2.dex */
public final class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f109793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f109794e;

    public a(android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator valueAnimator2) {
        this.f109793d = valueAnimator;
        this.f109794e = valueAnimator2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f109794e.removeAllUpdateListeners();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f109793d.removeAllUpdateListeners();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
