package com.tencent.mars.cdn.proto;

/* loaded from: classes6.dex */
public enum MediaCompress implements com.tencent.mm.protobuf.h {
    MEDIA_COMPRESS_UNKNOWN(0),
    MEDIA_COMPRESS_ORIGIN(1),
    MEDIA_COMPRESS_MID(2),
    MEDIA_COMPRESS_THUMB(3);

    public static final int MEDIA_COMPRESS_MID_VALUE = 2;
    public static final int MEDIA_COMPRESS_ORIGIN_VALUE = 1;
    public static final int MEDIA_COMPRESS_THUMB_VALUE = 3;
    public static final int MEDIA_COMPRESS_UNKNOWN_VALUE = 0;
    public final int value;

    MediaCompress(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.MediaCompress forNumber(int i17) {
        if (i17 == 0) {
            return MEDIA_COMPRESS_UNKNOWN;
        }
        if (i17 == 1) {
            return MEDIA_COMPRESS_ORIGIN;
        }
        if (i17 == 2) {
            return MEDIA_COMPRESS_MID;
        }
        if (i17 != 3) {
            return null;
        }
        return MEDIA_COMPRESS_THUMB;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.MediaCompress valueOf(int i17) {
        return forNumber(i17);
    }
}
