package r01;

/* loaded from: classes9.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f449641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f449642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f449643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f449644g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f449645h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f449646i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f449647m;

    public i(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, long j17, int i19, int i27) {
        this.f449641d = z3Var;
        this.f449642e = f9Var;
        this.f449643f = i17;
        this.f449644g = i18;
        this.f449645h = j17;
        this.f449646i = i19;
        this.f449647m = i27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r01.j jVar = r01.j.f449652a;
        long j17 = this.f449645h;
        int i17 = this.f449646i;
        int i18 = this.f449647m;
        int i19 = (this.f449644g - this.f449643f) - 1;
        r01.f fVar = new r01.f();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f449642e;
        jVar.d(f9Var, fVar);
        jVar.c(f9Var, fVar);
        if (fVar.f449591a <= 0) {
            return;
        }
        java.lang.String.valueOf(j17);
        r01.g e17 = r01.j.e(jVar, f9Var, 0, 2, null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f449641d;
        z3Var.d1();
        f9Var.mo78012x3fdd41df();
        java.lang.String d17 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        jVar.a(1, d17, f9Var, fVar, e17, j17, i17, null, i18, java.lang.Integer.valueOf(i19));
    }
}
