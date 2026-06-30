package vd2;

/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: l, reason: collision with root package name */
    public static r45.o72 f517174l;

    /* renamed from: a, reason: collision with root package name */
    public vd2.t1 f517176a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.w0 f517177b;

    /* renamed from: c, reason: collision with root package name */
    public int f517178c;

    /* renamed from: d, reason: collision with root package name */
    public int f517179d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f517180e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d f517181f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec f517182g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec f517183h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f517171i = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85394r2).mo141623x754a37bb()).r()).intValue();

    /* renamed from: j, reason: collision with root package name */
    public static long f517172j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static long f517173k = -1;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.Long f517175m = 0L;

    public a2(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f517177b = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.w0(0L, 1, null);
        this.f517178c = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec c14166x338f3aec = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec();
        c14166x338f3aec.f193013p = context;
        c14166x338f3aec.f193259d = new vd2.v1(this, c14166x338f3aec);
        this.f517182g = c14166x338f3aec;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec c14166x338f3aec2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec();
        c14166x338f3aec2.f193013p = context;
        c14166x338f3aec2.f193259d = new vd2.z1(this, c14166x338f3aec2);
        this.f517183h = c14166x338f3aec2;
    }

    public static final void a(vd2.a2 a2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d abstractC14248xc3d8f89d) {
        boolean z17 = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractC14248xc3d8f89d, a2Var.f517182g) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractC14248xc3d8f89d, a2Var.f517183h)) ? false : true;
        if (abstractC14248xc3d8f89d != null && abstractC14248xc3d8f89d.f193264i) {
            abstractC14248xc3d8f89d.f193264i = false;
            ik1.h0.b(new vd2.w1(abstractC14248xc3d8f89d, c13924x37151faa, z17, a2Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDataLoader", "loader loading is not true, isCustomLoader:" + z17);
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d b() {
        if (this.f517179d == 1) {
            return this.f517183h;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d abstractC14248xc3d8f89d = this.f517181f;
        if (abstractC14248xc3d8f89d == null || this.f517180e) {
            return this.f517182g;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC14248xc3d8f89d);
        return abstractC14248xc3d8f89d;
    }

    public final boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d abstractC14248xc3d8f89d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d b17 = b();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, this.f517181f) && (abstractC14248xc3d8f89d = this.f517181f) != null && !this.f517180e) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC14248xc3d8f89d);
            if (!abstractC14248xc3d8f89d.f193262g) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d abstractC14248xc3d8f89d2 = this.f517181f;
                boolean z17 = false;
                if (abstractC14248xc3d8f89d2 != null && abstractC14248xc3d8f89d2.c()) {
                    z17 = true;
                }
                if (z17) {
                    return this.f517182g.f193262g;
                }
            }
        }
        return b17.f193262g;
    }

    public final boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d abstractC14248xc3d8f89d = this.f517181f;
        if (abstractC14248xc3d8f89d == null) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC14248xc3d8f89d);
        if (abstractC14248xc3d8f89d.f193262g) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d abstractC14248xc3d8f89d2 = this.f517181f;
        if (!(abstractC14248xc3d8f89d2 != null && abstractC14248xc3d8f89d2.c())) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d abstractC14248xc3d8f89d3 = this.f517181f;
        java.lang.String b17 = abstractC14248xc3d8f89d3 != null ? abstractC14248xc3d8f89d3.b() : null;
        return !(b17 == null || b17.length() == 0);
    }
}
