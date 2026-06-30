package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 f202175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x f202177f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 f202178g;

    public p(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c5570, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c55702) {
        this.f202175d = c22843x6b8c5570;
        this.f202176e = i17;
        this.f202177f = xVar;
        this.f202178g = c22843x6b8c55702;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c5570 = this.f202175d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c22843x6b8c5570.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f202177f.f202198b;
            int a07 = this.f202176e + (c22848x6ddd90cf != null ? c22848x6ddd90cf.a0() : 0);
            int maxHeight = (c22843x6b8c5570.getMaxHeight() / 2) - i65.a.h(this.f202178g.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(maxHeight));
            arrayList.add(java.lang.Integer.valueOf(a07));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$refreshData$1$1$1$2$4$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$refreshData$1$1$1$2$4$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
