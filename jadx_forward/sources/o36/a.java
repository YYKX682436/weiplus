package o36;

/* loaded from: classes16.dex */
public final class a implements l36.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final l36.q0 f424286a;

    public a(l36.q0 q0Var) {
        this.f424286a = q0Var;
    }

    @Override // l36.m0
    public l36.a1 a(l36.l0 l0Var) {
        p36.i iVar = (p36.i) l0Var;
        l36.w0 w0Var = iVar.f433260f;
        o36.j jVar = iVar.f433256b;
        boolean z17 = !w0Var.f397215b.equals("GET");
        l36.q0 q0Var = this.f424286a;
        jVar.getClass();
        p36.i iVar2 = (p36.i) l0Var;
        try {
            p36.d h17 = jVar.e(iVar2.f433263i, iVar2.f433264j, iVar2.f433265k, q0Var.H, q0Var.C, z17).h(q0Var, l0Var, jVar);
            synchronized (jVar.f424322d) {
                jVar.f424332n = h17;
            }
            return iVar.a(w0Var, jVar, h17, jVar.b());
        } catch (java.io.IOException e17) {
            throw new o36.f(e17);
        }
    }
}
