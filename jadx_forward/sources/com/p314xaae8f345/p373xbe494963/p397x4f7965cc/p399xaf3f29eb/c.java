package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb;

/* loaded from: classes14.dex */
public enum c {
    UNKNOWN(65535),
    IDR(0),
    P(1),
    B(6),
    P_MULTI_REF(7),
    I(8),
    SEI(17),
    SPS(18),
    PPS(19),
    VPS(20);


    /* renamed from: k, reason: collision with root package name */
    private static final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c[] f128257k = m30998xcee59d22();

    /* renamed from: mValue */
    public final int f14909xbee9dd04;

    c(int i17) {
        this.f14909xbee9dd04 = i17;
    }

    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c a(int i17) {
        for (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c cVar : f128257k) {
            if (cVar.f14909xbee9dd04 == i17) {
                return cVar;
            }
        }
        return UNKNOWN;
    }
}
