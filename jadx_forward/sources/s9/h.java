package s9;

/* loaded from: classes7.dex */
public final class h implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final s9.c f486460a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k f486461b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.k f486462c;

    /* renamed from: d, reason: collision with root package name */
    public final r9.k f486463d;

    /* renamed from: e, reason: collision with root package name */
    public final s9.g f486464e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f486465f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f486466g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f486467h;

    /* renamed from: i, reason: collision with root package name */
    public r9.k f486468i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f486469j;

    /* renamed from: k, reason: collision with root package name */
    public android.net.Uri f486470k;

    /* renamed from: l, reason: collision with root package name */
    public int f486471l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f486472m;

    /* renamed from: n, reason: collision with root package name */
    public long f486473n;

    /* renamed from: o, reason: collision with root package name */
    public long f486474o;

    /* renamed from: p, reason: collision with root package name */
    public s9.k f486475p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f486476q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f486477r;

    /* renamed from: s, reason: collision with root package name */
    public long f486478s;

    public h(s9.c cVar, r9.k kVar, r9.k kVar2, r9.i iVar, int i17, s9.g gVar) {
        this.f486460a = cVar;
        this.f486461b = kVar2;
        this.f486465f = (i17 & 1) != 0;
        this.f486466g = (i17 & 2) != 0;
        this.f486467h = (i17 & 4) != 0;
        this.f486463d = kVar;
        if (iVar != null) {
            this.f486462c = new r9.j0(kVar, iVar);
        } else {
            this.f486462c = null;
        }
        this.f486464e = gVar;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        r9.k kVar = this.f486461b;
        if (i18 == 0) {
            return 0;
        }
        if (this.f486474o == 0) {
            return -1;
        }
        try {
            int a17 = this.f486468i.a(bArr, i17, i18);
            if (a17 >= 0) {
                if (this.f486468i == kVar) {
                    this.f486478s += a17;
                }
                long j17 = a17;
                this.f486473n += j17;
                long j18 = this.f486474o;
                if (j18 != -1) {
                    this.f486474o = j18 - j17;
                }
            } else {
                if (this.f486469j) {
                    long j19 = this.f486473n;
                    if (this.f486468i == this.f486462c) {
                        this.f486460a.f(this.f486472m, j19);
                    }
                    this.f486474o = 0L;
                }
                c();
                long j27 = this.f486474o;
                if ((j27 > 0 || j27 == -1) && d(false)) {
                    return a(bArr, i17, i18);
                }
            }
            return a17;
        } catch (java.io.IOException e17) {
            if (this.f486468i == kVar || (e17 instanceof s9.a)) {
                this.f486476q = true;
            }
            throw e17;
        }
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        try {
            android.net.Uri uri = nVar.f474916a;
            long j17 = nVar.f474919d;
            this.f486470k = uri;
            this.f486471l = nVar.f474922g;
            java.lang.String str = nVar.f474921f;
            if (str == null) {
                str = uri.toString();
            }
            this.f486472m = str;
            this.f486473n = j17;
            boolean z17 = this.f486466g;
            long j18 = nVar.f474920e;
            boolean z18 = (z17 && this.f486476q) || (j18 == -1 && this.f486467h);
            this.f486477r = z18;
            if (j18 == -1 && !z18) {
                long b17 = this.f486460a.b(str);
                this.f486474o = b17;
                if (b17 != -1) {
                    long j19 = b17 - j17;
                    this.f486474o = j19;
                    if (j19 <= 0) {
                        throw new r9.l(0);
                    }
                }
                d(true);
                return this.f486474o;
            }
            this.f486474o = j18;
            d(true);
            return this.f486474o;
        } catch (java.io.IOException e17) {
            if (this.f486468i == this.f486461b || (e17 instanceof s9.a)) {
                this.f486476q = true;
            }
            throw e17;
        }
    }

    public final void c() {
        s9.c cVar = this.f486460a;
        r9.k kVar = this.f486468i;
        if (kVar == null) {
            return;
        }
        try {
            kVar.mo10286x5a5ddf8();
            this.f486468i = null;
            this.f486469j = false;
        } finally {
            s9.k kVar2 = this.f486475p;
            if (kVar2 != null) {
                cVar.c(kVar2);
                this.f486475p = null;
            }
        }
    }

    @Override // r9.k
    /* renamed from: close */
    public void mo10286x5a5ddf8() {
        this.f486470k = null;
        if (this.f486464e != null && this.f486478s > 0) {
            this.f486460a.h();
            this.f486478s = 0L;
        }
        try {
            c();
        } catch (java.io.IOException e17) {
            if (this.f486468i == this.f486461b || (e17 instanceof s9.a)) {
                this.f486476q = true;
            }
            throw e17;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(1:3)(2:65|(2:68|69)(1:67))|4|(1:6)(2:45|(3:47|(1:49)(1:51)|50)(14:52|(1:54)(1:64)|(1:56)(2:61|(1:63))|57|(1:59)(1:60)|8|(1:10)(1:44)|11|12|13|14|15|(2:19|(1:21))|22))|7|8|(0)(0)|11|12|13|14|15|(3:17|19|(0))|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if (r25 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if ((r6 instanceof r9.l) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        if (r2 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e9, code lost:
    
        r9 = 0;
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        r6 = r6.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r25) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.h.d(boolean):boolean");
    }

    @Override // r9.k
    /* renamed from: getUri */
    public android.net.Uri mo10287xb5887636() {
        r9.k kVar = this.f486468i;
        return kVar == this.f486463d ? kVar.mo10287xb5887636() : this.f486470k;
    }
}
