package ym5;

/* loaded from: classes2.dex */
public class p6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f545001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f545002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f545003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f545004g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f545005h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f545006i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f545007m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f545008n;

    public p6(android.view.View view, float f17, float f18, float f19, float f27, float f28, android.view.View view2, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f545001d = view;
        this.f545002e = f17;
        this.f545003f = f18;
        this.f545004g = f19;
        this.f545005h = f27;
        this.f545006i = f28;
        this.f545007m = view2;
        this.f545008n = animatorUpdateListener;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = 1.0f - floatValue;
        float f18 = (this.f545002e - this.f545003f) * f17;
        android.view.View view = this.f545001d;
        view.setTranslationX(f18);
        view.setTranslationY((this.f545004g - this.f545005h) * f17);
        float f19 = (this.f545006i * f17) + floatValue;
        if (f19 > 0.0f) {
            try {
                view.setScaleX(f19);
                view.setScaleY(f19);
            } catch (java.lang.Throwable unused) {
            }
        }
        android.view.View view2 = this.f545007m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/view/ViewAnimHelper$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/view/ViewAnimHelper$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f545008n;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }
}
