package ae1;

/* loaded from: classes16.dex */
public final class x1 implements ae1.b {

    /* renamed from: a, reason: collision with root package name */
    public final ae1.z1 f84955a;

    public x1(ae1.z1 smStorageImpl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(smStorageImpl, "smStorageImpl");
        this.f84955a = smStorageImpl;
    }

    public byte[] a(java.lang.String desc, byte[] cipher, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2CipherFormat cipherFormat) {
        byte[] m121982x5bf1598d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cipher, "cipher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cipherFormat, "cipherFormat");
        ae1.z1 z1Var = this.f84955a;
        synchronized (ae1.z1.f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
            m121982x5bf1598d = com.p3249xcbb51f6b.tsm.C28039x15e660da.m121982x5bf1598d(desc, cipher, cipherFormat);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m121982x5bf1598d, "invoke(...)");
        return m121982x5bf1598d;
    }

    public byte[] b(java.lang.String desc, byte[] plain, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2CipherFormat cipherFormat) {
        byte[] m121983xa0333265;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plain, "plain");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cipherFormat, "cipherFormat");
        ae1.z1 z1Var = this.f84955a;
        synchronized (ae1.z1.f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
            m121983xa0333265 = com.p3249xcbb51f6b.tsm.C28039x15e660da.m121983xa0333265(desc, plain, cipherFormat);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m121983xa0333265, "invoke(...)");
        return m121983xa0333265;
    }

    public byte[] c(java.lang.String desc, byte[] msg, java.lang.String id6, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2SignFormat signFormat) {
        byte[] m121984x35ddbd;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signFormat, "signFormat");
        ae1.z1 z1Var = this.f84955a;
        synchronized (ae1.z1.f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
            m121984x35ddbd = com.p3249xcbb51f6b.tsm.C28039x15e660da.m121984x35ddbd(desc, msg, id6, signFormat);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m121984x35ddbd, "invoke(...)");
        return m121984x35ddbd;
    }

    public boolean d(java.lang.String desc, byte[] msg, java.lang.String id6, byte[] sig, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.SM2SignFormat signFormat) {
        boolean m121985xcf208879;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sig, "sig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signFormat, "signFormat");
        ae1.z1 z1Var = this.f84955a;
        synchronized (ae1.z1.f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
            m121985xcf208879 = com.p3249xcbb51f6b.tsm.C28039x15e660da.m121985xcf208879(desc, msg, id6, sig, signFormat);
        }
        return m121985xcf208879;
    }
}
