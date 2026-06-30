package l36;

/* loaded from: classes16.dex */
public final class t0 extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final l36.o f397178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l36.u0 f397179f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(l36.u0 u0Var, l36.o oVar) {
        super("OkHttp %s", u0Var.f397188h.f397214a.n());
        this.f397179f = u0Var;
        this.f397178e = oVar;
    }

    @Override // m36.b
    public void a() {
        l36.q0 q0Var;
        l36.o oVar = this.f397178e;
        l36.u0 u0Var = this.f397179f;
        u0Var.f397186f.i();
        boolean z17 = false;
        try {
            try {
            } catch (java.lang.Throwable th6) {
                u0Var.f397184d.f397120d.a(this);
                throw th6;
            }
        } catch (java.io.IOException e17) {
            e = e17;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
        try {
            oVar.a(u0Var, u0Var.c());
            q0Var = u0Var.f397184d;
        } catch (java.io.IOException e18) {
            e = e18;
            z17 = true;
            java.io.IOException d17 = u0Var.d(e);
            if (z17) {
                t36.k.f496994a.l(4, "Callback failure for " + u0Var.e(), d17);
            } else {
                u0Var.f397187g.getClass();
                oVar.d(u0Var, d17);
            }
            q0Var = u0Var.f397184d;
            q0Var.f397120d.a(this);
        } catch (java.lang.Throwable th8) {
            th = th8;
            z17 = true;
            u0Var.a();
            if (!z17) {
                oVar.d(u0Var, new java.io.IOException("canceled due to " + th));
            }
            throw th;
        }
        q0Var.f397120d.a(this);
    }
}
