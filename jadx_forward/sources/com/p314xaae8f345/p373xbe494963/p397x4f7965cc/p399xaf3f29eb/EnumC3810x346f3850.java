package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb;

/* renamed from: com.tencent.liteav.videobase.common.CodecType */
/* loaded from: classes6.dex */
public enum EnumC3810x346f3850 {
    UNKNOWN(-1),
    H264(0),
    H265(1),
    VP8(2),
    KAV1(3);


    /* renamed from: f, reason: collision with root package name */
    private static final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850[] f128239f = m30963xcee59d22();

    /* renamed from: mValue */
    public final int f14886xbee9dd04;

    EnumC3810x346f3850(int i17) {
        this.f14886xbee9dd04 = i17;
    }

    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850 a(int i17) {
        for (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850 enumC3810x346f3850 : f128239f) {
            if (i17 == enumC3810x346f3850.f14886xbee9dd04) {
                return enumC3810x346f3850;
            }
        }
        return H264;
    }
}
