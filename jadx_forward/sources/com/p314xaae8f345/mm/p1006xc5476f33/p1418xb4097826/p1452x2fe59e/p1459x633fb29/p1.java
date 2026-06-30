package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class p1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 f189774d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8) {
        this.f189774d = c13861xc72e20d8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1 y1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1(0, 0, "", "", null, null, 0, null, null, 480, null);
        y1Var.m56423xd4b4a5a1(1000);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8 = this.f189774d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13861xc72e20d8.m56353x743e55cc();
        if (m56353x743e55cc != null) {
            java.util.ArrayList arrayList = m56353x743e55cc.f189833a;
            if (!(true ^ (arrayList == null || arrayList.isEmpty()))) {
                m56353x743e55cc = null;
            }
            if (m56353x743e55cc != null) {
                java.lang.String m56464xb5886c64 = m56464xb5886c64();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AuthorSingleFlowFetcher callInit: use old data list, size: ");
                java.util.ArrayList arrayList2 = m56353x743e55cc.f189833a;
                sb6.append(arrayList2.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
                y1Var.m56420x2a5f836b(arrayList2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc2 = c13861xc72e20d8.m56353x743e55cc();
                y1Var.m56421x73095078(m56353x743e55cc2 != null ? m56353x743e55cc2.f189834b : null);
            }
        }
        return y1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.bv0 bv0Var = fVar instanceof r45.bv0 ? (r45.bv0) fVar : null;
        if (bv0Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1 y1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1(i17, i18, str, "", null, null, 0, null, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de, null);
        y1Var.m56419xdac5ee4d((i17 == 0 && i18 == 0 && bv0Var.m75939xb282bd08(3) == 0) ? false : true);
        db2.s sVar = iVar instanceof db2.s ? (db2.s) iVar : null;
        y1Var.m56423xd4b4a5a1(sVar != null ? sVar.f309680t : 0);
        y1Var.m56421x73095078(bv0Var.m75934xbce7f2f(2));
        cu2.t tVar = cu2.u.f303974a;
        java.util.LinkedList m75941xfb821914 = ((r45.bv0) fVar).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        int d17 = hc2.d0.d(3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8 = this.f189774d;
        java.util.List V0 = kz5.n0.V0(tVar.j(m75941xfb821914, d17, c13861xc72e20d8.m56354xfe9224be()));
        java.lang.Object Z = kz5.n0.Z(c13861xc72e20d8.m56387xe6796cde());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = Z instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) Z : null;
        if (y1Var.getPullType() == 0 && abstractC14490x69736cb5 != null) {
            kz5.h0.B(V0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o1(abstractC14490x69736cb5));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(V0, 10));
        java.util.Iterator it = V0.iterator();
        while (it.hasNext()) {
            arrayList.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
        }
        y1Var.m56420x2a5f836b(arrayList);
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderAuthorSingleFlow incrementList size: ");
        java.util.List m56409x97891cf7 = y1Var.m56409x97891cf7();
        sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
        sb6.append(", hasMore=");
        sb6.append(y1Var.getHasMore());
        sb6.append(", pullType=");
        sb6.append(y1Var.getPullType());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        return y1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8 = this.f189774d;
        if (c13861xc72e20d8.f188973n) {
            return null;
        }
        db2.s sVar = new db2.s(c13861xc72e20d8.f188966d, c13861xc72e20d8.f188968f, 3, c13861xc72e20d8.m56357x44e5026c(), c13861xc72e20d8.m56354xfe9224be());
        sVar.f309680t = 2;
        return sVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8 = this.f189774d;
        if (c13861xc72e20d8.f188973n) {
            return null;
        }
        return new db2.s(c13861xc72e20d8.f188966d, c13861xc72e20d8.f188968f, 3, null, c13861xc72e20d8.m56354xfe9224be());
    }
}
