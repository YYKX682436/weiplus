package com.tencent.liteav.extensions.codec;

/* loaded from: classes13.dex */
public class HardwareAacEncoder {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.extensions.codec.AacMediaCodecWrapper f46480a = new com.tencent.liteav.extensions.codec.AacMediaCodecWrapper(com.tencent.liteav.extensions.codec.AacMediaCodecWrapper.a.f46476a);

    public java.nio.ByteBuffer encode(java.nio.ByteBuffer byteBuffer) {
        return this.f46480a.processFrame(byteBuffer);
    }

    public boolean init(int i17, int i18, int i19) {
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", i17, i18);
        createAudioFormat.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, i19);
        createAudioFormat.setInteger("aac-profile", 2);
        return this.f46480a.a(createAudioFormat);
    }

    public void unInit() {
        this.f46480a.a();
    }
}
