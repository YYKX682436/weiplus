package k0;

/* loaded from: classes14.dex */
public final class r0 implements j0.l3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f384491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f384492b;

    public r0(k0.y0 y0Var, boolean z17) {
        this.f384491a = y0Var;
        this.f384492b = z17;
    }

    @Override // j0.l3
    public void a(long j17) {
        boolean z17 = this.f384492b;
        j0.u1 u1Var = z17 ? j0.u1.SelectionStart : j0.u1.SelectionEnd;
        k0.y0 y0Var = this.f384491a;
        k0.y0.b(y0Var, u1Var);
        k0.y0.a(y0Var, new d1.e(k0.y.a(y0Var.i(z17))));
    }

    @Override // j0.l3
    public void b(long j17) {
        j0.d5 d5Var;
        a2.k1 k1Var;
        int i17;
        int l17;
        k0.y0 y0Var = this.f384491a;
        long f17 = d1.e.f(y0Var.f384520m, j17);
        y0Var.f384520m = f17;
        j0.c5 c5Var = y0Var.f384511d;
        if (c5Var != null && (d5Var = c5Var.f377772g) != null && (k1Var = d5Var.f377798a) != null) {
            boolean z17 = this.f384492b;
            d1.e eVar = new d1.e(d1.e.f(y0Var.f384518k, f17));
            n0.v2 v2Var = y0Var.f384522o;
            ((n0.q4) v2Var).mo148714x53d8522f(eVar);
            if (z17) {
                d1.e eVar2 = (d1.e) ((n0.q4) v2Var).mo128745x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar2);
                i17 = k1Var.l(eVar2.f307160a);
            } else {
                g2.v vVar = y0Var.f384509b;
                long j18 = y0Var.j().f349227b;
                int i18 = a2.m1.f82315c;
                ((g2.t) vVar).getClass();
                i17 = (int) (j18 >> 32);
            }
            if (z17) {
                g2.v vVar2 = y0Var.f384509b;
                int c17 = a2.m1.c(y0Var.j().f349227b);
                ((g2.t) vVar2).getClass();
                l17 = c17;
            } else {
                d1.e eVar3 = (d1.e) ((n0.q4) v2Var).mo128745x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar3);
                l17 = k1Var.l(eVar3.f307160a);
            }
            k0.y0.c(y0Var, y0Var.j(), i17, l17, z17, k0.u.f384496b);
        }
        j0.c5 c5Var2 = y0Var.f384511d;
        if (c5Var2 == null) {
            return;
        }
        c5Var2.f377774i = false;
    }

    @Override // j0.l3
    public void c(long j17) {
        k0.y0 y0Var = this.f384491a;
        boolean z17 = this.f384492b;
        y0Var.f384518k = k0.y.a(y0Var.i(z17));
        k0.y0.a(y0Var, new d1.e(y0Var.f384518k));
        int i17 = d1.e.f307159e;
        y0Var.f384520m = d1.e.f307156b;
        k0.y0.b(y0Var, z17 ? j0.u1.SelectionStart : j0.u1.SelectionEnd);
        j0.c5 c5Var = y0Var.f384511d;
        if (c5Var == null) {
            return;
        }
        c5Var.f377774i = false;
    }

    @Override // j0.l3
    public void d() {
        k0.y0 y0Var = this.f384491a;
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
        k0.y0 y0Var = this.f384491a;
        k0.y0.b(y0Var, null);
        k0.y0.a(y0Var, null);
        j0.c5 c5Var = y0Var.f384511d;
        if (c5Var != null) {
            c5Var.f377774i = true;
        }
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.c4 c4Var = y0Var.f384514g;
        if ((c4Var != null ? ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.c1) c4Var).f92063d : null) == p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e4.Hidden) {
            y0Var.n();
        }
    }
}
