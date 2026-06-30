package com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef */
/* loaded from: classes6.dex */
public interface InterfaceC3847xf09fac04 {

    /* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$BitrateMode */
    /* loaded from: classes6.dex */
    public enum BitrateMode {
        UNKNOWN(-1),
        CBR(0),
        VBR(1),
        CQ(2);


        /* renamed from: e, reason: collision with root package name */
        private static final com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode[] f128627e = m31484xcee59d22();

        /* renamed from: mValue */
        public int f15065xbee9dd04;

        BitrateMode(int i17) {
            this.f15065xbee9dd04 = i17;
        }

        public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode a(int i17) {
            for (com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode bitrateMode : f128627e) {
                if (i17 == bitrateMode.f15065xbee9dd04) {
                    return bitrateMode;
                }
            }
            return VBR;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncodeAbility */
    /* loaded from: classes6.dex */
    public static class EncodeAbility {

        /* renamed from: a, reason: collision with root package name */
        public boolean f128629a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f128630b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f128631c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f128632d;

        /* renamed from: isSupportHwHEVC */
        public boolean m31485x344c219e() {
            return this.f128632d;
        }

        /* renamed from: isSupportRPS */
        public boolean m31486x5cd37470() {
            return this.f128629a;
        }

        /* renamed from: isSupportSVC */
        public boolean m31487x5cd378db() {
            return this.f128630b;
        }

        /* renamed from: isSupportSwHEVC */
        public boolean m31488x47117073() {
            return this.f128631c;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncodeScene */
    /* loaded from: classes6.dex */
    public enum EncodeScene {
        kCameraRealTime(0),
        kScreenRealTime(1);


        /* renamed from: mValue */
        int f15066xbee9dd04;

        EncodeScene(int i17) {
            this.f15066xbee9dd04 = i17;
        }

        public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncodeScene a(int i17) {
            for (com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncodeScene encodeScene : m31491xcee59d22()) {
                if (encodeScene.f15066xbee9dd04 == i17) {
                    return encodeScene;
                }
            }
            return kCameraRealTime;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderComplexity */
    /* loaded from: classes6.dex */
    public enum EncoderComplexity {
        UNKNOWN(65535),
        HYPER_FAST(0),
        ULTRA_FAST(1),
        SUPER_FAST(2),
        VERY_FAST(3),
        FAST(4);


        /* renamed from: mValue */
        final int f15067xbee9dd04;

        EncoderComplexity(int i17) {
            this.f15067xbee9dd04 = i17;
        }

        public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderComplexity a(int i17) {
            for (com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderComplexity encoderComplexity : m31494xcee59d22()) {
                if (encoderComplexity.f15067xbee9dd04 == i17) {
                    return encoderComplexity;
                }
            }
            return UNKNOWN;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile */
    /* loaded from: classes6.dex */
    public enum EncoderProfile {
        PROFILE_BASELINE(1),
        PROFILE_MAIN(2),
        PROFILE_HIGH(3),
        PROFILE_BASELINERPS(11),
        PROFILE_MAINRPS(12),
        PROFILE_HIGHRPS(13);


        /* renamed from: g, reason: collision with root package name */
        private static final com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderProfile[] f128649g = m31497xcee59d22();

        /* renamed from: mValue */
        int f15068xbee9dd04;

        EncoderProfile(int i17) {
            this.f15068xbee9dd04 = i17;
        }

        public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderProfile a(int i17) {
            for (com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderProfile encoderProfile : f128649g) {
                if (i17 == encoderProfile.f15068xbee9dd04) {
                    return encoderProfile;
                }
            }
            return PROFILE_BASELINE;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProperty */
    /* loaded from: classes6.dex */
    public static class EncoderProperty {

        /* renamed from: a, reason: collision with root package name */
        public com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.a f128651a;

        /* renamed from: b, reason: collision with root package name */
        public com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy f128652b;

        /* renamed from: c, reason: collision with root package name */
        public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850 f128653c;

        /* renamed from: getCodecType */
        public int m31498xbc6a89ba() {
            return this.f128653c.f14886xbee9dd04;
        }

        /* renamed from: getEncoderType */
        public int m31499x4d6fe140() {
            return this.f128651a.f15070x6ac9171;
        }

        /* renamed from: getReferenceStrategy */
        public int m31500xc6d75328() {
            return this.f128652b.f15069xbee9dd04;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$ReferenceStrategy */
    /* loaded from: classes6.dex */
    public enum ReferenceStrategy {
        FIX_GOP(0),
        RPS(1),
        SVC(2),
        UNLIMITED_GOP(3);


        /* renamed from: e, reason: collision with root package name */
        private static final com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy[] f128658e = m31503xcee59d22();

        /* renamed from: mValue */
        int f15069xbee9dd04;

        ReferenceStrategy(int i17) {
            this.f15069xbee9dd04 = i17;
        }

        public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy a(int i17) {
            for (com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy referenceStrategy : f128658e) {
                if (i17 == referenceStrategy.f15069xbee9dd04) {
                    return referenceStrategy;
                }
            }
            return FIX_GOP;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$a */
    /* loaded from: classes6.dex */
    public enum a {
        HARDWARE(1),
        SOFTWARE(2);


        /* renamed from: value */
        int f15070x6ac9171;

        a(int i17) {
            this.f15070x6ac9171 = i17;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$b */
    /* loaded from: classes14.dex */
    public static abstract class b {
        /* renamed from: onBitrateModeUpdated */
        public void mo31507x6d6a182a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode bitrateMode) {
        }

        /* renamed from: onEncodedFail */
        public void mo31431x8f5c21ed(com.tencent.liteav.videobase.videobase.e.a aVar) {
        }

        /* renamed from: onEncodedNAL */
        public void mo31432xa9c9446a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 c3811xcc176140, boolean z17) {
        }

        /* renamed from: onOutputFormatChanged */
        public void m31508xa0df46dd(android.media.MediaFormat mediaFormat) {
        }
    }
}
