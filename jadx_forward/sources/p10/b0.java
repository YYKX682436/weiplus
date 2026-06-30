package p10;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p10.c0 f432463d;

    public b0(p10.c0 c0Var) {
        this.f432463d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        p10.c0 c0Var = this.f432463d;
        if (((p10.l0) c0Var.f432467c).f432501a.f147379r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaLoadingComponent", "scheduleDelayedLoading, canvas already rendered, skip showing loading");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaLoadingComponent", "scheduleDelayedLoading, show loading after delay");
        c0Var.f432468d = new java.lang.ref.WeakReference(db5.e1.Q(c0Var.f432465a, null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572138zr), true, true, new p10.a0(c0Var)));
        java.lang.ref.WeakReference weakReference = c0Var.f432468d;
        if (weakReference != null && (u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference.get()) != null) {
            u3Var.show();
        }
        c0Var.f432466b.mo50297x7c4d7ca2(c0Var.f432470f, 30000L);
    }
}
