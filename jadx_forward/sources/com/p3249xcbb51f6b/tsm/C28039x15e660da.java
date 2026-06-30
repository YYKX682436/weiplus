package com.p3249xcbb51f6b.tsm;

/* renamed from: com.tenpay.tsm.TSMCryptoSM2Desc */
/* loaded from: classes16.dex */
public class C28039x15e660da {
    /* renamed from: decrypt */
    public static byte[] m121982x5bf1598d(java.lang.String str, byte[] bArr, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2CipherFormat sM2CipherFormat) {
        byte[][] bArr2 = new byte[1];
        int m122066x4bc23095 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122066x4bc23095(str, bArr, sM2CipherFormat.ordinal(), bArr2);
        if (m122066x4bc23095 == 0) {
            return bArr2[0];
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122066x4bc23095);
    }

    /* renamed from: encrypt */
    public static byte[] m121983xa0333265(java.lang.String str, byte[] bArr, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2CipherFormat sM2CipherFormat) {
        byte[][] bArr2 = new byte[1];
        int m122067x9004096d = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122067x9004096d(str, bArr, sM2CipherFormat.ordinal(), bArr2);
        if (m122067x9004096d == 0) {
            return bArr2[0];
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122067x9004096d);
    }

    /* renamed from: sign */
    public static byte[] m121984x35ddbd(java.lang.String str, byte[] bArr, java.lang.String str2, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2SignFormat sM2SignFormat) {
        byte[][] bArr2 = new byte[1];
        int m122068x7343a3b5 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122068x7343a3b5(str, bArr, str2, sM2SignFormat.ordinal(), bArr2);
        if (m122068x7343a3b5 == 0) {
            return bArr2[0];
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122068x7343a3b5);
    }

    /* renamed from: verify */
    public static boolean m121985xcf208879(java.lang.String str, byte[] bArr, java.lang.String str2, byte[] bArr2, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2SignFormat sM2SignFormat) {
        int m122069xb5d4b071 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122069xb5d4b071(str, bArr, str2, bArr2, sM2SignFormat.ordinal());
        if (-51003 == m122069xb5d4b071) {
            return false;
        }
        if (m122069xb5d4b071 == 0) {
            return true;
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122069xb5d4b071);
    }
}
