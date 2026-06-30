package cn2;

/* loaded from: classes2.dex */
public final class b0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f43472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f43474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f43475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f43476h;

    public b0(android.view.View view, int i17, boolean z17, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f43472d = view;
        this.f43473e = i17;
        this.f43474f = z17;
        this.f43475g = c0Var;
        this.f43476h = continuation;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = 1;
        this.f43472d.setTranslationX(this.f43473e * (f17 - floatValue));
        if (this.f43474f) {
            android.view.View view = this.f43472d;
            float f18 = f17 * floatValue;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentAnimation$startAnim$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentAnimation$startAnim$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (kotlin.jvm.internal.o.b(it.getAnimatedValue(), java.lang.Float.valueOf(1.0f))) {
            kotlin.jvm.internal.c0 c0Var = this.f43475g;
            if (c0Var.f310112d) {
                return;
            }
            c0Var.f310112d = true;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f43476h.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        }
    }
}
