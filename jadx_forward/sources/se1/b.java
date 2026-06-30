package se1;

/* loaded from: classes13.dex */
public class b implements se1.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.AssetManager f488273a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.InputStream f488274b;

    /* renamed from: c, reason: collision with root package name */
    public long f488275c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f488276d;

    /* renamed from: e, reason: collision with root package name */
    public long f488277e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f488278f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f488279g;

    public b(android.content.Context context) {
        this.f488273a = context.getAssets();
    }

    @Override // se1.g
    public int a(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        long j17 = this.f488275c;
        if (j17 == 0) {
            return -1;
        }
        if (j17 != -1) {
            try {
                i18 = (int) java.lang.Math.min(j17, i18);
            } catch (java.io.IOException e17) {
                throw new se1.a(e17);
            }
        }
        int read = this.f488274b.read(bArr, i17, i18);
        if (read == -1) {
            if (this.f488275c == -1) {
                return -1;
            }
            throw new se1.a(new java.io.EOFException());
        }
        long j18 = this.f488275c;
        if (j18 != -1) {
            this.f488275c = j18 - read;
        }
        return read;
    }

    @Override // se1.g
    /* renamed from: available */
    public long mo162209xd4418ac9() {
        return this.f488278f;
    }

    @Override // se1.g
    public te1.b b() {
        java.lang.String fileExtensionFromUrl = android.webkit.MimeTypeMap.getFileExtensionFromUrl(this.f488279g);
        java.lang.String mimeTypeFromExtension = fileExtensionFromUrl != null ? android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
        return android.text.TextUtils.isEmpty(mimeTypeFromExtension) ? te1.b.f499302d : te1.b.a(mimeTypeFromExtension);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (r1 != null) goto L41;
     */
    @Override // se1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long c(se1.i r10) {
        /*
            r9 = this;
            android.content.res.AssetManager r0 = r9.f488273a
            android.net.Uri r1 = r10.f488305a     // Catch: java.io.IOException -> L95
            long r2 = r10.f488307c
            java.lang.String r1 = r1.getPath()     // Catch: java.io.IOException -> L95
            r9.f488279g = r1     // Catch: java.io.IOException -> L95
            java.lang.String r4 = "/android_asset/"
            boolean r1 = r1.startsWith(r4)     // Catch: java.io.IOException -> L95
            r4 = 1
            if (r1 == 0) goto L20
            java.lang.String r1 = r9.f488279g     // Catch: java.io.IOException -> L95
            r5 = 15
            java.lang.String r1 = r1.substring(r5)     // Catch: java.io.IOException -> L95
            r9.f488279g = r1     // Catch: java.io.IOException -> L95
            goto L32
        L20:
            java.lang.String r1 = r9.f488279g     // Catch: java.io.IOException -> L95
            java.lang.String r5 = "/"
            boolean r1 = r1.startsWith(r5)     // Catch: java.io.IOException -> L95
            if (r1 == 0) goto L32
            java.lang.String r1 = r9.f488279g     // Catch: java.io.IOException -> L95
            java.lang.String r1 = r1.substring(r4)     // Catch: java.io.IOException -> L95
            r9.f488279g = r1     // Catch: java.io.IOException -> L95
        L32:
            java.lang.String r1 = r9.f488279g     // Catch: java.io.IOException -> L95
            java.io.InputStream r1 = r0.open(r1, r4)     // Catch: java.io.IOException -> L95
            r9.f488274b = r1     // Catch: java.io.IOException -> L95
            r5 = -1
            r9.f488277e = r5     // Catch: java.io.IOException -> L95
            r1 = 0
            java.lang.String r7 = r9.f488279g     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            android.content.res.AssetFileDescriptor r1 = r0.openFd(r7)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            long r7 = r1.getLength()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            r9.f488277e = r7     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
            goto L55
        L4c:
            r10 = move-exception
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L52
        L52:
            throw r10     // Catch: java.io.IOException -> L95
        L53:
            if (r1 == 0) goto L58
        L55:
            r1.close()     // Catch: java.io.IOException -> L58
        L58:
            long r0 = r9.f488277e     // Catch: java.io.IOException -> L95
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L60
            r9.f488277e = r5     // Catch: java.io.IOException -> L95
        L60:
            long r0 = r9.f488277e     // Catch: java.io.IOException -> L95
            long r0 = r0 - r2
            r9.f488278f = r0     // Catch: java.io.IOException -> L95
            java.io.InputStream r0 = r9.f488274b     // Catch: java.io.IOException -> L95
            long r0 = r0.skip(r2)     // Catch: java.io.IOException -> L95
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L8f
            long r0 = r10.f488308d     // Catch: java.io.IOException -> L95
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 == 0) goto L78
            r9.f488275c = r0     // Catch: java.io.IOException -> L95
            goto L8a
        L78:
            java.io.InputStream r10 = r9.f488274b     // Catch: java.io.IOException -> L95
            int r10 = r10.available()     // Catch: java.io.IOException -> L95
            long r0 = (long) r10     // Catch: java.io.IOException -> L95
            r9.f488275c = r0     // Catch: java.io.IOException -> L95
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L8a
            r9.f488275c = r5     // Catch: java.io.IOException -> L95
        L8a:
            r9.f488276d = r4
            long r0 = r9.f488275c
            return r0
        L8f:
            java.io.EOFException r10 = new java.io.EOFException     // Catch: java.io.IOException -> L95
            r10.<init>()     // Catch: java.io.IOException -> L95
            throw r10     // Catch: java.io.IOException -> L95
        L95:
            r10 = move-exception
            se1.a r0 = new se1.a
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: se1.b.c(se1.i):long");
    }

    @Override // se1.g
    /* renamed from: close */
    public void mo162210x5a5ddf8() {
        try {
            try {
                java.io.InputStream inputStream = this.f488274b;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (java.io.IOException e17) {
                throw new se1.a(e17);
            }
        } finally {
            this.f488274b = null;
            if (this.f488276d) {
                this.f488276d = false;
            }
        }
    }

    @Override // se1.g
    public long d() {
        return this.f488277e;
    }
}
