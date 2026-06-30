package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class mc implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc f182814e;

    public mc(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc ncVar, int i17) {
        this.f182814e = ncVar;
        this.f182813d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc ncVar = this.f182814e;
        if (floatValue <= 0.1f) {
            ncVar.f182838g.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            ncVar.f182838g.setAlpha((1.0f - floatValue) * 10.0f);
        }
        ncVar.f182838g.setTranslationY(floatValue * (this.f182813d - r0.getHeight()));
    }
}
