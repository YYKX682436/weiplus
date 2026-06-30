package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes5.dex */
public class s4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 f266148d;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 v4Var) {
        this.f266148d = v4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        double abs = java.lang.Math.abs(floatValue - 1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 v4Var = this.f266148d;
        if (abs > 0.001d) {
            android.view.View view = v4Var.f266213f;
            float f17 = 1.0f - floatValue;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = v4Var.f266212e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        v4Var.f266212e.setX(v4Var.f266222o[1][0]);
        v4Var.f266212e.setY(v4Var.f266222o[0][0]);
        v4Var.f266213f.setY(v4Var.f266223p[0]);
        v4Var.getClass();
        v4Var.f266212e.setPadding(0, 0, 0, 0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) v4Var.f266212e.getLayoutParams();
        int i17 = v4Var.f266208a;
        layoutParams.leftMargin = i17;
        layoutParams.rightMargin = i17;
        layoutParams.width = (int) v4Var.f266222o[2][0];
        v4Var.f266212e.setLayoutParams(layoutParams);
        android.view.View view3 = v4Var.f266212e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(valueOf);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = v4Var.f266213f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(valueOf);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
