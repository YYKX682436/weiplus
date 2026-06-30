package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes2.dex */
public final class b6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f154118d;

    public b6(android.view.View view) {
        this.f154118d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
        if (num != null) {
            this.f154118d.setPadding(0, 0, 0, num.intValue());
        }
    }
}
