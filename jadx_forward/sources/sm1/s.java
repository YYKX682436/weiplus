package sm1;

/* loaded from: classes10.dex */
public final class s implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 f490867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f490868e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7, int i17) {
        this.f490867d = c12827x691a1aa7;
        this.f490868e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = this.f490867d;
        c12827x691a1aa7.m53867x710e23e0(2);
        c12827x691a1aa7.m53828x9a27c48c(false);
        c12827x691a1aa7.m53851x458c6775().setTag(java.lang.Boolean.FALSE);
        sm1.a commentFooterStateListener = c12827x691a1aa7.getCommentFooterStateListener();
        int i17 = this.f490868e;
        if (commentFooterStateListener != null) {
            commentFooterStateListener.e(i17);
        }
        sm1.a commentFooterStateListener2 = c12827x691a1aa7.getCommentFooterStateListener();
        if (commentFooterStateListener2 != null) {
            commentFooterStateListener2.a(c12827x691a1aa7.m53837x1293c36f() + i17);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = this.f490867d;
        if (c12827x691a1aa7.getAutoHideWithKeyboard()) {
            c12827x691a1aa7.setVisibility(0);
        }
        sm1.a commentFooterStateListener = c12827x691a1aa7.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.h(c12827x691a1aa7.m53837x1293c36f() + this.f490868e);
        }
    }
}
