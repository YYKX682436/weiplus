package gu0;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f357198d;

    public f(hu0.a0 a0Var) {
        this.f357198d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hu0.a0 a0Var = this.f357198d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a0Var.f366548n);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a0Var.R6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.RenderUIC", "onEditPanelOpenEnd: panelHeightPx=" + intValue);
        a0Var.f366547m = hu0.p.f366580f;
        a0Var.f366548n = intValue;
        a0Var.Q6();
        a0Var.O6(intValue, 1.0f);
    }
}
