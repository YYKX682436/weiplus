package tc4;

/* loaded from: classes4.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f499066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(tc4.a0 a0Var) {
        super(3);
        this.f499066d = a0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$stopAutoPlay$1");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        android.view.View playView = (android.view.View) obj3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$stopAutoPlay$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playView, "playView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopAutoPlay: liveId=");
        r45.nw1 m76794xd0557130 = finderObject.m76794xd0557130();
        sb6.append(m76794xd0557130 != null ? java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)) : null);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(finderObject.m76784x5db1b11()));
        java.lang.String sb7 = sb6.toString();
        tc4.a0 a0Var = this.f499066d;
        a0Var.x("MicroMsg.Improve.FinderLiveTimelineItem", sb7);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setStartAutoPlayTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        a0Var.J1 = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setStartAutoPlayTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTotalPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        long j17 = a0Var.K1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTotalPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setTotalPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        a0Var.K1 = j17 + intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setTotalPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        i95.m c17 = i95.n0.c(zy2.pa.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.pa paVar = (zy2.pa) c17;
        long m76784x5db1b11 = finderObject.m76784x5db1b11();
        r45.nw1 m76794xd05571302 = finderObject.m76794xd0557130();
        long m75942xfb822ef2 = m76794xd05571302 != null ? m76794xd05571302.m75942xfb822ef2(0) : 0L;
        java.lang.String m76836x6c03c64c = finderObject.m76836x6c03c64c();
        java.lang.String m76801x8010e5e4 = finderObject.m76801x8010e5e4();
        if (m76801x8010e5e4 == null) {
            m76801x8010e5e4 = "";
        }
        java.lang.String str = m76801x8010e5e4;
        p52.e[] eVarArr = p52.e.f433541d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("auto_time", intValue);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        zy2.pa.Gc(paVar, m76784x5db1b11, m75942xfb822ef2, m76836x6c03c64c, str, 15L, "temp_6", 3, jSONObject2, null, 256, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$stopAutoPlay$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$stopAutoPlay$1");
        return f0Var;
    }
}
