package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class lf implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f f214132d;

    public lf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f2) {
        this.f214132d = c15326x96ed1d6f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f = this.f214132d;
        c15326x96ed1d6f.getMileStoneCancelContainer().setEnabled(true);
        c15326x96ed1d6f.getMileStoneSaveContainer().setEnabled(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f = this.f214132d;
        c15326x96ed1d6f.getMileStoneCardContainer().setScaleY(c15326x96ed1d6f.getWholeScare());
        c15326x96ed1d6f.getMileStoneCardContainer().setAlpha(1.0f);
        c15326x96ed1d6f.getMileStoneCancelContainer().setEnabled(false);
        c15326x96ed1d6f.getMileStoneSaveContainer().setEnabled(false);
        c15326x96ed1d6f.getMileStoneLeftAvatar().setAlpha(0.0f);
        c15326x96ed1d6f.getMileStoneRightAvatar().setAlpha(0.0f);
    }
}
