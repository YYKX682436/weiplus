package com.p314xaae8f345.mm.jni.p802x6a710b1;

/* renamed from: com.tencent.mm.jni.utils.UtilsJni */
/* loaded from: classes12.dex */
public class C10775x2f6aed54 {
    /* renamed from: AesGcmDecrypt */
    public static native byte[] m46283x8bf68b4b(byte[] bArr, byte[] bArr2);

    /* renamed from: AesGcmDecryptWithNonce */
    public static native byte[] m46284xa7a13bbe(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    /* renamed from: AesGcmDecryptWithUncompress */
    public static native byte[] m46285x1906568c(byte[] bArr, byte[] bArr2);

    /* renamed from: AesGcmEncrypt */
    public static native byte[] m46286xd0386423(byte[] bArr, byte[] bArr2);

    /* renamed from: AesGcmEncryptWithCompress */
    public static native byte[] m46287x830f760b(byte[] bArr, byte[] bArr2);

    /* renamed from: AesGcmEncryptWithNonce */
    public static native byte[][] m46288xb1e9d5e6(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    /* renamed from: AxEcdhDecrypt */
    public static native byte[] m46289xa1f4a0b4(long j17, byte[] bArr);

    /* renamed from: AxEcdhEncrypt */
    public static native byte[] m46290xe636798c(long j17, byte[] bArr);

    /* renamed from: CreateAxEcdhCryptoEngine */
    public static native long m46291x794c99b8(int i17, byte[] bArr, byte[] bArr2);

    /* renamed from: CreateHybridEcdhCryptoEngine */
    public static native long m46292xd1ea477d(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: DecryptAvatar */
    public static native byte[] m46293xb5d01926(byte[] bArr);

    /* renamed from: Ecdh */
    public static native byte[] m46294x20ddc2(byte[] bArr, byte[] bArr2);

    /* renamed from: EcdsaSign */
    public static native byte[] m46295x9630f411(byte[] bArr, byte[] bArr2);

    /* renamed from: EcdsaVerify */
    public static native int m46296xd2af59cd(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: GenEcdhKeyPair */
    public static native byte[][] m46297xf765d487();

    /* renamed from: GenEcdsaKeyPair */
    public static native byte[][] m46298xc2565635();

    /* renamed from: HKDF */
    public static native byte[] m46299x21dcc5(byte[] bArr, byte[] bArr2, java.lang.String str, int i17);

    /* renamed from: HybridEcdhDecrypt */
    public static native byte[] m46300x95077dcf(long j17, byte[] bArr);

    /* renamed from: HybridEcdhEncrypt */
    public static native byte[] m46301xd94956a7(long j17, byte[] bArr);

    /* renamed from: ReleaseAxEcdhCryptoEngine */
    public static native void m46302xa42ecfc3(long j17);

    /* renamed from: ReleaseHybridEcdhCryptoEngine */
    public static native void m46303xb55c8008(long j17);

    /* renamed from: ResetAxEcdhCryptoEngine */
    public static native void m46304x9bf27b0b(long j17);

    /* renamed from: ResetHybridEcdhCryptoEngine */
    public static native void m46305x81494750(long j17);

    /* renamed from: cryptGenRandom */
    public static native byte[] m46306x6ea14265(int i17);

    /* renamed from: doEcdsaSHAVerify */
    public static native int m46307xf50477bc(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: doEcdsaVerify */
    public static native int m46308x53e49862(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: ecdsaGeneralOctKeyPair */
    public static native byte[][] m46309x514c1dad();

    /* renamed from: ecdsaSignWithOctKey */
    public static native byte[] m46310x1e1b3c96(byte[] bArr, byte[] bArr2);

    /* renamed from: ecdsaVerifyWithOctKey */
    public static native int m46311xc5651f52(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
