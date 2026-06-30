package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes14.dex */
public class e5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f291907d;

    public e5(com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var) {
        this.f291907d = f5Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f291907d;
        if (f5Var.f291935g != null) {
            int i17 = f5Var.f291937i.bottom;
            f5Var.f291938m.getWindowVisibleDisplayFrame(this.f291907d.f291937i);
            if (this.f291907d.f291937i.bottom != i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "onGlobalLayout: %s, %s", java.lang.Integer.valueOf(i17), this.f291907d.f291937i.toShortString());
                com.p314xaae8f345.mm.ui.p2740x696c9db.f5.c(this.f291907d);
            }
        }
    }
}
