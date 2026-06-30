package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class i8 implements db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m8 f189483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f189484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f189485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fp0.r f189486g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 f189487h;

    public i8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m8 m8Var, java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var, fp0.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158) {
        this.f189483d = m8Var;
        this.f189484e = obj;
        this.f189485f = n0Var;
        this.f189486g = rVar;
        this.f189487h = c13917xbf9dc158;
    }

    @Override // db2.u3
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d info, int i17) {
        java.util.List m56409x97891cf7;
        so2.j5 j5Var;
        boolean z17;
        r45.kv0 kv0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String m56464xb5886c64 = this.f189483d.m56464xb5886c64();
        java.lang.Object obj = this.f189484e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n8 n8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n8) obj;
        n8Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, "[call] onFetchDone... pullType=" + i17 + ", isPreloadMore=false");
        int i18 = 0;
        boolean z18 = info.f189303h != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o8 o8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o8(info.f189296a, info.f189297b, info.f189298c, null, 8, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209269hc).mo141623x754a37bb()).r()).intValue();
        java.util.LinkedList linkedList = info.f189300e;
        int i19 = 4;
        if (intValue != 0) {
            int i27 = 0;
            for (java.lang.Object obj2 : linkedList) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var2 = (so2.j5) obj2;
                if ((j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && i27 % 2 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2;
                    r45.dm2 m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
                    if (m76806xdef68064 != null) {
                        r45.dm2 m76806xdef680642 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
                        m76806xdef68064.set(2, java.lang.Integer.valueOf((m76806xdef680642 != null ? m76806xdef680642.m75939xb282bd08(2) : i18) | i19));
                    }
                    r45.dm2 m76806xdef680643 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
                    if (m76806xdef680643 != null) {
                        m76806xdef680643.set(23, new r45.om2());
                    }
                    r45.dm2 m76806xdef680644 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
                    r45.om2 om2Var = m76806xdef680644 != null ? (r45.om2) m76806xdef680644.m75936x14adae67(23) : null;
                    if (om2Var != null) {
                        om2Var.set(1, java.lang.Integer.valueOf(i18));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209269hc).mo141623x754a37bb()).r()).intValue() == 2) {
                        r45.dm2 m76806xdef680645 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
                        r45.om2 om2Var2 = m76806xdef680645 != null ? (r45.om2) m76806xdef680645.m75936x14adae67(23) : null;
                        if (om2Var2 != null) {
                            i18 = 0;
                            om2Var2.set(0, 1);
                        }
                    }
                    i18 = 0;
                }
                i27 = i28;
                i19 = 4;
            }
        }
        o8Var.m56420x2a5f836b(linkedList);
        o8Var.m56423xd4b4a5a1(i17);
        o8Var.m56419xdac5ee4d(z18);
        o8Var.m56422x9a5c5d15(info.f189304i);
        o8Var.f189763a = info.f189308m;
        o8Var.f189764b = null;
        db2.c3 c3Var = info.f189311p;
        n8Var.f189747c = (c3Var == null || (kv0Var = (r45.kv0) c3Var.d().m75936x14adae67(4)) == null) ? 0L : kv0Var.m75942xfb822ef2(5);
        db2.c3 c3Var2 = info.f189311p;
        n8Var.f189748d = c3Var2 != null ? (r45.nx2) c3Var2.d().m75936x14adae67(30) : null;
        o8Var.m56425xf28d7bcd(obj);
        db2.c3 c3Var3 = info.f189311p;
        o8Var.f189765c = c3Var3 != null ? (r45.px2) c3Var3.m75936x14adae67(24) : null;
        db2.c3 c3Var4 = info.f189311p;
        o8Var.f189766d = c3Var4 != null ? (r45.gx2) c3Var4.m75936x14adae67(26) : null;
        db2.c3 c3Var5 = info.f189311p;
        o8Var.f189767e = c3Var5 != null ? (r45.jt2) c3Var5.m75936x14adae67(27) : null;
        o8Var.m56421x73095078(info.f189309n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = this.f189487h;
        if ((i17 == 0 || i17 == 1) && (m56409x97891cf7 = o8Var.m56409x97891cf7()) != null && (j5Var = (so2.j5) kz5.n0.Z(m56409x97891cf7)) != null && ((z17 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5))) {
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                if (abstractC14490x69736cb52 != null) {
                    abstractC14490x69736cb52.G1(3);
                }
            } else if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                if (abstractC14490x69736cb53 != null) {
                    abstractC14490x69736cb53.G1(4);
                }
            }
            yz5.p pVar = c13917xbf9dc158.f189184g;
            if (pVar != null) {
                pVar.mo149xb9724478("onFetchDone", j5Var);
            }
        }
        java.util.List m56409x97891cf72 = o8Var.m56409x97891cf7();
        if (m56409x97891cf72 != null) {
            r45.qt2 m56354xfe9224be = c13917xbf9dc158.m56354xfe9224be();
            if (m56354xfe9224be != null) {
                i18 = m56354xfe9224be.m75939xb282bd08(5);
            }
            c13917xbf9dc158.f(i18, m56409x97891cf72);
        }
        this.f189485f.mo55587xb461ee3d(o8Var);
        this.f189486g.b(fp0.u.f346823f);
    }
}
