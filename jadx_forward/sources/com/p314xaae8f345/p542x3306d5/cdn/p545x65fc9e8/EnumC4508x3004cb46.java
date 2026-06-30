package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.MediaCompress */
/* loaded from: classes6.dex */
public enum EnumC4508x3004cb46 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    MEDIA_COMPRESS_UNKNOWN(0),
    MEDIA_COMPRESS_ORIGIN(1),
    MEDIA_COMPRESS_MID(2),
    MEDIA_COMPRESS_THUMB(3);


    /* renamed from: MEDIA_COMPRESS_MID_VALUE */
    public static final int f18890x7f9afc38 = 2;

    /* renamed from: MEDIA_COMPRESS_ORIGIN_VALUE */
    public static final int f18892x48fa967a = 1;

    /* renamed from: MEDIA_COMPRESS_THUMB_VALUE */
    public static final int f18894xbf3331c6 = 3;

    /* renamed from: MEDIA_COMPRESS_UNKNOWN_VALUE */
    public static final int f18896xd428f1ba = 0;

    /* renamed from: value */
    public final int f18897x6ac9171;

    EnumC4508x3004cb46(int i17) {
        this.f18897x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4508x3004cb46 m39223x382ad972(int i17) {
        if (i17 == 0) {
            return MEDIA_COMPRESS_UNKNOWN;
        }
        if (i17 == 1) {
            return MEDIA_COMPRESS_ORIGIN;
        }
        if (i17 == 2) {
            return MEDIA_COMPRESS_MID;
        }
        if (i17 != 3) {
            return null;
        }
        return MEDIA_COMPRESS_THUMB;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f18897x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4508x3004cb46 m39224xdce0328(int i17) {
        return m39223x382ad972(i17);
    }
}
