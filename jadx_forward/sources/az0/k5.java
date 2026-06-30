package az0;

/* loaded from: classes5.dex */
public final class k5 implements pp0.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 f97160a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f97161b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f97162c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f97163d;

    public k5(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 materialManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialManager, "materialManager");
        this.f97160a = materialManager;
        this.f97161b = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public void a() {
        if (b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MaasMaterialManager", "cancelAll when call is release");
        } else {
            this.f97160a.b();
        }
    }

    public final boolean b() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f97163d;
        if (!(r2Var != null && r2Var.a()) && !this.f97162c) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MaasMaterialManager", "loadMaterialPack when call is release");
        return true;
    }

    public void c() {
        this.f97163d = p3325xe03a0797.p3326xc267989b.l.d(this.f97161b, null, null, new az0.j5(this, null), 3, null);
    }
}
