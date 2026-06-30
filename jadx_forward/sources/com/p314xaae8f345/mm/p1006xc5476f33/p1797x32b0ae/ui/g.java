package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class g implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 f225938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f225939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a f225940f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f225941g;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0, yz5.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a aVar, float f17) {
        this.f225938d = c16237x250976b0;
        this.f225939e = qVar;
        this.f225940f = aVar;
        this.f225941g = f17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f225938d.f225840w = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationEnd the translationY  ");
        float f17 = this.f225941g;
        sb6.append(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollableFrameLayout", sb6.toString());
        yz5.q qVar = this.f225939e;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f225940f, 1, java.lang.Float.valueOf(f17));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f225938d.f225840w = true;
        yz5.q qVar = this.f225939e;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f225940f, 0, java.lang.Float.valueOf(0.0f));
        }
    }
}
