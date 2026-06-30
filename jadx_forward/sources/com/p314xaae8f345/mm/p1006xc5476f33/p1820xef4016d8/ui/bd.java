package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class bd {
    public bd(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (!resp.f226901h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[handleResponseAndDoCheckNeedInterrupt] use old logic");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_STRING_SYNC, "");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_USE_NEW_LOGIC_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m.f226967e;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_USE_NEW_LOGIC_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        if (resp.f226902i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[handleResponseAndDoCheckNeedInterrupt] use local cache");
            return true;
        }
        lVar.f(resp);
        return false;
    }
}
