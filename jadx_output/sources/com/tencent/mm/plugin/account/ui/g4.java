package com.tencent.mm.plugin.account.ui;

/* loaded from: classes9.dex */
public class g4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f73874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginFaceUI f73875e;

    public g4(com.tencent.mm.plugin.account.ui.LoginFaceUI loginFaceUI, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f73875e = loginFaceUI;
        this.f73874d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f73874d);
        com.tencent.mm.plugin.account.ui.LoginFaceUI loginFaceUI = this.f73875e;
        loginFaceUI.getClass();
        gm0.j1.d().q(701, loginFaceUI);
        gm0.j1.d().q(252, loginFaceUI);
    }
}
