package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public enum BizType implements com.tencent.mm.protobuf.h {
    BIZ_TYPE_CGI(0),
    BIZ_TYPE_CDN(1);

    public static final int BIZ_TYPE_CDN_VALUE = 1;
    public static final int BIZ_TYPE_CGI_VALUE = 0;
    public final int value;

    BizType(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.BizType forNumber(int i17) {
        if (i17 == 0) {
            return BIZ_TYPE_CGI;
        }
        if (i17 != 1) {
            return null;
        }
        return BIZ_TYPE_CDN;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.BizType valueOf(int i17) {
        return forNumber(i17);
    }
}
