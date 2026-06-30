package com.tencent.mm.app;

/* loaded from: classes7.dex */
public class h7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.i7 f53441d;

    public h7(com.tencent.mm.app.i7 i7Var) {
        this.f53441d = i7Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.app.i7 i7Var = this.f53441d;
        i7Var.f192543g.onClick(dialogInterface, -2);
        i7Var.f53460i = null;
    }
}
