package r9;

/* loaded from: classes7.dex */
public final class g implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ContentResolver f474891a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k0 f474892b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f474893c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.AssetFileDescriptor f474894d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.InputStream f474895e;

    /* renamed from: f, reason: collision with root package name */
    public long f474896f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f474897g;

    public g(android.content.Context context, r9.k0 k0Var) {
        this.f474891a = context.getContentResolver();
        this.f474892b = k0Var;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        long j17 = this.f474896f;
        if (j17 == 0) {
            return -1;
        }
        if (j17 != -1) {
            try {
                i18 = (int) java.lang.Math.min(j17, i18);
            } catch (java.io.IOException e17) {
                throw new r9.f(e17);
            }
        }
        int read = this.f474895e.read(bArr, i17, i18);
        if (read == -1) {
            if (this.f474896f == -1) {
                return -1;
            }
            throw new r9.f(new java.io.EOFException());
        }
        long j18 = this.f474896f;
        if (j18 != -1) {
            this.f474896f = j18 - read;
        }
        r9.k0 k0Var = this.f474892b;
        if (k0Var != null) {
            k0Var.a(this, read);
        }
        return read;
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        try {
            android.net.Uri uri = nVar.f474916a;
            long j17 = nVar.f474919d;
            this.f474893c = uri;
            android.content.res.AssetFileDescriptor openAssetFileDescriptor = this.f474891a.openAssetFileDescriptor(uri, "r");
            this.f474894d = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new java.io.FileNotFoundException("Could not open file descriptor for: " + this.f474893c);
            }
            this.f474895e = new java.io.FileInputStream(this.f474894d.getFileDescriptor());
            long startOffset = this.f474894d.getStartOffset();
            long skip = this.f474895e.skip(startOffset + j17) - startOffset;
            if (skip != j17) {
                throw new java.io.EOFException();
            }
            long j18 = nVar.f474920e;
            if (j18 != -1) {
                this.f474896f = j18;
            } else {
                long length = this.f474894d.getLength();
                if (length == -1) {
                    long available = this.f474895e.available();
                    this.f474896f = available;
                    if (available == 0) {
                        this.f474896f = -1L;
                    }
                } else {
                    this.f474896f = length - skip;
                }
            }
            this.f474897g = true;
            r9.k0 k0Var = this.f474892b;
            if (k0Var != null) {
                k0Var.d(this, nVar);
            }
            return this.f474896f;
        } catch (java.io.IOException e17) {
            throw new r9.f(e17);
        }
    }

    @Override // r9.k
    /* renamed from: close */
    public void mo10286x5a5ddf8() {
        r9.k0 k0Var = this.f474892b;
        this.f474893c = null;
        try {
            try {
                java.io.InputStream inputStream = this.f474895e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f474895e = null;
                try {
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.f474894d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (java.io.IOException e17) {
                        throw new r9.f(e17);
                    }
                } finally {
                    this.f474894d = null;
                    if (this.f474897g) {
                        this.f474897g = false;
                        if (k0Var != null) {
                            k0Var.b(this);
                        }
                    }
                }
            } catch (java.io.IOException e18) {
                throw new r9.f(e18);
            }
        } catch (java.lang.Throwable th6) {
            this.f474895e = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.f474894d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f474894d = null;
                    if (this.f474897g) {
                        this.f474897g = false;
                        if (k0Var != null) {
                            k0Var.b(this);
                        }
                    }
                    throw th6;
                } catch (java.io.IOException e19) {
                    throw new r9.f(e19);
                }
            } finally {
                this.f474894d = null;
                if (this.f474897g) {
                    this.f474897g = false;
                    if (k0Var != null) {
                        k0Var.b(this);
                    }
                }
            }
        }
    }

    @Override // r9.k
    /* renamed from: getUri */
    public android.net.Uri mo10287xb5887636() {
        return this.f474893c;
    }
}
