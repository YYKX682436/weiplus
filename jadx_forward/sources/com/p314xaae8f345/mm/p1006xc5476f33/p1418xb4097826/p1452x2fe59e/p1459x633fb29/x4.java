package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class x4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13876xef737654 f189982d;

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13876xef737654 c13876xef737654) {
        this.f189982d = c13876xef737654;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w4 w4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w4(0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13876xef737654 c13876xef737654 = this.f189982d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13876xef737654.m56353x743e55cc();
        w4Var.m56420x2a5f836b(m56353x743e55cc != null ? m56353x743e55cc.f189833a : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc2 = c13876xef737654.m56353x743e55cc();
        w4Var.m56421x73095078(m56353x743e55cc2 != null ? m56353x743e55cc2.f189834b : null);
        return w4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (!(iVar instanceof bq.w) || !(fVar instanceof r45.pr0)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.pr0) fVar).f464857f == 0) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w4 w4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w4(i17, i18, str);
        r45.pr0 pr0Var = (r45.pr0) fVar;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> object = pr0Var.f464855d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(object, "object");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(object, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : object) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(cu2.u.f303974a.p(h90Var.a(c19792x256d2725, 73728)));
        }
        w4Var.m56420x2a5f836b(arrayList);
        cu2.t tVar = cu2.u.f303974a;
        java.util.LinkedList object2 = pr0Var.f464855d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(object2, "object");
        tVar.j(object2, 73728, this.f189982d.m56354xfe9224be());
        bq.w wVar = (bq.w) iVar;
        if (wVar.f105070p != 2) {
            java.util.List m56409x97891cf7 = w4Var.m56409x97891cf7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m56409x97891cf7, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
            tVar.m(m56409x97891cf7, 73728, "", true);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List m56409x97891cf72 = w4Var.m56409x97891cf7();
        sb6.append(m56409x97891cf72 != null ? java.lang.Integer.valueOf(m56409x97891cf72.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberTimelineLoader", sb6.toString());
        w4Var.m56423xd4b4a5a1(wVar.f105070p);
        w4Var.m56421x73095078(pr0Var.f464856e);
        w4Var.m56419xdac5ee4d(z17);
        return w4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13876xef737654 c13876xef737654 = this.f189982d;
        return new bq.w(c13876xef737654.m56354xfe9224be(), c13876xef737654.f189053d, c13876xef737654.f189054e, c13876xef737654.m56357x44e5026c(), c13876xef737654.f189055f, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13876xef737654 c13876xef737654 = this.f189982d;
        return new bq.w(c13876xef737654.m56354xfe9224be(), c13876xef737654.f189053d, c13876xef737654.f189054e, c13876xef737654.m56357x44e5026c(), c13876xef737654.f189055f, 0);
    }
}
