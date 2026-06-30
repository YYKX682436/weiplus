package p20;

/* loaded from: classes12.dex */
public final class d implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback {
    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onDataAvailable */
    public void mo37930x9bb59ea0(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "onDataAvailable mediaId:" + str + " offset:" + j17 + " length:" + j18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onDownloadToEnd */
    public void mo37931x34576d19(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "onDownloadToEnd mediaId:" + str + " offset:" + j17 + " length:" + j18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onM3U8Ready */
    public void mo37932xc5dd699b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "onM3U8Ready mediaId:" + str + " m3u8:" + str2);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onMoovReady */
    public void mo37933xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "onMoovReady mediaId:" + str + " offset:" + j17 + " length:" + j18 + " info:" + videoInfo);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onMoovReadyWithFlag */
    public void mo37934xedc4f36d(java.lang.String str, long j17, long j18, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "onMoovReadyWithFlag mediaId:" + str + " offset:" + j17 + " length:" + j18 + " svrflag:" + str2);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onObtainMoovFailed */
    public void mo37935x6e07772a(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "onObtainMoovFailed mediaId:" + str + " reason:" + i17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onPreloadCompletedWithResult */
    public void mo37936x23ba0da4(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "onPreloadCompletedWithResult mediaId:" + str + " finished:" + j17 + " total:" + j18 + " result:" + c2CDownloadResult);
    }
}
