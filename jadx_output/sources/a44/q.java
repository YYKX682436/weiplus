package a44;

/* loaded from: classes4.dex */
public final class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.DownloadHelper f1303d;

    public q(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper) {
        this.f1303d = downloadHelper;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$1");
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = this.f1303d;
        downloadHelper.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScope", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        kotlinx.coroutines.y0 y0Var = downloadHelper.f162648o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScope", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$1");
    }
}
