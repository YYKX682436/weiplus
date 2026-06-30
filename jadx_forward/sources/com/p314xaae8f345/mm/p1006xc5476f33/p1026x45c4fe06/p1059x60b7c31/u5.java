package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes11.dex */
public final class u5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34898x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34899x24728b = "gamelifeManager";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        nc1.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null || jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("functionType", -1);
        nc1.i.f417633d.getClass();
        nc1.i[] m149380xcee59d22 = nc1.i.m149380xcee59d22();
        int length = m149380xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                iVar = null;
                break;
            }
            iVar = m149380xcee59d22[i18];
            iVar.getClass();
            if (optInt == 0) {
                break;
            } else {
                i18++;
            }
        }
        if ((iVar != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s5.f164457a[iVar.ordinal()] : -1) == 1) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r5.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t5(e9Var, i17, this));
        } else {
            e9Var.a(i17, "fail wrong functiontype");
        }
    }
}
