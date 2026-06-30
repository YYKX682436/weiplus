package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class f4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd f168140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 f168141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 f168142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f168143g;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2) {
        this.f168143g = i3Var;
        this.f168140d = wdVar;
        this.f168141e = w2Var;
        this.f168142f = w2Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f168143g.m(this.f168140d, this.f168141e, this.f168142f, (int) (valueAnimator.getAnimatedFraction() * 100.0f));
    }
}
