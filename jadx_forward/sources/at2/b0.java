package at2;

/* loaded from: classes3.dex */
public final class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f95169p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f95170q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f95171r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f95169p = "ReplayMiniViewPlugin";
        root.setOnClickListener(new at2.w(this));
        zl2.r4.f555483a.d(this);
        this.f95170q = jz5.h.b(new at2.z(this));
        this.f95171r = jz5.h.b(new at2.a0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void L0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f95169p, "start");
        R0().removeCallbacks((at2.x) ((jz5.n) this.f95171r).mo141623x754a37bb());
    }

    @Override // qo0.a
    public void N0() {
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f95169p, "stop, permission:" + Ui + ", manualMinimum:" + ((ct2.j) S0().a(ct2.j.class)).f303812w);
        if (Ui || !((ct2.j) S0().a(ct2.j.class)).f303812w) {
            return;
        }
        R0().postDelayed((at2.x) ((jz5.n) this.f95171r).mo141623x754a37bb(), 20000L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        dt2.d0 uiClickListener;
        ((ct2.j) S0().a(ct2.j.class)).Y6(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R0 = R0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb6 = R0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6) R0 : null;
        if (c14929x59565fb6 == null || (uiClickListener = c14929x59565fb6.getUiClickListener()) == null) {
            return;
        }
        uiClickListener.b();
    }
}
