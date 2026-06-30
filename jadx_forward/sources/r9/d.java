package r9;

/* loaded from: classes7.dex */
public final class d implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.AssetManager f474884a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k0 f474885b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f474886c;

    /* renamed from: d, reason: collision with root package name */
    public java.io.InputStream f474887d;

    /* renamed from: e, reason: collision with root package name */
    public long f474888e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f474889f;

    public d(android.content.Context context, r9.k0 k0Var) {
        this.f474884a = context.getAssets();
        this.f474885b = k0Var;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        long j17 = this.f474888e;
        if (j17 == 0) {
            return -1;
        }
        if (j17 != -1) {
            try {
                i18 = (int) java.lang.Math.min(j17, i18);
            } catch (java.io.IOException e17) {
                throw new r9.c(e17);
            }
        }
        int read = this.f474887d.read(bArr, i17, i18);
        if (read == -1) {
            if (this.f474888e == -1) {
                return -1;
            }
            throw new r9.c(new java.io.EOFException());
        }
        long j18 = this.f474888e;
        if (j18 != -1) {
            this.f474888e = j18 - read;
        }
        r9.k0 k0Var = this.f474885b;
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
            this.f474886c = uri;
            java.lang.String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            java.io.InputStream open = this.f474884a.open(path, 1);
            this.f474887d = open;
            if (open.skip(j17) < j17) {
                throw new java.io.EOFException();
            }
            long j18 = nVar.f474920e;
            if (j18 != -1) {
                this.f474888e = j18;
            } else {
                long available = this.f474887d.available();
                this.f474888e = available;
                if (available == 2147483647L) {
                    this.f474888e = -1L;
                }
            }
            this.f474889f = true;
            r9.k0 k0Var = this.f474885b;
            if (k0Var != null) {
                k0Var.d(this, nVar);
            }
            return this.f474888e;
        } catch (java.io.IOException e17) {
            throw new r9.c(e17);
        }
    }

    @Override // r9.k
    /* renamed from: close */
    public void mo10286x5a5ddf8() {
        r9.k0 k0Var = this.f474885b;
        this.f474886c = null;
        try {
            try {
                java.io.InputStream inputStream = this.f474887d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (java.io.IOException e17) {
                throw new r9.c(e17);
            }
        } finally {
            this.f474887d = null;
            if (this.f474889f) {
                this.f474889f = false;
                if (k0Var != null) {
                    k0Var.b(this);
                }
            }
        }
    }

    @Override // r9.k
    /* renamed from: getUri */
    public android.net.Uri mo10287xb5887636() {
        return this.f474886c;
    }
}
