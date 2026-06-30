package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class q4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f74132d;

    public q4(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f74132d = loginHistoryUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f74132d;
        loginHistoryUI.M.a();
        com.tencent.mm.plugin.account.ui.LoginHistoryUI.U6(loginHistoryUI, loginHistoryUI.f73345y);
    }
}
