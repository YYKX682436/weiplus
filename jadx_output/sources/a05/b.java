package a05;

/* loaded from: classes8.dex */
public class b extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final a05.a f476d;

    /* renamed from: e, reason: collision with root package name */
    public final long f477e;

    public b(com.tencent.mm.vfs.r6 r6Var, long j17, long j18) {
        this.f477e = j18;
        this.f476d = new a05.a(com.tencent.mm.vfs.w6.C(r6Var));
        long j19 = 0;
        while (j19 < j17) {
            long skip = this.f476d.skip(j17 - j19);
            if (skip <= 0) {
                break;
            } else {
                j19 += skip;
            }
        }
        if (j19 < j17) {
            throw new java.io.IOException("could not seek pos " + j17);
        }
        a05.a aVar = this.f476d;
        synchronized (aVar) {
            aVar.f475d = 0;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        a05.a aVar = this.f476d;
        return (int) java.lang.Math.min(this.f477e - aVar.f475d, aVar.available());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f476d.close();
        super.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return this.f476d.skip(java.lang.Math.min(this.f477e - r0.f475d, j17));
    }

    @Override // java.io.InputStream
    public int read() {
        a05.a aVar = this.f476d;
        if (this.f477e - ((long) aVar.f475d) <= 0) {
            return -1;
        }
        return aVar.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        a05.a aVar = this.f476d;
        long min = java.lang.Math.min(this.f477e - aVar.f475d, i18);
        if (min != 0 || i18 <= 0) {
            return aVar.read(bArr, i17, (int) min);
        }
        return -1;
    }
}
