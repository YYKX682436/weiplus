package ae1;

/* loaded from: classes16.dex */
public final class x1 implements ae1.b {

    /* renamed from: a, reason: collision with root package name */
    public final ae1.z1 f3422a;

    public x1(ae1.z1 smStorageImpl) {
        kotlin.jvm.internal.o.g(smStorageImpl, "smStorageImpl");
        this.f3422a = smStorageImpl;
    }

    public byte[] a(java.lang.String desc, byte[] cipher, com.tenpay.tsm.TSMTypes.SM2CipherFormat cipherFormat) {
        byte[] decrypt;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(cipher, "cipher");
        kotlin.jvm.internal.o.g(cipherFormat, "cipherFormat");
        ae1.z1 z1Var = this.f3422a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            decrypt = com.tenpay.tsm.TSMCryptoSM2Desc.decrypt(desc, cipher, cipherFormat);
        }
        kotlin.jvm.internal.o.f(decrypt, "invoke(...)");
        return decrypt;
    }

    public byte[] b(java.lang.String desc, byte[] plain, com.tenpay.tsm.TSMTypes.SM2CipherFormat cipherFormat) {
        byte[] encrypt;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(plain, "plain");
        kotlin.jvm.internal.o.g(cipherFormat, "cipherFormat");
        ae1.z1 z1Var = this.f3422a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            encrypt = com.tenpay.tsm.TSMCryptoSM2Desc.encrypt(desc, plain, cipherFormat);
        }
        kotlin.jvm.internal.o.f(encrypt, "invoke(...)");
        return encrypt;
    }

    public byte[] c(java.lang.String desc, byte[] msg, java.lang.String id6, com.tenpay.tsm.TSMTypes.SM2SignFormat signFormat) {
        byte[] sign;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(signFormat, "signFormat");
        ae1.z1 z1Var = this.f3422a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            sign = com.tenpay.tsm.TSMCryptoSM2Desc.sign(desc, msg, id6, signFormat);
        }
        kotlin.jvm.internal.o.f(sign, "invoke(...)");
        return sign;
    }

    public boolean d(java.lang.String desc, byte[] msg, java.lang.String id6, byte[] sig, com.tenpay.tsm.TSMTypes.SM2SignFormat signFormat) {
        boolean verify;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(sig, "sig");
        kotlin.jvm.internal.o.g(signFormat, "signFormat");
        ae1.z1 z1Var = this.f3422a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            verify = com.tenpay.tsm.TSMCryptoSM2Desc.verify(desc, msg, id6, sig, signFormat);
        }
        return verify;
    }
}
