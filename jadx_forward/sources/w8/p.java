package w8;

/* loaded from: classes15.dex */
public final class p implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final w8.y f525259a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f525260b;

    /* renamed from: c, reason: collision with root package name */
    public q8.o f525261c;

    /* renamed from: d, reason: collision with root package name */
    public w8.o f525262d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f525263e;

    /* renamed from: l, reason: collision with root package name */
    public long f525270l;

    /* renamed from: m, reason: collision with root package name */
    public long f525271m;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f525264f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final w8.s f525265g = new w8.s(32, 128);

    /* renamed from: h, reason: collision with root package name */
    public final w8.s f525266h = new w8.s(33, 128);

    /* renamed from: i, reason: collision with root package name */
    public final w8.s f525267i = new w8.s(34, 128);

    /* renamed from: j, reason: collision with root package name */
    public final w8.s f525268j = new w8.s(39, 128);

    /* renamed from: k, reason: collision with root package name */
    public final w8.s f525269k = new w8.s(40, 128);

    /* renamed from: n, reason: collision with root package name */
    public final t9.p f525272n = new t9.p();

    public p(w8.y yVar) {
        this.f525259a = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03a2  */
    @Override // w8.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(t9.p r43) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.p.a(t9.p):void");
    }

    @Override // w8.h
    public void b() {
        t9.n.a(this.f525264f);
        this.f525265g.c();
        this.f525266h.c();
        this.f525267i.c();
        this.f525268j.c();
        this.f525269k.c();
        w8.o oVar = this.f525262d;
        oVar.f525251f = false;
        oVar.f525252g = false;
        oVar.f525253h = false;
        oVar.f525254i = false;
        oVar.f525255j = false;
        this.f525270l = 0L;
    }

    @Override // w8.h
    public void c() {
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        this.f525271m = j17;
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f525260b = g0Var.f525178e;
        g0Var.b();
        q8.o l17 = gVar.l(g0Var.f525177d, 2);
        this.f525261c = l17;
        this.f525262d = new w8.o(l17);
        this.f525259a.a(gVar, g0Var);
    }

    public final void f(byte[] bArr, int i17, int i18) {
        if (this.f525263e) {
            w8.o oVar = this.f525262d;
            if (oVar.f525251f) {
                int i19 = oVar.f525249d;
                int i27 = (i17 + 2) - i19;
                if (i27 < i18) {
                    oVar.f525252g = (bArr[i27] & 128) != 0;
                    oVar.f525251f = false;
                } else {
                    oVar.f525249d = i19 + (i18 - i17);
                }
            }
        } else {
            this.f525265g.a(bArr, i17, i18);
            this.f525266h.a(bArr, i17, i18);
            this.f525267i.a(bArr, i17, i18);
        }
        this.f525268j.a(bArr, i17, i18);
        this.f525269k.a(bArr, i17, i18);
    }
}
