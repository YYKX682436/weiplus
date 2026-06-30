package com.tencent.liteav.videoproducer.encoder;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes6.dex */
public interface VideoEncoderDef {

    /* loaded from: classes6.dex */
    public enum BitrateMode {
        UNKNOWN(-1),
        CBR(0),
        VBR(1),
        CQ(2);


        /* renamed from: e, reason: collision with root package name */
        private static final com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode[] f47094e = values();
        public int mValue;

        BitrateMode(int i17) {
            this.mValue = i17;
        }

        public static com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode a(int i17) {
            for (com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode bitrateMode : f47094e) {
                if (i17 == bitrateMode.mValue) {
                    return bitrateMode;
                }
            }
            return VBR;
        }
    }

    /* loaded from: classes6.dex */
    public static class EncodeAbility {

        /* renamed from: a, reason: collision with root package name */
        public boolean f47096a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f47097b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f47098c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f47099d;

        public boolean isSupportHwHEVC() {
            return this.f47099d;
        }

        public boolean isSupportRPS() {
            return this.f47096a;
        }

        public boolean isSupportSVC() {
            return this.f47097b;
        }

        public boolean isSupportSwHEVC() {
            return this.f47098c;
        }
    }

    /* loaded from: classes6.dex */
    public enum EncodeScene {
        kCameraRealTime(0),
        kScreenRealTime(1);

        int mValue;

        EncodeScene(int i17) {
            this.mValue = i17;
        }

        public static com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncodeScene a(int i17) {
            for (com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncodeScene encodeScene : values()) {
                if (encodeScene.mValue == i17) {
                    return encodeScene;
                }
            }
            return kCameraRealTime;
        }
    }

    /* loaded from: classes6.dex */
    public enum EncoderComplexity {
        UNKNOWN(65535),
        HYPER_FAST(0),
        ULTRA_FAST(1),
        SUPER_FAST(2),
        VERY_FAST(3),
        FAST(4);

        final int mValue;

        EncoderComplexity(int i17) {
            this.mValue = i17;
        }

        public static com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderComplexity a(int i17) {
            for (com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderComplexity encoderComplexity : values()) {
                if (encoderComplexity.mValue == i17) {
                    return encoderComplexity;
                }
            }
            return UNKNOWN;
        }
    }

    /* loaded from: classes6.dex */
    public enum EncoderProfile {
        PROFILE_BASELINE(1),
        PROFILE_MAIN(2),
        PROFILE_HIGH(3),
        PROFILE_BASELINERPS(11),
        PROFILE_MAINRPS(12),
        PROFILE_HIGHRPS(13);


        /* renamed from: g, reason: collision with root package name */
        private static final com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile[] f47116g = values();
        int mValue;

        EncoderProfile(int i17) {
            this.mValue = i17;
        }

        public static com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile a(int i17) {
            for (com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile encoderProfile : f47116g) {
                if (i17 == encoderProfile.mValue) {
                    return encoderProfile;
                }
            }
            return PROFILE_BASELINE;
        }
    }

    /* loaded from: classes6.dex */
    public static class EncoderProperty {

        /* renamed from: a, reason: collision with root package name */
        public com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.a f47118a;

        /* renamed from: b, reason: collision with root package name */
        public com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy f47119b;

        /* renamed from: c, reason: collision with root package name */
        public com.tencent.liteav.videobase.common.CodecType f47120c;

        public int getCodecType() {
            return this.f47120c.mValue;
        }

        public int getEncoderType() {
            return this.f47118a.value;
        }

        public int getReferenceStrategy() {
            return this.f47119b.mValue;
        }
    }

    /* loaded from: classes6.dex */
    public enum ReferenceStrategy {
        FIX_GOP(0),
        RPS(1),
        SVC(2),
        UNLIMITED_GOP(3);


        /* renamed from: e, reason: collision with root package name */
        private static final com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy[] f47125e = values();
        int mValue;

        ReferenceStrategy(int i17) {
            this.mValue = i17;
        }

        public static com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy a(int i17) {
            for (com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy referenceStrategy : f47125e) {
                if (i17 == referenceStrategy.mValue) {
                    return referenceStrategy;
                }
            }
            return FIX_GOP;
        }
    }

    /* loaded from: classes6.dex */
    public enum a {
        HARDWARE(1),
        SOFTWARE(2);

        int value;

        a(int i17) {
            this.value = i17;
        }
    }

    /* loaded from: classes14.dex */
    public static abstract class b {
        public void onBitrateModeUpdated(com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode bitrateMode) {
        }

        public void onEncodedFail(com.tencent.liteav.videobase.videobase.e.a aVar) {
        }

        public void onEncodedNAL(com.tencent.liteav.videobase.common.EncodedVideoFrame encodedVideoFrame, boolean z17) {
        }

        public void onOutputFormatChanged(android.media.MediaFormat mediaFormat) {
        }
    }
}
