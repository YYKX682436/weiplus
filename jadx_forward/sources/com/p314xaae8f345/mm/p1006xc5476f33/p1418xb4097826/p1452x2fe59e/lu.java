package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class lu implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 f188860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu f188861b;

    public lu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar) {
        this.f188860a = c13917xbf9dc158;
        this.f188861b = zuVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0
    /* renamed from: call */
    public void mo981x2e7a5e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = this.f188860a;
        java.lang.String f204960d = c13917xbf9dc158.getF204960d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initData] canTimelineRefresh=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar = this.f188861b;
        sb6.append(zuVar.f192828g);
        sb6.append(", incrementCount=");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f204960d, sb6.toString());
        if (zuVar.f192828g) {
            zuVar.c(0L, false);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f17 = zuVar.g().f();
            if (f17 != null) {
                f17.post(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.iu.f188585d);
            }
        } else {
            ey2.o0 N6 = zuVar.f192827f.N6(2);
            int i18 = N6.f338978e;
            int i19 = N6.f338979f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13917xbf9dc158.getF204960d(), "[initData] canTimelineRefresh " + zuVar.f192828g + " lastPos=" + i18 + " fromTopPixel=" + i19);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa = zuVar.g().mo56062x4905e9fa();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = mo56062x4905e9fa != null ? mo56062x4905e9fa.getLayoutManager() : null;
            zuVar.f192829h = i19;
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i19));
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1164x587b7ff1, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter$feedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1164x587b7ff1.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter$feedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa2 = zuVar.g().mo56062x4905e9fa();
                if (mo56062x4905e9fa2 != null) {
                    mo56062x4905e9fa2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ju(layoutManager, i18, i19));
                }
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f18 = zuVar.g().f();
        if (f18 != null) {
            f18.post(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ku.f188786d);
        }
    }
}
