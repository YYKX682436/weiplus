package uj3;

/* loaded from: classes3.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.g f509788d;

    public d(uj3.g gVar) {
        this.f509788d = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        uj3.g gVar = this.f509788d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = gVar.f509802b;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(0);
        }
        android.view.View view = gVar.f509805e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI$doAnimationHide$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI$doAnimationHide$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = gVar.f509805e;
        android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        if (layoutParams != null) {
            java.lang.Object animatedValue = it.getAnimatedValue("sizeW");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.width = ((java.lang.Integer) animatedValue).intValue();
        }
        android.view.View view3 = gVar.f509805e;
        android.view.ViewGroup.LayoutParams layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
        if (layoutParams2 != null) {
            java.lang.Object animatedValue2 = it.getAnimatedValue("sizeH");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.height = ((java.lang.Integer) animatedValue2).intValue();
        }
        android.view.View view4 = gVar.f509805e;
        android.view.ViewGroup.LayoutParams layoutParams3 = view4 != null ? view4.getLayoutParams() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        java.lang.Object animatedValue3 = it.getAnimatedValue("marginBottom");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams3).bottomMargin = ((java.lang.Integer) animatedValue3).intValue();
        android.view.View view5 = gVar.f509805e;
        android.view.ViewGroup.LayoutParams layoutParams4 = view5 != null ? view5.getLayoutParams() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        java.lang.Object animatedValue4 = it.getAnimatedValue("marginEnd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams4).setMarginEnd(((java.lang.Integer) animatedValue4).intValue());
        android.view.View view6 = gVar.f509805e;
        if (view6 != null) {
            view6.requestLayout();
        }
    }
}
