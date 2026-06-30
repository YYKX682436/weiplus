package sj3;

/* loaded from: classes13.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f490079d;

    public h0(sj3.a1 a1Var) {
        this.f490079d = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "controlBottomLayout height update");
        sj3.a1 a1Var = this.f490079d;
        sj3.a1.a(a1Var, (int) a1Var.c().getY());
        int intValue = ((java.lang.Number) ((jz5.n) a1Var.f489941v).mo141623x754a37bb()).intValue();
        android.view.View c17 = a1Var.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "access$getControlBottomLayout(...)");
        a1Var.f489936q.mo146xb9724478(java.lang.Integer.valueOf(intValue - pm0.v.s(c17)[1]));
    }
}
