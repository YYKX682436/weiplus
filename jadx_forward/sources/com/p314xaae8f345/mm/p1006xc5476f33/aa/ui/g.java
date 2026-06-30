package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class g implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 f154180d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 activityC11339x6e0beaf2) {
        this.f154180d = activityC11339x6e0beaf2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 activityC11339x6e0beaf2 = this.f154180d;
        activityC11339x6e0beaf2.finish();
        activityC11339x6e0beaf2.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559435eq, com.p314xaae8f345.mm.R.C30854x2dc211.f559436er);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
