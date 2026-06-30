package ae1;

/* loaded from: classes16.dex */
public final class z1 implements ae1.d {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f84959i = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84960d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f84961e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f84962f;

    /* renamed from: g, reason: collision with root package name */
    public final ae1.c f84963g = new ae1.y1(this);

    /* renamed from: h, reason: collision with root package name */
    public final ae1.b f84964h = new ae1.x1(this);

    public z1(java.lang.String str, java.lang.String str2, java.lang.String str3, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f84960d = str;
        this.f84961e = str2;
        this.f84962f = str3;
    }

    public java.lang.String[] a(java.lang.String desc, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat keyFormat) {
        java.lang.String[] m122003x36dcf03c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyFormat, "keyFormat");
        synchronized (f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(this.f84960d, this.f84961e, this.f84962f);
            m122003x36dcf03c = com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122003x36dcf03c(desc, keyFormat);
            if (m122003x36dcf03c == null) {
                throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(com.p3249xcbb51f6b.tsm.C28041x16492e41.f65632x3f9a6cad);
            }
        }
        return m122003x36dcf03c;
    }

    public java.lang.String b(java.lang.String desc, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat keyFormat) {
        java.lang.String m122004x37040826;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyFormat, "keyFormat");
        synchronized (f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(this.f84960d, this.f84961e, this.f84962f);
            m122004x37040826 = com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122004x37040826(desc, keyFormat);
            if (m122004x37040826 == null) {
                throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(com.p3249xcbb51f6b.tsm.C28041x16492e41.f65632x3f9a6cad);
            }
        }
        return m122004x37040826;
    }

    public byte[] c(java.lang.String desc) {
        byte[] m122005xcaa89399;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        synchronized (f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(this.f84960d, this.f84961e, this.f84962f);
            m122005xcaa89399 = com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122005xcaa89399(desc);
            if (m122005xcaa89399 == null) {
                throw new com.p3249xcbb51f6b.tsm.C28041x16492e41(com.p3249xcbb51f6b.tsm.C28041x16492e41.f65632x3f9a6cad);
            }
        }
        return m122005xcaa89399;
    }

    public void d(java.lang.String desc, java.lang.String priKey, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat keyFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priKey, "priKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyFormat, "keyFormat");
        synchronized (f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(this.f84960d, this.f84961e, this.f84962f);
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122008xe9c2ef6b(desc, priKey, keyFormat);
        }
    }

    public void e(java.lang.String desc, java.lang.String pubKey, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat keyFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pubKey, "pubKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyFormat, "keyFormat");
        synchronized (f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(this.f84960d, this.f84961e, this.f84962f);
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122009xe9ea0755(desc, pubKey, keyFormat);
        }
    }

    public void f(java.lang.String desc, byte[] key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        synchronized (f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(this.f84960d, this.f84961e, this.f84962f);
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122010x839b7aca(desc, key);
        }
    }

    public void g(java.lang.String desc, java.lang.String priKey, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat keyFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priKey, "priKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyFormat, "keyFormat");
        synchronized (f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(this.f84960d, this.f84961e, this.f84962f);
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122012x545b2c7(desc, priKey, keyFormat);
        }
    }

    public void h(java.lang.String desc, java.lang.String pubKey, com.p3249xcbb51f6b.tsm.C28043xc4c57f6b.TSMStorageSM2KeyFormat keyFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pubKey, "pubKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyFormat, "keyFormat");
        synchronized (f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(this.f84960d, this.f84961e, this.f84962f);
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122013x56ccab1(desc, pubKey, keyFormat);
        }
    }

    public void i(java.lang.String desc, byte[] key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        synchronized (f84959i) {
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(this.f84960d, this.f84961e, this.f84962f);
            com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122014xc5b2d4ee(desc, key);
        }
    }
}
