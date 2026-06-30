package com.tencent.mm.app;

/* loaded from: classes7.dex */
public class g7 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.i7 f53433d;

    public g7(com.tencent.mm.app.i7 i7Var) {
        this.f53433d = i7Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.app.i7 i7Var = this.f53433d;
        i7Var.f192543g.onClick(dialogInterface, -2);
        i7Var.f53460i = null;
    }
}
