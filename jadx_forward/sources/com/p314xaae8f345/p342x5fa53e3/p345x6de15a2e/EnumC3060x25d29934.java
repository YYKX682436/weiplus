package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkNetType */
/* loaded from: classes6.dex */
public enum EnumC3060x25d29934 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkShortlink(0),
    kIlinkLonglink(1);


    /* renamed from: kIlinkLonglink_VALUE */
    public static final int f11076xe8d59ca0 = 1;

    /* renamed from: kIlinkShortlink_VALUE */
    public static final int f11078x1e8af4f0 = 0;

    /* renamed from: value */
    public final int f11079x6ac9171;

    EnumC3060x25d29934(int i17) {
        this.f11079x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 m24361x382ad972(int i17) {
        if (i17 == 0) {
            return kIlinkShortlink;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkLonglink;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f11079x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 m24362xdce0328(int i17) {
        return m24361x382ad972(i17);
    }
}
