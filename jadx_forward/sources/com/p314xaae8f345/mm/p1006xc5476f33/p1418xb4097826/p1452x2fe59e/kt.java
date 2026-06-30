package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class kt implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a f188784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt f188785b;

    public kt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a c13865x4e81e68a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar) {
        this.f188784a = c13865x4e81e68a;
        this.f188785b = ytVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0
    /* renamed from: call */
    public void mo981x2e7a5e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a c13865x4e81e68a = this.f188784a;
        java.lang.String f204960d = c13865x4e81e68a.getF204960d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initData] canTimelineRefresh=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar = this.f188785b;
        sb6.append(ytVar.f192734h);
        sb6.append(", incrementCount=");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f204960d, sb6.toString());
        boolean z17 = ytVar.f192734h;
        if (z17) {
            ytVar.c(0L, false);
        } else {
            ey2.o0 N6 = ytVar.f192733g.N6(1000);
            int i18 = N6.f338978e;
            int i19 = N6.f338979f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13865x4e81e68a.getF204960d(), "[initData] canTimelineRefresh " + z17 + " lastPos=" + i18 + " fromTopPixel=" + i19);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa = ytVar.h().mo56062x4905e9fa();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = mo56062x4905e9fa != null ? mo56062x4905e9fa.getLayoutManager() : null;
            ytVar.f192735i = i19;
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i19));
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1164x587b7ff1, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1164x587b7ff1.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa2 = ytVar.h().mo56062x4905e9fa();
                if (mo56062x4905e9fa2 != null) {
                    mo56062x4905e9fa2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jt(layoutManager, i18, i19));
                }
            }
        }
        if (i17 <= 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ht(z17 ? new ym5.s3(0) : null, ytVar));
        }
    }
}
