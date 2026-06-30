package b74;

/* loaded from: classes4.dex */
public class b implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f99757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b74.c f99758b;

    public b(b74.c cVar, android.content.Context context) {
        this.f99758b = cVar;
        this.f99757a = context;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderLiveClick.AdFinderLiveClick", "showLivingRoom, the FinderLiveClick is called, snsId " + str + ", errorCode=" + i18 + ", actType=" + i17);
        if (i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            android.content.Context context = this.f99757a;
            this.f99758b.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            try {
                db5.t7.g(context, "进入直播间失败");
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1837, 5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick$1");
    }
}
