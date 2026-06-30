package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class d4 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI f73795d;

    public d4(com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI) {
        this.f73795d = loginByMobileSendSmsUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f73795d.f73304p = null;
    }
}
