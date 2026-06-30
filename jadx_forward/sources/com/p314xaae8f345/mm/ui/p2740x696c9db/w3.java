package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes2.dex */
public final class w3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f292400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f292401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f292402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f292403h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f292404i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f292405m;

    public w3(android.view.View view, float f17, float f18, float f19, float f27, float f28, float f29) {
        this.f292399d = view;
        this.f292400e = f17;
        this.f292401f = f18;
        this.f292402g = f19;
        this.f292403h = f27;
        this.f292404i = f28;
        this.f292405m = f29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float e17 = e06.p.e(((java.lang.Float) animatedValue).floatValue(), 0.0f, 1.0f);
        float f17 = this.f292401f;
        float f18 = this.f292400e;
        float f19 = f18 + ((f17 - f18) * e17);
        android.view.View view = this.f292399d;
        view.setTranslationX(f19);
        float f27 = this.f292403h;
        float f28 = this.f292402g;
        view.setTranslationY(f28 + ((f27 - f28) * e17));
        float f29 = this.f292405m;
        float f37 = this.f292404i;
        view.setScaleX(((f29 - f37) * e17) + f37);
        view.setScaleY(f37 + ((f29 - f37) * e17));
    }
}
