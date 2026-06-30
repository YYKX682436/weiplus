package com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncodeParams */
/* loaded from: classes14.dex */
public final class C3846xefe8337 implements java.lang.Cloneable {

    /* renamed from: annexb */
    public boolean f15048xabc7b88e;

    /* renamed from: baseFrameIndex */
    public long f15049x6f0dbd16;

    /* renamed from: baseGopIndex */
    public long f15050x1b44c71b;

    /* renamed from: bitrate */
    public int f15051xf9e77b6d;

    /* renamed from: bitrateMode */
    public com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode f15052x79d6aab0;

    /* renamed from: codecType */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850 f15053xbcfd1870;

    /* renamed from: enableAutoQP */
    public boolean f15054x7cc7db71;

    /* renamed from: enableBFrame */
    public boolean f15055x7be5498e;

    /* renamed from: encodeScene */
    public com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncodeScene f15056x71eb4816;

    /* renamed from: encoderComplexity */
    public com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderComplexity f15057x4764643a;

    /* renamed from: encoderProfile */
    public com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderProfile f15058xa066e4ed;
    public int fps;

    /* renamed from: fullIFrame */
    public boolean f15059xbd4b39f3;
    public int gop;

    /* renamed from: height */
    public int f15060xb7389127;

    /* renamed from: isTranscodingMode */
    public boolean f15061xd5a81e4b;

    /* renamed from: mediaCodecDeviceRelatedParams */
    public org.json.JSONArray f15062xfe2d4ee9;

    /* renamed from: referenceStrategy */
    public com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy f15063x73a2cbde;

    /* renamed from: width */
    public int f15064x6be2dc6;

    public C3846xefe8337() {
        this.f15064x6be2dc6 = 0;
        this.f15060xb7389127 = 0;
        this.fps = 20;
        this.gop = 3;
        this.f15051xf9e77b6d = 0;
        this.f15048xabc7b88e = true;
        this.f15058xa066e4ed = null;
        this.f15052x79d6aab0 = com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode.CBR;
        this.f15049x6f0dbd16 = 0L;
        this.f15050x1b44c71b = 0L;
        this.f15059xbd4b39f3 = false;
        this.f15055x7be5498e = false;
        this.f15063x73a2cbde = com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy.FIX_GOP;
        this.f15053xbcfd1870 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850.H264;
        this.f15061xd5a81e4b = false;
        this.f15057x4764643a = null;
        this.f15056x71eb4816 = com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncodeScene.kCameraRealTime;
        this.f15054x7cc7db71 = false;
        this.f15062xfe2d4ee9 = null;
    }

    /* renamed from: checkFieldDiffCounts */
    private int m31434x83a3201b(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = 0;
        for (java.lang.reflect.Field field : com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337.class.getDeclaredFields()) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                if (!com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29498xb2c87fbf(field.get(obj), field.get(obj2))) {
                    i17++;
                }
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        return i17;
    }

    /* renamed from: createEncodeScene */
    public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncodeScene m31435x9f0a197a(int i17) {
        return com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncodeScene.a(i17);
    }

    /* renamed from: createEncoderBitrateMode */
    public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode m31436xe5815a10(int i17) {
        return com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode.a(i17);
    }

    /* renamed from: createEncoderComplexity */
    public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderComplexity m31437x46519a9e(int i17) {
        return com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderComplexity.a(i17);
    }

    /* renamed from: createEncoderProfileType */
    public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderProfile m31438x76423fe3(int i17) {
        return com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderProfile.a(i17);
    }

    /* renamed from: createEncoderVideoCodec */
    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850 m31439x49684fb(int i17) {
        return com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850.a(i17);
    }

    /* renamed from: createReferenceStrategy */
    public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy m31440x72900242(int i17) {
        return com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy.a(i17);
    }

    /* renamed from: equals */
    public final boolean m31441xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337) && m31434x83a3201b(this, obj) == 0;
    }

    /* renamed from: getBaseFrameIndex */
    public final long m31442x5da58a0c() {
        return this.f15049x6f0dbd16;
    }

    /* renamed from: getBaseGopIndex */
    public final long m31443x7c375991() {
        return this.f15050x1b44c71b;
    }

    /* renamed from: getBitrate */
    public final int m31444x37b4b737() {
        return this.f15051xf9e77b6d;
    }

    /* renamed from: getBitrateMode */
    public final int m31445x53acf17a() {
        return this.f15052x79d6aab0.f15065xbee9dd04;
    }

    /* renamed from: getCodecType */
    public final int m31446xbc6a89ba() {
        return this.f15053xbcfd1870.f14886xbee9dd04;
    }

    /* renamed from: getEncodeScene */
    public final int m31447x4bc18ee0() {
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncodeScene encodeScene = this.f15056x71eb4816;
        return encodeScene == null ? com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncodeScene.kCameraRealTime.f15066xbee9dd04 : encodeScene.f15066xbee9dd04;
    }

    /* renamed from: getEncoderComplexity */
    public final int m31448x9a98eb84() {
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderComplexity encoderComplexity = this.f15057x4764643a;
        return encoderComplexity == null ? com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderComplexity.VERY_FAST.f15067xbee9dd04 : encoderComplexity.f15067xbee9dd04;
    }

    /* renamed from: getEncoderProfile */
    public final int m31449x8efeb1e3() {
        return this.f15058xa066e4ed.f15068xbee9dd04;
    }

    /* renamed from: getFps */
    public final int m31450xb5883db3() {
        return this.fps;
    }

    /* renamed from: getGop */
    public final int m31451xb5884152() {
        return this.gop;
    }

    /* renamed from: getHeight */
    public final int m31452x1c4fb41d() {
        return this.f15060xb7389127;
    }

    /* renamed from: getReferenceStrategy */
    public final com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy m31453xc6d75328() {
        return this.f15063x73a2cbde;
    }

    /* renamed from: getWidth */
    public final int m31454x755bd410() {
        return this.f15064x6be2dc6;
    }

    /* renamed from: isAnnexb */
    public final boolean m31455xd3f4aa58() {
        return this.f15048xabc7b88e;
    }

    /* renamed from: isEnableAutoQP */
    public final boolean m31456x4f66cdbb() {
        return this.f15054x7cc7db71;
    }

    /* renamed from: isEnablesBframe */
    public final boolean m31457x9a9fa8b1() {
        return this.f15055x7be5498e;
    }

    /* renamed from: isEnablesRps */
    public final boolean m31458xf251314f() {
        return this.f15063x73a2cbde == com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy.RPS;
    }

    /* renamed from: isEnablesSvc */
    public final boolean m31459xf25135ba() {
        return this.f15063x73a2cbde == com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy.SVC;
    }

    /* renamed from: isEnablesUnlimitedGop */
    public final boolean m31460x527935cd() {
        return this.f15063x73a2cbde == com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy.UNLIMITED_GOP;
    }

    /* renamed from: isFullIFrame */
    public final boolean m31461x3eb636bd() {
        return this.f15059xbd4b39f3;
    }

    /* renamed from: isTranscodingMode */
    public final boolean m31462xd5a81e4b() {
        return this.f15061xd5a81e4b;
    }

    /* renamed from: setAnnexb */
    public final void m31463x4140f90(boolean z17) {
        this.f15048xabc7b88e = z17;
    }

    /* renamed from: setAutoQPEnabeled */
    public final void m31464x5f7aac40(boolean z17) {
        this.f15054x7cc7db71 = z17;
    }

    /* renamed from: setBFrameEnabled */
    public final void m31465xb6df6954(boolean z17) {
        this.f15055x7be5498e = z17;
    }

    /* renamed from: setBaseFrameIndex */
    public final void m31466x259bf218(long j17) {
        this.f15049x6f0dbd16 = j17;
    }

    /* renamed from: setBaseGopIndex */
    public final void m31467xb280549d(long j17) {
        this.f15050x1b44c71b = j17;
    }

    /* renamed from: setBitrate */
    public final void m31468xab2604ab(int i17) {
        this.f15051xf9e77b6d = i17;
    }

    /* renamed from: setBitrateMode */
    public final void m31469xea1264ee(com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode bitrateMode) {
        this.f15052x79d6aab0 = bitrateMode;
    }

    /* renamed from: setCodecType */
    public final void m31470x18be4a2e(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850 enumC3810x346f3850) {
        this.f15053xbcfd1870 = enumC3810x346f3850;
    }

    /* renamed from: setEncodeScene */
    public final void m31471xe2270254(com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncodeScene encodeScene) {
        this.f15056x71eb4816 = encodeScene;
    }

    /* renamed from: setEncoderComplexity */
    public final void m31472x762ef7f8(com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderComplexity encoderComplexity) {
        this.f15057x4764643a = encoderComplexity;
    }

    /* renamed from: setEncoderProfile */
    public final void m31473x56f519ef(com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderProfile encoderProfile) {
        this.f15058xa066e4ed = encoderProfile;
    }

    /* renamed from: setFps */
    public final void m31474xca026527(int i17) {
        this.fps = i17;
    }

    /* renamed from: setFullIFrame */
    public final void m31475xd9b03ff5(boolean z17) {
        this.f15059xbd4b39f3 = z17;
    }

    /* renamed from: setGop */
    public final void m31476xca0268c6(int i17) {
        this.gop = i17;
    }

    /* renamed from: setHeight */
    public final void m31477xf84e829(int i17) {
        this.f15060xb7389127 = i17;
    }

    /* renamed from: setReferenceStrategy */
    public final void m31478xa26d5f9c(com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy referenceStrategy) {
        this.f15063x73a2cbde = referenceStrategy;
    }

    /* renamed from: setTranscodingModeEnabled */
    public final void m31479x8eb85fae(boolean z17) {
        this.f15061xd5a81e4b = z17;
    }

    /* renamed from: setWidth */
    public final void m31480x53e9ee84(int i17) {
        this.f15064x6be2dc6 = i17;
    }

    /* renamed from: toString */
    public final java.lang.String m31481x9616526c() {
        return "width=" + this.f15064x6be2dc6 + ", height=" + this.f15060xb7389127 + ", fps=" + this.fps + ", gop=" + this.gop + ", bitrate=" + this.f15051xf9e77b6d + ", annexb=" + this.f15048xabc7b88e + ", encoderProfile=" + this.f15058xa066e4ed + ", bitrateMode=" + this.f15052x79d6aab0 + ", baseFrameIndex=" + this.f15049x6f0dbd16 + ", baseGopIndex=" + this.f15050x1b44c71b + ", fullIFrame=" + this.f15059xbd4b39f3 + ", enableBFrame=" + this.f15055x7be5498e + ", referenceStrategy=" + this.f15063x73a2cbde + ", codecType=" + this.f15053xbcfd1870 + ", isTransCodingMode=" + this.f15061xd5a81e4b + ", mediaCodecDeviceRelatedParams=" + this.f15062xfe2d4ee9 + ", encoderComplexity=" + this.f15057x4764643a + ", encodeScene=" + this.f15056x71eb4816 + ", enableAutoQP=" + this.f15054x7cc7db71;
    }

    public C3846xefe8337(com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 c3846xefe8337) {
        this.f15064x6be2dc6 = 0;
        this.f15060xb7389127 = 0;
        this.fps = 20;
        this.gop = 3;
        this.f15051xf9e77b6d = 0;
        this.f15048xabc7b88e = true;
        this.f15058xa066e4ed = null;
        this.f15052x79d6aab0 = com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode.CBR;
        this.f15049x6f0dbd16 = 0L;
        this.f15050x1b44c71b = 0L;
        this.f15059xbd4b39f3 = false;
        this.f15055x7be5498e = false;
        this.f15063x73a2cbde = com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.ReferenceStrategy.FIX_GOP;
        this.f15053xbcfd1870 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850.H264;
        this.f15061xd5a81e4b = false;
        this.f15057x4764643a = null;
        this.f15056x71eb4816 = com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncodeScene.kCameraRealTime;
        this.f15054x7cc7db71 = false;
        this.f15062xfe2d4ee9 = null;
        if (c3846xefe8337 == null) {
            return;
        }
        this.f15064x6be2dc6 = c3846xefe8337.f15064x6be2dc6;
        this.f15060xb7389127 = c3846xefe8337.f15060xb7389127;
        this.fps = c3846xefe8337.fps;
        this.gop = c3846xefe8337.gop;
        this.f15051xf9e77b6d = c3846xefe8337.f15051xf9e77b6d;
        this.f15048xabc7b88e = c3846xefe8337.f15048xabc7b88e;
        this.f15058xa066e4ed = c3846xefe8337.f15058xa066e4ed;
        this.f15052x79d6aab0 = c3846xefe8337.f15052x79d6aab0;
        this.f15049x6f0dbd16 = c3846xefe8337.f15049x6f0dbd16;
        this.f15050x1b44c71b = c3846xefe8337.f15050x1b44c71b;
        this.f15059xbd4b39f3 = c3846xefe8337.f15059xbd4b39f3;
        this.f15055x7be5498e = c3846xefe8337.f15055x7be5498e;
        this.f15053xbcfd1870 = c3846xefe8337.f15053xbcfd1870;
        this.f15063x73a2cbde = c3846xefe8337.f15063x73a2cbde;
        this.f15061xd5a81e4b = c3846xefe8337.f15061xd5a81e4b;
        this.f15057x4764643a = c3846xefe8337.f15057x4764643a;
        this.f15056x71eb4816 = c3846xefe8337.f15056x71eb4816;
        this.f15054x7cc7db71 = c3846xefe8337.f15054x7cc7db71;
        if (c3846xefe8337.f15062xfe2d4ee9 != null) {
            try {
                this.f15062xfe2d4ee9 = new org.json.JSONArray(c3846xefe8337.f15062xfe2d4ee9.toString());
            } catch (org.json.JSONException unused) {
            }
        }
    }
}
