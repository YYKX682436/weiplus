package a44;

/* loaded from: classes4.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.DownloadHelper f1245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper) {
        super(0);
        this.f1245d = downloadHelper;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Integer e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$mDownloadCallback$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$mDownloadCallback$2");
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = this.f1245d;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(downloadHelper);
        h44.b e18 = com.tencent.mm.plugin.sns.ad.download.DownloadHelper.e(downloadHelper);
        a44.o oVar = new a44.o(weakReference, (e18 == null || (e17 = e18.e()) == null) ? 0 : e17.intValue());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$mDownloadCallback$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$mDownloadCallback$2");
        return oVar;
    }
}
