package pe2;

/* loaded from: classes3.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f435163p;

    /* renamed from: q, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f435164q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        K0(8);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.btu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById;
        this.f435163p = c22789xd23e9a9b;
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.X1));
        c22789xd23e9a9b.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        ((mm2.l0) P0(mm2.l0.class)).f410749r = false;
        t1(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void n1() {
        mm2.l0 l0Var = (mm2.l0) P0(mm2.l0.class);
        l0Var.f410744m.mo7806x9d92d11c(this, new pe2.c(this));
        ((mm2.w) P0(mm2.w.class)).f411036o.mo7806x9d92d11c(this, new pe2.e(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCheerAnimationPlugin", "hideCheerAnimation: " + w0());
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f435163p;
        if (z17) {
            if (c22789xd23e9a9b.getVisibility() == 0) {
                this.f446856d.animate().alpha(0.0f).setDuration(1000L).setListener(new pe2.b(this)).start();
            } else {
                c22789xd23e9a9b.n();
            }
            mm2.l0 l0Var = (mm2.l0) P0(mm2.l0.class);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCheerAnimationSlice", "notifyCheerBtnAnimationShow");
            l0Var.f410745n.mo7808x76db6cb1(l0Var.f410743i.mo3195x754a37bb());
        } else {
            c22789xd23e9a9b.setVisibility(8);
            c22789xd23e9a9b.n();
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f435164q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        ((mm2.l0) P0(mm2.l0.class)).f410749r = true;
    }
}
