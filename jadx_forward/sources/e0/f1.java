package e0;

/* loaded from: classes14.dex */
public final class f1 implements b0.f3 {

    /* renamed from: q, reason: collision with root package name */
    public static final w0.x f327107q = w0.b.a(e0.a1.f327027d, e0.b1.f327045d);

    /* renamed from: a, reason: collision with root package name */
    public final e0.z0 f327108a;

    /* renamed from: d, reason: collision with root package name */
    public float f327111d;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.t f327115h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f327116i;

    /* renamed from: j, reason: collision with root package name */
    public s1.r1 f327117j;

    /* renamed from: n, reason: collision with root package name */
    public boolean f327121n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f327122o;

    /* renamed from: b, reason: collision with root package name */
    public final n0.v2 f327109b = n0.s4.c(e0.a.f327022a, null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    public final c0.o f327110c = new c0.p();

    /* renamed from: e, reason: collision with root package name */
    public final b0.f3 f327112e = new b0.r(new e0.e1(this));

    /* renamed from: f, reason: collision with root package name */
    public final boolean f327113f = true;

    /* renamed from: g, reason: collision with root package name */
    public int f327114g = -1;

    /* renamed from: k, reason: collision with root package name */
    public final s1.s1 f327118k = new e0.c1(this);

    /* renamed from: l, reason: collision with root package name */
    public final n0.v2 f327119l = n0.s4.c(null, null, 2, null);

    /* renamed from: m, reason: collision with root package name */
    public long f327120m = p2.d.b(0, 0, 0, 0, 15, null);

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.v f327123p = new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.v();

    public f1(int i17, int i18) {
        this.f327108a = new e0.z0(i17, i18);
    }

    public static java.lang.Object g(e0.f1 f1Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        java.lang.Object a17 = b0.e3.a(f1Var.f327112e, null, new e0.d1(f1Var, i17, i18, null), interfaceC29045xdcb5ca57, 1, null);
        return a17 == pz5.a.f440719d ? a17 : jz5.f0.f384359a;
    }

    @Override // b0.f3
    public boolean a() {
        return ((b0.r) this.f327112e).a();
    }

    @Override // b0.f3
    public float b(float f17) {
        return ((b0.r) this.f327112e).b(f17);
    }

    @Override // b0.f3
    public java.lang.Object c(a0.k2 k2Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object c17 = ((b0.r) this.f327112e).c(k2Var, pVar, interfaceC29045xdcb5ca57);
        return c17 == pz5.a.f440719d ? c17 : jz5.f0.f384359a;
    }

    public final int d() {
        return ((java.lang.Number) ((n0.q4) this.f327108a.f327265c).mo128745x754a37bb()).intValue();
    }

    public final int e() {
        return ((java.lang.Number) ((n0.q4) this.f327108a.f327266d).mo128745x754a37bb()).intValue();
    }

    public final e0.h0 f() {
        return (e0.h0) ((n0.q4) this.f327109b).mo128745x754a37bb();
    }

    public final void h(e0.s itemProvider) {
        java.lang.Integer num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemProvider, "itemProvider");
        e0.z0 z0Var = this.f327108a;
        z0Var.getClass();
        java.lang.Object obj = z0Var.f327268f;
        int i17 = z0Var.f327263a;
        if (obj != null) {
            e0.u uVar = (e0.u) itemProvider;
            if ((i17 >= uVar.e() || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, uVar.c(i17))) && (num = (java.lang.Integer) uVar.b().get(obj)) != null) {
                i17 = num.intValue();
            }
        }
        z0Var.a(i17, z0Var.f327264b);
    }
}
