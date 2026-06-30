package kc2;

/* loaded from: classes15.dex */
public final class r implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f388014d;

    public r(java.lang.ref.WeakReference rFreqController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rFreqController, "rFreqController");
        this.f388014d = rFreqController;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        zy2.w7 w7Var = (zy2.w7) this.f388014d.get();
        if (w7Var != null) {
            kc2.g1 g1Var = (kc2.g1) w7Var;
            g1Var.k().mo50293x3498a0(new kc2.c1(g1Var));
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        zy2.w7 w7Var = (zy2.w7) this.f388014d.get();
        if (w7Var != null) {
            kc2.g1 g1Var = (kc2.g1) w7Var;
            g1Var.k().mo50293x3498a0(new kc2.e1(g1Var));
        }
    }
}
