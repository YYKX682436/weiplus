package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class g1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 f295435d;

    public g1(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 h1Var) {
        this.f295435d = h1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 h1Var = this.f295435d;
        android.app.Dialog dialog = h1Var.f295440p;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        h1Var.f295440p.dismiss();
    }
}
