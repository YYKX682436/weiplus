package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class jd extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.bd f228589d = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.bd(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6(boolean z17) {
        if (P6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[doRefreshSourceMac] do DefaultRedPacketSkinCgi");
            Q6(5, z17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[doRefreshSourceMac] do config");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        if (activityC16373x8a110f13 != null) {
            activityC16373x8a110f13.c7(z17);
        }
    }

    public final boolean P6() {
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m.f226967e.d();
        }
        return false;
    }

    public final void Q6(int i17, boolean z17) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0 c17;
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] show loading: " + z17);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] need show loading");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
            if (activityC16373x8a110f13 != null) {
                activityC16373x8a110f13.Z6();
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
            if (activityC16373x8a110f132 != null) {
                activityC16373x8a110f132.f227808s = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.F(m158354x19263085(), true);
            }
        }
        if (!P6() || (c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m.f226967e.c()) == null) {
            gVar = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p0 p0Var = c17.f226897d;
            if (p0Var != null) {
                int i18 = p0Var.f227069s;
                if (i18 <= 0 || i18 <= com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.h() / 1000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] local cache expired");
                    gVar = null;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] has local cache");
                    gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(pm0.v.D(c17));
                }
                f0Var = jz5.f0.f384359a;
            } else {
                gVar = null;
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] respCache.showSource is null");
            }
        }
        if (i17 == 0) {
            java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra("key_username");
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
            if (c01.e2.S(stringExtra)) {
                i17 = 4;
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f133 = m158354x192630853 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630853 : null;
                if (activityC16373x8a110f133 != null && activityC16373x8a110f133.Y == 3) {
                    i17 = 3;
                } else {
                    ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                    i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s() ? 0 : 2;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] do get cgi, scene: " + i17 + " （0：unknown、 1：h5、 2：normal、 3：Live、 4: union、 5：refresh）");
        pq5.g l17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e(gVar, i17).l();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = m158354x19263085();
        l17.f(m158354x192630854 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630854 : null);
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.id(z17, this));
    }
}
