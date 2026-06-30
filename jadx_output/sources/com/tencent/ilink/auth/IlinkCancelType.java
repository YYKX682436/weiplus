package com.tencent.ilink.auth;

/* loaded from: classes.dex */
public enum IlinkCancelType implements com.tencent.mm.protobuf.h {
    kIlinkCancelUnknown(-1),
    kIlinkCancelAll(0),
    kIlinkCancelFaceRecognizeConfig(1),
    kIlinkCancelFaceRecognize(2),
    kIlinkCancelFaceExtVerify(3),
    kIlinkCancelFaceLogin(4),
    kIlinkCancelGetLoginQrCode(5),
    kIlinkCancelCheckLoginQrCode(6),
    kIlinkCancelQrCodeLogin(7),
    kIlinkCancelAutoLogin(8),
    kIlinkCancelLogout(9),
    kIlinkCancelGetAppPushToken(10),
    kIlinkCancelOAuthLogin(11),
    kIlinkCancelThirdAppLogin(12),
    kIlinkCancelVisitorLogin(13),
    kIlinkCancelDeviceLogin(14),
    kIlinkCancelIEGGOAuthLogin(15),
    kIlinkCancelCustomAuthLogin(16),
    kIlinkCancelRawDataAuthLogin(17);

    public static final int kIlinkCancelAll_VALUE = 0;
    public static final int kIlinkCancelAutoLogin_VALUE = 8;
    public static final int kIlinkCancelCheckLoginQrCode_VALUE = 6;
    public static final int kIlinkCancelCustomAuthLogin_VALUE = 16;
    public static final int kIlinkCancelDeviceLogin_VALUE = 14;
    public static final int kIlinkCancelFaceExtVerify_VALUE = 3;
    public static final int kIlinkCancelFaceLogin_VALUE = 4;
    public static final int kIlinkCancelFaceRecognizeConfig_VALUE = 1;
    public static final int kIlinkCancelFaceRecognize_VALUE = 2;
    public static final int kIlinkCancelGetAppPushToken_VALUE = 10;
    public static final int kIlinkCancelGetLoginQrCode_VALUE = 5;
    public static final int kIlinkCancelIEGGOAuthLogin_VALUE = 15;
    public static final int kIlinkCancelLogout_VALUE = 9;
    public static final int kIlinkCancelOAuthLogin_VALUE = 11;
    public static final int kIlinkCancelQrCodeLogin_VALUE = 7;
    public static final int kIlinkCancelRawDataAuthLogin_VALUE = 17;
    public static final int kIlinkCancelThirdAppLogin_VALUE = 12;
    public static final int kIlinkCancelUnknown_VALUE = -1;
    public static final int kIlinkCancelVisitorLogin_VALUE = 13;
    public final int value;

    IlinkCancelType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.IlinkCancelType forNumber(int i17) {
        switch (i17) {
            case -1:
                return kIlinkCancelUnknown;
            case 0:
                return kIlinkCancelAll;
            case 1:
                return kIlinkCancelFaceRecognizeConfig;
            case 2:
                return kIlinkCancelFaceRecognize;
            case 3:
                return kIlinkCancelFaceExtVerify;
            case 4:
                return kIlinkCancelFaceLogin;
            case 5:
                return kIlinkCancelGetLoginQrCode;
            case 6:
                return kIlinkCancelCheckLoginQrCode;
            case 7:
                return kIlinkCancelQrCodeLogin;
            case 8:
                return kIlinkCancelAutoLogin;
            case 9:
                return kIlinkCancelLogout;
            case 10:
                return kIlinkCancelGetAppPushToken;
            case 11:
                return kIlinkCancelOAuthLogin;
            case 12:
                return kIlinkCancelThirdAppLogin;
            case 13:
                return kIlinkCancelVisitorLogin;
            case 14:
                return kIlinkCancelDeviceLogin;
            case 15:
                return kIlinkCancelIEGGOAuthLogin;
            case 16:
                return kIlinkCancelCustomAuthLogin;
            case 17:
                return kIlinkCancelRawDataAuthLogin;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.IlinkCancelType valueOf(int i17) {
        return forNumber(i17);
    }
}
