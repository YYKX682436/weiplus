package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class b4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 f167958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f167959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f167960f;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, java.lang.Runnable runnable) {
        this.f167960f = i3Var;
        this.f167958d = w2Var;
        this.f167959e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f167958d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3.f168233J;
        w2Var.setTag(com.p314xaae8f345.mm.R.id.f564708yo, null);
        java.lang.Runnable runnable = this.f167959e;
        if (runnable != null) {
            this.f167960f.removeCallbacks(runnable);
            if (!this.f167960f.f168234d) {
                this.f167959e.run();
            }
        }
        this.f167958d.m52232xf9241792(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3.f168233J;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f167958d;
        w2Var.setTag(com.p314xaae8f345.mm.R.id.f564708yo, null);
        if (this.f167959e != null) {
            this.f167960f.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a4(this));
        }
        w2Var.m52232xf9241792(false);
    }
}
