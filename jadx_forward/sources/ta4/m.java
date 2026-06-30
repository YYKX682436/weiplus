package ta4;

/* loaded from: classes12.dex */
public final class m extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.report.ShareSnsEndListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6014xd52b9d6c event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6014xd52b9d6c) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.report.ShareSnsEndListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        am.iu iuVar = event.f136307g;
        if (iuVar != null) {
            if (iuVar.f88506c != null) {
                ct.y2 y2Var = (ct.y2) i95.n0.c(ct.y2.class);
                java.util.Map sdkParams = iuVar.f88506c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sdkParams, "sdkParams");
                qg5.j2 j2Var = (qg5.j2) y2Var;
                j2Var.getClass();
                linkedHashMap.putAll(j2Var.wi(sdkParams));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(iuVar.f88505b);
            if (i17 != null) {
                linkedHashMap.put("sns_feed_id", pm0.v.u(i17.f68891x29d1292e));
                linkedHashMap.put("sns_feed_local_id", i17.m70363x51f8f990());
            }
            linkedHashMap.put("sns_content_type", java.lang.Integer.valueOf(iuVar.f88504a));
            linkedHashMap.put("forward_result", java.lang.Integer.valueOf(iuVar.f88507d ? 1 : 0));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sdk_forward_sns", linkedHashMap, 30644);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.reportShareSns", "report 30644 " + linkedHashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.report.ShareSnsEndListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.report.ShareSnsEndListener");
        return false;
    }
}
