package com.tencent.mars.cdn.proto;

/* loaded from: classes6.dex */
public enum BizId implements com.tencent.mm.protobuf.h {
    BIZ_CGI(-4),
    BIZ_WECOM(-3),
    BIZ_LANCS(-2),
    BIZ_NORMAL_HTTP(-1),
    BIZ_UNSPECIFIED(0),
    BIZ_C2C(1),
    BIZ_FAVORITE(2),
    BIZ_SNS(3),
    BIZ_RESERVED4(4),
    BIZ_DC(5),
    BIZ_RESERVED6(6),
    BIZ_FRIEND_IMAGE(7),
    BIZ_C2C_NOVA(8);

    public static final int BIZ_C2C_NOVA_VALUE = 8;
    public static final int BIZ_C2C_VALUE = 1;
    public static final int BIZ_CGI_VALUE = -4;
    public static final int BIZ_DC_VALUE = 5;
    public static final int BIZ_FAVORITE_VALUE = 2;
    public static final int BIZ_FRIEND_IMAGE_VALUE = 7;
    public static final int BIZ_LANCS_VALUE = -2;
    public static final int BIZ_NORMAL_HTTP_VALUE = -1;
    public static final int BIZ_RESERVED4_VALUE = 4;
    public static final int BIZ_RESERVED6_VALUE = 6;
    public static final int BIZ_SNS_VALUE = 3;
    public static final int BIZ_UNSPECIFIED_VALUE = 0;
    public static final int BIZ_WECOM_VALUE = -3;
    public final int value;

    BizId(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.BizId forNumber(int i17) {
        switch (i17) {
            case -4:
                return BIZ_CGI;
            case -3:
                return BIZ_WECOM;
            case -2:
                return BIZ_LANCS;
            case -1:
                return BIZ_NORMAL_HTTP;
            case 0:
                return BIZ_UNSPECIFIED;
            case 1:
                return BIZ_C2C;
            case 2:
                return BIZ_FAVORITE;
            case 3:
                return BIZ_SNS;
            case 4:
                return BIZ_RESERVED4;
            case 5:
                return BIZ_DC;
            case 6:
                return BIZ_RESERVED6;
            case 7:
                return BIZ_FRIEND_IMAGE;
            case 8:
                return BIZ_C2C_NOVA;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.BizId valueOf(int i17) {
        return forNumber(i17);
    }
}
