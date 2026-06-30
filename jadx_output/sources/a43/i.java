package a43;

/* loaded from: classes5.dex */
public class i implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a43.k f1219d;

    public i(a43.k kVar) {
        this.f1219d = kVar;
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        int i17 = c2CDownloadResult.errorCode;
        if (i17 != 0) {
            a43.k.b(this.f1219d, str, 4, i17, "", false);
        } else {
            a43.k.b(this.f1219d, str, 3, i17, "", false);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f1219d.f1223a;
        concurrentHashMap.containsKey(str);
        if (concurrentHashMap.containsKey(str)) {
            kq.p pVar = ((a43.j) concurrentHashMap.get(str)).f1220a;
            if (pVar == null) {
                com.tencent.mars.xlog.Log.e("PagCdnDownloader", "error proxy_callback null");
            } else {
                pVar.c(str, j17, j18);
            }
        }
    }
}
