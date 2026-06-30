package k0;

/* loaded from: classes14.dex */
public final class f0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.e f384436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f384437e;

    public f0(z.e eVar, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        this.f384436d = eVar;
        this.f384437e = y0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object f17;
        long j17 = ((d1.e) obj).f307160a;
        z.e eVar = this.f384436d;
        boolean c17 = d1.f.c(((d1.e) eVar.d()).f307160a);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (c17 && d1.f.c(j17)) {
            if (!(d1.e.d(((d1.e) eVar.d()).f307160a) == d1.e.d(j17))) {
                f17 = p3325xe03a0797.p3326xc267989b.l.d(this.f384437e, null, null, new k0.e0(eVar, j17, null), 3, null);
                if (f17 != pz5.a.f440719d) {
                    return f0Var;
                }
                return f17;
            }
        }
        f17 = eVar.f(new d1.e(j17), interfaceC29045xdcb5ca57);
        if (f17 != pz5.a.f440719d) {
            return f0Var;
        }
        return f17;
    }
}
