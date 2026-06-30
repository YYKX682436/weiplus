package com.p3249xcbb51f6b.p3256x6a710b1;

/* renamed from: com.tenpay.utils.SMUtilsV2 */
/* loaded from: classes16.dex */
public class C28047xad48c753 {

    /* renamed from: LIB_NAME */
    public static final java.lang.String f65677x627f3c25 = "tsmsc";

    /* renamed from: isLoadSuccess */
    private static boolean f65678x1e1980b3;

    /* renamed from: mInstance */
    private static com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753 f65679x46143c22;

    static {
        com.p3249xcbb51f6b.ndk.C28016x3e94900d.m121820x32c4e6(f65677x627f3c25);
        f65679x46143c22 = null;
    }

    /* renamed from: TSMAllocCount */
    public static native int m122065x8d8bd728();

    /* renamed from: TSMCryptoDescSM2Decrypt */
    public static native int m122066x4bc23095(java.lang.String str, byte[] bArr, int i17, byte[][] bArr2);

    /* renamed from: TSMCryptoDescSM2Encrypt */
    public static native int m122067x9004096d(java.lang.String str, byte[] bArr, int i17, byte[][] bArr2);

    /* renamed from: TSMCryptoDescSM2Sign */
    public static native int m122068x7343a3b5(java.lang.String str, byte[] bArr, java.lang.String str2, int i17, byte[][] bArr2);

    /* renamed from: TSMCryptoDescSM2Verify */
    public static native int m122069xb5d4b071(java.lang.String str, byte[] bArr, java.lang.String str2, byte[] bArr2, int i17);

    /* renamed from: TSMCryptoDescSM4CBCDecrypt */
    public static native int m122070x6adcde83(java.lang.String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    /* renamed from: TSMCryptoDescSM4CBCEncrypt */
    public static native int m122071xaf1eb75b(java.lang.String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    /* renamed from: TSMCryptoDescSM4CTRDecrypt */
    public static native int m122072xedde4da6(java.lang.String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    /* renamed from: TSMCryptoDescSM4CTREncrypt */
    public static native int m122073x3220267e(java.lang.String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    /* renamed from: TSMCryptoDescSM4ECBDecrypt */
    public static native int m122074x7fd302e3(java.lang.String str, byte[] bArr, byte[][] bArr2);

    /* renamed from: TSMCryptoDescSM4ECBEncrypt */
    public static native int m122075xc414dbbb(java.lang.String str, byte[] bArr, byte[][] bArr2);

    /* renamed from: TSMCryptoDescSM4GCMDecrypt */
    public static native int m122076xdf12d2b6(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][] bArr5);

    /* renamed from: TSMCryptoDescSM4GCMEncrypt */
    public static native int m122077x2354ab8e(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[][] bArr4, byte[][] bArr5);

    /* renamed from: TSMStorageCheckSM2PriKey */
    public static native int m122078xaa8ffbb5(java.lang.String str);

    /* renamed from: TSMStorageCheckSM2PubKey */
    public static native int m122079xaab7139f(java.lang.String str);

    /* renamed from: TSMStorageCheckSM4Key */
    public static native int m122080x55f0e2c0(java.lang.String str);

    /* renamed from: TSMStorageDeleteSM2PriKey */
    public static native int m122081x5bc4ef78(java.lang.String str);

    /* renamed from: TSMStorageDeleteSM2PubKey */
    public static native int m122082x5bec0762(java.lang.String str);

    /* renamed from: TSMStorageDeleteSM4Key */
    public static native int m122083xf2673ddd(java.lang.String str);

    /* renamed from: TSMStorageExportSM2PriKey */
    public static native int m122084xa6971b8f(java.lang.String str, int i17, java.lang.String[] strArr, java.lang.String[] strArr2);

    /* renamed from: TSMStorageExportSM2PubKey */
    public static native int m122085xa6be3379(java.lang.String str, int i17, java.lang.String[] strArr);

    /* renamed from: TSMStorageExportSM4Key */
    public static native int m122086xec9f6126(java.lang.String str, byte[][] bArr);

    /* renamed from: TSMStorageGenerateSM2KeyPair */
    public static native int m122087x93cad0a3(java.lang.String str);

    /* renamed from: TSMStorageGenerateSM4Key */
    public static native int m122088xff6f1ee7(java.lang.String str);

    /* renamed from: TSMStorageImportSM2PriKey */
    public static native int m122089x597d1abe(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: TSMStorageImportSM2PubKey */
    public static native int m122090x59a432a8(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: TSMStorageImportSM4Key */
    public static native int m122091xa5924857(java.lang.String str, byte[] bArr);

    /* renamed from: TSMStorageInit */
    public static native int m122092x5c10f9d(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: TSMStorageUpdateSM2PriKey */
    public static native int m122093x74ffde1a(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: TSMStorageUpdateSM2PubKey */
    public static native int m122094x7526f604(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: TSMStorageUpdateSM4Key */
    public static native int m122095xe7a9a27b(java.lang.String str, byte[] bArr);

    /* renamed from: getInstance */
    public static com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753 m122096x9cf0d20b() {
        if (f65679x46143c22 == null) {
            synchronized (com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.class) {
                if (f65679x46143c22 == null) {
                    f65679x46143c22 = new com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753();
                }
            }
        }
        return f65679x46143c22;
    }

    /* renamed from: isLoadOK */
    public static boolean m122097xe6c21f0c() {
        return f65678x1e1980b3;
    }
}
