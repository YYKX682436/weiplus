package ze1;

/* loaded from: classes7.dex */
public final class b extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final r9.k f553297d;

    /* renamed from: e, reason: collision with root package name */
    public final android.net.Uri f553298e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f553299f;

    /* renamed from: g, reason: collision with root package name */
    public long f553300g;

    /* renamed from: h, reason: collision with root package name */
    public long f553301h;

    /* renamed from: i, reason: collision with root package name */
    public java.io.InputStream f553302i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f553303m;

    public b(r9.k dataSource, android.net.Uri uri) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        this.f553297d = dataSource;
        this.f553298e = uri;
        this.f553299f = new byte[1];
    }

    public final java.io.InputStream a() {
        java.io.InputStream inputStream = this.f553302i;
        long j17 = this.f553300g;
        long j18 = this.f553301h;
        if (inputStream != null) {
            return inputStream;
        }
        if (32768 <= j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RealInferContentTypeInputStream", "requireInputStream, reach max read length");
            return null;
        }
        if (j17 < j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RealInferContentTypeInputStream", "requireInputStream, end of file");
            return null;
        }
        this.f553301h = j17;
        r9.m mVar = new r9.m(this.f553297d, new r9.n(this.f553298e, j17, 1024L, null));
        this.f553302i = mVar;
        this.f553301h += 1024;
        return mVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f553303m) {
            return;
        }
        java.io.InputStream inputStream = this.f553302i;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f553302i = null;
        this.f553300g = 0L;
        this.f553303m = true;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f553299f;
        if (-1 == read(bArr)) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        t9.a.d(!this.f553303m);
        java.io.InputStream a17 = a();
        if (a17 == null) {
            return -1;
        }
        try {
            int read = a17.read(bArr);
            if (-1 == read) {
                java.io.InputStream inputStream = this.f553302i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f553302i = null;
                return read(bArr);
            }
            this.f553300g += read;
            return read;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RealInferContentTypeInputStream", "read([B), fail since " + e17);
            throw e17;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        t9.a.d(!this.f553303m);
        java.io.InputStream a17 = a();
        if (a17 == null) {
            return -1;
        }
        try {
            int read = a17.read(bArr, i17, i18);
            if (-1 == read) {
                java.io.InputStream inputStream = this.f553302i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f553302i = null;
                return read(bArr, i17, i18);
            }
            this.f553300g += read;
            return read;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.RealInferContentTypeInputStream", e17, "read([BII), fail", new java.lang.Object[0]);
            throw e17;
        }
    }
}
