package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.FaceExtVerifyType */
/* loaded from: classes6.dex */
public enum EnumC2973xf88930d7 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kFaceExtVerifyType_WxBase_Begin(0),
    kFaceExtVerifyType_WxBase_4PhoneNum(1),
    kFaceExtVerifyType_WxBase_End(999),
    kFaceExtVerifyType_WxPay_Begin(1000),
    kFaceExtVerifyType_WxPay_4PhoneNum(1001),
    kFaceExtVerifyType_WxPay_WholePhoneNum(1002),
    kFaceExtVerifyType_WxPay_QrCode(1003),
    kFaceExtVerifyType_WxPay_FacePin(1004),
    kFaceExtVerifyType_WxPay_End(f10219x6e770e02);


    /* renamed from: kFaceExtVerifyType_WxBase_4PhoneNum_VALUE */
    public static final int f10209x1707dfe4 = 1;

    /* renamed from: kFaceExtVerifyType_WxBase_Begin_VALUE */
    public static final int f10211xd03da221 = 0;

    /* renamed from: kFaceExtVerifyType_WxBase_End_VALUE */
    public static final int f10213x8dc50653 = 999;

    /* renamed from: kFaceExtVerifyType_WxPay_4PhoneNum_VALUE */
    public static final int f10215x9f3b2853 = 1001;

    /* renamed from: kFaceExtVerifyType_WxPay_Begin_VALUE */
    public static final int f10217x4c8c7a10 = 1000;

    /* renamed from: kFaceExtVerifyType_WxPay_End_VALUE */
    public static final int f10219x6e770e02 = 1999;

    /* renamed from: kFaceExtVerifyType_WxPay_FacePin_VALUE */
    public static final int f10221xa9f4d2df = 1004;

    /* renamed from: kFaceExtVerifyType_WxPay_QrCode_VALUE */
    public static final int f10223xa6674c4b = 1003;

    /* renamed from: kFaceExtVerifyType_WxPay_WholePhoneNum_VALUE */
    public static final int f10225xe320adf6 = 1002;

    /* renamed from: value */
    public final int f10226x6ac9171;

    EnumC2973xf88930d7(int i17) {
        this.f10226x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 m22420x382ad972(int i17) {
        if (i17 == 0) {
            return kFaceExtVerifyType_WxBase_Begin;
        }
        if (i17 == 1) {
            return kFaceExtVerifyType_WxBase_4PhoneNum;
        }
        if (i17 == 1999) {
            return kFaceExtVerifyType_WxPay_End;
        }
        switch (i17) {
            case 999:
                return kFaceExtVerifyType_WxBase_End;
            case 1000:
                return kFaceExtVerifyType_WxPay_Begin;
            case 1001:
                return kFaceExtVerifyType_WxPay_4PhoneNum;
            case 1002:
                return kFaceExtVerifyType_WxPay_WholePhoneNum;
            case 1003:
                return kFaceExtVerifyType_WxPay_QrCode;
            case 1004:
                return kFaceExtVerifyType_WxPay_FacePin;
            default:
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10226x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 m22421xdce0328(int i17) {
        return m22420x382ad972(i17);
    }
}
