package se1;

/* loaded from: classes13.dex */
public class p implements se1.g {

    /* renamed from: b, reason: collision with root package name */
    public java.io.RandomAccessFile f488354b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f488355c;

    /* renamed from: d, reason: collision with root package name */
    public long f488356d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f488358f;

    /* renamed from: g, reason: collision with root package name */
    public android.net.Uri f488359g;

    /* renamed from: e, reason: collision with root package name */
    public long f488357e = -1;

    /* renamed from: a, reason: collision with root package name */
    public final se1.j0 f488353a = null;

    @Override // se1.g
    public int a(byte[] bArr, int i17, int i18) {
        long j17 = this.f488356d;
        if (j17 == 0) {
            return -1;
        }
        try {
            int read = this.f488354b.read(bArr, i17, (int) java.lang.Math.min(j17, i18));
            if (read > 0) {
                this.f488356d -= read;
                se1.j0 j0Var = this.f488353a;
                if (j0Var != null) {
                    ((se1.j) j0Var).a(read);
                }
            }
            return read;
        } catch (java.io.IOException e17) {
            throw new se1.o(e17);
        }
    }

    @Override // se1.g
    /* renamed from: available */
    public long mo162209xd4418ac9() {
        return this.f488357e;
    }

    @Override // se1.g
    public te1.b b() {
        java.lang.String type = qe1.a.a().f443549a.getContentResolver().getType(this.f488359g);
        return type == null ? te1.b.f499303e : te1.b.a(type);
    }

    @Override // se1.g
    public long c(se1.i iVar) {
        try {
            android.net.Uri uri = iVar.f488305a;
            long j17 = iVar.f488307c;
            this.f488359g = uri;
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(iVar.f488305a.getPath(), "r");
            this.f488354b = randomAccessFile;
            randomAccessFile.seek(j17);
            long j18 = iVar.f488308d;
            if (j18 == -1) {
                j18 = this.f488354b.length() - j17;
            }
            this.f488356d = j18;
            this.f488357e = this.f488354b.length() - j17;
            if (this.f488356d < 0) {
                throw new java.io.EOFException();
            }
            this.f488358f = true;
            se1.j0 j0Var = this.f488353a;
            if (j0Var != null) {
                ((se1.j) j0Var).c();
            }
            return this.f488356d;
        } catch (java.io.IOException e17) {
            throw new se1.o(e17);
        }
    }

    @Override // se1.g
    /* renamed from: close */
    public void mo162210x5a5ddf8() {
        se1.j0 j0Var = this.f488353a;
        this.f488355c = null;
        java.io.RandomAccessFile randomAccessFile = this.f488354b;
        if (randomAccessFile != null) {
            try {
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException e17) {
                    throw new se1.o(e17);
                }
            } finally {
                this.f488354b = null;
                if (this.f488358f) {
                    this.f488358f = false;
                    if (j0Var != null) {
                        ((se1.j) j0Var).b();
                    }
                }
            }
        }
    }

    @Override // se1.g
    public long d() {
        try {
            return this.f488354b.length();
        } catch (java.io.IOException unused) {
            return 0L;
        }
    }
}
