package com.tencent.ilink.auth;

/* loaded from: classes6.dex */
public enum FaceRecognizeType implements com.tencent.mm.protobuf.h {
    kFaceRecognizeType_WxPayOnly(1),
    kFaceRecognizeType_Both_WxPayMain(2),
    kFaceRecognizeType_WxBaseOnly(3),
    kFaceRecognizeType_Both_WxBaseMain(4);

    public static final int kFaceRecognizeType_Both_WxBaseMain_VALUE = 4;
    public static final int kFaceRecognizeType_Both_WxPayMain_VALUE = 2;
    public static final int kFaceRecognizeType_WxBaseOnly_VALUE = 3;
    public static final int kFaceRecognizeType_WxPayOnly_VALUE = 1;
    public final int value;

    FaceRecognizeType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.FaceRecognizeType forNumber(int i17) {
        if (i17 == 1) {
            return kFaceRecognizeType_WxPayOnly;
        }
        if (i17 == 2) {
            return kFaceRecognizeType_Both_WxPayMain;
        }
        if (i17 == 3) {
            return kFaceRecognizeType_WxBaseOnly;
        }
        if (i17 != 4) {
            return null;
        }
        return kFaceRecognizeType_Both_WxBaseMain;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.FaceRecognizeType valueOf(int i17) {
        return forNumber(i17);
    }
}
