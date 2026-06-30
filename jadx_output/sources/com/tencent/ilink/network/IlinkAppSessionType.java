package com.tencent.ilink.network;

/* loaded from: classes6.dex */
public enum IlinkAppSessionType implements com.tencent.mm.protobuf.h {
    kIlinkAppNoneLogin(0),
    kIlinkAppFaceLogin(1),
    kIlinkAppQrcodeLogin(2),
    kIlinkAppImLogin(3),
    kIlinkAppGetSession(4),
    kIlinkApp3rdAppAuth(5),
    kIlinkAppOAuthLogin(6),
    kIlinkAppVisitorLogin(7),
    kIlinkAppCloudLogin(8);

    public static final int kIlinkApp3rdAppAuth_VALUE = 5;
    public static final int kIlinkAppCloudLogin_VALUE = 8;
    public static final int kIlinkAppFaceLogin_VALUE = 1;
    public static final int kIlinkAppGetSession_VALUE = 4;
    public static final int kIlinkAppImLogin_VALUE = 3;
    public static final int kIlinkAppNoneLogin_VALUE = 0;
    public static final int kIlinkAppOAuthLogin_VALUE = 6;
    public static final int kIlinkAppQrcodeLogin_VALUE = 2;
    public static final int kIlinkAppVisitorLogin_VALUE = 7;
    public final int value;

    IlinkAppSessionType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.network.IlinkAppSessionType forNumber(int i17) {
        switch (i17) {
            case 0:
                return kIlinkAppNoneLogin;
            case 1:
                return kIlinkAppFaceLogin;
            case 2:
                return kIlinkAppQrcodeLogin;
            case 3:
                return kIlinkAppImLogin;
            case 4:
                return kIlinkAppGetSession;
            case 5:
                return kIlinkApp3rdAppAuth;
            case 6:
                return kIlinkAppOAuthLogin;
            case 7:
                return kIlinkAppVisitorLogin;
            case 8:
                return kIlinkAppCloudLogin;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.network.IlinkAppSessionType valueOf(int i17) {
        return forNumber(i17);
    }
}
