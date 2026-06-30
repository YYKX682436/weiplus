package com.p314xaae8f345.p342x5fa53e3.p344x2e06d1;

/* renamed from: com.tencent.ilink.base.IlinkDomainType */
/* loaded from: classes.dex */
public enum EnumC3013x73797e41 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    ILINK_DOMAIN_WEIXIN_COM(0),
    ILINK_DOMAIN_IOT_TENCENT_COM(1),
    ILINK_DOMAIN_WECHATPAY_CN(2);


    /* renamed from: ILINK_DOMAIN_IOT_TENCENT_COM_VALUE */
    public static final int f10541x8247d409 = 1;

    /* renamed from: ILINK_DOMAIN_WECHATPAY_CN_VALUE */
    public static final int f10543x36f52a59 = 2;

    /* renamed from: ILINK_DOMAIN_WEIXIN_COM_VALUE */
    public static final int f10545xa1b5d4f5 = 0;

    /* renamed from: value */
    public final int f10546x6ac9171;

    EnumC3013x73797e41(int i17) {
        this.f10546x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3013x73797e41 m23055x382ad972(int i17) {
        if (i17 == 0) {
            return ILINK_DOMAIN_WEIXIN_COM;
        }
        if (i17 == 1) {
            return ILINK_DOMAIN_IOT_TENCENT_COM;
        }
        if (i17 != 2) {
            return null;
        }
        return ILINK_DOMAIN_WECHATPAY_CN;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10546x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3013x73797e41 m23056xdce0328(int i17) {
        return m23055x382ad972(i17);
    }
}
