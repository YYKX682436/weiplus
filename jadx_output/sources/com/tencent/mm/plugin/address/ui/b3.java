package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class b3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.c3 f74524d;

    public b3(com.tencent.mm.plugin.address.ui.c3 c3Var) {
        this.f74524d = c3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = this.f74524d.f74529d;
        int i18 = com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.B;
        walletSelectAddrUI.getClass();
        java.lang.String str = (java.lang.String) c01.d9.b().p().l(46, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(72, null);
        java.lang.String str3 = str2 != null ? str2 : "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            walletSelectAddrUI.f74494m.b(new q71.n(str, str3, walletSelectAddrUI.f74498q), true);
            return;
        }
        com.tencent.mm.autogen.events.NeedVerifyQQEvent needVerifyQQEvent = new com.tencent.mm.autogen.events.NeedVerifyQQEvent();
        am.ok okVar = needVerifyQQEvent.f54517g;
        okVar.f7553a = walletSelectAddrUI;
        okVar.f7554b = new com.tencent.mm.plugin.address.ui.r2(walletSelectAddrUI, needVerifyQQEvent);
        needVerifyQQEvent.b(android.os.Looper.myLooper());
    }
}
