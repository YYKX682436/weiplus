package com.tencent.liteav.videobase.common;

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
    private static final com.tencent.liteav.videobase.common.d[] f46733h = values();
    public final int mValue;

    d(int i17) {
        this.mValue = i17;
    }

    public static com.tencent.liteav.videobase.common.d a(int i17) {
        for (com.tencent.liteav.videobase.common.d dVar : f46733h) {
            if (dVar.mValue == i17) {
                return dVar;
            }
        }
        return UNKNOWN;
    }
}
