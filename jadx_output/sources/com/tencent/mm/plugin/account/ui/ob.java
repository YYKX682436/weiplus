package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ob implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f74092d;

    public ob(com.tencent.mm.plugin.account.ui.sa saVar, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f74092d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74092d);
    }
}
