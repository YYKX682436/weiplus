package d04;

/* loaded from: classes5.dex */
public final class h0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 f306956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f306957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f306958f;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4, boolean z17, boolean z18) {
        this.f306956d = c17327x39ee10a4;
        this.f306957e = z17;
        this.f306958f = z18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4 = this.f306956d;
        android.view.View view = c17327x39ee10a4.I1;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("maskView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.5f - (floatValue * 0.5f)));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$animateHideBlurView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$animateHideBlurView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (this.f306957e) {
            android.widget.ImageView imageView = c17327x39ee10a4.K1;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                throw null;
            }
            imageView.setAlpha(1.0f - floatValue);
        }
        if (this.f306958f) {
            android.widget.ImageView imageView2 = c17327x39ee10a4.J1;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
                throw null;
            }
            imageView2.setAlpha(1.0f - floatValue);
        }
        android.view.View view2 = c17327x39ee10a4.I1;
        if (view2 != null) {
            view2.getAlpha();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("maskView");
            throw null;
        }
    }
}
