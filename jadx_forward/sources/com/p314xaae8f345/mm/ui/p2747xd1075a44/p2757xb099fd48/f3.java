package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes14.dex */
public class f3 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f293322d;

    public f3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f293322d = z2Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f293322d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 q3Var = z2Var.f293587J;
        if (q3Var != null) {
            q3Var.mo2069x63a3b28a();
            dialogInterface.dismiss();
        }
        android.view.ViewTreeObserver viewTreeObserver = z2Var.f293595n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                z2Var.f293595n = z2Var.f293594m.getViewTreeObserver();
            }
            z2Var.f293595n.removeGlobalOnLayoutListener(z2Var);
            z2Var.f293595n = null;
        }
        if (z2Var.f293596o) {
            return;
        }
        z2Var.f293588d = null;
    }
}
