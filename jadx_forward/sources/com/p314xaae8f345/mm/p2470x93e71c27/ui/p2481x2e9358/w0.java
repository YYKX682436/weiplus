package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class w0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f272232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f272233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272234f;

    public w0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33, float f17, float f18) {
        this.f272234f = c19666xfd6e2f33;
        this.f272232d = f17;
        this.f272233e = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272234f;
        c19666xfd6e2f33.L4.m78265x3ae760af(this.f272232d - floatValue);
        c19666xfd6e2f33.L4.m78268xbcf73793(this.f272233e + floatValue);
        c19666xfd6e2f33.K4.m78265x3ae760af(4.0f - floatValue);
        c19666xfd6e2f33.K4.m78268xbcf73793((floatValue * 2.0f) + 252.0f);
    }
}
