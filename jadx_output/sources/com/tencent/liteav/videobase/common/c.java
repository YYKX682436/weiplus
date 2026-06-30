package com.tencent.liteav.videobase.common;

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
    private static final com.tencent.liteav.videobase.common.c[] f46724k = values();
    public final int mValue;

    c(int i17) {
        this.mValue = i17;
    }

    public static com.tencent.liteav.videobase.common.c a(int i17) {
        for (com.tencent.liteav.videobase.common.c cVar : f46724k) {
            if (cVar.mValue == i17) {
                return cVar;
            }
        }
        return UNKNOWN;
    }
}
