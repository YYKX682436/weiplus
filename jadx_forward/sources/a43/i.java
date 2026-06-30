package a43;

/* loaded from: classes5.dex */
public class i implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a43.k f82752d;

    public i(a43.k kVar) {
        this.f82752d = kVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        int i17 = c2CDownloadResult.f17871x139cb015;
        if (i17 != 0) {
            a43.k.b(this.f82752d, str, 4, i17, "", false);
        } else {
            a43.k.b(this.f82752d, str, 3, i17, "", false);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f82752d.f82756a;
        concurrentHashMap.containsKey(str);
        if (concurrentHashMap.containsKey(str)) {
            kq.p pVar = ((a43.j) concurrentHashMap.get(str)).f82753a;
            if (pVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PagCdnDownloader", "error proxy_callback null");
            } else {
                pVar.c(str, j17, j18);
            }
        }
    }
}
