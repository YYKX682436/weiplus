package sm1;

/* loaded from: classes3.dex */
public final class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 f490850d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7) {
        this.f490850d = c12827x691a1aa7;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = this.f490850d;
        android.view.ViewGroup.LayoutParams layoutParams = c12827x691a1aa7.m53847x623e5088().getLayoutParams();
        layoutParams.width = c12827x691a1aa7.getReplyBtnWidth();
        c12827x691a1aa7.m53847x623e5088().setLayoutParams(layoutParams);
        c12827x691a1aa7.m53847x623e5088().setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = this.f490850d;
        android.view.ViewGroup.LayoutParams layoutParams = c12827x691a1aa7.m53847x623e5088().getLayoutParams();
        layoutParams.width = c12827x691a1aa7.getReplyBtnWidth();
        c12827x691a1aa7.m53847x623e5088().setLayoutParams(layoutParams);
        c12827x691a1aa7.m53847x623e5088().setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f490850d.m53847x623e5088().setVisibility(0);
    }
}
