package sm1;

/* loaded from: classes10.dex */
public final class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 f490864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f490865e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7, boolean z17) {
        this.f490864d = c12827x691a1aa7;
        this.f490865e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = this.f490864d;
        c12827x691a1aa7.m53852x14cd10dd().setVisibility(4);
        c12827x691a1aa7.m53828x9a27c48c(false);
        if (this.f490865e) {
            c12827x691a1aa7.m53867x710e23e0(0);
        }
        if (c12827x691a1aa7.getAutoHideWithKeyboard()) {
            c12827x691a1aa7.setVisibility(8);
        }
        sm1.a commentFooterStateListener = c12827x691a1aa7.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.c();
        }
        sm1.a commentFooterStateListener2 = c12827x691a1aa7.getCommentFooterStateListener();
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
        sm1.a commentFooterStateListener = this.f490864d.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.b();
        }
    }
}
