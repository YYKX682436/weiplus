package com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016;

/* renamed from: com.tencent.liteav.extensions.codec.HardwareAacDecoder */
/* loaded from: classes13.dex */
public class C3791xef3c6a9 {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016.C3790x8dc61fbe f128012a = new com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016.C3790x8dc61fbe(com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016.C3790x8dc61fbe.a.f128010b);

    /* renamed from: decode */
    public java.nio.ByteBuffer m29713xb06291ee(java.nio.ByteBuffer byteBuffer) {
        return this.f128012a.m29711x756f483e(byteBuffer);
    }

    /* renamed from: getCacheSize */
    public int m29714xde6de3ed() {
        return this.f128012a.f128006d;
    }

    /* renamed from: getOutputChannelCount */
    public int m29715x37be363() {
        android.media.MediaFormat mediaFormat = this.f128012a.f128005c;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger("channel-count");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("HardwareAacDecoder", "getOutputChannelCount failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            return -1;
        }
    }

    /* renamed from: getOutputSampleRate */
    public int m29716xb45c2101() {
        android.media.MediaFormat mediaFormat = this.f128012a.f128005c;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger("sample-rate");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("HardwareAacDecoder", "getOutputSampleRate failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            return -1;
        }
    }

    /* renamed from: init */
    public boolean m29717x316510(int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", i17, i18);
        createAudioFormat.setString("mime", "audio/mp4a-latm");
        createAudioFormat.setByteBuffer(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.f54292x3d6ec85, byteBuffer);
        return this.f128012a.a(createAudioFormat);
    }

    /* renamed from: reset */
    public void m29718x6761d4f() {
        com.p314xaae8f345.p373xbe494963.p391x94266c14.p392x5a71016.C3790x8dc61fbe c3790x8dc61fbe = this.f128012a;
        android.media.MediaCodec mediaCodec = c3790x8dc61fbe.f128004b;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                c3790x8dc61fbe.f128004b.reset();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(c3790x8dc61fbe.f128003a, "codec stop failed.".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
                c3790x8dc61fbe.a();
            }
            c3790x8dc61fbe.f128006d = 0;
            c3790x8dc61fbe.f128005c = null;
        }
    }

    /* renamed from: unInit */
    public void m29719xcdd7f349() {
        this.f128012a.a();
    }
}
