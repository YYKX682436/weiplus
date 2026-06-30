package com.p314xaae8f345.p3006xb8ff1437.api;

/* renamed from: com.tencent.thumbplayer.api.ITPPlayer */
/* loaded from: classes15.dex */
public interface InterfaceC26164x73fc6bc6 {

    /* renamed from: TP_MIMETYPE_TEXT_SUBRIP */
    public static final java.lang.String f50281x2c9012bd = "text/x-subrip";

    /* renamed from: TP_MIMETYPE_TEXT_VTT */
    public static final java.lang.String f50282xfd42abf2 = "text/vtt";

    /* renamed from: TP_PLAYER_LOOPBACK_ENDPOSITION_DEFAULT */
    public static final int f50283x8a07ef6d = -1;

    /* renamed from: TP_PLAYER_LOOPBACK_STARTPOSITION_DEFAULT */
    public static final int f50284x7b1c7334 = 0;

    /* renamed from: TP_PLAYER_SEEK_MODE_ACCURATE_POSITION */
    @com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSeekMode(m100850x6ac9171 = 3)
    public static final int f50285xd138d864 = 3;

    /* renamed from: TP_PLAYER_SEEK_MODE_FREVIOUS_KFRAME */
    @com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSeekMode(m100850x6ac9171 = 1)
    public static final int f50286x273b69f0 = 1;

    /* renamed from: TP_PLAYER_SEEK_MODE_NEXT_CLIP */
    @com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSeekMode(m100850x6ac9171 = 4)
    public static final int f50287x12b6b76c = 4;

    /* renamed from: TP_PLAYER_SEEK_MODE_NEXT_KFRAME */
    @com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSeekMode(m100850x6ac9171 = 2)
    public static final int f50288x4d3cacfe = 2;

    /* renamed from: TP_PLAYER_SWITCH_DEF_AFTER_ALL_RESOURCE_CONSUME */
    @com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSwitchDefMode(m100855x6ac9171 = 3)
    public static final int f50289xea104756 = 3;

    /* renamed from: TP_PLAYER_SWITCH_DEF_DEFAULT */
    @com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSwitchDefMode(m100855x6ac9171 = 0)
    public static final int f50290x44a11957 = 0;

    /* renamed from: TP_PLAYER_SWITCH_DEF_FAST_WITH_KEEP_NO_BUFFERING */
    @com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSwitchDefMode(m100855x6ac9171 = 2)
    public static final int f50291x7ad3e = 2;

    /* renamed from: TP_PLAYER_SWITCH_DEF_IMMEDIATELY */
    @com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSwitchDefMode(m100855x6ac9171 = 1)
    public static final int f50292x20105d14 = 1;

    /* renamed from: TP_PLAYER_VIDEO_SURFACE_FROM_SURFACEVIEW */
    @com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSurfaceType(m100854x6ac9171 = 2)
    public static final int f50293x3d98660e = 2;

    /* renamed from: TP_PLAYER_VIDEO_SURFACE_FROM_TEXTUREVIEW */
    @com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSurfaceType(m100854x6ac9171 = 1)
    public static final int f50294xf166677c = 1;

    /* renamed from: TP_PLAYER_VIDEO_SURFACE_UNSPECIFIED */
    @com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSurfaceType(m100854x6ac9171 = 0)
    public static final int f50295x89611206 = 0;

    /* renamed from: addAudioTrackSource */
    void mo100898xa28fa651(java.lang.String str, java.lang.String str2);

    /* renamed from: addAudioTrackSource */
    void mo100899xa28fa651(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13);

    /* renamed from: addSubtitleSource */
    void mo100900x14654554(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: addSubtitleSource */
    void mo100901x14654554(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13);

    /* renamed from: captureVideo */
    void mo100902x2d34f8d5(com.p314xaae8f345.p3006xb8ff1437.api.C26171xafafaf50 c26171xafafaf50, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf interfaceC26170x325bffaf);

    /* renamed from: configBufferDurationAsync */
    int mo100903x59e24e46(int i17, long j17, long j18, long j19);

    /* renamed from: deselectTrack */
    void mo100904x4080528e(int i17, long j17);

    /* renamed from: enableTPAssetResourceLoader */
    void mo100905x969bf12(com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26242xd2a9d8e0 interfaceC26242xd2a9d8e0, android.os.Looper looper);

    /* renamed from: enableTPAssetResourceLoader */
    void mo100906x969bf12(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c interfaceC26468xe997c0c);

    /* renamed from: getAutoExpendBufferCount */
    int mo100907xa42b888c();

    /* renamed from: getBufferIOMaxReadDurationPosMs */
    long mo100908xdc51b7e8();

    /* renamed from: getBufferIOMaxReadFileOffset */
    long mo100909x69f9266d();

    /* renamed from: getBufferIOMaxWriteDurationPosMs */
    long mo100910xed03e74f();

    /* renamed from: getBufferIOMaxWriteFileOffset */
    long mo100911x1e708866();

    /* renamed from: getBufferPercent */
    int mo100912x3421dc2f();

    /* renamed from: getBufferedDurationMs */
    long mo100913x23e0c68f();

    /* renamed from: getBufferedSize */
    long mo100914x45feff6();

    /* renamed from: getCurrentPositionMs */
    long mo100915xddd35a52();

    /* renamed from: getCurrentState */
    int mo100916xb7d72d0e();

    /* renamed from: getDurationMs */
    long mo100917x37a7fa50();

    /* renamed from: getExtendReportController */
    com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26238x3fcd9a0f mo100918xe88aaa20();

    /* renamed from: getPlayableDurationMs */
    long mo100919xac6a8d7e();

    /* renamed from: getPlayerBufferedDurationMs */
    long mo100920x21a0b6d0();

    /* renamed from: getPlayerProxy */
    com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26228x968ada48 mo100921xfa372ad7();

    /* renamed from: getPlayerType */
    int mo100922x6b2cfdb1();

    /* renamed from: getProgramInfo */
    com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] mo100923x160d5c1c();

    /* renamed from: getPropertyLong */
    long mo100924x2d67b867(int i17);

    /* renamed from: getPropertyString */
    java.lang.String mo100925x7e95833c(int i17);

    /* renamed from: getReportManager */
    com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.InterfaceC26234x67c8074 mo100926xba388c23();

    /* renamed from: getTrackInfo */
    com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100927x2ae89de3();

    /* renamed from: getVideoHeight */
    int mo100928x463504c();

    /* renamed from: getVideoWidth */
    int mo100929x8d5c7601();

    /* renamed from: pause */
    void mo100930x65825f6();

    /* renamed from: pauseDownload */
    void mo100931xe51afc9e();

    /* renamed from: prepareAsync */
    void mo100932x857611b5();

    /* renamed from: release */
    void mo100933x41012807();

    /* renamed from: reset */
    void mo100934x6761d4f();

    /* renamed from: resumeDownload */
    void mo100935xb0277d5();

    /* renamed from: seekTo */
    void mo100936xc9fc1b13(int i17);

    /* renamed from: seekTo */
    void mo100937xc9fc1b13(int i17, int i18);

    /* renamed from: selectProgram */
    void mo100938x18ae2de8(int i17, long j17);

    /* renamed from: selectTrack */
    void mo100939xc3b89af(int i17, long j17);

    /* renamed from: setAudioGainRatio */
    void mo100940x3aa51598(float f17);

    /* renamed from: setAudioNormalizeVolumeParams */
    void mo100941x1e3370b9(java.lang.String str);

    /* renamed from: setDataSource */
    void mo100942x683d6267(android.content.res.AssetFileDescriptor assetFileDescriptor);

    /* renamed from: setDataSource */
    void mo100943x683d6267(android.os.ParcelFileDescriptor parcelFileDescriptor);

    /* renamed from: setDataSource */
    void mo100944x683d6267(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1);

    /* renamed from: setDataSource */
    void mo100945x683d6267(java.lang.String str);

    /* renamed from: setDataSource */
    void mo100946x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    /* renamed from: setLoopback */
    void mo100947xfd27780d(boolean z17);

    /* renamed from: setLoopback */
    void mo100948xfd27780d(boolean z17, long j17, long j18);

    /* renamed from: setOnAudioFrameOutputListener */
    void mo100949x47402aed(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioFrameOutputListener iOnAudioFrameOutputListener);

    /* renamed from: setOnAudioProcessFrameOutputListener */
    void mo100950xbd4f3f08(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener);

    /* renamed from: setOnCompletionListener */
    void mo100951xa4560c71(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener iOnCompletionListener);

    /* renamed from: setOnDemuxerListener */
    void mo100952xa8a04d4f(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDemuxerListener iOnDemuxerListener);

    /* renamed from: setOnDetailInfoListener */
    void mo100953xa4b31634(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener iOnDetailInfoListener);

    /* renamed from: setOnErrorListener */
    void mo100954x6954c27b(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener iOnErrorListener);

    /* renamed from: setOnInfoListener */
    void mo100955x40f8c003(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener iOnInfoListener);

    /* renamed from: setOnPlayerStateChangeListener */
    void mo100956xa23b7bf3(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener iOnStateChangeListener);

    /* renamed from: setOnPreparedListener */
    void mo100957x5dd7c812(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener iOnPreparedListener);

    /* renamed from: setOnSeekCompleteListener */
    void mo100958xe1a2e326(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener iOnSeekCompleteListener);

    /* renamed from: setOnStopAsyncCompleteListener */
    void mo100959x6aa275e6(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener);

    /* renamed from: setOnSubtitleDataListener */
    void mo100960x8796ba37(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleDataListener iOnSubtitleDataListener);

    /* renamed from: setOnSubtitleFrameOutListener */
    void mo100961xa679d9ae(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener);

    /* renamed from: setOnVideoFrameOutListener */
    void mo100962xf26db5af(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoFrameOutListener iOnVideoFrameOutListener);

    /* renamed from: setOnVideoProcessFrameOutputListener */
    void mo100963xa90b836d(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener);

    /* renamed from: setOnVideoSizeChangedListener */
    void mo100964x2d6d87cd(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener iOnVideoSizeChangedListener);

    /* renamed from: setOutputMute */
    void mo100965xd0747cbc(boolean z17);

    /* renamed from: setPlaySharpenSwitch */
    void mo100966x41b4a011();

    /* renamed from: setPlaySpeedRatio */
    void mo100967xd079f5a(float f17);

    /* renamed from: setPlayerOptionalParam */
    void mo100968x1ba09fea(com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1);

    /* renamed from: setRichMediaSynchronizer */
    void mo100969xeebc4268(com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625 interfaceC26248xbe616625);

    /* renamed from: setSurface */
    void mo100970x42c875eb(android.view.Surface surface);

    /* renamed from: setSurface */
    void mo100971x42c875eb(android.view.Surface surface, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSurfaceType int i17);

    /* renamed from: setSurfaceHolder */
    void mo100972x5660d377(android.view.SurfaceHolder surfaceHolder);

    /* renamed from: setTPSurface */
    void mo100973xf5e4086f(com.p314xaae8f345.p3006xb8ff1437.api.C26196x1194f691 c26196x1194f691);

    /* renamed from: setVideoInfo */
    void mo100974xab2f6987(com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad);

    /* renamed from: start */
    void mo100975x68ac462();

    /* renamed from: stop */
    void mo100976x360802();

    /* renamed from: stopAsync */
    void mo100977x5f82bb9a();

    /* renamed from: switchDefinition */
    void mo100978x81d257a7(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad);

    /* renamed from: switchDefinition */
    void mo100979x81d257a7(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, int i17);

    /* renamed from: switchDefinition */
    void mo100980x81d257a7(java.lang.String str, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad);

    /* renamed from: switchDefinition */
    void mo100981x81d257a7(java.lang.String str, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, int i17);

    /* renamed from: switchDefinition */
    void mo100982x81d257a7(java.lang.String str, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, java.util.Map<java.lang.String, java.lang.String> map);

    /* renamed from: switchDefinition */
    void mo100983x81d257a7(java.lang.String str, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, java.util.Map<java.lang.String, java.lang.String> map, int i17);

    /* renamed from: switchHdrModeWithSurface */
    void mo100984x40944be2(android.view.Surface surface, int i17);

    /* renamed from: updateLoggerContext */
    void mo100985x80f0bbb6(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3);
}
