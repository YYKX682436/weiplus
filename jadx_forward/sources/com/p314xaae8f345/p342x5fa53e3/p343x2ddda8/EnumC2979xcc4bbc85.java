package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkAppLoginType */
/* loaded from: classes.dex */
public enum EnumC2979xcc4bbc85 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kILinkAppLoginType_WxPay(1),
    kILinkAppLoginType_WxBase(2),
    kILinkAppLoginType_WxOAuth(4);


    /* renamed from: kILinkAppLoginType_WxBase_VALUE */
    public static final int f10264xd531ccc9 = 2;

    /* renamed from: kILinkAppLoginType_WxOAuth_VALUE */
    public static final int f10266x2c7bc23 = 4;

    /* renamed from: kILinkAppLoginType_WxPay_VALUE */
    public static final int f10268x553ebfd4 = 1;

    /* renamed from: value */
    public final int f10269x6ac9171;

    EnumC2979xcc4bbc85(int i17) {
        this.f10269x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2979xcc4bbc85 m22495x382ad972(int i17) {
        if (i17 == 1) {
            return kILinkAppLoginType_WxPay;
        }
        if (i17 == 2) {
            return kILinkAppLoginType_WxBase;
        }
        if (i17 != 4) {
            return null;
        }
        return kILinkAppLoginType_WxOAuth;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10269x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2979xcc4bbc85 m22496xdce0328(int i17) {
        return m22495x382ad972(i17);
    }
}
