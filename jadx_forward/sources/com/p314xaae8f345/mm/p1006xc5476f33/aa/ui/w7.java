package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class w7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y7 f154410d;

    public w7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y7 y7Var) {
        this.f154410d = y7Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y7 y7Var = this.f154410d;
        android.app.Dialog dialog = y7Var.f154434d.f154449c.f154082n;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        y7Var.f154434d.f154449c.f154082n.dismiss();
    }
}
