package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.MediaCodecWrapper */
/* loaded from: classes16.dex */
interface InterfaceC29809xcbb53581 {
    /* renamed from: configure */
    void mo155703xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17);

    /* renamed from: createInputSurface */
    android.view.Surface mo155704x4310109f();

    /* renamed from: dequeueInputBuffer */
    int mo155705x9a572d5a(long j17);

    /* renamed from: dequeueOutputBuffer */
    int mo155706x436dd5f1(android.media.MediaCodec.BufferInfo bufferInfo, long j17);

    /* renamed from: flush */
    void mo155707x5d03b04();

    /* renamed from: getInputBuffers */
    java.nio.ByteBuffer[] mo155708xa9544f7f();

    /* renamed from: getOutputBuffers */
    java.nio.ByteBuffer[] mo155709x4a413c3c();

    /* renamed from: getOutputFormat */
    android.media.MediaFormat mo155710x42b80ace();

    /* renamed from: queueInputBuffer */
    void mo155711xfe5642d9(int i17, int i18, int i19, long j17, int i27);

    /* renamed from: release */
    void mo155712x41012807();

    /* renamed from: releaseOutputBuffer */
    void mo155713xab26be48(int i17, boolean z17);

    /* renamed from: setParameters */
    void mo155714x37bcc7ec(android.os.Bundle bundle);

    /* renamed from: start */
    void mo155715x68ac462();

    /* renamed from: stop */
    void mo155716x360802();
}
