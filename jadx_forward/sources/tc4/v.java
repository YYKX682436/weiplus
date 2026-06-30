package tc4;

/* loaded from: classes4.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f499018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f499019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f499020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f499021g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f499022h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(tc4.a0 a0Var, r45.nw1 nw1Var, int i17, r45.g92 g92Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        super(0);
        this.f499018d = a0Var;
        this.f499019e = nw1Var;
        this.f499020f = i17;
        this.f499021g = g92Var;
        this.f499022h = c19792x256d2725;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstFrameRendStart: liveId=");
        r45.nw1 nw1Var = this.f499019e;
        sb6.append(nw1Var.m75942xfb822ef2(0));
        sb6.append(", position=");
        sb6.append(this.f499020f);
        sb6.append(", feedId=");
        r45.g92 g92Var = this.f499021g;
        sb6.append(g92Var.m75945x2fec8307(2));
        java.lang.String sb7 = sb6.toString();
        tc4.a0 a0Var = this.f499018d;
        a0Var.x("MicroMsg.Improve.FinderLiveTimelineItem", sb7);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setStartAutoPlayTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        a0Var.J1 = elapsedRealtime;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setStartAutoPlayTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        i95.m c17 = i95.n0.c(zy2.pa.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.pa paVar = (zy2.pa) c17;
        long m76784x5db1b11 = this.f499022h.m76784x5db1b11();
        long m75942xfb822ef2 = nw1Var.m75942xfb822ef2(0);
        java.lang.String m75945x2fec8307 = g92Var.m75945x2fec8307(1);
        java.lang.String m75945x2fec83072 = g92Var.m75945x2fec8307(3);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        java.lang.String str = m75945x2fec83072;
        p52.e[] eVarArr = p52.e.f433541d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("share_scene", g92Var.m75939xb282bd08(44));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        zy2.pa.Gc(paVar, m76784x5db1b11, m75942xfb822ef2, m75945x2fec8307, str, 14L, "temp_6", 3, jSONObject2, null, 256, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$1");
        return f0Var;
    }
}
