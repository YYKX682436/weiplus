package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 f225968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f225969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a f225970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f225971g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f225972h;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39, yz5.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a aVar, float f17, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f225968d = c16238x79483a39;
        this.f225969e = qVar;
        this.f225970f = aVar;
        this.f225971g = f17;
        this.f225972h = viewPropertyAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f225968d.m65901xb461b17a(false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationEnd the translationX  ");
        float f17 = this.f225971g;
        sb6.append(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollableFrameLayout", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a.f225911d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a aVar2 = this.f225970f;
        if (aVar == aVar2) {
            this.f225972h.alpha(0.0f);
        }
        yz5.q qVar = this.f225969e;
        if (qVar != null) {
            qVar.mo147xb9724478(aVar2, 1, java.lang.Float.valueOf(f17));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f225968d.m65901xb461b17a(true);
        yz5.q qVar = this.f225969e;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f225970f, 0, java.lang.Float.valueOf(0.0f));
        }
    }
}
