package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class pp implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq f195459d;

    public pp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar) {
        this.f195459d = dqVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.t5 t5Var = (mm2.t5) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "receive restrictEvent: " + t5Var + " quotaSendGiftData: " + this.f195459d.Z);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar = this.f195459d;
        mm2.s5 s5Var = dqVar.Z;
        if (s5Var == null) {
            return;
        }
        if (t5Var instanceof mm2.r5) {
            dqVar.F1();
            return;
        }
        if (t5Var instanceof mm2.u5 ? true : t5Var instanceof mm2.q5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar = dqVar.N;
            if (tVar != null) {
                tVar.f197224m = true;
            }
            java.lang.String str = s5Var.f410950c.f315000b;
            dqVar.f193863w = str;
            java.util.Map map = dqVar.K;
            if (str == null) {
                str = "";
            }
            ((java.util.HashMap) map).put(str, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hp hpVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.f193851x1;
            java.lang.String str2 = s5Var.f410948a;
            int i17 = s5Var.f410949b;
            java.lang.String str3 = s5Var.f410950c.f315000b;
            int i18 = s5Var.f410951d;
            boolean z17 = s5Var.f410952e;
            hpVar.a(str2, i17, str3, i18, z17, dqVar.y1(dqVar.R, s5Var.f410948a, z17), null);
            if (dk2.u7.f315714a.e(s5Var.f410948a) != null) {
                ((mm2.v5) dqVar.P0(mm2.v5.class)).O6((((int) r14.P0()) * (s5Var.f410952e ? s5Var.f410951d : 1)) / 10.0f);
            }
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.G0).mo141623x754a37bb()).r()).intValue() != 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.D1(dqVar, s5Var.f410948a, s5Var.f410949b, s5Var.f410950c, s5Var.f410952e, false, 16, null);
                return;
            }
            boolean z18 = s5Var.f410952e;
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.D1(dqVar, s5Var.f410948a, s5Var.f410949b, s5Var.f410950c, z18, false, 16, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.D1(dqVar, s5Var.f410948a, 1, s5Var.f410950c, z18, false, 16, null);
            }
        }
    }
}
