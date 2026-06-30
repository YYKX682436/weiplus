package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkLoginStatus */
/* loaded from: classes6.dex */
public enum EnumC3002x446f14f8 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkLoginUnknown(-1),
    kIlinkLoginSuccess(0),
    kIlinkRequireManualLogin(1),
    kIlinkRequireAutoLogin(2);


    /* renamed from: kIlinkLoginSuccess_VALUE */
    public static final int f10436x5db3cd84 = 0;

    /* renamed from: kIlinkLoginUnknown_VALUE */
    public static final int f10438x8cdda88b = -1;

    /* renamed from: kIlinkRequireAutoLogin_VALUE */
    public static final int f10440x59e36fff = 2;

    /* renamed from: kIlinkRequireManualLogin_VALUE */
    public static final int f10442x70e2c0c8 = 1;

    /* renamed from: value */
    public final int f10443x6ac9171;

    EnumC3002x446f14f8(int i17) {
        this.f10443x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3002x446f14f8 m22856x382ad972(int i17) {
        if (i17 == -1) {
            return kIlinkLoginUnknown;
        }
        if (i17 == 0) {
            return kIlinkLoginSuccess;
        }
        if (i17 == 1) {
            return kIlinkRequireManualLogin;
        }
        if (i17 != 2) {
            return null;
        }
        return kIlinkRequireAutoLogin;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10443x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3002x446f14f8 m22857xdce0328(int i17) {
        return m22856x382ad972(i17);
    }
}
