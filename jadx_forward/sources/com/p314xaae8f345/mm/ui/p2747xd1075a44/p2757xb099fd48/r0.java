package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public class r0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f293492d;

    public r0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f293492d = k0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f293492d;
        android.view.ViewTreeObserver viewTreeObserver = k0Var.L1;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                k0Var.L1 = k0Var.K1.getViewTreeObserver();
            }
            k0Var.L1.removeGlobalOnLayoutListener(k0Var);
            k0Var.L1 = null;
        }
        if (k0Var.V1) {
            return;
        }
        k0Var.f293397i = null;
    }
}
