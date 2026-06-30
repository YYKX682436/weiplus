package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public class q0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f293483d;

    public q0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f293483d = k0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f293483d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 c1Var = k0Var.f293387d;
        if (c1Var != null && !k0Var.W1) {
            c1Var.mo889xb349b3ab();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 c1Var2 = k0Var.f293393g;
        if (c1Var2 == null || k0Var.f293395h) {
            return;
        }
        c1Var2.mo889xb349b3ab();
    }
}
