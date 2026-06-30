package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes2.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f191342f;

    public c(android.view.View view, android.view.View view2, float f17) {
        this.f191340d = view;
        this.f191341e = view2;
        this.f191342f = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        this.f191340d.setTranslationY(floatValue);
        this.f191341e.setTranslationY(floatValue - this.f191342f);
    }
}
