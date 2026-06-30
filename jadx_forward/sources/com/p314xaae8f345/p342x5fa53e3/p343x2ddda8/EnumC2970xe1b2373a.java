package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.BusinessType */
/* loaded from: classes6.dex */
public enum EnumC2970xe1b2373a implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kBusinessTypeUnknown(-1),
    kBusinessTypeWxBase(0),
    kBusinessTypeWxPay(1);


    /* renamed from: kBusinessTypeUnknown_VALUE */
    public static final int f10188x302c8df7 = -1;

    /* renamed from: kBusinessTypeWxBase_VALUE */
    public static final int f10190x185b1be9 = 0;

    /* renamed from: kBusinessTypeWxPay_VALUE */
    public static final int f10192x2e1f0cb4 = 1;

    /* renamed from: value */
    public final int f10193x6ac9171;

    EnumC2970xe1b2373a(int i17) {
        this.f10193x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2970xe1b2373a m22383x382ad972(int i17) {
        if (i17 == -1) {
            return kBusinessTypeUnknown;
        }
        if (i17 == 0) {
            return kBusinessTypeWxBase;
        }
        if (i17 != 1) {
            return null;
        }
        return kBusinessTypeWxPay;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10193x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2970xe1b2373a m22384xdce0328(int i17) {
        return m22383x382ad972(i17);
    }
}
