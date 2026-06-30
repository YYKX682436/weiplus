package at2;

/* loaded from: classes3.dex */
public final class y implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ at2.b0 f95310a;

    public y(at2.b0 b0Var) {
        this.f95310a = b0Var;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        at2.b0 b0Var = this.f95310a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f95169p, "request miniWindow, onResultAllow");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        b0Var.t1();
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        at2.b0 b0Var = this.f95310a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f95169p, "request miniWindow, onResultCancel");
        ((ct2.j) b0Var.P0(ct2.j.class)).Y6(false);
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        at2.b0 b0Var = this.f95310a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f95169p, "request miniWindow, onResultRefuse");
        ((ct2.j) b0Var.P0(ct2.j.class)).Y6(false);
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
    }
}
