package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes2.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f109845d;

    public i(android.view.ViewGroup viewGroup) {
        this.f109845d = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.ViewGroup viewGroup = this.f109845d;
        if (viewGroup == null) {
            return;
        }
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        viewGroup.setAlpha(((java.lang.Float) animatedValue).floatValue());
    }
}
