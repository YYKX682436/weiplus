package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkCdnFileType */
/* loaded from: classes.dex */
public enum EnumC27092x84a39e60 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kMediaTypeFile(5),
    kMediaTypeAppImageStorage(20304);


    /* renamed from: kMediaTypeAppImageStorage_VALUE */
    public static final int f59076xd85fd9a0 = 20304;

    /* renamed from: kMediaTypeFile_VALUE */
    public static final int f59078x375d0e41 = 5;

    /* renamed from: value */
    public final int f59079x6ac9171;

    EnumC27092x84a39e60(int i17) {
        this.f59079x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27092x84a39e60 m110189x382ad972(int i17) {
        if (i17 == 5) {
            return kMediaTypeFile;
        }
        if (i17 != 20304) {
            return null;
        }
        return kMediaTypeAppImageStorage;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f59079x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27092x84a39e60 m110190xdce0328(int i17) {
        return m110189x382ad972(i17);
    }
}
