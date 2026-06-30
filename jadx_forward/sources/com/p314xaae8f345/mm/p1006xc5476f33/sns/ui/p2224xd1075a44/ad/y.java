package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

/* loaded from: classes3.dex */
public final class y implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0 f252605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f252606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f252607f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f252608g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f252609h;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0 v0Var, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4) {
        this.f252605d = v0Var;
        this.f252606e = list;
        this.f252607f = list2;
        this.f252608g = list3;
        this.f252609h = list4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        float f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$11");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f18 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f18 != null ? f18.floatValue() : 0.0f;
        int i17 = 0;
        while (i17 < 3) {
            if (i17 == 0) {
                f17 = floatValue - 0.4f;
            } else {
                f17 = i17 == 1 ? floatValue - 0.2f : floatValue;
                if (f17 < 0.0f) {
                    f17 = 0.0f;
                }
            }
            if (f17 > 1.5f) {
                f17 = 1.5f;
            }
            float interpolation = s74.q4.f486046a.e().getInterpolation(f17 / 1.5f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0 v0Var = this.f252605d;
            if (v0Var.F().size() > i17) {
                java.util.List list = this.f252606e;
                if (list.size() > i17) {
                    java.util.List list2 = this.f252607f;
                    if (list2.size() > i17) {
                        java.util.List list3 = this.f252608g;
                        if (list3.size() > i17) {
                            java.util.List list4 = this.f252609h;
                            if (list4.size() > i17) {
                                float floatValue2 = ((java.lang.Number) list.get(i17)).floatValue() * interpolation;
                                ((android.widget.ImageView) v0Var.F().get(i17)).setTranslationX(floatValue2);
                                if (((java.lang.Number) list3.get(i17)).floatValue() < 0.0f && floatValue2 > ((java.lang.Number) list4.get(i17)).floatValue()) {
                                    list3.set(i17, java.lang.Float.valueOf(floatValue));
                                }
                                ((android.widget.ImageView) v0Var.F().get(i17)).setTranslationY(0.0f);
                                ((android.widget.ImageView) v0Var.F().get(i17)).setAlpha(1.0f - interpolation);
                                if (((java.lang.Number) list3.get(i17)).floatValue() > 0.0f) {
                                    float floatValue3 = (floatValue - ((java.lang.Number) list3.get(i17)).floatValue()) / 0.1f;
                                    float f19 = floatValue3 <= 1.0f ? floatValue3 : 1.0f;
                                    if (f19 < 0.0f) {
                                        f19 = 0.0f;
                                    }
                                    list2.set(i17, java.lang.Float.valueOf((float) (f19 * 0.05d)));
                                }
                            }
                        }
                    }
                }
            }
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$11");
    }
}
