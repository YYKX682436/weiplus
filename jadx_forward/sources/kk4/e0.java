package kk4;

/* loaded from: classes15.dex */
public final class e0 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.f0 f390057d;

    public e0(kk4.f0 f0Var) {
        this.f390057d = f0Var;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public final void mo53282x4799dc42(int i17, int i18) {
        kk4.f0 f0Var = this.f390057d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var.e(), "state from:" + i17 + " to:" + i18 + " id:" + f0Var.f390066i);
        if (i18 == 4) {
            f0Var.f390065h = java.lang.System.currentTimeMillis() - f0Var.f390064g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var.e(), "prepared cost:" + f0Var.f390065h + " id:" + f0Var.f390066i);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener iOnStateChangeListener = f0Var.f390074q;
        if (iOnStateChangeListener != null) {
            iOnStateChangeListener.mo53282x4799dc42(i17, i18);
        }
    }
}
