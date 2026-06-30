package yc4;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final yc4.b0 f542372a = new yc4.b0();

    /* renamed from: b, reason: collision with root package name */
    public static yc4.v f542373b;

    /* renamed from: c, reason: collision with root package name */
    public static yc4.v f542374c;

    /* renamed from: d, reason: collision with root package name */
    public static yc4.v f542375d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f542376e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f542377f;

    /* renamed from: g, reason: collision with root package name */
    public static long f542378g;

    /* renamed from: h, reason: collision with root package name */
    public static long f542379h;

    /* renamed from: i, reason: collision with root package name */
    public static long f542380i;

    static {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(new yc4.a0());
        f542376e = new java.util.HashSet();
        f542377f = "";
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markFeedBrowseEnd", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        if (f542377f.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFeedBrowseEnd", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            return;
        }
        yc4.v vVar = f542375d;
        if (vVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFeedBrowseTimeMsMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFeedBrowseTimeMsMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            java.util.HashMap hashMap = vVar.f542413g;
            if (hashMap != null) {
                java.lang.String str = f542377f;
                java.lang.Long l17 = (java.lang.Long) hashMap.get(str);
                if (l17 == null) {
                    l17 = 0L;
                }
                hashMap.put(str, java.lang.Long.valueOf(l17.longValue() + ((java.lang.System.currentTimeMillis() - f542378g) - f542380i)));
                f542377f = "";
                f542380i = 0L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFeedBrowseEnd", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFeedBrowseEnd", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
    }

    public final void b(java.lang.String feedId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markFeedBrowseStart", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        f542377f = feedId;
        f542378g = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFeedBrowseStart", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
    }

    public final void c(java.lang.String feedId, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markFeedClickTrace", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        yc4.v vVar = f542375d;
        if (vVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFeedClickList", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFeedClickList", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            java.util.HashMap hashMap = vVar.f542412f;
            if (hashMap != null) {
                if (!hashMap.containsKey(feedId)) {
                    hashMap.put(feedId, java.lang.String.valueOf(i17));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFeedClickTrace", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str = (java.lang.String) hashMap.get(feedId);
                if (str == null) {
                    str = "";
                }
                sb6.append(str);
                sb6.append('_');
                sb6.append(i17);
                hashMap.put(feedId, sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFeedClickTrace", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFeedClickTrace", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
    }

    public final void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markWsSnsId", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markWsSnsId", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        } else {
            f542376e.add(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markWsSnsId", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        }
    }

    public final void e(android.content.Intent intent, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6070x7cbfe737 event) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("packageSnsJump33050", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.cw cwVar = event.f136353g;
        intent.putExtra("contact_sns_page", cwVar.f87940b);
        intent.putExtra("contact_sns_feed_type", cwVar.f87942d);
        intent.putExtra("contact_sns_feed_id", cwVar.f87943e);
        intent.putExtra("contact_sns_is_ws", cwVar.f87941c);
        intent.putExtra("contact_sns_publish_user", cwVar.f87944f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsReportUtil", "page:" + cwVar.f87940b + " style:" + cwVar.f87942d + " id:" + cwVar.f87943e + " ws:" + cwVar.f87941c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("packageSnsJump33050", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
    }

    public final void f(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 info, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("packageSnsJump33050", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5) {
            intent.putExtra("contact_sns_page", 1);
        } else if ((context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a) || (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.ActivityC18439x36286657)) {
            intent.putExtra("contact_sns_page", 2);
        }
        intent.putExtra("contact_sns_feed_type", info.m70371x485d7().f39014x86965dde.f451370e);
        intent.putExtra("contact_sns_feed_id", ca4.z0.t0(info.f68891x29d1292e));
        intent.putExtra("contact_sns_is_ws", info.m70433xf9b3b2c7());
        intent.putExtra("contact_sns_publish_user", info.m70374x6bf53a6c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("packageSnsJump33050", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
    }
}
