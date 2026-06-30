package com.tencent.ilink.auth;

/* loaded from: classes6.dex */
public enum FaceDataType implements com.tencent.mm.protobuf.h {
    kFaceDataType_3D(1),
    kFaceDataType_2D_Video(2);

    public static final int kFaceDataType_2D_Video_VALUE = 2;
    public static final int kFaceDataType_3D_VALUE = 1;
    public final int value;

    FaceDataType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.FaceDataType forNumber(int i17) {
        if (i17 == 1) {
            return kFaceDataType_3D;
        }
        if (i17 != 2) {
            return null;
        }
        return kFaceDataType_2D_Video;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.FaceDataType valueOf(int i17) {
        return forNumber(i17);
    }
}
