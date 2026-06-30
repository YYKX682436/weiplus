package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class sg implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.z0 f74201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f74202e;

    public sg(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI, com.tencent.mm.modelsimple.z0 z0Var) {
        this.f74202e = regSetInfoUI;
        this.f74201d = z0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74201d);
        gm0.j1.d().q(126, this.f74202e);
    }
}
