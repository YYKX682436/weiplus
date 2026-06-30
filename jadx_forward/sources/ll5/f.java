package ll5;

/* loaded from: classes2.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f400813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f400814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f400815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f400816g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f400817h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f400818i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f400819m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f400820n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f400821o;

    public f(int i17, int i18, android.view.View view, android.view.View view2, boolean z17, boolean z18, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, android.widget.LinearLayout linearLayout, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2) {
        this.f400813d = i17;
        this.f400814e = i18;
        this.f400815f = view;
        this.f400816g = view2;
        this.f400817h = z17;
        this.f400818i = z18;
        this.f400819m = f0Var;
        this.f400820n = linearLayout;
        this.f400821o = f0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        float e17;
        float f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = this.f400813d;
        int i18 = this.f400814e;
        if (i17 > i18) {
            f17 = e06.p.e(2 * floatValue, 0.0f, 1.0f);
            e17 = floatValue;
        } else {
            e17 = e06.p.e(2 * floatValue, 0.0f, 1.0f);
            f17 = floatValue;
        }
        int i19 = (int) (i17 * e17);
        android.view.View view = this.f400815f;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i19 <= 0) {
            i19 = 0;
        }
        layoutParams.height = i19;
        android.view.View view2 = this.f400815f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(e17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float f18 = 1.0f - f17;
        int i27 = (int) (i18 * f18);
        android.view.View view3 = this.f400816g;
        android.view.ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        if (i27 <= 0) {
            i27 = 0;
        }
        layoutParams2.height = i27;
        android.view.View view4 = this.f400816g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.requestLayout();
        view3.requestLayout();
        if (this.f400817h) {
            boolean z17 = this.f400818i;
            android.widget.LinearLayout linearLayout = this.f400820n;
            if (z17) {
                int i28 = (int) (this.f400819m.f391649d * floatValue);
                linearLayout.getLayoutParams().height = i28 > 0 ? i28 : 0;
                linearLayout.setAlpha(floatValue);
            } else {
                float f19 = 1.0f - floatValue;
                int i29 = (int) (this.f400821o.f391649d * f19);
                linearLayout.getLayoutParams().height = i29 > 0 ? i29 : 0;
                linearLayout.setAlpha(f19);
            }
            linearLayout.requestLayout();
        }
    }
}
