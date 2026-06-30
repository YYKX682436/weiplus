package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkRunningMode */
/* loaded from: classes6.dex */
public enum EnumC27110xb59c283f implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkDeviceMode(0),
    kIlinkAppMode(1);


    /* renamed from: kIlinkAppMode_VALUE */
    public static final int f59210x82d92d5e = 1;

    /* renamed from: kIlinkDeviceMode_VALUE */
    public static final int f59212xf6157903 = 0;

    /* renamed from: value */
    public final int f59213x6ac9171;

    EnumC27110xb59c283f(int i17) {
        this.f59213x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27110xb59c283f m110464x382ad972(int i17) {
        if (i17 == 0) {
            return kIlinkDeviceMode;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkAppMode;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f59213x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27110xb59c283f m110465xdce0328(int i17) {
        return m110464x382ad972(i17);
    }
}
