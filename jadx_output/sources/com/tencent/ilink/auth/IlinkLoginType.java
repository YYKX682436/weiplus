package com.tencent.ilink.auth;

/* loaded from: classes6.dex */
public enum IlinkLoginType implements com.tencent.mm.protobuf.h {
    kIlinkLoginTypeNone(0),
    kIlinkLoginTypeAuto(1),
    kIlinkLoginTypeFace(2),
    kIlinkLoginTypeQrCode(3),
    kIlinkLoginTypeOAuth(4),
    kIlinkLoginTypeThirdApp(5),
    kIlinkLoginTypeVisitor(6),
    kIlinkLoginTypeIEGGOAuth(7),
    kIlinkLoginTypeCustomAuth(8),
    kIlinkLoginTypeRawDataAuth(9);

    public static final int kIlinkLoginTypeAuto_VALUE = 1;
    public static final int kIlinkLoginTypeCustomAuth_VALUE = 8;
    public static final int kIlinkLoginTypeFace_VALUE = 2;
    public static final int kIlinkLoginTypeIEGGOAuth_VALUE = 7;
    public static final int kIlinkLoginTypeNone_VALUE = 0;
    public static final int kIlinkLoginTypeOAuth_VALUE = 4;
    public static final int kIlinkLoginTypeQrCode_VALUE = 3;
    public static final int kIlinkLoginTypeRawDataAuth_VALUE = 9;
    public static final int kIlinkLoginTypeThirdApp_VALUE = 5;
    public static final int kIlinkLoginTypeVisitor_VALUE = 6;
    public final int value;

    IlinkLoginType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.IlinkLoginType forNumber(int i17) {
        switch (i17) {
            case 0:
                return kIlinkLoginTypeNone;
            case 1:
                return kIlinkLoginTypeAuto;
            case 2:
                return kIlinkLoginTypeFace;
            case 3:
                return kIlinkLoginTypeQrCode;
            case 4:
                return kIlinkLoginTypeOAuth;
            case 5:
                return kIlinkLoginTypeThirdApp;
            case 6:
                return kIlinkLoginTypeVisitor;
            case 7:
                return kIlinkLoginTypeIEGGOAuth;
            case 8:
                return kIlinkLoginTypeCustomAuth;
            case 9:
                return kIlinkLoginTypeRawDataAuth;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.IlinkLoginType valueOf(int i17) {
        return forNumber(i17);
    }
}
