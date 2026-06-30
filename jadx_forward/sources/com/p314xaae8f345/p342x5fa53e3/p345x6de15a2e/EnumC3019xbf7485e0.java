package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.H5TransferReqType */
/* loaded from: classes6.dex */
public enum EnumC3019xbf7485e0 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kH5TransferReqType_UnKnown(0),
    kH5TransferReqType_Weixin(1),
    kH5TransferReqType_ILink(2);


    /* renamed from: kH5TransferReqType_ILink_VALUE */
    public static final int f10632x4a9bed8b = 2;

    /* renamed from: kH5TransferReqType_UnKnown_VALUE */
    public static final int f10634xbbee2f2 = 0;

    /* renamed from: kH5TransferReqType_Weixin_VALUE */
    public static final int f10636x23d4247e = 1;

    /* renamed from: value */
    public final int f10637x6ac9171;

    EnumC3019xbf7485e0(int i17) {
        this.f10637x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3019xbf7485e0 m23140x382ad972(int i17) {
        if (i17 == 0) {
            return kH5TransferReqType_UnKnown;
        }
        if (i17 == 1) {
            return kH5TransferReqType_Weixin;
        }
        if (i17 != 2) {
            return null;
        }
        return kH5TransferReqType_ILink;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10637x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3019xbf7485e0 m23141xdce0328(int i17) {
        return m23140x382ad972(i17);
    }
}
