package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class y implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final n.a f9235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g0 f9236b;

    public y(androidx.appcompat.app.g0 g0Var, n.a aVar) {
        this.f9236b = g0Var;
        this.f9235a = aVar;
    }

    @Override // n.a
    public boolean a(n.b bVar, android.view.Menu menu) {
        return this.f9235a.a(bVar, menu);
    }

    @Override // n.a
    public boolean b(n.b bVar, android.view.MenuItem menuItem) {
        return this.f9235a.b(bVar, menuItem);
    }

    @Override // n.a
    public boolean c(n.b bVar, android.view.Menu menu) {
        return this.f9235a.c(bVar, menu);
    }

    @Override // n.a
    public void d(n.b bVar) {
        this.f9235a.d(bVar);
        androidx.appcompat.app.g0 g0Var = this.f9236b;
        if (g0Var.f9122t != null) {
            g0Var.f9110e.getDecorView().removeCallbacks(g0Var.f9123u);
        }
        if (g0Var.f9121s != null) {
            n3.z1 z1Var = g0Var.f9124v;
            if (z1Var != null) {
                z1Var.b();
            }
            n3.z1 a17 = n3.l1.a(g0Var.f9121s);
            a17.a(0.0f);
            g0Var.f9124v = a17;
            a17.d(new androidx.appcompat.app.x(this));
        }
        androidx.appcompat.app.n nVar = g0Var.f9113h;
        if (nVar != null) {
            nVar.onSupportActionModeFinished(g0Var.f9120r);
        }
        g0Var.f9120r = null;
    }
}
