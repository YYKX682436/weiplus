package r8;

/* loaded from: classes15.dex */
public final class b implements q8.e, q8.m {

    /* renamed from: n, reason: collision with root package name */
    public static final int f474799n = t9.d0.f("FLV");

    /* renamed from: e, reason: collision with root package name */
    public q8.g f474804e;

    /* renamed from: g, reason: collision with root package name */
    public int f474806g;

    /* renamed from: h, reason: collision with root package name */
    public int f474807h;

    /* renamed from: i, reason: collision with root package name */
    public int f474808i;

    /* renamed from: j, reason: collision with root package name */
    public long f474809j;

    /* renamed from: k, reason: collision with root package name */
    public r8.a f474810k;

    /* renamed from: l, reason: collision with root package name */
    public r8.f f474811l;

    /* renamed from: m, reason: collision with root package name */
    public r8.c f474812m;

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f474800a = new t9.p(4);

    /* renamed from: b, reason: collision with root package name */
    public final t9.p f474801b = new t9.p(9);

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f474802c = new t9.p(11);

    /* renamed from: d, reason: collision with root package name */
    public final t9.p f474803d = new t9.p();

    /* renamed from: f, reason: collision with root package name */
    public int f474805f = 1;

    @Override // q8.e
    public int a(q8.f fVar, q8.k kVar) {
        r8.c cVar;
        r8.f fVar2;
        r8.a aVar;
        while (true) {
            int i17 = this.f474805f;
            boolean z17 = true;
            if (i17 == 1) {
                t9.p pVar = this.f474801b;
                if (((q8.b) fVar).e(pVar.f498073a, 0, 9, true)) {
                    pVar.w(0);
                    pVar.x(4);
                    int m17 = pVar.m();
                    boolean z18 = (m17 & 4) != 0;
                    boolean z19 = (m17 & 1) != 0;
                    if (z18 && this.f474810k == null) {
                        this.f474810k = new r8.a(this.f474804e.l(8, 1));
                    }
                    if (z19 && this.f474811l == null) {
                        this.f474811l = new r8.f(this.f474804e.l(9, 2));
                    }
                    if (this.f474812m == null) {
                        this.f474812m = new r8.c(null);
                    }
                    this.f474804e.j();
                    this.f474804e.b(this);
                    this.f474806g = (pVar.c() - 9) + 4;
                    this.f474805f = 2;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    return -1;
                }
            } else if (i17 == 2) {
                ((q8.b) fVar).f(this.f474806g);
                this.f474806g = 0;
                this.f474805f = 3;
            } else if (i17 == 3) {
                t9.p pVar2 = this.f474802c;
                if (((q8.b) fVar).e(pVar2.f498073a, 0, 11, true)) {
                    pVar2.w(0);
                    this.f474807h = pVar2.m();
                    this.f474808i = pVar2.o();
                    this.f474809j = pVar2.o();
                    this.f474809j = ((pVar2.m() << 24) | this.f474809j) * 1000;
                    pVar2.x(3);
                    this.f474805f = 4;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    return -1;
                }
            } else if (i17 == 4) {
                int i18 = this.f474807h;
                if (i18 == 8 && (aVar = this.f474810k) != null) {
                    t9.p h17 = h(fVar);
                    long j17 = this.f474809j;
                    aVar.a(h17);
                    aVar.b(h17, j17);
                } else if (i18 == 9 && (fVar2 = this.f474811l) != null) {
                    t9.p h18 = h(fVar);
                    long j18 = this.f474809j;
                    if (fVar2.a(h18)) {
                        fVar2.b(h18, j18);
                    }
                } else if (i18 != 18 || (cVar = this.f474812m) == null) {
                    ((q8.b) fVar).f(this.f474808i);
                    z17 = false;
                } else {
                    cVar.a(h(fVar), this.f474809j);
                }
                this.f474806g = 4;
                this.f474805f = 2;
                if (z17) {
                    return 0;
                }
            } else {
                continue;
            }
        }
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f474804e = gVar;
    }

    @Override // q8.m
    public boolean c() {
        return false;
    }

    @Override // q8.m
    public long d(long j17) {
        return 0L;
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        t9.p pVar = this.f474800a;
        ((q8.b) fVar).b(pVar.f498073a, 0, 3, false);
        pVar.w(0);
        if (pVar.o() != f474799n) {
            return false;
        }
        q8.b bVar = (q8.b) fVar;
        bVar.b(pVar.f498073a, 0, 2, false);
        pVar.w(0);
        if ((pVar.r() & 250) != 0) {
            return false;
        }
        bVar.b(pVar.f498073a, 0, 4, false);
        pVar.w(0);
        int c17 = pVar.c();
        bVar.f442153e = 0;
        bVar.a(c17, false);
        bVar.b(pVar.f498073a, 0, 4, false);
        pVar.w(0);
        return pVar.c() == 0;
    }

    @Override // q8.m
    public long g() {
        return this.f474812m.f474813b;
    }

    public final t9.p h(q8.f fVar) {
        int i17 = this.f474808i;
        t9.p pVar = this.f474803d;
        if (i17 > pVar.a()) {
            pVar.u(new byte[java.lang.Math.max(pVar.a() * 2, this.f474808i)], 0);
        } else {
            pVar.w(0);
        }
        pVar.v(this.f474808i);
        ((q8.b) fVar).e(pVar.f498073a, 0, this.f474808i, false);
        return pVar;
    }

    @Override // q8.e
    /* renamed from: release */
    public void mo131096x41012807() {
    }

    @Override // q8.e
    /* renamed from: seek */
    public void mo131097x35ce78(long j17, long j18) {
        this.f474805f = 1;
        this.f474806g = 0;
    }
}
