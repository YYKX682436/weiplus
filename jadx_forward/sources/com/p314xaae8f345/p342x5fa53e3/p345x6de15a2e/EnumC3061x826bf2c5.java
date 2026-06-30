package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkNetworkType */
/* loaded from: classes15.dex */
public enum EnumC3061x826bf2c5 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkNetworkTypeDefault(0),
    kIlinkNetworkTypeMobile(1);


    /* renamed from: kIlinkNetworkTypeDefault_VALUE */
    public static final int f11082x404bbe83 = 0;

    /* renamed from: kIlinkNetworkTypeMobile_VALUE */
    public static final int f11084x71dbd4c4 = 1;

    /* renamed from: value */
    public final int f11085x6ac9171;

    EnumC3061x826bf2c5(int i17) {
        this.f11085x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 m24367x382ad972(int i17) {
        if (i17 == 0) {
            return kIlinkNetworkTypeDefault;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkNetworkTypeMobile;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f11085x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 m24368xdce0328(int i17) {
        return m24367x382ad972(i17);
    }
}
