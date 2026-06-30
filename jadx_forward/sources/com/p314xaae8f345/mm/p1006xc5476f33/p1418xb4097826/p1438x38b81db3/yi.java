package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class yi implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f186554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f186555b;

    public yi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar, so2.n1 n1Var) {
        this.f186554a = ojVar;
        this.f186555b = n1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        java.lang.String m76197x6c03c64c;
        java.lang.String m76829x97edf6c0;
        cw2.da daVar = this.f186554a.C;
        java.lang.String str2 = null;
        java.lang.Object m122869xb5887064 = daVar != null ? daVar.m122869xb5887064() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi giVar = m122869xb5887064 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi) m122869xb5887064 : null;
        so2.n1 n1Var = this.f186555b;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = n1Var.f492024e;
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
        if (c19792x256d2725 != null && (m76829x97edf6c0 = c19792x256d2725.m76829x97edf6c0()) != null) {
            str2 = m76829x97edf6c0;
        } else if (giVar != null && (abstractC14490x69736cb5 = giVar.f185022b) != null) {
            str2 = abstractC14490x69736cb5.g0();
        }
        lVarArr[1] = new jz5.l("session_buffer", str2);
        java.lang.String str3 = n1Var.f492025f;
        java.lang.String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[2] = new jz5.l("author_finder_username", str3);
        if (c19792x256d2725 != null && (m76760x76845fea = c19792x256d2725.m76760x76845fea()) != null && (m76197x6c03c64c = m76760x76845fea.m76197x6c03c64c()) != null) {
            str4 = m76197x6c03c64c;
        }
        lVarArr[3] = new jz5.l("card_finder_username", str4);
        lVarArr[4] = new jz5.l("card_index", java.lang.Integer.valueOf(giVar != null ? giVar.f185023c : 0));
        return kz5.c1.k(lVarArr);
    }
}
