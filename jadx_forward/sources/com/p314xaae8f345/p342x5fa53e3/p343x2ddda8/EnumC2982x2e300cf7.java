package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkCancelType */
/* loaded from: classes.dex */
public enum EnumC2982x2e300cf7 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
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


    /* renamed from: kIlinkCancelAll_VALUE */
    public static final int f10280x72e42681 = 0;

    /* renamed from: kIlinkCancelAutoLogin_VALUE */
    public static final int f10282x619b2a9a = 8;

    /* renamed from: kIlinkCancelCheckLoginQrCode_VALUE */
    public static final int f10284xe70414d3 = 6;

    /* renamed from: kIlinkCancelCustomAuthLogin_VALUE */
    public static final int f10286x91178ed0 = 16;

    /* renamed from: kIlinkCancelDeviceLogin_VALUE */
    public static final int f10288xf9855013 = 14;

    /* renamed from: kIlinkCancelFaceExtVerify_VALUE */
    public static final int f10290x41485a7d = 3;

    /* renamed from: kIlinkCancelFaceLogin_VALUE */
    public static final int f10292x59ec992c = 4;

    /* renamed from: kIlinkCancelFaceRecognizeConfig_VALUE */
    public static final int f10295x894154b3 = 1;

    /* renamed from: kIlinkCancelFaceRecognize_VALUE */
    public static final int f10296x4bdb0211 = 2;

    /* renamed from: kIlinkCancelGetAppPushToken_VALUE */
    public static final int f10298x91629df4 = 10;

    /* renamed from: kIlinkCancelGetLoginQrCode_VALUE */
    public static final int f10300x75044c5 = 5;

    /* renamed from: kIlinkCancelIEGGOAuthLogin_VALUE */
    public static final int f10302x79f8feb2 = 15;

    /* renamed from: kIlinkCancelLogout_VALUE */
    public static final int f10304xd4e06a4e = 9;

    /* renamed from: kIlinkCancelOAuthLogin_VALUE */
    public static final int f10306x8a21f4b6 = 11;

    /* renamed from: kIlinkCancelQrCodeLogin_VALUE */
    public static final int f10308xd98d6fbb = 7;

    /* renamed from: kIlinkCancelRawDataAuthLogin_VALUE */
    public static final int f10310x152b5953 = 17;

    /* renamed from: kIlinkCancelThirdAppLogin_VALUE */
    public static final int f10312x3e8ed2f = 12;

    /* renamed from: kIlinkCancelUnknown_VALUE */
    public static final int f10314x69649f6a = -1;

    /* renamed from: kIlinkCancelVisitorLogin_VALUE */
    public static final int f10316x5da3e61f = 13;

    /* renamed from: value */
    public final int f10317x6ac9171;

    EnumC2982x2e300cf7(int i17) {
        this.f10317x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2982x2e300cf7 m22531x382ad972(int i17) {
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10317x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2982x2e300cf7 m22532xdce0328(int i17) {
        return m22531x382ad972(i17);
    }
}
