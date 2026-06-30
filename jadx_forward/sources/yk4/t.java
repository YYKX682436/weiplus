package yk4;

/* loaded from: classes10.dex */
public final class t implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c f544387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f544388e;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c, int i17) {
        this.f544387d = c18713x3be2dc6c;
        this.f544388e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = this.f544387d;
        c18713x3be2dc6c.m72095x710e23e0(2);
        c18713x3be2dc6c.m72056x9a27c48c(false);
        c18713x3be2dc6c.m72079x458c6775().setTag(java.lang.Boolean.FALSE);
        yk4.a commentFooterStateListener = c18713x3be2dc6c.getCommentFooterStateListener();
        int i17 = this.f544388e;
        if (commentFooterStateListener != null) {
            commentFooterStateListener.e(i17);
        }
        yk4.a commentFooterStateListener2 = c18713x3be2dc6c.getCommentFooterStateListener();
        if (commentFooterStateListener2 != null) {
            commentFooterStateListener2.a(c18713x3be2dc6c.m72065x1293c36f() + i17);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = this.f544387d;
        if (c18713x3be2dc6c.getAutoHideWithKeyboard()) {
            c18713x3be2dc6c.setVisibility(0);
        }
        yk4.a commentFooterStateListener = c18713x3be2dc6c.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.h(c18713x3be2dc6c.m72065x1293c36f() + this.f544388e);
        }
    }
}
