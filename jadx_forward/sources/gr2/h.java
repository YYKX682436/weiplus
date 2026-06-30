package gr2;

/* loaded from: classes2.dex */
public final class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14570x6b1592c4 f356304d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14570x6b1592c4 c14570x6b1592c4) {
        this.f356304d = c14570x6b1592c4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14570x6b1592c4 c14570x6b1592c4 = this.f356304d;
        if (c14570x6b1592c4.f203660r) {
            c14570x6b1592c4.a();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
