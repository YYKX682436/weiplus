package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes3.dex */
public class h4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 f241094d;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 activityC17318xa8131d22) {
        this.f241094d = activityC17318xa8131d22;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 activityC17318xa8131d22 = this.f241094d;
        activityC17318xa8131d22.finish();
        activityC17318xa8131d22.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 activityC17318xa8131d22 = this.f241094d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = activityC17318xa8131d22.f241011q;
        if (c21524xecd57b9a != null) {
            if (c21524xecd57b9a.mo45732x7520af94() > 1.0f) {
                activityC17318xa8131d22.f241011q.i();
            }
            activityC17318xa8131d22.f241019y = activityC17318xa8131d22.f241011q.getTranslationX();
            activityC17318xa8131d22.f241020z = activityC17318xa8131d22.f241011q.getTranslationY();
            activityC17318xa8131d22.f241017w = activityC17318xa8131d22.f241011q.getScaleX();
            activityC17318xa8131d22.f241018x = activityC17318xa8131d22.f241011q.getScaleY();
        }
    }
}
