package se1;

/* loaded from: classes13.dex */
public class n implements se1.y {

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.regex.Pattern f488330v = java.util.regex.Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f488331w = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f488332a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f488333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f488334c;

    /* renamed from: d, reason: collision with root package name */
    public final int f488335d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f488336e;

    /* renamed from: f, reason: collision with root package name */
    public final ve1.h f488337f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f488338g;

    /* renamed from: h, reason: collision with root package name */
    public final se1.j0 f488339h;

    /* renamed from: i, reason: collision with root package name */
    public final ve1.d f488340i;

    /* renamed from: j, reason: collision with root package name */
    public se1.i f488341j;

    /* renamed from: k, reason: collision with root package name */
    public java.net.HttpURLConnection f488342k;

    /* renamed from: l, reason: collision with root package name */
    public java.io.InputStream f488343l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f488344m;

    /* renamed from: n, reason: collision with root package name */
    public long f488345n;

    /* renamed from: o, reason: collision with root package name */
    public long f488346o;

    /* renamed from: p, reason: collision with root package name */
    public long f488347p;

    /* renamed from: q, reason: collision with root package name */
    public long f488348q;

    /* renamed from: r, reason: collision with root package name */
    public long f488349r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f488350s;

    /* renamed from: t, reason: collision with root package name */
    public long f488351t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f488352u;

    public n(java.lang.String str, ve1.h hVar, ve1.d dVar) {
        this(str, hVar, null, 30000, 12000, false, dVar);
    }

    @Override // se1.g
    public int a(byte[] bArr, int i17, int i18) {
        try {
            m();
            return l(bArr, i17, i18);
        } catch (java.io.IOException e17) {
            throw new se1.q(e17, this.f488341j);
        }
    }

    @Override // se1.g
    /* renamed from: available */
    public long mo162209xd4418ac9() {
        return this.f488349r;
    }

    @Override // se1.g
    public te1.b b() {
        return te1.b.a(this.f488350s);
    }

    @Override // se1.g
    public long c(se1.i iVar) {
        return k(iVar, null);
    }

    @Override // se1.g
    /* renamed from: close */
    public void mo162210x5a5ddf8() {
        se1.j0 j0Var = this.f488339h;
        try {
            if (this.f488343l != null) {
                java.net.HttpURLConnection httpURLConnection = this.f488342k;
                long j17 = this.f488346o;
                if (j17 != -1) {
                    j17 -= this.f488348q;
                }
                ve1.g.q(httpURLConnection, j17);
                try {
                    this.f488343l.close();
                    this.f488343l = null;
                } catch (java.io.IOException e17) {
                    throw new se1.q(e17, this.f488341j);
                }
            }
        } finally {
            if (this.f488344m) {
                this.f488344m = false;
                if (j0Var != null) {
                    ((se1.j) j0Var).b();
                }
            }
            e();
        }
    }

    @Override // se1.g
    public long d() {
        return this.f488351t;
    }

    public final void e() {
        java.net.HttpURLConnection httpURLConnection = this.f488342k;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f488342k = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0028, code lost:
    
        if (java.net.NetworkInterface.getByInetAddress(r1) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection f(java.net.URL r7, long r8, long r10, boolean r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se1.n.f(java.net.URL, long, long, boolean):java.net.HttpURLConnection");
    }

    public ve1.h g() {
        return this.f488337f;
    }

    public se1.i h() {
        return this.f488341j;
    }

    public java.lang.String i() {
        return this.f488352u + this.f488332a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection j(se1.i r22) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se1.n.j(se1.i):java.net.HttpURLConnection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0132, code lost:
    
        if (r5 != 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long k(se1.i r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se1.n.k(se1.i, java.lang.String):long");
    }

    public final int l(byte[] bArr, int i17, int i18) {
        long j17 = this.f488346o;
        if (j17 != -1) {
            i18 = (int) java.lang.Math.min(i18, j17 - this.f488348q);
        }
        if (i18 == 0) {
            return -1;
        }
        int read = this.f488343l.read(bArr, i17, i18);
        if (read == -1) {
            long j18 = this.f488346o;
            if (j18 == -1 || j18 == this.f488348q) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        this.f488348q += read;
        se1.j0 j0Var = this.f488339h;
        if (j0Var != null) {
            ((se1.j) j0Var).a(read);
        }
        return read;
    }

    public final void m() {
        if (this.f488347p == this.f488345n) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = f488331w;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        i();
        while (true) {
            long j17 = this.f488347p;
            long j18 = this.f488345n;
            if (j17 == j18) {
                atomicReference.set(bArr);
                return;
            }
            int min = (int) java.lang.Math.min(j18 - j17, bArr.length);
            i();
            int read = this.f488343l.read(bArr, 0, min);
            i();
            if (java.lang.Thread.interrupted()) {
                throw new se1.s("skipInternal interrupted", this.f488341j);
            }
            if (read == -1) {
                throw new java.io.EOFException();
            }
            this.f488347p += read;
            se1.j0 j0Var = this.f488339h;
            if (j0Var != null) {
                ((se1.j) j0Var).a(read);
            }
        }
    }

    public n(java.lang.String str, ve1.h hVar, se1.j0 j0Var, int i17, int i18, boolean z17, ve1.d dVar) {
        this.f488332a = "DefaultHttpDataSource";
        this.f488349r = -1L;
        this.f488351t = -1L;
        this.f488352u = "";
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f488336e = str;
            this.f488337f = hVar;
            this.f488339h = j0Var;
            this.f488338g = new java.util.HashMap();
            this.f488334c = i17;
            this.f488335d = i18;
            this.f488333b = z17;
            this.f488340i = dVar;
            return;
        }
        throw new java.lang.IllegalArgumentException();
    }
}
