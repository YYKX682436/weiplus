package cj5;

/* loaded from: classes.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.j0 f42131d;

    public h0(cj5.j0 j0Var) {
        this.f42131d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j75.f stateCenter;
        j75.f stateCenter2;
        cj5.j0 j0Var = this.f42131d;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = j0Var.P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.B3(new wi5.b());
        }
        int e17 = com.tencent.mm.ui.zk.e(j0Var.getActivity(), com.tencent.mm.R.dimen.f479727dj);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = j0Var.P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.B3(new wi5.t(e17));
    }
}
