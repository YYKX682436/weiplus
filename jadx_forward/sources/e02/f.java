package e02;

/* loaded from: classes5.dex */
public class f implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e02.h f327383d;

    public f(e02.h hVar) {
        this.f327383d = hVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        int i17 = c2CDownloadResult.f17871x139cb015;
        if (i17 != 0) {
            e02.h.b(this.f327383d, str, 4, i17, "", false);
        } else {
            e02.h.b(this.f327383d, str, 3, i17, "", false);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f327383d.f327387a;
        concurrentHashMap.containsKey(str);
        if (concurrentHashMap.containsKey(str)) {
            kq.p pVar = ((e02.g) concurrentHashMap.get(str)).f327384a;
            if (pVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChannelPatchDownloader", "error proxy_callback null");
            } else {
                pVar.c(str, j17, j18);
            }
        }
    }
}
