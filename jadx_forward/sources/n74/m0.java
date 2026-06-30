package n74;

/* loaded from: classes4.dex */
public abstract class m0 {
    public static java.util.List a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFlipCardAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (c17933xe8d1b226 == null || !c17933xe8d1b226.m70395x9b8322ea()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createFlipCardAdPreloadTask, snsInfo==null or !FlipCardAd");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFlipCardAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        t74.a2 a2Var = c17933xe8d1b226.m70354x74235b3e().f38180xbeae372e;
        if (a2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createFlipCardAdPreloadTask, adFlipCardInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFlipCardAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        java.util.List h17 = a2Var.h();
        if (a84.b0.b(h17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createFlipCardAdPreloadTask, mediaList is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFlipCardAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        g(c17933xe8d1b226, c19767x257d7f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String m70363x51f8f990 = c17933xe8d1b226.m70363x51f8f990();
        java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
        while (it.hasNext()) {
            r45.jj4 jj4Var = (r45.jj4) it.next();
            if (jj4Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                boolean z18 = jj4Var.f459389e == 6;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                if (z18) {
                    dn.o c17 = c(c17933xe8d1b226, jj4Var, m70363x51f8f990, str, c19767x257d7f, z17);
                    if (c17 != null) {
                        arrayList.add(c17);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createFlipCardAdPreloadTask, mediaObj!=sight");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFlipCardAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return arrayList;
    }

    public static java.util.List b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, java.lang.String str, boolean z17) {
        dn.o c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createLookbookAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (c17933xe8d1b226 == null || !c17933xe8d1b226.m70401x59316745()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createLookbookAdPreloadTask, snsInfo==null or !lookbookAD");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createLookbookAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        v74.m mVar = c17933xe8d1b226.m70354x74235b3e().f38191xf4087299;
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createLookbookAdPreloadTask, adLookbookInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createLookbookAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        java.util.List<v74.q> c18 = mVar.c();
        if (a84.b0.b(c18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createLookbookAdPreloadTask, itemList is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createLookbookAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        g(c17933xe8d1b226, c19767x257d7f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String m70363x51f8f990 = c17933xe8d1b226.m70363x51f8f990();
        for (v74.q qVar : c18) {
            if (qVar == null || !qVar.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createLookbookAdPreloadTask, item!=sight");
            } else {
                dn.o c19 = c(c17933xe8d1b226, qVar.b(), m70363x51f8f990, str, c19767x257d7f, z17);
                if (c19 != null) {
                    arrayList.add(c19);
                }
            }
        }
        r45.jj4 f17 = mVar.f();
        if (f17 != null && (c17 = c(c17933xe8d1b226, f17, m70363x51f8f990, str, c19767x257d7f, z17)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createLookbookAdPreloadTask, brandNewMedia");
            arrayList.add(c17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createLookbookAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return arrayList;
    }

    public static dn.o c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, r45.jj4 jj4Var, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, boolean z17) {
        java.lang.String str3;
        t21.v2 v2Var;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (c17933xe8d1b226 == null || jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, current video is already download finish, do nothing");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
        java.lang.String e17 = ca4.m0.e(str, jj4Var.f459388d + "_");
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.i(e17, jj4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, localId is " + str + ", fakeLocalId is " + e17 + ", finishPath is " + i17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, current video is already download finish, do nothing");
            t21.o2.Ni().f(jj4Var.M, z17 ? 4 : 3, com.p314xaae8f345.mm.vfs.w6.k(i17), c17933xe8d1b226.m70374x6bf53a6c(), "", 0, "", jj4Var.f459391g, str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 147L, 1L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        boolean u17 = com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.n(jj4Var.f459388d));
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.p(jj4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, realLocalId: [%s], fakeLocalId: [%s], media id: [%s], duration: [%f], preloadPercent [%d], snsId: [%s], file: [%s]", str, e17, jj4Var.f459388d, java.lang.Float.valueOf(jj4Var.R), java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171), t07, p17);
        t21.v2 l17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.l(e17, jj4Var.f459388d, jj4Var.U, jj4Var.Y);
        if (l17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, video info: %s", l17.m165717x9616526c());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17) || !com.p314xaae8f345.mm.vfs.w6.j(p17)) {
                str3 = p17;
                v2Var = l17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, sns: [%s], fakeLocalId: [%s], videoFinishFilePath [%s], filePath [%s] is null or file maybe delete.", str, e17, i17, str3);
            } else {
                int i18 = l17.f496541f;
                if (i18 > 0 && java.lang.Math.ceil((l17.I * 100.0d) / i18) >= c19767x257d7f.f38864x6ac9171) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, sns: [%s], fakeLocalId: [%s], videoFinishFilePath [%s], filePath [%s] already preload finish, do nothing.", str, e17, i17, p17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                    return null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, sns: [%s], fakeLocalId: [%s], videoFinishFilePath [%s], filePath [%s] has not preload finish, preloadSize is %d, totalLength is %d, preloadPercent value is %d.", str, e17, i17, p17, java.lang.Integer.valueOf(l17.I), java.lang.Integer.valueOf(l17.f496541f), java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171));
                str3 = p17;
                v2Var = l17;
            }
        } else {
            str3 = p17;
            v2Var = l17;
        }
        if (v2Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.v(e17, jj4Var.f459388d, 30, jj4Var, str3);
            z18 = true;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.y(v2Var, jj4Var.f459388d, 30);
            z18 = false;
        }
        boolean z19 = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask fakeLocalId: [%s] preload stream download sns video %s mkDir %b", e17, str3, java.lang.Boolean.valueOf(u17));
        com.p314xaae8f345.mm.p2621x8fb0427b.s7 c17 = com.p314xaae8f345.mm.p2621x8fb0427b.s7.c();
        c17.f276846b = c17933xe8d1b226.m70357x3fdd41df();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        java.lang.String str4 = jj4Var.f459391g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        t21.i2.wi();
        dn.o k17 = t21.o2.Di().k(c17, str4, str3, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.g(e17, jj4Var), 2, jj4Var.N, jj4Var.f459388d, jj4Var.D, jj4Var.E, jj4Var.U, jj4Var);
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, checkCanSnsOnlineVideo, taskInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, 35);
        }
        k17.f69592xf1ebe47b = 20210;
        k17.U1 = jj4Var.M;
        k17.f69608x6ac8fea7 = c19767x257d7f.f38864x6ac9171;
        k17.Q1 = str2;
        k17.f323347b2 = jj4Var.f459388d;
        java.lang.String m70374x6bf53a6c = c17933xe8d1b226.m70374x6bf53a6c();
        k17.I1 = m70374x6bf53a6c;
        k17.J1 = m70374x6bf53a6c;
        k17.f323333s = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.r(jj4Var);
        java.lang.String str5 = jj4Var.U;
        k17.X1 = str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, download video flag: %s", str5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return k17;
    }

    public static java.util.List d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSlideFullCardPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e().f38210x95847c91 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createSlideFullCardPreloadTask, snsInfo or adSliderFullCardInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSlideFullCardPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        java.util.List<s34.x0> list = c17933xe8d1b226.m70354x74235b3e().f38210x95847c91.f76695x5800ff2c;
        if (a84.b0.b(list)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createSlideFullCardPreloadTask, adSlideFullCardItemInfoList is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSlideFullCardPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String m70363x51f8f990 = c17933xe8d1b226.m70363x51f8f990();
        g(c17933xe8d1b226, c19767x257d7f);
        for (s34.x0 x0Var : list) {
            if (x0Var == null || !x0Var.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createSlideFullCardPreloadTask, adSlideFullCardItemInfo is null or is not sight");
            } else {
                r45.jj4 jj4Var = x0Var.f484361e;
                if (arrayList2.contains(jj4Var.f459388d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createSlideFullCardPreloadTask, mediaIdList contains mediaId " + jj4Var.f459388d);
                } else {
                    dn.o c17 = c(c17933xe8d1b226, jj4Var, m70363x51f8f990, str, c19767x257d7f, z17);
                    if (c17 != null) {
                        arrayList.add(c17);
                        arrayList2.add(jj4Var.f459388d);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSlideFullCardPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return arrayList;
    }

    public static r45.jj4 e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFlipCardMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (c17933xe8d1b226 != null && c17933xe8d1b226.m70395x9b8322ea()) {
            t74.a2 a2Var = c17933xe8d1b226.m70354x74235b3e().f38180xbeae372e;
            if (a2Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "getFlipCardMediaById, adFlipCardInfo==null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFlipCardMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                return null;
            }
            java.util.List h17 = a2Var.h();
            if (a84.b0.b(h17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "getFlipCardMediaById, flipCardAd mediaList empty");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFlipCardMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                return null;
            }
            java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
            while (it.hasNext()) {
                r45.jj4 jj4Var = (r45.jj4) it.next();
                if (jj4Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, jj4Var.f459388d) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, jj4Var.f459388d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "getFlipCardMediaById, find flipCard media, mediaId=" + str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFlipCardMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                    return jj4Var;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFlipCardMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return null;
    }

    public static r45.jj4 f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.String str) {
        r45.jj4 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (c17933xe8d1b226 != null && c17933xe8d1b226.m70401x59316745()) {
            v74.m mVar = c17933xe8d1b226.m70354x74235b3e().f38191xf4087299;
            if (mVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "getLookbookAdMediaById, adLookbookInfo==null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                return null;
            }
            java.util.List<v74.q> c17 = mVar.c();
            if (a84.b0.b(c17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "getLookbookAdMediaById, lookbookAd itemList empty");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                return null;
            }
            for (v74.q qVar : c17) {
                if (qVar != null && (b17 = qVar.b()) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, b17.f459388d) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, b17.f459388d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "getLookbookAdMediaById, find lookbookAd media, mediaId=" + str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                    return b17;
                }
            }
            r45.jj4 f17 = mVar.f();
            if (f17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, f17.f459388d) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, f17.f459388d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "getLookbookAdMediaById, find lookbookAd splashCardMedia, mediaId=" + str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                return f17;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return null;
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePreloadRatio", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        c19767x257d7f.f38864x6ac9171 = 100;
        java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
        q34.b m70103xb6fd7912 = m70346x10413e67 == null ? null : m70346x10413e67.m70103xb6fd7912();
        if (m70103xb6fd7912 == null || (i17 = m70103xb6fd7912.f441500b) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "use default ratio: " + c19767x257d7f.f38864x6ac9171 + ", snsId is " + t07);
        } else {
            c19767x257d7f.f38864x6ac9171 = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "use config ratio: " + c19767x257d7f.f38864x6ac9171 + ", snsId is " + t07);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePreloadRatio", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
    }
}
