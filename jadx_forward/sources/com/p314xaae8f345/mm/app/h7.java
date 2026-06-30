package com.p314xaae8f345.mm.app;

/* loaded from: classes7.dex */
public class h7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.i7 f134974d;

    public h7(com.p314xaae8f345.mm.app.i7 i7Var) {
        this.f134974d = i7Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.app.i7 i7Var = this.f134974d;
        i7Var.f274076g.onClick(dialogInterface, -2);
        i7Var.f134993i = null;
    }
}
