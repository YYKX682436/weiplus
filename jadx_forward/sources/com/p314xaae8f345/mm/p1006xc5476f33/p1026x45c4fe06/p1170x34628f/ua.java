package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class ua implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wa f168677d;

    public ua(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wa waVar) {
        this.f168677d = waVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f168677d.mo14662xc2a54588().setScrollY(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
