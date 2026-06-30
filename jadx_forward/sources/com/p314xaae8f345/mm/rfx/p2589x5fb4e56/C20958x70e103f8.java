package com.p314xaae8f345.mm.rfx.p2589x5fb4e56;

/* renamed from: com.tencent.mm.rfx.inner.RfxHardwareDecoder */
/* loaded from: classes14.dex */
public class C20958x70e103f8 {

    /* renamed from: DECODER_THREAD_MAX_COUNT */
    private static final int f39142xc58a50fa = 10;

    /* renamed from: END_OF_STREAM */
    private static final int f39143x31fa6064 = -3;

    /* renamed from: ERROR */
    private static final int f39144x3f2d9e8 = -2;

    /* renamed from: INIT_DECODER_TIMEOUT_MS */
    private static final int f39145x444b0fee = 2000;

    /* renamed from: SUCCESS */
    private static final int f39146xbb80cbe3 = 0;

    /* renamed from: TIMEOUT_US */
    private static final int f39147x7c09825c = 1000;

    /* renamed from: TRY_AGAIN_LATER */
    private static final int f39148x33190c09 = -1;

    /* renamed from: decoderThreadCount */
    private static final java.util.concurrent.atomic.AtomicInteger f39149x63f2f241 = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: decoder */
    private android.media.MediaCodec f39151x5befac44;

    /* renamed from: videoSurface */
    private com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20960x26a13e76 f39155x88c47fb2 = null;

    /* renamed from: disableFlush */
    private boolean f39152xc3d8b8fc = true;

    /* renamed from: bufferInfo */
    private android.media.MediaCodec.BufferInfo f39150x719a4d0e = new android.media.MediaCodec.BufferInfo();

    /* renamed from: lastOutputBufferIndex */
    private int f39153xb2824cbb = -1;

    /* renamed from: released */
    private boolean f39154xdf23d93d = false;

    /* renamed from: Create */
    private static com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20958x70e103f8 m77595x78ca8d1c(com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20960x26a13e76 c20960x26a13e76, android.media.MediaFormat mediaFormat) {
        if (c20960x26a13e76 != null) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = f39149x63f2f241;
            if (atomicInteger.get() < 10) {
                c20960x26a13e76.m77652xc84df105();
                atomicInteger.getAndIncrement();
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("rfxpag_RfxHardwareDecoder_init_decoder");
                handlerThread.start();
                com.p314xaae8f345.mm.rfx.p2589x5fb4e56.j jVar = new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.j(handlerThread.getLooper());
                boolean z17 = true;
                android.media.MediaCodec[] mediaCodecArr = {null};
                com.p314xaae8f345.mm.rfx.p2589x5fb4e56.c cVar = new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.c(mediaFormat, c20960x26a13e76, mediaCodecArr);
                if (android.os.Looper.myLooper() != jVar.getLooper()) {
                    com.p314xaae8f345.mm.rfx.p2589x5fb4e56.h hVar = new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.h(cVar);
                    if (jVar.post(hVar)) {
                        synchronized (hVar) {
                            long uptimeMillis = android.os.SystemClock.uptimeMillis() + 2000;
                            while (!hVar.f273775e) {
                                long uptimeMillis2 = uptimeMillis - android.os.SystemClock.uptimeMillis();
                                if (uptimeMillis2 <= 0) {
                                    hVar.f273776f = true;
                                } else {
                                    try {
                                        hVar.wait(uptimeMillis2);
                                    } catch (java.lang.InterruptedException unused) {
                                    }
                                }
                            }
                        }
                    }
                    z17 = false;
                    break;
                }
                cVar.run();
                handlerThread.quitSafely();
                if (!z17) {
                    return null;
                }
                com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20958x70e103f8 c20958x70e103f8 = new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20958x70e103f8();
                c20958x70e103f8.f39155x88c47fb2 = c20960x26a13e76;
                c20958x70e103f8.f39151x5befac44 = mediaCodecArr[0];
                return c20958x70e103f8;
            }
        }
        return null;
    }

    /* renamed from: ForceSoftwareDecoder */
    private static boolean m77596x59f1d652() {
        return false;
    }

    /* renamed from: dequeueInputBuffer */
    private int m77601x9a572d5a() {
        try {
            return this.f39151x5befac44.dequeueInputBuffer(1000L);
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -1;
        }
    }

    /* renamed from: dequeueOutputBuffer */
    private int m77602x436dd5f1() {
        try {
            return this.f39151x5befac44.dequeueOutputBuffer(this.f39150x719a4d0e, 1000L);
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    /* renamed from: getInputBuffer */
    private java.nio.ByteBuffer m77603xaa9f9f74(int i17) {
        try {
            return this.f39151x5befac44.getInputBuffer(i17);
        } catch (java.lang.Error | java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: onDecodeFrame */
    private int m77604x624fb4c0() {
        m77615xab26be48();
        try {
            int m77602x436dd5f1 = m77602x436dd5f1();
            if ((this.f39150x719a4d0e.flags & 4) == 0) {
                if (m77602x436dd5f1 >= 0) {
                    this.f39153xb2824cbb = m77602x436dd5f1;
                }
                return this.f39153xb2824cbb != -1 ? 0 : -1;
            }
            if (m77602x436dd5f1 < 0) {
                return -3;
            }
            this.f39153xb2824cbb = m77602x436dd5f1;
            return -3;
        } catch (java.lang.Exception unused) {
            return -2;
        }
    }

    /* renamed from: onEndOfStream */
    private int m77605x7385b6d3() {
        int m77601x9a572d5a = m77601x9a572d5a();
        if (m77601x9a572d5a >= 0) {
            return m77611xfe5642d9(m77601x9a572d5a, 0, 0, 0L, 4);
        }
        return -1;
    }

    /* renamed from: onFlush */
    private void m77606xaf961065() {
        if (this.f39152xc3d8b8fc) {
            return;
        }
        try {
            this.f39151x5befac44.flush();
            this.f39150x719a4d0e = new android.media.MediaCodec.BufferInfo();
            this.f39153xb2824cbb = -1;
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: onRelease */
    private void m77607x90a72928() {
        if (this.f39154xdf23d93d) {
            return;
        }
        this.f39154xdf23d93d = true;
        m77615xab26be48();
        m77613x9132563d();
    }

    /* renamed from: onRenderFrame */
    private boolean m77608xba2a8e18() {
        int i17 = this.f39153xb2824cbb;
        if (i17 == -1) {
            return false;
        }
        int m77614xab26be48 = m77614xab26be48(i17, true);
        this.f39153xb2824cbb = -1;
        return m77614xab26be48 == 0;
    }

    /* renamed from: onSendBytes */
    private int m77609xfe2bb2a4(java.nio.ByteBuffer byteBuffer, long j17) {
        int m77601x9a572d5a = m77601x9a572d5a();
        if (m77601x9a572d5a < 0) {
            return -1;
        }
        java.nio.ByteBuffer m77603xaa9f9f74 = m77603xaa9f9f74(m77601x9a572d5a);
        if (m77603xaa9f9f74 == null) {
            return -2;
        }
        m77603xaa9f9f74.clear();
        byteBuffer.position(0);
        m77603xaa9f9f74.put(byteBuffer);
        return m77611xfe5642d9(m77601x9a572d5a, 0, byteBuffer.limit(), j17, 0);
    }

    /* renamed from: presentationTime */
    private long m77610x5f89a907() {
        return this.f39150x719a4d0e.presentationTimeUs;
    }

    /* renamed from: queueInputBuffer */
    private int m77611xfe5642d9(int i17, int i18, int i19, long j17, int i27) {
        try {
            this.f39151x5befac44.queueInputBuffer(i17, i18, i19, j17, i27);
            this.f39152xc3d8b8fc = false;
            return 0;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -2;
        }
    }

    /* renamed from: releaseAsync */
    private void m77612x8933d6b5(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f39149x63f2f241.getAndIncrement();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("rfxpag_RfxHardwareDecoder_release_decoder");
        handlerThread.start();
        new android.os.Handler(handlerThread.getLooper()).post(new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.f(this, runnable, handlerThread));
    }

    /* renamed from: releaseDecoder */
    private void m77613x9132563d() {
        if (this.f39151x5befac44 == null) {
            return;
        }
        m77612x8933d6b5(new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.d(this));
    }

    /* renamed from: releaseOutputBuffer */
    private void m77615xab26be48() {
        int i17 = this.f39153xb2824cbb;
        if (i17 != -1) {
            m77614xab26be48(i17, false);
            this.f39153xb2824cbb = -1;
        }
    }

    /* renamed from: releaseOutputBuffer */
    private int m77614xab26be48(int i17, boolean z17) {
        try {
            this.f39151x5befac44.releaseOutputBuffer(i17, z17);
            return 0;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -2;
        }
    }
}
