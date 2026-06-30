package com.tencent.liteav.videobase.common;

/* loaded from: classes6.dex */
public enum CodecType {
    UNKNOWN(-1),
    H264(0),
    H265(1),
    VP8(2),
    KAV1(3);


    /* renamed from: f, reason: collision with root package name */
    private static final com.tencent.liteav.videobase.common.CodecType[] f46706f = values();
    public final int mValue;

    CodecType(int i17) {
        this.mValue = i17;
    }

    public static com.tencent.liteav.videobase.common.CodecType a(int i17) {
        for (com.tencent.liteav.videobase.common.CodecType codecType : f46706f) {
            if (i17 == codecType.mValue) {
                return codecType;
            }
        }
        return H264;
    }
}
