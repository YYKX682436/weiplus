package p10;

/* loaded from: classes7.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p10.c0 f432545d;

    public z(p10.c0 c0Var) {
        this.f432545d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        java.lang.ref.WeakReference weakReference = this.f432545d.f432468d;
        if (weakReference == null || (u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference.get()) == null) {
            return;
        }
        p10.c0 c0Var = this.f432545d;
        if (u3Var.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicEcsNirvanaLoadingComponent", "loading timeout, cancel and finish activity");
            u3Var.cancel();
            p10.l0 l0Var = (p10.l0) c0Var.f432467c;
            l0Var.f432501a.setResult(0);
            bw5.d5 d5Var = bw5.d5.EcsNirvanaUILaunchResult;
            ((ku5.t0) ku5.t0.f394148d).h(new q10.o(l0Var.f432501a.f147375n, d5Var, 1000), "MicroMsg.EcsNirvanaReportUtil");
            l0Var.f432501a.finish();
        }
    }
}
