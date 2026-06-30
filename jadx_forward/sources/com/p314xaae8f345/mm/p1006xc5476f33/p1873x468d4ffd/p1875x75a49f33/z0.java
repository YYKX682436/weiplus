package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes5.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 f230650d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x42192224) {
        this.f230650d = c16540x42192224;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x42192224 = this.f230650d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c16540x42192224.f230450p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
        int computeHorizontalScrollRange = c1163xf1deaba4.computeHorizontalScrollRange();
        java.lang.Double d17 = c16540x42192224.m66924x3b08e79f().get(c16540x42192224.f230443f);
        if (d17 == null) {
            d17 = java.lang.Double.valueOf(0.0d);
        }
        double doubleValue = d17.doubleValue();
        double d18 = doubleValue / c16540x42192224.f230445h;
        double d19 = computeHorizontalScrollRange > 0 ? d18 * computeHorizontalScrollRange : 0.0d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c16540x42192224.f230450p;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba42 != null ? c1163xf1deaba42.getLayoutManager() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(-((int) d19)));
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            z17 = false;
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$refreshUIAfterDurationUpdate$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$refreshUIAfterDurationUpdate$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        } else {
            z17 = false;
        }
        if (c16540x42192224.a() > c16540x42192224.f230441d ? true : z17) {
            c16540x42192224.d(z17, "", c16540x42192224.f230455u);
        } else {
            java.lang.String r17 = i65.a.r(c16540x42192224.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.lrs);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
            c16540x42192224.d(true, r17, c16540x42192224.f230455u);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SegmentClip.RecyclerThumbBarView", "startLoad: ScrollOffset=" + d19 + ", scrollRange=" + computeHorizontalScrollRange + ", startTimeMsOfSegment=" + doubleValue + ", startTimeScrollPercent=" + d18);
    }
}
