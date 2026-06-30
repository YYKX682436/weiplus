package r9;

/* loaded from: classes7.dex */
public class s implements r9.k {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.regex.Pattern f474949p = java.util.regex.Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f474950q = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f474951a;

    /* renamed from: b, reason: collision with root package name */
    public final int f474952b;

    /* renamed from: c, reason: collision with root package name */
    public final int f474953c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f474954d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.z f474955e;

    /* renamed from: f, reason: collision with root package name */
    public final r9.z f474956f;

    /* renamed from: g, reason: collision with root package name */
    public final r9.k0 f474957g;

    /* renamed from: h, reason: collision with root package name */
    public r9.n f474958h;

    /* renamed from: i, reason: collision with root package name */
    public java.net.HttpURLConnection f474959i;

    /* renamed from: j, reason: collision with root package name */
    public java.io.InputStream f474960j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f474961k;

    /* renamed from: l, reason: collision with root package name */
    public long f474962l;

    /* renamed from: m, reason: collision with root package name */
    public long f474963m;

    /* renamed from: n, reason: collision with root package name */
    public long f474964n;

    /* renamed from: o, reason: collision with root package name */
    public long f474965o;

    public s(java.lang.String str, t9.r rVar, r9.k0 k0Var, int i17, int i18, boolean z17, r9.z zVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f474954d = str;
        this.f474957g = k0Var;
        this.f474956f = new r9.z();
        this.f474952b = i17;
        this.f474953c = i18;
        this.f474951a = z17;
        this.f474955e = zVar;
    }

    public static void f(java.net.HttpURLConnection httpURLConnection, long j17) {
        int i17 = t9.d0.f498031a;
        if (i17 == 19 || i17 == 20) {
            try {
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                if (j17 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j17 <= 2048) {
                    return;
                }
                java.lang.String name = inputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    java.lang.reflect.Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new java.lang.Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new java.lang.Object[0]);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        try {
            g();
            if (i18 == 0) {
                return 0;
            }
            long j17 = this.f474963m;
            if (j17 != -1) {
                long j18 = j17 - this.f474965o;
                if (j18 != 0) {
                    i18 = (int) java.lang.Math.min(i18, j18);
                }
                return -1;
            }
            int read = this.f474960j.read(bArr, i17, i18);
            if (read == -1) {
                if (this.f474963m == -1) {
                    return -1;
                }
                throw new java.io.EOFException();
            }
            this.f474965o += read;
            r9.k0 k0Var = this.f474957g;
            if (k0Var == null) {
                return read;
            }
            k0Var.a(this, read);
            return read;
        } catch (java.io.IOException e17) {
            throw new r9.x(e17, this.f474958h, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r5 != 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    @Override // r9.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b(r9.n r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.s.b(r9.n):long");
    }

    public final void c() {
        java.net.HttpURLConnection httpURLConnection = this.f474959i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception unused) {
            }
            this.f474959i = null;
        }
    }

    @Override // r9.k
    /* renamed from: close */
    public void mo10286x5a5ddf8() {
        r9.k0 k0Var = this.f474957g;
        try {
            if (this.f474960j != null) {
                java.net.HttpURLConnection httpURLConnection = this.f474959i;
                long j17 = this.f474963m;
                if (j17 != -1) {
                    j17 -= this.f474965o;
                }
                f(httpURLConnection, j17);
                try {
                    this.f474960j.close();
                } catch (java.io.IOException e17) {
                    throw new r9.x(e17, this.f474958h, 3);
                }
            }
        } finally {
            this.f474960j = null;
            c();
            if (this.f474961k) {
                this.f474961k = false;
                if (k0Var != null) {
                    k0Var.b(this);
                }
            }
        }
    }

    public final java.net.HttpURLConnection d(java.net.URL url, byte[] bArr, long j17, long j18, boolean z17, boolean z18) {
        java.util.Map map;
        java.util.Map map2;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f474952b);
        httpURLConnection.setReadTimeout(this.f474953c);
        r9.z zVar = this.f474955e;
        if (zVar != null) {
            synchronized (zVar) {
                if (zVar.f474974b == null) {
                    zVar.f474974b = java.util.Collections.unmodifiableMap(new java.util.HashMap(zVar.f474973a));
                }
                map2 = zVar.f474974b;
            }
            for (java.util.Map.Entry entry : map2.entrySet()) {
                httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        r9.z zVar2 = this.f474956f;
        synchronized (zVar2) {
            if (zVar2.f474974b == null) {
                zVar2.f474974b = java.util.Collections.unmodifiableMap(new java.util.HashMap(zVar2.f474973a));
            }
            map = zVar2.f474974b;
        }
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            httpURLConnection.setRequestProperty((java.lang.String) entry2.getKey(), (java.lang.String) entry2.getValue());
        }
        if (j17 != 0 || j18 != -1) {
            java.lang.String str = "bytes=" + j17 + "-";
            if (j18 != -1) {
                str = str + ((j17 + j18) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f474954d);
        if (!z17) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z18);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final java.net.HttpURLConnection e(r9.n nVar) {
        java.net.HttpURLConnection d17;
        java.net.URL url = new java.net.URL(nVar.f474916a.toString());
        byte[] bArr = nVar.f474917b;
        long j17 = nVar.f474919d;
        long j18 = nVar.f474920e;
        int i17 = 0;
        boolean z17 = (nVar.f474922g & 1) == 1;
        if (!this.f474951a) {
            return d(url, bArr, j17, j18, z17, true);
        }
        while (true) {
            int i18 = i17 + 1;
            if (i17 > 20) {
                throw new java.net.NoRouteToHostException("Too many redirects: " + i18);
            }
            d17 = d(url, bArr, j17, j18, z17, false);
            int responseCode = d17.getResponseCode();
            if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                java.lang.String headerField = d17.getHeaderField("Location");
                d17.disconnect();
                if (headerField == null) {
                    throw new java.net.ProtocolException("Null location redirect");
                }
                java.net.URL url2 = new java.net.URL(url, headerField);
                java.lang.String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new java.net.ProtocolException("Unsupported protocol redirect: " + protocol);
                }
                bArr = null;
                i17 = i18;
                url = url2;
            }
        }
        return d17;
    }

    public final void g() {
        if (this.f474964n == this.f474962l) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = f474950q;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j17 = this.f474964n;
            long j18 = this.f474962l;
            if (j17 == j18) {
                atomicReference.set(bArr);
                return;
            }
            int read = this.f474960j.read(bArr, 0, (int) java.lang.Math.min(j18 - j17, bArr.length));
            if (java.lang.Thread.interrupted()) {
                throw new java.io.InterruptedIOException();
            }
            if (read == -1) {
                throw new java.io.EOFException();
            }
            this.f474964n += read;
            r9.k0 k0Var = this.f474957g;
            if (k0Var != null) {
                k0Var.a(this, read);
            }
        }
    }

    @Override // r9.k
    /* renamed from: getUri */
    public android.net.Uri mo10287xb5887636() {
        java.net.HttpURLConnection httpURLConnection = this.f474959i;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }
}
