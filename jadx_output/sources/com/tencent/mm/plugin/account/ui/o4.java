package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class o4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f74084d;

    public o4(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f74084d = loginHistoryUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f74084d;
        com.tencent.mm.plugin.account.ui.l3 l3Var = new com.tencent.mm.plugin.account.ui.l3(loginHistoryUI.f73345y);
        l3Var.f73999c = loginHistoryUI.A;
        l3Var.f74000d = loginHistoryUI.E;
        l3Var.f74001e = loginHistoryUI.D;
        com.tencent.mm.plugin.account.ui.q3.c(loginHistoryUI, l3Var);
    }
}
