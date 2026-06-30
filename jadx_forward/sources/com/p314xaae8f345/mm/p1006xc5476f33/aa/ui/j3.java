package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class j3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l3 f154229d;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l3 l3Var) {
        this.f154229d = l3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l3 l3Var = this.f154229d;
        android.app.Dialog dialog = l3Var.f154253d.C1;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        l3Var.f154253d.C1.dismiss();
    }
}
