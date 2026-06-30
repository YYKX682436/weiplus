package com.p314xaae8f345.mm.app;

/* loaded from: classes7.dex */
public class g7 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.i7 f134966d;

    public g7(com.p314xaae8f345.mm.app.i7 i7Var) {
        this.f134966d = i7Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.app.i7 i7Var = this.f134966d;
        i7Var.f274076g.onClick(dialogInterface, -2);
        i7Var.f134993i = null;
    }
}
