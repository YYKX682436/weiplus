package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* loaded from: classes7.dex */
public class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f173275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f173276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f173277f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f173278g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 f173279h;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895, int i17, int i18, int i19, int i27) {
        this.f173279h = c12753x672cc895;
        this.f173275d = i17;
        this.f173276e = i18;
        this.f173277f = i19;
        this.f173278g = i27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i17 = this.f173275d;
        int i18 = i17 + ((int) (((this.f173276e * 1.0f) - i17) * floatValue));
        int i19 = this.f173277f;
        int i27 = i19 + ((int) (((this.f173278g * 1.0f) - i19) * floatValue));
        float f17 = i18;
        float f18 = i27;
        int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.K;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895 = this.f173279h;
        float x17 = c12753x672cc895.getX();
        float x18 = c12753x672cc895.getX();
        if (x17 == f17 && x18 == f18) {
            return;
        }
        c12753x672cc895.setX(f17);
        c12753x672cc895.setY(f18);
    }
}
