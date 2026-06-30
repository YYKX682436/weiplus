package com.tencent.liteav.audio.musicdecoder;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::audio")
/* loaded from: classes13.dex */
public class MusicResourceDecoderAndroid {
    private static final java.lang.String TAG = "MusicResourceDecoderAndroid";
    private java.lang.String mPath;
    private int mTrackIndex = 0;
    private final com.tencent.liteav.audio.musicdecoder.MediaCodecBridge mDecoder = new com.tencent.liteav.audio.musicdecoder.MediaCodecBridge();

    public java.nio.ByteBuffer decode() {
        return this.mDecoder.processFrame();
    }

    public int getBitrate() {
        android.media.MediaFormat outputFormat = this.mDecoder.getOutputFormat();
        if (outputFormat == null) {
            return -1;
        }
        try {
            return outputFormat.getInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "getBitrate failed. ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return -1;
        }
    }

    public int getChannelCount() {
        android.media.MediaFormat outputFormat = this.mDecoder.getOutputFormat();
        if (outputFormat == null) {
            return -1;
        }
        try {
            return outputFormat.getInteger("channel-count");
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "getChannelCount failed. ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return -1;
        }
    }

    public long getDuration() {
        return (this.mDecoder.getLongestDuration() + 500) / 1000;
    }

    public int getSampleRate() {
        android.media.MediaFormat outputFormat = this.mDecoder.getOutputFormat();
        if (outputFormat == null) {
            return -1;
        }
        try {
            return outputFormat.getInteger("sample-rate");
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "getSampleRate failed. ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return -1;
        }
    }

    public int getTotalRawDataSize() {
        return this.mDecoder.getTotalRawDataSize();
    }

    public int getTrackCount() {
        return this.mDecoder.getTrackCount();
    }

    public boolean isDecodeEnd() {
        return this.mDecoder.isDecodeEnd();
    }

    public boolean seekTo(long j17) {
        if (this.mDecoder.isDecodeEnd()) {
            this.mDecoder.stop();
            this.mDecoder.initAndStart(this.mPath);
            this.mDecoder.setMusicTrack(this.mTrackIndex);
        }
        return this.mDecoder.seekTo(j17 * 1000);
    }

    public void setMusicTrack(int i17) {
        this.mTrackIndex = i17;
        this.mDecoder.setMusicTrack(i17);
    }

    public boolean start(java.lang.String str) {
        this.mPath = str;
        return this.mDecoder.initAndStart(str);
    }

    public void stop() {
        this.mDecoder.stop();
    }
}
