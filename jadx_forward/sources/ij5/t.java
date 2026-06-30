package ij5;

/* loaded from: classes.dex */
public final class t extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f373332d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f373333e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f373334f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f373335g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f373336h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f373337i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f373338m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f373339n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f373340o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f373332d = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(1, 2);
        this.f373333e = jz5.h.b(new ij5.i(this));
        this.f373334f = jz5.h.b(new ij5.p(activity));
        this.f373335g = jz5.h.b(new ij5.r(this));
        this.f373336h = jz5.h.b(new ij5.q(this));
        this.f373337i = jz5.h.b(new ij5.h(this));
        this.f373338m = jz5.h.b(new ij5.g(this));
        this.f373339n = jz5.h.b(new ij5.s(this));
        this.f373340o = jz5.h.b(new ij5.j(activity, this));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (qi5.b0) ((jz5.n) this.f373340o).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        S6(new ij5.k(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.L2(m158354x19263085(), new ij5.n(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.z3(m158354x19263085(), new ij5.o(this));
    }
}
