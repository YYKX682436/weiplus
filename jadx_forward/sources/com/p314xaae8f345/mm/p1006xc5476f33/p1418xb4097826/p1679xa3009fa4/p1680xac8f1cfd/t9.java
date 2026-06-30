package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class t9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f217533d;

    public t9(android.view.ViewGroup viewGroup) {
        this.f217533d = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.ViewGroup viewGroup = this.f217533d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((java.lang.Integer) animatedValue).intValue();
        viewGroup.setLayoutParams(layoutParams);
    }
}
