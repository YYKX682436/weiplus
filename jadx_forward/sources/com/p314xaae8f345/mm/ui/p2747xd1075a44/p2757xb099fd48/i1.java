package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes3.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k1 f293356d;

    public i1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l1 l1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k1 k1Var) {
        this.f293356d = k1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f293356d.f293438r, "alpha", 0.2f, 0.0f);
        ofFloat.addListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h1(this));
        ofFloat.setDuration(300L);
        ofFloat.start();
    }
}
