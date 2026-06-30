package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class o0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.v f72752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.r0 f72753e;

    public o0(com.tencent.mm.plugin.aa.ui.r0 r0Var, r45.v vVar) {
        this.f72753e = r0Var;
        this.f72752d = vVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "click aaPay doPay");
        com.tencent.mm.plugin.aa.ui.r0 r0Var = this.f72753e;
        com.tencent.mm.plugin.aa.ui.AARemittanceUI.h7(r0Var.f72782a, this.f72752d);
        com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI = r0Var.f72782a;
        aARemittanceUI.G = com.tencent.mm.wallet_core.ui.b2.i(aARemittanceUI, false, false, null);
    }
}
