package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public final class k7 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e f239329d;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e) {
        this.f239329d = c17147x9fa5370e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e = this.f239329d;
        c17147x9fa5370e.f239100m = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceRemarkInputHalfPage", "[mKeyboardHeight] ：" + i17);
        if (i17 > 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = c17147x9fa5370e.f239098h;
            if (z2Var == null || !z2Var.h()) {
                return;
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
            ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            android.view.ViewParent parent = z2Var.f293591g.getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.p7(c17147x9fa5370e, layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null, z2Var));
            ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.q7(z2Var));
            ofInt.setDuration(200L);
            ofInt.start();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = c17147x9fa5370e.f239098h;
        if (z2Var2 == null || !z2Var2.h()) {
            return;
        }
        if (com.p314xaae8f345.mm.ui.b4.c(c17147x9fa5370e.f239094d)) {
            android.view.ViewParent parent2 = z2Var2.f293591g.getParent();
            android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
            android.view.ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            android.view.ViewParent parent3 = z2Var2.f293591g.getParent();
            android.view.View view3 = parent3 instanceof android.view.View ? (android.view.View) parent3 : null;
            if (view3 != null) {
                view3.setLayoutParams(marginLayoutParams);
            }
        }
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(z2Var2.f293591g.getPaddingBottom(), 0);
        ofInt2.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt2.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n7(z2Var2));
        ofInt2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.o7(z2Var2));
        ofInt2.setDuration(200L);
        ofInt2.start();
    }
}
