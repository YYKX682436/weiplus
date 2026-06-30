package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public int f227468d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227469e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227469e = c16344xea85a40c;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.util.Objects.toString(valueAnimator.getAnimatedValue());
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        int i17 = intValue - this.f227468d;
        this.f227468d = intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227469e;
        float f17 = (r2 - intValue) / (c16344xea85a40c.f227324x1 * 1.0f);
        int i18 = c16344xea85a40c.K1;
        c16344xea85a40c.offsetTopAndBottom(i17);
        if (i17 > 0) {
            c16344xea85a40c.R.offsetTopAndBottom((int) (i17 * 0.123f));
        } else {
            c16344xea85a40c.f227325y.setAlpha(f17);
        }
    }
}
