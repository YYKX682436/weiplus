package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class hf implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f73913d;

    public hf(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f73913d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f73913d);
    }
}
