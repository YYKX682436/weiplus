package jq4;

/* loaded from: classes3.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jq4.y f382685e;

    public h(android.view.View view, jq4.y yVar) {
        this.f382684d = view;
        this.f382685e = yVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        android.view.ViewGroup.LayoutParams layoutParams = this.f382684d.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            jq4.y yVar = this.f382685e;
            android.view.View view = yVar.f382769e;
            android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kg8) : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.view.View view2 = yVar.f382769e;
            android.view.View findViewById = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.f567705kg4) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = yVar.f382769e;
            android.view.View findViewById2 = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.kg6) : null;
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = yVar.f382769e;
            android.view.View findViewById3 = view4 != null ? view4.findViewById(com.p314xaae8f345.mm.R.id.kfq) : null;
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = yVar.f382769e;
            android.view.View findViewById4 = view5 != null ? view5.findViewById(com.p314xaae8f345.mm.R.id.kfp) : null;
            if (findViewById4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.Object animatedValue = animator.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.height = ((java.lang.Integer) animatedValue).intValue();
            java.lang.Object animatedValue2 = animator.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            yVar.f382777m = ((java.lang.Integer) animatedValue2).intValue();
            android.view.View view6 = yVar.f382781q;
            if (view6 == null) {
                return;
            }
            view6.setLayoutParams(layoutParams2);
        }
    }
}
