package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class n8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o8 f168458d;

    public n8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o8 o8Var) {
        this.f168458d = o8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f168458d.e((int) ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
