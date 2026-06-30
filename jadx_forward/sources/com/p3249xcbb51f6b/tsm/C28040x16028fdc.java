package com.p3249xcbb51f6b.tsm;

/* renamed from: com.tenpay.tsm.TSMCryptoSM4Desc */
/* loaded from: classes16.dex */
public class C28040x16028fdc {
    /* renamed from: CBCDecrypt */
    public static byte[] m121986x17f5e929(java.lang.String str, byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = new byte[1];
        int m122070x6adcde83 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122070x6adcde83(str, bArr, bArr2, bArr3);
        if (m122070x6adcde83 == 0) {
            return bArr3[0];
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122070x6adcde83);
    }

    /* renamed from: CBCEncrypt */
    public static byte[] m121987x5c37c201(java.lang.String str, byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = new byte[1];
        int m122071xaf1eb75b = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122071xaf1eb75b(str, bArr, bArr2, bArr3);
        if (m122071xaf1eb75b == 0) {
            return bArr3[0];
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122071xaf1eb75b);
    }

    /* renamed from: CTRDecrypt */
    public static byte[] m121988x9af7584c(java.lang.String str, byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = new byte[1];
        int m122072xedde4da6 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122072xedde4da6(str, bArr, bArr2, bArr3);
        if (m122072xedde4da6 == 0) {
            return bArr3[0];
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122072xedde4da6);
    }

    /* renamed from: CTREncrypt */
    public static byte[] m121989xdf393124(java.lang.String str, byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = new byte[1];
        int m122073x3220267e = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122073x3220267e(str, bArr, bArr2, bArr3);
        if (m122073x3220267e == 0) {
            return bArr3[0];
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122073x3220267e);
    }

    /* renamed from: ECBDecrypt */
    public static byte[] m121990x2cec0d89(java.lang.String str, byte[] bArr) {
        byte[][] bArr2 = new byte[1];
        int m122074x7fd302e3 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122074x7fd302e3(str, bArr, bArr2);
        if (m122074x7fd302e3 == 0) {
            return bArr2[0];
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122074x7fd302e3);
    }

    /* renamed from: ECBEncrypt */
    public static byte[] m121991x712de661(java.lang.String str, byte[] bArr) {
        byte[][] bArr2 = new byte[1];
        int m122075xc414dbbb = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122075xc414dbbb(str, bArr, bArr2);
        if (m122075xc414dbbb == 0) {
            return bArr2[0];
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122075xc414dbbb);
    }

    /* renamed from: GCMDecrypt */
    public static byte[] m121992x8c2bdd5c(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[][] bArr5 = new byte[1];
        int m122076xdf12d2b6 = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122076xdf12d2b6(str, bArr, bArr2, bArr3, bArr4, bArr5);
        if (m122076xdf12d2b6 == 0) {
            return bArr5[0];
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122076xdf12d2b6);
    }

    /* renamed from: GCMEncrypt */
    public static byte[][] m121993xd06db634(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[][] bArr4 = new byte[1];
        byte[][] bArr5 = new byte[1];
        int m122077x2354ab8e = com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.m122077x2354ab8e(str, bArr, bArr2, bArr3, bArr4, bArr5);
        if (m122077x2354ab8e == 0) {
            return new byte[][]{bArr4[0], bArr5[0]};
        }
        throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(m122077x2354ab8e);
    }
}
