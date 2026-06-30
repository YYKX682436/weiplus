package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class kd implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ld f228636a;

    public kd(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ld ldVar) {
        this.f228636a = ldVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] respone : " + fVar);
        if (fVar.f152151d != null && fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] resp.effectiveEndTime: " + ((r45.wd3) fVar.f152151d).f470610e);
            if (((r45.wd3) fVar.f152151d).f470610e > 0) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_EFFECTIVEENDTIME_INT_SYNC, java.lang.Integer.valueOf(((r45.wd3) fVar.f152151d).f470610e));
            }
            r45.p90 p90Var = ((r45.wd3) fVar.f152151d).f470609d;
            if (p90Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] resp type : " + p90Var.f464404h + ", is_show：" + p90Var.f464400d + "、version: " + p90Var.f464403g);
                boolean z17 = p90Var.f464400d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ld ldVar = this.f228636a;
                if (z17) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ld.O6(ldVar, (r45.wd3) resp);
                } else {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = ldVar.m158354x19263085();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
                    r45.lm5 g76 = activityC16373x8a110f13 != null ? activityC16373x8a110f13.g7() : null;
                    if (g76 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g76.f461156e) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p90Var.f464403g)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] is_show: false， local version: " + g76.f461156e);
                        if (r26.i0.q(g76.f461156e, p90Var.f464403g, false, 2, null)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] is_show: false, version equal to local reddot, handle it");
                            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp2 = fVar.f152151d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp2, "resp");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ld.O6(ldVar, (r45.wd3) resp2);
                        }
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] svr reddot info is null");
            }
        }
        return null;
    }
}
