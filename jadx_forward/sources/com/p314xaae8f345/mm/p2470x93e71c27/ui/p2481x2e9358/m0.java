package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n0 f272013d;

    public m0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n0 n0Var) {
        this.f272013d = n0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n0 n0Var = this.f272013d;
        n0Var.f272027d.f271517f4.setVisibility(8);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = n0Var.f272027d;
        c19666xfd6e2f33.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "playAutoBubbleEnterAnimate ");
        float dimensionPixelSize = c19666xfd6e2f33.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561197c2);
        c19666xfd6e2f33.f271489a4.setScaleX(1.0f);
        c19666xfd6e2f33.f271489a4.setScaleY(1.0f);
        c19666xfd6e2f33.f271489a4.setTranslationY(dimensionPixelSize);
        c19666xfd6e2f33.f271511e4.setTranslationY(dimensionPixelSize);
        float dimensionPixelSize2 = c19666xfd6e2f33.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c19666xfd6e2f33.f271489a4, "translationY", dimensionPixelSize2, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c19666xfd6e2f33.f271489a4, "alpha", 0.0f, 1.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c19666xfd6e2f33.f271511e4, "translationY", dimensionPixelSize2, 0.0f);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(c19666xfd6e2f33.f271511e4, "alpha", 0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.start();
    }
}
