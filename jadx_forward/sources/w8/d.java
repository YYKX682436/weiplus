package w8;

/* loaded from: classes15.dex */
public final class d implements w8.h {

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f525132r = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f525133a;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f525136d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f525137e;

    /* renamed from: f, reason: collision with root package name */
    public q8.o f525138f;

    /* renamed from: g, reason: collision with root package name */
    public q8.o f525139g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f525143k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f525144l;

    /* renamed from: m, reason: collision with root package name */
    public long f525145m;

    /* renamed from: n, reason: collision with root package name */
    public int f525146n;

    /* renamed from: o, reason: collision with root package name */
    public long f525147o;

    /* renamed from: p, reason: collision with root package name */
    public q8.o f525148p;

    /* renamed from: q, reason: collision with root package name */
    public long f525149q;

    /* renamed from: b, reason: collision with root package name */
    public final t9.o f525134b = new t9.o(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f525135c = new t9.p(java.util.Arrays.copyOf(f525132r, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f525140h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f525141i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f525142j = 256;

    public d(boolean z17, java.lang.String str) {
        this.f525133a = z17;
        this.f525136d = str;
    }

    @Override // w8.h
    public void a(t9.p pVar) {
        while (true) {
            int i17 = pVar.f498075c;
            int i18 = pVar.f498074b;
            int i19 = i17 - i18;
            if (i19 <= 0) {
                return;
            }
            int i27 = this.f525140h;
            t9.p pVar2 = this.f525135c;
            if (i27 == 0) {
                byte[] bArr = pVar.f498073a;
                while (true) {
                    if (i18 >= i17) {
                        pVar.w(i18);
                        break;
                    }
                    int i28 = i18 + 1;
                    int i29 = bArr[i18] & 255;
                    int i37 = this.f525142j;
                    if (i37 != 512 || i29 < 240 || i29 == 255) {
                        int i38 = i29 | i37;
                        if (i38 == 329) {
                            this.f525142j = 768;
                        } else if (i38 == 511) {
                            this.f525142j = 512;
                        } else if (i38 == 836) {
                            this.f525142j = 1024;
                        } else {
                            if (i38 == 1075) {
                                this.f525140h = 1;
                                this.f525141i = 3;
                                this.f525146n = 0;
                                pVar2.w(0);
                                pVar.w(i28);
                                break;
                            }
                            if (i37 != 256) {
                                this.f525142j = 256;
                                i28--;
                            }
                        }
                        i18 = i28;
                    } else {
                        this.f525143k = (i29 & 1) == 0;
                        this.f525140h = 2;
                        this.f525141i = 0;
                        pVar.w(i28);
                    }
                }
            } else if (i27 != 1) {
                if (i27 == 2) {
                    int i39 = this.f525143k ? 7 : 5;
                    t9.o oVar = this.f525134b;
                    if (f(pVar, oVar.f498069a, i39)) {
                        oVar.e(0);
                        if (this.f525144l) {
                            oVar.f(10);
                        } else {
                            int d17 = oVar.d(2) + 1;
                            if (d17 != 2) {
                                d17 = 2;
                            }
                            int d18 = oVar.d(4);
                            oVar.f(1);
                            byte[] bArr2 = {(byte) (((d17 << 3) & 248) | ((d18 >> 1) & 7)), (byte) (((d18 << 7) & 128) | ((oVar.d(3) << 3) & 120))};
                            android.util.Pair b17 = t9.e.b(bArr2);
                            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c17 = com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.c(this.f525137e, "audio/mp4a-latm", null, -1, -1, ((java.lang.Integer) b17.second).intValue(), ((java.lang.Integer) b17.first).intValue(), java.util.Collections.singletonList(bArr2), null, 0, this.f525136d);
                            this.f525145m = 1024000000 / c17.f125626y;
                            this.f525138f.c(c17);
                            this.f525144l = true;
                        }
                        oVar.f(4);
                        int d19 = (oVar.d(13) - 2) - 5;
                        if (this.f525143k) {
                            d19 -= 2;
                        }
                        q8.o oVar2 = this.f525138f;
                        long j17 = this.f525145m;
                        this.f525140h = 3;
                        this.f525141i = 0;
                        this.f525148p = oVar2;
                        this.f525149q = j17;
                        this.f525146n = d19;
                    }
                } else if (i27 == 3) {
                    int min = java.lang.Math.min(i19, this.f525146n - this.f525141i);
                    this.f525148p.a(pVar, min);
                    int i47 = this.f525141i + min;
                    this.f525141i = i47;
                    int i48 = this.f525146n;
                    if (i47 == i48) {
                        this.f525148p.b(this.f525147o, 1, i48, 0, null);
                        this.f525147o += this.f525149q;
                        this.f525140h = 0;
                        this.f525141i = 0;
                        this.f525142j = 256;
                    }
                }
            } else if (f(pVar, pVar2.f498073a, 10)) {
                this.f525139g.a(pVar2, 10);
                pVar2.w(6);
                q8.o oVar3 = this.f525139g;
                int l17 = pVar2.l() + 10;
                this.f525140h = 3;
                this.f525141i = 10;
                this.f525148p = oVar3;
                this.f525149q = 0L;
                this.f525146n = l17;
            }
        }
    }

    @Override // w8.h
    public void b() {
        this.f525140h = 0;
        this.f525141i = 0;
        this.f525142j = 256;
    }

    @Override // w8.h
    public void c() {
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        this.f525147o = j17;
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f525137e = g0Var.f525178e;
        g0Var.b();
        this.f525138f = gVar.l(g0Var.f525177d, 1);
        if (!this.f525133a) {
            this.f525139g = new q8.d();
            return;
        }
        g0Var.a();
        g0Var.b();
        q8.o l17 = gVar.l(g0Var.f525177d, 4);
        this.f525139g = l17;
        g0Var.b();
        l17.c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.f(g0Var.f525178e, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54228xf853cae9, null, -1, null));
    }

    public final boolean f(t9.p pVar, byte[] bArr, int i17) {
        int min = java.lang.Math.min(pVar.f498075c - pVar.f498074b, i17 - this.f525141i);
        pVar.b(bArr, this.f525141i, min);
        int i18 = this.f525141i + min;
        this.f525141i = i18;
        return i18 == i17;
    }
}
