package com.p3249xcbb51f6b.ndk;

/* renamed from: com.tenpay.ndk.WxSmCryptoUtil */
/* loaded from: classes9.dex */
public class C28022x73d433fe {

    /* renamed from: SM2_DEFAULT_ID */
    public static final byte[] f63091xff3fc180 = "1234567812345678".getBytes();

    /* renamed from: instance */
    private static volatile com.p3249xcbb51f6b.ndk.C28022x73d433fe f63092x21169495 = null;

    /* renamed from: fitScUtil */
    private com.p3249xcbb51f6b.ndk.C28017xb1a251c3 f63093x3a3031e3;

    /* renamed from: com.tenpay.ndk.WxSmCryptoUtil$SM2CipherMode */
    /* loaded from: classes16.dex */
    public enum SM2CipherMode {
        SM2CipherMode_C1C3C2_ASN1,
        SM2CipherMode_C1C3C2,
        SM2CipherMode_C1C2C3_ASN1,
        SM2CipherMode_C1C2C3,
        SM2CipherMode_04C1C3C2,
        SM2CipherMode_04C1C2C3
    }

    /* renamed from: com.tenpay.ndk.WxSmCryptoUtil$SM2SignMode */
    /* loaded from: classes6.dex */
    public enum SM2SignMode {
        SM2SignMode_RS_ASN1,
        SM2SignMode_RS
    }

    /* renamed from: com.tenpay.ndk.WxSmCryptoUtil$SM4Mode */
    /* loaded from: classes6.dex */
    public enum SM4Mode {
        SM4_ECB
    }

    private C28022x73d433fe() {
        this.f63093x3a3031e3 = null;
        com.p3249xcbb51f6b.ndk.C28017xb1a251c3 c28017xb1a251c3 = new com.p3249xcbb51f6b.ndk.C28017xb1a251c3();
        this.f63093x3a3031e3 = c28017xb1a251c3;
        boolean m121852x74210a9e = c28017xb1a251c3.m121852x74210a9e();
        com.p3249xcbb51f6b.ndk.C28015xdd3e0c12.Logger m121816xcc17022a = com.p3249xcbb51f6b.ndk.C28015xdd3e0c12.m121816xcc17022a();
        if (m121816xcc17022a != null) {
            m121816xcc17022a.mo121648x64f5ce5(this.f63093x3a3031e3.m121841x75feee5c(), "WxSmCryptoUtil, fitScUtil.initTsm ok = " + m121852x74210a9e);
        }
    }

    /* renamed from: getInstance */
    public static com.p3249xcbb51f6b.ndk.C28022x73d433fe m121931x9cf0d20b() {
        if (f63092x21169495 == null) {
            synchronized (com.p3249xcbb51f6b.ndk.C28022x73d433fe.class) {
                if (f63092x21169495 == null) {
                    f63092x21169495 = new com.p3249xcbb51f6b.ndk.C28022x73d433fe();
                }
            }
        }
        return f63092x21169495;
    }

    /* renamed from: encryptDataWithSm4 */
    public java.lang.String m121932x69359fc5(byte[] bArr, int i17) {
        return this.f63093x3a3031e3.m121834x69359fc5(bArr, i17);
    }

    /* renamed from: encryptGenericDataWithCert */
    public java.lang.String m121933x582422a6(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String m121835x582422a6;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121835x582422a6 = this.f63093x3a3031e3.m121835x582422a6(str, str2, str3, false);
        }
        return m121835x582422a6;
    }

    /* renamed from: encryptPassword */
    public java.lang.String m121934xe6451c20(java.lang.String str, long j17, java.lang.String str2, int i17) {
        java.lang.String m121837xe6451c20;
        byte[] bytes = str == null ? null : str.getBytes();
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121837xe6451c20 = this.f63093x3a3031e3.m121837xe6451c20(bytes, "prod-wxpay-pbkdf2".getBytes(), j17, str2, i17);
        }
        return m121837xe6451c20;
    }

    /* renamed from: getGenericDataHash */
    public java.lang.String m121935xf272b899(java.lang.String str, java.lang.String str2) {
        java.lang.String m121840xf272b899;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121840xf272b899 = this.f63093x3a3031e3.m121840xf272b899(str, str2);
        }
        return m121840xf272b899;
    }

    /* renamed from: getLastError */
    public int m121936x75feee5c() {
        return this.f63093x3a3031e3.m121841x75feee5c();
    }

    /* renamed from: getVersion */
    public java.lang.String m121937x52c258a2() {
        return this.f63093x3a3031e3.m121847x52c258a2();
    }

    /* renamed from: randomBytes */
    public byte[] m121938xd4b76d68(int i17) {
        return this.f63093x3a3031e3.m121854xd4b76d68(i17);
    }

    /* renamed from: sm2Decrypt */
    public byte[] m121939xe745c955(byte[] bArr, byte[] bArr2) {
        byte[] m121861xe745c955;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121861xe745c955 = this.f63093x3a3031e3.m121861xe745c955(bArr, bArr2);
        }
        return m121861xe745c955;
    }

    /* renamed from: sm2DecryptWithMode */
    public byte[] m121940x93ea93fe(byte[] bArr, byte[] bArr2, com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM2CipherMode sM2CipherMode) {
        byte[] m121862x93ea93fe;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121862x93ea93fe = this.f63093x3a3031e3.m121862x93ea93fe(bArr, bArr2, sM2CipherMode.ordinal());
        }
        return m121862x93ea93fe;
    }

    /* renamed from: sm2Encrypt */
    public byte[] m121941x2b87a22d(byte[] bArr, byte[] bArr2) {
        byte[] m121863x2b87a22d;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121863x2b87a22d = this.f63093x3a3031e3.m121863x2b87a22d(bArr, bArr2);
        }
        return m121863x2b87a22d;
    }

    /* renamed from: sm2EncryptWithMode */
    public byte[] m121942xde9214d6(byte[] bArr, byte[] bArr2, com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM2CipherMode sM2CipherMode) {
        byte[] m121864xde9214d6;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121864xde9214d6 = this.f63093x3a3031e3.m121864xde9214d6(bArr, bArr2, sM2CipherMode.ordinal());
        }
        return m121864xde9214d6;
    }

    /* renamed from: sm2GenKeyPair */
    public byte[][] m121943x94e577a1() {
        byte[][] bArr;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            bArr = (byte[][]) this.f63093x3a3031e3.m121865x94e577a1();
        }
        return bArr;
    }

    /* renamed from: sm2GenPublicKey */
    public byte[] m121944xc454e6fe(byte[] bArr) {
        byte[] m121866xc454e6fe;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121866xc454e6fe = this.f63093x3a3031e3.m121866xc454e6fe(bArr);
        }
        return m121866xc454e6fe;
    }

    /* renamed from: sm2SealEnvelope */
    public byte[] m121945x1d92225(byte[] bArr, byte[] bArr2, com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM4Mode sM4Mode) {
        byte[] m121867x1d92225;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121867x1d92225 = this.f63093x3a3031e3.m121867x1d92225(bArr, bArr2, sM4Mode.ordinal());
        }
        return m121867x1d92225;
    }

    /* renamed from: sm2Sign */
    public byte[] m121946x8054c2f5(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] m121868x8054c2f5;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121868x8054c2f5 = this.f63093x3a3031e3.m121868x8054c2f5(bArr, bArr2, bArr3, bArr4);
        }
        return m121868x8054c2f5;
    }

    /* renamed from: sm2SignWithMode */
    public byte[] m121947x79b5ed9e(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM2SignMode sM2SignMode) {
        byte[] m121869x79b5ed9e;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121869x79b5ed9e = this.f63093x3a3031e3.m121869x79b5ed9e(bArr, bArr2, bArr3, bArr4, sM2SignMode.ordinal());
        }
        return m121869x79b5ed9e;
    }

    /* renamed from: sm2UnsealEnvelope */
    public byte[] m121948x28aca53e(byte[] bArr, byte[] bArr2) {
        byte[] m121870x28aca53e;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121870x28aca53e = this.f63093x3a3031e3.m121870x28aca53e(bArr, bArr2);
        }
        return m121870x28aca53e;
    }

    /* renamed from: sm2Verify */
    public boolean m121949xc31affb1(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        boolean m121871xc31affb1;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121871xc31affb1 = this.f63093x3a3031e3.m121871xc31affb1(bArr, bArr2, bArr3, bArr4);
        }
        return m121871xc31affb1;
    }

    /* renamed from: sm2VerifyWithMode */
    public boolean m121950x82c1ae5a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM2SignMode sM2SignMode) {
        boolean m121872x82c1ae5a;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121872x82c1ae5a = this.f63093x3a3031e3.m121872x82c1ae5a(bArr, bArr2, bArr3, bArr4, sM2SignMode.ordinal());
        }
        return m121872x82c1ae5a;
    }

    public byte[] sm3(byte[] bArr) {
        return this.f63093x3a3031e3.sm3(bArr);
    }

    /* renamed from: sm3Hmac */
    public byte[] m121951x805de8a0(byte[] bArr, byte[] bArr2) {
        return this.f63093x3a3031e3.m121873x805de8a0(bArr, bArr2);
    }

    /* renamed from: sm4CbcDecrypt */
    public byte[] m121952x469d09c3(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z17) {
        return this.f63093x3a3031e3.m121874x469d09c3(bArr, bArr2, bArr3, z17);
    }

    /* renamed from: sm4CbcEncrypt */
    public byte[] m121953x8adee29b(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z17) {
        return this.f63093x3a3031e3.m121875x8adee29b(bArr, bArr2, bArr3, z17);
    }

    /* renamed from: sm4CtrDecrypt */
    public byte[] m121954xc99e78e6(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f63093x3a3031e3.m121876xc99e78e6(bArr, bArr2, bArr3);
    }

    /* renamed from: sm4CtrEncrypt */
    public byte[] m121955xde051be(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f63093x3a3031e3.m121877xde051be(bArr, bArr2, bArr3);
    }

    /* renamed from: sm4GcmDecrypt */
    public byte[] m121956xbad2fdf6(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return this.f63093x3a3031e3.m121878xbad2fdf6(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    /* renamed from: sm4GcmEncrypt */
    public byte[][] m121957xff14d6ce(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return (byte[][]) this.f63093x3a3031e3.m121879xff14d6ce(bArr, bArr2, bArr3, bArr4);
    }
}
