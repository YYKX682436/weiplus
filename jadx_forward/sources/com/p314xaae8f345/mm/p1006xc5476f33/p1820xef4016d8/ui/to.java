package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class to extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6(boolean z17) {
        if (P6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[doRefreshSourceMac] do DefaultRedPacketSkinCgi");
            Q6(5, z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[doRefreshSourceMac] do config");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x19263085).c7(z17);
        }
    }

    public final boolean P6() {
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m.f226967e.d();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [jz5.f0] */
    public final void Q6(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0 c17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] show loading: " + z17);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = null;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] need show loading");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 activityC16391xf093c1e3 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x19263085 : null;
            if (activityC16391xf093c1e3 != null) {
                activityC16391xf093c1e3.Z6();
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 activityC16391xf093c1e32 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630852 : null;
            if (activityC16391xf093c1e32 != null) {
                activityC16391xf093c1e32.f228106s = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.F(m158354x19263085(), true);
            }
        }
        if (P6() && (c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m.f226967e.c()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p0 p0Var = c17.f226897d;
            if (p0Var != null) {
                int i18 = p0Var.f227069s;
                if (i18 <= 0 || i18 <= com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.h() / 1000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] local cache expired");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] has local cache");
                    gVar2 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(pm0.v.D(c17));
                }
                gVar = gVar2;
                gVar2 = jz5.f0.f384359a;
            } else {
                gVar = null;
            }
            if (gVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] respCache.showSource is null");
            }
            gVar2 = gVar;
        }
        if (i17 == 0) {
            java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra("key_username");
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
            if (c01.e2.S(stringExtra)) {
                i17 = 4;
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630853).f228090l1 == 3) {
                    i17 = 3;
                } else {
                    ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                    i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s() ? 0 : 2;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] do get cgi, scene: " + i17 + " （0：unknown、 1：h5、 2：normal、 3：Live、 4: union、 5：refresh）");
        pq5.g l17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e(gVar2, i17).l();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630854, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
        l17.f((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630854);
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.so(z17, this));
    }
}
