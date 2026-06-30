package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes10.dex */
public final class w5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578 f198304d;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578 c14330xf9b5e578) {
        this.f198304d = c14330xf9b5e578;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = {0, 0};
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578 c14330xf9b5e578 = this.f198304d;
        c14330xf9b5e578.getLocationInWindow(iArr);
        float f17 = 2;
        iArr[0] = (int) (iArr[0] + ((c14330xf9b5e578.getScaleX() * c14330xf9b5e578.getWidth()) / f17));
        iArr[1] = (int) (iArr[1] + ((c14330xf9b5e578.getScaleY() * c14330xf9b5e578.getHeight()) / f17));
        if (java.lang.Math.abs(c14330xf9b5e578.K[0] - iArr[0]) <= 1) {
            if (java.lang.Math.abs(c14330xf9b5e578.K[1] - iArr[1]) <= 1) {
                return;
            }
        }
        int[] iArr2 = c14330xf9b5e578.K;
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14330xf9b5e578.f197527v, "OnGlobalLayoutListener: " + iArr);
        c14330xf9b5e578.B();
    }
}
