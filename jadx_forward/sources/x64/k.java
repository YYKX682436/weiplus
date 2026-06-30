package x64;

/* loaded from: classes4.dex */
public class k implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f533838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f533839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x64.l f533840c;

    public k(x64.l lVar, long j17, android.content.Context context) {
        this.f533840c = lVar;
        this.f533838a = j17;
        this.f533839b = context;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "showLivingRoom, snsId=" + str + ", errCode=" + i18 + ", actionType=" + i17 + ", adFinderLivingProductId=" + this.f533838a);
        if (i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            android.content.Context context = this.f533839b;
            this.f533840c.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            try {
                db5.t7.g(context, "进入直播间失败");
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1837, 5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick$1");
    }
}
