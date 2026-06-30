package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class r0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AARemittanceUI f72782a;

    public r0(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI) {
        this.f72782a = aARemittanceUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        boolean z17;
        r45.v vVar = (r45.v) obj;
        com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI = this.f72782a;
        z17 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) aARemittanceUI).mKindaEnable;
        if (!z17) {
            aARemittanceUI.hideLoading();
        }
        if (vVar == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        r45.a aVar = vVar.f387777m;
        objArr[0] = aVar;
        objArr[1] = java.lang.Integer.valueOf(aVar != null ? aVar.f369567d : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "aapay return, alertItem: %s, alertItem.flag: %s", objArr);
        r45.a aVar2 = vVar.f387777m;
        if (aVar2 == null || aVar2.f369567d != 1) {
            com.tencent.mm.plugin.aa.ui.AARemittanceUI.h7(aARemittanceUI, vVar);
            return null;
        }
        java.lang.String str = aVar2.f369568e;
        java.lang.String str2 = aVar2.f369569f;
        java.lang.String str3 = aVar2.f369570g;
        com.tencent.mm.ui.widget.dialog.a aVar3 = new com.tencent.mm.ui.widget.dialog.a();
        aVar3.f211729s = str;
        aVar3.f211732v = str3;
        aVar3.E = new com.tencent.mm.plugin.aa.ui.o0(this, vVar);
        aVar3.f211733w = str2;
        aVar3.F = new com.tencent.mm.plugin.aa.ui.q0(this);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(aARemittanceUI, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar3);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar3.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        aARemittanceUI.hideLoading();
        return null;
    }
}
