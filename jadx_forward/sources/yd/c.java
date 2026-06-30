package yd;

/* loaded from: classes7.dex */
public class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f542462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd.e f542463e;

    public c(yd.e eVar) {
        this.f542463e = eVar;
        this.f542462d = eVar.a();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        yd.e eVar = this.f542463e;
        if (floatValue == 1.0f) {
            eVar.f542472a.setVisibility(8);
        } else {
            eVar.f542472a.setTranslationY(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * this.f542462d);
            eVar.f542472a.requestLayout();
        }
    }
}
