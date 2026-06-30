package n74;

/* loaded from: classes4.dex */
public abstract class l0 {
    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        r45.jj4 jj4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.OnlinePlayerSwitchHelper", "enableOnlineVideoPreload: the snsInfo is null!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        }
        if (!c17933xe8d1b226.m70377x3172ed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.OnlinePlayerSwitchHelper", "enableOnlineVideoPreload: the snsInfo is not ad!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(c17933xe8d1b226)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "enableOnlineVideoPreload: the snsInfo is ad living stream");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        boolean b17 = b(m70371x485d7, m70354x74235b3e);
        if (b17) {
            try {
                i64.q a17 = i64.q.a(c17933xe8d1b226);
                if (m70354x74235b3e.m70160x35b2ea06()) {
                    s34.a1 a1Var = m70354x74235b3e.f38210x95847c91;
                    java.lang.String str = m70371x485d7.Id;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSetH265", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                    if (a17 != null && a1Var != null) {
                        java.util.List<s34.x0> list = a1Var.f76695x5800ff2c;
                        if (!a84.b0.b(list)) {
                            for (s34.x0 x0Var : list) {
                                if (x0Var != null && x0Var.a() && (jj4Var = x0Var.f484361e) != null) {
                                    l44.c0.c(a17, jj4Var, str);
                                }
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSetH265", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSetH265", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                } else if (m70354x74235b3e.m70151x59316745()) {
                    v74.m.a(a17, m70354x74235b3e.f38191xf4087299, m70371x485d7.Id);
                } else if (m70354x74235b3e.m70139x9b8322ea()) {
                    t74.a2.a(a17, m70354x74235b3e.f38180xbeae372e, m70371x485d7.Id);
                } else {
                    r45.a90 a90Var = m70371x485d7.f39014x86965dde;
                    if (a90Var != null && a90Var.f451373h.size() >= 1) {
                        r45.jj4 jj4Var2 = (r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "AdH265Helper, enableAdOnlineVideoPreload, snsId=" + m70371x485d7.Id);
                        l44.c0.c(a17, jj4Var2, m70371x485d7.Id);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.OnlinePlayerSwitchHelper", "AdH265Helper, enableAdOnlineVideoPreload exp=" + th6.toString());
            }
            if (c17933xe8d1b226.m70378x4c74e984()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "forbidAutoPlay, disable AdOnlineVideoPreload");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        return b17;
    }

    public static boolean b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4) {
        boolean z17;
        s34.a1 a1Var;
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVideoSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        if (c19807x593d1720 == null || (a90Var = c19807x593d1720.f39014x86965dde) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            z17 = false;
        } else {
            z17 = a90Var.f451370e == 15;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        }
        if (c17903x3b438f4 != null && c17903x3b438f4.m70141x35f5a38c()) {
            if (c17903x3b438f4.m70148xed24eaaf()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload false, longpressgesture offline");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return false;
            }
            if (c17903x3b438f4.m70131xa5a206c0() || c17903x3b438f4.m70132x7e206751() || c17903x3b438f4.m70133x90460dcf()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "fullcard adBreakFrameVideo is offline");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return false;
            }
            int i17 = p34.v.f433232a;
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload false, force offline");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return false;
            }
            if (i17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload true,  force online");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
        }
        if (!d() && c17903x3b438f4 != null && c17903x3b438f4.m70160x35b2ea06() && (a1Var = c17903x3b438f4.f38210x95847c91) != null) {
            java.util.List<s34.x0> list = a1Var.f76695x5800ff2c;
            if (!a84.b0.b(list)) {
                for (s34.x0 x0Var : list) {
                    if (x0Var != null && x0Var.a()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "slideFullCard ad exists video item, so preload is enable!");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                        return true;
                    }
                }
            }
        }
        if (c17903x3b438f4 != null && c17903x3b438f4.m70151x59316745()) {
            v74.m mVar = c17903x3b438f4.f38191xf4087299;
            mVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHasVideoItem", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
            boolean z18 = mVar.f515400c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHasVideoItem", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "lookbook ad has video item, preload enable");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
        }
        if (c17903x3b438f4 != null && c17903x3b438f4.m70139x9b8322ea()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "flip card ad, preload enable");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return true;
        }
        if (z17 && c17903x3b438f4 != null && (c17903x3b438f4.m70153x2c02ceb4() || c17903x3b438f4.m70135xd6a8f11d())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "normal video ad or card video ad, so preload is enable!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return true;
        }
        if (z17 && c(c17903x3b438f4)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useOnlineVideoInNormalTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useOnlineVideoInNormalTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            if (c17903x3b438f4.m70153x2c02ceb4()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "the normal video preload is disable, because the online normal video preload is enable!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useOnlineVideoInBaseCardTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useOnlineVideoInBaseCardTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            if (c17903x3b438f4.m70135xd6a8f11d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "the base card ad video preload is disable, because the online base card prload is enable!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptUseOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptUseOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            if (c17903x3b438f4.m70141x35f5a38c() && !c17903x3b438f4.m70148xed24eaaf() && !c17903x3b438f4.m70131xa5a206c0() && !c17903x3b438f4.m70132x7e206751() && !c17903x3b438f4.m70133x90460dcf()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload true");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
            if (c17903x3b438f4.m70136xbd5ce118()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "combinedGridAD useOnlineVideoView preload true");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.OnlinePlayerSwitchHelper", "the ad video preload is not disable!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        return false;
    }

    public static boolean c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableOnlineVideoFeatureInAdXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        if (c17903x3b438f4 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableOnlineVideoFeatureInAdXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        }
        boolean z17 = c17903x3b438f4.f38278xf5553db1 > 0;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(fe1.t.f69748x366c91de, 20);
            if (c17903x3b438f4.m70135xd6a8f11d()) {
                g0Var.A(fe1.t.f69748x366c91de, 22);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.A(fe1.t.f69748x366c91de, 19);
            if (c17903x3b438f4.m70135xd6a8f11d()) {
                g0Var2.A(fe1.t.f69748x366c91de, 21);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableOnlineVideoFeatureInAdXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        return z17;
    }

    public static boolean d() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useOfflineVideoAdSlideFullCard", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        try {
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_timeline_slide_full_card_video_online, 0);
        } catch (java.lang.Throwable unused) {
            i17 = 0;
        }
        boolean z17 = i17 > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useOfflineVideoAdSlideFullCard", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        return z17;
    }
}
