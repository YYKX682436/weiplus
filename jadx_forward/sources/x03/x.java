package x03;

/* loaded from: classes15.dex */
public final class x implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f532693d;

    public x(x03.i0 i0Var) {
        this.f532693d = i0Var;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public final void mo53282x4799dc42(int i17, int i18) {
        x03.s1 s1Var;
        x03.i0 i0Var = this.f532693d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.f532577a, i0Var.f532578b + " prestate: " + i17 + ", curState: " + i18);
        i0Var.f532584h = i18;
        if (i18 != 3 || (s1Var = i0Var.f532580d) == null) {
            return;
        }
        ((x03.i1) s1Var).c(false, 5, null);
    }
}
