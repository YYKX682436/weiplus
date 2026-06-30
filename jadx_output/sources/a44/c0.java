package a44;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.download.DownloadHelper f1248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1249e;

    public c0(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper, java.lang.String str) {
        this.f1248d = downloadHelper;
        this.f1249e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$showToast$1");
        db5.e1.T(this.f1248d.i(), this.f1249e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper$showToast$1");
    }
}
