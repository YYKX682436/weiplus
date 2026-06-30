package w8;

/* loaded from: classes15.dex */
public final class t implements w8.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final w8.h f525296a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.o f525297b = new t9.o(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f525298c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f525299d;

    /* renamed from: e, reason: collision with root package name */
    public t9.a0 f525300e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f525301f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f525302g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f525303h;

    /* renamed from: i, reason: collision with root package name */
    public int f525304i;

    /* renamed from: j, reason: collision with root package name */
    public int f525305j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f525306k;

    /* renamed from: l, reason: collision with root package name */
    public long f525307l;

    public t(w8.h hVar) {
        this.f525296a = hVar;
    }

    @Override // w8.h0
    public final void a(t9.p pVar, boolean z17) {
        boolean z18;
        w8.h hVar = this.f525296a;
        if (z17) {
            if (this.f525298c == 3) {
                hVar.c();
            }
            this.f525298c = 1;
            this.f525299d = 0;
        }
        while (true) {
            int i17 = pVar.f498075c;
            int i18 = pVar.f498074b;
            int i19 = i17 - i18;
            if (i19 <= 0) {
                return;
            }
            int i27 = this.f525298c;
            if (i27 != 0) {
                t9.o oVar = this.f525297b;
                if (i27 != 1) {
                    if (i27 == 2) {
                        if (d(pVar, oVar.f498069a, java.lang.Math.min(10, this.f525304i)) && d(pVar, null, this.f525304i)) {
                            oVar.e(0);
                            this.f525307l = -9223372036854775807L;
                            if (this.f525301f) {
                                oVar.f(4);
                                oVar.f(1);
                                oVar.f(1);
                                long d17 = (oVar.d(3) << 30) | (oVar.d(15) << 15) | oVar.d(15);
                                oVar.f(1);
                                if (!this.f525303h && this.f525302g) {
                                    oVar.f(4);
                                    oVar.f(1);
                                    oVar.f(1);
                                    oVar.f(1);
                                    this.f525300e.b(oVar.d(15) | (oVar.d(3) << 30) | (oVar.d(15) << 15));
                                    this.f525303h = true;
                                }
                                this.f525307l = this.f525300e.b(d17);
                            }
                            hVar.d(this.f525307l, this.f525306k);
                            this.f525298c = 3;
                            this.f525299d = 0;
                        }
                    } else if (i27 == 3) {
                        int i28 = this.f525305j;
                        int i29 = i28 == -1 ? 0 : i19 - i28;
                        if (i29 > 0) {
                            i19 -= i29;
                            pVar.v(i18 + i19);
                        }
                        hVar.a(pVar);
                        int i37 = this.f525305j;
                        if (i37 != -1) {
                            int i38 = i37 - i19;
                            this.f525305j = i38;
                            if (i38 == 0) {
                                hVar.c();
                                this.f525298c = 1;
                                this.f525299d = 0;
                            }
                        }
                    }
                } else if (d(pVar, oVar.f498069a, 9)) {
                    oVar.e(0);
                    if (oVar.d(24) != 1) {
                        this.f525305j = -1;
                        z18 = false;
                    } else {
                        oVar.f(8);
                        int d18 = oVar.d(16);
                        oVar.f(5);
                        this.f525306k = oVar.c();
                        oVar.f(2);
                        this.f525301f = oVar.c();
                        this.f525302g = oVar.c();
                        oVar.f(6);
                        int d19 = oVar.d(8);
                        this.f525304i = d19;
                        if (d18 == 0) {
                            this.f525305j = -1;
                        } else {
                            this.f525305j = ((d18 + 6) - 9) - d19;
                        }
                        z18 = true;
                    }
                    this.f525298c = z18 ? 2 : 0;
                    this.f525299d = 0;
                }
            } else {
                pVar.x(i19);
            }
        }
    }

    @Override // w8.h0
    public final void b() {
        this.f525298c = 0;
        this.f525299d = 0;
        this.f525303h = false;
        this.f525296a.b();
    }

    @Override // w8.h0
    public void c(t9.a0 a0Var, q8.g gVar, w8.g0 g0Var) {
        this.f525300e = a0Var;
        this.f525296a.e(gVar, g0Var);
    }

    public final boolean d(t9.p pVar, byte[] bArr, int i17) {
        int min = java.lang.Math.min(pVar.f498075c - pVar.f498074b, i17 - this.f525299d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            pVar.x(min);
        } else {
            pVar.b(bArr, this.f525299d, min);
        }
        int i18 = this.f525299d + min;
        this.f525299d = i18;
        return i18 == i17;
    }
}
