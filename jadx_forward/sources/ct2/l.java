package ct2;

/* loaded from: classes15.dex */
public final class l implements com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a.IPreloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ct2.m f303820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303821b;

    public l(ct2.m mVar, java.lang.String str) {
        this.f303820a = mVar;
        this.f303821b = str;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a.IPreloadListener
    /* renamed from: onPrepareDownloadProgressUpdate */
    public void mo54380x8ea30446(int i17, int i18, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReplayTransitionPreloadSlice", "preloadTTPlayer  onPrepareDownloadProgressUpdate   fileId(replayTransitionId):" + this.f303821b + "   playableDurationMS:" + i17 + "  currentDownloadSizeByte：" + j17 + "   totalFileSizeByte:" + j18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a.IPreloadListener
    /* renamed from: onPrepareError */
    public void mo54381xfaf06cc0() {
        this.f303820a.f303823e = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveReplayTransitionPreloadSlice", "preloadTTPlayer  onPrepareError  fileId(replayTransitionId):" + this.f303821b);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a.IPreloadListener
    /* renamed from: onPrepareSuccess */
    public void mo54382xe9650cbb() {
        this.f303820a.f303823e = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReplayTransitionPreloadSlice", "preloadTTPlayer  onPrepareSuccess  fileId(replayTransitionId):" + this.f303821b);
    }
}
