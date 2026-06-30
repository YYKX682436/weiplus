package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class n0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AARemittanceUI f72743a;

    public n0(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI) {
        this.f72743a = aARemittanceUI;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "aapay failed: %s", obj);
        com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI = this.f72743a;
        aARemittanceUI.hideLoading();
        if (obj == null) {
            com.tencent.mm.plugin.aa.ui.AARemittanceUI.i7(aARemittanceUI, aARemittanceUI.getString(com.tencent.mm.R.string.f489752ap));
            return;
        }
        if (!(obj instanceof r45.a)) {
            if (!(obj instanceof java.lang.String) || obj.toString().equalsIgnoreCase("ok")) {
                return;
            }
            com.tencent.mm.plugin.aa.ui.AARemittanceUI.i7(aARemittanceUI, obj.toString());
            return;
        }
        r45.a aVar = (r45.a) obj;
        java.lang.String str = aVar.f369568e;
        java.lang.String str2 = aVar.f369569f;
        java.lang.String str3 = aVar.f369570g;
        com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
        aVar2.f211729s = str;
        aVar2.f211732v = str3;
        aVar2.E = new com.tencent.mm.plugin.aa.ui.k0(this, aVar);
        aVar2.f211733w = str2;
        aVar2.F = new com.tencent.mm.plugin.aa.ui.m0(this);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(aARemittanceUI, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar2);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar2.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }
}
