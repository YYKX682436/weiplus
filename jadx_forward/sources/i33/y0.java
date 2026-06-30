package i33;

/* loaded from: classes10.dex */
public final class y0 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f369823f;

    /* renamed from: g, reason: collision with root package name */
    public j33.x f369824g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f369825h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f369826i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369823f = "MicroMsg.AlbumScrollPerformanceUIC";
        this.f369825h = jz5.h.b(new i33.x0(activity));
        this.f369826i = jz5.h.b(new i33.u0(this));
    }

    @Override // i33.c
    public void V6(com.p314xaae8f345.mm.ui.q2 oldMode, com.p314xaae8f345.mm.ui.q2 newMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldMode, "oldMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        super.V6(oldMode, newMode);
        if (oldMode == newMode || newMode != com.p314xaae8f345.mm.ui.q2.NORMAL) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f369823f, "onSelectModeChanged: to Normal");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = T6().mo7946xf939df19();
        e33.b0 b0Var = mo7946xf939df19 instanceof e33.b0 ? (e33.b0) mo7946xf939df19 : null;
        if (b0Var != null) {
            b0Var.f328679y = true;
        }
        W6();
        X6(0L);
    }

    public final void W6() {
        t23.p0.h().c();
        t23.p0.h().b();
        j33.x xVar = this.f369824g;
        if (xVar != null) {
            xVar.f379004h = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f379003g, "stop: ");
        }
        T6().removeCallbacks(this.f369824g);
        this.f369824g = null;
    }

    public final void X6(long j17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = T6().mo7946xf939df19();
        e33.b0 b0Var = mo7946xf939df19 instanceof e33.b0 ? (e33.b0) mo7946xf939df19 : null;
        if (b0Var == null || !b0Var.f328679y) {
            return;
        }
        b0Var.f328679y = false;
        W6();
        this.f369824g = new j33.x(U6(), T6(), ((java.lang.Number) ((jz5.n) this.f369826i).mo141623x754a37bb()).intValue());
        T6().postDelayed(this.f369824g, j17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f435481a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            z0Var.X6(this, 2);
        }
        T6().i(new i33.w0(this));
        T6().m7971xa810ec34(new in5.a(((java.lang.Number) ((jz5.n) this.f369826i).mo141623x754a37bb()).intValue()));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d U6 = U6();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22845x59c2505a c22845x59c2505a = U6 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22845x59c2505a ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22845x59c2505a) U6 : null;
        if (c22845x59c2505a != null) {
            c22845x59c2505a.D = new i33.v0(this);
        }
    }
}
