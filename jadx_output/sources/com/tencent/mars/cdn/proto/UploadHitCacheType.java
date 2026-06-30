package com.tencent.mars.cdn.proto;

/* loaded from: classes.dex */
public enum UploadHitCacheType implements com.tencent.mm.protobuf.h {
    HIT_CACHE_NONE(0),
    HIT_CACHE_FILEID(1),
    HIT_CACHE_MD5(2);

    public static final int HIT_CACHE_FILEID_VALUE = 1;
    public static final int HIT_CACHE_MD5_VALUE = 2;
    public static final int HIT_CACHE_NONE_VALUE = 0;
    public final int value;

    UploadHitCacheType(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.UploadHitCacheType forNumber(int i17) {
        if (i17 == 0) {
            return HIT_CACHE_NONE;
        }
        if (i17 == 1) {
            return HIT_CACHE_FILEID;
        }
        if (i17 != 2) {
            return null;
        }
        return HIT_CACHE_MD5;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.UploadHitCacheType valueOf(int i17) {
        return forNumber(i17);
    }
}
