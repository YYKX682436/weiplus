package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.CipherMethod */
/* loaded from: classes8.dex */
public enum EnumC4473x44c202ec implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    CIPHER_METHOD_NONE(0),
    CIPHER_METHOD_AESECB_128(1),
    CIPHER_METHOD_AESGCM_128(2),
    CIPHER_METHOD_AESCBC_128(3),
    CIPHER_METHOD_SM4CBC(4);


    /* renamed from: CIPHER_METHOD_AESCBC_128_VALUE */
    public static final int f18550xcd716fa9 = 3;

    /* renamed from: CIPHER_METHOD_AESECB_128_VALUE */
    public static final int f18552x1d446f49 = 1;

    /* renamed from: CIPHER_METHOD_AESGCM_128_VALUE */
    public static final int f18554x601e2a96 = 2;

    /* renamed from: CIPHER_METHOD_NONE_VALUE */
    public static final int f18556xaa163a74 = 0;

    /* renamed from: CIPHER_METHOD_SM4CBC_VALUE */
    public static final int f18558x43ec7a6 = 4;

    /* renamed from: value */
    public final int f18559x6ac9171;

    EnumC4473x44c202ec(int i17) {
        this.f18559x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4473x44c202ec m38493x382ad972(int i17) {
        if (i17 == 0) {
            return CIPHER_METHOD_NONE;
        }
        if (i17 == 1) {
            return CIPHER_METHOD_AESECB_128;
        }
        if (i17 == 2) {
            return CIPHER_METHOD_AESGCM_128;
        }
        if (i17 == 3) {
            return CIPHER_METHOD_AESCBC_128;
        }
        if (i17 != 4) {
            return null;
        }
        return CIPHER_METHOD_SM4CBC;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f18559x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4473x44c202ec m38494xdce0328(int i17) {
        return m38493x382ad972(i17);
    }
}
