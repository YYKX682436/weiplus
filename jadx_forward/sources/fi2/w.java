package fi2;

/* loaded from: classes10.dex */
public final class w implements ah2.f {

    /* renamed from: a, reason: collision with root package name */
    public final zi2.w f344448a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f344449b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f344450c;

    /* renamed from: d, reason: collision with root package name */
    public final ah2.a f344451d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f344452e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f344453f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f344454g;

    public w(zi2.w plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f344448a = plugin;
        this.f344449b = jz5.h.b(new fi2.r(this));
        this.f344450c = jz5.h.b(new fi2.u(this));
        this.f344451d = new fi2.q(this);
        this.f344452e = jz5.h.b(new fi2.p(this));
        this.f344453f = jz5.h.b(new fi2.t(this));
    }

    @Override // ah2.f
    public p3325xe03a0797.p3326xc267989b.y0 a() {
        p3325xe03a0797.p3326xc267989b.y0 a17 = this.f344448a.a();
        return a17 == null ? p3325xe03a0797.p3326xc267989b.z0.b() : a17;
    }

    @Override // ah2.f
    public void b(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f344448a.w1().b(callback);
    }

    @Override // ah2.f
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j c() {
        return ((om2.g) this.f344448a.S0().a(om2.g.class)).f427838i;
    }

    @Override // ah2.f
    public void d(boolean z17) {
        if (zl2.r4.f555483a.x1()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", z17 ? 2 : 1);
            jSONObject.put("pos", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.V1, jSONObject.toString(), null, 4, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f408783n2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", z17 ? 2 : 1);
        jSONObject2.put("pos", 1);
        ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // ah2.f
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j e() {
        return ((om2.g) this.f344448a.S0().a(om2.g.class)).f427836g;
    }

    @Override // ah2.f
    public mh2.n0 f() {
        return (mh2.n0) ((jz5.n) this.f344449b).mo141623x754a37bb();
    }

    @Override // ah2.f
    public void g() {
        this.f344448a.u1();
    }

    @Override // ah2.f
    public boolean h() {
        return false;
    }

    @Override // ah2.f
    public void i() {
        sf2.d3 d3Var = (sf2.d3) this.f344448a.U0(sf2.d3.class);
        if (d3Var != null) {
            d3Var.v7(fn2.u1.f345948m, 5);
        }
    }

    @Override // ah2.f
    public void j(fn2.u1 sourceScene, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
        sf2.d3 d3Var = (sf2.d3) this.f344448a.U0(sf2.d3.class);
        if (d3Var != null) {
            d3Var.w7(-1, sourceScene, fn2.v1.f345956f, str);
        }
    }

    @Override // ah2.f
    public boolean k() {
        zi2.w wVar = this.f344448a;
        tn0.w0 Z0 = wVar.Z0();
        if (Z0 != null) {
            return Z0.D.g(java.lang.Long.valueOf(((mm2.e1) wVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        }
        return false;
    }

    @Override // ah2.f
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j l() {
        return ((om2.g) this.f344448a.S0().a(om2.g.class)).D;
    }

    public final mh2.k0 m() {
        return (mh2.k0) ((jz5.n) this.f344450c).mo141623x754a37bb();
    }

    public final void n(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("not_song_cnt", ((java.lang.Number) ((jz5.l) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.g) this.f344448a.S0().a(om2.g.class)).F).mo144003x754a37bb()).f384367e).intValue());
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f555483a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409906q2, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.T2, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }

    public final void o() {
        pm0.v.X(new fi2.v(((java.lang.Number) ((jz5.l) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.g) this.f344448a.S0().a(om2.g.class)).F).mo144003x754a37bb()).f384367e).intValue(), (android.widget.TextView) ((fg2.n0) ((jz5.n) this.f344453f).mo141623x754a37bb()).f343693a.findViewById(com.p314xaae8f345.mm.R.id.ve6), this));
    }
}
