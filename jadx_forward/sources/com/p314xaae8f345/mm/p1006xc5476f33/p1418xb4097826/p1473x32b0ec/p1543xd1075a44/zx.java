package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class zx implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14409x611a9ea7 f202148d;

    public zx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14409x611a9ea7 c14409x611a9ea7) {
        this.f202148d = c14409x611a9ea7;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout height: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14409x611a9ea7 c14409x611a9ea7 = this.f202148d;
        sb6.append(c14409x611a9ea7.getHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewBottomSheetPanel", sb6.toString());
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).nj(c14409x611a9ea7, c14409x611a9ea7.getHeight());
        c14409x611a9ea7.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
