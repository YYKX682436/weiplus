package w8;

/* loaded from: classes15.dex */
public final class q implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f525273a = new t9.p(10);

    /* renamed from: b, reason: collision with root package name */
    public q8.o f525274b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f525275c;

    /* renamed from: d, reason: collision with root package name */
    public long f525276d;

    /* renamed from: e, reason: collision with root package name */
    public int f525277e;

    /* renamed from: f, reason: collision with root package name */
    public int f525278f;

    @Override // w8.h
    public void a(t9.p pVar) {
        if (this.f525275c) {
            int i17 = pVar.f498075c - pVar.f498074b;
            int i18 = this.f525278f;
            if (i18 < 10) {
                int min = java.lang.Math.min(i17, 10 - i18);
                byte[] bArr = pVar.f498073a;
                int i19 = pVar.f498074b;
                t9.p pVar2 = this.f525273a;
                java.lang.System.arraycopy(bArr, i19, pVar2.f498073a, this.f525278f, min);
                if (this.f525278f + min == 10) {
                    pVar2.w(0);
                    if (73 != pVar2.m() || 68 != pVar2.m() || 51 != pVar2.m()) {
                        this.f525275c = false;
                        return;
                    } else {
                        pVar2.x(3);
                        this.f525277e = pVar2.l() + 10;
                    }
                }
            }
            int min2 = java.lang.Math.min(i17, this.f525277e - this.f525278f);
            this.f525274b.a(pVar, min2);
            this.f525278f += min2;
        }
    }

    @Override // w8.h
    public void b() {
        this.f525275c = false;
    }

    @Override // w8.h
    public void c() {
        int i17;
        if (this.f525275c && (i17 = this.f525277e) != 0 && this.f525278f == i17) {
            this.f525274b.b(this.f525276d, 1, i17, 0, null);
            this.f525275c = false;
        }
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        if (z17) {
            this.f525275c = true;
            this.f525276d = j17;
            this.f525277e = 0;
            this.f525278f = 0;
        }
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        q8.o l17 = gVar.l(g0Var.f525177d, 4);
        this.f525274b = l17;
        g0Var.b();
        l17.c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.f(g0Var.f525178e, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54228xf853cae9, null, -1, null));
    }
}
