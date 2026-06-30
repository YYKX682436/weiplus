package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class b2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13862x71aee939 f189249d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13862x71aee939 c13862x71aee939) {
        this.f189249d = c13862x71aee939;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13862x71aee939 c13862x71aee939 = this.f189249d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c2(c13862x71aee939, 0, 0, "");
        c2Var.m56423xd4b4a5a1(1000);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13862x71aee939.m56353x743e55cc();
        if (m56353x743e55cc != null && (arrayList = m56353x743e55cc.f189833a) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "fetchInit: use old data list, size: " + arrayList.size());
            c2Var.m56420x2a5f836b(arrayList);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc2 = c13862x71aee939.m56353x743e55cc();
            c2Var.m56421x73095078(m56353x743e55cc2 != null ? m56353x743e55cc2.f189834b : null);
            java.lang.Object a07 = kz5.n0.a0(arrayList, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = a07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) a07 : null;
            if (abstractC14490x69736cb5 != null) {
                c13862x71aee939.f188986d = abstractC14490x69736cb5.mo2128x1ed62e84();
                java.lang.String m59276x6c285d75 = abstractC14490x69736cb5.getFeedObject().m59276x6c285d75();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m59276x6c285d75, "<set-?>");
                c13862x71aee939.f188987e = m59276x6c285d75;
            }
        }
        return c2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        yz5.p pVar;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13862x71aee939 c13862x71aee939 = this.f189249d;
        if (i17 == 0 && i18 == 0) {
            r45.h51 h51Var = fVar instanceof r45.h51 ? (r45.h51) fVar : null;
            if (h51Var != null && (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h51Var.m75936x14adae67(2)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 1));
                p17.t1(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c2(c13862x71aee939, i17, i18, str);
                c2Var.m56420x2a5f836b(kz5.b0.c(p17));
                c2Var.m56423xd4b4a5a1(0);
                return c2Var;
            }
        } else if (!hc2.p.b(i17, i18) && (pVar = c13862x71aee939.f188988f) != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), str);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13862x71aee939 c13862x71aee939 = this.f189249d;
        long j17 = c13862x71aee939.f188986d;
        java.lang.String str = c13862x71aee939.f188987e;
        r45.qt2 m56354xfe9224be = c13862x71aee939.m56354xfe9224be();
        return new db2.g4(j17, str, m56354xfe9224be != null ? m56354xfe9224be.m75939xb282bd08(5) : 0, 2, "", true, null, null, 0L, null, false, false, null, c13862x71aee939.m56354xfe9224be(), 0, null, false, null, null, null, null, null, 0, 0, null, null, true, null, null, 469753792, null);
    }
}
