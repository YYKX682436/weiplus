package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752;

/* loaded from: classes3.dex */
public class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f253913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.j f253914e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.j jVar, int i17) {
        this.f253914e = jVar;
        this.f253913d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.j jVar = this.f253914e;
        if (floatValue <= 0.1f) {
            jVar.f253923h.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            jVar.f253923h.setAlpha((1.0f - floatValue) * 10.0f);
        }
        jVar.f253923h.setTranslationY(floatValue * (this.f253913d - r0.getHeight()));
    }
}
