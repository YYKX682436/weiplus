package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 f197983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f197984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f197985f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c14300xaa703dd8, int i17, boolean z17) {
        super(0);
        this.f197983d = c14300xaa703dd8;
        this.f197984e = i17;
        this.f197985f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c14300xaa703dd8 = this.f197983d;
        yz5.p onExpandListener = c14300xaa703dd8.getOnExpandListener();
        int i17 = this.f197984e;
        boolean z17 = this.f197985f;
        if (onExpandListener != null) {
            onExpandListener.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        }
        if (c14300xaa703dd8.getLayoutParams() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAnchorDataPanelView", "animToTargetHeight: layoutParams is null!");
        } else {
            int i18 = c14300xaa703dd8.getLayoutParams().height;
            if (i18 != i17) {
                c14300xaa703dd8.animate().cancel();
                if (z17) {
                    c14300xaa703dd8.animate().setUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k1(i17 - i18, c14300xaa703dd8, i18)).setDuration(100L).start();
                } else {
                    c14300xaa703dd8.getLayoutParams().height = i17;
                    c14300xaa703dd8.requestLayout();
                }
            }
        }
        c14300xaa703dd8.m81436x205ac394(c14300xaa703dd8.getContext().getResources().getDimension(z17 ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv : com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        c14300xaa703dd8.setBackground(z17 ? new android.graphics.drawable.ColorDrawable(c14300xaa703dd8.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77913xe61cad94)) : null);
        return jz5.f0.f384359a;
    }
}
