package com.p3249xcbb51f6b.ndk;

/* renamed from: com.tenpay.ndk.FitScUtil */
/* loaded from: classes9.dex */
public class C28017xb1a251c3 {

    /* renamed from: sm2Lock */
    public static byte[] f63086x8051aa63 = new byte[0];

    static {
        com.p3249xcbb51f6b.ndk.C28016x3e94900d.m121820x32c4e6(com.p3249xcbb51f6b.p3256x6a710b1.C28047xad48c753.f65677x627f3c25);
    }

    /* renamed from: certDecrypt */
    public native synchronized byte[] m121824xcd1676c9(java.lang.String str, byte[] bArr);

    /* renamed from: certEncrypt */
    public native synchronized byte[] m121825x11584fa1(java.lang.String str, byte[] bArr);

    /* renamed from: certSign */
    public native synchronized byte[] m121826xd3fc2a01(java.lang.String str, byte[] bArr, byte[] bArr2);

    /* renamed from: certVerify */
    public native synchronized boolean m121827xca84d3bd(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: clearAllCert */
    public native synchronized boolean m121828xc82e6058();

    /* renamed from: clearAllValue */
    public native synchronized boolean m121829x3ea781bd();

    /* renamed from: clearCert */
    public native synchronized boolean m121830xb437c611(java.lang.String str);

    /* renamed from: clearToken */
    public native synchronized boolean m121831xd3b4fbac(java.lang.String str);

    /* renamed from: clearTokenSeed */
    public native synchronized boolean m121832xb45e883d(java.lang.String str);

    /* renamed from: clearValue */
    public native synchronized boolean m121833xd3cad324(java.lang.String str);

    /* renamed from: encryptDataWithSm4 */
    public native synchronized java.lang.String m121834x69359fc5(byte[] bArr, int i17);

    /* renamed from: encryptGenericDataWithCert */
    public native synchronized java.lang.String m121835x582422a6(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17);

    /* renamed from: encryptPassWithCert */
    public native synchronized java.lang.String m121836x92511a40(java.lang.String str, byte[] bArr, byte[] bArr2, long j17, java.lang.String str2, int i17, boolean z17);

    /* renamed from: encryptPassword */
    public native synchronized java.lang.String m121837xe6451c20(byte[] bArr, byte[] bArr2, long j17, java.lang.String str, int i17);

    /* renamed from: getCaCertVersion */
    public native synchronized int m121838xcddecb20();

    /* renamed from: getCertValidTime */
    public native synchronized long[] m121839x3786736f(java.lang.String str);

    /* renamed from: getGenericDataHash */
    public native synchronized java.lang.String m121840xf272b899(java.lang.String str, java.lang.String str2);

    /* renamed from: getLastError */
    public native synchronized int m121841x75feee5c();

    /* renamed from: getToken */
    public native synchronized java.lang.String m121842x75346043(java.lang.String str);

    /* renamed from: getTokenCount */
    public native synchronized int m121843xf2c0b28c(java.lang.String str);

    /* renamed from: getTokenHeader */
    public native synchronized java.lang.String m121844x6d47b0b0(java.lang.String str);

    /* renamed from: getTokenSeed */
    public native synchronized byte[] m121845x7dbc954(java.lang.String str);

    /* renamed from: getValue */
    public native synchronized byte[] m121846x754a37bb(java.lang.String str);

    /* renamed from: getVersion */
    public native synchronized java.lang.String m121847x52c258a2();

    /* renamed from: hasCert */
    public native synchronized boolean m121848x2982b3de(java.lang.String str, boolean z17);

    /* renamed from: hasValue */
    public native synchronized boolean m121849x7dd9ef7(java.lang.String str);

    /* renamed from: importCert */
    public native synchronized boolean m121850x7ea51769(java.lang.String str, java.lang.String str2, boolean z17);

    /* renamed from: init */
    public native synchronized boolean m121851x316510(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: initTsm */
    public native synchronized boolean m121852x74210a9e();

    /* renamed from: makeCsr */
    public native synchronized java.lang.String m121853x31a01534(java.lang.String str, java.lang.String str2);

    public native synchronized byte[] md5(byte[] bArr);

    /* renamed from: randomBytes */
    public native synchronized byte[] m121854xd4b76d68(int i17);

    /* renamed from: release */
    public native synchronized void m121855x41012807();

    /* renamed from: setToken */
    public native synchronized boolean m121856x53c27ab7(java.lang.String str, java.lang.String str2);

    /* renamed from: setTokenSeed */
    public native synchronized boolean m121857x642f89c8(java.lang.String str, byte[] bArr);

    /* renamed from: setValue */
    public native synchronized boolean m121858x53d8522f(java.lang.String str, byte[] bArr);

    /* renamed from: sha1 */
    public native synchronized byte[] m121859x35d905(byte[] bArr);

    /* renamed from: sha256 */
    public native synchronized byte[] m121860xca23b627(byte[] bArr);

    /* renamed from: sm2Decrypt */
    public native synchronized byte[] m121861xe745c955(byte[] bArr, byte[] bArr2);

    /* renamed from: sm2DecryptWithMode */
    public native synchronized byte[] m121862x93ea93fe(byte[] bArr, byte[] bArr2, int i17);

    /* renamed from: sm2Encrypt */
    public native synchronized byte[] m121863x2b87a22d(byte[] bArr, byte[] bArr2);

    /* renamed from: sm2EncryptWithMode */
    public native synchronized byte[] m121864xde9214d6(byte[] bArr, byte[] bArr2, int i17);

    /* renamed from: sm2GenKeyPair */
    public native synchronized java.lang.Object[] m121865x94e577a1();

    /* renamed from: sm2GenPublicKey */
    public native synchronized byte[] m121866xc454e6fe(byte[] bArr);

    /* renamed from: sm2SealEnvelope */
    public native synchronized byte[] m121867x1d92225(byte[] bArr, byte[] bArr2, int i17);

    /* renamed from: sm2Sign */
    public native synchronized byte[] m121868x8054c2f5(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    /* renamed from: sm2SignWithMode */
    public native synchronized byte[] m121869x79b5ed9e(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i17);

    /* renamed from: sm2UnsealEnvelope */
    public native synchronized byte[] m121870x28aca53e(byte[] bArr, byte[] bArr2);

    /* renamed from: sm2Verify */
    public native synchronized boolean m121871xc31affb1(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    /* renamed from: sm2VerifyWithMode */
    public native synchronized boolean m121872x82c1ae5a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i17);

    public native synchronized byte[] sm3(byte[] bArr);

    /* renamed from: sm3Hmac */
    public native synchronized byte[] m121873x805de8a0(byte[] bArr, byte[] bArr2);

    /* renamed from: sm4CbcDecrypt */
    public native synchronized byte[] m121874x469d09c3(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z17);

    /* renamed from: sm4CbcEncrypt */
    public native synchronized byte[] m121875x8adee29b(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z17);

    /* renamed from: sm4CtrDecrypt */
    public native synchronized byte[] m121876xc99e78e6(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: sm4CtrEncrypt */
    public native synchronized byte[] m121877xde051be(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: sm4GcmDecrypt */
    public native synchronized byte[] m121878xbad2fdf6(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    /* renamed from: sm4GcmEncrypt */
    public native synchronized java.lang.Object[] m121879xff14d6ce(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    /* renamed from: updateCaCert */
    public native synchronized boolean m121880xab8655cb(int i17, java.lang.Object[] objArr);
}
