package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class b7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f73743d;

    public b7(com.tencent.mm.plugin.account.ui.LoginSmsUI loginSmsUI, h11.e eVar) {
        this.f73743d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f73743d);
    }
}
