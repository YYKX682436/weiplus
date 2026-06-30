package l44;

/* loaded from: classes4.dex */
public abstract class i3 {
    public static int a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883, int i17, int i18, java.lang.String str) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
        if (c17932x22276883 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdPullDeleteHelper", "deleteAd, adSnsInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
            return 1;
        }
        long j18 = c17932x22276883.f67610x29d1292e;
        java.lang.String t07 = ca4.z0.t0(j18);
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(c17932x22276883.f67595x4c58c87d);
            if (c19806x4c372b7 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdPullDeleteHelper", "deleteAd, snsObject==null, snsId=" + t07);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                return 4;
            }
            boolean U = ca4.m0.U(c19806x4c372b7, c01.z1.r());
            boolean z17 = (c17932x22276883.f67604x52c1d072 & 128) > 0;
            java.lang.Long valueOf = java.lang.Long.valueOf(j18);
            java.util.Set set = i64.b1.f370618z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdExposured", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            boolean contains = i64.b1.f370618z.contains(valueOf);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdExposured", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullDeleteHelper", "deleteAd, hasCommentLike=" + U + ", isExposure=" + z17 + ", isMemExposured=" + contains + ", delCondition=" + i18 + ", snsId=" + t07 + ", deleteType=" + i17);
            if (i18 == 0 && (z17 || contains || U)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                return 3;
            }
            if (i18 == 1 && U) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                return 2;
            }
            a84.n.e(c17932x22276883);
            try {
                j17 = j18;
                try {
                    ca4.c0.c(i17, j18, c17932x22276883.m70299x10413e67(), c17932x22276883.m70300x74235b3e(), str);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPullDeleteHelper", "deleteAd, reportAdDel exp=" + th.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                        return 0;
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPullDeleteHelper", "deleteAD, snsId=" + ca4.z0.t0(j17) + ", exp=" + e.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                        return 4;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                j17 = j18;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
            return 0;
        } catch (java.lang.Exception e18) {
            e = e18;
            j17 = j18;
        }
    }

    public static void b(java.util.LinkedList linkedList, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleAdPullDelete", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
        if (i17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullDeleteHelper", "handleAdPullDelete, count=" + i17 + ", scene=" + i18);
            if (linkedList == null || linkedList.size() != i17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAdPullDelete, count=");
                sb6.append(i17);
                sb6.append(", list.size=");
                sb6.append(linkedList != null ? linkedList.size() : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPullDeleteHelper", sb6.toString());
            } else {
                l44.t5 b17 = l44.t5.b();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                for (int i19 = 0; i19 < i17; i19++) {
                    long j17 = ((r45.pb0) linkedList.get(i19)).f464452d;
                    java.lang.String t07 = ca4.z0.t0(j17);
                    sb7.append(t07);
                    sb7.append("|");
                    if (j17 != 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(j17);
                        if (y07 == null) {
                            sb7.append("1, ");
                            b17.a("", t07, 1, 1);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullDeleteHelper", "handleAdPullDelete, adSnsInfo==null, snsId=" + t07);
                        } else {
                            int a17 = a(y07, 0, 1, "");
                            b17.a(y07.m70299x10413e67().f38104xce64ddf1, t07, 1, a17);
                            sb7.append(a17);
                            sb7.append(", ");
                        }
                    }
                }
                b17.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullDeleteHelper", "handleAdPullDelete, ret=" + sb7.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAdPullDelete", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
    }
}
