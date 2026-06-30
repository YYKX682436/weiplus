package ta4;

/* loaded from: classes12.dex */
public final class l1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public l1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        boolean contains;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.xz xzVar = event.f136451g;
        if (xzVar != null && xzVar.f89943b == 1) {
            ta4.r rVar = ta4.r.f498348d;
            long j17 = xzVar.f89942a;
            rVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMsgIdEventCallback", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
            synchronized (rVar.f341404c) {
                contains = ((java.util.ArrayList) rVar.f341404c).contains(java.lang.Long.valueOf(j17));
            }
            if (!contains) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsContentType", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1((int) j17);
                int i18 = i17 != null ? i17.f68895x2262335f : -1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsContentType", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSnsReporter", "snsMsg insert  db, snsType = " + i18 + ' ');
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShareStart", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6015x1e047705 c6015x1e047705 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6015x1e047705();
                c6015x1e047705.f136308g.getClass();
                c6015x1e047705.e();
                c6015x1e047705.f136309h.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShareStart", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).tj("page_out", new ta4.q(j17));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMsgIdEventCallback", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListener");
        return false;
    }
}
