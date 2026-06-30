package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class lc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.z0 f74012d;

    public lc(com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg, com.tencent.mm.modelsimple.z0 z0Var) {
        this.f74012d = z0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74012d);
    }
}
