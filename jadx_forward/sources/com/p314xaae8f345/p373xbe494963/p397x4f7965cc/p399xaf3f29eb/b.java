package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb;

/* loaded from: classes13.dex */
public enum b {
    UNKNOWN(-1),
    HDR10(0),
    HLG(1),
    UNSUPPORTED(2);


    /* renamed from: mValue */
    final int f14908xbee9dd04;

    b(int i17) {
        this.f14908xbee9dd04 = i17;
    }

    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.b a(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? UNKNOWN : UNSUPPORTED : HLG : HDR10;
    }
}
