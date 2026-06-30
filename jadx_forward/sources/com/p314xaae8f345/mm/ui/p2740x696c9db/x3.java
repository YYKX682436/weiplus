package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes2.dex */
public final class x3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f292433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f292434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f292435g;

    public x3(android.view.View view, float f17, float f18, float f19) {
        this.f292432d = view;
        this.f292433e = f17;
        this.f292434f = f18;
        this.f292435g = f19;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        float f17 = this.f292433e;
        android.view.View view = this.f292432d;
        view.setTranslationX(f17);
        view.setTranslationY(this.f292434f);
        float f18 = this.f292435g;
        view.setScaleX(f18);
        view.setScaleY(f18);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        float f17 = this.f292433e;
        android.view.View view = this.f292432d;
        view.setTranslationX(f17);
        view.setTranslationY(this.f292434f);
        float f18 = this.f292435g;
        view.setScaleX(f18);
        view.setScaleY(f18);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = this.f292432d;
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight() * 0.5f);
    }
}
