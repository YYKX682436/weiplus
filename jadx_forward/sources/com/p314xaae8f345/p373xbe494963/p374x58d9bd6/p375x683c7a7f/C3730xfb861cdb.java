package com.p314xaae8f345.p373xbe494963.p374x58d9bd6.p375x683c7a7f;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::audio")
/* renamed from: com.tencent.liteav.audio.musicdecoder.MediaCodecBridge */
/* loaded from: classes13.dex */
public class C3730xfb861cdb {
    private static final java.lang.String TAG = "MediaCodecBridge";

    /* renamed from: TIMEOUT_MS */
    private static final long f14560x7c098164 = 400;

    /* renamed from: mDecodeEOS */
    private boolean f14561x996c564e;

    /* renamed from: mFormat */
    private android.media.MediaFormat f14562x3cc1ec4;

    /* renamed from: mLongestDurationUs */
    private long f14563xb5a7238f;

    /* renamed from: mMediaCodec */
    private android.media.MediaCodec f14564x4e44f6df;

    /* renamed from: mMediaExtractor */
    private android.media.MediaExtractor f14565x5739286d;

    /* renamed from: mMime */
    private java.lang.String f14566x6249a41;

    /* renamed from: mRawDataSize */
    private int f14567xe204e466;

    /* renamed from: mTrackCount */
    private int f14568x1fc87ed1;

    /* renamed from: mTrackIndex */
    private int f14569x201c5694;

    /* renamed from: dequeueOutputBuffer */
    private java.nio.ByteBuffer m29131x436dd5f1() {
        if (this.f14561x996c564e) {
            return null;
        }
        try {
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.f14564x4e44f6df.dequeueOutputBuffer(bufferInfo, java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(f14560x7c098164));
            if (dequeueOutputBuffer == -1) {
                return null;
            }
            if (dequeueOutputBuffer == -3) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "codec output buffers changed.", new java.lang.Object[0]);
                return null;
            }
            if (dequeueOutputBuffer == -2) {
                this.f14562x3cc1ec4 = this.f14564x4e44f6df.getOutputFormat();
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "codec output format changed: " + this.f14562x3cc1ec4, new java.lang.Object[0]);
                return null;
            }
            if (dequeueOutputBuffer < 0) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "unexpected result from dequeueOutputBuffer: ".concat(java.lang.String.valueOf(dequeueOutputBuffer)), new java.lang.Object[0]);
                return null;
            }
            if ((bufferInfo.flags & 4) != 0) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "Decode to EOS", new java.lang.Object[0]);
                this.f14561x996c564e = true;
                return null;
            }
            java.nio.ByteBuffer outputBuffer = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 21 ? this.f14564x4e44f6df.getOutputBuffer(dequeueOutputBuffer) : this.f14564x4e44f6df.getOutputBuffers()[dequeueOutputBuffer];
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bufferInfo.size);
            allocateDirect.put(outputBuffer);
            this.f14564x4e44f6df.releaseOutputBuffer(dequeueOutputBuffer, false);
            return allocateDirect;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Failed to dequeue output buffer", th6);
            return null;
        }
    }

    /* renamed from: drainData */
    private java.nio.ByteBuffer m29132xf19921c2() {
        for (int i17 = 0; i17 < 3; i17++) {
            java.nio.ByteBuffer m29131x436dd5f1 = m29131x436dd5f1();
            if (m29131x436dd5f1 != null) {
                return m29131x436dd5f1;
            }
        }
        return null;
    }

    /* renamed from: getDuration */
    private long m29133x51e8b0a(android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return -1L;
        }
        try {
            return mediaFormat.getLong("durationUs");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "getDuration failed. ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return -1L;
        }
    }

    /* renamed from: initMediaCodec */
    private boolean m29134xa8a72bc2() {
        if (!android.text.TextUtils.isEmpty(this.f14566x6249a41) && this.f14562x3cc1ec4 != null) {
            try {
                android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(this.f14566x6249a41);
                this.f14564x4e44f6df = createDecoderByType;
                createDecoderByType.configure(this.f14562x3cc1ec4, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
                return true;
            } catch (java.lang.Throwable unused) {
                this.f14564x4e44f6df = null;
            }
        }
        return false;
    }

    /* renamed from: initMediaExtractor */
    private boolean m29135x99e033d0(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        this.f14561x996c564e = false;
        try {
            android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
            this.f14565x5739286d = mediaExtractor;
            mediaExtractor.setDataSource(str);
            this.f14568x1fc87ed1 = this.f14565x5739286d.getTrackCount();
            for (int i17 = 0; i17 < this.f14568x1fc87ed1; i17++) {
                android.media.MediaFormat trackFormat = this.f14565x5739286d.getTrackFormat(i17);
                java.lang.String string = trackFormat.getString("mime");
                if (!android.text.TextUtils.isEmpty(string) && string.startsWith("audio/")) {
                    long m29133x51e8b0a = m29133x51e8b0a(trackFormat);
                    if (this.f14563xb5a7238f < m29133x51e8b0a) {
                        this.f14563xb5a7238f = m29133x51e8b0a;
                    }
                }
            }
            int i18 = this.f14569x201c5694;
            if (i18 != 0) {
                return m29136xc3b89af(i18);
            }
            for (int i19 = 0; i19 < this.f14568x1fc87ed1; i19++) {
                if (m29136xc3b89af(i19)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "initMediaExtractor: ", th6);
            this.f14565x5739286d = null;
            this.f14562x3cc1ec4 = null;
            this.f14566x6249a41 = null;
            return false;
        }
    }

    /* renamed from: selectTrack */
    private boolean m29136xc3b89af(int i17) {
        android.media.MediaFormat trackFormat = this.f14565x5739286d.getTrackFormat(i17);
        java.lang.String string = trackFormat.getString("mime");
        if (android.text.TextUtils.isEmpty(string) || !string.startsWith("audio/")) {
            return false;
        }
        this.f14565x5739286d.selectTrack(i17);
        this.f14569x201c5694 = i17;
        this.f14562x3cc1ec4 = trackFormat;
        this.f14566x6249a41 = string;
        return true;
    }

    /* renamed from: getLongestDuration */
    public long m29137x883cbb08() {
        return this.f14563xb5a7238f;
    }

    /* renamed from: getOutputFormat */
    public android.media.MediaFormat m29138x42b80ace() {
        return this.f14562x3cc1ec4;
    }

    /* renamed from: getTotalRawDataSize */
    public int m29139x668c14a5() {
        return this.f14567xe204e466;
    }

    /* renamed from: getTrackCount */
    public int m29140x31d73e7a() {
        return this.f14568x1fc87ed1;
    }

    /* renamed from: initAndStart */
    public boolean m29141x4dc9a1fb(java.lang.String str) {
        if (this.f14564x4e44f6df != null || !m29135x99e033d0(str) || !m29134xa8a72bc2()) {
            return false;
        }
        try {
            this.f14564x4e44f6df.start();
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Cannot start the audio codec", th6);
            return false;
        }
    }

    /* renamed from: isDecodeEnd */
    public boolean m29142x64f25203() {
        return this.f14561x996c564e;
    }

    /* renamed from: processFrame */
    public java.nio.ByteBuffer m29143x756f483e() {
        int dequeueInputBuffer;
        android.media.MediaCodec mediaCodec = this.f14564x4e44f6df;
        if (mediaCodec == null || (dequeueInputBuffer = mediaCodec.dequeueInputBuffer(f14560x7c098164)) < 0) {
            return null;
        }
        java.nio.ByteBuffer byteBuffer = this.f14564x4e44f6df.getInputBuffers()[dequeueInputBuffer];
        int readSampleData = byteBuffer != null ? this.f14565x5739286d.readSampleData(byteBuffer, 0) : -1;
        if (readSampleData <= 0) {
            this.f14564x4e44f6df.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
        } else {
            this.f14567xe204e466 += readSampleData;
            this.f14564x4e44f6df.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.f14565x5739286d.getSampleTime(), 0);
            this.f14565x5739286d.advance();
        }
        return m29132xf19921c2();
    }

    /* renamed from: seekTo */
    public boolean m29144xc9fc1b13(long j17) {
        android.media.MediaExtractor mediaExtractor;
        if (this.f14564x4e44f6df == null || (mediaExtractor = this.f14565x5739286d) == null || j17 > this.f14563xb5a7238f) {
            return false;
        }
        mediaExtractor.seekTo(j17, 2);
        return true;
    }

    /* renamed from: setMusicTrack */
    public void m29145xed4b2828(int i17) {
        int i18 = this.f14569x201c5694;
        if (i18 == i17) {
            return;
        }
        this.f14565x5739286d.unselectTrack(i18);
        if (m29136xc3b89af(i17)) {
            android.media.MediaCodec mediaCodec = this.f14564x4e44f6df;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.f14564x4e44f6df.release();
                this.f14564x4e44f6df = null;
            }
            if (m29134xa8a72bc2()) {
                try {
                    this.f14564x4e44f6df.start();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Cannot start the audio codec", th6);
                }
            }
        }
    }

    /* renamed from: stop */
    public void m29146x360802() {
        android.media.MediaExtractor mediaExtractor = this.f14565x5739286d;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.f14565x5739286d = null;
        }
        android.media.MediaCodec mediaCodec = this.f14564x4e44f6df;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f14564x4e44f6df.release();
            this.f14564x4e44f6df = null;
        }
        this.f14561x996c564e = false;
    }
}
