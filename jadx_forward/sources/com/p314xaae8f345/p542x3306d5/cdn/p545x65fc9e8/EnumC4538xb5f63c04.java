package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.VideoFormatPolicy */
/* loaded from: classes6.dex */
public enum EnumC4538xb5f63c04 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    VIDEO_FORMAT_POLICY_AUTO(0),
    VIDEO_FORMAT_POLICY_MUST_MATCH(1);


    /* renamed from: VIDEO_FORMAT_POLICY_AUTO_VALUE */
    public static final int f19172x8a86e50a = 0;

    /* renamed from: VIDEO_FORMAT_POLICY_MUST_MATCH_VALUE */
    public static final int f19174xc97ae88a = 1;

    /* renamed from: value */
    public final int f19175x6ac9171;

    EnumC4538xb5f63c04(int i17) {
        this.f19175x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4538xb5f63c04 m39840x382ad972(int i17) {
        if (i17 == 0) {
            return VIDEO_FORMAT_POLICY_AUTO;
        }
        if (i17 != 1) {
            return null;
        }
        return VIDEO_FORMAT_POLICY_MUST_MATCH;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f19175x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4538xb5f63c04 m39841xdce0328(int i17) {
        return m39840x382ad972(i17);
    }
}
