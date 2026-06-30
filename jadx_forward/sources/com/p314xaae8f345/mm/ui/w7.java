package com.p314xaae8f345.mm.ui;

/* loaded from: classes3.dex */
public final class w7 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f292743d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f292744e;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        android.view.View view = this.f292743d;
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        yz5.a aVar = this.f292744e;
        if (aVar != null) {
            aVar.mo152xb9724478();
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.ui.yk.c("WeUISlideAnimHelper", "HorizontalAnimationListener onAnimationEnd onAnimationEnd：" + this.f292744e, new java.lang.Object[0]);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }
}
