package ym5;

/* loaded from: classes3.dex */
public abstract class u6 {
    public static void a(android.view.View view, android.view.View view2, com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3 c22815x98b0aff3, android.animation.Animator.AnimatorListener animatorListener, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        android.graphics.Rect rect = b(view, null).f295046d;
        android.graphics.Rect rect2 = c22815x98b0aff3.f295046d;
        float max = java.lang.Math.max((c22815x98b0aff3.f295046d.height() * 1.0f) / rect.height(), (rect2.width() * 1.0f) / rect.width());
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        float centerX2 = rect2.centerX();
        float centerY2 = rect2.centerY();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator(1.2f));
        ofFloat.addUpdateListener(new ym5.p6(view, centerX2, centerX, centerY2, centerY, max, view2, animatorUpdateListener));
        ofFloat.addListener(new ym5.q6(animatorListener));
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.setDuration(240L);
        ofFloat.start();
    }

    public static com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3 b(android.view.View view, android.view.View view2) {
        java.lang.String str;
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        if (view2 != null) {
            view2.getGlobalVisibleRect(rect2);
        }
        view.getGlobalVisibleRect(rect);
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            str = "getGlobalVisibleRect";
        } else {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i17 = iArr[0];
            rect.left = i17;
            rect.top = iArr[1];
            rect.right = i17 + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            str = "getLocationOnScreen";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewAnimHelper", str + " left=" + rect.left + " right=" + rect.right + " top=" + rect.top + " bottom=" + rect.bottom);
        if (!rect2.isEmpty() && rect.bottom - view.getHeight() < rect2.top) {
            rect.top = rect.bottom - view.getHeight();
        }
        return new com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3(rect);
    }
}
