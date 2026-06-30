package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class y implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final n.a f90768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.g0 f90769b;

    public y(p012xc85e97e9.p016x746ad0e3.app.g0 g0Var, n.a aVar) {
        this.f90769b = g0Var;
        this.f90768a = aVar;
    }

    @Override // n.a
    public boolean a(n.b bVar, android.view.Menu menu) {
        return this.f90768a.a(bVar, menu);
    }

    @Override // n.a
    public boolean b(n.b bVar, android.view.MenuItem menuItem) {
        return this.f90768a.b(bVar, menuItem);
    }

    @Override // n.a
    public boolean c(n.b bVar, android.view.Menu menu) {
        return this.f90768a.c(bVar, menu);
    }

    @Override // n.a
    public void d(n.b bVar) {
        this.f90768a.d(bVar);
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = this.f90769b;
        if (g0Var.f90655t != null) {
            g0Var.f90643e.getDecorView().removeCallbacks(g0Var.f90656u);
        }
        if (g0Var.f90654s != null) {
            n3.z1 z1Var = g0Var.f90657v;
            if (z1Var != null) {
                z1Var.b();
            }
            n3.z1 a17 = n3.l1.a(g0Var.f90654s);
            a17.a(0.0f);
            g0Var.f90657v = a17;
            a17.d(new p012xc85e97e9.p016x746ad0e3.app.x(this));
        }
        p012xc85e97e9.p016x746ad0e3.app.n nVar = g0Var.f90646h;
        if (nVar != null) {
            nVar.mo2537x9f91d9b(g0Var.f90653r);
        }
        g0Var.f90653r = null;
    }
}
