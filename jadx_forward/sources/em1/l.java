package em1;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m f336586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f336587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 f336588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f336589g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f336590h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f336591i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ em1.d f336592m;

    public l(em1.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, cl.q0 q0Var, int i17, boolean z17) {
        this.f336592m = dVar;
        this.f336586d = mVar;
        this.f336587e = list;
        this.f336588f = c0Var;
        this.f336589g = q0Var;
        this.f336590h = i17;
        this.f336591i = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 y17;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e eVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e(new em1.k(this, this.f336586d));
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5129xb513d637 c5129xb513d637 = new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5129xb513d637();
        long m15872xc2f94e39 = ((cl.a) this.f336589g.f124257b).f124101a.m15872xc2f94e39();
        long e17 = this.f336589g.e();
        long m15873x206d1933 = ((cl.a) this.f336589g.f124257b).f124101a.m15873x206d1933();
        java.lang.String m17 = this.f336592m.m();
        c5129xb513d637.f21470x5aa3c83 = m17;
        if (!android.text.TextUtils.isEmpty(m17)) {
            c5129xb513d637.f21470x5aa3c83 = com.p314xaae8f345.mm.vfs.w6.i(c5129xb513d637.f21470x5aa3c83, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = this.f336586d;
        if ((mVar instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) && (y17 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) mVar).y1()) != null) {
            c5129xb513d637.f21471xda4d7062 = y17.U();
        }
        eVar.f128931a.m43150x3c2bc9a5(c5129xb513d637);
        eVar.f128931a.m43148x39fc3c41(m15872xc2f94e39, e17, m15873x206d1933);
        if (!(cl.q0.f124255l != null)) {
            eVar.f128931a.m43147xa622ddac(m15872xc2f94e39, e17, m15873x206d1933);
        }
        eVar.f128932b.a(((cl.a) this.f336589g.f124257b).f124101a.m15872xc2f94e39(), this.f336589g.e());
        this.f336592m.f336559f.put(this.f336590h, eVar);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2();
        com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652 abstractC22919x419b2652 = n2Var.f129035a;
        if (abstractC22919x419b2652 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
            throw null;
        }
        abstractC22919x419b2652.m83327xad361398(m15872xc2f94e39, e17);
        this.f336592m.f336562i.put(this.f336590h, n2Var);
        if (this.f336591i && !this.f336592m.f336560g.get()) {
            synchronized (this.f336592m.f336561h) {
                android.util.SparseArray sparseArray = this.f336592m.f336561h;
                int i17 = this.f336590h;
                sparseArray.put(i17, new em1.n(i17, eVar, this.f336589g, this.f336586d));
            }
            return;
        }
        eVar.f128931a.m43155xb8268694(this.f336586d.mo48798x74292566(), this.f336592m.l(this.f336586d), this.f336592m.k(this.f336586d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar2 = this.f336586d;
        if (mVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) mVar2;
            if (e9Var.mo32091x9a3f0ba2() != null) {
                n2Var.c(e9Var.mo32091x9a3f0ba2(), m15873x206d1933);
            }
        }
    }
}
