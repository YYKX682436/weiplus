package ws2;

/* loaded from: classes3.dex */
public final class r1 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 f530663a;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583) {
        this.f530663a = c14931xe48fc583;
    }

    @Override // ym5.q3
    public void b(int i17) {
        r45.mt2 mt2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583 = this.f530663a;
        android.view.View d17 = c14931xe48fc583.f206414g.d(com.p314xaae8f345.mm.R.id.f7r);
        android.view.View findViewById = d17 != null ? d17.findViewById(com.p314xaae8f345.mm.R.id.imc) : null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = findViewById instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) findViewById : null;
        android.view.View d18 = c14931xe48fc583.f206414g.d(com.p314xaae8f345.mm.R.id.f7r);
        android.view.View findViewById2 = d18 != null ? d18.findViewById(com.p314xaae8f345.mm.R.id.ile) : null;
        zs2.c cVar = ws2.k1.f530599r.a().f530603b;
        if ((cVar == null || (mt2Var = cVar.f556779a) == null || mt2Var.m75939xb282bd08(3) != 0) ? false : true) {
            if (c22627xa933f8e4 != null) {
                c22627xa933f8e4.setVisibility(8);
            }
            if (findViewById2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            c14931xe48fc583.f206414g.N(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "live list load finish is show");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = ((ws2.s0) c14931xe48fc583.f206412e).f530668f;
        if (abstractC13919x46aff122 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(abstractC13919x46aff122, false, 1, null);
        }
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.c(com.p314xaae8f345.mm.R.raw.f79237x607f3a5e, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.setVisibility(0);
        }
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "load more progress bar is show");
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "onLoadMoreEnd");
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "onRefreshBegin");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583 = this.f530663a;
        c14931xe48fc583.f206414g.post(new ws2.q1(c14931xe48fc583));
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "onRefreshEnd");
    }
}
