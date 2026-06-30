package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class bg implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f73754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI f73755e;

    public bg(com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI, h11.e eVar) {
        this.f73755e = regByMobileSendSmsUI;
        this.f73754d = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        h11.e eVar = this.f73754d;
        java.lang.String Q = eVar.Q();
        java.lang.String P = eVar.P();
        com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI = this.f73755e;
        com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI.T6(regByMobileSendSmsUI, Q, P);
        com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = regByMobileSendSmsUI.f73602y;
        thirdAppRegisterStruct.f61234d = regByMobileSendSmsUI.f73601x;
        thirdAppRegisterStruct.f61235e = 8L;
        thirdAppRegisterStruct.k();
    }
}
