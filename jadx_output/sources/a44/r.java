package a44;

/* loaded from: classes4.dex */
public final class r implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.DownloadHelper f1304d;

    public r(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper) {
        this.f1304d = downloadHelper;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$2");
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = this.f1304d;
        downloadHelper.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScope", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        kotlinx.coroutines.y0 y0Var = downloadHelper.f162648o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScope", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$doExternalClick$1$2");
    }
}
