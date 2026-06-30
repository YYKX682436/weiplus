package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkCryptoAlgo */
/* loaded from: classes15.dex */
public enum EnumC3049x46d37ed7 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkNoCrypto(0),
    kIlinkSession(1),
    kIlinkHybridEcdh(2),
    kIlinkEcdh(3);


    /* renamed from: kIlinkEcdh_VALUE */
    public static final int f10999x757a88cc = 3;

    /* renamed from: kIlinkHybridEcdh_VALUE */
    public static final int f11001xe13fd9e8 = 2;

    /* renamed from: kIlinkNoCrypto_VALUE */
    public static final int f11003x8007d90c = 0;

    /* renamed from: kIlinkSession_VALUE */
    public static final int f11005xce2cd310 = 1;

    /* renamed from: value */
    public final int f11006x6ac9171;

    EnumC3049x46d37ed7(int i17) {
        this.f11006x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 m24200x382ad972(int i17) {
        if (i17 == 0) {
            return kIlinkNoCrypto;
        }
        if (i17 == 1) {
            return kIlinkSession;
        }
        if (i17 == 2) {
            return kIlinkHybridEcdh;
        }
        if (i17 != 3) {
            return null;
        }
        return kIlinkEcdh;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f11006x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 m24201xdce0328(int i17) {
        return m24200x382ad972(i17);
    }
}
