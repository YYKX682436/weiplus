package lr1;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final lr1.b f402173a = new lr1.b();

    public final void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("brandService", gm0.j1.b().h(), 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J2, "getAccountAwareMMKV(...)");
        long abs = java.lang.Math.abs(java.lang.System.currentTimeMillis() - J2.getLong("biz_common_strategy_last_time", 0L));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("brandService", gm0.j1.b().h(), 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J3, "getAccountAwareMMKV(...)");
        long j17 = J3.getLong("biz_common_strategy_fetch_interval", 1800000L);
        if (j17 < 60000) {
            j17 = 60000;
        }
        if (abs < j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommonStrategyManager", "fetchBizCommonStrategy delta < interval, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommonStrategyManager", "fetchBizCommonStrategy %d", java.lang.Long.valueOf(abs));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ek();
        lVar.f152198b = new r45.fk();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/bizattr/bizstrategy";
        lVar.f152200d = 2723;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizCommonStrategyReq");
        java.util.LinkedList linkedList = ((r45.ek) fVar).f455107d;
        r45.dk dkVar = new r45.dk();
        dkVar.f454066d = 1;
        dkVar.f454067e = 1;
        linkedList.add(dkVar);
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, lr1.a.f402169d, false);
    }
}
