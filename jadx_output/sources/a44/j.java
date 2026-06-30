package a44;

/* loaded from: classes4.dex */
public final class j extends oz5.a implements kotlinx.coroutines.r0 {
    public j(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$special$$inlined$CoroutineExceptionHandler$1");
        com.tencent.mars.xlog.Log.e("AdDownloadHelper", "error = ".concat(jz5.a.b(th6)));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$special$$inlined$CoroutineExceptionHandler$1");
    }
}
