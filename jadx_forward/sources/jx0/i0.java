package jx0;

/* loaded from: classes5.dex */
public final class i0 implements jx0.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f f383908a;

    public i0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f c10966x6b7a943f) {
        this.f383908a = c10966x6b7a943f;
    }

    @Override // jx0.g0
    public void a(float f17) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f c10966x6b7a943f = this.f383908a;
        c10966x6b7a943f.F = false;
        jx0.g0 g0Var = c10966x6b7a943f.f150978w;
        if (g0Var != null) {
            g0Var.a(f17);
        }
    }

    @Override // jx0.g0
    public int b() {
        jx0.g0 g0Var = this.f383908a.f150978w;
        if (g0Var != null) {
            return g0Var.b();
        }
        return 1;
    }

    @Override // jx0.g0
    public void c(float f17) {
        jx0.g0 g0Var = this.f383908a.f150978w;
        if (g0Var != null) {
            g0Var.c(f17);
        }
    }

    @Override // jx0.g0
    public void d() {
        jx0.g0 g0Var = this.f383908a.f150978w;
        if (g0Var != null) {
            g0Var.d();
        }
    }

    @Override // jx0.g0
    public void e(float f17) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f c10966x6b7a943f = this.f383908a;
        c10966x6b7a943f.F = true;
        jx0.g0 g0Var = c10966x6b7a943f.f150978w;
        if (g0Var != null) {
            g0Var.e(f17);
        }
    }
}
