package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.UploadHitCacheType */
/* loaded from: classes.dex */
public enum EnumC4533xb224284a implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    HIT_CACHE_NONE(0),
    HIT_CACHE_FILEID(1),
    HIT_CACHE_MD5(2);


    /* renamed from: HIT_CACHE_FILEID_VALUE */
    public static final int f19116xbf8694b2 = 1;

    /* renamed from: HIT_CACHE_MD5_VALUE */
    public static final int f19118x1a4d15e7 = 2;

    /* renamed from: HIT_CACHE_NONE_VALUE */
    public static final int f19120x58a9a5d3 = 0;

    /* renamed from: value */
    public final int f19121x6ac9171;

    EnumC4533xb224284a(int i17) {
        this.f19121x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4533xb224284a m39666x382ad972(int i17) {
        if (i17 == 0) {
            return HIT_CACHE_NONE;
        }
        if (i17 == 1) {
            return HIT_CACHE_FILEID;
        }
        if (i17 != 2) {
            return null;
        }
        return HIT_CACHE_MD5;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f19121x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4533xb224284a m39667xdce0328(int i17) {
        return m39666x382ad972(i17);
    }
}
