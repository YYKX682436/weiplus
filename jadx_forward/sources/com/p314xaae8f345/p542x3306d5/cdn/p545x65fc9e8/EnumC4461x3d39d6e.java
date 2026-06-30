package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.BizId */
/* loaded from: classes6.dex */
public enum EnumC4461x3d39d6e implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
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


    /* renamed from: BIZ_C2C_NOVA_VALUE */
    public static final int f18446x75508395 = 8;

    /* renamed from: BIZ_C2C_VALUE */
    public static final int f18447x4633f6da = 1;

    /* renamed from: BIZ_CGI_VALUE */
    public static final int f18449x91208ab = -4;

    /* renamed from: BIZ_DC_VALUE */
    public static final int f18451x6f42fb5d = 5;

    /* renamed from: BIZ_FAVORITE_VALUE */
    public static final int f18453xb3dd19ba = 2;

    /* renamed from: BIZ_FRIEND_IMAGE_VALUE */
    public static final int f18455x7cb4b7f8 = 7;

    /* renamed from: BIZ_LANCS_VALUE */
    public static final int f18457xacbc17ef = -2;

    /* renamed from: BIZ_NORMAL_HTTP_VALUE */
    public static final int f18459x2d2a08e6 = -1;

    /* renamed from: BIZ_RESERVED4_VALUE */
    public static final int f18461xeab63e12 = 4;

    /* renamed from: BIZ_RESERVED6_VALUE */
    public static final int f18463x5482b494 = 6;

    /* renamed from: BIZ_SNS_VALUE */
    public static final int f18465x357f835e = 3;

    /* renamed from: BIZ_UNSPECIFIED_VALUE */
    public static final int f18467x5057e1dd = 0;

    /* renamed from: BIZ_WECOM_VALUE */
    public static final int f18469x25ed7c99 = -3;

    /* renamed from: value */
    public final int f18470x6ac9171;

    EnumC4461x3d39d6e(int i17) {
        this.f18470x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4461x3d39d6e m38226x382ad972(int i17) {
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f18470x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4461x3d39d6e m38227xdce0328(int i17) {
        return m38226x382ad972(i17);
    }
}
