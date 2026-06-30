package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkCryptoAlgo */
/* loaded from: classes15.dex */
public enum EnumC27095x46d37ed7 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkNoCrypto(0),
    kIlinkSession(1),
    kIlinkHybridEcdh(2),
    kIlinkEcdh(3);


    /* renamed from: kIlinkEcdh_VALUE */
    public static final int f59094x757a88cc = 3;

    /* renamed from: kIlinkHybridEcdh_VALUE */
    public static final int f59096xe13fd9e8 = 2;

    /* renamed from: kIlinkNoCrypto_VALUE */
    public static final int f59098x8007d90c = 0;

    /* renamed from: kIlinkSession_VALUE */
    public static final int f59100xce2cd310 = 1;

    /* renamed from: value */
    public final int f59101x6ac9171;

    EnumC27095x46d37ed7(int i17) {
        this.f59101x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27095x46d37ed7 m110215x382ad972(int i17) {
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
        return this.f59101x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27095x46d37ed7 m110216xdce0328(int i17) {
        return m110215x382ad972(i17);
    }
}
