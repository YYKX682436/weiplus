package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class q9 implements q80.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14341x36fc1ea2 f198140a;

    public q9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14341x36fc1ea2 c14341x36fc1ea2) {
        this.f198140a = c14341x36fc1ea2;
    }

    @Override // q80.u
    /* renamed from: onBodySizeChange */
    public void mo57790x4e43b612(java.lang.String str, long j17, long j18, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14341x36fc1ea2 c14341x36fc1ea2 = this.f198140a;
        int dimensionPixelOffset = c14341x36fc1ea2.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        int a17 = f18 > 0.0f ? ym5.x.a(c14341x36fc1ea2.getContext(), f18) : dimensionPixelOffset;
        boolean z17 = a17 > dimensionPixelOffset * 2;
        int a18 = f17 > 0.0f ? ym5.x.a(c14341x36fc1ea2.getContext(), f17) : c14341x36fc1ea2.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561196c1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveProductSizeAssistPanelView", "onBodySizeChange: isExpand=" + z17 + ", realHeight=" + a17 + ", appId=" + str + ", width=" + f17 + ", height=" + f18 + ", appUuid=" + j17 + ", pageId=" + j18);
        c14341x36fc1ea2.f197619g = a17;
        if (c14341x36fc1ea2.getLayoutParams().height > a17) {
            return;
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p9(c14341x36fc1ea2, a17, a18));
    }
}
