package l44;

/* loaded from: classes4.dex */
public abstract class o4 {
    public static java.util.List a(java.util.List list) {
        java.util.List d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ConsecutiveAdDataImproveHelper", "deleteConsecutiveAd, cursor==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        if (f()) {
            d17 = c(list);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDelConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDelConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            d17 = d(list);
        }
        if (a84.b0.b(d17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return list;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (a84.b0.b(d17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = d17.iterator();
            while (it.hasNext()) {
                long j17 = ((l44.n4) it.next()).f397810b;
                if (j17 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConsecutiveAdDataImproveHelper", "delete sns id " + ca4.z0.t0(j17));
                    hashSet.add(java.lang.Long.valueOf(j17));
                    a84.n.d(j17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1907, 11);
                    i64.u1.b(22, 1, 105);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                xc4.p pVar = (xc4.p) it6.next();
                if (!pVar.mo133058x3172ed() || !hashSet.contains(java.lang.Long.valueOf(pVar.y0()))) {
                    arrayList.add(pVar);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            list = arrayList;
        }
        i64.u1.a(20, d17.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1612L, 30L, d17.size());
        a84.t0.a(new l44.l4(d17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return list;
    }

    public static java.util.List b(java.util.List list) {
        java.util.List d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ConsecutiveAdDataImproveHelper", "deleteConsecutiveAd, cursor==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        if (f()) {
            d17 = c(list);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDelConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDelConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            d17 = d(list);
        }
        if (a84.b0.b(d17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            long j17 = ((l44.n4) it.next()).f397810b;
            if (j17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConsecutiveAdDataImproveHelper", "delete sns id " + ca4.z0.t0(j17));
                arrayList.add(java.lang.Long.valueOf(j17));
                a84.n.d(j17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1907, 11);
                i64.u1.b(22, 1, 100);
            }
        }
        i64.u1.a(20, d17.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1612L, 30L, d17.size());
        a84.t0.a(new l44.l4(d17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return arrayList;
    }

    public static java.util.List c(java.util.List list) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("filterConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        try {
            if (a84.b0.b(list)) {
                java.util.List list2 = java.util.Collections.EMPTY_LIST;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
                return list2;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdFeedGap", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            int u07 = ca4.m0.u0(e42.c0.clicfg_timeline_ad_session_min_gap, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConsecutiveAdDataImproveHelper", "ad session min gap = " + u07);
            int max = java.lang.Math.max(u07, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdFeedGap", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            int i18 = 0;
            if (g()) {
                i17 = 0;
                while (i17 < list.size()) {
                    xc4.p pVar = (xc4.p) list.get(i17);
                    if (!pVar.mo133058x3172ed()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = pVar.c1();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 m70351xaa22b9ed = c17.m70351xaa22b9ed();
                    if (m70351xaa22b9ed == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ConsecutiveAdDataImproveHelper", "filterConsecutiveAdByPriority, current adSnsInfo is null");
                        ca4.e0.a("ad_pull_session", "curAdSnsInfo is null", i18, i18, ca4.z0.t0(c17.f68891x29d1292e));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConsecutiveAdDataImproveHelper", "delete first ad, snsId = " + ca4.z0.t0(c17.f68891x29d1292e));
                        arrayList.add(new l44.n4(m70351xaa22b9ed, 9, 29));
                    }
                    i17++;
                    i18 = 0;
                }
            } else {
                i17 = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883 = null;
            int i19 = 0;
            while (i17 < list.size()) {
                xc4.p pVar2 = (xc4.p) list.get(i17);
                if (pVar2.mo133058x3172ed()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c18 = pVar2.c1();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 m70351xaa22b9ed2 = c18.m70351xaa22b9ed();
                    if (m70351xaa22b9ed2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ConsecutiveAdDataImproveHelper", "filterConsecutiveAdByPriority, current adSnsInfo is null");
                        ca4.e0.a("ad_pull_session", "curAdSnsInfo is null", 0, 0, ca4.z0.t0(c18.f68891x29d1292e));
                    } else {
                        if (c17932x22276883 != null && i19 < max) {
                            int i27 = m70351xaa22b9ed2.m70300x74235b3e().f38201x38f216e7;
                            int i28 = c17932x22276883.m70300x74235b3e().f38201x38f216e7;
                            if (i27 > i28) {
                                arrayList.add(new l44.n4(c17932x22276883, 8, 26));
                            } else if (i27 < i28) {
                                arrayList.add(new l44.n4(m70351xaa22b9ed2, 8, 26));
                            } else if (m70351xaa22b9ed2.f67597x480f98d1 < c17932x22276883.f67597x480f98d1) {
                                arrayList.add(new l44.n4(m70351xaa22b9ed2, 8, 27));
                            } else {
                                arrayList.add(new l44.n4(c17932x22276883, 8, 27));
                            }
                        }
                        c17932x22276883 = m70351xaa22b9ed2;
                        i19 = 0;
                    }
                } else {
                    i19++;
                }
                i17++;
            }
            if (h()) {
                xc4.p pVar3 = (xc4.p) list.get(list.size() - 1);
                if (pVar3.mo133058x3172ed()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 m70351xaa22b9ed3 = pVar3.c1().m70351xaa22b9ed();
                    if (m70351xaa22b9ed3 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConsecutiveAdDataImproveHelper", "delete last ad, snsId = " + ca4.z0.t0(m70351xaa22b9ed3.f67610x29d1292e));
                        arrayList.add(new l44.n4(pVar3.c1().m70351xaa22b9ed(), 9, 28));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ConsecutiveAdDataImproveHelper", "filterConsecutiveAdByPriority, current adSnsInfo is null");
                        ca4.e0.a("ad_pull_session", "curAdSnsInfo is null", 0, 0, ca4.z0.t0(pVar3.c1().f68891x29d1292e));
                    }
                }
            }
            j(arrayList);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return arrayList;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ConsecutiveAdDataImproveHelper", "filterConsecutiveAdByPriority, exp=" + th6.toString());
            ca4.q.c("filterConsecutiveAdByPriority error", th6);
            java.util.List list3 = java.util.Collections.EMPTY_LIST;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return list3;
        }
    }

    public static java.util.List d(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                xc4.p pVar = (xc4.p) list.get(i18);
                long y07 = pVar.y0();
                if (pVar.mo133058x3172ed()) {
                    arrayList.add(new l44.m4(i17, y07));
                }
                i17++;
            }
            if (arrayList.size() < 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
                return null;
            }
            java.util.List e17 = e(arrayList);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return e17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ConsecutiveAdDataImproveHelper", "filterConsecutiveAdByTime, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
    }

    public static java.util.List e(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDelAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l44.m4 m4Var = null;
        for (int i17 = 0; i17 < list.size(); i17++) {
            l44.m4 m4Var2 = (l44.m4) list.get(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(m4Var2.f397798b);
            long j17 = m4Var2.f397798b;
            java.lang.String t07 = ca4.z0.t0(j17);
            if (y07 != null) {
                m4Var2.f397799c = y07.f67597x480f98d1;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ConsecutiveAdDataImproveHelper", "getDelAdByTime, no ad, snsId=" + t07);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConsecutiveAdDataImproveHelper", "getDelAdByTime, snsId=" + t07 + ", idx=" + m4Var2.f397797a + ", time=" + m4Var2.f397799c);
            if (m4Var != null && m4Var2.f397797a - m4Var.f397797a == 1) {
                if (m4Var2.f397799c > m4Var.f397799c) {
                    arrayList.add(new l44.n4(0L, m4Var.f397798b));
                } else {
                    arrayList.add(new l44.n4(0L, j17));
                    m4Var.f397797a = m4Var2.f397797a;
                }
            }
            m4Var = m4Var2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConsecutiveAdDataImproveHelper", "getDelAdByTime, cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", adCount=" + list.size() + ", delCount=" + arrayList.size());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDelAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return arrayList;
    }

    public static boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDelConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        boolean z17 = false;
        if (ca4.m0.u0(e42.c0.clicfg_ad_disable_delete_consecutive_ad_by_priority, 0) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnablePullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnablePullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$Companion");
            boolean O6 = r44.f.O6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnablePullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnablePullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            if (O6) {
                z17 = true;
            }
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2097, 25);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConsecutiveAdDataImproveHelper", "isDelConsecutiveAdByPriority = " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDelConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r7 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g() {
        /*
            java.lang.String r0 = "isEnableDeleteFirstAd"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            e42.c0 r2 = e42.c0.clicfg_ad_enable_delete_first
            r3 = 0
            int r2 = ca4.m0.u0(r2, r3)
            r4 = 1
            if (r2 == r4) goto L3c
            java.lang.String r2 = "isEnableDeleteAdAfterLoadPage"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r5)
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$Companion"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r6)
            java.lang.String r7 = "access$getSIsEnableDeleteAdAfterLoadPage$cp"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r5)
            boolean r8 = r44.f.f451093n
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r5)
            if (r8 == 0) goto L33
            boolean r7 = r44.f.O6()
            if (r7 == 0) goto L33
            r7 = r4
            goto L34
        L33:
            r7 = r3
        L34:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r6)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r5)
            if (r7 == 0) goto L3d
        L3c:
            r3 = r4
        L3d:
            if (r3 == 0) goto L48
            com.tencent.mm.plugin.report.service.g0 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r4 = 2097(0x831, float:2.939E-42)
            r5 = 30
            r2.A(r4, r5)
        L48:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "isEnableDeleteFirstAd = "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "ConsecutiveAdDataImproveHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.o4.g():boolean");
    }

    public static boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableDeleteLastAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        boolean z17 = ca4.m0.u0(e42.c0.clicfg_ad_enable_delete_last, 0) == 1;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2097, 31);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConsecutiveAdDataImproveHelper", "isEnableDeleteLastAd = " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableDeleteLastAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return z17;
    }

    public static java.util.List i(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFilterValue", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            ca4.m0.j0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFilterValue", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            java.util.List b17 = b(list);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return b17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ConsecutiveAdDataImproveHelper", "there is something wrong in removeConsecutiveAd: " + android.util.Log.getStackTraceString(th6));
            ca4.e0.a("filter_ad_exp", "", 0, 0, "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
    }

    public static void j(java.util.List list) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPriorityDeleteRecordData", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (a84.b0.b(list)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPriorityDeleteRecordData", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return;
        }
        l44.t5 b17 = l44.t5.b();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            l44.n4 n4Var = (l44.n4) it.next();
            if (n4Var.f397810b != 0 && (str = n4Var.f397811c) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                int i17 = n4Var.f397813e;
                g0Var.A(2097, i17);
                long j17 = n4Var.f397810b;
                java.lang.String t07 = ca4.z0.t0(j17);
                int i18 = n4Var.f397812d;
                b17.a(str, t07, i18, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConsecutiveAdDataImproveHelper", "delete ad by priority, snsid = " + ca4.z0.t0(j17) + ", deleteType = " + i18 + ", reportKey = " + i17);
                if (i18 == 9) {
                    ca4.e0.a("ad_pull_session", "delete first or last ad", i17, 0, "");
                }
            }
        }
        b17.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPriorityDeleteRecordData", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
    }
}
