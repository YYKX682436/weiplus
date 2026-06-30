package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class x0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a1 f202344d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a1 a1Var) {
        this.f202344d = a1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishKeyBoardInputWidget", "KeyboardHeightObserver " + i17 + ' ' + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a1 a1Var = this.f202344d;
        if (i17 > 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = a1Var.f199917g.f526369c;
            if (y1Var.f()) {
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
                ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.v0(a1Var, y1Var));
                ofInt.setDuration(200L);
                ofInt.start();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = a1Var.f199917g.f526369c;
        if (y1Var2.f()) {
            android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(y1Var2.f293560f.getPaddingBottom(), 0);
            ofInt2.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofInt2.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.u0(y1Var2));
            ofInt2.setDuration(200L);
            ofInt2.start();
        }
    }
}
