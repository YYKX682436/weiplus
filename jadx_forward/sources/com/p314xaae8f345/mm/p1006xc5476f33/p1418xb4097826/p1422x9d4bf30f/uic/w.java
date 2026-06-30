package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class w implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 f183494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e21 f183495e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 c13667xc5da9466, r45.e21 e21Var) {
        this.f183494d = c13667xc5da9466;
        this.f183495e = e21Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.z()) {
            if (!this.f183494d.X6()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityParticipateUIC", "showParticipateBottomSheet: no maas");
                g4Var.a(1001, com.p314xaae8f345.mm.R.C30867xcad56011.f571940u4);
                g4Var.a(1002, com.p314xaae8f345.mm.R.C30867xcad56011.f571948uc);
                return;
            }
            r45.e21 e21Var = this.f183495e;
            r45.sz6 sz6Var = e21Var != null ? (r45.sz6) e21Var.m75936x14adae67(26) : null;
            int m75939xb282bd08 = sz6Var != null ? sz6Var.m75939xb282bd08(3) : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityParticipateUIC", "showParticipateBottomSheet: maas entryBit: " + m75939xb282bd08);
            if ((m75939xb282bd08 & 1) > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityParticipateUIC", "showParticipateBottomSheet: maas camera enable");
                g4Var.a(1001, com.p314xaae8f345.mm.R.C30867xcad56011.f571940u4);
            }
            if ((m75939xb282bd08 & 2) > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityParticipateUIC", "showParticipateBottomSheet: maas album enable");
                g4Var.a(1002, com.p314xaae8f345.mm.R.C30867xcad56011.f571948uc);
            }
            g4Var.a(1031, com.p314xaae8f345.mm.R.C30867xcad56011.f9t);
        }
    }
}
