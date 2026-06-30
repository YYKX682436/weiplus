package lh;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f400163e = true;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f400164f = jz5.h.b(lh.m.f400152d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f400165g = jz5.h.b(lh.n.f400153d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f400166h = jz5.h.b(lh.o.f400154d);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f400167a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f400168b;

    /* renamed from: c, reason: collision with root package name */
    public rh.c1 f400169c;

    /* renamed from: d, reason: collision with root package name */
    public int f400170d;

    public t(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f400167a = name;
        this.f400168b = jz5.h.b(lh.s.f400162d);
    }

    public final void a() {
        synchronized (((java.util.List) ((jz5.n) this.f400168b).mo141623x754a37bb())) {
            this.f400170d = 0;
            rh.c1 c1Var = this.f400169c;
            if (c1Var != null) {
                c1Var.l();
            }
            this.f400169c = null;
            ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.battery.CpuAlertInspector");
            kz5.h0.B((java.util.List) ((jz5.n) this.f400168b).mo141623x754a37bb(), lh.r.f400161d);
        }
    }

    public final java.util.List b() {
        float o17 = wh.m.o();
        java.util.List k17 = kz5.c0.k(new lh.q(this, 10, 10.0f * o17), new lh.q(this, 20, 7.5f * o17), new lh.q(this, 60, 2.5f * o17), new lh.q(this, 120, o17 * 1.25f));
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            ((ku5.t0) ku5.t0.f394148d).l((lh.q) it.next(), r2.f400158e * 60000, "MicroMsg.battery.CpuAlertInspector");
        }
        return k17;
    }

    public final void c(int i17) {
        gi.w0 w0Var = null;
        if (mm.k.j(mm.k.f410036n, null, 1, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.battery.CpuAlertInspector", "#start " + this.f400167a + ": loop=" + i17);
            ph.u e17 = gi.d.e();
            if (e17 != null) {
                w0Var = new gi.w0(e17.f435829h, "biz");
                w0Var.f476860i.putString("extra_module_name", this.f400167a);
                w0Var.f476860i.putLong("extra_report_during", 300000L);
                w0Var.F(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.class);
            }
            if (w0Var != null) {
                w0Var.I();
                synchronized (((java.util.List) ((jz5.n) this.f400168b).mo141623x754a37bb())) {
                    a();
                    this.f400170d = i17;
                    this.f400169c = w0Var;
                    ((java.util.List) ((jz5.n) this.f400168b).mo141623x754a37bb()).addAll(b());
                }
            }
        }
    }
}
