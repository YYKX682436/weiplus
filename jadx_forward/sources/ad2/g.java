package ad2;

/* loaded from: classes2.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f84667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f84668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f84669g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f84670h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84671i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f84672m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f84673n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f84674o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f84675p;

    public g(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2, int i17, int i18, int i19, int i27, int i28, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f84666d = view;
        this.f84667e = rect;
        this.f84668f = rect2;
        this.f84669g = i17;
        this.f84670h = i18;
        this.f84671i = i19;
        this.f84672m = i27;
        this.f84673n = i28;
        this.f84674o = i29;
        this.f84675p = h0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 != null) {
            float floatValue = f17.floatValue();
            android.view.View view = this.f84666d;
            android.graphics.Rect rect = this.f84667e;
            view.getGlobalVisibleRect(rect);
            rect.left = (int) (rect.left - view.getTranslationX());
            rect.right = (int) (rect.right - view.getTranslationX());
            rect.top = (int) (rect.top - view.getTranslationY());
            rect.bottom = (int) (rect.bottom - view.getTranslationY());
            int i17 = rect.left;
            android.graphics.Rect rect2 = this.f84668f;
            int i18 = i17 - rect2.left;
            int i19 = rect.bottom - rect2.bottom;
            float f18 = (this.f84669g * floatValue) - i18;
            view.setTranslationX(f18);
            view.setTranslationY((this.f84670h * floatValue) - i19);
            float f19 = this.f84671i + ((this.f84672m - r1) * floatValue);
            float f27 = this.f84673n + ((this.f84674o - r1) * floatValue);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = (int) f19;
            layoutParams.height = (int) f27;
            view.setLayoutParams(layoutParams);
            java.lang.Float f28 = (java.lang.Float) this.f84675p.f391656d;
            if (f28 != null) {
                android.view.View view2 = this.f84666d;
                float floatValue2 = f28.floatValue();
                if (floatValue2 > 0.0f) {
                    float f29 = floatValue2 * (1.0f - floatValue);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(f29));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$transformView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$transformView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    return;
                }
                float abs = java.lang.Math.abs(floatValue2) * floatValue;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(abs));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$transformView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$transformView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }
}
