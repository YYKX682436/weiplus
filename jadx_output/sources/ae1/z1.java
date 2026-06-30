package ae1;

/* loaded from: classes16.dex */
public final class z1 implements ae1.d {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f3426i = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f3427d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f3428e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f3429f;

    /* renamed from: g, reason: collision with root package name */
    public final ae1.c f3430g = new ae1.y1(this);

    /* renamed from: h, reason: collision with root package name */
    public final ae1.b f3431h = new ae1.x1(this);

    public z1(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.i iVar) {
        this.f3427d = str;
        this.f3428e = str2;
        this.f3429f = str3;
    }

    public java.lang.String[] a(java.lang.String desc, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat keyFormat) {
        java.lang.String[] exportSM2PriKey;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(keyFormat, "keyFormat");
        synchronized (f3426i) {
            com.tenpay.tsm.TSMStorage.init(this.f3427d, this.f3428e, this.f3429f);
            exportSM2PriKey = com.tenpay.tsm.TSMStorage.exportSM2PriKey(desc, keyFormat);
            if (exportSM2PriKey == null) {
                throw new com.tenpay.tsm.TSMException(com.tenpay.tsm.TSMException.ERR_KV_FILE_NOT_FOUND);
            }
        }
        return exportSM2PriKey;
    }

    public java.lang.String b(java.lang.String desc, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat keyFormat) {
        java.lang.String exportSM2PubKey;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(keyFormat, "keyFormat");
        synchronized (f3426i) {
            com.tenpay.tsm.TSMStorage.init(this.f3427d, this.f3428e, this.f3429f);
            exportSM2PubKey = com.tenpay.tsm.TSMStorage.exportSM2PubKey(desc, keyFormat);
            if (exportSM2PubKey == null) {
                throw new com.tenpay.tsm.TSMException(com.tenpay.tsm.TSMException.ERR_KV_FILE_NOT_FOUND);
            }
        }
        return exportSM2PubKey;
    }

    public byte[] c(java.lang.String desc) {
        byte[] exportSM4Key;
        kotlin.jvm.internal.o.g(desc, "desc");
        synchronized (f3426i) {
            com.tenpay.tsm.TSMStorage.init(this.f3427d, this.f3428e, this.f3429f);
            exportSM4Key = com.tenpay.tsm.TSMStorage.exportSM4Key(desc);
            if (exportSM4Key == null) {
                throw new com.tenpay.tsm.TSMException(com.tenpay.tsm.TSMException.ERR_KV_FILE_NOT_FOUND);
            }
        }
        return exportSM4Key;
    }

    public void d(java.lang.String desc, java.lang.String priKey, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat keyFormat) {
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(priKey, "priKey");
        kotlin.jvm.internal.o.g(keyFormat, "keyFormat");
        synchronized (f3426i) {
            com.tenpay.tsm.TSMStorage.init(this.f3427d, this.f3428e, this.f3429f);
            com.tenpay.tsm.TSMStorage.importSM2PriKey(desc, priKey, keyFormat);
        }
    }

    public void e(java.lang.String desc, java.lang.String pubKey, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat keyFormat) {
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(pubKey, "pubKey");
        kotlin.jvm.internal.o.g(keyFormat, "keyFormat");
        synchronized (f3426i) {
            com.tenpay.tsm.TSMStorage.init(this.f3427d, this.f3428e, this.f3429f);
            com.tenpay.tsm.TSMStorage.importSM2PubKey(desc, pubKey, keyFormat);
        }
    }

    public void f(java.lang.String desc, byte[] key) {
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(key, "key");
        synchronized (f3426i) {
            com.tenpay.tsm.TSMStorage.init(this.f3427d, this.f3428e, this.f3429f);
            com.tenpay.tsm.TSMStorage.importSM4Key(desc, key);
        }
    }

    public void g(java.lang.String desc, java.lang.String priKey, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat keyFormat) {
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(priKey, "priKey");
        kotlin.jvm.internal.o.g(keyFormat, "keyFormat");
        synchronized (f3426i) {
            com.tenpay.tsm.TSMStorage.init(this.f3427d, this.f3428e, this.f3429f);
            com.tenpay.tsm.TSMStorage.updateSM2PriKey(desc, priKey, keyFormat);
        }
    }

    public void h(java.lang.String desc, java.lang.String pubKey, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat keyFormat) {
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(pubKey, "pubKey");
        kotlin.jvm.internal.o.g(keyFormat, "keyFormat");
        synchronized (f3426i) {
            com.tenpay.tsm.TSMStorage.init(this.f3427d, this.f3428e, this.f3429f);
            com.tenpay.tsm.TSMStorage.updateSM2PubKey(desc, pubKey, keyFormat);
        }
    }

    public void i(java.lang.String desc, byte[] key) {
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(key, "key");
        synchronized (f3426i) {
            com.tenpay.tsm.TSMStorage.init(this.f3427d, this.f3428e, this.f3429f);
            com.tenpay.tsm.TSMStorage.updateSM4Key(desc, key);
        }
    }
}
