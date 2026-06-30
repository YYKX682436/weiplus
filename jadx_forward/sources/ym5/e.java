package ym5;

/* loaded from: classes3.dex */
public class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f544788d = new android.graphics.Matrix();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f544789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f544790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f544791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f544792h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ym5.f f544793i;

    public e(ym5.f fVar, float f17, float f18, float f19, float f27) {
        this.f544793i = fVar;
        this.f544789e = f17;
        this.f544790f = f18;
        this.f544791g = f19;
        this.f544792h = f27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = this.f544789e;
        float f18 = this.f544791g;
        float f19 = this.f544790f;
        android.graphics.Matrix matrix = this.f544788d;
        ym5.f fVar = this.f544793i;
        if (f17 > 1.0f) {
            matrix.setScale(floatValue + ((f19 / f18) * (1.0f - floatValue)), 1.0f, fVar.f544807i.f294829e.centerX(), fVar.f544807i.f294829e.centerY());
        } else if (this.f544792h > 1.0f) {
            matrix.setScale(1.0f, floatValue + ((f18 / f19) * (1.0f - floatValue)), fVar.f544807i.f294829e.centerX(), fVar.f544807i.f294829e.centerY());
        }
        matrix.mapRect(fVar.f544807i.f294828d, new android.graphics.RectF(fVar.f544807i.f294829e));
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = fVar.f544806h;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
        fVar.f544807i.invalidate();
    }
}
