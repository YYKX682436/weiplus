package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class a0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227351d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227351d = c16344xea85a40c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227351d;
        c16344xea85a40c.R.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16350x7d7c911b c16350x7d7c911b = c16344xea85a40c.f227322x;
        if (c16350x7d7c911b != null) {
            c16350x7d7c911b.E = false;
        }
        c16344xea85a40c.f227310c2 = true;
        c16344xea85a40c.q();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
