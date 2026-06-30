package k50;

/* loaded from: classes.dex */
public final class z extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f385809d;

    /* renamed from: e, reason: collision with root package name */
    public long f385810e;

    /* renamed from: f, reason: collision with root package name */
    public long f385811f;

    /* renamed from: g, reason: collision with root package name */
    public int f385812g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f385809d = jz5.h.b(new k50.y(this));
        this.f385812g = 3;
    }

    public final long T6() {
        return ((java.lang.Number) ((jz5.n) this.f385809d).mo141623x754a37bb()).longValue();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        this.f385812g = 2;
        return super.mo2274xbdc3c5dc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.s();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null) {
            m67437x4bd5310.L2(m158354x19263085(), new k50.w(this));
        }
        this.f385810e = c01.id.c() - T6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(m158354x19263085());
        ((cy1.a) ((cy1.a) aVar.ak(m158354x19263085(), iy1.c.ForwardingListUI)).ik(m158354x19263085(), 12, 32337)).Ai(m158354x19263085(), new k50.x(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        this.f385811f = c01.id.c() - T6();
    }
}
