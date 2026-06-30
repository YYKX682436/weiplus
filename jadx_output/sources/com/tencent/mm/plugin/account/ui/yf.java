package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class yf implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.z0 f74346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI f74347e;

    public yf(com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI, com.tencent.mm.modelsimple.z0 z0Var) {
        this.f74347e = regByMobileSendSmsUI;
        this.f74346d = z0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74346d);
        gm0.j1.d().q(126, this.f74347e);
    }
}
