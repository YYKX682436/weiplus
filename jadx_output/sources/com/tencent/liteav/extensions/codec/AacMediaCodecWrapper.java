package com.tencent.liteav.extensions.codec;

/* loaded from: classes13.dex */
public class AacMediaCodecWrapper {

    /* renamed from: a, reason: collision with root package name */
    final java.lang.String f46470a;

    /* renamed from: b, reason: collision with root package name */
    android.media.MediaCodec f46471b;

    /* renamed from: c, reason: collision with root package name */
    android.media.MediaFormat f46472c;

    /* renamed from: d, reason: collision with root package name */
    int f46473d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final int f46474e;

    /* renamed from: f, reason: collision with root package name */
    private final android.media.MediaCodec.BufferInfo f46475f;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes13.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f46476a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f46477b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ int[] f46478c = {1, 2};
    }

    public AacMediaCodecWrapper(int i17) {
        this.f46474e = i17;
        this.f46470a = i17 == com.tencent.liteav.extensions.codec.AacMediaCodecWrapper.a.f46476a ? "HardwareAacEncoder" : "HardwareAacDecoder";
        this.f46475f = new android.media.MediaCodec.BufferInfo();
    }

    private java.nio.ByteBuffer b() {
        try {
            int dequeueOutputBuffer = this.f46471b.dequeueOutputBuffer(this.f46475f, java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(5L));
            if (dequeueOutputBuffer == -1) {
                return null;
            }
            if (dequeueOutputBuffer == -3) {
                com.tencent.liteav.base.Log.i(this.f46470a, "codec output buffers changed.", new java.lang.Object[0]);
                return null;
            }
            if (dequeueOutputBuffer == -2) {
                this.f46472c = this.f46471b.getOutputFormat();
                com.tencent.liteav.base.Log.i(this.f46470a, "codec output format changed: " + this.f46472c, new java.lang.Object[0]);
                return null;
            }
            if (dequeueOutputBuffer < 0) {
                com.tencent.liteav.base.Log.e(this.f46470a, "unexpected result from dequeueOutputBuffer: ".concat(java.lang.String.valueOf(dequeueOutputBuffer)), new java.lang.Object[0]);
                return null;
            }
            java.nio.ByteBuffer outputBuffer = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.f46471b.getOutputBuffer(dequeueOutputBuffer) : this.f46471b.getOutputBuffers()[dequeueOutputBuffer];
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f46475f.size);
            allocateDirect.put(outputBuffer);
            this.f46471b.releaseOutputBuffer(dequeueOutputBuffer, false);
            int i17 = this.f46473d;
            if (i17 > 0) {
                this.f46473d = i17 - 1;
            }
            return allocateDirect;
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.Log.e(this.f46470a, "dequeueOutputBuffer failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            return null;
        }
    }

    public final boolean a(android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return false;
        }
        try {
            boolean z17 = this.f46474e == com.tencent.liteav.extensions.codec.AacMediaCodecWrapper.a.f46476a;
            if (this.f46471b == null) {
                if (z17) {
                    this.f46471b = android.media.MediaCodec.createEncoderByType("audio/mp4a-latm");
                } else {
                    this.f46471b = android.media.MediaCodec.createDecoderByType("audio/mp4a-latm");
                }
            }
            this.f46471b.configure(mediaFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, z17 ? 1 : 0);
            this.f46471b.start();
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.liteav.base.Log.e(this.f46470a, "create codec failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            a();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.nio.ByteBuffer processFrame(java.nio.ByteBuffer r15) {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.f46471b
            r1 = 0
            if (r0 == 0) goto L73
            if (r15 != 0) goto L9
            goto L73
        L9:
            r2 = 1
            r3 = 0
            java.nio.ByteBuffer[] r0 = r0.getInputBuffers()     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto L3e
            int r4 = r0.length     // Catch: java.lang.Exception -> L48
            if (r4 > 0) goto L15
            goto L3e
        L15:
            android.media.MediaCodec r4 = r14.f46471b     // Catch: java.lang.Exception -> L48
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L48
            r6 = 5
            long r5 = r5.toMicros(r6)     // Catch: java.lang.Exception -> L48
            int r8 = r4.dequeueInputBuffer(r5)     // Catch: java.lang.Exception -> L48
            if (r8 >= 0) goto L26
            goto L5a
        L26:
            int r10 = r15.remaining()     // Catch: java.lang.Exception -> L48
            r0 = r0[r8]     // Catch: java.lang.Exception -> L48
            r0.put(r15)     // Catch: java.lang.Exception -> L48
            android.media.MediaCodec r7 = r14.f46471b     // Catch: java.lang.Exception -> L48
            r9 = 0
            r11 = 0
            r13 = 0
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch: java.lang.Exception -> L48
            int r15 = r14.f46473d     // Catch: java.lang.Exception -> L48
            int r15 = r15 + r2
            r14.f46473d = r15     // Catch: java.lang.Exception -> L48
            goto L5a
        L3e:
            java.lang.String r15 = r14.f46470a     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = "get invalid input buffers."
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L48
            com.tencent.liteav.base.Log.e(r15, r0, r4)     // Catch: java.lang.Exception -> L48
            goto L5a
        L48:
            r15 = move-exception
            java.lang.String r0 = r14.f46470a
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r4 = "feedData failed. "
            java.lang.String r15 = r4.concat(r15)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.liteav.base.Log.e(r0, r15, r4)
        L5a:
            int r15 = r14.f46474e
            int r0 = com.tencent.liteav.extensions.codec.AacMediaCodecWrapper.a.f46477b
            if (r15 != r0) goto L66
            int r15 = r14.f46473d
            r0 = 2
            if (r15 > r0) goto L66
            goto L67
        L66:
            r2 = 3
        L67:
            if (r3 >= r2) goto L73
            java.nio.ByteBuffer r15 = r14.b()
            if (r15 == 0) goto L70
            return r15
        L70:
            int r3 = r3 + 1
            goto L67
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.extensions.codec.AacMediaCodecWrapper.processFrame(java.nio.ByteBuffer):java.nio.ByteBuffer");
    }

    public final void a() {
        android.media.MediaCodec mediaCodec = this.f46471b;
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.Log.e(this.f46470a, "codec stop failed.".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
        }
        try {
            this.f46471b.release();
        } catch (java.lang.Exception e18) {
            com.tencent.liteav.base.Log.e(this.f46470a, "codec release failed.".concat(java.lang.String.valueOf(e18)), new java.lang.Object[0]);
        }
        this.f46471b = null;
        this.f46473d = 0;
    }
}
