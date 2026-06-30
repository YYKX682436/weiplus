package com.tencent.liteav.videobase.common;

/* loaded from: classes13.dex */
public enum b {
    UNKNOWN(-1),
    HDR10(0),
    HLG(1),
    UNSUPPORTED(2);

    final int mValue;

    b(int i17) {
        this.mValue = i17;
    }

    public static com.tencent.liteav.videobase.common.b a(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? UNKNOWN : UNSUPPORTED : HLG : HDR10;
    }
}
