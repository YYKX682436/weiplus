package b74;

/* loaded from: classes4.dex */
public class b implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b74.c f18225b;

    public b(b74.c cVar, android.content.Context context) {
        this.f18225b = cVar;
        this.f18224a = context;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick$1");
        com.tencent.mars.xlog.Log.i("SnsAd.FinderLiveClick.AdFinderLiveClick", "showLivingRoom, the FinderLiveClick is called, snsId " + str + ", errorCode=" + i18 + ", actType=" + i17);
        if (i18 != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            android.content.Context context = this.f18224a;
            this.f18225b.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            try {
                db5.t7.g(context, "进入直播间失败");
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1837, 5);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick$1");
    }
}
