package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class a5 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f73710d;

    public a5(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f73710d = loginHistoryUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f73710d.f73339t = null;
    }
}
