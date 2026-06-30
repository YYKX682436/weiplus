package af1;

/* loaded from: classes7.dex */
public final class a extends r9.s {

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f4452u = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f4453r;

    /* renamed from: s, reason: collision with root package name */
    public long f4454s;

    /* renamed from: t, reason: collision with root package name */
    public long f4455t;

    public a(java.lang.String str, t9.r rVar, r9.k0 k0Var, int i17, int i18, boolean z17, r9.z zVar) {
        super(str, rVar, k0Var, i17, i18, z17, zVar);
        this.f4453r = "MicroMsg.AppBrand.ByteRangeFixHttpDataSource#" + hashCode();
    }

    @Override // r9.s, r9.k
    public int a(byte[] bArr, int i17, int i18) {
        java.net.HttpURLConnection httpURLConnection = this.f393426i;
        java.io.InputStream inputStream = httpURLConnection != null ? httpURLConnection.getInputStream() : null;
        java.lang.String str = this.f4453r;
        if (inputStream == null) {
            com.tencent.mars.xlog.Log.w(str, "skipInternal, inputStream is null");
        } else if (this.f4455t != this.f4454s) {
            java.util.concurrent.atomic.AtomicReference atomicReference = f4452u;
            byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
            if (bArr2 == null) {
                bArr2 = new byte[4096];
            }
            while (true) {
                long j17 = this.f4455t;
                long j18 = this.f4454s;
                if (j17 == j18) {
                    atomicReference.set(bArr2);
                    com.tencent.mars.xlog.Log.i(str, "skipInternal, skip done");
                    break;
                }
                long j19 = j18 - j17;
                long length = bArr2.length;
                if (j19 > length) {
                    j19 = length;
                }
                int read = inputStream.read(bArr2, 0, (int) j19);
                if (java.lang.Thread.interrupted()) {
                    throw new java.io.InterruptedIOException();
                }
                if (-1 == read) {
                    throw new java.io.EOFException();
                }
                this.f4455t += read;
            }
        }
        return super.a(bArr, i17, i18);
    }

    @Override // r9.s, r9.k
    public long b(r9.n nVar) {
        java.lang.Long j17;
        java.lang.Long j18;
        java.lang.Long j19;
        long b17 = super.b(nVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateBytesToSkip, startReadPos: ");
        long j27 = nVar.f393386d;
        sb6.append(j27);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f4453r;
        com.tencent.mars.xlog.Log.i(str, sb7);
        java.net.HttpURLConnection httpURLConnection = this.f393426i;
        if (httpURLConnection == null) {
            com.tencent.mars.xlog.Log.w(str, "calculateBytesToSkip, connection is null");
        } else {
            int responseCode = httpURLConnection.getResponseCode();
            com.tencent.mars.xlog.Log.i(str, "calculateBytesToSkip, responseCode: " + responseCode);
            if (206 == responseCode) {
                java.lang.String headerField = httpURLConnection.getHeaderField("Content-Range");
                if (headerField == null) {
                    com.tencent.mars.xlog.Log.i(str, "calculateBytesToSkip, contentRange is null");
                } else {
                    com.tencent.mars.xlog.Log.i(str, "calculateBytesToSkip, contentRange: ".concat(headerField));
                    java.util.regex.Matcher matcher = af1.c.f4462a.matcher(headerField);
                    if (matcher.matches() && 3 == matcher.groupCount()) {
                        java.lang.String group = matcher.group(1);
                        long j28 = 0;
                        long longValue = (group == null || (j19 = r26.h0.j(group)) == null) ? 0L : j19.longValue();
                        java.lang.String group2 = matcher.group(2);
                        long longValue2 = (group2 == null || (j18 = r26.h0.j(group2)) == null) ? 0L : j18.longValue();
                        java.lang.String group3 = matcher.group(3);
                        if (group3 != null && (j17 = r26.h0.j(group3)) != null) {
                            j28 = j17.longValue();
                        }
                        com.tencent.mars.xlog.Log.i(str, "calculateBytesToSkip, startPos: " + longValue + ", endPos: " + longValue2 + ", totalCount: " + j28);
                        if (longValue <= j27 && j27 <= longValue2) {
                            this.f4454s = j27 - longValue;
                            com.tencent.mars.xlog.Log.i(str, "calculateBytesToSkip, bytesToSkip: " + this.f4454s);
                        }
                    }
                }
            }
        }
        return b17;
    }
}
