package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class u3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI f74237d;

    public u3(com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI) {
        this.f74237d = loginByMobileSendSmsUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI.D;
        com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI = this.f74237d;
        loginByMobileSendSmsUI.U6();
        loginByMobileSendSmsUI.finish();
    }
}
