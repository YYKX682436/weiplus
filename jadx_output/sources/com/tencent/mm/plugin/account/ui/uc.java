package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class uc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.w0 f74250d;

    public uc(com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg, com.tencent.mm.modelsimple.w0 w0Var) {
        this.f74250d = w0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74250d);
    }
}
