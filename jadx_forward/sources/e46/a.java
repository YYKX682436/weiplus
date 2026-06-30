package e46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: e, reason: collision with root package name */
    public java.io.InputStream f330964e;

    /* renamed from: f, reason: collision with root package name */
    public e46.i f330965f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f330966g;

    public a(java.io.InputStream inputStream) {
        e46.i iVar = new e46.i(inputStream);
        this.f330966g = new byte[1];
        this.f330965f = iVar;
        this.f330964e = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        e46.i iVar = this.f330965f;
        if (iVar != null) {
            return iVar.f330991e.a();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            e46.i iVar = this.f330965f;
            if (iVar != null) {
                try {
                    iVar.close();
                } catch (java.io.IOException unused) {
                }
            }
            this.f330965f = null;
        } finally {
            java.io.InputStream inputStream = this.f330964e;
            if (inputStream != null) {
                inputStream.close();
                this.f330964e = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr;
        int read;
        do {
            bArr = this.f330966g;
            read = read(bArr);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        if (read == 1) {
            return bArr[0] & 255;
        }
        throw new java.lang.IllegalStateException("Invalid return value from read: " + read);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        e46.i iVar = this.f330965f;
        if (iVar == null) {
            return -1;
        }
        try {
            int b17 = iVar.b(bArr, i17, i18);
            long j17 = this.f330965f.f330992f.f474029d.f474038d;
            a(b17);
            if (b17 == -1) {
                e46.i iVar2 = this.f330965f;
                if (iVar2 != null) {
                    try {
                        iVar2.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                this.f330965f = null;
            }
            return b17;
        } catch (java.lang.RuntimeException e17) {
            throw new java.io.IOException("Invalid Deflate64 input", e17);
        }
    }
}
