package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes2.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191374e;

    public f(android.view.View view, android.view.View view2) {
        this.f191373d = view;
        this.f191374e = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f191373d;
        float height = view.getHeight();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, height);
        ofFloat.setDuration(300L);
        android.view.View view2 = this.f191374e;
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.c(view, view2, height));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.d(view, height, view2);
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.e(dVar, dVar));
        ofFloat.start();
    }
}
