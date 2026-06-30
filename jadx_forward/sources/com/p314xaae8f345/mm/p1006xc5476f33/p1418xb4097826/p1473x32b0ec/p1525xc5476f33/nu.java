package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nu extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv f195211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar) {
        super(1);
        this.f195211d = ivVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.String m76197x6c03c64c;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa6;
        java.lang.String m76197x6c03c64c2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa7;
        r45.xn1 xn1Var = (r45.xn1) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = this.f195211d;
        boolean z17 = ivVar.z1();
        java.lang.String str = ivVar.f194549r;
        java.lang.String str2 = null;
        if (z17 || ivVar.A1()) {
            java.lang.String str3 = "";
            if (ivVar.f194548q.mo11219xd0598cf8() == 0) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f409067r, "", 0);
            }
            ivVar.f194559y0 = xn1Var;
            boolean c27 = zl2.r4.f555483a.c2((xn1Var == null || (c19782x23db1cfa5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa5.m76197x6c03c64c());
            int m75939xb282bd08 = xn1Var != null ? xn1Var.m75939xb282bd08(7) : 1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemClick username:");
            r45.xn1 xn1Var2 = ivVar.f194559y0;
            sb6.append((xn1Var2 == null || (c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa4.m76197x6c03c64c());
            sb6.append(", nickname:");
            r45.xn1 xn1Var3 = ivVar.f194559y0;
            sb6.append((xn1Var3 == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa3.m76184x8010e5e4());
            sb6.append(", disableComment:");
            r45.xn1 xn1Var4 = ivVar.f194559y0;
            sb6.append(xn1Var4 != null ? java.lang.Integer.valueOf(xn1Var4.m75939xb282bd08(2)) : null);
            sb6.append(",isMySelf:");
            sb6.append(c27);
            sb6.append(",userRoleType:");
            sb6.append(m75939xb282bd08);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (ivVar.z1() || ivVar.A1()) {
                r45.xn1 xn1Var5 = ivVar.f194559y0;
                if (xn1Var5 != null && (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var5.m75936x14adae67(0)) != null) {
                    str2 = c19782x23db1cfa2.m76197x6c03c64c();
                }
                if (str2 != null && str2.length() != 0) {
                    r4 = false;
                }
                if (!r4 && m75939xb282bd08 != 4) {
                    r45.xn1 xn1Var6 = ivVar.f194559y0;
                    if (xn1Var6 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var6.m75936x14adae67(0)) != null && (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) != null) {
                        str3 = m76197x6c03c64c;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv.w1(ivVar, str3);
                }
            } else if (!c27) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv.v1(ivVar, m75939xb282bd08);
            }
        } else {
            zl2.r4 r4Var = zl2.r4.f555483a;
            if (xn1Var != null && (c19782x23db1cfa7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
                str2 = c19782x23db1cfa7.m76197x6c03c64c();
            }
            if (r4Var.c2(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Clicked member is myself. Do not go to profile");
            } else {
                if ((xn1Var != null && xn1Var.m75939xb282bd08(7) == 3) && (c19782x23db1cfa6 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null && (m76197x6c03c64c2 = c19782x23db1cfa6.m76197x6c03c64c()) != null) {
                    dk2.q4 q4Var = dk2.q4.f315471a;
                    android.content.Context context = ivVar.R0().getContext();
                    gk2.e S0 = ivVar.S0();
                    android.content.Context context2 = ivVar.R0().getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    dk2.q4.j(q4Var, context, S0, false, m76197x6c03c64c2, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).c(zy2.ra.class))).V6(), false, null, 96, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
