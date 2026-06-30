package a84;

/* loaded from: classes4.dex */
public abstract class n {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkDeleteFlipCardAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (c17932x22276883 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "checkDeleteFlipCardAdVideoInfo, adSnsInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteFlipCardAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70300x74235b3e = c17932x22276883.m70300x74235b3e();
        if (!m70300x74235b3e.m70139x9b8322ea()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteFlipCardAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        java.util.List h17 = m70300x74235b3e.f38180xbeae372e.h();
        if (a84.b0.b(h17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "checkDeleteFlipCardAdVideoInfo, mediaList empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteFlipCardAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
        while (it.hasNext()) {
            r45.jj4 jj4Var = (r45.jj4) it.next();
            if (jj4Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                boolean z17 = jj4Var.f459389e == 6;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                if (z17) {
                    g(jj4Var.f459388d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeleteUtils", "checkDeleteFlipCardAdVideoInfo, mediaId=" + jj4Var.f459388d);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteFlipCardAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        r45.jj4 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkDeleteLookbookAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (c17932x22276883 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "checkDeleteLookbookAdVideoInfo, adSnsInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteLookbookAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70300x74235b3e = c17932x22276883.m70300x74235b3e();
        if (!m70300x74235b3e.m70151x59316745()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteLookbookAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        java.util.List<v74.q> c17 = m70300x74235b3e.f38191xf4087299.c();
        if (a84.b0.b(c17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "checkDeleteLookbookAdVideoInfo, itemList empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteLookbookAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        for (v74.q qVar : c17) {
            if (qVar != null && qVar.c() && (b17 = qVar.b()) != null) {
                g(b17.f459388d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeleteUtils", "checkDeleteLookbookAdVideoInfo, mediaId=" + b17.f459388d);
            }
        }
        r45.jj4 f17 = m70300x74235b3e.f38191xf4087299.f();
        if (f17 != null) {
            g(f17.f459388d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeleteUtils", "checkDeleteLookbookAdVideoInfo splashCard, mediaId=" + f17.f459388d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteLookbookAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        s34.a1 a1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (c17932x22276883 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "checkDeleteSlideFullCardVideoInfo, adSnsInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70300x74235b3e = c17932x22276883.m70300x74235b3e();
        if (!m70300x74235b3e.m70160x35b2ea06() || (a1Var = m70300x74235b3e.f38210x95847c91) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        java.util.List<s34.x0> list = a1Var.f76695x5800ff2c;
        if (a84.b0.b(list)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "checkDeleteSlideFullCardVideoInfo, resInfoList is null or empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (s34.x0 x0Var : list) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteSlideFullCardVideoInternal", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            if (x0Var != null) {
                try {
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "deleteSlideFullCardVideoInternal, exp is " + th6);
                }
                if (x0Var.a()) {
                    java.lang.String str = x0Var.f484361e.f459388d;
                    if (arrayList.contains(str)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteSlideFullCardVideoInternal", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                    } else {
                        g(str);
                        arrayList.add(str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeleteUtils", "deleteSlideFullCardVideoInternal, mediaId is " + str);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteSlideFullCardVideoInternal", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    public static boolean d(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
            boolean e17 = e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return e17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "deleteAd0, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return false;
        }
    }

    public static boolean e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
            if (c17932x22276883 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "deleteAd, snsInfo==null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                return false;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            f(c17932x22276883);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            long j17 = c17932x22276883.f67610x29d1292e;
            boolean mo70496xb06685ab = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().mo70496xb06685ab(j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().y0(j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.u1.a(j17);
            int i17 = (int) (currentTimeMillis2 - currentTimeMillis);
            int currentTimeMillis3 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
            java.lang.String t07 = ca4.z0.t0(c17932x22276883.f67610x29d1292e);
            i64.z0.b(t07);
            r34.e.f450531a.a(c17932x22276883.f67610x29d1292e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeleteUtils", "deleteAd, snsId=" + t07 + ", ret=" + mo70496xb06685ab + ", delVideoInfoCost=" + i17 + ", totalCost=" + currentTimeMillis3);
            if (mo70496xb06685ab) {
                i64.u1.a(23, 1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return mo70496xb06685ab;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "deleteAd, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return false;
        }
    }

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        r45.a90 a90Var;
        boolean z17;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "deleteAdVideoInfo, exp=" + th6.toString());
        }
        if (!h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "deleteAdVideoInfo, expt closed!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70311x485d7 = c17932x22276883.m70311x485d7();
        c(c17932x22276883);
        b(c17932x22276883);
        a(c17932x22276883);
        if (m70311x485d7 != null && (a90Var = m70311x485d7.f39014x86965dde) != null) {
            int i17 = a90Var.f451370e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVideoAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            if (i17 != 5 && i17 != 15) {
                z17 = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                if (z17 && (linkedList = m70311x485d7.f39014x86965dde.f451373h) != null && linkedList.size() >= 1) {
                    r45.jj4 jj4Var = (r45.jj4) m70311x485d7.f39014x86965dde.f451373h.get(0);
                    g(jj4Var.f459388d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeleteUtils", "deleteAdVideoInfo, snsId=" + ca4.z0.t0(c17932x22276883.f67610x29d1292e) + ", rawMediaId=" + jj4Var.f459388d + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            }
            z17 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            if (z17) {
                r45.jj4 jj4Var2 = (r45.jj4) m70311x485d7.f39014x86965dde.f451373h.get(0);
                g(jj4Var2.f459388d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeleteUtils", "deleteAdVideoInfo, snsId=" + ca4.z0.t0(c17932x22276883.f67610x29d1292e) + ", rawMediaId=" + jj4Var2.f459388d + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    public static void g(java.lang.String str) {
        boolean contains;
        java.lang.String str2;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDelVideoInfoByMediaId", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDelVideoInfoByMediaId", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isMediaIdHasH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMediaIdHasH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            contains = false;
        } else {
            contains = str.contains("_hvec");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMediaIdHasH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        }
        if (contains) {
            str2 = l44.c0.h(str, false);
        } else {
            str2 = str;
            str = l44.c0.h(str, true);
        }
        boolean d17 = t21.o2.Ui().d(str);
        i(d17, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeleteUtils", "delVideoInfoByMediaId, mediaIdHasFlag=" + str + ", ret=" + d17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDelNoFlagVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_del_noflag_videoinfo, 0) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDelNoFlagVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "isDelNoFlagVideoInfo, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDelNoFlagVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            z17 = false;
        }
        if (z17) {
            boolean d18 = t21.o2.Ui().d(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeleteUtils", "delVideoInfoByMediaId, mediaIdNoFlag=" + str2 + ", ret=" + d18);
            i(d18, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDelVideoInfoByMediaId", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    public static boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDeleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_del_videoinfo, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeleteUtils", "isDeleteAdVideoInfo, expt=" + Ni);
            boolean z17 = Ni > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDeleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeleteUtils", "isDeleteAdVideoInfo, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDeleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return true;
        }
    }

    public static void i(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportVideoInfoDelResult", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (z18) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1907, 25);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1907, 26);
            }
        } else if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1907, 27);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1907, 28);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportVideoInfoDelResult", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }
}
