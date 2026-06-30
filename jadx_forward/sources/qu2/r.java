package qu2;

/* loaded from: classes5.dex */
public final class r implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f448345a;

    /* renamed from: b, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f448346b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f448347c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f448348d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f448349e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f448350f;

    public r(ts5.a collectWhat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectWhat, "collectWhat");
        this.f448345a = collectWhat;
        this.f448347c = new java.util.ArrayList();
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f448346b;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f448346b = null;
        if (this.f448349e && !this.f448350f) {
            this.f448349e = false;
            this.f448350f = true;
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), lu5.a.f402990f, null, new qu2.q(this, map, null), 2, null);
        }
    }

    @Override // ts5.d
    /* renamed from: cancel */
    public void mo149995xae7a2e7a() {
        this.f448350f = true;
        this.f448349e = false;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f448346b;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f448346b = null;
    }

    @Override // ts5.d
    /* renamed from: start */
    public void mo149996x68ac462() {
        if (this.f448349e) {
            return;
        }
        this.f448349e = true;
        this.f448350f = false;
        this.f448346b = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), lu5.a.f402990f, null, new qu2.p(this, null), 2, null);
    }
}
