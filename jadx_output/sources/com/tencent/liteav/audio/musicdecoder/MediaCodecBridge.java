package com.tencent.liteav.audio.musicdecoder;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::audio")
/* loaded from: classes13.dex */
public class MediaCodecBridge {
    private static final java.lang.String TAG = "MediaCodecBridge";
    private static final long TIMEOUT_MS = 400;
    private boolean mDecodeEOS;
    private android.media.MediaFormat mFormat;
    private long mLongestDurationUs;
    private android.media.MediaCodec mMediaCodec;
    private android.media.MediaExtractor mMediaExtractor;
    private java.lang.String mMime;
    private int mRawDataSize;
    private int mTrackCount;
    private int mTrackIndex;

    private java.nio.ByteBuffer dequeueOutputBuffer() {
        if (this.mDecodeEOS) {
            return null;
        }
        try {
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(TIMEOUT_MS));
            if (dequeueOutputBuffer == -1) {
                return null;
            }
            if (dequeueOutputBuffer == -3) {
                com.tencent.liteav.base.Log.i(TAG, "codec output buffers changed.", new java.lang.Object[0]);
                return null;
            }
            if (dequeueOutputBuffer == -2) {
                this.mFormat = this.mMediaCodec.getOutputFormat();
                com.tencent.liteav.base.Log.i(TAG, "codec output format changed: " + this.mFormat, new java.lang.Object[0]);
                return null;
            }
            if (dequeueOutputBuffer < 0) {
                com.tencent.liteav.base.Log.e(TAG, "unexpected result from dequeueOutputBuffer: ".concat(java.lang.String.valueOf(dequeueOutputBuffer)), new java.lang.Object[0]);
                return null;
            }
            if ((bufferInfo.flags & 4) != 0) {
                com.tencent.liteav.base.Log.i(TAG, "Decode to EOS", new java.lang.Object[0]);
                this.mDecodeEOS = true;
                return null;
            }
            java.nio.ByteBuffer outputBuffer = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.mMediaCodec.getOutputBuffer(dequeueOutputBuffer) : this.mMediaCodec.getOutputBuffers()[dequeueOutputBuffer];
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bufferInfo.size);
            allocateDirect.put(outputBuffer);
            this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            return allocateDirect;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "Failed to dequeue output buffer", th6);
            return null;
        }
    }

    private java.nio.ByteBuffer drainData() {
        for (int i17 = 0; i17 < 3; i17++) {
            java.nio.ByteBuffer dequeueOutputBuffer = dequeueOutputBuffer();
            if (dequeueOutputBuffer != null) {
                return dequeueOutputBuffer;
            }
        }
        return null;
    }

    private long getDuration(android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return -1L;
        }
        try {
            return mediaFormat.getLong("durationUs");
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "getDuration failed. ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return -1L;
        }
    }

    private boolean initMediaCodec() {
        if (!android.text.TextUtils.isEmpty(this.mMime) && this.mFormat != null) {
            try {
                android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(this.mMime);
                this.mMediaCodec = createDecoderByType;
                createDecoderByType.configure(this.mFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
                return true;
            } catch (java.lang.Throwable unused) {
                this.mMediaCodec = null;
            }
        }
        return false;
    }

    private boolean initMediaExtractor(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        this.mDecodeEOS = false;
        try {
            android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
            this.mMediaExtractor = mediaExtractor;
            mediaExtractor.setDataSource(str);
            this.mTrackCount = this.mMediaExtractor.getTrackCount();
            for (int i17 = 0; i17 < this.mTrackCount; i17++) {
                android.media.MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i17);
                java.lang.String string = trackFormat.getString("mime");
                if (!android.text.TextUtils.isEmpty(string) && string.startsWith("audio/")) {
                    long duration = getDuration(trackFormat);
                    if (this.mLongestDurationUs < duration) {
                        this.mLongestDurationUs = duration;
                    }
                }
            }
            int i18 = this.mTrackIndex;
            if (i18 != 0) {
                return selectTrack(i18);
            }
            for (int i19 = 0; i19 < this.mTrackCount; i19++) {
                if (selectTrack(i19)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "initMediaExtractor: ", th6);
            this.mMediaExtractor = null;
            this.mFormat = null;
            this.mMime = null;
            return false;
        }
    }

    private boolean selectTrack(int i17) {
        android.media.MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i17);
        java.lang.String string = trackFormat.getString("mime");
        if (android.text.TextUtils.isEmpty(string) || !string.startsWith("audio/")) {
            return false;
        }
        this.mMediaExtractor.selectTrack(i17);
        this.mTrackIndex = i17;
        this.mFormat = trackFormat;
        this.mMime = string;
        return true;
    }

    public long getLongestDuration() {
        return this.mLongestDurationUs;
    }

    public android.media.MediaFormat getOutputFormat() {
        return this.mFormat;
    }

    public int getTotalRawDataSize() {
        return this.mRawDataSize;
    }

    public int getTrackCount() {
        return this.mTrackCount;
    }

    public boolean initAndStart(java.lang.String str) {
        if (this.mMediaCodec != null || !initMediaExtractor(str) || !initMediaCodec()) {
            return false;
        }
        try {
            this.mMediaCodec.start();
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "Cannot start the audio codec", th6);
            return false;
        }
    }

    public boolean isDecodeEnd() {
        return this.mDecodeEOS;
    }

    public java.nio.ByteBuffer processFrame() {
        int dequeueInputBuffer;
        android.media.MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec == null || (dequeueInputBuffer = mediaCodec.dequeueInputBuffer(TIMEOUT_MS)) < 0) {
            return null;
        }
        java.nio.ByteBuffer byteBuffer = this.mMediaCodec.getInputBuffers()[dequeueInputBuffer];
        int readSampleData = byteBuffer != null ? this.mMediaExtractor.readSampleData(byteBuffer, 0) : -1;
        if (readSampleData <= 0) {
            this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
        } else {
            this.mRawDataSize += readSampleData;
            this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mMediaExtractor.getSampleTime(), 0);
            this.mMediaExtractor.advance();
        }
        return drainData();
    }

    public boolean seekTo(long j17) {
        android.media.MediaExtractor mediaExtractor;
        if (this.mMediaCodec == null || (mediaExtractor = this.mMediaExtractor) == null || j17 > this.mLongestDurationUs) {
            return false;
        }
        mediaExtractor.seekTo(j17, 2);
        return true;
    }

    public void setMusicTrack(int i17) {
        int i18 = this.mTrackIndex;
        if (i18 == i17) {
            return;
        }
        this.mMediaExtractor.unselectTrack(i18);
        if (selectTrack(i17)) {
            android.media.MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            }
            if (initMediaCodec()) {
                try {
                    this.mMediaCodec.start();
                } catch (java.lang.Throwable th6) {
                    com.tencent.liteav.base.Log.e(TAG, "Cannot start the audio codec", th6);
                }
            }
        }
    }

    public void stop() {
        android.media.MediaExtractor mediaExtractor = this.mMediaExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mMediaExtractor = null;
        }
        android.media.MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mMediaCodec.release();
            this.mMediaCodec = null;
        }
        this.mDecodeEOS = false;
    }
}
