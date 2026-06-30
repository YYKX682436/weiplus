package k0;

/* loaded from: classes14.dex */
public final class q0 implements j0.l3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f384490a;

    public q0(k0.y0 y0Var) {
        this.f384490a = y0Var;
    }

    @Override // j0.l3
    public void a(long j17) {
        j0.u1 u1Var = j0.u1.Cursor;
        k0.y0 y0Var = this.f384490a;
        k0.y0.b(y0Var, u1Var);
        k0.y0.a(y0Var, new d1.e(k0.y.a(y0Var.i(true))));
    }

    @Override // j0.l3
    public void b(long j17) {
        j0.d5 d5Var;
        a2.k1 k1Var;
        k0.y0 y0Var = this.f384490a;
        long f17 = d1.e.f(y0Var.f384520m, j17);
        y0Var.f384520m = f17;
        j0.c5 c5Var = y0Var.f384511d;
        if (c5Var == null || (d5Var = c5Var.f377772g) == null || (k1Var = d5Var.f377798a) == null) {
            return;
        }
        d1.e eVar = new d1.e(d1.e.f(y0Var.f384518k, f17));
        n0.v2 v2Var = y0Var.f384522o;
        ((n0.q4) v2Var).mo148714x53d8522f(eVar);
        d1.e eVar2 = (d1.e) ((n0.q4) v2Var).mo128745x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar2);
        int l17 = k1Var.l(eVar2.f307160a);
        long a17 = a2.n1.a(l17, l17);
        if (a2.m1.a(a17, y0Var.j().f349227b)) {
            return;
        }
        k1.a aVar = y0Var.f384515h;
        if (aVar != null) {
            ((k1.b) aVar).a(9);
        }
        y0Var.f384510c.mo146xb9724478(y0Var.e(y0Var.j().f349226a, a17));
    }

    @Override // j0.l3
    public void c(long j17) {
        k0.y0 y0Var = this.f384490a;
        y0Var.f384518k = k0.y.a(y0Var.i(true));
        k0.y0.a(y0Var, new d1.e(y0Var.f384518k));
        int i17 = d1.e.f307159e;
        y0Var.f384520m = d1.e.f307156b;
        k0.y0.b(y0Var, j0.u1.Cursor);
    }

    @Override // j0.l3
    public void d() {
        k0.y0 y0Var = this.f384490a;
        k0.y0.b(y0Var, null);
        k0.y0.a(y0Var, null);
    }

    @Override // j0.l3
    /* renamed from: onCancel */
    public void mo140028x3d6f0539() {
    }

    @Override // j0.l3
    /* renamed from: onStop */
    public void mo140029xc39f8281() {
        k0.y0 y0Var = this.f384490a;
        k0.y0.b(y0Var, null);
        k0.y0.a(y0Var, null);
    }
}
