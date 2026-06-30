package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes15.dex */
public abstract class g1 {
    public static void a(android.view.View view, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.f1 f1Var) {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559312b8);
        loadAnimation.setDuration(300L);
        loadAnimation.setFillAfter(true);
        loadAnimation.setRepeatCount(0);
        loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.c1(f1Var));
        view.startAnimation(loadAnimation);
    }

    public static void b(android.view.View view, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.f1 f1Var) {
        float width = view.getWidth();
        view.getLocationInWindow(new int[2]);
        int i17 = (int) (r0[0] + width);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0, 0.0f, 0, -i17, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setStartOffset(0L);
        translateAnimation.setRepeatMode(-1);
        translateAnimation.setRepeatCount(0);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.b1(f1Var, i17, view));
        view.startAnimation(translateAnimation);
    }
}
