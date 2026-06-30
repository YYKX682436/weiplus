package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class zv implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f196913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f196914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f196915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f196916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f196917h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f196918i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f196919m;

    public zv(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar, android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3, android.graphics.PointF pointF4, android.graphics.PointF pointF5) {
        this.f196913d = imageView;
        this.f196914e = owVar;
        this.f196915f = pointF;
        this.f196916g = pointF2;
        this.f196917h = pointF3;
        this.f196918i = pointF4;
        this.f196919m = pointF5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        android.graphics.PointF pointF;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.getAnimatedValue() instanceof java.lang.Float) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((java.lang.Float) animatedValue).floatValue();
            android.widget.ImageView imageView = this.f196913d;
            if (floatValue <= 0.3f) {
                float f17 = 3.3333333f * floatValue;
                imageView.setAlpha(f17);
                imageView.setScaleX(f17);
                imageView.setScaleY(f17);
            } else {
                if (floatValue > 0.7f) {
                    imageView.setAlpha((1.0f - floatValue) * 3.3333333f);
                    float f18 = 1.0f - ((0.3f - (1 - floatValue)) * 0.6666666f);
                    imageView.setScaleX(f18 > 1.0f ? 1.0f : f18);
                    imageView.setScaleY(f18 <= 1.0f ? f18 : 1.0f);
                } else {
                    imageView.setAlpha(1.0f);
                    imageView.setScaleX(1.0f);
                    imageView.setScaleY(1.0f);
                }
            }
            if (floatValue < 0.3f) {
                this.f196914e.getClass();
                pointF = new android.graphics.PointF();
                android.graphics.PointF pointF2 = this.f196915f;
                pointF.x = pointF2.x;
                float f19 = pointF2.y;
                pointF.y = f19 - ((f19 - this.f196916g.y) * floatValue);
            } else {
                float f27 = (floatValue - 0.3f) / 0.7f;
                android.graphics.PointF p07 = this.f196917h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
                android.graphics.PointF p17 = this.f196918i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
                android.graphics.PointF p27 = this.f196919m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p27, "p2");
                android.graphics.PointF pointF3 = new android.graphics.PointF();
                float f28 = 1 - f27;
                float f29 = f28 * f28;
                float f37 = 2 * f27 * f28;
                float f38 = f27 * f27;
                pointF3.x = (p07.x * f29) + (p17.x * f37) + (p27.x * f38);
                pointF3.y = (f29 * p07.y) + (f37 * p17.y) + (f38 * p27.y);
                pointF = pointF3;
            }
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginStart((int) pointF.x);
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) pointF.y;
            imageView.requestLayout();
        }
    }
}
