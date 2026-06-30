package d04;

/* loaded from: classes3.dex */
public final class z0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc f307102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f307103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f307104f;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc c17328xd29825bc, float f17, float f18) {
        this.f307102d = c17328xd29825bc;
        this.f307103e = f17;
        this.f307104f = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc c17328xd29825bc = this.f307102d;
        android.view.View view = c17328xd29825bc.f241237h;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showInfoViewWithAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showInfoViewWithAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.widget.TextView textView = c17328xd29825bc.f241239m;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("opButton");
            throw null;
        }
        textView.setAlpha(floatValue);
        float f17 = 0;
        float f18 = this.f307103e;
        float f19 = f18 + ((f17 - f18) * floatValue);
        float f27 = this.f307104f;
        float f28 = f27 + ((f17 - f27) * floatValue);
        android.widget.ImageView imageView = c17328xd29825bc.f241238i;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoIcon");
            throw null;
        }
        imageView.setTranslationX(f19);
        android.widget.ImageView imageView2 = c17328xd29825bc.f241238i;
        if (imageView2 != null) {
            imageView2.setTranslationY(f28);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoIcon");
            throw null;
        }
    }
}
