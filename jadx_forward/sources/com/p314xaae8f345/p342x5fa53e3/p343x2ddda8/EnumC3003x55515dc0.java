package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkLoginType */
/* loaded from: classes6.dex */
public enum EnumC3003x55515dc0 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
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


    /* renamed from: kIlinkLoginTypeAuto_VALUE */
    public static final int f10446x1776d40c = 1;

    /* renamed from: kIlinkLoginTypeCustomAuth_VALUE */
    public static final int f10448xe5f95f56 = 8;

    /* renamed from: kIlinkLoginTypeFace_VALUE */
    public static final int f10450x509b123a = 2;

    /* renamed from: kIlinkLoginTypeIEGGOAuth_VALUE */
    public static final int f10452x6db676e2 = 7;

    /* renamed from: kIlinkLoginTypeNone_VALUE */
    public static final int f10454x85519ad5 = 0;

    /* renamed from: kIlinkLoginTypeOAuth_VALUE */
    public static final int f10456xe53b49de = 4;

    /* renamed from: kIlinkLoginTypeQrCode_VALUE */
    public static final int f10458x64084c0b = 3;

    /* renamed from: kIlinkLoginTypeRawDataAuth_VALUE */
    public static final int f10460x895ea5e1 = 9;

    /* renamed from: kIlinkLoginTypeThirdApp_VALUE */
    public static final int f10462x5a18f3d7 = 5;

    /* renamed from: kIlinkLoginTypeVisitor_VALUE */
    public static final int f10464x221e515 = 6;

    /* renamed from: value */
    public final int f10465x6ac9171;

    EnumC3003x55515dc0(int i17) {
        this.f10465x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3003x55515dc0 m22862x382ad972(int i17) {
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10465x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3003x55515dc0 m22863xdce0328(int i17) {
        return m22862x382ad972(i17);
    }
}
