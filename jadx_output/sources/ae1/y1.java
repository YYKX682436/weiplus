package ae1;

/* loaded from: classes16.dex */
public final class y1 implements ae1.c {

    /* renamed from: a, reason: collision with root package name */
    public final ae1.z1 f3424a;

    public y1(ae1.z1 smStorageImpl) {
        kotlin.jvm.internal.o.g(smStorageImpl, "smStorageImpl");
        this.f3424a = smStorageImpl;
    }

    public byte[] a(java.lang.String desc, byte[] cipher, byte[] iv6) {
        byte[] CBCDecrypt;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(cipher, "cipher");
        kotlin.jvm.internal.o.g(iv6, "iv");
        ae1.z1 z1Var = this.f3424a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            CBCDecrypt = com.tenpay.tsm.TSMCryptoSM4Desc.CBCDecrypt(desc, cipher, iv6);
        }
        kotlin.jvm.internal.o.f(CBCDecrypt, "invoke(...)");
        return CBCDecrypt;
    }

    public byte[] b(java.lang.String desc, byte[] plain, byte[] iv6) {
        byte[] CBCEncrypt;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(plain, "plain");
        kotlin.jvm.internal.o.g(iv6, "iv");
        ae1.z1 z1Var = this.f3424a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            CBCEncrypt = com.tenpay.tsm.TSMCryptoSM4Desc.CBCEncrypt(desc, plain, iv6);
        }
        kotlin.jvm.internal.o.f(CBCEncrypt, "invoke(...)");
        return CBCEncrypt;
    }

    public byte[] c(java.lang.String desc, byte[] cipher, byte[] iv6) {
        byte[] CTRDecrypt;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(cipher, "cipher");
        kotlin.jvm.internal.o.g(iv6, "iv");
        ae1.z1 z1Var = this.f3424a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            CTRDecrypt = com.tenpay.tsm.TSMCryptoSM4Desc.CTRDecrypt(desc, cipher, iv6);
        }
        kotlin.jvm.internal.o.f(CTRDecrypt, "invoke(...)");
        return CTRDecrypt;
    }

    public byte[] d(java.lang.String desc, byte[] plain, byte[] iv6) {
        byte[] CTREncrypt;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(plain, "plain");
        kotlin.jvm.internal.o.g(iv6, "iv");
        ae1.z1 z1Var = this.f3424a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            CTREncrypt = com.tenpay.tsm.TSMCryptoSM4Desc.CTREncrypt(desc, plain, iv6);
        }
        kotlin.jvm.internal.o.f(CTREncrypt, "invoke(...)");
        return CTREncrypt;
    }

    public byte[] e(java.lang.String desc, byte[] cipher) {
        byte[] ECBDecrypt;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(cipher, "cipher");
        ae1.z1 z1Var = this.f3424a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            ECBDecrypt = com.tenpay.tsm.TSMCryptoSM4Desc.ECBDecrypt(desc, cipher);
        }
        kotlin.jvm.internal.o.f(ECBDecrypt, "invoke(...)");
        return ECBDecrypt;
    }

    public byte[] f(java.lang.String desc, byte[] plain) {
        byte[] ECBEncrypt;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(plain, "plain");
        ae1.z1 z1Var = this.f3424a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            ECBEncrypt = com.tenpay.tsm.TSMCryptoSM4Desc.ECBEncrypt(desc, plain);
        }
        kotlin.jvm.internal.o.f(ECBEncrypt, "invoke(...)");
        return ECBEncrypt;
    }

    public byte[] g(java.lang.String desc, byte[] cipher, byte[] tag, byte[] iv6, byte[] aad) {
        byte[] GCMDecrypt;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(cipher, "cipher");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(aad, "aad");
        ae1.z1 z1Var = this.f3424a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            GCMDecrypt = com.tenpay.tsm.TSMCryptoSM4Desc.GCMDecrypt(desc, cipher, tag, iv6, aad);
        }
        kotlin.jvm.internal.o.f(GCMDecrypt, "invoke(...)");
        return GCMDecrypt;
    }

    public byte[][] h(java.lang.String desc, byte[] plain, byte[] iv6, byte[] aad) {
        byte[][] GCMEncrypt;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(plain, "plain");
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(aad, "aad");
        ae1.z1 z1Var = this.f3424a;
        synchronized (ae1.z1.f3426i) {
            com.tenpay.tsm.TSMStorage.init(z1Var.f3427d, z1Var.f3428e, z1Var.f3429f);
            GCMEncrypt = com.tenpay.tsm.TSMCryptoSM4Desc.GCMEncrypt(desc, plain, iv6, aad);
        }
        kotlin.jvm.internal.o.f(GCMEncrypt, "invoke(...)");
        return GCMEncrypt;
    }
}
