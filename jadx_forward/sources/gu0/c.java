package gu0;

/* loaded from: classes5.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f357170d;

    public c(hu0.a0 a0Var) {
        this.f357170d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hu0.a0 a0Var = this.f357170d;
        a0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.RenderUIC", "onEditPanelCloseStart");
        a0Var.f366547m = hu0.p.f366581g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a0Var.f366548n);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        a0Var.V6(a0Var.f366549o, 0.0f, valueOf != null ? valueOf.intValue() : a0Var.R6());
    }
}
