package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.MediaCodecWrapper */
/* loaded from: classes16.dex */
class C25775xcbb53581 {

    /* renamed from: MAX_RETRY_COUNT */
    private static final int f48176xb7e3a1fd = 10;

    /* renamed from: SCENE */
    private static final java.lang.String f48177x4b1206c = "tav-video-decoder";

    /* renamed from: WAIT_TRANSIENT_MS */
    private static final long f48178x979f5225 = 20;
    private final java.lang.String TAG = "MediaCodecWrapper@" + java.lang.Integer.toHexString(hashCode());

    /* renamed from: mediaCodec */
    private com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 f48179x7212fe92;

    /* renamed from: videoDecoder */
    private final com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369 f48180x532a3f49;

    public C25775xcbb53581(com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369 c25783x5cf59369) {
        this.f48180x532a3f49 = c25783x5cf59369;
    }

    /* renamed from: isLollipop */
    private boolean m97596x51f90155() {
        return true;
    }

    /* renamed from: resetMediaCodec */
    private void m97597xaeade141(android.media.MediaFormat mediaFormat) {
        if (m97596x51f90155()) {
            this.f48179x7212fe92.mo96261x6761d4f();
            return;
        }
        try {
            this.f48179x7212fe92.mo96265x360802();
        } catch (java.lang.Exception unused) {
        }
        this.f48179x7212fe92.mo96259x41012807();
        this.f48179x7212fe92 = com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61.m96271x1c769f9(mediaFormat.getString("mime"), f48177x4b1206c);
    }

    /* renamed from: tryLogMediaCodecError */
    private void m97598x616377cd(android.media.MediaCodec.CodecException codecException) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "CodecException - isTransient = " + codecException.isTransient() + " , isRecoverable = " + codecException.isRecoverable() + " , errorCode = " + codecException.getErrorCode());
    }

    /* renamed from: decoderConfigure */
    public synchronized boolean m97599x23f36302(android.media.MediaFormat mediaFormat, android.view.Surface surface) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f48179x7212fe92 = com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61.m96271x1c769f9(mediaFormat.getString("mime"), f48177x4b1206c);
        int i17 = 0;
        while (true) {
            i17++;
            try {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "createdDecoder---time---" + i17);
                if (i17 > 10) {
                    return false;
                }
                this.f48179x7212fe92.mo96248xd00d62e6(mediaFormat, surface, null, 0);
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "decoderConfigure cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "decoderConfigure", e17);
                if (!(e17 instanceof android.media.MediaCodec.CodecException) || (!((android.media.MediaCodec.CodecException) e17).isTransient() && !((android.media.MediaCodec.CodecException) e17).isRecoverable())) {
                    this.f48179x7212fe92.mo96259x41012807();
                    throw e17;
                }
            }
        }
    }

    /* renamed from: dequeueInputBuffer */
    public synchronized int m97600x9a572d5a() {
        try {
            return this.f48179x7212fe92.mo96250x9a572d5a(1000L);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "dequeueInputBuffer", e17);
            if (m97596x51f90155() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                m97598x616377cd((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97611xe9f95e2(20L);
                    return m97600x9a572d5a();
                }
            }
            throw e17;
        }
    }

    /* renamed from: dequeueOutputBuffer */
    public synchronized int m97601x436dd5f1(android.media.MediaCodec.BufferInfo bufferInfo) {
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "dequeueOutputBuffer", e17);
            if (m97596x51f90155() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                m97598x616377cd((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97611xe9f95e2(20L);
                    return m97601x436dd5f1(bufferInfo);
                }
            }
            throw e17;
        }
        return this.f48179x7212fe92.mo96251x436dd5f1(bufferInfo, 1000L);
    }

    /* renamed from: flushDecoder */
    public void m97602x14345ca0() {
        this.f48179x7212fe92.mo96252x5d03b04();
    }

    /* renamed from: getInputBuffer */
    public synchronized java.nio.ByteBuffer m97603xaa9f9f74(int i17) {
        try {
            return com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97465xaa9f9f74(this.f48179x7212fe92, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "getInputBuffer", e17);
            if (m97596x51f90155() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                m97598x616377cd((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97611xe9f95e2(20L);
                    return m97603xaa9f9f74(i17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: getOnputBuffer */
    public synchronized java.nio.ByteBuffer m97604x27fbcffa(int i17) {
        try {
            return com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97467x3c33a717(this.f48179x7212fe92, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "getOutputBuffer", e17);
            if (m97596x51f90155() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                m97598x616377cd((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97611xe9f95e2(20L);
                    return m97604x27fbcffa(i17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: getOutputFormat */
    public synchronized android.media.MediaFormat m97605x42b80ace() {
        try {
        } catch (java.lang.Exception e17) {
            e17.toString();
            return null;
        }
        return this.f48179x7212fe92.mo96256x42b80ace();
    }

    /* renamed from: queueInputBuffer */
    public synchronized void m97606xfe5642d9(int i17, int i18, int i19, long j17, int i27) {
        try {
            this.f48179x7212fe92.mo96258xfe5642d9(i17, i18, i19, j17, i27);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "queueInputBuffer", e17);
            if (m97596x51f90155() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                m97598x616377cd((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97611xe9f95e2(20L);
                    m97606xfe5642d9(i17, i18, i19, j17, i27);
                }
            }
            throw e17;
        }
    }

    /* renamed from: release */
    public void m97607x41012807() {
        if (this.f48179x7212fe92 != null) {
            new java.lang.Thread() { // from class: com.tencent.tav.decoder.MediaCodecWrapper.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        com.p314xaae8f345.tav.p2959x5befac44.C25775xcbb53581.this.f48180x532a3f49.m97673xab26be48();
                        com.p314xaae8f345.tav.p2959x5befac44.C25775xcbb53581.this.f48179x7212fe92.mo96265x360802();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2959x5befac44.C25775xcbb53581.this.TAG, "mediaCodec.stop", e17);
                    }
                    try {
                        try {
                            com.p314xaae8f345.tav.p2959x5befac44.C25775xcbb53581.this.f48179x7212fe92.mo96259x41012807();
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2959x5befac44.C25775xcbb53581.this.TAG, "mediaCodec.release", e18);
                        }
                        com.p314xaae8f345.tav.p2959x5befac44.C25775xcbb53581.this.f48179x7212fe92 = null;
                    } finally {
                        com.p314xaae8f345.tav.p2959x5befac44.C25775xcbb53581.this.f48179x7212fe92 = null;
                    }
                }
            }.start();
        }
    }

    /* renamed from: releaseOutputBuffer */
    public synchronized void m97608xab26be48(int i17, boolean z17) {
        try {
            this.f48179x7212fe92.mo96260xab26be48(i17, z17);
            if (z17) {
                this.f48180x532a3f49.f48229xfbcf7dc5 = true;
            }
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "releaseOutputBuffer", e17);
            if (m97596x51f90155() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                m97598x616377cd((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97611xe9f95e2(20L);
                    m97608xab26be48(i17, z17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: reset */
    public synchronized void m97609x6761d4f(android.view.Surface surface, android.media.MediaFormat mediaFormat) {
        if (this.f48180x532a3f49.f48228xafdb8087) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "reset");
        try {
            m97597xaeade141(mediaFormat);
            m97599x23f36302(mediaFormat, surface);
            m97610x53ec2d82(surface, mediaFormat);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "reset", e17);
        }
    }

    /* renamed from: startDecoder */
    public synchronized void m97610x53ec2d82(android.view.Surface surface, android.media.MediaFormat mediaFormat) {
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f48179x7212fe92.mo96264x68ac462();
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "startDecoder cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "startDecoder: start", e17);
            if (m97596x51f90155() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                m97598x616377cd((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97611xe9f95e2(20L);
                    m97610x53ec2d82(surface, mediaFormat);
                    return;
                } else if (((android.media.MediaCodec.CodecException) e17).isRecoverable()) {
                    m97609x6761d4f(surface, mediaFormat);
                    return;
                }
            }
            this.f48180x532a3f49.mo97565x41012807(false);
            throw e17;
        }
    }

    /* renamed from: waitTime */
    public synchronized void m97611xe9f95e2(long j17) {
        try {
            this.f48180x532a3f49.wait(j17);
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
