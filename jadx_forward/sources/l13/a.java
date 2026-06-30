package l13;

/* loaded from: classes2.dex */
public final class a implements l13.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f396518a;

    public a(int i17) {
        this.f396518a = i17;
    }

    @Override // l13.c
    public void a(android.view.View view) {
        if (view == null) {
            return;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator", "resetViewAnimateProperty", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator", "resetViewAnimateProperty", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // l13.c
    public void b(android.view.View view, int i17, int i18, float f17, android.view.View view2, android.view.View view3) {
        float f18;
        float f19 = f17;
        if (view == null) {
            return;
        }
        int i19 = i17 - i18;
        float scaleY = (view2 == null || view2.getMeasuredHeight() == 0 || view.getMeasuredHeight() == 0) ? 0.0f : ((view2.getScaleY() * view2.getMeasuredHeight()) * 1.0f) / view.getMeasuredHeight();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i19 == 0) {
            f18 = 1 - ((float) (f19 * 0.2d));
            scaleY = f18;
            f19 = 1.0f;
        } else {
            double pow = java.lang.Math.pow(0.95d, i19);
            float pow2 = (float) (pow + ((java.lang.Math.pow(0.95d, i19 - 1) - pow) * f19));
            if (i19 == 1) {
                scaleY += (1.0f - scaleY) * f19;
            }
            if (i19 == this.f396518a) {
                if (f19 == 0.0f) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                f18 = pow2;
            } else {
                f18 = pow2;
                f19 = 1.0f;
            }
        }
        view.setPivotX(view.getMeasuredWidth() / 2);
        view.setPivotY(0.0f);
        if (i19 != 0) {
            view.setScaleX(f18);
            view.setScaleY(scaleY);
        } else {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
