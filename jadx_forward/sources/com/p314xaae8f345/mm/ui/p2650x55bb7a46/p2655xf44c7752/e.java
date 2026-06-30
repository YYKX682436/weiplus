package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 f282419d;

    public e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var) {
        this.f282419d = k1Var;
    }

    public boolean i(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        return j(taVar, f9Var, i17, true);
    }

    public boolean j(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, boolean z17) {
        return false;
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta k(int i17) {
        android.view.View e17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f282419d;
        if (k1Var == null || (e17 = k1Var.e(i17)) == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta) e17.getTag();
    }

    public void m(int i17) {
        android.view.View e17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f282419d;
        if (k1Var == null || (e17 = k1Var.e(i17)) == null || e17.getTag() == null) {
            return;
        }
        i((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta) e17.getTag(), this.f282419d.y(i17), i17);
    }
}
