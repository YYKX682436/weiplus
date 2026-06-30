package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes14.dex */
public final class l2 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.f3, p3325xe03a0797.p3326xc267989b.p3328x30012e.j, v26.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f391849d;

    public l2(p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var, p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        this.f391849d = f3Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.j
    public java.lang.Object a(p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return this.f391849d.a(kVar, interfaceC29045xdcb5ca57);
    }

    @Override // v26.h0
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j b(oz5.l lVar, int i17, u26.u uVar) {
        return ((((i17 >= 0 && i17 < 2) || i17 == -2) && uVar == u26.u.DROP_OLDEST) || ((i17 == 0 || i17 == -3) && uVar == u26.u.SUSPEND)) ? this : new v26.o(this, lVar, i17, uVar);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.f3
    /* renamed from: getValue */
    public java.lang.Object mo144003x754a37bb() {
        return this.f391849d.mo144003x754a37bb();
    }
}
