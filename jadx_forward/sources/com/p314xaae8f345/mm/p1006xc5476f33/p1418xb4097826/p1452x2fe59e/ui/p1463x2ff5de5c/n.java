package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191403e;

    public n(android.view.View view, android.view.View view2) {
        this.f191402d = view;
        this.f191403e = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f191402d;
        float height = view.getHeight();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(height, 0.0f);
        ofFloat.setDuration(300L);
        android.view.View view2 = this.f191403e;
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.k(view, view2, height));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.l(view, view2, height);
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.m(lVar, lVar, view));
        ofFloat.start();
    }
}
