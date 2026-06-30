package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes8.dex */
public class o0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PbAppInfoManager", "errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.f178844b = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n0((c02.b) oVar.f152244b.f152233a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.f178843a;
            if (p0Var != null) {
                p0Var.a(true);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.p0 p0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.f178843a;
            if (p0Var2 != null) {
                p0Var2.a(false);
            }
        }
        return 0;
    }
}
