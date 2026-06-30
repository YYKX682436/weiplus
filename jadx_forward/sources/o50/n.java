package o50;

/* loaded from: classes.dex */
public final class n extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f424608d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f424609e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f424610f;

    /* renamed from: g, reason: collision with root package name */
    public final int f424611g;

    /* renamed from: h, reason: collision with root package name */
    public final int f424612h;

    /* renamed from: i, reason: collision with root package name */
    public final int f424613i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f424614m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f424615n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("ForwardParams_ReportSessionId");
        stringExtra = stringExtra == null ? java.lang.String.valueOf(hashCode()) : stringExtra;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        this.f424609e = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("ForwardParams_ReportForwardObjList");
        this.f424610f = stringExtra2 == null ? "" : stringExtra2;
        this.f424611g = m158359x1e885992().getIntExtra("ForwardParams_ReportConfirmScreenFrom", 0);
        this.f424612h = m158359x1e885992().getIntExtra("ForwardParams_ReportFromScene", 0);
        this.f424613i = m158359x1e885992().getIntExtra("ForwardParams_ForwardMsgType", 0);
        java.lang.String stringExtra3 = m158359x1e885992().getStringExtra("Select_Conv_User");
        this.f424614m = r26.n0.f0(stringExtra3 == null ? "" : stringExtra3, new java.lang.String[]{","}, false, 0, 6, null);
        this.f424615n = jz5.h.b(new o50.m(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        this.f424608d = 4;
        return super.mo2274xbdc3c5dc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo10662xe0085496() {
        this.f424608d = 3;
        return super.mo10662xe0085496();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e eVar = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a;
        java.lang.String forwardObjList = this.f424610f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forwardObjList, "forwardObjList");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424609e, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b)) {
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(gm0.j1.b().j()) + c01.id.c();
        }
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290830d = this.f424611g;
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290831e = forwardObjList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null) {
            m67437x4bd5310.L2(m158354x19263085(), new o50.k(this));
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(m158354x19263085());
        ((cy1.a) ((cy1.a) aVar.ak(m158354x19263085(), iy1.c.ForwardConfirmHalfScreen)).ik(m158354x19263085(), 12, 32337)).Ai(m158354x19263085(), new o50.l(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }
}
