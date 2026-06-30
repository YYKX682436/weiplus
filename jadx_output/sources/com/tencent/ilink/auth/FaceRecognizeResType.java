package com.tencent.ilink.auth;

/* loaded from: classes6.dex */
public enum FaceRecognizeResType implements com.tencent.mm.protobuf.h {
    kFaceRecognizeTypeRes_Non(0),
    kFaceRecognizeTypeRes_WxPay(1),
    kFaceRecognizeTypeRes_WxBase(2),
    kFaceRecognizeTypeRes_WxPayBaseAll(3);

    public static final int kFaceRecognizeTypeRes_Non_VALUE = 0;
    public static final int kFaceRecognizeTypeRes_WxBase_VALUE = 2;
    public static final int kFaceRecognizeTypeRes_WxPayBaseAll_VALUE = 3;
    public static final int kFaceRecognizeTypeRes_WxPay_VALUE = 1;
    public final int value;

    FaceRecognizeResType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.FaceRecognizeResType forNumber(int i17) {
        if (i17 == 0) {
            return kFaceRecognizeTypeRes_Non;
        }
        if (i17 == 1) {
            return kFaceRecognizeTypeRes_WxPay;
        }
        if (i17 == 2) {
            return kFaceRecognizeTypeRes_WxBase;
        }
        if (i17 != 3) {
            return null;
        }
        return kFaceRecognizeTypeRes_WxPayBaseAll;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.FaceRecognizeResType valueOf(int i17) {
        return forNumber(i17);
    }
}
