package qu2;

/* loaded from: classes12.dex */
public final class f implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f448299a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f448300b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f448301c;

    /* renamed from: d, reason: collision with root package name */
    public nh.c f448302d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f448303e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f448304f;

    /* renamed from: g, reason: collision with root package name */
    public final us5.b f448305g;

    /* renamed from: h, reason: collision with root package name */
    public final us5.b f448306h;

    /* renamed from: i, reason: collision with root package name */
    public final us5.b f448307i;

    /* renamed from: j, reason: collision with root package name */
    public final us5.a f448308j;

    /* renamed from: k, reason: collision with root package name */
    public final us5.a f448309k;

    /* renamed from: l, reason: collision with root package name */
    public final us5.a f448310l;

    /* renamed from: m, reason: collision with root package name */
    public final us5.a f448311m;

    /* renamed from: n, reason: collision with root package name */
    public long f448312n;

    /* renamed from: o, reason: collision with root package name */
    public final int f448313o;

    public f(ts5.a collectWhat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectWhat, "collectWhat");
        this.f448299a = collectWhat;
        this.f448305g = new us5.b("charging_rate");
        this.f448306h = new us5.b("c_un_charging_rate");
        this.f448307i = new us5.b("c_wifi");
        this.f448308j = new us5.a("cpu");
        this.f448309k = new us5.a("total");
        this.f448310l = new us5.a("system");
        this.f448311m = new us5.a("idle");
        this.f448313o = 30;
    }

    public static final void c(qu2.f fVar, rh.c1 c1Var, rh.o2 o2Var) {
        fVar.getClass();
        java.lang.Number number = ((uh.g) o2Var.f477019c).f509216g.f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
        fVar.f448308j.a(number.doubleValue());
        uh.g gVar = (uh.g) o2Var.f477019c;
        fVar.f448309k.a(gVar.d());
        java.lang.Number number2 = gVar.f509242t.f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
        fVar.f448311m.a(number2.doubleValue());
        java.lang.Number number3 = gVar.f509240s.f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number3, "get(...)");
        fVar.f448310l.a(number3.doubleValue());
        fVar.f448305g.a(c1Var.f476863l != null ? r0.f444845e : 0);
        fVar.f448306h.a(c1Var.f476863l != null ? r6.f444846f : 0);
        java.lang.Number number4 = gVar.f509222j.f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number4, "get(...)");
        fVar.f448307i.a(number4.doubleValue());
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopAndReport, profiler");
        nh.c cVar = this.f448302d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f418602b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AvgPowerConsumeCollector", sb6.toString());
        if (this.f448300b && !this.f448301c) {
            this.f448301c = true;
            this.f448300b = false;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f448304f;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f448303e;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new qu2.e(this, map, null), 3, null);
            }
        }
    }

    @Override // ts5.d
    /* renamed from: cancel */
    public void mo149995xae7a2e7a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel, profiler");
        nh.c cVar = this.f448302d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f418602b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AvgPowerConsumeCollector", sb6.toString());
        this.f448301c = true;
        this.f448300b = false;
        nh.c cVar2 = this.f448302d;
        if (cVar2 != null) {
            cVar2.c();
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f448303e;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
    }

    @Override // ts5.d
    /* renamed from: start */
    public void mo149996x68ac462() {
        if (this.f448300b) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start, profiler");
        nh.c cVar = this.f448302d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f418602b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AvgPowerConsumeCollector", sb6.toString());
        us5.a aVar = this.f448308j;
        aVar.f512108b = 0;
        aVar.f512109c = 0.0d;
        us5.b bVar = this.f448305g;
        bVar.f512111b = 0;
        bVar.f512112c = 0.0d;
        us5.b bVar2 = this.f448306h;
        bVar2.f512111b = 0;
        bVar2.f512112c = 0.0d;
        us5.b bVar3 = this.f448307i;
        bVar3.f512111b = 0;
        bVar3.f512112c = 0.0d;
        us5.a aVar2 = this.f448309k;
        aVar2.f512108b = 0;
        aVar2.f512109c = 0.0d;
        us5.a aVar3 = this.f448310l;
        aVar3.f512108b = 0;
        aVar3.f512109c = 0.0d;
        us5.a aVar4 = this.f448311m;
        aVar4.f512108b = 0;
        aVar4.f512109c = 0.0d;
        this.f448312n = java.lang.System.currentTimeMillis();
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f448303e;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
        p3325xe03a0797.p3326xc267989b.y0 a18 = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p0Var));
        this.f448303e = a18;
        this.f448300b = true;
        this.f448301c = false;
        this.f448304f = p3325xe03a0797.p3326xc267989b.l.d(a18, p0Var, null, new qu2.c(this, null), 2, null);
    }
}
