package w8;

/* loaded from: classes15.dex */
public final class g implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f525168a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.o[] f525169b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f525170c;

    /* renamed from: d, reason: collision with root package name */
    public int f525171d;

    /* renamed from: e, reason: collision with root package name */
    public int f525172e;

    /* renamed from: f, reason: collision with root package name */
    public long f525173f;

    public g(java.util.List list) {
        this.f525168a = list;
        this.f525169b = new q8.o[list.size()];
    }

    @Override // w8.h
    public void a(t9.p pVar) {
        boolean z17;
        boolean z18;
        if (this.f525170c) {
            if (this.f525171d == 2) {
                if (pVar.f498075c - pVar.f498074b == 0) {
                    z18 = false;
                } else {
                    if (pVar.m() != 32) {
                        this.f525170c = false;
                    }
                    this.f525171d--;
                    z18 = this.f525170c;
                }
                if (!z18) {
                    return;
                }
            }
            if (this.f525171d == 1) {
                if (pVar.f498075c - pVar.f498074b == 0) {
                    z17 = false;
                } else {
                    if (pVar.m() != 0) {
                        this.f525170c = false;
                    }
                    this.f525171d--;
                    z17 = this.f525170c;
                }
                if (!z17) {
                    return;
                }
            }
            int i17 = pVar.f498074b;
            int i18 = pVar.f498075c - i17;
            for (q8.o oVar : this.f525169b) {
                pVar.w(i17);
                oVar.a(pVar, i18);
            }
            this.f525172e += i18;
        }
    }

    @Override // w8.h
    public void b() {
        this.f525170c = false;
    }

    @Override // w8.h
    public void c() {
        if (this.f525170c) {
            for (q8.o oVar : this.f525169b) {
                oVar.b(this.f525173f, 1, this.f525172e, 0, null);
            }
            this.f525170c = false;
        }
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        if (z17) {
            this.f525170c = true;
            this.f525173f = j17;
            this.f525172e = 0;
            this.f525171d = 2;
        }
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        int i17 = 0;
        while (true) {
            q8.o[] oVarArr = this.f525169b;
            if (i17 >= oVarArr.length) {
                return;
            }
            w8.d0 d0Var = (w8.d0) this.f525168a.get(i17);
            g0Var.a();
            g0Var.b();
            q8.o l17 = gVar.l(g0Var.f525177d, 3);
            g0Var.b();
            l17.c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.d(g0Var.f525178e, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54224xd964a414, null, -1, java.util.Collections.singletonList(d0Var.f525151b), d0Var.f525150a, null));
            oVarArr[i17] = l17;
            i17++;
        }
    }
}
