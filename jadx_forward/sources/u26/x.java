package u26;

/* loaded from: classes14.dex */
public abstract class x extends p3325xe03a0797.p3326xc267989b.a implements u26.w {

    /* renamed from: f, reason: collision with root package name */
    public final u26.w f505734f;

    public x(oz5.l lVar, u26.w wVar, boolean z17, boolean z18) {
        super(lVar, z17, z18);
        this.f505734f = wVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.c3
    public void B(java.lang.Throwable th6) {
        java.util.concurrent.CancellationException cancellationException = th6 instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th6 : null;
        if (cancellationException == null) {
            cancellationException = new p3325xe03a0797.p3326xc267989b.s2(E(), th6, this);
        }
        this.f505734f.b(cancellationException);
        y(cancellationException);
    }

    @Override // p3325xe03a0797.p3326xc267989b.c3, p3325xe03a0797.p3326xc267989b.r2
    public final void b(java.util.concurrent.CancellationException cancellationException) {
        if (mo143975x62a56b47()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new p3325xe03a0797.p3326xc267989b.s2(E(), null, this);
        }
        B(cancellationException);
    }

    @Override // u26.y0
    public java.lang.Object e(java.lang.Object obj) {
        return this.f505734f.e(obj);
    }

    @Override // u26.t0
    public p3325xe03a0797.p3326xc267989b.p3331x75e76af7.g g() {
        return this.f505734f.g();
    }

    @Override // u26.t0
    public java.lang.Object h() {
        return this.f505734f.h();
    }

    @Override // u26.t0
    public java.lang.Object i(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object i17 = this.f505734f.i(interfaceC29045xdcb5ca57);
        pz5.a aVar = pz5.a.f440719d;
        return i17;
    }

    @Override // u26.t0
    /* renamed from: isEmpty */
    public boolean mo167477x7aab3243() {
        return this.f505734f.mo167477x7aab3243();
    }

    @Override // u26.t0
    /* renamed from: iterator */
    public u26.y mo167478x467c086e() {
        return this.f505734f.mo167478x467c086e();
    }

    @Override // u26.y0
    public boolean j() {
        return this.f505734f.j();
    }

    @Override // u26.t0
    public boolean m() {
        return this.f505734f.m();
    }

    @Override // u26.y0
    public void n(yz5.l lVar) {
        this.f505734f.n(lVar);
    }

    @Override // u26.y0
    /* renamed from: offer */
    public boolean mo167482x64c1a5c(java.lang.Object obj) {
        return this.f505734f.mo167482x64c1a5c(obj);
    }

    @Override // u26.t0
    public java.lang.Object r(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return this.f505734f.r(interfaceC29045xdcb5ca57);
    }

    @Override // u26.y0
    public boolean s(java.lang.Throwable th6) {
        return this.f505734f.s(th6);
    }

    @Override // u26.y0
    public java.lang.Object t(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return this.f505734f.t(obj, interfaceC29045xdcb5ca57);
    }
}
