package com.tencent.ilink.auth;

/* loaded from: classes6.dex */
public enum FaceExtVerifyType implements com.tencent.mm.protobuf.h {
    kFaceExtVerifyType_WxBase_Begin(0),
    kFaceExtVerifyType_WxBase_4PhoneNum(1),
    kFaceExtVerifyType_WxBase_End(999),
    kFaceExtVerifyType_WxPay_Begin(1000),
    kFaceExtVerifyType_WxPay_4PhoneNum(1001),
    kFaceExtVerifyType_WxPay_WholePhoneNum(1002),
    kFaceExtVerifyType_WxPay_QrCode(1003),
    kFaceExtVerifyType_WxPay_FacePin(1004),
    kFaceExtVerifyType_WxPay_End(kFaceExtVerifyType_WxPay_End_VALUE);

    public static final int kFaceExtVerifyType_WxBase_4PhoneNum_VALUE = 1;
    public static final int kFaceExtVerifyType_WxBase_Begin_VALUE = 0;
    public static final int kFaceExtVerifyType_WxBase_End_VALUE = 999;
    public static final int kFaceExtVerifyType_WxPay_4PhoneNum_VALUE = 1001;
    public static final int kFaceExtVerifyType_WxPay_Begin_VALUE = 1000;
    public static final int kFaceExtVerifyType_WxPay_End_VALUE = 1999;
    public static final int kFaceExtVerifyType_WxPay_FacePin_VALUE = 1004;
    public static final int kFaceExtVerifyType_WxPay_QrCode_VALUE = 1003;
    public static final int kFaceExtVerifyType_WxPay_WholePhoneNum_VALUE = 1002;
    public final int value;

    FaceExtVerifyType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.FaceExtVerifyType forNumber(int i17) {
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

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.FaceExtVerifyType valueOf(int i17) {
        return forNumber(i17);
    }
}
