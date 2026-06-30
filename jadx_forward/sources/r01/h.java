package r01;

/* loaded from: classes9.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f449622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f449623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f449624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f449625g;

    public h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, long j17, int i17, int i18, int i19) {
        this.f449622d = f9Var;
        this.f449623e = j17;
        this.f449624f = i17;
        this.f449625g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r01.j jVar = r01.j.f449652a;
        long j17 = this.f449623e;
        int i17 = this.f449624f;
        int i18 = this.f449625g;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f449622d;
        if (r01.z.n(f9Var.Q0())) {
            r01.f fVar = new r01.f();
            jVar.c(f9Var, fVar);
            jVar.d(f9Var, fVar);
            if (fVar.f449591a <= 0) {
                return;
            }
            java.lang.String.valueOf(j17);
            r01.g e17 = r01.j.e(jVar, f9Var, 0, 2, null);
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            r01.j.b(jVar, 2, Q0, f9Var, fVar, e17, j17, i17, null, i18, null, 512, null);
        }
    }
}
