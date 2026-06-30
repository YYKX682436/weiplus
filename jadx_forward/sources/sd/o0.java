package sd;

/* loaded from: classes8.dex */
public class o0 extends sd.l0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.MutableContextWrapper f488163f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f488164g;

    /* renamed from: h, reason: collision with root package name */
    public sd.p0 f488165h;

    /* renamed from: i, reason: collision with root package name */
    public pf.b f488166i;

    /* renamed from: m, reason: collision with root package name */
    public od.l f488167m;

    /* renamed from: o, reason: collision with root package name */
    public qf.b f488169o;

    /* renamed from: p, reason: collision with root package name */
    public qf.d f488170p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f488171q;

    /* renamed from: r, reason: collision with root package name */
    public final int f488172r;

    /* renamed from: n, reason: collision with root package name */
    public boolean f488168n = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f488173s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f488174t = true;

    public o0(android.content.Context context, java.lang.Class cls) {
        sd.n0 n0Var = new sd.n0(this);
        android.content.MutableContextWrapper mutableContextWrapper = new android.content.MutableContextWrapper(context);
        this.f488163f = mutableContextWrapper;
        cls = cls == null ? com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.f.class : cls;
        this.f488164g = cls;
        new android.os.Handler(android.os.Looper.getMainLooper());
        this.f488172r = hashCode();
        this.f488169o = new qf.b();
        this.f488170p = new qf.d();
        this.f488169o.a(new qf.a(mutableContextWrapper));
        pf.b bVar = (pf.b) new d56.b(cls, cls).d(mutableContextWrapper).f308165b;
        this.f488166i = bVar;
        bVar.mo32268xfa22ae51(this);
        this.f488166i.a0(n0Var);
        this.f488167m = new od.l(this.f488166i);
    }

    @Override // sd.l0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageWebCore", "destroy");
        if (this.f488168n) {
            return;
        }
        this.f488166i.mo32259x5cd39ffa();
    }

    @Override // sd.l0
    public od.l d() {
        return this.f488167m;
    }

    @Override // sd.l0
    public java.lang.String e() {
        return this.f488166i.mo32054x11fd7f44();
    }

    public java.lang.Object h() {
        try {
            return this.f488166i.mo32262xfb86a31b();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(sd.o0.class.getSimpleName(), "CoreImpl cast failed", e17);
            return null;
        }
    }

    public synchronized void i() {
        if (!this.f488173s) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Luggage.LuggageWebCore", "try inject jsbridge", new java.lang.Object[0]);
            this.f488167m.a();
            sd.p0 p0Var = this.f488165h;
            if (p0Var != null) {
                od.l lVar = this.f488167m;
                lVar.f426049a.mo32260x738236e6(p0Var.a(), null);
            }
            this.f488173s = true;
        }
    }

    public void j(java.lang.String str) {
        this.f488166i.mo32265x141096a9(str);
    }

    public void k() {
        if (this.f488168n) {
            this.f488168n = false;
            this.f488169o = new qf.b();
            this.f488170p = new qf.d();
            this.f488169o.a(new qf.a(this.f488163f));
        }
    }

    public void l(android.content.Context context) {
        this.f488163f.setBaseContext(context);
        pf.b bVar = this.f488166i;
        if (bVar != null) {
            bVar.mo32267xe9f5beed(context);
        }
    }
}
