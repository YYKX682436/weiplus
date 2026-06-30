package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016;

/* renamed from: com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper */
/* loaded from: classes14.dex */
public interface InterfaceC26491x6cbe3bbd {
    /* renamed from: attachThread */
    void mo103363x800860af();

    /* renamed from: canReuseType */
    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType mo103364xccd939de(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c);

    /* renamed from: configure */
    void mo103365xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler);

    /* renamed from: configure */
    void mo103366xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17);

    /* renamed from: dequeueInputBuffer */
    int mo103367x9a572d5a(long j17);

    /* renamed from: dequeueOutputBuffer */
    int mo103368x436dd5f1(android.media.MediaCodec.BufferInfo bufferInfo, long j17);

    /* renamed from: flush */
    void mo103369x5d03b04();

    /* renamed from: getMediaCodec */
    android.media.MediaCodec mo103370x6053b688();

    /* renamed from: prepareToReUse */
    void mo103371xe451a992();

    /* renamed from: queueInputBuffer */
    void mo103372xfe5642d9(int i17, int i18, int i19, long j17, int i27);

    /* renamed from: release */
    void mo103373x41012807();

    /* renamed from: releaseOutputBuffer */
    void mo103374xab26be48(int i17, long j17);

    /* renamed from: releaseOutputBuffer */
    void mo103375xab26be48(int i17, boolean z17);

    /* renamed from: reset */
    void mo103376x6761d4f();

    /* renamed from: setCodecCallback */
    void mo103377xbd454139(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b interfaceC26486x9cae4e5b);

    /* renamed from: setOutputSurface */
    void mo103378x610a9b2a(android.view.Surface surface);

    /* renamed from: start */
    void mo103379x68ac462();

    /* renamed from: stop */
    void mo103380x360802();
}
