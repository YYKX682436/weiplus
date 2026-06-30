package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class h implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public h(com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
