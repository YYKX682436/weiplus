package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class y extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f230978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z f230979e;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z zVar, boolean z17) {
        this.f230979e = zVar;
        this.f230978d = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MMSightRecordButton", "call onProgressFinish", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z zVar = this.f230979e;
        zVar.f230985b.f230732i = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.x xVar = zVar.f230984a;
        if (xVar != null) {
            xVar.a(this.f230978d);
        }
    }
}
