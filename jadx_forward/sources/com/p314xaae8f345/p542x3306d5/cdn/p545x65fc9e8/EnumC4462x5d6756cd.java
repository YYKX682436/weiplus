package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.BizType */
/* loaded from: classes4.dex */
public enum EnumC4462x5d6756cd implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    BIZ_TYPE_CGI(0),
    BIZ_TYPE_CDN(1);


    /* renamed from: BIZ_TYPE_CDN_VALUE */
    public static final int f18473xb7534ca6 = 1;

    /* renamed from: BIZ_TYPE_CGI_VALUE */
    public static final int f18475xe677aafe = 0;

    /* renamed from: value */
    public final int f18476x6ac9171;

    EnumC4462x5d6756cd(int i17) {
        this.f18476x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4462x5d6756cd m38232x382ad972(int i17) {
        if (i17 == 0) {
            return BIZ_TYPE_CGI;
        }
        if (i17 != 1) {
            return null;
        }
        return BIZ_TYPE_CDN;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f18476x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4462x5d6756cd m38233xdce0328(int i17) {
        return m38232x382ad972(i17);
    }
}
