package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkCdnDownloadMode */
/* loaded from: classes6.dex */
public enum EnumC27091xe911e0d5 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kModeStorage(0),
    kModeStreaming(1),
    kModePreload(2),
    kModeQueryInfo(3);


    /* renamed from: kModePreload_VALUE */
    public static final int f59066x2aaeb98d = 2;

    /* renamed from: kModeQueryInfo_VALUE */
    public static final int f59068x519746da = 3;

    /* renamed from: kModeStorage_VALUE */
    public static final int f59070x18b1f07f = 0;

    /* renamed from: kModeStreaming_VALUE */
    public static final int f59072xf376c8a6 = 1;

    /* renamed from: value */
    public final int f59073x6ac9171;

    EnumC27091xe911e0d5(int i17) {
        this.f59073x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27091xe911e0d5 m110183x382ad972(int i17) {
        if (i17 == 0) {
            return kModeStorage;
        }
        if (i17 == 1) {
            return kModeStreaming;
        }
        if (i17 == 2) {
            return kModePreload;
        }
        if (i17 != 3) {
            return null;
        }
        return kModeQueryInfo;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f59073x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27091xe911e0d5 m110184xdce0328(int i17) {
        return m110183x382ad972(i17);
    }
}
