package iq2;

/* loaded from: classes2.dex */
public final class b0 extends sp2.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f375245a;

    public b0(iq2.d0 d0Var) {
        this.f375245a = d0Var;
    }

    @Override // sp2.a4, sp2.b4
    public void a(long j17) {
    }

    @Override // sp2.a4, sp2.b4
    public boolean b(int i17) {
        iq2.d0 d0Var = this.f375245a;
        gp2.l0 l0Var = d0Var.E;
        boolean z17 = false;
        if (l0Var != null && l0Var.K(i17, true)) {
            z17 = true;
        }
        gp2.l0 l0Var2 = d0Var.E;
        if (l0Var2 != null) {
            l0Var2.I(z17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d0Var.f375254e, "startAutoPlay: playOrder=" + i17 + ", isEnableAutoPlay=" + z17);
        return z17;
    }

    @Override // sp2.a4, sp2.b4
    public boolean c(so2.j5 whichContainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(whichContainer, "whichContainer");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(whichContainer, this.f375245a.f375252c.f382636i);
    }

    @Override // sp2.a4, sp2.b4
    public void d(int i17, long j17) {
    }

    @Override // sp2.a4, sp2.b4
    public void e(int i17, java.util.List cards) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cards, "cards");
    }

    @Override // sp2.a4, sp2.b4
    public void f() {
        iq2.d0 d0Var = this.f375245a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d0Var.f375254e, "stopAutoPlay by caller.");
        gp2.l0 l0Var = d0Var.E;
        if (l0Var == null) {
            return;
        }
        l0Var.I(false);
    }

    @Override // sp2.b4
    public void g() {
        gp2.l0 l0Var = this.f375245a.E;
        if (l0Var != null) {
            l0Var.j();
        }
    }
}
