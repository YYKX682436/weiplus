package com.tencent.mars.cdn.proto;

/* loaded from: classes6.dex */
public enum VideoFormatPolicy implements com.tencent.mm.protobuf.h {
    VIDEO_FORMAT_POLICY_AUTO(0),
    VIDEO_FORMAT_POLICY_MUST_MATCH(1);

    public static final int VIDEO_FORMAT_POLICY_AUTO_VALUE = 0;
    public static final int VIDEO_FORMAT_POLICY_MUST_MATCH_VALUE = 1;
    public final int value;

    VideoFormatPolicy(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.VideoFormatPolicy forNumber(int i17) {
        if (i17 == 0) {
            return VIDEO_FORMAT_POLICY_AUTO;
        }
        if (i17 != 1) {
            return null;
        }
        return VIDEO_FORMAT_POLICY_MUST_MATCH;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.VideoFormatPolicy valueOf(int i17) {
        return forNumber(i17);
    }
}
