package j0;

/* loaded from: classes14.dex */
public final class h3 implements j0.l3 {

    /* renamed from: a, reason: collision with root package name */
    public long f377847a;

    /* renamed from: b, reason: collision with root package name */
    public long f377848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f377849c;

    public h3(j0.j3 j3Var, k0.i0 i0Var) {
        this.f377849c = j3Var;
        int i17 = d1.e.f307159e;
        long j17 = d1.e.f307156b;
        this.f377847a = j17;
        this.f377848b = j17;
    }

    @Override // j0.l3
    public void a(long j17) {
    }

    @Override // j0.l3
    public void b(long j17) {
        j0.j3 j3Var = this.f377849c;
        s1.z zVar = j3Var.f377915d.f377824d;
        if (zVar != null && ((u1.c1) zVar).p0() && k0.k0.a(null, j3Var.f377915d.f377822b)) {
            long f17 = d1.e.f(this.f377848b, j17);
            this.f377848b = f17;
            if (j0.j3.a(j3Var, this.f377847a, d1.e.f(this.f377847a, f17))) {
                return;
            }
            int i17 = k0.v.f384499a;
            throw null;
        }
    }

    @Override // j0.l3
    public void c(long j17) {
        j0.j3 j3Var = this.f377849c;
        j0.f5 f5Var = j3Var.f377915d;
        s1.z zVar = f5Var.f377824d;
        if (zVar == null) {
            if (k0.k0.a(null, f5Var.f377822b)) {
                int i17 = d1.e.f307159e;
                this.f377848b = d1.e.f307156b;
                return;
            }
            return;
        }
        if (((u1.c1) zVar).p0()) {
            if (j0.j3.a(j3Var, j17, j17)) {
                long j18 = j3Var.f377915d.f377822b;
                throw null;
            }
            int i18 = k0.v.f384499a;
            throw null;
        }
    }

    @Override // j0.l3
    public void d() {
    }

    @Override // j0.l3
    /* renamed from: onCancel */
    public void mo140028x3d6f0539() {
        if (k0.k0.a(null, this.f377849c.f377915d.f377822b)) {
            throw null;
        }
    }

    @Override // j0.l3
    /* renamed from: onStop */
    public void mo140029xc39f8281() {
        if (k0.k0.a(null, this.f377849c.f377915d.f377822b)) {
            throw null;
        }
    }
}
