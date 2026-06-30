package lf2;

/* loaded from: classes10.dex */
public final class e implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf2.s f399815d;

    public e(lf2.s sVar) {
        this.f399815d = sVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int intValue = ((java.lang.Number) obj).intValue();
        lf2.s sVar = this.f399815d;
        boolean S6 = ((om2.g) sVar.H.a(om2.g.class)).S6();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!S6) {
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new lf2.d(sVar, intValue, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : f0Var;
    }
}
