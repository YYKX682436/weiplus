package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class q8 extends al5.q0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f171488a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f171489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f171490c;

    public q8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8 u8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.Runnable runnable) {
        this.f171489b = c11510xdd90c2f2;
        this.f171490c = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        java.lang.Runnable runnable = this.f171490c;
        if (runnable != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        }
    }

    @Override // al5.q0, android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171489b;
        if (!(c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) || this.f171488a) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2).H2;
        long duration = animation.getDuration();
        hl1.h hVar = l0Var.f172732e;
        hVar.d(hVar.h(), 0, duration);
        this.f171488a = true;
    }
}
