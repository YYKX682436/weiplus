package rp1;

/* loaded from: classes14.dex */
public class l2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.n2 f480006d;

    public l2(rp1.n2 n2Var) {
        this.f480006d = n2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue("canvasTranslationX")).intValue();
        rp1.n2 n2Var = this.f480006d;
        n2Var.f480026m = intValue;
        n2Var.f480025i.left = ((java.lang.Integer) valueAnimator.getAnimatedValue("translationX")).intValue();
        n2Var.f480025i.top = ((java.lang.Integer) valueAnimator.getAnimatedValue("translationY")).intValue();
        android.graphics.RectF rectF = n2Var.f480025i;
        rectF.right = rectF.left + (n2Var.f480032s * ((java.lang.Float) valueAnimator.getAnimatedValue("scaleX")).floatValue());
        android.graphics.RectF rectF2 = n2Var.f480025i;
        rectF2.bottom = rectF2.top + (n2Var.f480033t * ((java.lang.Float) valueAnimator.getAnimatedValue("scaleY")).floatValue());
        n2Var.f480036w = ((java.lang.Integer) valueAnimator.getAnimatedValue("bgAlpha")).intValue();
        n2Var.setAlpha(java.lang.Math.min((n2Var.f480036w / 255.0f) + 0.3f, 1.0f));
        n2Var.postInvalidate();
    }
}
