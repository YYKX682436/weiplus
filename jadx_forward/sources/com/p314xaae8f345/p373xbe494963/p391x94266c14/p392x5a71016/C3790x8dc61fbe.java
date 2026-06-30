package com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016;

/* renamed from: com.tencent.liteav.extensions.codec.AacMediaCodecWrapper */
/* loaded from: classes13.dex */
public class C3790x8dc61fbe {

    /* renamed from: a, reason: collision with root package name */
    final java.lang.String f128003a;

    /* renamed from: b, reason: collision with root package name */
    android.media.MediaCodec f128004b;

    /* renamed from: c, reason: collision with root package name */
    android.media.MediaFormat f128005c;

    /* renamed from: d, reason: collision with root package name */
    int f128006d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final int f128007e;

    /* renamed from: f, reason: collision with root package name */
    private final android.media.MediaCodec.BufferInfo f128008f;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.tencent.liteav.extensions.codec.AacMediaCodecWrapper$a */
    /* loaded from: classes13.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f128009a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f128010b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ int[] f128011c = {1, 2};
    }

    public C3790x8dc61fbe(int i17) {
        this.f128007e = i17;
        this.f128003a = i17 == com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016.C3790x8dc61fbe.a.f128009a ? "HardwareAacEncoder" : "HardwareAacDecoder";
        this.f128008f = new android.media.MediaCodec.BufferInfo();
    }

    private java.nio.ByteBuffer b() {
        try {
            int dequeueOutputBuffer = this.f128004b.dequeueOutputBuffer(this.f128008f, java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(5L));
            if (dequeueOutputBuffer == -1) {
                return null;
            }
            if (dequeueOutputBuffer == -3) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(this.f128003a, "codec output buffers changed.", new java.lang.Object[0]);
                return null;
            }
            if (dequeueOutputBuffer == -2) {
                this.f128005c = this.f128004b.getOutputFormat();
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(this.f128003a, "codec output format changed: " + this.f128005c, new java.lang.Object[0]);
                return null;
            }
            if (dequeueOutputBuffer < 0) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(this.f128003a, "unexpected result from dequeueOutputBuffer: ".concat(java.lang.String.valueOf(dequeueOutputBuffer)), new java.lang.Object[0]);
                return null;
            }
            java.nio.ByteBuffer outputBuffer = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 21 ? this.f128004b.getOutputBuffer(dequeueOutputBuffer) : this.f128004b.getOutputBuffers()[dequeueOutputBuffer];
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f128008f.size);
            allocateDirect.put(outputBuffer);
            this.f128004b.releaseOutputBuffer(dequeueOutputBuffer, false);
            int i17 = this.f128006d;
            if (i17 > 0) {
                this.f128006d = i17 - 1;
            }
            return allocateDirect;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(this.f128003a, "dequeueOutputBuffer failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            return null;
        }
    }

    public final boolean a(android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return false;
        }
        try {
            boolean z17 = this.f128007e == com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016.C3790x8dc61fbe.a.f128009a;
            if (this.f128004b == null) {
                if (z17) {
                    this.f128004b = android.media.MediaCodec.createEncoderByType("audio/mp4a-latm");
                } else {
                    this.f128004b = android.media.MediaCodec.createDecoderByType("audio/mp4a-latm");
                }
            }
            this.f128004b.configure(mediaFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, z17 ? 1 : 0);
            this.f128004b.start();
            return true;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(this.f128003a, "create codec failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            a();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* renamed from: processFrame */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.nio.ByteBuffer m29711x756f483e(java.nio.ByteBuffer r15) {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.f128004b
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
            android.media.MediaCodec r4 = r14.f128004b     // Catch: java.lang.Exception -> L48
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
            android.media.MediaCodec r7 = r14.f128004b     // Catch: java.lang.Exception -> L48
            r9 = 0
            r11 = 0
            r13 = 0
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch: java.lang.Exception -> L48
            int r15 = r14.f128006d     // Catch: java.lang.Exception -> L48
            int r15 = r15 + r2
            r14.f128006d = r15     // Catch: java.lang.Exception -> L48
            goto L5a
        L3e:
            java.lang.String r15 = r14.f128003a     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = "get invalid input buffers."
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L48
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(r15, r0, r4)     // Catch: java.lang.Exception -> L48
            goto L5a
        L48:
            r15 = move-exception
            java.lang.String r0 = r14.f128003a
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r4 = "feedData failed. "
            java.lang.String r15 = r4.concat(r15)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(r0, r15, r4)
        L5a:
            int r15 = r14.f128007e
            int r0 = com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016.C3790x8dc61fbe.a.f128010b
            if (r15 != r0) goto L66
            int r15 = r14.f128006d
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016.C3790x8dc61fbe.m29711x756f483e(java.nio.ByteBuffer):java.nio.ByteBuffer");
    }

    public final void a() {
        android.media.MediaCodec mediaCodec = this.f128004b;
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(this.f128003a, "codec stop failed.".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
        }
        try {
            this.f128004b.release();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(this.f128003a, "codec release failed.".concat(java.lang.String.valueOf(e18)), new java.lang.Object[0]);
        }
        this.f128004b = null;
        this.f128006d = 0;
    }
}
