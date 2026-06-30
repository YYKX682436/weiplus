package yk4;

/* loaded from: classes10.dex */
public final class u implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c f544389d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c) {
        this.f544389d = c18713x3be2dc6c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = this.f544389d;
        c18713x3be2dc6c.m72095x710e23e0(0);
        if (c18713x3be2dc6c.getAutoHideWithKeyboard()) {
            c18713x3be2dc6c.setVisibility(8);
        }
        yk4.a commentFooterStateListener = c18713x3be2dc6c.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.g();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        yk4.a commentFooterStateListener = this.f544389d.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.b();
        }
    }
}
