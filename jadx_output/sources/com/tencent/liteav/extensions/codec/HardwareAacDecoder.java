package com.tencent.liteav.extensions.codec;

/* loaded from: classes13.dex */
public class HardwareAacDecoder {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.extensions.codec.AacMediaCodecWrapper f46479a = new com.tencent.liteav.extensions.codec.AacMediaCodecWrapper(com.tencent.liteav.extensions.codec.AacMediaCodecWrapper.a.f46477b);

    public java.nio.ByteBuffer decode(java.nio.ByteBuffer byteBuffer) {
        return this.f46479a.processFrame(byteBuffer);
    }

    public int getCacheSize() {
        return this.f46479a.f46473d;
    }

    public int getOutputChannelCount() {
        android.media.MediaFormat mediaFormat = this.f46479a.f46472c;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger("channel-count");
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.Log.e("HardwareAacDecoder", "getOutputChannelCount failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            return -1;
        }
    }

    public int getOutputSampleRate() {
        android.media.MediaFormat mediaFormat = this.f46479a.f46472c;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger("sample-rate");
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.Log.e("HardwareAacDecoder", "getOutputSampleRate failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            return -1;
        }
    }

    public boolean init(int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", i17, i18);
        createAudioFormat.setString("mime", "audio/mp4a-latm");
        createAudioFormat.setByteBuffer(com.tencent.thumbplayer.tmediacodec.util.TUtils.CSD_0, byteBuffer);
        return this.f46479a.a(createAudioFormat);
    }

    public void reset() {
        com.tencent.liteav.extensions.codec.AacMediaCodecWrapper aacMediaCodecWrapper = this.f46479a;
        android.media.MediaCodec mediaCodec = aacMediaCodecWrapper.f46471b;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                aacMediaCodecWrapper.f46471b.reset();
            } catch (java.lang.Exception e17) {
                com.tencent.liteav.base.Log.e(aacMediaCodecWrapper.f46470a, "codec stop failed.".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
                aacMediaCodecWrapper.a();
            }
            aacMediaCodecWrapper.f46473d = 0;
            aacMediaCodecWrapper.f46472c = null;
        }
    }

    public void unInit() {
        this.f46479a.a();
    }
}
