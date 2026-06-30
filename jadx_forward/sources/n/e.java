package n;

/* loaded from: classes15.dex */
public class e extends n.b implements o.p {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f414900f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0073x5080ced7 f414901g;

    /* renamed from: h, reason: collision with root package name */
    public final n.a f414902h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f414903i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f414904m;

    /* renamed from: n, reason: collision with root package name */
    public final o.r f414905n;

    public e(android.content.Context context, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0073x5080ced7 c0073x5080ced7, n.a aVar, boolean z17) {
        this.f414900f = context;
        this.f414901g = c0073x5080ced7;
        this.f414902h = aVar;
        o.r rVar = new o.r(c0073x5080ced7.getContext());
        rVar.f423324r = 1;
        this.f414905n = rVar;
        rVar.w(this);
    }

    @Override // n.b
    public void a() {
        if (this.f414904m) {
            return;
        }
        this.f414904m = true;
        this.f414901g.sendAccessibilityEvent(32);
        this.f414902h.d(this);
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        return this.f414902h.b(this, menuItem);
    }

    @Override // n.b
    public android.view.View c() {
        java.lang.ref.WeakReference weakReference = this.f414903i;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // o.p
    public void d(o.r rVar) {
        i();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f414901g.f91047g;
        if (qVar != null) {
            qVar.o();
        }
    }

    @Override // n.b
    public android.view.Menu e() {
        return this.f414905n;
    }

    @Override // n.b
    public android.view.MenuInflater f() {
        return new n.j(this.f414901g.getContext());
    }

    @Override // n.b
    public java.lang.CharSequence g() {
        return this.f414901g.m2600x109898e();
    }

    @Override // n.b
    public java.lang.CharSequence h() {
        return this.f414901g.m2601x7531c8a2();
    }

    @Override // n.b
    public void i() {
        this.f414902h.c(this, this.f414905n);
    }

    @Override // n.b
    public boolean j() {
        return this.f414901g.f90846x;
    }

    @Override // n.b
    public void k(android.view.View view) {
        this.f414901g.m2603xbe1f1fb8(view);
        this.f414903i = view != null ? new java.lang.ref.WeakReference(view) : null;
    }

    @Override // n.b
    public void l(int i17) {
        m(this.f414900f.getString(i17));
    }

    @Override // n.b
    public void m(java.lang.CharSequence charSequence) {
        this.f414901g.m2604xfbc1ea9a(charSequence);
    }

    @Override // n.b
    public void n(int i17) {
        o(this.f414900f.getString(i17));
    }

    @Override // n.b
    public void o(java.lang.CharSequence charSequence) {
        this.f414901g.m2605x53bfe316(charSequence);
    }

    @Override // n.b
    public void p(boolean z17) {
        this.f414895e = z17;
        this.f414901g.m2606x90331c96(z17);
    }
}
