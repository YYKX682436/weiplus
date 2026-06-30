package w8;

/* loaded from: classes15.dex */
public final class b implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final t9.o f525096a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.p f525097b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f525098c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f525099d;

    /* renamed from: e, reason: collision with root package name */
    public q8.o f525100e;

    /* renamed from: f, reason: collision with root package name */
    public int f525101f;

    /* renamed from: g, reason: collision with root package name */
    public int f525102g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f525103h;

    /* renamed from: i, reason: collision with root package name */
    public long f525104i;

    /* renamed from: j, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f525105j;

    /* renamed from: k, reason: collision with root package name */
    public int f525106k;

    /* renamed from: l, reason: collision with root package name */
    public long f525107l;

    public b(java.lang.String str) {
        t9.o oVar = new t9.o(new byte[8], 8);
        this.f525096a = oVar;
        this.f525097b = new t9.p(oVar.f498069a);
        this.f525101f = 0;
        this.f525098c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // w8.h
    public void a(t9.p pVar) {
        int i17;
        java.lang.String str;
        int i18;
        int i19;
        int i27;
        ?? r27;
        while (true) {
            int i28 = pVar.f498075c;
            int i29 = pVar.f498074b;
            if (i28 - i29 <= 0) {
                return;
            }
            int i37 = this.f525101f;
            t9.p pVar2 = this.f525097b;
            if (i37 == 0) {
                while (true) {
                    if (pVar.f498075c - pVar.f498074b <= 0) {
                        r27 = false;
                        break;
                    }
                    if (this.f525103h) {
                        int m17 = pVar.m();
                        if (m17 == 119) {
                            this.f525103h = false;
                            r27 = true;
                            break;
                        }
                        this.f525103h = m17 == 11;
                    } else {
                        this.f525103h = pVar.m() == 11;
                    }
                }
                if (r27 != false) {
                    this.f525101f = 1;
                    byte[] bArr = pVar2.f498073a;
                    bArr[0] = 11;
                    bArr[1] = 119;
                    this.f525102g = 2;
                }
            } else if (i37 == 1) {
                byte[] bArr2 = pVar2.f498073a;
                int min = java.lang.Math.min(i28 - i29, 8 - this.f525102g);
                pVar.b(bArr2, this.f525102g, min);
                int i38 = this.f525102g + min;
                this.f525102g = i38;
                if ((i38 == 8) != false) {
                    t9.o oVar = this.f525096a;
                    oVar.e(0);
                    int i39 = (oVar.f498070b * 8) + oVar.f498071c;
                    oVar.f(40);
                    ?? r47 = oVar.d(5) == 16;
                    oVar.e(i39);
                    int[] iArr = n8.a.f416992b;
                    int i47 = 6;
                    if (r47 == true) {
                        oVar.f(21);
                        i19 = (oVar.d(11) + 1) * 2;
                        int d17 = oVar.d(2);
                        if (d17 == 3) {
                            i17 = n8.a.f416993c[oVar.d(2)];
                        } else {
                            i47 = n8.a.f416991a[oVar.d(2)];
                            i17 = iArr[d17];
                        }
                        i18 = i47 * 256;
                        i27 = oVar.d(3);
                        str = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e;
                    } else {
                        oVar.f(32);
                        int d18 = oVar.d(2);
                        int a17 = n8.a.a(d18, oVar.d(6));
                        oVar.f(8);
                        int d19 = oVar.d(3);
                        if ((d19 & 1) != 0 && d19 != 1) {
                            oVar.f(2);
                        }
                        if ((d19 & 4) != 0) {
                            oVar.f(2);
                        }
                        if (d19 == 2) {
                            oVar.f(2);
                        }
                        i17 = iArr[d18];
                        str = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54244xb1630448;
                        i18 = 1536;
                        i19 = a17;
                        i27 = d19;
                    }
                    int i48 = (oVar.c() ? 1 : 0) + n8.a.f416994d[i27];
                    com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417 = this.f525105j;
                    if (c1601x7dc4e417 == null || i48 != c1601x7dc4e417.f125625x || i17 != c1601x7dc4e417.f125626y || str != c1601x7dc4e417.f125613i) {
                        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c17 = com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.c(this.f525099d, str, null, -1, -1, i48, i17, null, null, 0, this.f525098c);
                        this.f525105j = c17;
                        this.f525100e.c(c17);
                    }
                    this.f525106k = i19;
                    this.f525104i = (i18 * 1000000) / this.f525105j.f125626y;
                    pVar2.w(0);
                    this.f525100e.a(pVar2, 8);
                    this.f525101f = 2;
                }
            } else if (i37 == 2) {
                int min2 = java.lang.Math.min(i28 - i29, this.f525106k - this.f525102g);
                this.f525100e.a(pVar, min2);
                int i49 = this.f525102g + min2;
                this.f525102g = i49;
                int i57 = this.f525106k;
                if (i49 == i57) {
                    this.f525100e.b(this.f525107l, 1, i57, 0, null);
                    this.f525107l += this.f525104i;
                    this.f525101f = 0;
                }
            }
        }
    }

    @Override // w8.h
    public void b() {
        this.f525101f = 0;
        this.f525102g = 0;
        this.f525103h = false;
    }

    @Override // w8.h
    public void c() {
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        this.f525107l = j17;
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f525099d = g0Var.f525178e;
        g0Var.b();
        this.f525100e = gVar.l(g0Var.f525177d, 1);
    }
}
