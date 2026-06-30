package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.CloudCgiType */
/* loaded from: classes6.dex */
public enum EnumC3018xa502518a implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kAuthRequest(1),
    kTransferRequest(2);


    /* renamed from: kAuthRequest_VALUE */
    public static final int f10626xcb4e0dae = 1;

    /* renamed from: kTransferRequest_VALUE */
    public static final int f10628xa129c5cb = 2;

    /* renamed from: value */
    public final int f10629x6ac9171;

    EnumC3018xa502518a(int i17) {
        this.f10629x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3018xa502518a m23134x382ad972(int i17) {
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
        return this.f10629x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3018xa502518a m23135xdce0328(int i17) {
        return m23134x382ad972(i17);
    }
}
