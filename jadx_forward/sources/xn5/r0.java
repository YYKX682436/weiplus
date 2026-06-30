package xn5;

/* loaded from: classes13.dex */
public final class r0 extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn5.t0 f537252d;

    public r0(xn5.t0 t0Var) {
        this.f537252d = t0Var;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        yn5.l lVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
            android.content.Context context = j17 != null ? (android.app.Activity) j17.get() : null;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
            if (activityC21401x6ce6f73f != null && (lVar = activityC21401x6ce6f73f.f39362x7310015e) != null) {
                lVar.b();
            }
        }
        xn5.t0.wi(this.f537252d);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
    }
}
