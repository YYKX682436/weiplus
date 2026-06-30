package p20;

/* loaded from: classes12.dex */
public final class e implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {
    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "onC2CDownloadCompleted mediaId:" + str + " result:" + c2CDownloadResult);
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(p20.i.f432951d).remove(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(p20.i.f432953f).remove(str);
        ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) p20.i.f432950c).c();
        p20.i iVar = p20.i.f432948a;
        p3325xe03a0797.p3326xc267989b.l.d(p20.i.f432949b, null, null, new p20.g(null), 3, null);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "onDownloadProgressChanged mediaId:" + str + " onProgress finished:" + j17 + " total:" + j18);
    }
}
