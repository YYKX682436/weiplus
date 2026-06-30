package yc4;

/* loaded from: classes4.dex */
public final class o extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        java.lang.String str2;
        yc4.v vVar;
        java.util.Map map;
        l52.g gVar;
        r45.p86 p86Var;
        java.util.Map map2;
        java.lang.String str3 = "callback";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.ui.improve.report.GetSnsReportParamsListener";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.report.GetSnsReportParamsListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5622x867dc45d event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5622x867dc45d) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.report.GetSnsReportParamsListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.Integer num = 0;
        am.rg rgVar = event.f135949g;
        if (rgVar != null) {
            java.util.LinkedList linkedList = rgVar.f89346d;
            boolean z17 = true;
            if (!(linkedList == null || linkedList.isEmpty())) {
                java.lang.String str5 = rgVar.f89344b;
                if (str5 != null && str5.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    str = "callback";
                    str2 = "com.tencent.mm.plugin.sns.ui.improve.report.GetSnsReportParamsListener";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetSnsReportParamsListener", "sessionIdList is null");
                } else {
                    if (rgVar.f89343a) {
                        yc4.b0 b0Var = yc4.b0.f542372a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWsDetail16242", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                        vVar = yc4.b0.f542374c;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWsDetail16242", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    } else {
                        yc4.b0 b0Var2 = yc4.b0.f542372a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeline16242", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                        vVar = yc4.b0.f542373b;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeline16242", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    }
                    if (vVar != null) {
                        java.lang.String str6 = "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data";
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNewFeedCount", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                        int i17 = vVar.f542409c;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNewFeedCount", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                        java.lang.String str7 = rgVar.f89344b;
                        java.lang.String str8 = rgVar.f89345c;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.a(), rgVar.f89344b)) {
                            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                            java.util.Iterator it = rgVar.f89346d.iterator();
                            while (it.hasNext()) {
                                java.lang.String str9 = (java.lang.String) it.next();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str9);
                                java.util.Iterator it6 = it;
                                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                                java.lang.Integer num2 = num;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFeedLikeMap", str6);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFeedLikeMap", str6);
                                java.lang.Integer num3 = (java.lang.Integer) vVar.f542410d.get(str9);
                                if (num3 == null) {
                                    num3 = num2;
                                }
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num3);
                                int intValue = num3.intValue();
                                java.lang.String str10 = str3;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFeedCommentMap", str6);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFeedCommentMap", str6);
                                java.lang.Integer num4 = (java.lang.Integer) vVar.f542411e.get(str9);
                                if (num4 == null) {
                                    num4 = num2;
                                }
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num4);
                                int intValue2 = num4.intValue();
                                java.lang.String str11 = str4;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFeedClickList", str6);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFeedClickList", str6);
                                java.lang.String str12 = (java.lang.String) vVar.f542412f.get(str9);
                                if (str12 == null) {
                                    str12 = "";
                                }
                                java.lang.String str13 = str8;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFeedBrowseTimeMsMap", str6);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFeedBrowseTimeMsMap", str6);
                                java.lang.Long l17 = (java.lang.Long) vVar.f542413g.get(str9);
                                if (l17 == null) {
                                    l17 = 0L;
                                }
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                                java.lang.String str14 = str6;
                                long longValue = l17.longValue();
                                linkedHashMap2.put("sns_feed_like_cnt", java.lang.Integer.valueOf(intValue));
                                linkedHashMap2.put("sns_feed_comment_cnt", java.lang.Integer.valueOf(intValue2));
                                linkedHashMap2.put("sns_feed_click_list", str12);
                                linkedHashMap2.put("sns_feed_media_time", java.lang.Long.valueOf(longValue));
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetSnsReportParamsListener", "feedId: " + str9 + ", feedLikeCnt: " + intValue + " feedComment: " + intValue2 + ", feedClickList: " + str12 + ", snsFeedMediaTime: " + longValue);
                                linkedHashMap.put(str9, linkedHashMap2);
                                it = it6;
                                num = num2;
                                str3 = str10;
                                str4 = str11;
                                str8 = str13;
                                vVar = vVar;
                                str6 = str14;
                            }
                            str = str3;
                            str2 = str4;
                            java.lang.String str15 = str8;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetSnsReportParamsListener", "newFeedCount: " + i17 + ", feedInfoMapSize: " + linkedHashMap.size() + " sessionId: " + str7 + ", sessionPage = " + str15);
                            if (((v30.e) i95.n0.c(v30.e.class)) != null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str15);
                                e62.q a17 = e62.q.a();
                                a17.getClass();
                                java.lang.String str16 = str15.isEmpty() ? a17.f331339d : str15;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.SnsMonitor", "cur session page: %s", str16);
                                e62.j b17 = a17.b(str16);
                                if (b17 != null) {
                                    l52.f fVar = b17.f331301d;
                                    if (fVar != null && fVar.f398116c == 0 && (map = fVar.f398118e) != null) {
                                        r45.va6 va6Var = fVar.f398120g;
                                        if (va6Var != null) {
                                            va6Var.f469587r = i17;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FeedMonitor", "updateNewFeedCount: %d", java.lang.Integer.valueOf(i17));
                                        }
                                        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
                                            java.lang.String str17 = (java.lang.String) entry.getKey();
                                            if (linkedHashMap.containsKey(str17) && (gVar = (l52.g) entry.getValue()) != null && (p86Var = gVar.f398140a) != null && (map2 = (java.util.Map) linkedHashMap.get(str17)) != null) {
                                                p86Var.E = map2.containsKey("sns_feed_like_cnt") ? ((java.lang.Integer) map2.get("sns_feed_like_cnt")).intValue() : 0;
                                                p86Var.F = map2.containsKey("sns_feed_comment_cnt") ? ((java.lang.Integer) map2.get("sns_feed_comment_cnt")).intValue() : 0;
                                                p86Var.G = map2.containsKey("sns_feed_click_list") ? (java.lang.String) map2.get("sns_feed_click_list") : "";
                                                p86Var.I = map2.containsKey("sns_feed_media_time") ? ((java.lang.Long) map2.get("sns_feed_media_time")).longValue() : 0L;
                                            }
                                        }
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecycleViewFeedMonitor", "updateFeedInfo: " + i17);
                                }
                            }
                        }
                    }
                }
                str3 = str;
                str4 = str2;
            }
            str = "callback";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.report.GetSnsReportParamsListener";
            str3 = str;
            str4 = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
        return false;
    }
}
