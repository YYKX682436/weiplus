package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class zf implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f74365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI f74366e;

    public zf(com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI, h11.e eVar) {
        this.f74366e = regByMobileSendSmsUI;
        this.f74365d = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI = this.f74366e;
        d17.a(701, regByMobileSendSmsUI);
        gm0.j1.d().a(252, regByMobileSendSmsUI);
        h11.e eVar = this.f74365d;
        com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI.T6(regByMobileSendSmsUI, eVar.Q(), eVar.P());
        com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = regByMobileSendSmsUI.f73602y;
        thirdAppRegisterStruct.f61234d = regByMobileSendSmsUI.f73601x;
        thirdAppRegisterStruct.f61235e = 8L;
        thirdAppRegisterStruct.k();
    }
}
