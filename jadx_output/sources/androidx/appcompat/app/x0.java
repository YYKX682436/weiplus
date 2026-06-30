package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class x0 extends n.b implements o.p {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f9230f;

    /* renamed from: g, reason: collision with root package name */
    public final o.r f9231g;

    /* renamed from: h, reason: collision with root package name */
    public n.a f9232h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f9233i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.y0 f9234m;

    public x0(androidx.appcompat.app.y0 y0Var, android.content.Context context, n.a aVar) {
        this.f9234m = y0Var;
        this.f9230f = context;
        this.f9232h = aVar;
        o.r rVar = new o.r(context);
        rVar.f341791r = 1;
        this.f9231g = rVar;
        rVar.w(this);
    }

    @Override // n.b
    public void a() {
        androidx.appcompat.app.y0 y0Var = this.f9234m;
        if (y0Var.f9246i != this) {
            return;
        }
        if ((y0Var.f9253p || y0Var.f9254q) ? false : true) {
            this.f9232h.d(this);
        } else {
            y0Var.f9247j = this;
            y0Var.f9248k = this.f9232h;
        }
        this.f9232h = null;
        y0Var.N(false);
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = y0Var.f9243f;
        if (actionBarContextView.f9306q == null) {
            actionBarContextView.removeAllViews();
            actionBarContextView.f9307r = null;
            actionBarContextView.f9513f = null;
        }
        ((androidx.appcompat.widget.z2) y0Var.f9242e).f9747a.sendAccessibilityEvent(32);
        y0Var.f9240c.setHideOnContentScrollEnabled(y0Var.f9259v);
        y0Var.f9246i = null;
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        n.a aVar = this.f9232h;
        if (aVar != null) {
            return aVar.b(this, menuItem);
        }
        return false;
    }

    @Override // n.b
    public android.view.View c() {
        java.lang.ref.WeakReference weakReference = this.f9233i;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // o.p
    public void d(o.r rVar) {
        if (this.f9232h == null) {
            return;
        }
        i();
        androidx.appcompat.widget.q qVar = this.f9234m.f9243f.f9514g;
        if (qVar != null) {
            qVar.o();
        }
    }

    @Override // n.b
    public android.view.Menu e() {
        return this.f9231g;
    }

    @Override // n.b
    public android.view.MenuInflater f() {
        return new n.j(this.f9230f);
    }

    @Override // n.b
    public java.lang.CharSequence g() {
        return this.f9234m.f9243f.getSubtitle();
    }

    @Override // n.b
    public java.lang.CharSequence h() {
        return this.f9234m.f9243f.getTitle();
    }

    @Override // n.b
    public void i() {
        if (this.f9234m.f9246i != this) {
            return;
        }
        o.r rVar = this.f9231g;
        rVar.z();
        try {
            this.f9232h.c(this, rVar);
        } finally {
            rVar.y();
        }
    }

    @Override // n.b
    public boolean j() {
        return this.f9234m.f9243f.f9313x;
    }

    @Override // n.b
    public void k(android.view.View view) {
        this.f9234m.f9243f.setCustomView(view);
        this.f9233i = new java.lang.ref.WeakReference(view);
    }

    @Override // n.b
    public void l(int i17) {
        m(this.f9234m.f9238a.getResources().getString(i17));
    }

    @Override // n.b
    public void m(java.lang.CharSequence charSequence) {
        this.f9234m.f9243f.setSubtitle(charSequence);
    }

    @Override // n.b
    public void n(int i17) {
        o(this.f9234m.f9238a.getResources().getString(i17));
    }

    @Override // n.b
    public void o(java.lang.CharSequence charSequence) {
        this.f9234m.f9243f.setTitle(charSequence);
    }

    @Override // n.b
    public void p(boolean z17) {
        this.f333362e = z17;
        this.f9234m.f9243f.setTitleOptional(z17);
    }
}
