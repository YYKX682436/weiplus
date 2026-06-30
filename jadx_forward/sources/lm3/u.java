package lm3;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f401044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm3.e f401045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 f401046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f401047g;

    public u(lm3.b0 b0Var, lm3.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var, in5.s0 s0Var) {
        this.f401044d = b0Var;
        this.f401045e = eVar;
        this.f401046f = n0Var;
        this.f401047g = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lm3.b0 b0Var = this.f401044d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = b0Var.f401003e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1 e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1.class);
        lm3.e eVar = this.f401045e;
        fm3.u uVar = eVar.f401015d;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var = this.f401046f;
        e1Var.Q6(uVar, n0Var.f232850s, new lm3.t(eVar, b0Var, this.f401047g));
        n0Var.f232849r = false;
    }
}
