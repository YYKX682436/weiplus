package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.u f246230a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.u();

    public final void a(java.util.List list, int i17) {
        java.util.List list2 = list;
        int i18 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertAd", "com.tencent.mm.plugin.sns.model.AdOpStorageLogic");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MomentAds.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdPullStorageLogic", "insert, forbid ad");
            ca4.n0.b(1697, 78);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertAd", "com.tencent.mm.plugin.sns.model.AdOpStorageLogic");
            return;
        }
        if (list2 == null || i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdPullStorageLogic", "adlist is " + list + ", createTime is " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertAd", "com.tencent.mm.plugin.sns.model.AdOpStorageLogic");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adList[");
        int size = list.size();
        int i19 = 0;
        boolean z17 = false;
        while (i19 < size) {
            r45.g5 g5Var = (r45.g5) list2.get(i19);
            if (g5Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullStorageLogic", "ad is null");
            } else {
                r45.f76 f76Var = g5Var.f456418d;
                if (f76Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullStorageLogic", "item.SnsADObject is null");
                } else if (f76Var.f455609d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullStorageLogic", "item.SnsADObject.SnsObject is null");
                } else {
                    java.lang.String g17 = x51.j1.g(g5Var.f456419e);
                    java.lang.String g18 = x51.j1.g(g5Var.f456418d.f455610e);
                    java.lang.String f17 = x51.j1.f(g5Var.f456418d.f455609d.f38990xb6613a90);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(g17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullStorageLogic", "insert ad, skXml %s, adXml %s, snsXml %s", g17, g18, f17);
                    l44.h3.f(c17902x72cc1771.f38080x66a5f3c7);
                    java.lang.String t07 = ca4.z0.t0(g5Var.f456418d.f455609d.Id);
                    try {
                        sb6.append(t07);
                        sb6.append(",");
                        sb6.append(c17902x72cc1771.f38086x8cc202f1);
                        sb6.append("|");
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPullStorageLogic", "log exp=" + e17);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullStorageLogic", "insert ad, create adinfo time  " + i18 + " pos " + c17902x72cc1771.f38086x8cc202f1);
                    int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / ((long) 1000));
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("insert ad, gettime ");
                    sb7.append(currentTimeMillis);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullStorageLogic", sb7.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.o(g5Var, i18, currentTimeMillis);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(g5Var.f456418d.f455609d.Id);
                    if (y07 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullStorageLogic", "insert ad, snsId=" + t07 + ", exposureTime=" + y07.f67600xa9e31799 + ", , expouseCnt=" + y07.f67599x919325c3 + ", isExposued=" + y07.m70315x5f796633() + ", adDupSnsIdDel=" + c17902x72cc1771.f38076xa2aa5554);
                        if (c17902x72cc1771.f38076xa2aa5554 == 1) {
                            l44.b0.d(y07);
                        }
                        r45.o3 m70308xe0bbc4b6 = y07.m70308xe0bbc4b6();
                        if (m70308xe0bbc4b6 == null) {
                            m70308xe0bbc4b6 = new r45.o3();
                        }
                        r45.mo5 mo5Var = g5Var.f456421g;
                        m70308xe0bbc4b6.f463394d = mo5Var;
                        if (mo5Var != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullStorageLogic", "insert ad, update timeline remind info , aid64:%d, aid:%d", java.lang.Long.valueOf(mo5Var.f462251i), java.lang.Integer.valueOf(m70308xe0bbc4b6.f463394d.f462246d));
                        }
                        y07.m70327x17925e2a(m70308xe0bbc4b6);
                        y07.m70325x5db51809();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().mo11260x413cb2b4(y07);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70298xd15b2ed8 = y07.m70298xd15b2ed8();
                        if (n74.l0.a(m70298xd15b2ed8)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().k(m70298xd15b2ed8);
                            z17 = true;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.u(g5Var.f456418d.f455609d.Id, c17902x72cc1771);
                    try {
                        java.lang.String t08 = ca4.z0.t0(g5Var.f456418d.f455609d.Id);
                        if (!n74.c1.b(c17902x72cc1771, t08)) {
                            n74.c1.c(1, t08, c17902x72cc1771, g5Var.f456418d.f455609d, y07.m70298xd15b2ed8());
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPullStorageLogic", th6.toString());
                    }
                }
            }
            i19++;
            list2 = list;
            i18 = i17;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullStorageLogic", "the on line video preload start in AdSnsInfoStorageLogic ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().t();
        }
        try {
            sb6.append("],  ");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullStorageLogic", "insert ad, " + ((java.lang.Object) sb6));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPullStorageLogic", "log exp=" + e18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertAd", "com.tencent.mm.plugin.sns.model.AdOpStorageLogic");
    }
}
