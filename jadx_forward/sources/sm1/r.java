package sm1;

/* loaded from: classes10.dex */
public final class r implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 f490866d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7) {
        this.f490866d = c12827x691a1aa7;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = this.f490866d;
        c12827x691a1aa7.m53852x14cd10dd().setAlpha(1.0f);
        c12827x691a1aa7.m53852x14cd10dd().setVisibility(4);
        sm1.a commentFooterStateListener = c12827x691a1aa7.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.c();
        }
        sm1.a commentFooterStateListener2 = c12827x691a1aa7.getCommentFooterStateListener();
        if (commentFooterStateListener2 != null) {
            commentFooterStateListener2.a(c12827x691a1aa7.m53837x1293c36f() + ((int) c12827x691a1aa7.f174019v));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = this.f490866d;
        sm1.a commentFooterStateListener = c12827x691a1aa7.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.h(c12827x691a1aa7.m53837x1293c36f() + ((int) c12827x691a1aa7.f174019v));
        }
    }
}
