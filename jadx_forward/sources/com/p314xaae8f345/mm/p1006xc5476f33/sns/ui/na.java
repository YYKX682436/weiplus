package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class na {

    /* renamed from: a, reason: collision with root package name */
    public final android.animation.AnimatorSet f251518a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.la f251519b;

    public na(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fa faVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fa(this);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f251518a = animatorSet;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.la laVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.la(weakReference);
        this.f251519b = laVar;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        long j17 = 1000;
        ofFloat.setDuration(j17);
        ofFloat.setStartDelay(3000L);
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ga(this, laVar, animatorSet));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setStartDelay(3500);
        ofFloat2.setDuration(j17);
        ofFloat2.addListener(faVar);
        ofFloat2.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ha(this, laVar, animatorSet));
        android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setDuration(j17);
        ofFloat3.setStartDelay(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        ofFloat3.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ia(this, laVar, animatorSet));
        android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat4.setDuration(j17);
        ofFloat4.setStartDelay(10500);
        ofFloat4.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ja(this, laVar, animatorSet));
        ofFloat4.addListener(faVar);
        animatorSet.play(ofFloat);
        animatorSet.play(ofFloat2);
        animatorSet.play(ofFloat3);
        animatorSet.play(ofFloat4);
        animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ka(this));
    }
}
