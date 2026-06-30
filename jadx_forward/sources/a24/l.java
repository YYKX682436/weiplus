package a24;

/* loaded from: classes.dex */
public abstract class l extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f82423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public abstract in5.s T6();

    public final void U6(ym3.a dataSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.lqa);
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d(null);
        }
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(null);
        }
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(m158354x19263085()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe(dataSource, new xm3.n0(), m158354x19263085(), null, null, 24, null);
        if (c22849x81a93d25 != null) {
            c24.g gVar = new c24.g(c16718x7059cefe, T6(), true);
            gVar.F = new a24.j(this);
            c22849x81a93d25.mo7960x6cab2c8d(gVar);
        }
        this.f82423d = c16718x7059cefe;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new a24.k(this));
    }
}
