package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* loaded from: classes14.dex */
public enum k {
    NORMAL(0),
    ROTATION_90(90),
    ROTATION_180(180),
    ROTATION_270(270);


    /* renamed from: e, reason: collision with root package name */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k[] f127979e = m29578xcee59d22();

    /* renamed from: mValue */
    public final int f14773xbee9dd04;

    k(int i17) {
        this.f14773xbee9dd04 = i17;
    }

    public static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k a(int i17) {
        for (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar : f127979e) {
            if (kVar.f14773xbee9dd04 == i17) {
                return kVar;
            }
        }
        return NORMAL;
    }

    public static boolean b(int i17) {
        return i17 == 0 || i17 == 90 || i17 == 180 || i17 == 270;
    }

    public static int a(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar) {
        if (kVar != null) {
            return kVar.f14773xbee9dd04;
        }
        return NORMAL.f14773xbee9dd04;
    }
}
