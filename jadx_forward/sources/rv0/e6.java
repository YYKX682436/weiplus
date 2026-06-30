package rv0;

/* loaded from: classes5.dex */
public final class e6 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481520d;

    public e6(rv0.z6 z6Var) {
        this.f481520d = z6Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb99;
        double d17;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) obj;
        rv0.z6 z6Var = this.f481520d;
        if (z6Var.t7().f357788v.mo3195x754a37bb() != gx0.fd.f357965h) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a);
        ex0.a0 v76 = z6Var.v7();
        if (v76 == null) {
            return;
        }
        ex0.r n17 = v76.n();
        ex0.c cVar = n17 instanceof ex0.c ? (ex0.c) n17 : null;
        if (cVar == null || (m34009x8082fb99 = cVar.B().m34009x8082fb99()) == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = cVar.f338700a;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
        if (c4181x2248e1a3 != null) {
            java.lang.Double valueOf = java.lang.Double.valueOf(c4181x2248e1a3.v1());
            double doubleValue = valueOf.doubleValue();
            java.lang.Double d18 = !java.lang.Double.isInfinite(doubleValue) && !java.lang.Double.isNaN(doubleValue) ? valueOf : null;
            if (d18 != null) {
                d17 = d18.doubleValue();
                z6Var.o7().m47122x26ab990b((float) (v76.s(z6Var.u7().getTimelineLayoutType()) * (c4128x879fba0a.m33988x124aa384() - m34009x8082fb99.m33988x124aa384()) * d17));
            }
        }
        d17 = 1.0d;
        z6Var.o7().m47122x26ab990b((float) (v76.s(z6Var.u7().getTimelineLayoutType()) * (c4128x879fba0a.m33988x124aa384() - m34009x8082fb99.m33988x124aa384()) * d17));
    }
}
