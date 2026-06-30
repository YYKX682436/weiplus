package d04;

/* loaded from: classes3.dex */
public final class c1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc f306922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f306923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f306924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f306925g;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc c17328xd29825bc, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2) {
        this.f306922d = c17328xd29825bc;
        this.f306923e = z17;
        this.f306924f = e0Var;
        this.f306925g = e0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc c17328xd29825bc = this.f306922d;
        android.view.View view = c17328xd29825bc.f241235f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = c17328xd29825bc.f241234e;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f306923e) {
            c17328xd29825bc.f241243q = true;
            float f17 = this.f306924f.f391648d;
            float f18 = 0;
            float f19 = f17 + ((f18 - f17) * floatValue);
            float f27 = this.f306925g.f391648d;
            float f28 = f27 + ((f18 - f27) * floatValue);
            android.view.View view3 = c17328xd29825bc.f241236g;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingIcon");
                throw null;
            }
            view3.setTranslationX(f19);
            android.view.View view4 = c17328xd29825bc.f241236g;
            if (view4 != null) {
                view4.setTranslationY(f28);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingIcon");
                throw null;
            }
        }
    }
}
