package zd4;

/* loaded from: classes11.dex */
public class f implements android.widget.ExpandableListView.OnChildClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c f553163a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c abstractActivityC18396x51e3f06c) {
        this.f553163a = abstractActivityC18396x51e3f06c;
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, int i18, long j17) {
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onChildClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c abstractActivityC18396x51e3f06c = this.f553163a;
        int n17 = abstractActivityC18396x51e3f06c.f252217r.n(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "ExpandableListView click groupPosition:%d, childPosition:%d, visibleState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(n17));
        if (abstractActivityC18396x51e3f06c.f252217r.a(n17, i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253063x)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            abstractActivityC18396x51e3f06c.f252221v = n17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            abstractActivityC18396x51e3f06c.g7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            s0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b0 = s0Var.f246492l;
            if (c6969xa989d0b0 != null) {
                int i27 = c6969xa989d0b0.f142785s;
                if (i27 <= 0) {
                    c6969xa989d0b0.f142785s = 1;
                } else {
                    c6969xa989d0b0.f142785s = i27 + 1;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        } else if (abstractActivityC18396x51e3f06c.f252217r.a(n17, i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253062w)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            abstractActivityC18396x51e3f06c.f252221v = n17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            abstractActivityC18396x51e3f06c.h7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            s0Var2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b02 = s0Var2.f246492l;
            if (c6969xa989d0b02 != null) {
                int i28 = c6969xa989d0b02.f142781o;
                if (i28 <= 0) {
                    c6969xa989d0b02.f142781o = 1;
                } else {
                    c6969xa989d0b02.f142781o = i28 + 1;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        } else if (abstractActivityC18396x51e3f06c.f252214o && abstractActivityC18396x51e3f06c.f252217r.a(n17, i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253064y)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar = abstractActivityC18396x51e3f06c.f252216q;
            boolean z17 = !xkVar.f253067e;
            xkVar.f253067e = z17;
            if (z17) {
                xkVar.d();
                abstractActivityC18396x51e3f06c.f252216q.f253077o.clear();
            }
            abstractActivityC18396x51e3f06c.m78501x43e00957(abstractActivityC18396x51e3f06c.j7());
            abstractActivityC18396x51e3f06c.f252216q.notifyDataSetChanged();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar2 = abstractActivityC18396x51e3f06c.f252216q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            if (abstractActivityC18396x51e3f06c.f252214o) {
                i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253064y + 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            } else {
                i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253063x + 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            }
            java.lang.String str = (java.lang.String) xkVar2.getChild(i17, i18 - i19);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar3 = abstractActivityC18396x51e3f06c.f252216q;
            xkVar3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addNewTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            if (xkVar3.g() != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(xkVar3.g());
                if (!xkVar3.i(arrayList, str)) {
                    if (arrayList.size() == 5) {
                        arrayList.remove(4);
                        arrayList.add(0, str);
                    } else {
                        arrayList.add(0, str);
                    }
                    java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ",");
                    gm0.j1.i();
                    gm0.j1.u().c().w(335875, c17);
                }
            } else {
                gm0.j1.i();
                gm0.j1.u().c().w(335875, str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addNewTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            if (abstractActivityC18396x51e3f06c.f252217r.b(i17, 2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c.V6(abstractActivityC18396x51e3f06c, 1, abstractActivityC18396x51e3f06c.f252216q.f253076n, str, view);
            } else if (abstractActivityC18396x51e3f06c.f252217r.b(i17, 3)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c.V6(abstractActivityC18396x51e3f06c, 2, abstractActivityC18396x51e3f06c.f252216q.f253077o, str, view);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onChildClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$3");
        return true;
    }
}
