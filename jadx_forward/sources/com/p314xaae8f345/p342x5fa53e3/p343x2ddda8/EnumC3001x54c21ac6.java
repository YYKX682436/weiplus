package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkLoginScene */
/* loaded from: classes6.dex */
public enum EnumC3001x54c21ac6 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkLoginSceneNone(0),
    kIlinkLoginSceneFace(1),
    kIlinkLoginSceneQrCode(2),
    kIlinkLoginSceneThirdApp(5),
    kIlinkLoginSceneOAuth(6),
    kIlinkLoginSceneVisitor(7);


    /* renamed from: kIlinkLoginSceneFace_VALUE */
    public static final int f10422x9f054e4a = 1;

    /* renamed from: kIlinkLoginSceneNone_VALUE */
    public static final int f10424xd3bbd6e5 = 0;

    /* renamed from: kIlinkLoginSceneOAuth_VALUE */
    public static final int f10426x64188fce = 6;

    /* renamed from: kIlinkLoginSceneQrCode_VALUE */
    public static final int f10428xc0d3c41b = 2;

    /* renamed from: kIlinkLoginSceneThirdApp_VALUE */
    public static final int f10430xb1e6a7e7 = 5;

    /* renamed from: kIlinkLoginSceneVisitor_VALUE */
    public static final int f10432x3ec56f05 = 7;

    /* renamed from: value */
    public final int f10433x6ac9171;

    EnumC3001x54c21ac6(int i17) {
        this.f10433x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3001x54c21ac6 m22850x382ad972(int i17) {
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10433x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3001x54c21ac6 m22851xdce0328(int i17) {
        return m22850x382ad972(i17);
    }
}
