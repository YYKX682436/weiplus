package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb;

/* loaded from: classes14.dex */
public enum d {
    UNKNOWN(0),
    BASELINE(1),
    MAIN(2),
    HIGH(3),
    BASELINE_RPS(11),
    MAIN_RPS(12),
    HIGH_RPS(13);


    /* renamed from: h, reason: collision with root package name */
    private static final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.d[] f128266h = m31001xcee59d22();

    /* renamed from: mValue */
    public final int f14910xbee9dd04;

    d(int i17) {
        this.f14910xbee9dd04 = i17;
    }

    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.d a(int i17) {
        for (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.d dVar : f128266h) {
            if (dVar.f14910xbee9dd04 == i17) {
                return dVar;
            }
        }
        return UNKNOWN;
    }
}
