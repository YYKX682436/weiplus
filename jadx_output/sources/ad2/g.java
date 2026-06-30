package ad2;

/* loaded from: classes2.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f3133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f3134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f3135f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3136g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3137h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3138i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3139m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3140n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3141o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f3142p;

    public g(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2, int i17, int i18, int i19, int i27, int i28, int i29, kotlin.jvm.internal.h0 h0Var) {
        this.f3133d = view;
        this.f3134e = rect;
        this.f3135f = rect2;
        this.f3136g = i17;
        this.f3137h = i18;
        this.f3138i = i19;
        this.f3139m = i27;
        this.f3140n = i28;
        this.f3141o = i29;
        this.f3142p = h0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 != null) {
            float floatValue = f17.floatValue();
            android.view.View view = this.f3133d;
            android.graphics.Rect rect = this.f3134e;
            view.getGlobalVisibleRect(rect);
            rect.left = (int) (rect.left - view.getTranslationX());
            rect.right = (int) (rect.right - view.getTranslationX());
            rect.top = (int) (rect.top - view.getTranslationY());
            rect.bottom = (int) (rect.bottom - view.getTranslationY());
            int i17 = rect.left;
            android.graphics.Rect rect2 = this.f3135f;
            int i18 = i17 - rect2.left;
            int i19 = rect.bottom - rect2.bottom;
            float f18 = (this.f3136g * floatValue) - i18;
            view.setTranslationX(f18);
            view.setTranslationY((this.f3137h * floatValue) - i19);
            float f19 = this.f3138i + ((this.f3139m - r1) * floatValue);
            float f27 = this.f3140n + ((this.f3141o - r1) * floatValue);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = (int) f19;
            layoutParams.height = (int) f27;
            view.setLayoutParams(layoutParams);
            java.lang.Float f28 = (java.lang.Float) this.f3142p.f310123d;
            if (f28 != null) {
                android.view.View view2 = this.f3133d;
                float floatValue2 = f28.floatValue();
                if (floatValue2 > 0.0f) {
                    float f29 = floatValue2 * (1.0f - floatValue);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(f29));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$transformView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$transformView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    return;
                }
                float abs = java.lang.Math.abs(floatValue2) * floatValue;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(abs));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$transformView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$transformView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }
}
