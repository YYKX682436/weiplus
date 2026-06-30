package w81;

/* loaded from: classes4.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f525340e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f525341d;

    static {
        l75.e0 e0Var = w81.c.f525342p;
        f525340e = w81.c.f525343q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, w81.c.f525342p, "WxaSecurityStorageInfo", dm.bd.f317496g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = w81.c.f525342p;
        this.f525341d = db6;
    }

    public final byte[] y0(int i17) {
        try {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E("/dev/urandom");
            try {
                byte[] bArr = new byte[i17];
                int i18 = 0;
                do {
                    int read = E.read(bArr, i18, i17 - i18);
                    if (read < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecretMMKVStorage.AppBrandStorageSecurityInfoDB", "EOF of /dev/urandom ?!");
                        vz5.b.a(E, null);
                        return null;
                    }
                    i18 += read;
                } while (i18 < i17);
                vz5.b.a(E, null);
                return bArr;
            } finally {
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SecretMMKVStorage.AppBrandStorageSecurityInfoDB", e17, " generate salt by [/dev/urandom] faild,  use Random#nextBytes instead", new java.lang.Object[0]);
            byte[] bArr2 = new byte[i17];
            c06.e.f119249d.getClass();
            c06.a aVar = (c06.a) c06.e.f119250e;
            aVar.getClass();
            aVar.i().nextBytes(bArr2);
            return bArr2;
        }
    }
}
