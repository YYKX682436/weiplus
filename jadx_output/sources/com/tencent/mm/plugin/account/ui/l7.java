package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class l7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f74005d;

    public l7(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        this.f74005d = loginUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.account.ui.LoginUI.U6(this.f74005d);
    }
}
