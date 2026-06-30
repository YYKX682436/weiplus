package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class a8 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.c8 f278659d;

    public a8(com.p314xaae8f345.mm.ui.c8 c8Var) {
        this.f278659d = c8Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.c8 c8Var = this.f278659d;
        if (c8Var.f279617c.isFinishing()) {
            return;
        }
        c8Var.f279617c.finish();
    }
}
