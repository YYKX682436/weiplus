package ym5;

/* loaded from: classes3.dex */
public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f544773d = new android.graphics.Matrix();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f544774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f544775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f544776g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f544777h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f544778i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae f544779m;

    public d(com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae c22779x313407ae, float f17, float f18, float f19, float f27, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f544779m = c22779x313407ae;
        this.f544774e = f17;
        this.f544775f = f18;
        this.f544776g = f19;
        this.f544777h = f27;
        this.f544778i = animatorUpdateListener;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = this.f544774e;
        float f18 = this.f544775f;
        if (f17 > 1.0f || f18 > 1.0f) {
            float f19 = this.f544777h;
            float f27 = this.f544776g;
            android.graphics.Matrix matrix = this.f544773d;
            com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae c22779x313407ae = this.f544779m;
            if (f17 > 1.0f) {
                matrix.setScale(((f27 * floatValue) / f19) + (1.0f - floatValue), 1.0f, c22779x313407ae.f294829e.centerX(), c22779x313407ae.f294829e.centerY());
            } else if (f18 > 1.0f) {
                matrix.setScale(1.0f, ((f19 * floatValue) / f27) + (1.0f - floatValue), c22779x313407ae.f294829e.centerX(), c22779x313407ae.f294829e.centerY());
            }
            matrix.mapRect(c22779x313407ae.f294828d, new android.graphics.RectF(c22779x313407ae.f294829e));
            c22779x313407ae.invalidate();
        }
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f544778i;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }
}
