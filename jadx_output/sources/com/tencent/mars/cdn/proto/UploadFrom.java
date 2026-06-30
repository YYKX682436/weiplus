package com.tencent.mars.cdn.proto;

/* loaded from: classes6.dex */
public enum UploadFrom implements com.tencent.mm.protobuf.h {
    UPLOAD_FROM_UNSPECIFIED(0),
    UPLOAD_FROM_REAL_UPLOAD(1),
    UPLOAD_FROM_CAMERA_SHOOT(2),
    UPLOAD_FROM_PHOTO_SAVE_AS(3),
    UPLOAD_FROM_PHOTO(4),
    UPLOAD_FROM_EDIT(5),
    UPLOAD_FROM_FORWARD(6),
    UPLOAD_FROM_SCREEN_SHOT(7),
    UPLOAD_FROM_FORBID_HIT(8),
    UPLOAD_FROM_UPPER_LIMIT(9),
    UPLOAD_FROM_ONLY_HIT_WHEN_FINISH(10);

    public static final int UPLOAD_FROM_CAMERA_SHOOT_VALUE = 2;
    public static final int UPLOAD_FROM_EDIT_VALUE = 5;
    public static final int UPLOAD_FROM_FORBID_HIT_VALUE = 8;
    public static final int UPLOAD_FROM_FORWARD_VALUE = 6;
    public static final int UPLOAD_FROM_ONLY_HIT_WHEN_FINISH_VALUE = 10;
    public static final int UPLOAD_FROM_PHOTO_SAVE_AS_VALUE = 3;
    public static final int UPLOAD_FROM_PHOTO_VALUE = 4;
    public static final int UPLOAD_FROM_REAL_UPLOAD_VALUE = 1;
    public static final int UPLOAD_FROM_SCREEN_SHOT_VALUE = 7;
    public static final int UPLOAD_FROM_UNSPECIFIED_VALUE = 0;
    public static final int UPLOAD_FROM_UPPER_LIMIT_VALUE = 9;
    public final int value;

    UploadFrom(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.UploadFrom forNumber(int i17) {
        switch (i17) {
            case 0:
                return UPLOAD_FROM_UNSPECIFIED;
            case 1:
                return UPLOAD_FROM_REAL_UPLOAD;
            case 2:
                return UPLOAD_FROM_CAMERA_SHOOT;
            case 3:
                return UPLOAD_FROM_PHOTO_SAVE_AS;
            case 4:
                return UPLOAD_FROM_PHOTO;
            case 5:
                return UPLOAD_FROM_EDIT;
            case 6:
                return UPLOAD_FROM_FORWARD;
            case 7:
                return UPLOAD_FROM_SCREEN_SHOT;
            case 8:
                return UPLOAD_FROM_FORBID_HIT;
            case 9:
                return UPLOAD_FROM_UPPER_LIMIT;
            case 10:
                return UPLOAD_FROM_ONLY_HIT_WHEN_FINISH;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.UploadFrom valueOf(int i17) {
        return forNumber(i17);
    }
}
