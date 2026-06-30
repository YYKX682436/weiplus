package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1;

/* renamed from: com.tencent.thumbplayer.adapter.player.ITPPlayerBase */
/* loaded from: classes16.dex */
public interface InterfaceC26139x4d493b7 {
    /* renamed from: addAudioTrackSource */
    void mo100384xa28fa651(java.lang.String str, java.lang.String str2, java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> list);

    /* renamed from: addAudioTrackSource */
    void mo100385xa28fa651(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> list);

    /* renamed from: addSubtitleSource */
    void mo100386x14654554(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: addSubtitleSource */
    void mo100387x14654554(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3);

    /* renamed from: captureVideo */
    void mo100388x2d34f8d5(com.p314xaae8f345.p3006xb8ff1437.api.C26171xafafaf50 c26171xafafaf50, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf interfaceC26170x325bffaf);

    /* renamed from: configBufferDurationAsync */
    int mo100389x59e24e46(int i17, long j17, long j18, long j19);

    /* renamed from: deselectTrack */
    void mo100390x4080528e(int i17, long j17);

    /* renamed from: getAutoExpendBufferCount */
    int mo100391xa42b888c();

    /* renamed from: getBufferIOMaxReadDurationPosMs */
    long mo100392xdc51b7e8();

    /* renamed from: getBufferIOMaxReadFileOffset */
    long mo100393x69f9266d();

    /* renamed from: getBufferIOMaxWriteDurationPosMs */
    long mo100394xed03e74f();

    /* renamed from: getBufferIOMaxWriteFileOffset */
    long mo100395x1e708866();

    /* renamed from: getBufferedDurationMs */
    long mo100396x23e0c68f();

    /* renamed from: getBufferedSize */
    long mo100397x45feff6();

    /* renamed from: getCurrentPositionMs */
    long mo100398xddd35a52();

    /* renamed from: getDemuxerOffsetInFile */
    long mo100399x37da763a();

    /* renamed from: getDurationMs */
    long mo100400x37a7fa50();

    /* renamed from: getDynamicStatisticParams */
    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 mo100401x55ab8bad(boolean z17);

    /* renamed from: getGeneralPlayFlowParams */
    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 mo100402xc0f8b3fa();

    /* renamed from: getPlayableDurationMs */
    long mo100403xac6a8d7e();

    /* renamed from: getProgramInfo */
    com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] mo100404x160d5c1c();

    /* renamed from: getPropertyLong */
    long mo100405x2d67b867(int i17);

    /* renamed from: getPropertyString */
    java.lang.String mo100406x7e95833c(int i17);

    /* renamed from: getTrackInfo */
    com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100407x2ae89de3();

    /* renamed from: getVideoHeight */
    int mo100408x463504c();

    /* renamed from: getVideoWidth */
    int mo100409x8d5c7601();

    /* renamed from: pause */
    void mo100411x65825f6();

    /* renamed from: prepare */
    void mo100412xed060d07();

    /* renamed from: prepareAsync */
    void mo100413x857611b5();

    /* renamed from: release */
    void mo100414x41012807();

    /* renamed from: reset */
    void mo100415x6761d4f();

    /* renamed from: seekTo */
    void mo100416xc9fc1b13(int i17);

    /* renamed from: seekTo */
    void mo100417xc9fc1b13(int i17, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSeekMode int i18);

    /* renamed from: selectProgram */
    void mo100418x18ae2de8(int i17, long j17);

    /* renamed from: selectTrack */
    void mo100419xc3b89af(int i17, long j17);

    /* renamed from: setAudioGainRatio */
    void mo100420x3aa51598(float f17);

    /* renamed from: setAudioNormalizeVolumeParams */
    void mo100421x1e3370b9(java.lang.String str);

    /* renamed from: setDataSource */
    void mo100422x683d6267(android.content.res.AssetFileDescriptor assetFileDescriptor);

    /* renamed from: setDataSource */
    void mo100423x683d6267(android.os.ParcelFileDescriptor parcelFileDescriptor);

    /* renamed from: setDataSource */
    void mo100424x683d6267(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1);

    /* renamed from: setDataSource */
    void mo100425x683d6267(java.lang.String str);

    /* renamed from: setDataSource */
    void mo100426x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    /* renamed from: setLoopback */
    void mo100427xfd27780d(boolean z17);

    /* renamed from: setLoopback */
    void mo100428xfd27780d(boolean z17, long j17, long j18);

    /* renamed from: setOnAudioPcmOutputListener */
    void mo100429x3282865a(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener iOnAudioPcmOutListener);

    /* renamed from: setOnAudioProcessOutputListener */
    void mo100430xb23c0daf(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener iOnAudioProcessOutListener);

    /* renamed from: setOnCompletionListener */
    void mo100431xa4560c71(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener iOnCompletionListener);

    /* renamed from: setOnDemuxerListener */
    void mo100432xa8a04d4f(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener iOnDemuxerListener);

    /* renamed from: setOnDetailInfoListener */
    void mo100433xa4b31634(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener iOnDetailInfoListener);

    /* renamed from: setOnErrorListener */
    void mo100434x6954c27b(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener iOnErrorListener);

    /* renamed from: setOnEventRecordListener */
    void mo100435x5e0339be(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener iOnEventRecordListener);

    /* renamed from: setOnInfoListener */
    void mo100436x40f8c003(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener);

    /* renamed from: setOnPreparedListener */
    void mo100437x5dd7c812(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener iOnPreparedListener);

    /* renamed from: setOnSeekCompleteListener */
    void mo100438xe1a2e326(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener iOnSeekCompleteListener);

    /* renamed from: setOnSubtitleDataListener */
    void mo100439x8796ba37(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener iOnSubtitleDataListener);

    /* renamed from: setOnSubtitleFrameOutListener */
    void mo100440xa679d9ae(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener);

    /* renamed from: setOnVideoFrameOutListener */
    void mo100441xf26db5af(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener iOnVideoFrameOutListener);

    /* renamed from: setOnVideoProcessOutputListener */
    void mo100442x7e05de2a(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener iOnVideoProcessOutListener);

    /* renamed from: setOnVideoSizeChangedListener */
    void mo100443x2d6d87cd(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener iOnVideoSizeChangedListener);

    /* renamed from: setOutputMute */
    void mo100444xd0747cbc(boolean z17);

    /* renamed from: setPlaySharpenSwitch */
    void mo100445x41b4a011();

    /* renamed from: setPlaySpeedRatio */
    void mo100446xd079f5a(float f17);

    /* renamed from: setPlayerOptionalParam */
    void mo100447x1ba09fea(com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1);

    /* renamed from: setSurface */
    void mo100448x42c875eb(android.view.Surface surface, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSurfaceType int i17);

    /* renamed from: setSurfaceHolder */
    void mo100449x5660d377(android.view.SurfaceHolder surfaceHolder);

    /* renamed from: start */
    void mo100450x68ac462();

    /* renamed from: stop */
    void mo100451x360802();

    /* renamed from: switchDefinition */
    void mo100452x81d257a7(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17);

    /* renamed from: switchDefinition */
    void mo100453x81d257a7(java.lang.String str, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17);

    /* renamed from: switchDefinition */
    void mo100454x81d257a7(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17);

    /* renamed from: switchHdrModeWithSurface */
    void mo100455x40944be2(android.view.Surface surface, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSurfaceType int i17, int i18);

    /* renamed from: updateLoggerContext */
    void mo100456x80f0bbb6(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3);
}
