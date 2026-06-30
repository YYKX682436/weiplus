package com.tencent.ilink.auth;

/* loaded from: classes6.dex */
public enum IlinkLoginScene implements com.tencent.mm.protobuf.h {
    kIlinkLoginSceneNone(0),
    kIlinkLoginSceneFace(1),
    kIlinkLoginSceneQrCode(2),
    kIlinkLoginSceneThirdApp(5),
    kIlinkLoginSceneOAuth(6),
    kIlinkLoginSceneVisitor(7);

    public static final int kIlinkLoginSceneFace_VALUE = 1;
    public static final int kIlinkLoginSceneNone_VALUE = 0;
    public static final int kIlinkLoginSceneOAuth_VALUE = 6;
    public static final int kIlinkLoginSceneQrCode_VALUE = 2;
    public static final int kIlinkLoginSceneThirdApp_VALUE = 5;
    public static final int kIlinkLoginSceneVisitor_VALUE = 7;
    public final int value;

    IlinkLoginScene(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.IlinkLoginScene forNumber(int i17) {
        if (i17 == 0) {
            return kIlinkLoginSceneNone;
        }
        if (i17 == 1) {
            return kIlinkLoginSceneFace;
        }
        if (i17 == 2) {
            return kIlinkLoginSceneQrCode;
        }
        if (i17 == 5) {
            return kIlinkLoginSceneThirdApp;
        }
        if (i17 == 6) {
            return kIlinkLoginSceneOAuth;
        }
        if (i17 != 7) {
            return null;
        }
        return kIlinkLoginSceneVisitor;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.IlinkLoginScene valueOf(int i17) {
        return forNumber(i17);
    }
}
