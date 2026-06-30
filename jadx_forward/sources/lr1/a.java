package lr1;

/* loaded from: classes4.dex */
public final class a implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final lr1.a f402169d = new lr1.a();

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommonStrategyManager", "fetchBizCommonStrategy callback %d/%d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("brandService", gm0.j1.b().h(), 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J2, "getAccountAwareMMKV(...)");
        J2.putLong("biz_common_strategy_last_time", java.lang.System.currentTimeMillis());
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizCommonStrategyResp");
            r45.fk fkVar = (r45.fk) fVar;
            r45.pm pmVar = fkVar.f455936d;
            if (pmVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommonStrategyManager", "updateBizCStrategyControlInfo RefreshInterval = %d", java.lang.Integer.valueOf(pmVar.f464706d));
                if (pmVar.f464706d > 0) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("brandService", gm0.j1.b().h(), 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J3, "getAccountAwareMMKV(...)");
                    J3.putLong("biz_common_strategy_fetch_interval", pmVar.f464706d);
                }
            }
            r45.ti4 ti4Var = fkVar.f455937e;
            int i19 = ti4Var != null ? ti4Var.f468005d : 0;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("biz_masssend", gm0.j1.b().h(), 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J4, "getAccountAwareMMKV(...)");
            J4.A("BizMassSendHideFlag", i19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMassSendUtil", "updateMassSendStrategy newHideFlag = " + i19);
        }
        return 0;
    }
}
