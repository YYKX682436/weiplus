package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class m90 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f195006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f195007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 f195008c;

    public m90(yz5.a aVar, cm2.m0 m0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var) {
        this.f195006a = aVar;
        this.f195007b = m0Var;
        this.f195008c = ea0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean b17 = fVar.b();
        yz5.a aVar = this.f195006a;
        if (b17) {
            r45.zs1 zs1Var = (r45.zs1) fVar.f152151d;
            if (!((zs1Var != null ? zs1Var.m75934xbce7f2f(1) : null) == null)) {
                r45.y23 y23Var = new r45.y23();
                r45.zs1 zs1Var2 = (r45.zs1) fVar.f152151d;
                byte[] g17 = (zs1Var2 == null || (m75934xbce7f2f = zs1Var2.m75934xbce7f2f(1)) == null) ? null : m75934xbce7f2f.g();
                if (g17 != null) {
                    try {
                        y23Var.mo11468x92b714fd(g17);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                cm2.m0 m0Var = this.f195007b;
                m0Var.n(y23Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var = this.f195008c;
                so2.j5 j5Var = ((mm2.f6) ea0Var.P0(mm2.f6.class)).f410582w;
                cm2.m0 m0Var2 = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
                if (m0Var2 != null && m0Var2.f124902w == y23Var.m75942xfb822ef2(0)) {
                    ((mm2.f6) ea0Var.P0(mm2.f6.class)).c7(m0Var);
                    ea0Var.y1().n(ea0Var.S0(), m0Var);
                }
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                return jz5.f0.f384359a;
            }
        }
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
