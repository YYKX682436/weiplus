package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class mc implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.nc f101281e;

    public mc(com.tencent.mm.plugin.fav.ui.nc ncVar, int i17) {
        this.f101281e = ncVar;
        this.f101280d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.fav.ui.nc ncVar = this.f101281e;
        if (floatValue <= 0.1f) {
            ncVar.f101305g.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            ncVar.f101305g.setAlpha((1.0f - floatValue) * 10.0f);
        }
        ncVar.f101305g.setTranslationY(floatValue * (this.f101280d - r0.getHeight()));
    }
}
