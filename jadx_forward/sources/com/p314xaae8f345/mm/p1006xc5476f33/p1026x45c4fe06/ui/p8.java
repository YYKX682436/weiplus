package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class p8 extends al5.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f171454a;

    public p8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8 u8Var, java.lang.Runnable runnable) {
        this.f171454a = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        java.lang.Runnable runnable = this.f171454a;
        if (runnable != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        }
    }
}
