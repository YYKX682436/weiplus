package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class im0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg2.z1 f194523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 f194524e;

    public im0(fg2.z1 z1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var) {
        this.f194523d = z1Var;
        this.f194524e = km0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fg2.z1 z1Var = this.f194523d;
        int width = z1Var.f343956e.getWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var = this.f194524e;
        boolean z17 = width > ((java.lang.Number) ((jz5.n) km0Var.f194821y).mo141623x754a37bb()).intValue();
        android.widget.HorizontalScrollView horizontalScrollView = z1Var.f343957f;
        android.view.ViewGroup.LayoutParams layoutParams = horizontalScrollView.getLayoutParams();
        jz5.g gVar = km0Var.f194821y;
        layoutParams.width = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        horizontalScrollView.setLayoutParams(layoutParams);
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams2 = horizontalScrollView.getLayoutParams();
            layoutParams2.width = -2;
            horizontalScrollView.setLayoutParams(layoutParams2);
            return;
        }
        km0Var.f194819w.mo50303x856b99f0(1);
        android.animation.ObjectAnimator objectAnimator = km0Var.f194820x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        int[] iArr = new int[2];
        iArr[0] = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a60 = z1Var.f343956e;
        int width2 = c14296xe95b9a60.getWidth() - ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        iArr[1] = width2 >= 0 ? width2 : 0;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(c14296xe95b9a60, "scrollX", iArr);
        km0Var.f194820x = ofInt;
        if (ofInt != null) {
            ofInt.setDuration(1000L);
        }
        android.animation.ObjectAnimator objectAnimator2 = km0Var.f194820x;
        if (objectAnimator2 != null) {
            objectAnimator2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm0(km0Var));
        }
        android.animation.ObjectAnimator objectAnimator3 = km0Var.f194820x;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
    }
}
