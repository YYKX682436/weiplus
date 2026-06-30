package com.p314xaae8f345.p2926x359365;

/* renamed from: com.tencent.rtmp.TXLivePlayer */
/* loaded from: classes16.dex */
public class C25485x5a0a6891 {

    /* renamed from: PLAY_TYPE_LIVE_FLV */
    public static final int f46511x8c466817 = 1;

    /* renamed from: PLAY_TYPE_LIVE_HLS */
    public static final int f46512x8c466f96 = 7;

    /* renamed from: PLAY_TYPE_LIVE_RTMP */
    public static final int f46513xfc8c2c7e = 0;

    /* renamed from: PLAY_TYPE_LIVE_RTMP_ACC */
    public static final int f46514x49b1e920 = 5;
    public static final java.lang.String TAG = "TXLivePlayer";

    /* renamed from: mImpl */
    private com.p314xaae8f345.p2926x359365.a f46515x622d82d;

    /* renamed from: com.tencent.rtmp.TXLivePlayer$ITXAudioRawDataListener */
    /* loaded from: classes14.dex */
    public interface ITXAudioRawDataListener {
        /* renamed from: onAudioInfoChanged */
        void mo94540xb9e6b46f(int i17, int i18, int i19);

        /* renamed from: onPcmDataAvailable */
        void mo94541xe5629f84(byte[] bArr, long j17);
    }

    /* renamed from: com.tencent.rtmp.TXLivePlayer$ITXAudioVolumeEvaluationListener */
    /* loaded from: classes14.dex */
    public interface ITXAudioVolumeEvaluationListener {
        /* renamed from: onAudioVolumeEvaluationNotify */
        void mo94542x4d82ef6(int i17);
    }

    /* renamed from: com.tencent.rtmp.TXLivePlayer$ITXLivePlayVideoRenderListener */
    /* loaded from: classes14.dex */
    public interface ITXLivePlayVideoRenderListener {
        /* renamed from: onRenderVideoFrame */
        void mo94543x3cf387e7(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture);
    }

    /* renamed from: com.tencent.rtmp.TXLivePlayer$ITXSnapshotListener */
    /* loaded from: classes14.dex */
    public interface ITXSnapshotListener {
        /* renamed from: onSnapshot */
        void mo94544xb614f8c3(android.graphics.Bitmap bitmap);
    }

    /* renamed from: com.tencent.rtmp.TXLivePlayer$ITXVideoRawDataListener */
    /* loaded from: classes14.dex */
    public interface ITXVideoRawDataListener {
        /* renamed from: onVideoRawDataAvailable */
        void m94545xf6b9a8f3(byte[] bArr, int i17, int i18, int i19);
    }

    /* renamed from: com.tencent.rtmp.TXLivePlayer$TXLiteAVTexture */
    /* loaded from: classes14.dex */
    public static class TXLiteAVTexture {

        /* renamed from: eglContext */
        public java.lang.Object f46516x77710645;

        /* renamed from: height */
        public int f46517xb7389127;

        /* renamed from: textureId */
        public int f46518xc35d0396;

        /* renamed from: width */
        public int f46519x6be2dc6;
    }

    static {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
    }

    public C25485x5a0a6891(android.content.Context context) {
        this.f46515x622d82d = new com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3796x213fa554(context);
    }

    /* renamed from: callExperimentalAPI */
    public void m94511xd33a8dd4(java.lang.String str) {
        this.f46515x622d82d.mo29769xd33a8dd4(str);
    }

    /* renamed from: enableAudioVolumeEvaluation */
    public void m94512xe3d7029(int i17) {
        this.f46515x622d82d.mo29770xe3d7029(i17);
    }

    /* renamed from: enableHardwareDecode */
    public boolean m94513x8ee3e659(boolean z17) {
        return this.f46515x622d82d.mo29771x8ee3e659(z17);
    }

    /* renamed from: getCurrentRenderPts */
    public long m94514x59606b76() {
        return this.f46515x622d82d.mo29773x59606b76();
    }

    /* renamed from: isPlaying */
    public boolean m94515xc00617a4() {
        return this.f46515x622d82d.mo29774xc00617a4();
    }

    /* renamed from: pause */
    public void mo94516x65825f6() {
        this.f46515x622d82d.mo29786x65825f6();
    }

    /* renamed from: resume */
    public void mo94517xc84dc82d() {
        this.f46515x622d82d.mo29787xc84dc82d();
    }

    /* renamed from: setAudioRawDataListener */
    public void m94518x7d94ff92(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.f46515x622d82d.mo29788x7d94ff92(iTXAudioRawDataListener);
    }

    /* renamed from: setAudioRoute */
    public void m94519x78052215(int i17) {
        this.f46515x622d82d.mo29789x78052215(i17);
    }

    /* renamed from: setAudioVolumeEvaluationListener */
    public void m94520x81e7097e(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f46515x622d82d.mo29790x81e7097e(iTXAudioVolumeEvaluationListener);
    }

    /* renamed from: setConfig */
    public void m94521x78bda44(com.p314xaae8f345.p2926x359365.C25484xcc963946 c25484xcc963946) {
        this.f46515x622d82d.mo29791x78bda44(c25484xcc963946);
    }

    /* renamed from: setMute */
    public void m94522x764d819b(boolean z17) {
        this.f46515x622d82d.mo29792x764d819b(z17);
    }

    /* renamed from: setPlayListener */
    public void mo94523xbdb2cd8a(com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1) {
        this.f46515x622d82d.mo29793xbdb2cd8a(interfaceC25479x1853e9c1);
    }

    /* renamed from: setPlayerView */
    public void mo94524x9951f728(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f46515x622d82d.mo29794x9951f728(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
    }

    /* renamed from: setRenderMode */
    public void mo94525x638e3a5b(int i17) {
        this.f46515x622d82d.mo29795x638e3a5b(i17);
    }

    /* renamed from: setRenderRotation */
    public void mo94526x4594f436(int i17) {
        this.f46515x622d82d.mo29796x4594f436(i17);
    }

    /* renamed from: setSurface */
    public void m94527x42c875eb(android.view.Surface surface) {
        this.f46515x622d82d.mo29797x42c875eb(surface);
    }

    /* renamed from: setSurfaceSize */
    public void m94528x1c9cdc8c(int i17, int i18) {
        this.f46515x622d82d.mo29798x1c9cdc8c(i17, i18);
    }

    /* renamed from: setVideoRawDataListener */
    public void m94529x9737884d(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXVideoRawDataListener iTXVideoRawDataListener) {
        this.f46515x622d82d.mo29799x9737884d(iTXVideoRawDataListener);
    }

    /* renamed from: setVideoRecordListener */
    public void m94530x8cfd3dbe(com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener iTXVideoRecordListener) {
        this.f46515x622d82d.mo29800x8cfd3dbe(iTXVideoRecordListener);
    }

    /* renamed from: setVideoRenderListener */
    public int m94531x2fcefe03(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, java.lang.Object obj) {
        return this.f46515x622d82d.mo29801x2fcefe03(iTXLivePlayVideoRenderListener, obj);
    }

    /* renamed from: setVolume */
    public void m94532x27f73e1c(int i17) {
        this.f46515x622d82d.mo29802x27f73e1c(i17);
    }

    /* renamed from: showDebugView */
    public void m94533xcdf6351b(boolean z17) {
        this.f46515x622d82d.mo29803xcdf6351b(z17);
    }

    /* renamed from: snapshot */
    public void m94534x10fad5c4(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener iTXSnapshotListener) {
        this.f46515x622d82d.mo29804x10fad5c4(iTXSnapshotListener);
    }

    /* renamed from: startLivePlay */
    public int mo94535x5c1200c2(java.lang.String str, int i17) {
        return this.f46515x622d82d.mo29805x5c1200c2(str, i17);
    }

    /* renamed from: startRecord */
    public int m94536x8e35cb53(int i17) {
        return this.f46515x622d82d.mo29806x8e35cb53(i17);
    }

    /* renamed from: stopPlay */
    public int mo94537x66343656(boolean z17) {
        return this.f46515x622d82d.mo29807x66343656(z17);
    }

    /* renamed from: stopRecord */
    public int m94538xad07d6f3() {
        return this.f46515x622d82d.mo29808xad07d6f3();
    }

    /* renamed from: switchStream */
    public int m94539x4a14bbd4(java.lang.String str) {
        return this.f46515x622d82d.mo29809x4a14bbd4(str);
    }
}
