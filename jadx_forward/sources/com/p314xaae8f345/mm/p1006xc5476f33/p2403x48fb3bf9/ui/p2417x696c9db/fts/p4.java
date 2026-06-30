package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes5.dex */
public class p4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 f266118d;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 v4Var) {
        this.f266118d = v4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.view.View view;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 v4Var = this.f266118d;
        float[][] fArr = v4Var.f266222o;
        float[] fArr2 = fArr[1];
        float f17 = fArr2[1];
        float f18 = fArr2[0];
        float f19 = ((f17 - f18) * floatValue) + f18;
        float[] fArr3 = fArr[0];
        float f27 = fArr3[1];
        float f28 = fArr3[0];
        v4Var.f266212e.setX(f19);
        v4Var.f266212e.setY(((f27 - f28) * floatValue) + f28);
        float[] fArr4 = v4Var.f266223p;
        float f29 = fArr4[1];
        float f37 = fArr4[0];
        v4Var.f266213f.setY(((f29 - f37) * floatValue) + f37);
        android.view.View view2 = v4Var.f266213f;
        float f38 = 1.0f - floatValue;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f38));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        int i17 = v4Var.f266227t;
        if (i17 == 1 || i17 == 3) {
            android.view.View view3 = v4Var.f266220m;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(floatValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View view4 = v4Var.f266220m;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = v4Var.f266220m;
                if (view5 != null) {
                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view5.getLayoutParams();
                    layoutParams.leftMargin = (int) (v4Var.f266209b * f38);
                    v4Var.f266220m.setLayoutParams(layoutParams);
                }
            }
            android.view.View view6 = v4Var.f266221n;
            if (view6 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view7 = v4Var.f266221n;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(java.lang.Float.valueOf(floatValue));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view7.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        } else if (i17 == 2 && (view = v4Var.f266220m) != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view, arrayList6.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view8 = v4Var.f266220m;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        v4Var.getClass();
        android.view.View view9 = v4Var.f266212e;
        int i18 = v4Var.f266211d;
        v4Var.getClass();
        v4Var.getClass();
        view9.setPadding((int) ((floatValue * (i18 - 0)) + 0), 0, 0, 0);
        v4Var.f266212e.getPaddingLeft();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) v4Var.f266212e.getLayoutParams();
        int i19 = v4Var.f266208a;
        int i27 = (int) (i19 * f38);
        layoutParams2.leftMargin = i27;
        layoutParams2.rightMargin = 0;
        layoutParams2.width = ((int) v4Var.f266222o[2][0]) + ((i19 - i27) * 2);
        v4Var.f266212e.setLayoutParams(layoutParams2);
    }
}
