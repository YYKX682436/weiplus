package ym5;

/* loaded from: classes3.dex */
public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f544716d = new android.graphics.Matrix();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f544717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f544718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f544719g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f544720h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ym5.b f544721i;

    public a(ym5.b bVar, float f17, float f18, float f19, float f27) {
        this.f544721i = bVar;
        this.f544717e = f17;
        this.f544718f = f18;
        this.f544719g = f19;
        this.f544720h = f27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = this.f544717e;
        float f18 = this.f544719g;
        float f19 = this.f544718f;
        android.graphics.Matrix matrix = this.f544716d;
        ym5.b bVar = this.f544721i;
        if (f17 > 1.0f) {
            float f27 = 1.0f - floatValue;
            if (f19 + f27 != 0.0f) {
                matrix.setScale(((floatValue * f18) / f19) + f27, 1.0f, bVar.f544741i.f294829e.centerX(), bVar.f544741i.f294829e.centerY());
            }
        } else if (this.f544720h > 1.0f) {
            float f28 = 1.0f - floatValue;
            if (f18 + f28 != 0.0f) {
                matrix.setScale(1.0f, ((floatValue * f19) / f18) + f28, bVar.f544741i.f294829e.centerX(), bVar.f544741i.f294829e.centerY());
            }
        }
        matrix.mapRect(bVar.f544741i.f294828d, new android.graphics.RectF(bVar.f544741i.f294829e));
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = bVar.f544740h;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
        bVar.f544741i.invalidate();
    }
}
