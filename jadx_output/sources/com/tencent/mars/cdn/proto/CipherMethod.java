package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public enum CipherMethod implements com.tencent.mm.protobuf.h {
    CIPHER_METHOD_NONE(0),
    CIPHER_METHOD_AESECB_128(1),
    CIPHER_METHOD_AESGCM_128(2),
    CIPHER_METHOD_AESCBC_128(3),
    CIPHER_METHOD_SM4CBC(4);

    public static final int CIPHER_METHOD_AESCBC_128_VALUE = 3;
    public static final int CIPHER_METHOD_AESECB_128_VALUE = 1;
    public static final int CIPHER_METHOD_AESGCM_128_VALUE = 2;
    public static final int CIPHER_METHOD_NONE_VALUE = 0;
    public static final int CIPHER_METHOD_SM4CBC_VALUE = 4;
    public final int value;

    CipherMethod(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.CipherMethod forNumber(int i17) {
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

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.CipherMethod valueOf(int i17) {
        return forNumber(i17);
    }
}
