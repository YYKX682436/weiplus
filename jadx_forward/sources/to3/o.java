package to3;

/* loaded from: classes9.dex */
public class o implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to3.q f502504d;

    public o(to3.q qVar) {
        this.f502504d = qVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if ((m1Var instanceof wo3.e) && i17 == 0 && i18 == 0) {
            wo3.e eVar = (wo3.e) m1Var;
            int i19 = eVar.f529682e;
            to3.q.f502507d = i19;
            if (i19 == 0) {
                to3.q.f502507d = 5000;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineGetMsgLogic", "NetSceneOfflineGetMsg: ackkey: %s, appMsg: %s", eVar.f529683f, eVar.f529681d);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f529681d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f529683f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineGetMsgLogic", "OfflineGetMsgLogic msg is null");
            } else if (to3.q.d(eVar.f529683f, eVar.f529681d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineGetMsgLogic", "from cgi");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(eVar.f529681d, "sysmsg", null) == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(135L, 71L, 1L, true);
                wo3.c0 Ri = to3.c0.Ai().Ri();
                java.lang.String str2 = eVar.f529681d;
                Ri.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineMsgManager", "notifyMsgFromCgi");
                if (!android.text.TextUtils.isEmpty(str2)) {
                    java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str2, "sysmsg", null);
                    int i27 = -1;
                    if (d17 != null) {
                        i27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1);
                    }
                    if (i27 != 7 && i27 != 10) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineMsgManager", "process msg from pull");
                        Ri.h(str2);
                        Ri.a(str2, false);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineGetMsgLogic", "mIntercal=" + to3.q.f502507d);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f502504d.f502509b;
            long j17 = (long) to3.q.f502507d;
            b4Var.c(j17, j17);
        }
    }
}
