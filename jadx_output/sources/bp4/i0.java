package bp4;

/* loaded from: classes10.dex */
public final class i0 implements ru3.n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23194a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bp4.k0 f23195b;

    public i0(bp4.k0 k0Var) {
        this.f23195b = k0Var;
    }

    @Override // ru3.n
    public void a(boolean z17) {
        bp4.u2 u2Var;
        bp4.a3 a3Var = this.f23195b.G;
        if (a3Var == null || (u2Var = ((bp4.w2) a3Var).f23414s) == null) {
            return;
        }
        u2Var.a(z17);
    }

    @Override // ru3.n
    public void b(android.graphics.RectF rectF) {
        bp4.u2 u2Var;
        kotlin.jvm.internal.o.g(rectF, "rectF");
        bp4.k0 k0Var = this.f23195b;
        bp4.a3 a3Var = k0Var.G;
        if (a3Var != null && (u2Var = ((bp4.w2) a3Var).f23414s) != null) {
            u2Var.b(rectF);
        }
        ml5.h hVar = k0Var.f23219r;
        if (hVar != null) {
            hVar.onChange();
        }
        if (!this.f23194a) {
            k0Var.f23224w++;
        }
        this.f23194a = true;
    }

    @Override // ru3.n
    public void c(boolean z17) {
        bp4.u2 u2Var;
        bp4.a3 a3Var = this.f23195b.G;
        if (a3Var != null && (u2Var = ((bp4.w2) a3Var).f23414s) != null) {
            u2Var.c(z17);
        }
        this.f23194a = false;
    }
}
