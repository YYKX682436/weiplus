package f0;

/* loaded from: classes14.dex */
public final class r1 implements b0.f3 {

    /* renamed from: t, reason: collision with root package name */
    public static final w0.x f339739t = w0.b.a(f0.l1.f339679d, f0.m1.f339687d);

    /* renamed from: a, reason: collision with root package name */
    public final f0.a1 f339740a;

    /* renamed from: d, reason: collision with root package name */
    public float f339743d;

    /* renamed from: e, reason: collision with root package name */
    public int f339744e;

    /* renamed from: l, reason: collision with root package name */
    public boolean f339751l;

    /* renamed from: m, reason: collision with root package name */
    public s1.r1 f339752m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f339756q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f339757r;

    /* renamed from: b, reason: collision with root package name */
    public final n0.v2 f339741b = n0.s4.c(f0.a.f339528a, null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    public final c0.o f339742c = new c0.p();

    /* renamed from: f, reason: collision with root package name */
    public p2.f f339745f = new p2.g(1.0f, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    public boolean f339746g = true;

    /* renamed from: h, reason: collision with root package name */
    public final b0.f3 f339747h = new b0.r(new f0.q1(this));

    /* renamed from: i, reason: collision with root package name */
    public final boolean f339748i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f339749j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final o0.i f339750k = new o0.i(new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.t[16], 0);

    /* renamed from: n, reason: collision with root package name */
    public final s1.s1 f339753n = new f0.o1(this);

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f339754o = f0.n1.f339692d;

    /* renamed from: p, reason: collision with root package name */
    public final n0.v2 f339755p = n0.s4.c(null, null, 2, null);

    /* renamed from: s, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.v f339758s = new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.v();

    public r1(int i17, int i18) {
        this.f339740a = new f0.a1(i17, i18);
    }

    public static java.lang.Object g(f0.r1 r1Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        java.lang.Object a17 = b0.e3.a(r1Var.f339747h, null, new f0.p1(r1Var, i17, i18, null), interfaceC29045xdcb5ca57, 1, null);
        return a17 == pz5.a.f440719d ? a17 : jz5.f0.f384359a;
    }

    @Override // b0.f3
    public boolean a() {
        return ((b0.r) this.f339747h).a();
    }

    @Override // b0.f3
    public float b(float f17) {
        return ((b0.r) this.f339747h).b(f17);
    }

    @Override // b0.f3
    public java.lang.Object c(a0.k2 k2Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object c17 = ((b0.r) this.f339747h).c(k2Var, pVar, interfaceC29045xdcb5ca57);
        return c17 == pz5.a.f440719d ? c17 : jz5.f0.f384359a;
    }

    public final int d() {
        return ((java.lang.Number) ((n0.q4) this.f339740a.f339534c).mo128745x754a37bb()).intValue();
    }

    public final int e() {
        return ((java.lang.Number) ((n0.q4) this.f339740a.f339535d).mo128745x754a37bb()).intValue();
    }

    public final f0.l0 f() {
        return (f0.l0) ((n0.q4) this.f339741b).mo128745x754a37bb();
    }

    public final void h(int i17, int i18) {
        f0.a1 a1Var = this.f339740a;
        a1Var.a(i17, i18);
        a1Var.f339537f = null;
        f0.o oVar = (f0.o) ((n0.q4) this.f339755p).mo128745x754a37bb();
        if (oVar != null) {
            ((java.util.LinkedHashMap) oVar.f339698d).clear();
            oVar.f339699e = kz5.q0.f395534d;
            oVar.f339700f = -1;
            oVar.f339701g = 0;
            oVar.f339702h = -1;
            oVar.f339703i = 0;
        }
        s1.r1 r1Var = this.f339752m;
        if (r1Var != null) {
            ((u1.w) r1Var).h();
        }
    }

    public final void i(f0.q itemProvider) {
        java.lang.Integer num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemProvider, "itemProvider");
        f0.a1 a1Var = this.f339740a;
        a1Var.getClass();
        java.lang.Object obj = a1Var.f339537f;
        int i17 = a1Var.f339532a;
        if (obj != null) {
            f0.s sVar = (f0.s) itemProvider;
            if ((i17 >= sVar.e() || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, sVar.c(i17))) && (num = (java.lang.Integer) sVar.b().get(obj)) != null) {
                i17 = num.intValue();
            }
        }
        a1Var.a(i17, a1Var.f339533b);
    }
}
