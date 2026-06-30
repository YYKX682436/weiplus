package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes14.dex */
public final class e extends v26.g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f391767i = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3328x30012e.e.class, "consumed");

    /* renamed from: consumed */
    private volatile /* synthetic */ int f72702xde2883e8;

    /* renamed from: g, reason: collision with root package name */
    public final u26.t0 f391768g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f391769h;

    public /* synthetic */ e(u26.t0 t0Var, boolean z17, oz5.l lVar, int i17, u26.u uVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(t0Var, z17, (i18 & 4) != 0 ? oz5.m.f431862d : lVar, (i18 & 8) != 0 ? -3 : i17, (i18 & 16) != 0 ? u26.u.SUSPEND : uVar);
    }

    @Override // v26.g, p3325xe03a0797.p3326xc267989b.p3328x30012e.j
    public java.lang.Object a(p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int i17 = this.f514536e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 != -3) {
            java.lang.Object a17 = super.a(kVar, interfaceC29045xdcb5ca57);
            return a17 == pz5.a.f440719d ? a17 : f0Var;
        }
        j();
        java.lang.Object a18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.t.a(kVar, this.f391768g, this.f391769h, interfaceC29045xdcb5ca57);
        return a18 == pz5.a.f440719d ? a18 : f0Var;
    }

    @Override // v26.g
    public java.lang.String c() {
        return "channel=" + this.f391768g;
    }

    @Override // v26.g
    public java.lang.Object f(u26.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.t.a(new v26.q0(r0Var), this.f391768g, this.f391769h, interfaceC29045xdcb5ca57);
        return a17 == pz5.a.f440719d ? a17 : jz5.f0.f384359a;
    }

    @Override // v26.g
    public v26.g g(oz5.l lVar, int i17, u26.u uVar) {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.e(this.f391768g, this.f391769h, lVar, i17, uVar);
    }

    @Override // v26.g
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j h() {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.e(this.f391768g, this.f391769h, null, 0, null, 28, null);
    }

    @Override // v26.g
    public u26.t0 i(p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        j();
        return this.f514536e == -3 ? this.f391768g : super.i(y0Var);
    }

    public final void j() {
        if (this.f391769h) {
            if (!(f391767i.getAndSet(this, 1) == 0)) {
                throw new java.lang.IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    public e(u26.t0 t0Var, boolean z17, oz5.l lVar, int i17, u26.u uVar) {
        super(lVar, i17, uVar);
        this.f391768g = t0Var;
        this.f391769h = z17;
        this.f72702xde2883e8 = 0;
    }
}
