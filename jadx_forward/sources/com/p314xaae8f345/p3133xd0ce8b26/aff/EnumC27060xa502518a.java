package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.CloudCgiType */
/* loaded from: classes6.dex */
public enum EnumC27060xa502518a implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kAuthRequest(1),
    kTransferRequest(2);


    /* renamed from: kAuthRequest_VALUE */
    public static final int f58679xcb4e0dae = 1;

    /* renamed from: kTransferRequest_VALUE */
    public static final int f58681xa129c5cb = 2;

    /* renamed from: value */
    public final int f58682x6ac9171;

    EnumC27060xa502518a(int i17) {
        this.f58682x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27060xa502518a m108958x382ad972(int i17) {
        if (i17 == 1) {
            return kAuthRequest;
        }
        if (i17 != 2) {
            return null;
        }
        return kTransferRequest;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f58682x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27060xa502518a m108959xdce0328(int i17) {
        return m108958x382ad972(i17);
    }
}
