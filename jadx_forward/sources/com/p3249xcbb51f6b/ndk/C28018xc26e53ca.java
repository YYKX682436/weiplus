package com.p3249xcbb51f6b.ndk;

/* renamed from: com.tenpay.ndk.HkWxCertUtil */
/* loaded from: classes9.dex */
public class C28018xc26e53ca {

    /* renamed from: RSA_1024 */
    public static final int f63087xe1024f60 = 0;

    /* renamed from: RSA_2048 */
    public static final int f63088xe102c401 = 1;

    static {
        com.p3249xcbb51f6b.ndk.C28014xdc86afd9.m121812x32c4e6("tenpay_utils");
    }

    /* renamed from: certDecrypt */
    public static native byte[] m121882xcd1676c9(java.lang.String str, byte[] bArr);

    /* renamed from: certEncrypt */
    public static native byte[] m121883x11584fa1(java.lang.String str, byte[] bArr);

    /* renamed from: certSign */
    public static native byte[] m121884xd3fc2a01(java.lang.String str, byte[] bArr);

    /* renamed from: certVerify */
    public static native boolean m121885xca84d3bd(java.lang.String str, byte[] bArr, byte[] bArr2);

    /* renamed from: clearAllCert */
    public static native boolean m121886xc82e6058();

    /* renamed from: clearCert */
    public static native boolean m121887xb437c611(java.lang.String str);

    /* renamed from: getAlgoToken */
    public static native java.lang.String m121888xb39fcb0(java.lang.String str, int i17, int i18, byte[] bArr, long j17, long j18, long j19, int i19);

    /* renamed from: getCsr */
    public static native java.lang.String m121889xb58832cc(int i17);

    /* renamed from: getError */
    public static native int m121890x74627852();

    /* renamed from: getExpireTime */
    public static native long m121891xbc7fd482(java.lang.String str);

    /* renamed from: getVersion */
    public static native java.lang.String m121892x52c258a2();

    /* renamed from: hasCert */
    public static native boolean m121893x2982b3de(java.lang.String str);

    /* renamed from: importCert */
    public static native boolean m121894x7ea51769(java.lang.String str, java.lang.String str2);

    /* renamed from: init */
    public static native boolean m121895x316510(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);
}
