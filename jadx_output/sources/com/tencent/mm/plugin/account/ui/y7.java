package com.tencent.mm.plugin.account.ui;

/* loaded from: classes9.dex */
public class y7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f74337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginVoiceUI f74338e;

    public y7(com.tencent.mm.plugin.account.ui.LoginVoiceUI loginVoiceUI, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f74338e = loginVoiceUI;
        this.f74337d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74337d);
        com.tencent.mm.plugin.account.ui.LoginVoiceUI loginVoiceUI = this.f74338e;
        loginVoiceUI.getClass();
        gm0.j1.d().q(701, loginVoiceUI);
        gm0.j1.d().q(252, loginVoiceUI);
    }
}
