package bp4;

/* loaded from: classes10.dex */
public final class i0 implements ru3.n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f104727a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bp4.k0 f104728b;

    public i0(bp4.k0 k0Var) {
        this.f104728b = k0Var;
    }

    @Override // ru3.n
    public void a(boolean z17) {
        bp4.u2 u2Var;
        bp4.a3 a3Var = this.f104728b.G;
        if (a3Var == null || (u2Var = ((bp4.w2) a3Var).f104947s) == null) {
            return;
        }
        u2Var.a(z17);
    }

    @Override // ru3.n
    public void b(android.graphics.RectF rectF) {
        bp4.u2 u2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectF, "rectF");
        bp4.k0 k0Var = this.f104728b;
        bp4.a3 a3Var = k0Var.G;
        if (a3Var != null && (u2Var = ((bp4.w2) a3Var).f104947s) != null) {
            u2Var.b(rectF);
        }
        ml5.h hVar = k0Var.f104752r;
        if (hVar != null) {
            hVar.mo10990x3dcbea6f();
        }
        if (!this.f104727a) {
            k0Var.f104757w++;
        }
        this.f104727a = true;
    }

    @Override // ru3.n
    public void c(boolean z17) {
        bp4.u2 u2Var;
        bp4.a3 a3Var = this.f104728b.G;
        if (a3Var != null && (u2Var = ((bp4.w2) a3Var).f104947s) != null) {
            u2Var.c(z17);
        }
        this.f104727a = false;
    }
}
