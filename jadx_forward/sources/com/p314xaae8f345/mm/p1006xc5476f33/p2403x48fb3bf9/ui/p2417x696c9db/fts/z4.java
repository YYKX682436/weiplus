package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes5.dex */
public class z4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 {
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.u4 u4Var, boolean z17) {
        if (u4Var == this.f266224q) {
            return;
        }
        int ordinal = u4Var.ordinal();
        android.view.View view = this.f266219l;
        float[][] fArr = this.f266222o;
        if (ordinal == 0) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            if (fArr[0][0] - this.f266210c >= 0.0f) {
                ofFloat.addUpdateListener(this.f266230w);
            } else {
                ofFloat.addUpdateListener(this.f266231x);
            }
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.w4(this));
            animatorSet.start();
            return;
        }
        if (ordinal != 1) {
            return;
        }
        if (z17) {
            android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            if (fArr[0][0] - this.f266210c >= 0.0f) {
                ofFloat3.addUpdateListener(this.f266228u);
            } else {
                ofFloat3.addUpdateListener(this.f266229v);
            }
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.playTogether(ofFloat3, ofFloat4);
            animatorSet2.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animatorSet2.setDuration(300L);
            animatorSet2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.y4(this));
            animatorSet2.start();
            return;
        }
        int i17 = this.f266211d;
        android.view.View view2 = this.f266212e;
        view2.setPadding(i17, 0, 0, 0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
        int i18 = this.f266208a;
        int i19 = i18 - i18;
        layoutParams.leftMargin = i19;
        layoutParams.rightMargin = i19;
        layoutParams.width = ((int) fArr[2][0]) + (i18 * 2);
        view2.setLayoutParams(layoutParams);
        view2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.x4(this));
    }
}
