package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkReqCGIType */
/* loaded from: classes6.dex */
public enum EnumC27108x354cef04 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkCGITypeDirect(0),
    kIlinkCGITypeH5Transfer(1);


    /* renamed from: kIlinkCGITypeDirect_VALUE */
    public static final int f59189xc09f3722 = 0;

    /* renamed from: kIlinkCGITypeH5Transfer_VALUE */
    public static final int f59191xa1a48c51 = 1;

    /* renamed from: value */
    public final int f59192x6ac9171;

    EnumC27108x354cef04(int i17) {
        this.f59192x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27108x354cef04 m110408x382ad972(int i17) {
        if (i17 == 0) {
            return kIlinkCGITypeDirect;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkCGITypeH5Transfer;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f59192x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27108x354cef04 m110409xdce0328(int i17) {
        return m110408x382ad972(i17);
    }
}
