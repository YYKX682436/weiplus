package u26;

/* loaded from: classes14.dex */
public final class a1 extends u26.z0 {

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f505669i;

    public a1(java.lang.Object obj, p3325xe03a0797.p3326xc267989b.q qVar, yz5.l lVar) {
        super(obj, qVar);
        this.f505669i = lVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t
    public boolean q() {
        if (!super.q()) {
            return false;
        }
        z();
        return true;
    }

    @Override // u26.w0
    public void z() {
        oz5.l lVar = ((p3325xe03a0797.p3326xc267989b.r) this.f505736h).f392110e;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.v0 a17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d0.a(this.f505669i, this.f505735g, null);
        if (a17 != null) {
            p3325xe03a0797.p3326xc267989b.u0.a(lVar, a17);
        }
    }
}
