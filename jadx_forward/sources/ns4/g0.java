package ns4;

/* loaded from: classes3.dex */
public final class g0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.p0 f421061d;

    public g0(ns4.p0 p0Var) {
        this.f421061d = p0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinCustomAmountInputDialog", "KeyboardHeightObserver " + i17 + ' ' + z17);
        ns4.p0 p0Var = this.f421061d;
        if (i17 > 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = p0Var.f421143c;
            if (z2Var.h()) {
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
                ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                ofInt.addUpdateListener(new ns4.j0(p0Var, z2Var));
                ofInt.addListener(new ns4.k0(z2Var));
                ofInt.setDuration(200L);
                ofInt.start();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = p0Var.f421143c;
        if (z2Var2.h()) {
            android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(z2Var2.f293591g.getPaddingBottom(), 0);
            ofInt2.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofInt2.addUpdateListener(new ns4.h0(z2Var2));
            ofInt2.addListener(new ns4.i0(z2Var2));
            ofInt2.setDuration(200L);
            ofInt2.start();
        }
    }
}
