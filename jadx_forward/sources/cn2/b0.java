package cn2;

/* loaded from: classes2.dex */
public final class b0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f125005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f125006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f125007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f125008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f125009h;

    public b0(android.view.View view, int i17, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f125005d = view;
        this.f125006e = i17;
        this.f125007f = z17;
        this.f125008g = c0Var;
        this.f125009h = interfaceC29045xdcb5ca57;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = 1;
        this.f125005d.setTranslationX(this.f125006e * (f17 - floatValue));
        if (this.f125007f) {
            android.view.View view = this.f125005d;
            float f18 = f17 * floatValue;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentAnimation$startAnim$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentAnimation$startAnim$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.getAnimatedValue(), java.lang.Float.valueOf(1.0f))) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f125008g;
            if (c0Var.f391645d) {
                return;
            }
            c0Var.f391645d = true;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f125009h.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
        }
    }
}
