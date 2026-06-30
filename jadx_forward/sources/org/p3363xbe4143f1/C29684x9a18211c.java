package org.p3363xbe4143f1;

/* renamed from: org.libpag.HardwareDecoder */
/* loaded from: classes13.dex */
class C29684x9a18211c {

    /* renamed from: f, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f429283f = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private android.media.MediaCodec f429285b;

    /* renamed from: a, reason: collision with root package name */
    private org.p3363xbe4143f1.C29714x928fd3d2 f429284a = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f429286c = true;

    /* renamed from: d, reason: collision with root package name */
    private android.media.MediaCodec.BufferInfo f429287d = new android.media.MediaCodec.BufferInfo();

    /* renamed from: e, reason: collision with root package name */
    private int f429288e = -1;

    /* renamed from: org.libpag.HardwareDecoder$a */
    /* loaded from: classes13.dex */
    public class a implements org.libpag.d.b {

        /* renamed from: a, reason: collision with root package name */
        private android.media.MediaCodec f429289a;

        /* renamed from: b, reason: collision with root package name */
        private long f429290b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.media.MediaFormat f429291c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ org.p3363xbe4143f1.C29714x928fd3d2 f429292d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ android.media.MediaCodec[] f429293e;

        public a(android.media.MediaFormat mediaFormat, org.p3363xbe4143f1.C29714x928fd3d2 c29714x928fd3d2, android.media.MediaCodec[] mediaCodecArr) {
            this.f429291c = mediaFormat;
            this.f429292d = c29714x928fd3d2;
            this.f429293e = mediaCodecArr;
        }

        @Override // org.libpag.d.b
        public void a(boolean z17) {
            if (z17 && this.f429289a != null) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f429290b;
                try {
                    this.f429289a.stop();
                } catch (java.lang.Exception unused) {
                }
                try {
                    this.f429289a.release();
                } catch (java.lang.Exception unused2) {
                }
                this.f429289a = null;
                this.f429292d.a();
                new java.lang.RuntimeException("init decoder timeout. cost: " + uptimeMillis + "ms");
            }
            if (!z17) {
                this.f429293e[0] = this.f429289a;
            }
            org.p3363xbe4143f1.C29684x9a18211c.f429283f.getAndDecrement();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f429290b = android.os.SystemClock.uptimeMillis();
            try {
                android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(this.f429291c.getString("mime"));
                this.f429289a = createDecoderByType;
                createDecoderByType.configure(this.f429291c, this.f429292d.m155010x2d4747f9(), (android.media.MediaCrypto) null, 0);
                this.f429289a.start();
            } catch (java.lang.Exception unused) {
                android.media.MediaCodec mediaCodec = this.f429289a;
                if (mediaCodec != null) {
                    mediaCodec.release();
                    this.f429289a = null;
                    this.f429292d.a();
                }
            }
        }
    }

    /* renamed from: Create */
    private static org.p3363xbe4143f1.C29684x9a18211c m154620x78ca8d1c(android.media.MediaFormat mediaFormat) {
        org.p3363xbe4143f1.C29714x928fd3d2 a17;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f429283f;
        if (atomicInteger.get() >= 10 || (a17 = org.p3363xbe4143f1.C29714x928fd3d2.a(mediaFormat.getInteger("width"), mediaFormat.getInteger("height"))) == null) {
            return null;
        }
        atomicInteger.getAndIncrement();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("libpag_GPUDecoder_init_decoder");
        try {
            handlerThread.start();
            android.media.MediaCodec[] mediaCodecArr = {null};
            boolean a18 = new org.p3363xbe4143f1.d(handlerThread.getLooper()).a(new org.p3363xbe4143f1.C29684x9a18211c.a(mediaFormat, a17, mediaCodecArr), 2000L);
            handlerThread.quitSafely();
            if (!a18) {
                return null;
            }
            org.p3363xbe4143f1.C29684x9a18211c c29684x9a18211c = new org.p3363xbe4143f1.C29684x9a18211c();
            c29684x9a18211c.f429284a = a17;
            c29684x9a18211c.f429285b = mediaCodecArr[0];
            return c29684x9a18211c;
        } catch (java.lang.Error | java.lang.Exception unused) {
            f429283f.getAndDecrement();
            return null;
        }
    }

    /* renamed from: dequeueInputBuffer */
    private int m154622x9a572d5a() {
        try {
            return this.f429285b.dequeueInputBuffer(1000L);
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -1;
        }
    }

    /* renamed from: dequeueOutputBuffer */
    private int m154623x436dd5f1() {
        try {
            return this.f429285b.dequeueOutputBuffer(this.f429287d, 1000L);
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    /* renamed from: getInputBuffer */
    private java.nio.ByteBuffer m154624xaa9f9f74(int i17) {
        try {
            return this.f429285b.getInputBuffer(i17);
        } catch (java.lang.Error | java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: getVideoSurface */
    private org.p3363xbe4143f1.C29714x928fd3d2 m154625xe9b71228() {
        return this.f429284a;
    }

    /* renamed from: onDecodeFrame */
    private int m154626x624fb4c0() {
        m154635xab26be48();
        try {
            int m154623x436dd5f1 = m154623x436dd5f1();
            if ((this.f429287d.flags & 4) == 0) {
                if (m154623x436dd5f1 >= 0) {
                    this.f429288e = m154623x436dd5f1;
                }
                return this.f429288e != -1 ? 0 : -1;
            }
            if (m154623x436dd5f1 < 0) {
                return -3;
            }
            this.f429288e = m154623x436dd5f1;
            return -3;
        } catch (java.lang.Exception unused) {
            return -2;
        }
    }

    /* renamed from: onEndOfStream */
    private int m154627x7385b6d3() {
        int m154622x9a572d5a = m154622x9a572d5a();
        if (m154622x9a572d5a >= 0) {
            return m154633xfe5642d9(m154622x9a572d5a, 0, 0, 0L, 4);
        }
        return -1;
    }

    /* renamed from: onFlush */
    private void m154628xaf961065() {
        if (this.f429286c) {
            return;
        }
        try {
            this.f429285b.flush();
            this.f429287d = new android.media.MediaCodec.BufferInfo();
            this.f429288e = -1;
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: onRelease */
    private void m154629x90a72928() {
        if (this.f429285b == null) {
            return;
        }
        m154635xab26be48();
        try {
            this.f429285b.stop();
        } catch (java.lang.Exception unused) {
        }
        try {
            this.f429285b.release();
        } catch (java.lang.Exception unused2) {
        }
        this.f429285b = null;
        this.f429284a.a();
    }

    /* renamed from: onRenderFrame */
    private boolean m154630xba2a8e18() {
        int i17 = this.f429288e;
        if (i17 == -1) {
            return false;
        }
        int m154634xab26be48 = m154634xab26be48(i17, true);
        this.f429288e = -1;
        return m154634xab26be48 == 0;
    }

    /* renamed from: onSendBytes */
    private int m154631xfe2bb2a4(java.nio.ByteBuffer byteBuffer, long j17) {
        int m154622x9a572d5a = m154622x9a572d5a();
        if (m154622x9a572d5a < 0) {
            return -1;
        }
        java.nio.ByteBuffer m154624xaa9f9f74 = m154624xaa9f9f74(m154622x9a572d5a);
        if (m154624xaa9f9f74 == null) {
            return -2;
        }
        m154624xaa9f9f74.clear();
        byteBuffer.position(0);
        m154624xaa9f9f74.put(byteBuffer);
        return m154633xfe5642d9(m154622x9a572d5a, 0, byteBuffer.limit(), j17, 0);
    }

    /* renamed from: presentationTime */
    private long m154632x5f89a907() {
        return this.f429287d.presentationTimeUs;
    }

    /* renamed from: queueInputBuffer */
    private int m154633xfe5642d9(int i17, int i18, int i19, long j17, int i27) {
        try {
            this.f429285b.queueInputBuffer(i17, i18, i19, j17, i27);
            this.f429286c = false;
            return 0;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -2;
        }
    }

    /* renamed from: releaseOutputBuffer */
    private void m154635xab26be48() {
        int i17 = this.f429288e;
        if (i17 != -1) {
            m154634xab26be48(i17, false);
            this.f429288e = -1;
        }
    }

    /* renamed from: releaseOutputBuffer */
    private int m154634xab26be48(int i17, boolean z17) {
        try {
            this.f429285b.releaseOutputBuffer(i17, z17);
            return 0;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -2;
        }
    }
}
