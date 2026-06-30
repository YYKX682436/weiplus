package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes4.dex */
public class qj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f243010d;

    public qj(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rj rjVar, android.view.View view) {
        this.f243010d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int parseColor = com.p314xaae8f345.mm.ui.bk.C() ? android.graphics.Color.parseColor("#191919") : -1;
        int parseColor2 = android.graphics.Color.parseColor("#E5E5E5");
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            parseColor2 = android.graphics.Color.parseColor("#303030");
        }
        int[] iArr = {parseColor, parseColor2, parseColor};
        android.view.View view = this.f243010d;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(view, "backgroundColor", iArr);
        ofInt.setDuration(1160L);
        ofInt.setEvaluator(new android.animation.ArgbEvaluator());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofInt);
        animatorSet.start();
        view.sendAccessibilityEvent(8);
    }
}
