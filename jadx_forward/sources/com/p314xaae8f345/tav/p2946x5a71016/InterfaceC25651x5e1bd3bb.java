package com.p314xaae8f345.tav.p2946x5a71016;

/* renamed from: com.tencent.tav.codec.IMediaCodec */
/* loaded from: classes16.dex */
public interface InterfaceC25651x5e1bd3bb {
    /* renamed from: bindSurfaceTexture */
    void mo96247x49c4954b(android.graphics.SurfaceTexture surfaceTexture);

    /* renamed from: configure */
    void mo96248xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17);

    /* renamed from: createInputSurface */
    android.view.Surface mo96249x4310109f();

    /* renamed from: dequeueInputBuffer */
    int mo96250x9a572d5a(long j17);

    /* renamed from: dequeueOutputBuffer */
    int mo96251x436dd5f1(android.media.MediaCodec.BufferInfo bufferInfo, long j17);

    /* renamed from: flush */
    void mo96252x5d03b04();

    /* renamed from: getInputBuffer */
    java.nio.ByteBuffer mo96253xaa9f9f74(int i17);

    /* renamed from: getInputFormat */
    android.media.MediaFormat mo96254xb124032b();

    /* renamed from: getOutputBuffer */
    java.nio.ByteBuffer mo96255x3c33a717(int i17);

    /* renamed from: getOutputFormat */
    android.media.MediaFormat mo96256x42b80ace();

    /* renamed from: isSoft */
    boolean mo96257xb9a8d074();

    /* renamed from: queueInputBuffer */
    void mo96258xfe5642d9(int i17, int i18, int i19, long j17, int i27);

    /* renamed from: release */
    void mo96259x41012807();

    /* renamed from: releaseOutputBuffer */
    void mo96260xab26be48(int i17, boolean z17);

    /* renamed from: reset */
    void mo96261x6761d4f();

    /* renamed from: setDataSource */
    void mo96262x683d6267(java.lang.String str);

    /* renamed from: signalEndOfInputStream */
    void mo96263x4cb1f740();

    /* renamed from: start */
    void mo96264x68ac462();

    /* renamed from: stop */
    void mo96265x360802();
}
