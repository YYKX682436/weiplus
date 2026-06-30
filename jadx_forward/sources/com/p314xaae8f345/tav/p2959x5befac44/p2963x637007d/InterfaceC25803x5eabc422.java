package com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d;

/* renamed from: com.tencent.tav.decoder.muxer.IMediaMuxer */
/* loaded from: classes16.dex */
public interface InterfaceC25803x5eabc422 {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.tav.decoder.muxer.IMediaMuxer$Format */
    /* loaded from: classes6.dex */
    public @interface Format {
    }

    /* renamed from: com.tencent.tav.decoder.muxer.IMediaMuxer$OutputFormat */
    /* loaded from: classes6.dex */
    public static final class OutputFormat {

        /* renamed from: MUXER_OUTPUT_3GPP */
        public static final int f48387x7e82ab10 = 2;

        /* renamed from: MUXER_OUTPUT_FIRST */
        public static final int f48388x52df6674 = 0;

        /* renamed from: MUXER_OUTPUT_HEIF */
        public static final int f48389x7e8c2e76 = 3;

        /* renamed from: MUXER_OUTPUT_LAST */
        public static final int f48390x7e8df232 = 3;

        /* renamed from: MUXER_OUTPUT_MPEG_4 */
        public static final int f48391x155be496 = 0;

        /* renamed from: MUXER_OUTPUT_WEBM */
        public static final int f48392x7e92ff35 = 1;

        private OutputFormat() {
        }
    }

    /* renamed from: addTrack */
    int mo72369xb5bac52a(android.media.MediaFormat mediaFormat);

    /* renamed from: audioTrackIndex */
    int mo72370xe37182bd();

    /* renamed from: clearResource */
    void mo72372xbfab417b();

    /* renamed from: getExportConfig */
    com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 mo72379x12477e8c();

    /* renamed from: ignoreHeader */
    boolean mo72384xf2d0a6ff();

    /* renamed from: isMuxerStarted */
    boolean mo72385x5b9eb38e();

    /* renamed from: prepareParallelSegmentInfo */
    void mo72387x60565d73(int i17, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262);

    /* renamed from: release */
    void mo72388x41012807();

    /* renamed from: setExportConfig */
    void mo72392x48907998(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036);

    /* renamed from: start */
    void mo72397x68ac462();

    /* renamed from: stop */
    boolean mo72398x360802(boolean z17);

    /* renamed from: videoTrackIndex */
    int mo72399x8d453122();

    /* renamed from: writeSampleData */
    void mo72400xe78c1db3(int i17, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo);

    /* renamed from: writeSampleDataTime */
    void mo72401xe437d320(boolean z17, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);
}
