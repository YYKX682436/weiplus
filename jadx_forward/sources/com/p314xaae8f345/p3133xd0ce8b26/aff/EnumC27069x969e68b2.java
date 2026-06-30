package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkAppSessionType */
/* loaded from: classes6.dex */
public enum EnumC27069x969e68b2 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkAppNoneLogin(0),
    kIlinkAppFaceLogin(1),
    kIlinkAppQrcodeLogin(2),
    kIlinkAppImLogin(3),
    kIlinkAppGetSession(4),
    kIlinkApp3rdAppAuth(5),
    kIlinkAppOAuthLogin(6),
    kIlinkAppVisitorLogin(7),
    kIlinkAppCloudLogin(8);


    /* renamed from: kIlinkApp3rdAppAuth_VALUE */
    public static final int f58733x93136a1f = 5;

    /* renamed from: kIlinkAppCloudLogin_VALUE */
    public static final int f58735xfbe19a6f = 8;

    /* renamed from: kIlinkAppFaceLogin_VALUE */
    public static final int f58737xfa304255 = 1;

    /* renamed from: kIlinkAppGetSession_VALUE */
    public static final int f58739xe895cd9b = 4;

    /* renamed from: kIlinkAppImLogin_VALUE */
    public static final int f58741x87f06aee = 3;

    /* renamed from: kIlinkAppNoneLogin_VALUE */
    public static final int f58743x62cde29a = 0;

    /* renamed from: kIlinkAppOAuthLogin_VALUE */
    public static final int f58745xf25370ad = 6;

    /* renamed from: kIlinkAppQrcodeLogin_VALUE */
    public static final int f58747xb2f8bac4 = 2;

    /* renamed from: kIlinkAppVisitorLogin_VALUE */
    public static final int f58749x7f664056 = 7;

    /* renamed from: value */
    public final int f58750x6ac9171;

    EnumC27069x969e68b2(int i17) {
        this.f58750x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27069x969e68b2 m109129x382ad972(int i17) {
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f58750x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27069x969e68b2 m109130xdce0328(int i17) {
        return m109129x382ad972(i17);
    }
}
