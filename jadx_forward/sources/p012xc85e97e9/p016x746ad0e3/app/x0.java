package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class x0 extends n.b implements o.p {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f90763f;

    /* renamed from: g, reason: collision with root package name */
    public final o.r f90764g;

    /* renamed from: h, reason: collision with root package name */
    public n.a f90765h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f90766i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.y0 f90767m;

    public x0(p012xc85e97e9.p016x746ad0e3.app.y0 y0Var, android.content.Context context, n.a aVar) {
        this.f90767m = y0Var;
        this.f90763f = context;
        this.f90765h = aVar;
        o.r rVar = new o.r(context);
        rVar.f423324r = 1;
        this.f90764g = rVar;
        rVar.w(this);
    }

    @Override // n.b
    public void a() {
        p012xc85e97e9.p016x746ad0e3.app.y0 y0Var = this.f90767m;
        if (y0Var.f90779i != this) {
            return;
        }
        if ((y0Var.f90786p || y0Var.f90787q) ? false : true) {
            this.f90765h.d(this);
        } else {
            y0Var.f90780j = this;
            y0Var.f90781k = this.f90765h;
        }
        this.f90765h = null;
        y0Var.N(false);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0073x5080ced7 c0073x5080ced7 = y0Var.f90776f;
        if (c0073x5080ced7.f90839q == null) {
            c0073x5080ced7.removeAllViews();
            c0073x5080ced7.f90840r = null;
            c0073x5080ced7.f91046f = null;
        }
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) y0Var.f90775e).f91280a.sendAccessibilityEvent(32);
        y0Var.f90773c.m2613x986bde1e(y0Var.f90792v);
        y0Var.f90779i = null;
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        n.a aVar = this.f90765h;
        if (aVar != null) {
            return aVar.b(this, menuItem);
        }
        return false;
    }

    @Override // n.b
    public android.view.View c() {
        java.lang.ref.WeakReference weakReference = this.f90766i;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // o.p
    public void d(o.r rVar) {
        if (this.f90765h == null) {
            return;
        }
        i();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f90767m.f90776f.f91047g;
        if (qVar != null) {
            qVar.o();
        }
    }

    @Override // n.b
    public android.view.Menu e() {
        return this.f90764g;
    }

    @Override // n.b
    public android.view.MenuInflater f() {
        return new n.j(this.f90763f);
    }

    @Override // n.b
    public java.lang.CharSequence g() {
        return this.f90767m.f90776f.m2600x109898e();
    }

    @Override // n.b
    public java.lang.CharSequence h() {
        return this.f90767m.f90776f.m2601x7531c8a2();
    }

    @Override // n.b
    public void i() {
        if (this.f90767m.f90779i != this) {
            return;
        }
        o.r rVar = this.f90764g;
        rVar.z();
        try {
            this.f90765h.c(this, rVar);
        } finally {
            rVar.y();
        }
    }

    @Override // n.b
    public boolean j() {
        return this.f90767m.f90776f.f90846x;
    }

    @Override // n.b
    public void k(android.view.View view) {
        this.f90767m.f90776f.m2603xbe1f1fb8(view);
        this.f90766i = new java.lang.ref.WeakReference(view);
    }

    @Override // n.b
    public void l(int i17) {
        m(this.f90767m.f90771a.getResources().getString(i17));
    }

    @Override // n.b
    public void m(java.lang.CharSequence charSequence) {
        this.f90767m.f90776f.m2604xfbc1ea9a(charSequence);
    }

    @Override // n.b
    public void n(int i17) {
        o(this.f90767m.f90771a.getResources().getString(i17));
    }

    @Override // n.b
    public void o(java.lang.CharSequence charSequence) {
        this.f90767m.f90776f.m2605x53bfe316(charSequence);
    }

    @Override // n.b
    public void p(boolean z17) {
        this.f414895e = z17;
        this.f90767m.f90776f.m2606x90331c96(z17);
    }
}
