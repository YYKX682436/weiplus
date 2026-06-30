package o74;

/* loaded from: classes4.dex */
public class f implements xd4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o74.j f425101a;

    public f(o74.j jVar) {
        this.f425101a = jVar;
    }

    @Override // xd4.e0
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$2");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            o74.j jVar = this.f425101a;
            java.lang.String str2 = jVar.f425105r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (str.equals(str2)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playOnlineVideo: timelineVideoView setUICallback onDestroy, the tlId is ");
                sb6.append(str);
                sb6.append(", the timelineId is ");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                java.lang.String str3 = jVar.f425105r;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                sb6.append(str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdSightTimeLineItem", sb6.toString());
                jVar.I();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$2");
    }
}
