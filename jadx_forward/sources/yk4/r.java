package yk4;

/* loaded from: classes10.dex */
public final class r implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c f544384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f544385e;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c, boolean z17) {
        this.f544384d = c18713x3be2dc6c;
        this.f544385e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = this.f544384d;
        c18713x3be2dc6c.m72080x14cd10dd().setVisibility(4);
        c18713x3be2dc6c.m72056x9a27c48c(false);
        if (this.f544385e) {
            c18713x3be2dc6c.m72095x710e23e0(0);
        }
        if (c18713x3be2dc6c.getAutoHideWithKeyboard()) {
            c18713x3be2dc6c.setVisibility(8);
        }
        yk4.a commentFooterStateListener = c18713x3be2dc6c.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.c();
        }
        yk4.a commentFooterStateListener2 = c18713x3be2dc6c.getCommentFooterStateListener();
        if (commentFooterStateListener2 != null) {
            commentFooterStateListener2.g();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        yk4.a commentFooterStateListener = this.f544384d.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.b();
        }
    }
}
