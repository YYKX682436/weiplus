package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public enum LiveActionType implements com.tencent.mm.protobuf.h {
    ENUM_EYE_BLINK(0),
    ENUM_HEAD_SHAKE(1),
    ENUM_MOUTH_OPEN(2);

    public static final int ENUM_EYE_BLINK_VALUE = 0;
    public static final int ENUM_HEAD_SHAKE_VALUE = 1;
    public static final int ENUM_MOUTH_OPEN_VALUE = 2;
    public final int value;

    LiveActionType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.LiveActionType forNumber(int i17) {
        if (i17 == 0) {
            return ENUM_EYE_BLINK;
        }
        if (i17 == 1) {
            return ENUM_HEAD_SHAKE;
        }
        if (i17 != 2) {
            return null;
        }
        return ENUM_MOUTH_OPEN;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.LiveActionType valueOf(int i17) {
        return forNumber(i17);
    }
}
