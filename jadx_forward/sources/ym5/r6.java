package ym5;

/* loaded from: classes2.dex */
public class r6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f545033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f545034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f545035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f545036g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f545037h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f545038i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f545039m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f545040n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f545041o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f545042p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.view.View f545043q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f545044r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f545045s;

    public r6(android.view.View view, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, android.view.View view2, float f47, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f545033d = view;
        this.f545034e = f17;
        this.f545035f = f18;
        this.f545036g = f19;
        this.f545037h = f27;
        this.f545038i = f28;
        this.f545039m = f29;
        this.f545040n = f37;
        this.f545041o = f38;
        this.f545042p = f39;
        this.f545043q = view2;
        this.f545044r = f47;
        this.f545045s = animatorUpdateListener;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = this.f545034e + ((this.f545035f - this.f545036g) * floatValue);
        android.view.View view = this.f545033d;
        view.setTranslationX(f17);
        view.setTranslationY(this.f545037h + ((this.f545038i - this.f545039m) * floatValue));
        float f18 = this.f545041o;
        float f19 = this.f545040n;
        view.setScaleX(f19 + (((f18 * f19) - f19) * floatValue));
        float f27 = this.f545042p;
        view.setScaleY(f27 + (((f18 * f27) - f27) * floatValue));
        android.view.View view2 = this.f545043q;
        float f28 = (1.0f - floatValue) * this.f545044r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f28));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/view/ViewAnimHelper$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/view/ViewAnimHelper$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f545045s;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }
}
