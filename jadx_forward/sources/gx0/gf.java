package gx0;

/* loaded from: classes5.dex */
public final class gf extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f358004d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f358005e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f358006f;

    /* renamed from: g, reason: collision with root package name */
    public wu5.c f358007g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f358008h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358004d = true;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44);
        this.f358005e = j0Var;
        this.f358006f = j0Var;
        this.f358008h = jz5.h.b(new gx0.ef(activity));
    }

    public final void O6() {
        if (!this.f358004d && this.f358007g == null) {
            this.f358007g = ((ku5.t0) ku5.t0.f394148d).e(new gx0.ff(this), 0L, 16L);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        boolean z17 = this.f358004d;
        jz5.g gVar = this.f358008h;
        if (z17) {
            ((gx0.bf) ((jz5.n) gVar).mo141623x754a37bb()).A.mo7806x9d92d11c(m158354x19263085(), new gx0.cf(this));
        } else {
            ((gx0.bf) ((jz5.n) gVar).mo141623x754a37bb()).f357788v.mo7806x9d92d11c(m158354x19263085(), new gx0.df(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        gx0.fd fdVar = (gx0.fd) ((gx0.bf) ((jz5.n) this.f358008h).mo141623x754a37bb()).f357788v.mo3195x754a37bb();
        int ordinal = fdVar != null ? fdVar.ordinal() : 0;
        gx0.ed edVar = gx0.fd.f357961d;
        if (ordinal >= 2) {
            O6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        wu5.c cVar;
        if (!this.f358004d && (cVar = this.f358007g) != null) {
            try {
                cVar.cancel(true);
            } catch (java.lang.Exception unused) {
            }
            this.f358007g = null;
        }
        super.mo2287xc39f8281();
    }
}
