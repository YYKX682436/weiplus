package se1;

/* loaded from: classes13.dex */
public class c0 implements se1.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f488280a;

    /* renamed from: b, reason: collision with root package name */
    public android.net.Uri f488281b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.res.AssetFileDescriptor f488282c;

    /* renamed from: d, reason: collision with root package name */
    public java.io.InputStream f488283d;

    /* renamed from: e, reason: collision with root package name */
    public long f488284e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f488285f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f488286g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f488287h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f488288i = -1;

    public c0(android.content.Context context) {
        this.f488280a = context.getResources();
    }

    @Override // se1.g
    public int a(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        long j17 = this.f488284e;
        if (j17 == 0) {
            return -1;
        }
        if (j17 != -1) {
            try {
                i18 = (int) java.lang.Math.min(j17, i18);
            } catch (java.io.IOException e17) {
                throw new se1.b0(e17);
            }
        }
        int read = this.f488283d.read(bArr, i17, i18);
        if (read == -1) {
            if (this.f488284e == -1) {
                return -1;
            }
            throw new se1.b0(new java.io.EOFException());
        }
        long j18 = this.f488284e;
        if (j18 != -1) {
            this.f488284e = j18 - read;
        }
        return read;
    }

    @Override // se1.g
    /* renamed from: available */
    public long mo162209xd4418ac9() {
        return this.f488288i;
    }

    @Override // se1.g
    public te1.b b() {
        return android.text.TextUtils.isEmpty(this.f488286g) ? te1.b.f499302d : te1.b.a(this.f488286g);
    }

    @Override // se1.g
    public long c(se1.i iVar) {
        try {
            android.net.Uri uri = iVar.f488305a;
            long j17 = iVar.f488307c;
            this.f488281b = uri;
            if (!android.text.TextUtils.equals("android.resource", uri.getScheme())) {
                throw new se1.b0("URI must use scheme android.resource");
            }
            try {
                android.content.res.AssetFileDescriptor openRawResourceFd = this.f488280a.openRawResourceFd(java.lang.Integer.parseInt(this.f488281b.getLastPathSegment()));
                this.f488282c = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                this.f488287h = length;
                this.f488288i = length - j17;
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.f488282c.getFileDescriptor());
                this.f488283d = fileInputStream;
                if (fileInputStream.markSupported()) {
                    this.f488286g = java.net.URLConnection.guessContentTypeFromStream(this.f488283d);
                }
                this.f488283d.skip(this.f488282c.getStartOffset());
                if (this.f488283d.skip(j17) < j17) {
                    throw new java.io.EOFException();
                }
                long j18 = iVar.f488308d;
                long j19 = -1;
                if (j18 != -1) {
                    this.f488284e = j18;
                } else {
                    long length2 = this.f488282c.getLength();
                    if (length2 != -1) {
                        j19 = length2 - j17;
                    }
                    this.f488284e = j19;
                }
                this.f488285f = true;
                return this.f488284e;
            } catch (java.lang.NumberFormatException unused) {
                throw new se1.b0("Resource identifier must be an integer.");
            }
        } catch (java.io.IOException e17) {
            throw new se1.b0(e17);
        }
    }

    @Override // se1.g
    /* renamed from: close */
    public void mo162210x5a5ddf8() {
        this.f488281b = null;
        try {
            try {
                java.io.InputStream inputStream = this.f488283d;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f488283d = null;
            } catch (java.io.IOException e17) {
                throw new se1.b0(e17);
            }
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor = this.f488282c;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (java.io.IOException e18) {
                    throw new se1.b0(e18);
                }
            } finally {
                this.f488282c = null;
                if (this.f488285f) {
                    this.f488285f = false;
                }
            }
        } catch (java.lang.Throwable th6) {
            this.f488283d = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.f488282c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f488282c = null;
                    if (this.f488285f) {
                        this.f488285f = false;
                    }
                    throw th6;
                } finally {
                    this.f488282c = null;
                    if (this.f488285f) {
                        this.f488285f = false;
                    }
                }
            } catch (java.io.IOException e19) {
                throw new se1.b0(e19);
            }
        }
    }

    @Override // se1.g
    public long d() {
        return this.f488287h;
    }
}
