package bj5;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.n f21193d;

    public k(bj5.n nVar) {
        this.f21193d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j75.f stateCenter;
        j75.f stateCenter2;
        bj5.n nVar = this.f21193d;
        nVar.T6(6);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = nVar.P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.B3(new wi5.b());
        }
        int e17 = com.tencent.mm.ui.zk.e(nVar.getActivity(), com.tencent.mm.R.dimen.f479727dj);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = nVar.P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.B3(new wi5.t(e17));
    }
}
