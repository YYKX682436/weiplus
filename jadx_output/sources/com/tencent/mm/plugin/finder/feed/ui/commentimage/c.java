package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes2.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f109809f;

    public c(android.view.View view, android.view.View view2, float f17) {
        this.f109807d = view;
        this.f109808e = view2;
        this.f109809f = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        this.f109807d.setTranslationY(floatValue);
        this.f109808e.setTranslationY(floatValue - this.f109809f);
    }
}
