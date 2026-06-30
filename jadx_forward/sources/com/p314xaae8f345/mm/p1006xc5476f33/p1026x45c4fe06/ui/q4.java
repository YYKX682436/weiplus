package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class q4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f171482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.r4 f171483e;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.r4 r4Var, android.view.ViewParent viewParent) {
        this.f171483e = r4Var;
        this.f171482d = viewParent;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f171483e.f171511e.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p4(this));
    }
}
