package ma5;

/* loaded from: classes15.dex */
public class j extends n.b implements o.p {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f406779f;

    /* renamed from: g, reason: collision with root package name */
    public final o.r f406780g;

    /* renamed from: h, reason: collision with root package name */
    public n.a f406781h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f406782i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ma5.k f406783m;

    public j(ma5.k kVar, android.content.Context context, n.a aVar) {
        this.f406783m = kVar;
        this.f406779f = context;
        this.f406781h = aVar;
        o.r rVar = new o.r(context);
        rVar.f423324r = 1;
        this.f406780g = rVar;
        rVar.w(this);
    }

    @Override // n.b
    public void a() {
        ma5.k kVar = this.f406783m;
        if (kVar.f406794i != this) {
            return;
        }
        if ((kVar.f406801p || kVar.f406802q) ? false : true) {
            this.f406781h.d(this);
        } else {
            kVar.f406795j = this;
            kVar.f406796k = this.f406781h;
        }
        this.f406781h = null;
        kVar.N(false);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0073x5080ced7 c0073x5080ced7 = kVar.f406791f;
        if (c0073x5080ced7.f90839q == null) {
            c0073x5080ced7.removeAllViews();
            c0073x5080ced7.f90840r = null;
            c0073x5080ced7.f91046f = null;
        }
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) kVar.f406790e).f91280a.sendAccessibilityEvent(32);
        kVar.f406794i = null;
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        n.a aVar = this.f406781h;
        if (aVar != null) {
            return aVar.b(this, menuItem);
        }
        return false;
    }

    @Override // n.b
    public android.view.View c() {
        java.lang.ref.WeakReference weakReference = this.f406782i;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // o.p
    public void d(o.r rVar) {
        if (this.f406781h == null) {
            return;
        }
        i();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f406783m.f406791f.f91047g;
        if (qVar != null) {
            qVar.o();
        }
    }

    @Override // n.b
    public android.view.Menu e() {
        return this.f406780g;
    }

    @Override // n.b
    public android.view.MenuInflater f() {
        return new n.j(this.f406779f);
    }

    @Override // n.b
    public java.lang.CharSequence g() {
        return this.f406783m.f406791f.m2600x109898e();
    }

    @Override // n.b
    public java.lang.CharSequence h() {
        return this.f406783m.f406791f.m2601x7531c8a2();
    }

    @Override // n.b
    public void i() {
        if (this.f406783m.f406794i != this) {
            return;
        }
        o.r rVar = this.f406780g;
        rVar.z();
        try {
            this.f406781h.c(this, rVar);
        } finally {
            rVar.y();
        }
    }

    @Override // n.b
    public boolean j() {
        return this.f406783m.f406791f.f90846x;
    }

    @Override // n.b
    public void k(android.view.View view) {
        this.f406783m.f406791f.m2603xbe1f1fb8(view);
        this.f406782i = new java.lang.ref.WeakReference(view);
    }

    @Override // n.b
    public void l(int i17) {
        m(this.f406783m.f406786a.getResources().getString(i17));
    }

    @Override // n.b
    public void m(java.lang.CharSequence charSequence) {
        this.f406783m.f406791f.m2604xfbc1ea9a(charSequence);
    }

    @Override // n.b
    public void n(int i17) {
        o(this.f406783m.f406786a.getResources().getString(i17));
    }

    @Override // n.b
    public void o(java.lang.CharSequence charSequence) {
        this.f406783m.f406791f.m2605x53bfe316(charSequence);
    }

    @Override // n.b
    public void p(boolean z17) {
        this.f414895e = z17;
        this.f406783m.f406791f.m2606x90331c96(z17);
    }
}
