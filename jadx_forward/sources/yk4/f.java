package yk4;

/* loaded from: classes3.dex */
public final class f implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c f544371d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c) {
        this.f544371d = c18713x3be2dc6c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f544371d.m72075x623e5088().setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f544371d.m72075x623e5088().setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f544371d.m72075x623e5088().setVisibility(0);
    }
}
