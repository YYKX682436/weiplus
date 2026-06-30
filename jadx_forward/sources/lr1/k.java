package lr1;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final lr1.k f402215a = new lr1.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f402216b = jz5.h.b(lr1.h.f402204d);

    public static final void a() {
        lr1.k kVar = f402215a;
        long abs = java.lang.Math.abs(java.lang.System.currentTimeMillis() - kVar.b().getLong("biz_time_line_strategy_last_time", 0L));
        if (abs < kVar.b().getLong("biz_time_line_fetch_interval", 1800000L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizStrategyManager", "fetchBizStrategy delta < interval, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizStrategyManager", "fetchBizStrategy %d, requestType: %d", java.lang.Long.valueOf(abs), 32718762);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.qm();
        lVar.f152198b = new r45.rm();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/timeline/bizstrategy";
        lVar.f152200d = 1806;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizStrategyReq");
        ((r45.qm) fVar).f465623d = 32718762;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, lr1.g.f402195d, false);
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f402216b).mo141623x754a37bb();
    }
}
