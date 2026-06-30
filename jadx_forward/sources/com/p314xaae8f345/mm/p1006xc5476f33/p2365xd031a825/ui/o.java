package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l f262078d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l lVar) {
        this.f262078d = lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l lVar = this.f262078d;
        android.app.Dialog dialog = lVar.f261922i;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        lVar.f261922i.dismiss();
    }
}
