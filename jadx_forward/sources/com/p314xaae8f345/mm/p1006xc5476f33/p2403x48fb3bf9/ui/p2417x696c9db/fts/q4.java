package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes5.dex */
public class q4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 f266127d;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 v4Var) {
        this.f266127d = v4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 v4Var = this.f266127d;
        android.view.View view = v4Var.f266212e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$5", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$5", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = v4Var.f266213f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$5", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$5", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        v4Var.f266212e.setX(v4Var.f266222o[1][1]);
        v4Var.f266212e.setY(v4Var.f266222o[0][1]);
        v4Var.f266213f.setY(v4Var.f266223p[1]);
        v4Var.getClass();
        android.view.View view3 = v4Var.f266212e;
        int i17 = v4Var.f266211d;
        v4Var.getClass();
        v4Var.getClass();
        view3.setPadding((int) ((floatValue * (i17 - 0)) + 0), 0, 0, 0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) v4Var.f266212e.getLayoutParams();
        if (layoutParams.leftMargin != 0) {
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.width = ((int) v4Var.f266222o[2][0]) + (v4Var.f266208a * 2);
            v4Var.f266212e.setLayoutParams(layoutParams);
        }
    }
}
