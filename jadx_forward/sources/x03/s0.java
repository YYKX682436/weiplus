package x03;

/* loaded from: classes15.dex */
public final class s0 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f532657d;

    public s0(x03.u0 u0Var) {
        this.f532657d = u0Var;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public final void mo53282x4799dc42(int i17, int i18) {
        x03.s1 s1Var;
        x03.u0 u0Var = this.f532657d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f532666a, u0Var.f532667b + " prestate: " + i17 + ", curState: " + i18);
        u0Var.f532674i = i18;
        if (i18 != 3 || (s1Var = u0Var.f532669d) == null) {
            return;
        }
        ((x03.i1) s1Var).c(false, 5, null);
    }
}
