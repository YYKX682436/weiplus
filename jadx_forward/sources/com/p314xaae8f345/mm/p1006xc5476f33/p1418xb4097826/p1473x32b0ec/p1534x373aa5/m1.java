package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class m1 implements q80.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 f198002a;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c14300xaa703dd8) {
        this.f198002a = c14300xaa703dd8;
    }

    @Override // q80.u
    /* renamed from: onBodySizeChange */
    public void mo57790x4e43b612(java.lang.String str, long j17, long j18, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c14300xaa703dd8 = this.f198002a;
        int dimensionPixelOffset = c14300xaa703dd8.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        int a17 = f18 > 0.0f ? ym5.x.a(c14300xaa703dd8.getContext(), f18) : dimensionPixelOffset;
        boolean z17 = a17 > dimensionPixelOffset * 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorDataPanelView", "onBodySizeChange: isExpand=" + z17 + ", realHeight=" + a17 + ", appId=" + str + ", width=" + f17 + ", height=" + f18 + ", appUuid=" + j17 + ", pageId=" + j18);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l1(c14300xaa703dd8, a17, z17));
    }
}
