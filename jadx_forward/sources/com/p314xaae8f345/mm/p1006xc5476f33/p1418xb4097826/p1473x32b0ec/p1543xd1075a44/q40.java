package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class q40 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 f201027d;

    public q40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var) {
        this.f201027d = q50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var = this.f201027d;
        android.view.View view = q50Var.f201029J;
        if (view == null) {
            q50Var.getClass();
            return;
        }
        float a17 = i65.a.a(q50Var.f199716e, 8.0f);
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), 0, java.lang.Integer.valueOf(android.graphics.Color.argb(77, 7, 193, 96)), 0);
        ofObject.setDuration(1500L);
        ofObject.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s40(a17, view));
        ofObject.start();
        ofObject.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r40(0, a17, view));
    }
}
