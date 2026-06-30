package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes2.dex */
public final class b6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f72585d;

    public b6(android.view.View view) {
        this.f72585d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
        if (num != null) {
            this.f72585d.setPadding(0, 0, 0, num.intValue());
        }
    }
}
