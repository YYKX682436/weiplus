package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class z5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13883xc81866dd f190043d;

    public z5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13883xc81866dd c13883xc81866dd) {
        this.f190043d = c13883xc81866dd;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "fetchInit");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a6 a6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a6(0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13883xc81866dd c13883xc81866dd = this.f190043d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13883xc81866dd.m56353x743e55cc();
        a6Var.m56420x2a5f836b(m56353x743e55cc != null ? m56353x743e55cc.f189833a : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc2 = c13883xc81866dd.m56353x743e55cc();
        a6Var.m56421x73095078(m56353x743e55cc2 != null ? m56353x743e55cc2.f189834b : null);
        return a6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a6 a6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a6(i17, i18, str);
        if ((fVar instanceof r45.j91) && (iVar instanceof db2.l1)) {
            boolean z17 = (i17 == 0 && i18 == 0 && ((r45.j91) fVar).m75939xb282bd08(3) <= 0) ? false : true;
            r45.j91 j91Var = (r45.j91) fVar;
            java.util.LinkedList<r45.eq2> m75941xfb821914 = j91Var.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContainer_list(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.eq2 eq2Var : m75941xfb821914) {
                java.lang.String m75945x2fec8307 = eq2Var.m75945x2fec8307(0);
                java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                java.lang.String m75945x2fec83072 = eq2Var.m75945x2fec8307(1);
                java.lang.String str3 = m75945x2fec83072 == null ? "" : m75945x2fec83072;
                long m75942xfb822ef2 = eq2Var.m75942xfb822ef2(2);
                int m75939xb282bd08 = eq2Var.m75939xb282bd08(4);
                java.util.List m75941xfb8219142 = eq2Var.m75941xfb821914(3);
                if (m75941xfb8219142 == null) {
                    m75941xfb8219142 = kz5.p0.f395529d;
                }
                java.util.List list = m75941xfb8219142;
                int i19 = this.f190043d.f189106d;
                java.lang.String m75945x2fec83073 = j91Var.m75945x2fec8307(5);
                arrayList.add(new so2.t4(str2, str3, m75942xfb822ef2, m75939xb282bd08, list, m75945x2fec83073 == null ? "" : m75945x2fec83073, i19));
            }
            java.util.List V0 = kz5.n0.V0(arrayList);
            a6Var.m56426x6249b2c3(fVar);
            a6Var.m56420x2a5f836b(V0);
            db2.l1 l1Var = (db2.l1) iVar;
            if (l1Var.f309585t != 2) {
                cu2.t tVar = cu2.u.f303974a;
                java.util.List m56409x97891cf7 = a6Var.m56409x97891cf7();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m56409x97891cf7, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.RVFeed>");
                tVar.m(m56409x97891cf7, 0, "", true);
            }
            java.lang.String m56464xb5886c64 = m56464xb5886c64();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("containerList size: ");
            java.util.List m56409x97891cf72 = a6Var.m56409x97891cf7();
            sb6.append(m56409x97891cf72 != null ? java.lang.Integer.valueOf(m56409x97891cf72.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
            a6Var.m56423xd4b4a5a1(l1Var.f309585t);
            a6Var.m56421x73095078(j91Var.m75934xbce7f2f(2));
            a6Var.m56419xdac5ee4d(z17);
        }
        return a6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13883xc81866dd c13883xc81866dd = this.f190043d;
        db2.l1 l1Var = new db2.l1(c13883xc81866dd.m56354xfe9224be(), c13883xc81866dd.f189107e, c13883xc81866dd.m56357x44e5026c(), 0, c13883xc81866dd.f189106d);
        l1Var.f309585t = 2;
        return l1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13883xc81866dd c13883xc81866dd = this.f190043d;
        db2.l1 l1Var = new db2.l1(c13883xc81866dd.m56354xfe9224be(), c13883xc81866dd.f189107e, c13883xc81866dd.m56357x44e5026c(), 0, c13883xc81866dd.f189106d);
        l1Var.f309585t = 0;
        return l1Var;
    }
}
