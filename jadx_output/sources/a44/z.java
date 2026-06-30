package a44;

/* loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.DownloadHelper f1347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper) {
        super(0);
        this.f1347d = downloadHelper;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object gVar;
        java.lang.Integer e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$mAdDownloadAppHalfScreenHelper$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$mAdDownloadAppHalfScreenHelper$2");
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = this.f1347d;
        h44.b e18 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper);
        if ((e18 == null || (e17 = e18.e()) == null || e17.intValue() != 4) ? false : true) {
            android.content.Context i17 = downloadHelper.i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMHalfScreenListener", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMHalfScreenListener", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            gVar = new g44.k(i17, downloadHelper.f162642f);
        } else {
            gVar = new g44.g(downloadHelper.i());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$mAdDownloadAppHalfScreenHelper$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$mAdDownloadAppHalfScreenHelper$2");
        return gVar;
    }
}
