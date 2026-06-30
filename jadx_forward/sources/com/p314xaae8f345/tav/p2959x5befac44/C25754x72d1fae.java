package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.AudioDecoder */
/* loaded from: classes16.dex */
public class C25754x72d1fae implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb {

    /* renamed from: MAX_RETRY_COUNT */
    private static final int f47908xb7e3a1fd = 10;

    /* renamed from: MAX_WAIT_TIME */
    private static final int f47909xf5307a1c = 1000;

    /* renamed from: SCENE */
    private static final java.lang.String f47910x4b1206c = "tav-audio-decoder";

    /* renamed from: WAIT_TRANSIENT_MS */
    private static final long f47911x979f5225 = 2;

    /* renamed from: nameList */
    private static final java.util.ArrayList<java.lang.String> f47912x6db161c9 = new java.util.ArrayList<>();
    private final java.lang.String TAG;

    /* renamed from: bufferInfo */
    private android.media.MediaCodec.BufferInfo f47913x719a4d0e;

    /* renamed from: currentSampleState */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f47914xd9e64dce;

    /* renamed from: currentStartTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47915xc4f704d6;

    /* renamed from: decodeAudioInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f47916xd5dc7356;

    /* renamed from: decodeBuffer */
    private java.nio.ByteBuffer f47917x6bbd67ce;

    /* renamed from: decoder */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb f47918x5befac44;

    /* renamed from: decoderCreateLock */
    private final java.lang.Object f47919x7a72ffab;

    /* renamed from: decoderFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf f47920x2d4a8826;

    /* renamed from: duration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47921x89444d94;

    /* renamed from: extractor */
    private com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 f47922xf0edce24;

    /* renamed from: extractorDone */
    private boolean f47923xb72b3c6;

    /* renamed from: isReleased */
    private boolean f47924xafdb8087;

    /* renamed from: lastOutputBufferIndex */
    private int f47925xb2824cbb;

    /* renamed from: mLastVideoQueueTime */
    private long f47926xf8a550c6;

    /* renamed from: mTimeOffset */
    private long f47927x3dc8e0d;

    /* renamed from: mediaFormat */
    private android.media.MediaFormat f47928xd571d8fb;

    /* renamed from: outputAudioInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f47929xe20931a3;

    /* renamed from: outputBuffer */
    private java.nio.ByteBuffer f47930xdb4114a1;

    /* renamed from: pFrameTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47931x78118f4a;

    /* renamed from: pendingFrames */
    private java.util.ArrayList<com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.PendingFrame> f47932x2ba2d1d;

    /* renamed from: started */
    private boolean f47933x8eeb4081;

    /* renamed from: timeRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47934x16fae70;

    /* renamed from: trackIndex */
    public int f47935x43ea5e47;

    /* renamed from: com.tencent.tav.decoder.AudioDecoder$PendingFrame */
    /* loaded from: classes16.dex */
    public static class PendingFrame {

        /* renamed from: frameTime */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47937x207df1da;

        /* renamed from: seekStartTime */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47939xff66a2b7;

        /* renamed from: isFirst */
        public boolean f47938x7ab77fa6 = false;

        /* renamed from: timeOffset */
        public long f47940x27aa95c0 = 0;

        public PendingFrame() {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
            this.f47939xff66a2b7 = c25736x76b98a57;
            this.f47937x207df1da = c25736x76b98a57;
        }
    }

    public C25754x72d1fae(java.lang.String str) {
        this(str, null);
    }

    /* renamed from: clearDecoder */
    private void m97338x5a844d37() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "clearDecoder " + mo97358xabff72d6());
        m97347xab26be48();
        if (this.f47932x2ba2d1d.size() != 0 || this.f47923xb72b3c6) {
            try {
                this.f47918x5befac44.mo96252x5d03b04();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "clearDecoder", e17);
            }
            this.f47932x2ba2d1d.clear();
        }
        this.f47914xd9e64dce = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
    }

    /* renamed from: decoderConfigure */
    private synchronized boolean m97339x23f36302(android.media.MediaFormat mediaFormat) {
        int i17 = 0;
        while (true) {
            i17++;
            try {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "createdDecoder---time---" + i17);
                if (i17 > 10) {
                    return false;
                }
                this.f47918x5befac44.mo96248xd00d62e6(mediaFormat, null, null, 0);
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "decoderConfigure", e17);
                if (!(e17 instanceof android.media.MediaCodec.CodecException) || (!((android.media.MediaCodec.CodecException) e17).isTransient() && !((android.media.MediaCodec.CodecException) e17).isRecoverable())) {
                    this.f47918x5befac44.mo96259x41012807();
                    throw e17;
                }
            }
        }
    }

    /* renamed from: dequeueInputBuffer */
    private synchronized int m97340x9a572d5a() {
        try {
            return this.f47918x5befac44.mo96250x9a572d5a(1000L);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "dequeueInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97354xe9f95e2(2L);
                    return m97340x9a572d5a();
                }
            }
            throw e17;
        }
    }

    /* renamed from: dequeueOutputBuffer */
    private synchronized int m97341x436dd5f1() {
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "dequeueOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97354xe9f95e2(2L);
                    return m97341x436dd5f1();
                }
            }
            throw e17;
        }
        return this.f47918x5befac44.mo96251x436dd5f1(this.f47913x719a4d0e, 1000L);
    }

    /* renamed from: doReadSample */
    private synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97342xe881a9cb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "doReadSample - " + this.f47922xf0edce24.m97967xabff72d6());
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97200x360047e = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-2L);
        boolean z18 = true;
        if (!this.f47933x8eeb4081 || this.f47935x43ea5e47 == -1) {
            java.lang.String str = this.TAG;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doReadSample:[failed] !started || trackIndex == -1 ");
            sb6.append(!this.f47933x8eeb4081);
            sb6.append(" - ");
            if (this.f47935x43ea5e47 != -1) {
                z18 = false;
            }
            sb6.append(z18);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str, sb6.toString());
            return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-100L);
        }
        try {
            m97349xab26be48(true);
            long j17 = -2;
            int i17 = 0;
            while (true) {
                if (this.f47932x2ba2d1d.size() <= 0 && this.f47923xb72b3c6) {
                    break;
                }
                try {
                    if (!this.f47923xb72b3c6) {
                        m97346xd0b56fa4();
                    }
                    int m97341x436dd5f1 = m97341x436dd5f1();
                    if (m97341x436dd5f1 == -2) {
                        android.media.MediaFormat mo96256x42b80ace = this.f47918x5befac44.mo96256x42b80ace();
                        if (mo96256x42b80ace.containsKey("pcm-encoding")) {
                            this.f47916xd5dc7356.f47984x2771c84d = mo96256x42b80ace.getInteger("pcm-encoding");
                        } else {
                            this.f47916xd5dc7356.f47984x2771c84d = 2;
                        }
                        if (mo96256x42b80ace.containsKey("sample-rate")) {
                            this.f47916xd5dc7356.f47985x88751aa = mo96256x42b80ace.getInteger("sample-rate");
                        }
                        if (mo96256x42b80ace.containsKey("channel-count")) {
                            this.f47916xd5dc7356.f47983xf99d8dcc = mo96256x42b80ace.getInteger("channel-count");
                        }
                    } else if (m97341x436dd5f1 < 0 || this.f47932x2ba2d1d.size() <= 0) {
                        if (m97341x436dd5f1 >= 0) {
                            if (this.f47913x719a4d0e.flags == 4) {
                                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "doReadSample:[finish] bufferInfo.flags == MediaCodec.BUFFER_FLAG_END_OF_STREAM 2");
                                return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
                            }
                            m97348xab26be48(m97341x436dd5f1, false);
                            m97200x360047e = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-2L);
                        }
                        i17++;
                        if (i17 > 1000) {
                            m97200x360047e = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-4L);
                            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "doReadSample: [timeout] ");
                            break;
                        }
                    } else {
                        android.media.MediaCodec.BufferInfo bufferInfo = this.f47913x719a4d0e;
                        if (bufferInfo.flags == 4) {
                            if (bufferInfo.size > 0) {
                                this.f47932x2ba2d1d.remove(0);
                                this.f47925xb2824cbb = m97341x436dd5f1;
                                java.nio.ByteBuffer m97344x3c33a717 = m97344x3c33a717(m97341x436dd5f1);
                                if (m97344x3c33a717 != null) {
                                    m97344x3c33a717.position(this.f47913x719a4d0e.offset);
                                    android.media.MediaCodec.BufferInfo bufferInfo2 = this.f47913x719a4d0e;
                                    m97344x3c33a717.limit(bufferInfo2.offset + bufferInfo2.size);
                                    this.f47917x6bbd67ce = m97344x3c33a717;
                                } else {
                                    m97348xab26be48(m97341x436dd5f1, false);
                                    this.f47917x6bbd67ce = null;
                                }
                            }
                            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "doReadSample:[finish] bufferInfo.flags == MediaCodec.BUFFER_FLAG_END_OF_STREAM");
                            return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
                        }
                        com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.PendingFrame remove = this.f47932x2ba2d1d.remove(0);
                        j17 = this.f47913x719a4d0e.presentationTimeUs - remove.f47940x27aa95c0;
                        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(j17, 1000000));
                        if (this.f47932x2ba2d1d.size() == 0 && this.f47923xb72b3c6 && remove.f47939xff66a2b7.m97232x31040141() + 1000 >= this.f47921x89444d94.m97232x31040141()) {
                            m97200x360047e = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(this.f47921x89444d94);
                        } else if (remove.f47939xff66a2b7.m97232x31040141() > j17) {
                            m97348xab26be48(m97341x436dd5f1, false);
                            m97200x360047e = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-2L);
                        } else {
                            m97200x360047e = c25735x289c723d;
                        }
                        if (this.f47913x719a4d0e.size > 0) {
                            this.f47925xb2824cbb = m97341x436dd5f1;
                            java.nio.ByteBuffer m97344x3c33a7172 = m97344x3c33a717(m97341x436dd5f1);
                            if (m97344x3c33a7172 == null) {
                                m97348xab26be48(m97341x436dd5f1, false);
                                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "doReadSample:[error] " + this.f47913x719a4d0e.size + " byteBuffer==null");
                                return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L);
                            }
                            m97344x3c33a7172.position(this.f47913x719a4d0e.offset);
                            android.media.MediaCodec.BufferInfo bufferInfo3 = this.f47913x719a4d0e;
                            m97344x3c33a7172.limit(bufferInfo3.offset + bufferInfo3.size);
                            this.f47917x6bbd67ce = m97344x3c33a7172;
                        } else {
                            m97348xab26be48(m97341x436dd5f1, false);
                            m97200x360047e = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-2L);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "doReadSample: error", e17);
                    return ((e17 instanceof android.media.MediaCodec.CodecException) && m97351xd6170d61((android.media.MediaCodec.CodecException) e17)) ? com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97202x360047e(-3L, "catch exception, retry", e17) : com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97202x360047e(-3L, "catch exception", e17);
                }
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "doReadSample:[success] " + this.f47923xb72b3c6 + " " + j17 + "  " + m97200x360047e);
            if (this.f47923xb72b3c6 && j17 < 0) {
                m97200x360047e = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
            }
            return m97200x360047e;
        } catch (java.lang.Exception e18) {
            return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97203xf8c200aa(-3L, -212, "", e18);
        }
    }

    /* renamed from: getInputBuffer */
    private synchronized java.nio.ByteBuffer m97343xaa9f9f74(int i17) {
        try {
            return this.f47918x5befac44.mo96253xaa9f9f74(i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "getInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97354xe9f95e2(2L);
                    return m97343xaa9f9f74(i17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: getOutputBuffer */
    private synchronized java.nio.ByteBuffer m97344x3c33a717(int i17) {
        try {
            return this.f47918x5befac44.mo96255x3c33a717(i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "getOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97354xe9f95e2(2L);
                    return m97344x3c33a717(i17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: queueInputBuffer */
    private synchronized void m97345xfe5642d9(int i17, int i18, int i19, long j17, int i27) {
        try {
            this.f47918x5befac44.mo96258xfe5642d9(i17, i18, i19, j17, i27);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "queueInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97354xe9f95e2(2L);
                    m97345xfe5642d9(i17, i18, i19, j17, i27);
                }
            }
            throw e17;
        }
    }

    /* renamed from: readFromExtractor */
    private synchronized void m97346xd0b56fa4() {
        long m97964xf6c90f8d = this.f47922xf0edce24.m97964xf6c90f8d();
        if (m97964xf6c90f8d < this.f47934x16fae70.m97259x74606f23() && this.f47922xf0edce24.m97965x452c8b07() != -1 && m97964xf6c90f8d != -1) {
            int m97340x9a572d5a = m97340x9a572d5a();
            if (m97340x9a572d5a >= 0) {
                int m97972x416da6aa = this.f47922xf0edce24.m97972x416da6aa(m97343xaa9f9f74(m97340x9a572d5a), 0);
                if (m97972x416da6aa >= 0) {
                    long m97261xccb87a6a = (m97964xf6c90f8d - this.f47934x16fae70.m97261xccb87a6a()) + this.f47927x3dc8e0d;
                    this.f47926xf8a550c6 = m97261xccb87a6a;
                    m97345xfe5642d9(m97340x9a572d5a, 0, m97972x416da6aa, m97261xccb87a6a, 0);
                    com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.PendingFrame pendingFrame = new com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.PendingFrame();
                    pendingFrame.f47940x27aa95c0 = this.f47927x3dc8e0d;
                    pendingFrame.f47937x207df1da = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57((((float) m97964xf6c90f8d) * 1.0f) / ((float) java.util.concurrent.TimeUnit.SECONDS.toMicros(1L)));
                    pendingFrame.f47939xff66a2b7 = this.f47915xc4f704d6.sub(this.f47934x16fae70.m97260x75286aac());
                    if (this.f47932x2ba2d1d.size() == 0) {
                        pendingFrame.f47938x7ab77fa6 = true;
                    }
                    this.f47932x2ba2d1d.add(pendingFrame);
                }
                this.f47922xf0edce24.m97955xbc8da882();
            }
        }
        int m97340x9a572d5a2 = m97340x9a572d5a();
        if (m97340x9a572d5a2 >= 0) {
            m97345xfe5642d9(m97340x9a572d5a2, 0, 0, 0L, 4);
            this.f47923xb72b3c6 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: releaseOutputBuffer */
    public synchronized void m97347xab26be48() {
        m97349xab26be48(false);
    }

    /* renamed from: reset */
    private synchronized void m97350x6761d4f() {
        if (this.f47924xafdb8087) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "reset() called");
        try {
            this.f47918x5befac44.mo96261x6761d4f();
            m97339x23f36302(this.f47928xd571d8fb);
            m97353x68ac462();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "reset: ", e17);
        }
    }

    /* renamed from: retryOnReadSampleError */
    private boolean m97351xd6170d61(android.media.MediaCodec.CodecException codecException) {
        if (codecException.isRecoverable()) {
            m97347xab26be48();
            m97350x6761d4f();
            this.f47925xb2824cbb = -1;
            this.f47932x2ba2d1d.clear();
            this.f47922xf0edce24.m97974xc9fc1b13(this.f47915xc4f704d6.m97232x31040141() - this.f47934x16fae70.m97261xccb87a6a(), 0);
            this.f47923xb72b3c6 = false;
        } else if (!codecException.isTransient()) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "doReadSample:[error] retry failed");
            return true;
        }
        return false;
    }

    /* renamed from: seekExtractorTo */
    private synchronized void m97352x9b1f7e27(long j17) {
        this.f47922xf0edce24.m97974xc9fc1b13(j17, 2);
        if (this.f47922xf0edce24.m97964xf6c90f8d() > j17) {
            this.f47922xf0edce24.m97974xc9fc1b13(j17, 0);
        }
        m97338x5a844d37();
        this.f47927x3dc8e0d = this.f47926xf8a550c6 + 10000000;
    }

    /* renamed from: waitTime */
    private synchronized void m97354xe9f95e2(long j17) {
        try {
            wait(j17);
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "waitTime", e17);
        }
    }

    /* renamed from: finalize */
    public void m97355xd764dc1e() {
        super.finalize();
        m97366x41012807(false);
    }

    /* renamed from: getAudioInfo */
    public com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 m97356xaa00aee() {
        com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984 = this.f47929xe20931a3;
        return c25756x82a4b984 != null ? c25756x82a4b984 : this.f47916xd5dc7356;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo97357xc291ccac() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: getSourcePath */
    public java.lang.String mo97358xabff72d6() {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = this.f47922xf0edce24;
        if (c25820xcadb1d34 == null) {
            return null;
        }
        return c25820xcadb1d34.m97967xabff72d6();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: hasTrack */
    public synchronized boolean mo97359x7c8fed1() {
        return this.f47935x43ea5e47 != -1;
    }

    /* renamed from: isStarted */
    public boolean m97360x6c5c87f7() {
        return this.f47933x8eeb4081;
    }

    /* renamed from: nextFrameTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97361x99ce2827() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = this.f47932x2ba2d1d.size() > 0 ? this.f47932x2ba2d1d.get(0).f47937x207df1da : com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.PendingFrame> it = this.f47932x2ba2d1d.iterator();
        while (it.hasNext()) {
            c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.min(it.next().f47937x207df1da, c25736x76b98a57);
        }
        return c25736x76b98a57;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: outputBuffer */
    public synchronized java.nio.ByteBuffer mo97362xdb4114a1() {
        java.nio.ByteBuffer byteBuffer = this.f47917x6bbd67ce;
        if (byteBuffer == null) {
            return null;
        }
        java.nio.ByteBuffer byteBuffer2 = this.f47930xdb4114a1;
        return byteBuffer2 == null ? byteBuffer : byteBuffer2;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: readSample */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97363xe121b2e0() {
        return mo97364xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: release */
    public synchronized void mo97365x41012807() {
        m97366x41012807(true);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: seekTo */
    public synchronized void mo97367xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "seekTo: " + c25736x76b98a57 + "  - " + this + "  " + this.f47915xc4f704d6 + "  " + this.f47914xd9e64dce);
        if (this.f47933x8eeb4081 && this.f47935x43ea5e47 != -1) {
            if (c25736x76b98a57.m97232x31040141() < 0) {
                c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add = this.f47934x16fae70.m97260x75286aac().add(c25736x76b98a57);
            this.f47915xc4f704d6 = add;
            this.f47923xb72b3c6 = false;
            m97352x9b1f7e27(add.m97232x31040141());
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "seekTo: finish - " + this.f47915xc4f704d6 + "  " + this.f47922xf0edce24.m97964xf6c90f8d());
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "seekTo:failed [started " + this.f47933x8eeb4081 + "] [trackIndex " + this.f47935x43ea5e47 + "]");
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: setLogger */
    public void mo97368x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: start */
    public synchronized void mo97369x68ac462(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        mo97370x68ac462(c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
    }

    public C25754x72d1fae(java.lang.String str, com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf) {
        this.TAG = "AudioDecoder@" + java.lang.Integer.toHexString(hashCode());
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        this.f47921x89444d94 = c25736x76b98a57;
        this.f47933x8eeb4081 = false;
        this.f47932x2ba2d1d = new java.util.ArrayList<>();
        this.f47935x43ea5e47 = -1;
        this.f47924xafdb8087 = false;
        this.f47914xd9e64dce = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
        this.f47916xd5dc7356 = new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984();
        this.f47929xe20931a3 = null;
        this.f47917x6bbd67ce = null;
        this.f47930xdb4114a1 = null;
        this.f47919x7a72ffab = new java.lang.Object();
        this.f47931x78118f4a = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(20L, 600);
        this.f47925xb2824cbb = -1;
        this.f47915xc4f704d6 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;
        this.f47913x719a4d0e = new android.media.MediaCodec.BufferInfo();
        this.f47923xb72b3c6 = false;
        this.f47927x3dc8e0d = 0L;
        this.f47926xf8a550c6 = 0L;
        if (interfaceC25650x9122a0cf != null) {
            this.f47920x2d4a8826 = interfaceC25650x9122a0cf;
        } else {
            this.f47920x2d4a8826 = new com.p314xaae8f345.tav.p2946x5a71016.C25648xd8cdf4a7();
        }
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
        this.f47922xf0edce24 = c25820xcadb1d34;
        c25820xcadb1d34.m97977x683d6267(str);
        while (this.f47922xf0edce24.m97965x452c8b07() != -1) {
            com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d342 = this.f47922xf0edce24;
            c25820xcadb1d342.m97982x5c729176(c25820xcadb1d342.m97965x452c8b07());
        }
        int m97464x334942e1 = com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97464x334942e1(this.f47922xf0edce24, "audio/");
        this.f47935x43ea5e47 = m97464x334942e1;
        if (m97464x334942e1 == -1) {
            this.f47917x6bbd67ce = null;
            return;
        }
        this.f47922xf0edce24.m97975xc3b89af(m97464x334942e1);
        this.f47928xd571d8fb = this.f47922xf0edce24.m97969xe2db7ec(this.f47935x43ea5e47);
        this.f47921x89444d94 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57((((float) this.f47922xf0edce24.m97960xd375d3d4()) * 1.0f) / ((float) java.util.concurrent.TimeUnit.SECONDS.toMicros(1L)));
        if (this.f47928xd571d8fb.containsKey("frame-rate")) {
            this.f47931x78118f4a = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(600 / this.f47928xd571d8fb.getInteger("frame-rate"), 600);
        }
        java.lang.String string = this.f47928xd571d8fb.getString("mime");
        synchronized (this.f47919x7a72ffab) {
            com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb mo96241x741d26aa = this.f47920x2d4a8826.mo96241x741d26aa(string, f47910x4b1206c);
            this.f47918x5befac44 = mo96241x741d26aa;
            mo96241x741d26aa.mo96262x683d6267(this.f47922xf0edce24.m97967xabff72d6());
            f47912x6db161c9.add(this.f47918x5befac44.toString());
            if (m97339x23f36302(this.f47928xd571d8fb)) {
                m97353x68ac462();
            } else {
                throw new java.lang.IllegalStateException("decoderConfigure failed!");
            }
        }
        this.f47916xd5dc7356.f47985x88751aa = this.f47928xd571d8fb.getInteger("sample-rate");
        this.f47916xd5dc7356.f47983xf99d8dcc = this.f47928xd571d8fb.getInteger("channel-count");
        com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984 = new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984();
        c25756x82a4b984.f47983xf99d8dcc = 1;
        c25756x82a4b984.f47985x88751aa = 44100;
        c25756x82a4b984.f47984x2771c84d = 2;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: readSample */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97364xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97342xe881a9cb;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "readSample: " + c25736x76b98a57 + "  -  " + this.f47922xf0edce24.m97964xf6c90f8d());
        m97342xe881a9cb = m97342xe881a9cb(c25736x76b98a57, false);
        this.f47914xd9e64dce = m97342xe881a9cb;
        if (m97342xe881a9cb.m97214x36f88ac9(-1, -4) || !this.f47914xd9e64dce.m97208xfb85bb43().m97238x9f3f7b48(this.f47921x89444d94)) {
            m97338x5a844d37();
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "readSample: finish " + c25736x76b98a57 + "  -  " + this.f47914xd9e64dce);
        return m97342xe881a9cb;
    }

    /* renamed from: releaseOutputBuffer */
    private void m97349xab26be48(boolean z17) {
        int i17 = this.f47925xb2824cbb;
        if (i17 != -1) {
            try {
                m97348xab26be48(i17, false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "releaseOutputBuffer " + z17, e17);
                if (z17) {
                    throw e17;
                }
            }
            this.f47925xb2824cbb = -1;
        }
        this.f47917x6bbd67ce = null;
    }

    /* renamed from: release */
    public synchronized void m97366x41012807(boolean z17) {
        if (this.f47924xafdb8087) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release:start " + z17);
        if (z17) {
            this.f47922xf0edce24.m97958x63a5261f();
            this.f47922xf0edce24 = null;
        }
        this.f47933x8eeb4081 = false;
        this.f47924xafdb8087 = true;
        synchronized (this.f47919x7a72ffab) {
            if (this.f47918x5befac44 != null) {
                new java.lang.Thread() { // from class: com.tencent.tav.decoder.AudioDecoder.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae c25754x72d1fae;
                        com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.this.m97347xab26be48();
                        synchronized (com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.this.f47919x7a72ffab) {
                            try {
                                com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.this.f47918x5befac44.mo96265x360802();
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.this.TAG, "decoder.stop", e17);
                            }
                            try {
                                com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.this.f47918x5befac44.mo96259x41012807();
                                com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.f47912x6db161c9.remove(com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.this.f47918x5befac44.toString());
                                c25754x72d1fae = com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.this;
                            } catch (java.lang.Exception unused) {
                                c25754x72d1fae = com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.this;
                            } catch (java.lang.Throwable th6) {
                                com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.this.f47918x5befac44 = null;
                                throw th6;
                            }
                            c25754x72d1fae.f47918x5befac44 = null;
                            com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae.this.f47918x5befac44 = null;
                        }
                    }
                }.start();
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release:end " + z17);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: start */
    public synchronized void mo97370x68ac462(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "start:" + mo97358xabff72d6() + " [timeRange " + c25738xead39d26 + "] [start " + c25736x76b98a57 + "]");
        if (this.f47935x43ea5e47 == -1) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "start: trackIndex == -1");
            return;
        }
        m97338x5a844d37();
        if (c25738xead39d26 == null) {
            this.f47934x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, this.f47921x89444d94);
        } else {
            this.f47934x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97260x75286aac(), c25738xead39d26.m97256x51e8b0a());
        }
        this.f47923xb72b3c6 = false;
        this.f47933x8eeb4081 = true;
        if (c25736x76b98a57.m97232x31040141() >= 0) {
            mo97367xc9fc1b13(c25736x76b98a57);
        }
    }

    /* renamed from: releaseOutputBuffer */
    private synchronized void m97348xab26be48(int i17, boolean z17) {
        try {
            this.f47918x5befac44.mo96260xab26be48(i17, z17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "releaseOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97354xe9f95e2(2L);
                    m97348xab26be48(i17, z17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: start */
    private synchronized void m97353x68ac462() {
        try {
            this.f47918x5befac44.mo96264x68ac462();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "start", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97354xe9f95e2(2L);
                    m97353x68ac462();
                    return;
                } else if (((android.media.MediaCodec.CodecException) e17).isRecoverable()) {
                    m97350x6761d4f();
                    return;
                }
            }
            mo97365x41012807();
            throw e17;
        }
    }
}
