package com.tencent.mm.plugin.account.ui;

/* loaded from: classes9.dex */
public class rc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f74167d;

    public rc(com.tencent.mm.plugin.account.ui.sc scVar, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f74167d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74167d);
    }
}
