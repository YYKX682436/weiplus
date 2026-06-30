package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes11.dex */
public class e0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g0 f284441d;

    public e0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g0 g0Var) {
        this.f284441d = g0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g0 g0Var = this.f284441d;
        android.view.ViewTreeObserver viewTreeObserver = g0Var.f284480o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                g0Var.f284480o = g0Var.f284478m.getViewTreeObserver();
            }
            g0Var.f284480o.removeGlobalOnLayoutListener(g0Var);
            g0Var.f284480o = null;
        }
        g0Var.getClass();
        g0Var.f284473e = null;
    }
}
