package yc4;

/* loaded from: classes4.dex */
public final class w extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public w() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = "callback";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6095x9d8f63cc event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6095x9d8f63cc) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.vw vwVar = event.f136372g;
        if (vwVar != null) {
            java.lang.String str5 = vwVar.f89758b;
            java.lang.String str6 = vwVar.f89757a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNewTimeLineActivity", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI", str6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNewTimeLineActivity", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
            if (b17) {
                yc4.b0 b0Var = yc4.b0.f542372a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markEnterTimeline", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                if (str5.length() == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markEnterTimeline", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    str = "callback";
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markEnterTimeline old:");
                    yc4.v vVar = yc4.b0.f542373b;
                    sb6.append(vVar != null ? vVar.a() : null);
                    sb6.append(" new:");
                    sb6.append(str5);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsReportUtil", sb6.toString());
                    yc4.v vVar2 = yc4.b0.f542373b;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar2 != null ? vVar2.a() : null, str5)) {
                        str = "callback";
                        str2 = "markEnterTimeline";
                        str3 = "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil";
                    } else {
                        yc4.b0.f542376e.clear();
                        long q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("mmkv_report_16242", gm0.j1.b().h(), 1).q("MicroMsg.SnsReportUtil", 0L);
                        if (q17 <= 0) {
                            q17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().h2(0L, 1, true);
                        }
                        str2 = "markEnterTimeline";
                        str = "callback";
                        str3 = "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil";
                        yc4.b0.f542373b = new yc4.v(str5, q17, 0, null, null, null, null, 124, null);
                    }
                    yc4.b0.f542375d = yc4.b0.f542373b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str3);
                }
            } else {
                str = "callback";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsWsFoldDetailUI", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
                boolean z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3", str6) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI", str6);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsWsFoldDetailUI", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
                if (z17) {
                    yc4.b0 b0Var2 = yc4.b0.f542372a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markEnterWsDetail", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    if (str5.length() == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markEnterWsDetail", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    } else {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("markEnterWsDetail old:");
                        yc4.v vVar3 = yc4.b0.f542374c;
                        sb7.append(vVar3 != null ? vVar3.a() : null);
                        sb7.append(" new:");
                        sb7.append(str5);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsReportUtil", sb7.toString());
                        yc4.v vVar4 = yc4.b0.f542374c;
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar4 != null ? vVar4.a() : null, str5)) {
                            yc4.b0.f542374c = new yc4.v(str5, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().h2(0L, 1, true), 0, null, null, null, null, 124, null);
                        }
                        yc4.b0.f542375d = yc4.b0.f542374c;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markEnterWsDetail", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Report16242SessionChangeListener", "report16242SessionChangeListener callback, sessionId = " + str5 + ", sessionPageName = " + str6);
            str4 = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
        return false;
    }
}
