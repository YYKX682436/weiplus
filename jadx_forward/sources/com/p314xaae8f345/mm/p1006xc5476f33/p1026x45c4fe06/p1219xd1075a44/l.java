package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* loaded from: classes7.dex */
public class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f173282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f173283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 f173284f;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895, int i17, int i18) {
        this.f173284f = c12753x672cc895;
        this.f173282d = i17;
        this.f173283e = i18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895 = this.f173284f;
        c12753x672cc895.s(c12753x672cc895.getY(), true);
        c12753x672cc895.f172530r = this.f173282d;
        c12753x672cc895.f172531s = this.f173283e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "startStickyAnimation, mStablePosX: " + c12753x672cc895.f172530r + ", mStablePosY: " + c12753x672cc895.f172531s);
        c12753x672cc895.d(c12753x672cc895.f172530r, c12753x672cc895.f172531s);
    }
}
