package fn4;

/* loaded from: classes15.dex */
public abstract class m extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements fn4.a {

    /* renamed from: d, reason: collision with root package name */
    public final fn4.b f346116d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xn6 f346117e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View.OnClickListener f346118f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f346119g;

    public m(android.view.View view, fn4.b bVar) {
        super(view);
        this.f346118f = new fn4.i(this);
        this.f346116d = bVar;
        n(view);
    }

    public abstract fn4.g i();

    public abstract android.view.View j();

    public void k(android.view.View view) {
    }

    public void l(android.view.View view) {
        fn4.b bVar = this.f346116d;
        if (bVar.Y2() != u()) {
            bVar.o4().f346010d = 2;
            bVar.t1(u());
            uu4.a.a(4);
            bVar.o4().d(this.f346117e);
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(bVar.r0(), this.f346117e, u(), 2, "");
            return;
        }
        k(view);
        if (o()) {
            t();
            bVar.t();
            m();
            bVar.m();
        }
    }

    @Override // fn4.a
    public void m() {
        this.f346116d.m();
    }

    public void n(android.view.View view) {
    }

    public boolean o() {
        return false;
    }

    public abstract void p();

    public void q(r45.xn6 xn6Var) {
        this.f346117e = xn6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoHolder", "onBindItemHolder %s", xn6Var.f471788d);
        p();
    }

    public void r(fn4.b bVar, android.content.Context context, fn4.g gVar, int i17) {
        r45.xn6 d17 = bVar.s4().d(i17);
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(bVar.r0(), d17, i17, 5, "");
        if (d17 != null) {
            fn4.b bVar2 = this.f346116d;
            if (bVar2.I2().d()) {
                bVar2.I2().h();
                this.f346119g = true;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
            k0Var.f293405n = new fn4.j(this);
            k0Var.f293414s = new fn4.k(this, gVar, context, d17, bVar, i17);
            k0Var.f293387d = new fn4.l(this);
            k0Var.v();
        }
    }

    public abstract void s(boolean z17);

    @Override // fn4.a
    public void t() {
        this.f346116d.t();
    }

    @Override // fn4.a
    public int u() {
        return m8183xf806b362() - this.f346116d.t0().z();
    }
}
