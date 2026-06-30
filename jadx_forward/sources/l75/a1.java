package l75;

/* loaded from: classes11.dex */
public abstract class a1 {

    /* renamed from: c, reason: collision with root package name */
    public final l75.v0 f398472c = new l75.x0(this);

    public void a(l75.z0 z0Var) {
        if (z0Var != null) {
            this.f398472c.a(z0Var, android.os.Looper.getMainLooper());
        }
    }

    public void b(int i17, l75.a1 a1Var, java.lang.Object obj) {
        l75.y0 y0Var = new l75.y0(this, i17, a1Var, obj, null);
        l75.v0 v0Var = this.f398472c;
        v0Var.d(y0Var);
        v0Var.c();
    }

    public boolean c() {
        return this instanceof com.p314xaae8f345.mm.p2621x8fb0427b.k4;
    }

    public void d(l75.y0 y0Var) {
    }

    public void e(l75.z0 z0Var) {
        if (z0Var != null) {
            this.f398472c.j(z0Var);
        }
    }

    public abstract boolean f();
}
