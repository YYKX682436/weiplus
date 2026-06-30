package d04;

/* loaded from: classes13.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f307036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb f307037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f307038f;

    public t(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f307036d = z17;
        this.f307037e = c17326x8613bffb;
        this.f307038f = animatorUpdateListener;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        boolean z17 = this.f307036d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb = this.f307037e;
        if (z17) {
            android.view.View m68763xb5f85d42 = c17326x8613bffb.m68763xb5f85d42();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f - floatValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m68763xb5f85d42, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            m68763xb5f85d42.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(m68763xb5f85d42, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb.H1;
        android.widget.TextView scanTips = c17326x8613bffb.getScanTips();
        if (scanTips != null) {
            scanTips.setAlpha(1.0f - floatValue);
        }
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f307038f;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(animation);
        }
        int i18 = 0;
        for (java.lang.Object obj : c17326x8613bffb.m68766xd611573d()) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) obj;
            if (i18 < c17326x8613bffb.N) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(floatValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
            }
            i18 = i19;
        }
        if (c17326x8613bffb.V) {
            android.widget.TextView textView = c17326x8613bffb.B;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiCodeTips");
                throw null;
            }
            textView.setAlpha(floatValue);
        }
    }
}
