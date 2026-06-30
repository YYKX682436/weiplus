package d9;

/* loaded from: classes15.dex */
public final class s implements d9.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f308928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d9.t f308929b;

    public s(d9.t tVar, int i17) {
        this.f308929b = tVar;
        this.f308928a = i17;
    }

    @Override // d9.g0
    public int a(m8.s sVar, o8.g gVar, boolean z17) {
        d9.t tVar = this.f308929b;
        if (tVar.C || tVar.t()) {
            return -3;
        }
        return tVar.f308948x[this.f308928a].k(sVar, gVar, z17, tVar.N, tVar.K);
    }

    @Override // d9.g0
    public void b() {
        this.f308929b.f308940p.b();
    }

    @Override // d9.g0
    public void c(long j17) {
        long j18;
        d9.t tVar = this.f308929b;
        d9.f0 f0Var = tVar.f308948x[this.f308928a];
        if (tVar.N) {
            d9.c0 c0Var = f0Var.f308872c;
            synchronized (c0Var) {
                j18 = c0Var.f308839n;
            }
            if (j17 > j18) {
                d9.c0 c0Var2 = f0Var.f308872c;
                synchronized (c0Var2) {
                    if (c0Var2.f()) {
                        c0Var2.f308837l = c0Var2.f308834i;
                        return;
                    }
                    return;
                }
            }
        }
        f0Var.e(j17, true, true);
    }

    @Override // d9.g0
    /* renamed from: isReady */
    public boolean mo123736x7b5e8699() {
        d9.t tVar = this.f308929b;
        return tVar.N || (!tVar.t() && tVar.f308948x[this.f308928a].f308872c.f());
    }
}
