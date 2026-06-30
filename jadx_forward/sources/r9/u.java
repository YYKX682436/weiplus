package r9;

/* loaded from: classes7.dex */
public final class u implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final r9.k0 f474966a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.RandomAccessFile f474967b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f474968c;

    /* renamed from: d, reason: collision with root package name */
    public long f474969d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f474970e;

    public u(r9.k0 k0Var) {
        this.f474966a = k0Var;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        long j17 = this.f474969d;
        if (j17 == 0) {
            return -1;
        }
        try {
            int read = this.f474967b.read(bArr, i17, (int) java.lang.Math.min(j17, i18));
            if (read > 0) {
                this.f474969d -= read;
                r9.k0 k0Var = this.f474966a;
                if (k0Var != null) {
                    k0Var.a(this, read);
                }
            }
            return read;
        } catch (java.io.IOException e17) {
            throw new r9.t(e17);
        }
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        try {
            android.net.Uri uri = nVar.f474916a;
            long j17 = nVar.f474919d;
            this.f474968c = uri;
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(nVar.f474916a.getPath(), "r");
            this.f474967b = randomAccessFile;
            randomAccessFile.seek(j17);
            long j18 = nVar.f474920e;
            if (j18 == -1) {
                j18 = this.f474967b.length() - j17;
            }
            this.f474969d = j18;
            if (j18 < 0) {
                throw new java.io.EOFException();
            }
            this.f474970e = true;
            r9.k0 k0Var = this.f474966a;
            if (k0Var != null) {
                k0Var.d(this, nVar);
            }
            return this.f474969d;
        } catch (java.io.IOException e17) {
            throw new r9.t(e17);
        }
    }

    @Override // r9.k
    /* renamed from: close */
    public void mo10286x5a5ddf8() {
        r9.k0 k0Var = this.f474966a;
        this.f474968c = null;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = this.f474967b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (java.io.IOException e17) {
                throw new r9.t(e17);
            }
        } finally {
            this.f474967b = null;
            if (this.f474970e) {
                this.f474970e = false;
                if (k0Var != null) {
                    k0Var.b(this);
                }
            }
        }
    }

    @Override // r9.k
    /* renamed from: getUri */
    public android.net.Uri mo10287xb5887636() {
        return this.f474968c;
    }
}
