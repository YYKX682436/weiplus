package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class ik implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f213844d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f213845e;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        android.view.View view = this.f213844d;
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        yz5.a aVar = this.f213845e;
        if (aVar != null) {
            aVar.mo152xb9724478();
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideAnimHelper", "HorizontalAnimationListener onAnimationEnd onAnimationEnd：" + this.f213845e);
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
