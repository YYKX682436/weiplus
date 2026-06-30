package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class c implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3541x8bac31f {
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3541x8bac31f
    /* renamed from: city */
    public java.lang.String mo28192x2e996b() {
        r45.h67 h67Var = new r45.h67();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        try {
            h67Var.mo11468x92b714fd(str.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
            return h67Var.f457419g;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("KindaUserInfoServiceImpl", "parse cacheString exp, " + e17.getLocalizedMessage());
            return "";
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3541x8bac31f
    /* renamed from: localBalance */
    public long mo28193x967008f1() {
        return ((java.lang.Long) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3541x8bac31f
    /* renamed from: province */
    public java.lang.String mo28194xc5242b30() {
        r45.h67 h67Var = new r45.h67();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        try {
            h67Var.mo11468x92b714fd(str.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
            return h67Var.f457418f;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("KindaUserInfoServiceImpl", "parse cacheString exp, " + e17.getLocalizedMessage());
            return "";
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3541x8bac31f
    /* renamed from: updateBalance */
    public void mo28195x929e09d3(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaUserInfoServiceImpl", "wallet balance: %s", java.lang.Long.valueOf(j17));
        at4.v1 r17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().r();
        r17.f67069x257bda7b = j17;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BALANCE_LONG_SYNC, java.lang.Long.valueOf(r17.f67069x257bda7b));
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().H(r17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3541x8bac31f
    /* renamed from: updateLqtBalance */
    public void mo28196x95b681f6(long j17) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_LQT_LONG_SYNC, java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3541x8bac31f
    /* renamed from: updateUserInfo */
    public void mo28197x23f6ab02(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaUserInfoService", "updateUserInfo");
    }
}
