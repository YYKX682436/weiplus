package ph2;

/* loaded from: classes10.dex */
public final class b implements ph2.e {

    /* renamed from: d, reason: collision with root package name */
    public ph2.d f435908d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f435909e;

    /* renamed from: f, reason: collision with root package name */
    public ah2.f f435910f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f435911g;

    public b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CoroutineScopeDrawerLoop", "create hashCode: " + hashCode());
    }

    @Override // ph2.e
    public void a() {
        this.f435909e = false;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f435911g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // ph2.e
    public void b(ph2.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f435908d = callback;
    }

    @Override // ph2.e
    public void c() {
        p3325xe03a0797.p3326xc267989b.y0 a17;
        this.f435909e = true;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f435911g;
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = null;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        ah2.f fVar = this.f435910f;
        if (fVar != null && (a17 = fVar.a()) != null) {
            r2Var2 = p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new ph2.a(this, null), 3, null);
        }
        this.f435911g = r2Var2;
    }

    @Override // ph2.e
    public void d(ah2.f fVar) {
        this.f435910f = fVar;
    }
}
