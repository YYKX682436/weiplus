package r9;

/* loaded from: classes7.dex */
public final class m extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final r9.k f474910d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.n f474911e;

    /* renamed from: i, reason: collision with root package name */
    public long f474915i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f474913g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f474914h = false;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f474912f = new byte[1];

    public m(r9.k kVar, r9.n nVar) {
        this.f474910d = kVar;
        this.f474911e = nVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f474914h) {
            return;
        }
        this.f474910d.mo10286x5a5ddf8();
        this.f474914h = true;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f474912f;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        t9.a.d(!this.f474914h);
        boolean z17 = this.f474913g;
        r9.k kVar = this.f474910d;
        if (!z17) {
            kVar.b(this.f474911e);
            this.f474913g = true;
        }
        int a17 = kVar.a(bArr, i17, i18);
        if (a17 == -1) {
            return -1;
        }
        this.f474915i += a17;
        return a17;
    }
}
