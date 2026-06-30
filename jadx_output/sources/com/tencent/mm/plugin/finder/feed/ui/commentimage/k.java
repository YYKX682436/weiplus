package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes2.dex */
public final class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f109854f;

    public k(android.view.View view, android.view.View view2, float f17) {
        this.f109852d = view;
        this.f109853e = view2;
        this.f109854f = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        this.f109852d.setTranslationY(floatValue);
        this.f109853e.setTranslationY(floatValue - this.f109854f);
    }
}
